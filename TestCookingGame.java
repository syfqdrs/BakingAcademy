import java.util.Scanner;
public class TestCookingGame {
	
	public static void main(String[] args) {
		
		System.out.println("Which recipe would you like to try making first?");
		System.out.println("(1) Pancakes");
		System.out.println("(2) Brownies");
		System.out.println("(3) Cupcakes");
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);		
		String recipe = scanner.nextLine();
		System.out.println();
		
		if (recipe.equals("1")) {
			Pancake c1 = new Pancake();
			c1.makePancake();
			scanner.nextLine();
			
			System.out.println("Now that we have the ingredients. Let the cooking begin!");
			System.out.println();
			
			Direction  direction = new Direction();
			System.out.println("Step 1:");
			direction.sift();
			scanner.nextLine();
			
			Direction mixing = new PancakeDirection(); //Polymorphism
			System.out.println("Step 2:");
			mixing.mix();
			scanner.nextLine();
			
			System.out.println("Step 3:");
			direction.heat();
			scanner.nextLine();	
			
			System.out.println("Last step:");
			direction.cook();
			scanner.nextLine();
			
		}
	}
	
}
