#  определяется число фибоначчи внутри последовательностей этих чисел
#  с порядковым номером num

import math

def fib_recursion_4a(num):
    if num in(1, 2):
        return 1
    else:
        return fib_recursion_4a(num - 1) + fib_recursion_4a(num - 2)


def fib_iteration_4b(num):
    a = b = 1
    for i in range(3, num+1):
        f = a + b
        a = b
        b = f
    return b


def fib_gold_4c(num):
    phi = (1 + math.sqrt(5)) / 2
    return math.floor((phi ** num) / math.sqrt(5) + 0.5)


def fib_matrix_4d(num):
    pass



def main():
    algo = fib_gold_4c

    num = 8
    print(algo(num))


if __name__ == '__main__':
    main()

