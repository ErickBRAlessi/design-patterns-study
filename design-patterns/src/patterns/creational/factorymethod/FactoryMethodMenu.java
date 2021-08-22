package patterns.creational.factorymethod;

import common.IExample;
import common.IMenuState;
import common.MenuContext;
import patterns.PatternsMenuState;
import patterns.creational.CreationalMenuState;
import patterns.creational.factorymethod.factoryexample.FactoryMethodExample;

public class FactoryMethodMenu implements IMenuState {
	
	private static IExample example = new FactoryMethodExample(); 

	@Override
	public void printMenu() {
		System.out.println("Factory Method Menu");
		System.out.println("1. Execute Example");
		System.out.println("2. Explain Example");
		System.out.println("3. Explain Pattern");
		System.out.println("9. Back");
	}

	@Override
	public void execute(MenuContext context) {
		switch (context.getOption()) {
		case 1:
			example.executeExample();
			return;
		case 2:
			example.explainExample();
			return;
		case 3:
			example.explainPattern();
			return;
		case 9:
			context.setState(new CreationalMenuState());
			return;
		default:
			return;
		}
	}

}
