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

package facebooknamegeneratorgui;

/**
 *
 * @author Ryan Friesen
 */
public class NameOutput {
    
    /**
     *
     * @param firstNameString
     * @param lastNameString
     * @param birthTownString
     * @param yoMammaString
     * @param genderString
     * @param birthMonthString
     * @return
     */
    
    String firstNameString;
    String lastNameString;
    String birthTownString;
    String genderString;
    String yoMammaString;
    String middleInitialString;
    String birthMonthString;
    
    public NameOutput(String firstNameString, String lastNameString, String birthTownString, String yoMammaString, String genderString, String middleInitialString, String birthMonthString) {
        
        this.firstNameString = firstNameString;
        this.lastNameString = lastNameString;
        this.birthTownString = birthTownString;
        this.yoMammaString = yoMammaString;
        this.genderString = genderString;
        this.birthMonthString = birthMonthString;
        this.middleInitialString = middleInitialString;
        
    }    
    public String starWars() {
        
        String result, starWarsFirst, starWarsLast;
        starWarsFirst = lastNameString.substring(0, 3) + firstNameString.toLowerCase().substring(0, 2);
        starWarsLast = yoMammaString.substring(0, 2) + birthTownString.toLowerCase().substring(0, 3);
        
        result = starWarsFirst + " " + starWarsLast;
        
        return result;
        
    }
    
    public String stripperName() {
    
        String result;
        int stripperChar1, stripperChar2, stripperChar3;
        
        stripperChar1 = firstNameString.toUpperCase().charAt(2);
        stripperChar2 = middleInitialString.toUpperCase().charAt(0);
        stripperChar3 = lastNameString.toUpperCase().charAt(2);  
        
        String[] firstInitialStripper = {"Chesty", "Fantasia", "Starr", "Diamond", "Montana", "Angel", "Sugar", "Mim", "Lola", "Kitty", "Roxie", "Dallas", "Princess", "Heidi", "Bambi", "Bunny", "Brandy", "Sugar", "Candy", "Raquelle", "Sapphire", "Cinnamon", "Blaze", "Trixie", "Isis", "Jade"};
        String[] middleInitialStripper = {"Leather", "Dream", "Sunny", "Deep", "Heaven", "Tight", "Shimmer", "Velvet", "Lusty", "Harley", "Passion", "Dazzle", "Dixon", "Spank", "Glitter", "Razor", "Meadow", "Glitz", "Sparkle", "Sweet", "Silver", "Tickle", "Cherry", "Hard", "Night", "Amber"};
        String[] lastInitialStripper = {"Hooter", "Horn", "Tower", "Fire", "Thighs", "Hips", "Side", "Jugs", "Shock", "Cocker", "Brook", "Tush", "Sizzle", "Ridge", "Kiss", "Bomb", "Cream", "Thong", "Heat", "Whip", "Cheeks", "Rock", "Hiney", "Button", "Lick", "Juice"};
        
        result = firstInitialStripper[stripperChar1 - 65] + " " + middleInitialStripper[stripperChar2 - 65] + " " + lastInitialStripper[stripperChar3 - 65];  
        
        return result;
        
    }

    public String vampireName() {
        
        String result;
        
        int firstInitial = firstNameString.toUpperCase().charAt(0);
        String birthMonth2 = birthMonthString;
        
        String[] firstNameArray = {"Savage", "Vampire", "Cruel", "Demon", "Lethal", "Rogue", "Brutal", "Sinister", "Malevolent", "Venomous", "Relentless", "Deadly", "Vicious", "Dark", "Ruthless", "Sadistic", "Ferocious", "Bloodthirsty", "Merciless", "Dragon", "Cold-blooded", "Witch", "Fierce", "Mortal", "Feral", "Hybrid" };
        
        String firstVampName = firstNameArray[firstInitial - 65];
        
        switch (birthMonth2) {
            
            case "January": birthMonth2 = "Eradicator";
            break;
            case "February": birthMonth2 = "Hunter";
            break;
            case "March": birthMonth2 = "Warrior";
            break;
            case "April": birthMonth2 = "Executioner";
            break;
            case "May": birthMonth2 = "Killer";
            break;
            case "June": birthMonth2 = "Death-Bringer";
            break;
            case "July": birthMonth2 = "Assassin";
            break;
            case "August": birthMonth2 = "Butcher";
            break;
            case "September": birthMonth2 = "Punisher";
            break;
            case "October": birthMonth2 = "Bloodletter";
            break;
            case "November": birthMonth2 = "Death-dealer";
            break;
            case "December": birthMonth2 = "Enforcer";
            break;
            default: break;
            
        }
            
            result = firstVampName + " " + birthMonth2;
            
            return result;
            
        }
    
    public String apocalypseName() {
        
        int firstInitial = firstNameString.toUpperCase().charAt(0);
        int maleOrFemale = genderString.toUpperCase().charAt(0);
        int lastInitial = lastNameString.toUpperCase().charAt(0);
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
