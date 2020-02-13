import ctypes


class VectorArray(object):
    def __init__(self):
        self.n = 0
        self.max_size = 0
        self.increase = 8
        self.array = self.create_array()  #self.increase

    def __len__(self):
        return self.n

    def show_max_size(self):
        return self.max_size

    def __getitem__(self, k):
        if k > self.n:
            return IndexError('Index out of bounds')
        return self.array[k]

    def resize(self):
        temp_copy = self.create_array()  #self.increase
        for index in range(0, self.n):
            temp_copy[index] = self.array[index]
        self.array = temp_copy

    def create_array(self):
        res = (ctypes.py_object * (self.n + self.increase))()
        self.max_size = res._length_
        return res

    def add(self, item):
        if self.n % self.increase == 0 and self.n != 0:
            self.resize()
        self.array[self.n] = item
        self.n += 1

    def add_by_index(self, item, index):
        if self.n % self.increase == 0 and self.n != 0:
            temp_copy = (ctypes.py_object * (self.max_size + self.increase))()
            self.max_size = temp_copy._length_
        # ToDo - insert in the middle of array
        else:
            temp_copy = (ctypes.py_object * self.max_size)()
        for ix in range(0, index):
            temp_copy[ix] = self.array[ix]
        temp_copy[index] = item
        for iy in range(index, self.n):
            temp_copy[iy+1] = self.array[iy]
        self.array = temp_copy
        self.n += 1

    def remove(self, index):
        temp = self.array[index]
        if self.n % self.increase == 1:
            temp_copy = (ctypes.py_object * (self.max_size - self.increase))()
            self.max_size = temp_copy._length_
        else:
            temp_copy = (ctypes.py_object * self.max_size)()
        for ix in range(0, index):
            temp_copy[ix] = self.array[ix]
        for iy in range(index + 1, self.n):
            temp_copy[iy - 1] = self.array[iy]
        self.array = temp_copy
        self.n -= 1
        return temp


def vector_array_testing():
    a_s = VectorArray()
    a_s.add_by_index(42, 0)
    a_s.add_by_index(42, 1)
    a_s.add_by_index(42, 2)
    a_s.add_by_index(42, 3)
    a_s.add_by_index(42, 2)
    a_s.add_by_index(42, 0)
    a_s.add_by_index(42, 6)
    a_s.add_by_index(42, 7)
    a_s.add_by_index(42, 8)
    a_s.add_by_index(42, 9)
    z = a_s.remove(9)
    a_s.add(1111111111)
    print('-----------')
    print(len(a_s))
    print(a_s.show_max_size())
    print('-----------')


if __name__ == '__main__':
    print("Starting demo:")
    vector_array_testing()
    print("Finishing demo.")
