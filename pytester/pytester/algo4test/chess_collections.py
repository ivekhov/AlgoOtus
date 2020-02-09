def find_steps_king(x):
    k = 1 << x
    nA = 0xFeFeFeFeFeFeFeFe
    nH = 0x7f7f7f7f7f7f7f7f
    n8 = 0x00FFFFFFFFFFFFFF  # due to python int object, not liminted by 64 bit

    p7 = (k & nA & n8) << 7  # added
    p8 = (k & n8) << 8  # added
    p9 = (k & nH & n8) << 9  # added
    p4 = (k & nA) >> 1
    p6 = (k & nH) << 1
    p1 = (k & nA) >> 9
    p2 = k >> 8
    p3 = (k & nH) >> 7
    bit_mask = p7 | p8 | p9 | p4 | p6 | p1 | p2 | p3

    temp = bit_mask
    cnt = 0
    while temp != 0:
        temp &= (temp - 1)
        cnt += 1

    return cnt, bit_mask


def find_steps_horse(x):
    k = 1 << x
    nA = 0xFeFeFeFeFeFeFeFe
    nH = 0x7f7f7f7f7f7f7f7f
    n8 = 0x00FFFFFFFFFFFFFF  # due to python int object, not liminted by 64 bit
    nAB = 0xFcFcFcFcFcFcFcFc
    nGH = 0x3f3f3f3f3f3f3f3f
    
    bit_mask = nGH & ((n8 & k) << 6 | k >> 10) | \
               nH & ((n8 & k) << 15 | k >> 17) | \
               nA & ((n8 & k) << 17 | k >> 15) | \
               nAB & ((n8 & k) << 10 | k >> 6)

    temp = bit_mask
    cnt = 0
    while temp != 0:
        temp &= (temp - 1)
        cnt += 1
    return cnt, bit_mask


def main():
    x = 47
    algo = find_steps_horse
    print(algo(x))


if __name__ == "__main__":
    main()
