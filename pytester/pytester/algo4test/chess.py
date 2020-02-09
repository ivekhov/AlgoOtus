from .common import compare_files_chess
# from .chess_collections import find_steps_king as algo
from .chess_collections import find_steps_horse as algo


def solution(first_file, second_file):
    return algo.__name__, compare_files_chess(first_file, second_file, algo)
