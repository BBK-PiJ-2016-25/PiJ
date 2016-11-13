println "How many lines would you like your pyramid to have?"
String str = System.console().readLine()
int pyramidHeight = Integer.parseInt(str)

counter = 0

while (pyramidHeight + 1 > 0) {
	
	print Integer.toString(counter) * counter
	println ""
	
	pyramidHeight--
	counter++
	
}