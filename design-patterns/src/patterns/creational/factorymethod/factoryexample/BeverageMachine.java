package patterns.creational.factorymethod.factoryexample;

public abstract class BeverageMachine {

	public abstract IBeverage makeBeverage();

	public String getMessage() {
		return "Welcome to the Beverage Machine";
	}

}
