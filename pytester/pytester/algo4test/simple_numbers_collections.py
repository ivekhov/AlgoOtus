# from .common import find_etalon_value, compare_files_simple
import math
# задача - определить количество простых чисел
# определяем, является ли число р простым


# 1
def prime_basic(p):
    d = 0
    for i in range(1, p + 1):
        if p % i == 0:
            d += 1
    return d == 2


def find_simple_array(nmax):
    cnt = 0
    for i in range(2, nmax):
        if prime_basic(i):
            cnt += 1
    return cnt


# 2
def prime_sqrt(p):
    if p == 2:
        return True
    i = 3
    if p % 2 == 0:
        return False
    while i * i <= p:
        if p % i == 0:
            return False
        i += 2
    return True


def find_simple_sqrt_array(nmax):
    cnt = 0
    for i in range(2, nmax + 1):
        if prime_sqrt(i):
            cnt += 1
    return cnt


# 3
def prime_simple_nlogn(p):
    if p == 2:
        return True
    j = 0
    while j < len(temp) and temp[j] ** 2 <= p:
        if p % temp[j] == 0:
            return False
        j += 1
    return True


def find_simple_nlogn(nmax):
    global temp
    temp = list()
    for i in range(2, nmax + 1):
        if prime_simple_nlogn(i):
            temp.append(i)
    return len(temp)


# 4
def find_simple_eratosfen_loglogn(nmax):
    arr = range(0, nmax+1)
    bool_arr = [True for _ in range(0, nmax+1)]
    i = 2
    while i * i <= nmax:
        if bool_arr[i] is True:
            j = i * i
            while j < nmax:
                bool_arr[j] = False
                j += i
        i += 1
    res = []
    for i in range(0, len(bool_arr)-1):
        if bool_arr[i] is True:
            res.append(arr[i])
    return len(res[2:])


# 5
def find_simple_eratosfen_n(nmax):
    arr = range(0, nmax + 1)
    lp = [0 for _ in range(0, nmax + 1)]
    pr = []

    for i in (range(2, len(arr))):
        if lp[i] == 0:
            lp[i] = i
            pr.append(i)
        for p in pr:
            if p <= lp[i] and p * i <= nmax:
                lp[p * i] = p
    return len(pr)


# 6

def find_simple_eratosfen_memopt(nmax):
    arr = range(0, nmax+1)
    # bool_arr = [True for _ in range(0, nmax+1)]

    binary = 4294967296  # 2 ** 32

    cnt = math.ceil((nmax + 1) / 32)
    bin_arr = [2 ** 32 for _ in (range(0, cnt))]

    i = 2
    while i * i <= nmax:
        if ((binary >> (2 ** i)) & 1) == 0:  # -2
            j = i * i
            while j < nmax:
                binary = binary | (2 ** j)   # в бит записана 1
                j = j + i
        i += 1
    print(bin(binary))
    print(len(bin(binary)))

    res = []

    for b in range(0, len(arr) - 1):
        if (binary >> b) & 1 == 0:
            res.append(arr[b])

    return res[2:]



def main():
    # algo = find_simple_array
    # algo = find_simple_sqrt_array
    # algo = find_simple_nlogn
    algo = find_simple_eratosfen_memopt
    # algo = find_simple_eratosfen_n
    # algo = find_simple_eratosfen_loglogn

    nmax = 30
    print(algo(nmax))





if __name__ == '__main__':
    main()

