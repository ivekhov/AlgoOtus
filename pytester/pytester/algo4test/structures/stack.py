import ctypes


class SingleArray(object):
    def __init__(self):
        self.n = 0
        self.array = self.create_array()
        self.cur_idx = 0
        self.first_idx = 0

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
        temp_copy = (ctypes.py_object * (self.n + 1))()
        for ix in range(0, index):
            temp_copy[ix] = self.array[ix]
        temp_copy[index] = item
        for iy in range(index, self.n):
            temp_copy[iy + 1] = self.array[iy]
        self.array = temp_copy
        self.n += 1

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


class Stack(SingleArray):
    def push(self, item):
        self.add_by_index(item, self.cur_idx)
        self.cur_idx += 1

    def pop(self):
        res = self.remove(self.cur_idx-1)
        return res


class Queue(SingleArray):
    def push(self, item):
        self.add_by_index(item, self.cur_idx)
        self.cur_idx += 1

    def pop(self):
        if 0 <= self.first_idx < self.n:
            res = self.remove(self.first_idx)
            self.first_idx += 1
            return res
        else:
            return IndexError('Index out of bounds')


def stack_testing():
    s = Stack()
    s.push(42)
    s.push(43332)
    print(s[0])
    print(s[1])
    x = s.pop()
    print(x)
    print(s[0])
    # print(s[1])


def queue_testing():
    s = Queue()
    s.push(42)
    s.push(43332)
    print(s[0])
    print(s[1])
    x = s.pop()
    print(x)
    print()
    print(s[0])
    y = s.pop()
    print(y)


class PriorityQueue(object):
    def __init__(self):
        self.items = SingleArray()
        self.indexes = SingleArray()
        self.general = SingleArray()
        self.general.add(self.indexes)
        self.general.add(self.items)

    def __getitem__(self, k):
        if k > self.n:
            return IndexError('Index out of bounds')
        return self.array[k]

    def enqueue(self, index, item):
        self.indexes.add(index)
        self.items.add(item)

    def display(self, index):
        ix = self.indexes[index]
        val = self.items[index]
        return ix, val

    def dequeue(self):
        loc_min = 999_999
        loc_ix = 0
        for ix in range(0, len(self.indexes)):
            if self.indexes[ix] < loc_min:
                loc_min = self.indexes[ix]
                loc_ix = ix
        temp = self.items[loc_ix]
        self.indexes.remove(loc_ix)
        self.items.remove(loc_ix)
        return temp


def prior_queue_testing():
    a = PriorityQueue()
    a.enqueue(11, 42)
    a.enqueue(2, 'foo')
    a.enqueue(5, 'spam')
    a.enqueue(1, 'bar')
    print(a.dequeue())
    print(a.display(0))
    print(a.display(1))
    print(a.display(2))
    # print(a.display(3))


if __name__ == '__main__':
    prior_queue_testing()
