operand1 = Double.parseDouble(args[0])
operand2 = Double.parseDouble(args[2])
operation = args[1]
double result = 0.0

switch(operation) {

	case "+":
		result = operand1 + operand2
		break
	case "-":
		result = operand1 - operand2
		break
	case "/":
		result = operand1 / operand2
		break
	case "x":
		result = operand1 * operand2
		break
}

println operand1 + " " + operation + " " + operand2 + " = " + result 