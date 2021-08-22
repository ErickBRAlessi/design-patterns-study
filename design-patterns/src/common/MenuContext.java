package common;

import java.util.Scanner;

public class MenuContext {

	private IMenuState state;

	private Scanner sc = new Scanner(System.in);
	
	public MenuContext() {
		state = null;
	}

	public IMenuState getState() {
		return state;
	}

	public void setState(IMenuState state) {
		this.state = state;
	}

	public void execute() {
		state.execute(this);
	}
	
	public void printMenu() {
		state.printMenu();
	}
	
	
	public int getOption() {
		while (!sc.hasNextInt()) {
			sc.nextLine();
		}
		return sc.nextInt();
	}
}
