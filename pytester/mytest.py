import os
import time
from datetime import datetime 
from config import DATA_FOLDER, LOCAL_PATH, TASK


def testing(task, path):
	ix = 0
	files_list = os.listdir(LOCAL_PATH)

	with open(os.path.join(LOCAL_PATH, 'result.txt'), 'w') as f:
		while True:
			first  = 'test.' + str(ix) + '.in'
			second = 'test.' + str(ix) + '.out'
			if (first not in files_list ) | (second not in files_list):
				break

			infile = os.path.join(LOCAL_PATH, first)
			outfile = os.path.join(LOCAL_PATH, second)

			start_time = time.perf_counter()

			# core function is task, managed in config.py
			flag = task(infile, outfile)

			print('File "{}" Test #{}: {}\tTime: {:.5g} sec'.format(first, ix, flag, 
				time.perf_counter() - start_time))
			f.write('File "{}" Test #{}: {}\tTime: {:.5g} sec.\t{}\n'.format(first, ix, flag,
				(time.perf_counter() - start_time), datetime.now()))
			ix += 1


def main():
	testing(TASK, LOCAL_PATH)


if __name__ == '__main__':
	main()
