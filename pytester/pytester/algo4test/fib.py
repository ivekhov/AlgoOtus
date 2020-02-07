from .common import compare_files_int
# from .fib_collections import fib_recursion_4a as algo
from .fib_collections import fib_iteration_4b as algo




def solution(first_file, second_file):
    return algo.__name__, compare_files_int(first_file, second_file, algo)
