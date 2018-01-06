/**
 * The MIT License
 * Copyright (c) 2018 Ryan Friesen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package facebooknamegenerator;

import java.util.Scanner;

/**
 * @author: Ryan Friesen
 */
public class FacebookNameGenerator {

    /**
     * @param args
     */
	
    public static void main(String[] args) {
        
        /**
         * User inputs name, date of birth, birth city, etc.
         * Then the OOP spits out a few names via substring and
         * charAt commands drawn from arrays. Will expand in due time.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("We'll need some information. Are you male or female? ");
        
        String gender = input.nextLine();
        
            if(gender.toLowerCase() != "female" || gender.toLowerCase() != "male") {
            
                System.out.print("Please type \"Male\" or \"Female\": ");
                gender = input.nextLine();
            
            }
        
        System.out.print("Enter your first name: ");
        
        String firstName = input.nextLine();
        
            if(firstName.length() == 1) {
                
                System.out.print("Your first name must be at least two characters long: ");
                firstName = input.nextLine();
                
            }
        
        System.out.print("Your middle initial: ");
        
        String middleInitial = input.nextLine();
        
        System.out.print("Now enter your last name: ");
        
        String lastName = input.nextLine();
        
            if(lastName.length() <= 3) {
                
                System.out.print("Your last name must be at least three characters long: ");
                lastName = input.nextLine();
                
            }
        
        System.out.print("What's your mother's last name? ");
        
        String yoMamma = input.nextLine();
        
            if(yoMamma.length() <= 3) {
                
                System.out.print("Your mother's maiden name must be at least three characters in length: ");
                yoMamma = input.nextLine();
                
                
            }
        
        System.out.print("What city were you born in? ");
        
        String homeTown = input.nextLine();
        
        System.out.print("What month were you born in? " );
        
        String birthMonth = input.nextLine();
        
        String starWarsName = starWars(firstName, lastName, homeTown, yoMamma);
        
        String stripperName = stripperName(firstName, middleInitial, lastName );
        
        String vampireName = vampireName(firstName, birthMonth);
        
        String apocalypseName = apocalypseName(firstName, birthMonth, gender);
        
        System.out.println("Your Star Wars name is:\n\n" + starWarsName + "\n");
        
        System.out.println("Your stripper name is:\n\n" + stripperName + "\n");
        
        System.out.println("Your vampire name is:\n\n" + vampireName + "\n");
        
        System.out.println("Your apocalypse survivor name is:\n\n" + apocalypseName + "\n");
        
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
    
    public static String apocalypseName(String gender, String firstName, String lastName) {
        
        int firstInitial = firstName.toUpperCase().charAt(0);
        int maleOrFemale = gender.toUpperCase().charAt(0);
        int lastInitial = lastName.toUpperCase().charAt(0);
        String result;
        
        String[] maleArray = {"Ash", "Brandish", "Captain", "Duke", "Ezekiel", "Flynn", "Grint", "Hardigan", "Ivan", "Jag", "Knife", "Langur", "Max", "Noah", "Otto", "Packer", "Quigley", "Ricket", "Solomon", "Tyrone", "Utah", "Vick", "Wolfgang", "Xander", "York", "Zed"};
        String[] femaleArray = {"Artemis", "Bolt", "Crane", "Digger", "Ember", "Falcon", "Grey", "Hoppy", "Iz", "Jezebel", "Krist", "Loris", "Minnow", "North", "Octavia", "Prudence", "Quinn", "Red", "Steely", "Terra", "Unit", "Via", "Weedy", "Xil", "Yoll", "Zephyr"};
        String[] lastNameArray = {"Albatross", "Book", "Crow", "Drake", "Engine", "Flash", "Glass", "Hammer", "Ice", "Jackboot", "Ka", "Longbow", "Mason", "Nethers", "Odin", "Pathfinder", "Quiver", "Ranger", "Savage", "Thorn", "Unger", "Vigilante", "Warheart", "Xeven", "Yen", "Zimmer"};
        
        if( firstInitial == 83 ) {
            
            result = femaleArray[firstInitial - 65] + " " + lastNameArray[lastInitial - 65];
            
        }
        
        else {
            
            result = maleArray[firstInitial - 65] + " " + lastNameArray[lastInitial - 65];
        }
        
        return result;
        
    }
        
}
