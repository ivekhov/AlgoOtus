def find_etalon_value(second_file):
	with open(second_file, 'r') as f:
		return int(f.read())


def compare_files(first_file, second_file, algo):
	with open(first_file, 'r') as f:
		line = f.read().rstrip()
		
		# алгоритм натравливается на строку - содержание входного файла
		result = algo(line)
		
	return algo.__name__, result == find_etalon_value(second_file)


def compare_files_gcd(first_file, second_file, algo):
	with open(first_file, 'r') as f:
		line = f.read().rstrip()
		temp = line.split(',')
		list_num = [int(x) for x in temp]
		
		# алгоритм натравливается на строку - содержание входного файла
		result = algo(list_num[0], list_num[1])

	return result == find_etalon_value(second_file)


def compare_files_simple(first_file, second_file, algo):
	with open(first_file, 'r') as f:
		line = f.read().rstrip()
		num = int(line)
		
		# алгоритм натравливается на строку - содержание входного файла
		result = algo(num)
		
	return result == find_etalon_value(second_file)


def compare_files_int(first_file, second_file, algo):
	with open(first_file, 'r') as f:
		line = f.read().rstrip()
		num = int(line)

		# алгоритм натравливается на строку - содержание входного файла
		result = algo(num)

	return result == find_etalon_value(second_file)
