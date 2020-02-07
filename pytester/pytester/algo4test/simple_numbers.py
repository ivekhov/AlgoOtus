from .common import compare_files_simple
# from .simple_numbers_collections import find_simple_array as algo
# from .simple_numbers_collections import find_simple_sqrt_array as algo
# from .simple_numbers_collections import find_simple_nlogn as algo
# from .simple_numbers_collections import find_simple_eratosfen_loglogn as algo
# from .simple_numbers_collections import find_simple_eratosfen_n as algo
from .simple_numbers_collections import find_simple_eratosfen_memopt as algo


def solution(first_file, second_file):
    return algo.__name__, compare_files_simple(first_file, second_file, algo)
