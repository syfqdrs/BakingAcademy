import java.util.Scanner;

public class Pancake {
	
//	Recipe: 8 servings
//		1 1/2 cups all purpose flour
//		3 1/2 teaspoons baking powder
//		1 teaspoon salt
//		1  tablespoon white sugar
//		1 1/4 cups milk
//		1 egg
//		3 tablespoons butter, melted
	
//	Directions:
//	In a large bowl, sift together the flour, baking powder, salt and sugar. 
//	Make a well in the center and pour in the milk, egg and melted butter; mix until smooth
	
//	Heat a lightly oiled griddle or frying pan over medium-high heat. 
//	Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. 
//	Brown on both sides and serve hot.
	
	public void makePancake() {
		System.out.println("Great! What do you think will be the first thing you need to make it?");
		
		Scanner scanner = new Scanner(System.in);
		String ingredient = scanner.nextLine();
		
		if (ingredient.equalsIgnoreCase("flour")) {
			System.out.println();
			System.out.println("Well done!! You will need 1 and 1/2 cups of all purpose flour");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 1 large egg");
			System.out.println("	- 3 tablespoons of melted butter");
		}
		
		else if(ingredient.equalsIgnoreCase("baking powder")) {
			System.out.println();
			System.out.println("Well done!! You will need 3 and 1/2 teaspoons baking powder");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 1 large egg");
			System.out.println("	- 3 tablespoons of melted butter");
		}
		
		else if(ingredient.equalsIgnoreCase("salt")) {
			System.out.println();
			System.out.println("Well done!! You will need 1 teaspoon of   salt");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 1 large egg");
			System.out.println("	- 3 tablespoons of melted butter");
		}
		
		else if(ingredient.equalsIgnoreCase("sugar")) {
			System.out.println();
			System.out.println("Well done!! You will need 1 tablespoon white sugar");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 1 large egg");
			System.out.println("	- 3 tablespoons of melted butter");
		}
		
		else if(ingredient.equalsIgnoreCase("milk")) {
			System.out.println();
			System.out.println("Well done!! You will need 1 and 1/4 cups milk");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 large egg");
			System.out.println("	- 3 tablespoons of melted butter");
		}
		
		else if(ingredient.equalsIgnoreCase("eggs")) {
			System.out.println();
			System.out.println("Well done!! You will need 1 large egg");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 3 tablespoons of melted butter");
		}
		
		else if(ingredient.equalsIgnoreCase("butter")) {
			System.out.println();
			System.out.println("Well done!! You will need 3 tablespoons of melted butter");
			scanner.nextLine();
			System.out.println("Now i can help you to choose the other ingredients");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 1 large egg");
		}
		
		else {
			System.out.println("Sorry what is you say? :(");
			scanner.nextLine();
			
			System.out.println("Let me just give you the recipe :)");
			scanner.nextLine();
			
			System.out.println("Ofcourse you will need:");
			System.out.println("	- 1 and 1/2 cups of all purpose flour");
			System.out.println("	- 3 and 1/2 teaspoons baking powder");
			System.out.println("	- 1 teaspoon of   salt");
			System.out.println("	- 1 tablespoon white sugar");
			System.out.println("	- 1 and 1/4 cups milk");
			System.out.println("	- 1 large egg");
			System.out.println("	- 3 tablespoons of melted butter");			
			
		}
		
		
	}
	
}
	

