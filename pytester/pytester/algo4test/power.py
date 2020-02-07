
def pow(num, degree):
	if degree == 0: return 1
	if degree == 1: return num
	temp = num
	for i in range(2, degree+1):
		print(num)
		num *= temp
	return num

def main():
	# print(pow(2, 3))
	print(pow(2, 8))

if __name__ == '__main__':
	main()