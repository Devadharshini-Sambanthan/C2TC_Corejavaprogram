package dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface {
	//Override Childinterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}

}
