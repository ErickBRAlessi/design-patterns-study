package patterns;

import common.IMenuState;
import common.MainMenuState;
import common.MenuContext;
import patterns.behavioral.BehavioralMenuState;
import patterns.creational.CreationalMenuState;

public class PatternsMenuState implements IMenuState {

	@Override
	public void printMenu() {
		System.out.println("Patterns Menu");
		System.out.println("1. Behavior");
		System.out.println("2. Creational");
		System.out.println("3. Structural");
		System.out.println("9. Back");
	}

	@Override
	public void execute(MenuContext context) {
		switch (context.getOption()) {
		case 1:
			context.setState(new BehavioralMenuState());
			return;
		case 2:
			context.setState(new CreationalMenuState());
			return;
		case 9:
			context.setState(new MainMenuState());
			return;
		default:
			return;
		}
	}

}
