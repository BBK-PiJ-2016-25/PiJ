class Rectangle {
	Point upLeft;
	Point downRight;
	def area() {
		return (Math.abs(upLeft.y - downRight.y))*(Math.abs(upLeft.x - downRight.x))	
	}
	def perimeter() {
		return (2 *((Math.abs(upLeft.y - downRight.y)))) + (2 *(Math.abs(upLeft.x - downRight.x)))
	}
}

class Point {
	double x;
	double y;
}

print "Enter x coordinate 1 > "
x1 = Double.parseDouble(System.console().readLine())
print "Enter y coordinate 1 > "
y1 = Double.parseDouble(System.console().readLine())
println ""

print "Enter x coordinate 2 > "
x2 = Double.parseDouble(System.console().readLine())
print "Enter y coordinate 2 > "
y2 = Double.parseDouble(System.console().readLine())
println ""

Point point1 = new Point()
point1.x = x1
point1.y = y1

Point point2 = new Point()
point2.x = x2
point2.y = y2

Rectangle rectangle = new Rectangle()
rectangle.upLeft = point1
rectangle.downRight = point2

println(rectangle.area())
println(rectangle.perimeter())