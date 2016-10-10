println "Welcome to the groovy calculator!"

println "Please enter your first operand"
operand1 = Double.parseDouble(System.console().readLine())

println "Please enter your second operand"
operand2 = Double.parseDouble(System.console().readLine())

println "Type 1 for addition"
println "Type 2 for subtraction"
println "Type 3 for division"
println "Type 4 for multiplication"

selectedOperationIndex = Integer.parseInt(System.console().readLine())
String operation = ""
double result = 0

switch (selectedOperationIndex) {

	case 1:
		result = operand1 + operand2
		operation = "+"
		break
	case 2:
		result = operand1 - operand2
		operation = "-"
		break
	case 3:
		result = operand1 / operand2
		operation = "/"
		break
	case 4:
		result = operand1 * operand2
		operation = "*"
		break
}

println operand1 + " " + operation + " " + operand2 + " = " + result 