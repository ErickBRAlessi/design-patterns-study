import common.MainMenuState;
import common.MenuContext;

public class Main {

	public static void main(String[] args) {
		MenuContext context = new MenuContext();
		context.setState(new MainMenuState());
		while (context.getState() != null) {
			context.printMenu();
			context.execute();
		}
		System.out.println("BYE BYE");
		
	}
}
