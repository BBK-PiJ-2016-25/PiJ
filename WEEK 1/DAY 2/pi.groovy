println "Please specify how many terms of the pi approximation you would like to add."

int terms = Integer.parseInt(System.console().readLine())
double total = 0

counter = 0

while (counter < terms) {

	total += 4 * (((-1) ** counter) / ((2 * counter) + 1))
	counter++
}

println "Approximation after " + terms + " terms is " + total

total = 0
counter = 0

while (total.trunc(2) != Math.PI.trunc(2)) {
	
	total += 4 * (((-1) ** counter) / ((2 * counter) + 1))
	counter++
}

println counter + " terms are needed to correctly approximate pi to 2 decimal places, at which point the approximation equals:"
println total

total = 0
counter = 0

while (total.trunc(9) != Math.PI.trunc(9)) {

	total += 4 * (((-1) ** counter) / ((2 * counter) + 1))
	counter++
}

println counter + " terms are needed to correctly approximate pi to 9 decimal places, at which point the approximation equals:"
println total