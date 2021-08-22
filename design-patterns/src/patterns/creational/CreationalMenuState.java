package patterns.creational;

import common.IMenuState;
import common.MenuContext;
import patterns.PatternsMenuState;
import patterns.creational.factorymethod.FactoryMethodMenu;

public class CreationalMenuState implements IMenuState{

	@Override
	public void printMenu() {
		System.out.println("Creational Patterns Menu");
		System.out.println("1. Factory Method");
		System.out.println("2. Abstract Factory");
		System.out.println("3. Builder");
		System.out.println("4. Singleton");
		System.out.println("5. Prototype");
		System.out.println("9. Back");
	}

	@Override
	public void execute(MenuContext context) {
		switch (context.getOption()) {
		case 1:
			context.setState(new FactoryMethodMenu());
			return;
		case 2:
			context.setState(new PatternsMenuState());
			return;
		case 3:
			context.setState(new PatternsMenuState());
			return;
		case 4:
			context.setState(new PatternsMenuState());
			return;
		case 5:
			context.setState(new PatternsMenuState());
			return;
		case 9:
			context.setState(new PatternsMenuState());
			return;
		default:
			return;
		}
	}

}
