package patterns.creational.factorymethod.factoryexample;

public class SodaMachine extends BeverageMachine{

	@Override
	public IBeverage makeBeverage() {
		return new Soda();
	}
}
