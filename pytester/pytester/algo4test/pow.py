from .common import compare_files_gcd
# from .power_collections import pow_simple_2a as algo
from .power_collections import pow_addmultiply_2b as algo
# from .power_collections import pow_ as algo


def solution(first_file, second_file):
    return algo.__name__, compare_files_gcd(first_file, second_file, algo)