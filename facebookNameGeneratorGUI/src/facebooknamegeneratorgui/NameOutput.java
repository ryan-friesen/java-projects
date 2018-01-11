/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebooknamegeneratorgui;

/**
 *
 * @author Captain Kirk Cameron
 */
public class NameOutput {
    
    /**
     *
     * @param firstNameString
     * @param lastNameString
     * @param birthTownString
     * @param yoMammaString
     * @param genderString
     * @param birthDayString
     * @param birthMonthString
     * @param heavyMetalString
     * @return
     */
    
    String firstNameString;
    String lastNameString;
    String birthTownString;
    String genderString;
    String yoMammaString;
    String middleInitialString;
    String birthMonthString;
    String heavyMetalString;
    int birthDay;
    
    public NameOutput(String firstNameString, String lastNameString, String birthTownString, String yoMammaString, String genderString, String middleInitialString, String birthMonthString, String heavyMetalString, int birthDay) {
        
        this.firstNameString = firstNameString;
        this.lastNameString = lastNameString;
        this.birthTownString = birthTownString;
        this.yoMammaString = yoMammaString;
        this.genderString = genderString;
        this.birthMonthString = birthMonthString;
        this.middleInitialString = middleInitialString;
        this.heavyMetalString = heavyMetalString;
        this.birthDay = birthDay;
        
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

        if( maleOrFemale == 70 ) {
            
            result = femaleArray[firstInitial - 65] + " " + lastNameArray[lastInitial - 65];
            
        }
        
        else {
            
            result = maleArray[firstInitial - 65] + " " + lastNameArray[lastInitial - 65];
        }
        
        return result;
        
    }
    
    public String medievalName() {
        
        int maleOrFemale = genderString.toUpperCase().charAt(0);
        String birthMonth2 = birthMonthString;
        int birthDay2 = birthDay;
        
        String[] maleGenderArray = {"Ulric", "Baird", "Henry", "Oliver", "Fraden", "John", "Geoffrey", "Francis", "Simon", "Fendrel", "Frederick", "Thomas", "Arthur", "Cassius", "Richard", "Matthew", "Charles", "Reynard", "Favian", "Philip", "Zoricus", "Carac", "Sadon", "Alistair", "Caine", "Gawain", "Godfrey", "Mericus", "Rowley", "Brom", "Cornell" };
        String[] femaleGenderArray = {"Mallicent", "Alianor", "Ellyn", "Sybbyl", "Jacquelyn", "Catherine", "Anne", "Thea", "Elizabeth", "Luella", "Mary", "Arabella", "Muriel", "Isabel", "Angmar", "Isolde", "Eleanor", "Josselyn", "Margaret", "Luanda", "Ariana", "Clarice", "Idla", "Claire", "Ryia", "Joan", "Clemence", "Morgaine", "Edith", "Nerida", "Ysmay" };
        
        switch (birthMonth2) {
            
            case "January": birthMonth2 = "Cabrera";
            break;
            case "February": birthMonth2 = "Greene";
            break;
            case "March": birthMonth2 = "Stewart";
            break;
            case "April": birthMonth2 = "Coastillon";
            break;
            case "May": birthMonth2 = "Rolfe";
            break;
            case "June": birthMonth2 = "Archer";
            break;
            case "July": birthMonth2 = "de Biville";
            break;
            case "August": birthMonth2 = "Tudor";
            break;
            case "September": birthMonth2 = "Golding";
            break;
            case "October": birthMonth2 = "Walter";
            break;
            case "November": birthMonth2 = "Buxton";
            break;
            case "December": birthMonth2 = "Felstead";
            break;
            default: break;
            
        }
        
        if( maleOrFemale == 70) {
            
            return femaleGenderArray[birthDay2 - 1] + " " + birthMonth2;
            
        }
        
        else {
            
            return maleGenderArray[birthDay2 - 1] + " " + birthMonth2;
        }
    }
    
    public String heavyMetalName() {
        
        int firstInitial = firstNameString.toUpperCase().charAt(0);
        int lastInitial = lastNameString.toUpperCase().charAt(0);
        
        String[] firstName = {"Rancid", "Insane", "Black", "Iron", "Holy", "Rabid", "Bloody", "Satan's", "Bastard", "Forsaken", "Hell's", "Forbidden", "Dark", "Frantic", "Devil's", "Evil", "Inner", "Bleeding", "Guilty", "Witch's", "Heavy", "Illegal", "Fallen", "Sinister", "Crazy", "Troubled" };
        String[] lastName = {"Empire", "Fury", "Rage", "Zombies", "Sin", "Warriors", "Angels", "Death", "Anarchy", "Henchmen", "Vengeance", "Tendencies", "Magic", "Soldier", "Gods", "Goblin", "Spawn", "Temple", "Realm", "Hate", "Slaves", "Thorn", "Abyss", "Fire", "Secrets" };
         
        return firstName[firstInitial - 65] + " " + lastName[lastInitial - 65];
        
    }
      
}