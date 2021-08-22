package patterns.creational.factorymethod.factoryexample;

public class CoffeeMachine extends BeverageMachine {

	@Override
	public IBeverage makeBeverage() {
		return new Coffee();
	}
}
