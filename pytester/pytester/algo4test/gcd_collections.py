#  minus
def gcd_minus(a, b):
    while a != b:
        if a > b:
            a = a - b
        else:
            b = b - a
    if a > b: 
        return a
    else: 
        return b

# residual
def gcd_residual(a, b):
    if a == b:
        return a
    while (a != 0 and b != 0):
        if a > b:
            a = a % b
        else:
            b = b % a
    if a > b: 
        return a
    else: 
        return b

# recursion
def gcd_recursion(a, b):
    if (b == 0):
        return a
    return gcd_recursion(b, a % b)    

# bit operations
def gcd_bit(a, b):
    if a == b: return a
    if a == 0: return b
    if b == 0: return a

    # factor 2
    if ~a & 1:  #проверка четности а
        if b & 1:   # проверка нечетности b, в итоге а - четное, в - нечетное
            return gcd_bit(a >> 1,  b)  # делим а на 2
        else:
            return gcd_bit(a >> 1, b >> 1) # a, b - четные значения

    if ~b & 1:  # проверка четности b,  b - четное
        return gcd_bit(a, b >> 1)
    
    if a > b: #если а больше в
        return gcd_bit((a - b) >> 1, b)    # считается дельта м/у значениями, делится на 2 и передается

    # если b больше а
    return gcd_bit((b - a) >> 1, a)     # также считается дельта м/у значениями делится на 2 и передается
