from .common import find_etalon_value, compare_files_simple

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
def find_simple_eratosfen_memopt(nmax):
    pass


# 6
def find_simple_eratosfen_n(nmax):
    pass


def main():
    # algo = find_simple_array
    # algo = find_simple_sqrt_array
    # algo = find_simple_nlogn
    # algo = find_simple_eratosfen_memopt
    # algo = find_simple_eratosfen_n

    algo = find_simple_eratosfen_loglogn
    nmax = 30
    print(algo(nmax))






if __name__ == '__main__':
    main()



############################################################
## def solution(first_file, second_file, algo):
#     return algo.__name__, compare_files_simple(first_file, second_file, algo)
    # a = '2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67
    # 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397 401 409 419 421 431 433 439 443 449 457 461 463 467 479 487 491 499 503 509 521 523 541 547 557 563 569 571 577 587 593 599 601 607 613 617 619 631 641 643 647 653 659 661 673 677 683 691 701 709 719 727 733 739 743 751 757 761 769 773 787 797 809 811 821 823 827 829 839 853 857 859 863 877 881 883 887 907 911 919 929 937 941 947 953 967 971 977 983 991 997'
    # q = a.split(' ')
    # print(len(q))
    # print(q[167])
    # pass

    # q = [42, 1, 99, 111, 4, -1]
    # b = [True, False, True, False, True]
    # for i in range(0, len(q)-1):
    #     if b[i] is True:
    #         print(q[i])