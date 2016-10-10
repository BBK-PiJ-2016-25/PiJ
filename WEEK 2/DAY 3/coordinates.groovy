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

print "Enter x coordinate 3 > "
x3 = Double.parseDouble(System.console().readLine())
print "Enter y coordinate 3 > "
y3 = Double.parseDouble(System.console().readLine())
println ""

class Point {
	double x;
	double y;
}

Point point1 = new Point()
point1.x = x1
point1.y = y1

Point point2 = new Point()
point2.x = x2
point2.y = y2

Point point3 = new Point()
point3.x = x3
point3.y = y3

double point1topoint2 = Math.sqrt((point1.x - point2.x)**2 + (point1.y - point2.y)**2)

double point1topoint3 = Math.sqrt((point1.x - point3.x)**2 + (point1.y - point3.y)**2)

double point2topoint3 = Math.sqrt((point2.x - point3.x)**2 + (point2.y - point3.y)**2)

println "The distance from point 1 to point 2 is " + point1topoint2
println "The distance from point 1 to point 3 is " + point1topoint3
println "The distance from point 2 to point 3 is " + point2topoint3

if ((point1topoint2 < point1topoint3) && (point1topoint2 < point2topoint3)) {
	println "Point 1 and point 2 are closest together."
} else if ((point1topoint3 < point1topoint2) && (point1topoint3 < point2topoint3)) {
	println "Point 1 and point 3 are closest together."
} else {
	println "Point 2 and point 3 are closest together."
}