package Abstarct;

abstract class Draw {
	abstract void shape();
}
class Rectangle extends Draw{
	void shape() {
		System.out.println("draw the rectangle");
	}
}
class Circle extends Draw{
	void shape() {
		System.out.println("draw the circle");
	}
}

