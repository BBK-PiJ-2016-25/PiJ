
int numberToGuess = Math.abs(1000 * Math.random())
int guessedNumber = 0
int numberOfGuesses = 0

println "Try to guess my number!"

while (guessedNumber != numberToGuess) {
	
	print "Tell me a number: "
	
	guessedNumber = Integer.parseInt(System.console().readLine())
	
	if (guessedNumber < numberToGuess) {
	
		println "No! My number is higher."
		numberOfGuesses++
	
	} else if (guessedNumber > numberToGuess) {
	
		println "No! My number is lower."
		numberOfGuesses++
	
	}
		else if(guessedNumber == numberToGuess) {
	
		println "CORRECT"
		numberOfGuesses++
		print "You needed " + numberOfGuesses + " guesses."
	
	}

}

println "Thank you for playing Guess my Number!"
	