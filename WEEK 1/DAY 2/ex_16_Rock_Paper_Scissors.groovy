int player1Score = 0
int player2Score = 0
int roundNumber = 0
boolean validInput = true

while (Math.abs(player1Score-player2Score) < 3) {
		
	println "Please enter the player moves for this round: "

	String playerMoves = System.console().readLine().toUpperCase()

	if (playerMoves == "PR"|| playerMoves == "RS" || playerMoves == "SP") {
		
		validInput = true
		player1Score++
	
	} else if (playerMoves == "RP" || playerMoves == "SR" || playerMoves == "PS") {
	
		validInput = true
		player2Score++
	
	} else if (playerMoves == "RR" || playerMoves == "SS" || playerMoves == "PP") {
	
		validInput = true
	
	} else {
	
		println "Invalid input. please try again."
		validInput = false
		
	}
	
	if (validInput) {
		
		roundNumber++

		print "After " + roundNumber + " rounds, player 1 has " + player1Score + " points, and " 
		println "player 2 has " + player2Score + " points."	
		
		}

}

if (player1Score > player2Score) {

println "Congratulations, Player 1 is the winner!"

} else if (player2Score > player1Score) {

println "Congratulations, Player 2 is the winner!"

}