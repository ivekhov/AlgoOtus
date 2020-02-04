from .common import find_etalon_value, compare_files
from .count_length import count_len_of_row as algo


def solution(first_file, second_file):
	return compare_files(first_file, second_file, algo)
