import ctypes


class SingleArray(object):
    def __init__(self):
        self.n = 0
        self.array = self.create_array()

    def __len__(self):
        return self.n

    def __getitem__(self, k):
        if k > self.n:
            return IndexError('Index out of bounds')
        return self.array[k]

    def add(self, item):
        self.resize()
        self.array[self.n] = item
        self.n += 1

    def add_by_index(self, item, index):
        # if index <= self.n:
        temp_copy = (ctypes.py_object * (self.n + 1))()
        for ix in range(0, index):
            temp_copy[ix] = self.array[ix]
        temp_copy[index] = item
        for iy in range(index, self.n):
            temp_copy[iy + 1] = self.array[iy]
        self.array = temp_copy
        self.n += 1
        # else:
        #     temp_copy = (ctypes.py_object * (index+1))()
        #     for ix in range(0, self.n):
        #         temp_copy[ix] = self.array[ix]
        #     for iy in range(self.n, index):
        #         temp_copy[iy] = None
        #     temp_copy[index] = item
        #     self.array = temp_copy
        #     self.n = (index+1)

    def resize(self):
        temp_copy = self.create_array(increase=1)
        for index in range(0, self.n):
            temp_copy[index] = self.array[index]
        self.array = temp_copy

    def remove(self, index):
        temp = self.array[index]
        temp_copy = self.create_array(increase=-1)
        for ix in range(0, index):
            temp_copy[ix] = self.array[ix]
        for iy in range(index + 1, self.n):
            temp_copy[iy - 1] = self.array[iy]
        self.array = temp_copy
        self.n -= 1
        return temp

    def create_array(self, increase=0):
        return (ctypes.py_object * (self.n + increase))()


def single_array_testing():
    a_s = SingleArray()
    a_s.add_by_index(42, 0)
    a_s.add_by_index('foo', 1)
    a_s.add_by_index(1111, 2)
    a_s.add_by_index(99, 27)
    a_s.add('foo')

    print('-----------')
    print(len(a_s))
    print(a_s[27])
    print(a_s[28])
    print('-----------')


if __name__ == '__main__':
    print("Starting demo:")
    single_array_testing()

    print("Finishing demo.")
