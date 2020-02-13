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
        self.resize(1)
        self.array[self.n] = item
        self.n += 1


    def resize(self, increase=1):
        temp_copy = self.create_array(increase=1)
        for index in range(0, self.n):
            temp_copy[index] = self.array[index]
        self.array = temp_copy      


    def remove(self, index):
        temp = self.array[index]
        temp_copy = self.create_array(increase=-1)
        for ix in range(0, index):
            temp_copy[ix] = self.array[ix]
        for iy in range(index+1, self.n):
            temp_copy[iy-1] = self.array[iy]
        self.array = temp_copy
        self.n -= 1
        return temp
    

    def create_array(self, increase=0):
        return (ctypes.py_object * (self.n + increase))()

def single_array_testing():
    a_s = SingleArray()
    a_s.add(42)
    print(len(a_s))
    print(a_s[0])
    
    a_s.add('foo')
    print(len(a_s))
    print(a_s[1])

    print(a_s[0])
    print(a_s[1])

    a_s.add(124124)
    a_s.add(8989)

    a_s.remove(1)
    print(a_s[0])
    print(a_s[1])
    print(a_s[2])
    # print(a_s[3])

    print(len(a_s))




if __name__ == '__main__':
    print("Starting demo:")
    # single_array_testing()
    


    print("Finishing demo.")
