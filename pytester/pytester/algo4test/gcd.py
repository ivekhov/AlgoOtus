from .common import find_etalon_value, compare_files_gcd
# from .gcd_collections import gcd_minus as algo
# from .gcd_collections import gcd_residual as algo
# from .gcd_collections import gcd_recursion as algo
from .gcd_collections import gcd_bit as algo

def solution(first_file, second_file):
	return algo.__name__, compare_files_gcd(first_file, second_file, algo)
