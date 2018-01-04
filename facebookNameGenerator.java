package facebooknamegenerator;

import java.util.Scanner;

/**
 * @author: Ryan Friesen
 */
public class FacebookNameGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the Facebook Name Generator. Let's start with your first name: ");
        String firstName = input.nextLine();
        System.out.print("Your middle initial: ");
        String middleInitial = input.nextLine();
        System.out.print("And now your last name: ");
        String lastName = input.nextLine();
        System.out.print("What's your mother's last name? ");
        String yoMamma = input.nextLine();
        System.out.print("What city were you born in? ");
        String homeTown = input.nextLine();
        System.out.print("What month were you born in? " );
        String birthMonth = input.nextLine();
        String starWarsName = starWars(firstName, lastName, homeTown, yoMamma);
        String stripperName = stripperName(firstName, middleInitial, lastName );
        String vampireName = vampireName(firstName, birthMonth);
        System.out.println("Your Star Wars name is:\n\n" + starWarsName + "\n");
        System.out.println("Your stripper name is:\n\n" + stripperName + "\n");
        System.out.println("Your vampire name is:\n\n" + vampireName + "\n");
        
    }
    
    public static String starWars(String firstName, String lastName, String homeTown, String yoMamma ) {
        
        String result, starWarsFirst, starWarsLast;

        starWarsFirst = lastName.substring(0, 3) + firstName.toLowerCase().substring(0, 2);
        starWarsLast = yoMamma.substring(0, 2) + homeTown.toLowerCase().substring(0, 3);
        result = starWarsFirst + " " + starWarsLast;
        
        return result;
        
    }
    
    public static String stripperName(String firstName, String middleInitial, String lastName ) {
    
        String result;
        int stripperChar1, stripperChar2, stripperChar3;
        
        stripperChar1 = firstName.toUpperCase().charAt(2);
        stripperChar2 = middleInitial.toUpperCase().charAt(0);
        stripperChar3 = lastName.toUpperCase().charAt(2);  
        
        String[] firstInitialStripper = {"Chesty", "Fantasia", "Starr", "Diamond", "Montana", "Angel", "Sugar", "Mim", "Lola", "Kitty", "Roxie", "Dallas", "Princess", "Heidi", "Bambi", "Bunny", "Brandy", "Sugar", "Candy", "Raquelle", "Sapphire", "Cinnamon", "Blaze", "Trixie", "Isis", "Jade"};
        String[] middleInitialStripper = {"Leather", "Dream", "Sunny", "Deep", "Heaven", "Tight", "Shimmer", "Velvet", "Lusty", "Harley", "Passion", "Dazzle", "Dixon", "Spank", "Glitter", "Razor", "Meadow", "Glitz", "Sparkle", "Sweet", "Silver", "Tickle", "Cherry", "Hard", "Night", "Amber"};
        String[] lastInitialStripper = {"Hooter", "Horn", "Tower", "Fire", "Thighs", "Hips", "Side", "Jugs", "Shock", "Cocker", "Brook", "Tush", "Sizzle", "Ridge", "Kiss", "Bomb", "Cream", "Thong", "Heat", "Whip", "Cheeks", "Rock", "Hiney", "Button", "Lick", "Juice"};
        
        result = firstInitialStripper[stripperChar1 - 65] + " " + middleInitialStripper[stripperChar2 - 65] + " " + lastInitialStripper[stripperChar3 - 65];  
        
        return result;
        
    }
    
    public static String vampireName(String firstName, String birthMonth) {
        
        String result;
        
        int firstInitial = firstName.toUpperCase().charAt(0);
        
		String birthMonthString = birthMonth;
        
        String[] firstNameArray = {"Savage", "Vampire", "Cruel", "Demon", "Lethal", "Rogue", "Brutal", "Sinister", "Malevolent", "Venomous", "Relentless", "Deadly", "Vicious", "Dark", "Ruthless", "Sadistic", "Ferocious", "Bloodthirsty", "Merciless", "Dragon", "Cold-blooded", "Witch", "Fierce", "Mortal", "Feral", "Hybrid" }; 
        String firstVampName = firstNameArray[firstInitial - 65];
        
        switch (birthMonth) {
            
            case "January": birthMonthString = "Eradicator";
            break;
            case "February": birthMonthString = "Hunter";
            break;
            case "March": birthMonthString = "Warrior";
            break;
            case "April": birthMonthString = "Executioner";
            break;
            case "May": birthMonthString = "Killer";
            break;
            case "June": birthMonthString = "Death-Bringer";
            break;
            case "July": birthMonthString = "Assassin";
            break;
            case "August": birthMonthString = "Butcher";
            break;
            case "September": birthMonthString = "Punisher";
            break;
            case "October": birthMonthString = "Bloodletter";
            break;
            case "November": birthMonthString = "Death-dealer";
            break;
            case "December": birthMonthString = "Enforcer";
            break;
            default: break;
            
        }
            
            result = firstVampName + " " + birthMonthString;
            
            return result;
            
        }
        
}
