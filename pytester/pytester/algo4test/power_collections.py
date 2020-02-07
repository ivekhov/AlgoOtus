

# 2a
def pow_simple_2a(num, degree):
    if degree == 0: return 1
    if degree == 1: return num
    temp = num
    for i in range(2, degree+1):
        num *= temp
    return num


# 2b
def pow_addmultiply_2b(num, degree):
    if degree == 0: return 1
    if degree == 1: return num
    start_degree = 2

    result = num

    while start_degree * 2 <= degree:

        # print('start degree before', start_degree)
        # print('result before ' , result)
        # print()

        start_degree *= 2

        # result = num ** start_degree
        # result = pow_simple_2a(num, start_degree)

        result = num
        for step_degree in range(2, start_degree+1):
            result = result * num

        # print('start degree after', start_degree)
        # print('result after ' , result)
        # print('-----------')

    while start_degree < degree:
        result = result * num
        start_degree += 1

    # print('final start degree after', start_degree)
    # print('final result after ' , result)

    return result


# 2c
def pow_bit_decomposition_2c(num, degree):
    if degree == 0: return 1
    if degree == 1: return num
    binary = degree
    res = 1
    # пройти по битам
    # определить 1 или 0 в бите
        # если 1, то результат умножается
        #   на основание которое
        #       в степени
        #           (2 в степени порядкового номера бита)

    for ix in range(0, degree.bit_length()):  # от 1 до 5
        if ((degree >> ix) & 1) == 1:
            res = res * (num ** (2 ** ix))

    return res




def main():
    a = pow_bit_decomposition_2c(5, 5)
    print(a)

    # 2 ** 20 = 1048576
    # 3486784401 688747536


if __name__ == '__main__':
    main()

