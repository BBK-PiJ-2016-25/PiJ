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

int counter = 2

while (counter < 1000) {

		if (isPrime(counter)){
			print counter + " "
		}
		counter++
		
	}