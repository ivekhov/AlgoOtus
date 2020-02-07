

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


def main():
    a = pow_addmultiply_2b(3, 50)
    print(a)

    # 2 ** 20 = 1048576
    # 3486784401 688747536


if __name__ == '__main__':
    main()

