def find_etalon_value(second_file):
	with open(second_file, 'r') as f:
		return int(f.read())


def compare_files(first_file, second_file, algo):
	with open(first_file, 'r') as f:
		line = f.read().rstrip()
		
		# алгоритм натравливается на строку - содержание входного файла
		result = algo(line)
		
	return result == find_etalon_value(second_file)
