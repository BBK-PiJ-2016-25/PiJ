def isPrime (number) {

	int divisor = number/2

	if (number == 1) {
		return	false
	} else if (number == 2) {
		return true
	} else {
		while (divisor > 1) {
			if (number % divisor == 0) {
				return false			
			}
		divisor--;
		}
		return true
	}

}

int number = 2
int counter = 0

while (counter < 1000) {

		if (isPrime(number)){
			print number + " "
			counter++
		}
		number++
		
	}