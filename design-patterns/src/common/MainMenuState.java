package common;

import patterns.PatternsMenuState;

public class MainMenuState implements IMenuState {

	@Override
	public void printMenu() {
		System.out.println("Main Menu");
		System.out.println("1. Patterns");
		System.out.println("9. Exit");
	}

	@Override
	public void execute(MenuContext context) {
		switch (context.getOption()) {
		case 1:
			context.setState(new PatternsMenuState());
			return;
		case 9:
			context.setState(null);
			return;
		default:
			return;
		}
	}

}
