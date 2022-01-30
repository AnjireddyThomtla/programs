package Assignmentt;
interface InterfaceExample {
	void shape();
}
class Circle implements InterfaceExample{

	@Override
	public void shape() {
		System.out.println("shape is circle");
		
	}
	
}
class Rectangle implements InterfaceExample{
	public void shape() {
		System.out.println("shape is Rectangle");
	}
}

