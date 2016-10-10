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

boolean finished = false

print "Enter a number: "
int number = Integer.parseInt(System.console().readLine())
int countDown = number
int countUp = number

	while(!finished) {
		
		countDown--
		countUp++
		
		if(isPrime(countDown)) {		
		println countDown
		finished = true
		}
		
		if (isPrime(countUp)) {
		println countUp
		finished = true
		}
		
	}
