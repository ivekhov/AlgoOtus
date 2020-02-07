import os
import time
from datetime import datetime
from config import DATA_FOLDER, LOCAL_PATH, TASK


def testing(task, path):
    ix = 0
    files_list = os.listdir(LOCAL_PATH)
    if not os.path.exists(os.path.join(LOCAL_PATH, 'result.txt')):
        with open(os.path.join(LOCAL_PATH, 'result.txt'), 'w') as f:
            f.write('Algo name,File,Test #,Result,Time(sec),Time of testing\n')

    with open(os.path.join(LOCAL_PATH, 'result.txt'), 'a') as f:
        while True:
            first = 'test.' + str(ix) + '.in'
            second = 'test.' + str(ix) + '.out'
            if (first not in files_list) | (second not in files_list):
                break

            infile = os.path.join(LOCAL_PATH, first)
            outfile = os.path.join(LOCAL_PATH, second)

            start_time = time.perf_counter()

            # core function is task, managed in config.py
            flag = task(infile, outfile)

            print('Algo name: {}. File "{}" Test #{}: {} Time: {:.5g} sec {}'.format(flag[0], first, ix, flag[1],
                                                                                     time.perf_counter() - start_time,
                                                                                     datetime.now()))

            f.write('{},{},{},{},{:.5g},{}\n'.format(flag[0], first, ix, flag[1],
                                                     (time.perf_counter() - start_time), datetime.now()))

            ix += 1
        f.write('------------------------------------------------------------------------\n')


def main():
    testing(TASK, LOCAL_PATH)


if __name__ == '__main__':
    main()
