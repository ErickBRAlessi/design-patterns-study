package patterns.behavioral;

import common.IMenuState;
import common.MenuContext;
import patterns.PatternsMenuState;

public class BehavioralMenuState implements IMenuState{

	@Override
	public void printMenu() {
		System.out.println("Behavioral Patterns Menu");	
		System.out.println("9. Back");
	}

	@Override
	public void execute(MenuContext context) {
		switch (context.getOption()) {
		case 9:
			context.setState(new PatternsMenuState());
			return;
		default:
			return;
		}
	}

}
