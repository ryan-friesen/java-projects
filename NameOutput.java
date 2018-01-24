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



/**
 *
 * @author Ryan Friesen
 * Create a file titled "NameOutput.java" as part of the name generator package.
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
     * @param incrementalString
     * @param incrementalConsonantString
     * @param decrementalString
     * @param decrementalConsonantString
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
    String incrementalString;
    String incrementalConsonantString;
    String decrementalString;
    String decrementalConsonantString;
    int birthDay;

    public NameOutput(String firstNameString, String lastNameString, String birthTownString, String yoMammaString, String genderString, String middleInitialString, String birthMonthString, String heavyMetalString, int birthDay, String incrementalString, String incrementalConsonantString, String decrementalString, String decrementalConsonantString) {

        this.firstNameString = firstNameString;
        this.lastNameString = lastNameString;
        this.birthTownString = birthTownString;
        this.yoMammaString = yoMammaString;
        this.genderString = genderString;
        this.birthMonthString = birthMonthString;
        this.middleInitialString = middleInitialString;
        this.heavyMetalString = heavyMetalString;
        this.incrementalString = incrementalString;
        this.incrementalConsonantString = incrementalConsonantString;
        this.decrementalString = decrementalString;
        this.decrementalConsonantString = decrementalConsonantString;
        this.birthDay = birthDay;

    }
    public String starWars() {

        String result, starWarsFirst, starWarsLast;
        String firstNameStringFinal = "";
        String lastNameStringFinal = "";
        String yoMammaStringFinal = "";
        String birthTownStringFinal = "";

        if (firstNameString.length() == 2) {

            firstNameStringFinal = firstNameString + "-";

        } else {

            firstNameStringFinal = firstNameString;

        }

        if (lastNameString.length() == 1) {

            lastNameStringFinal = "-" + lastNameString;

        } else {

            lastNameStringFinal = lastNameString;

        }

        if (yoMammaString.length() == 1) {

            yoMammaStringFinal = yoMammaString + "-";

        } else {

            yoMammaStringFinal = yoMammaString;

        }

        if (birthTownString.length() == 2) {

            birthTownStringFinal = "-" + birthTownString;

        } else {

            birthTownStringFinal = birthTownString;

        }

        starWarsFirst = lastNameStringFinal.substring(0, 1).toUpperCase() + lastNameStringFinal.substring(1, 3).toLowerCase() + firstNameStringFinal.toLowerCase().substring(0, 2);
        starWarsLast = yoMammaStringFinal.substring(0, 1).toUpperCase() + yoMammaStringFinal.substring(1, 2).toLowerCase() + birthTownStringFinal.toLowerCase().substring(0, 3);

        result = starWarsFirst + " " + starWarsLast;

        return result;

    }

    public String stripperName() {

        String result;
        int stripperChar1, stripperChar2, stripperChar3;

        stripperChar1 = firstNameString.toUpperCase().charAt(2);
        stripperChar2 = middleInitialString.toUpperCase().charAt(0);
        stripperChar3 = lastNameString.toUpperCase().charAt(2);

        String[] firstInitialStripper = {
            "Chesty",
            "Fantasia",
            "Starr",
            "Diamond",
            "Montana",
            "Angel",
            "Sugar",
            "Mim",
            "Lola",
            "Kitty",
            "Roxie",
            "Dallas",
            "Princess",
            "Heidi",
            "Bambi",
            "Bunny",
            "Brandy",
            "Sugar",
            "Candy",
            "Raquelle",
            "Sapphire",
            "Cinnamon",
            "Blaze",
            "Trixie",
            "Isis",
            "Jade"
        };
        String[] middleInitialStripper = {
            "Leather",
            "Dream",
            "Sunny",
            "Deep",
            "Heaven",
            "Tight",
            "Shimmer",
            "Velvet",
            "Lusty",
            "Harley",
            "Passion",
            "Dazzle",
            "Dixon",
            "Spank",
            "Glitter",
            "Razor",
            "Meadow",
            "Glitz",
            "Sparkle",
            "Sweet",
            "Silver",
            "Tickle",
            "Cherry",
            "Hard",
            "Night",
            "Amber"
        };
        String[] lastInitialStripper = {
            "Hooter",
            "Horn",
            "Tower",
            "Fire",
            "Thighs",
            "Hips",
            "Side",
            "Jugs",
            "Shock",
            "Cocker",
            "Brook",
            "Tush",
            "Sizzle",
            "Ridge",
            "Kiss",
            "Bomb",
            "Cream",
            "Thong",
            "Heat",
            "Whip",
            "Cheeks",
            "Rock",
            "Hiney",
            "Button",
            "Lick",
            "Juice"
        };

        result = firstInitialStripper[stripperChar1 - 65] + " " + middleInitialStripper[stripperChar2 - 65] + " " + lastInitialStripper[stripperChar3 - 65];

        return result;

    }

    public String vampireName() {

        String result;

        int firstInitial = firstNameString.toUpperCase().charAt(0);
        String birthMonth2 = birthMonthString;

        String[] firstNameArray = {
            "Savage",
            "Vampire",
            "Cruel",
            "Demon",
            "Lethal",
            "Rogue",
            "Brutal",
            "Sinister",
            "Malevolent",
            "Venomous",
            "Relentless",
            "Deadly",
            "Vicious",
            "Dark",
            "Ruthless",
            "Sadistic",
            "Ferocious",
            "Bloodthirsty",
            "Merciless",
            "Dragon",
            "Cold-blooded",
            "Witch",
            "Fierce",
            "Mortal",
            "Feral",
            "Hybrid"
        };

        String firstVampName = firstNameArray[firstInitial - 65];

        switch (birthMonth2) {

            case "January":
                birthMonth2 = "Eradicator";
                break;
            case "February":
                birthMonth2 = "Hunter";
                break;
            case "March":
                birthMonth2 = "Warrior";
                break;
            case "April":
                birthMonth2 = "Executioner";
                break;
            case "May":
                birthMonth2 = "Killer";
                break;
            case "June":
                birthMonth2 = "Death-Bringer";
                break;
            case "July":
                birthMonth2 = "Assassin";
                break;
            case "August":
                birthMonth2 = "Butcher";
                break;
            case "September":
                birthMonth2 = "Punisher";
                break;
            case "October":
                birthMonth2 = "Bloodletter";
                break;
            case "November":
                birthMonth2 = "Death-dealer";
                break;
            case "December":
                birthMonth2 = "Enforcer";
                break;
            default:
                break;

        }

        result = firstVampName + " " + birthMonth2;

        return result;

    }

    public String apocalypseName() {

        int firstInitial = firstNameString.toUpperCase().charAt(0);
        int maleOrFemale = genderString.toUpperCase().charAt(0);
        int lastInitial = lastNameString.toUpperCase().charAt(0);
        String result;

        String[] maleArray = {
            "Ash",
            "Brandish",
            "Captain",
            "Duke",
            "Ezekiel",
            "Flynn",
            "Grint",
            "Hardigan",
            "Ivan",
            "Jag",
            "Knife",
            "Langur",
            "Max",
            "Noah",
            "Otto",
            "Packer",
            "Quigley",
            "Ricket",
            "Solomon",
            "Tyrone",
            "Utah",
            "Vick",
            "Wolfgang",
            "Xander",
            "York",
            "Zed"
        };
        String[] femaleArray = {
            "Artemis",
            "Bolt",
            "Crane",
            "Digger",
            "Ember",
            "Falcon",
            "Grey",
            "Hoppy",
            "Iz",
            "Jezebel",
            "Krist",
            "Loris",
            "Minnow",
            "North",
            "Octavia",
            "Prudence",
            "Quinn",
            "Red",
            "Steely",
            "Terra",
            "Unit",
            "Via",
            "Weedy",
            "Xil",
            "Yoll",
            "Zephyr"
        };
        String[] lastNameArray = {
            "Albatross",
            "Book",
            "Crow",
            "Drake",
            "Engine",
            "Flash",
            "Glass",
            "Hammer",
            "Ice",
            "Jackboot",
            "Ka",
            "Longbow",
            "Mason",
            "Nethers",
            "Odin",
            "Pathfinder",
            "Quiver",
            "Ranger",
            "Savage",
            "Thorn",
            "Unger",
            "Vigilante",
            "Warheart",
            "Xeven",
            "Yen",
            "Zimmer"
        };

        if (maleOrFemale == 70) {

            result = femaleArray[firstInitial - 65] + " " + lastNameArray[lastInitial - 65];

        } else {

            result = maleArray[firstInitial - 65] + " " + lastNameArray[lastInitial - 65];
        }

        return result;

    }

    public String medievalName() {

        int maleOrFemale = genderString.toUpperCase().charAt(0);
        String birthMonth2 = birthMonthString.toUpperCase().substring(0, 1) + birthMonthString.substring(1, birthMonthString.length());
        int birthDay2 = birthDay;

        String[] maleGenderArray = {
            "Ulric",
            "Baird",
            "Henry",
            "Oliver",
            "Fraden",
            "John",
            "Geoffrey",
            "Francis",
            "Simon",
            "Fendrel",
            "Frederick",
            "Thomas",
            "Arthur",
            "Cassius",
            "Richard",
            "Matthew",
            "Charles",
            "Reynard",
            "Favian",
            "Philip",
            "Zoricus",
            "Carac",
            "Sadon",
            "Alistair",
            "Caine",
            "Gawain",
            "Godfrey",
            "Mericus",
            "Rowley",
            "Brom",
            "Cornell"
        };
        String[] femaleGenderArray = {
            "Mallicent",
            "Alianor",
            "Ellyn",
            "Sybbyl",
            "Jacquelyn",
            "Catherine",
            "Anne",
            "Thea",
            "Elizabeth",
            "Luella",
            "Mary",
            "Arabella",
            "Muriel",
            "Isabel",
            "Angmar",
            "Isolde",
            "Eleanor",
            "Josselyn",
            "Margaret",
            "Luanda",
            "Ariana",
            "Clarice",
            "Idla",
            "Claire",
            "Ryia",
            "Joan",
            "Clemence",
            "Morgaine",
            "Edith",
            "Nerida",
            "Ysmay"
        };

        switch (birthMonth2) {

            case "January":
                birthMonth2 = "Cabrera";
                break;
            case "February":
                birthMonth2 = "Greene";
                break;
            case "March":
                birthMonth2 = "Stewart";
                break;
            case "April":
                birthMonth2 = "Coastillon";
                break;
            case "May":
                birthMonth2 = "Rolfe";
                break;
            case "June":
                birthMonth2 = "Archer";
                break;
            case "July":
                birthMonth2 = "de Biville";
                break;
            case "August":
                birthMonth2 = "Tudor";
                break;
            case "September":
                birthMonth2 = "Golding";
                break;
            case "October":
                birthMonth2 = "Walter";
                break;
            case "November":
                birthMonth2 = "Buxton";
                break;
            case "December":
                birthMonth2 = "Felstead";
                break;
            default:
                break;

        }

        if (maleOrFemale == 70) {

            return femaleGenderArray[birthDay2 - 1] + " " + birthMonth2;

        } else {

            return maleGenderArray[birthDay2 - 1] + " " + birthMonth2;
        }
    }

    public String heavyMetalName() {

        int firstInitial = firstNameString.toUpperCase().charAt(0);
        int lastInitial = lastNameString.toUpperCase().charAt(0);

        String[] firstName = {
            "Rancid",
            "Insane",
            "Black",
            "Iron",
            "Holy",
            "Rabid",
            "Bloody",
            "Satan's",
            "Bastard",
            "Forsaken",
            "Hell's",
            "Forbidden",
            "Dark",
            "Frantic",
            "Devil's",
            "Evil",
            "Inner",
            "Bleeding",
            "Guilty",
            "Witch's",
            "Heavy",
            "Illegal",
            "Fallen",
            "Sinister",
            "Crazy",
            "Troubled"
        };
        String[] lastName = {
            "Empire",
            "Fury",
            "Rage",
            "Zombies",
            "Sin",
            "Warriors",
            "Angels",
            "Death",
            "Anarchy",
            "Henchmen",
            "Kill",
            "Vengeance",
            "Tendencies",
            "Magic",
            "Soldier",
            "Gods",
            "Goblin",
            "Spawn",
            "Temple",
            "Realm",
            "Hate",
            "Slaves",
            "Thorn",
            "Abyss",
            "Fire",
            "Secrets"
        };

        return firstName[firstInitial - 65] + " " + lastName[lastInitial - 65];

    }

    public String incrementalize() {

        String firstName = firstNameString;
        char letter;
        String letter2 = "";
        int i = 0;
        int j = firstNameString.length();

        while (i < firstName.length()) {

            letter = firstName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 65:
                    letter = 69;
                    break;
                case 69:
                    letter = 73;
                    break;
                case 73:
                    letter = 79;
                    break;
                case 79:
                    letter = 85;
                    break;
                case 85:
                    letter = 89;
                    break;
                case 89:
                    letter = 65;
                    break;
                case 97:
                    letter = 101;
                    break;
                case 101:
                    letter = 105;
                    break;
                case 105:
                    letter = 111;
                    break;
                case 111:
                    letter = 117;
                    break;
                case 117:
                    letter = 121;
                    break;
                case 121:
                    letter = 97;
                    break;
                default:
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String incrementalizeLast() {

        String lastName = lastNameString;
        char letter;
        String letter2 = "";
        int i = 0;
        int j = lastNameString.length();

        while (i < j) {

            letter = lastName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 65:
                    letter = 69;
                    break;
                case 69:
                    letter = 73;
                    break;
                case 73:
                    letter = 79;
                    break;
                case 79:
                    letter = 85;
                    break;
                case 85:
                    letter = 89;
                    break;
                case 89:
                    letter = 65;
                    break;
                case 97:
                    letter = 101;
                    break;
                case 101:
                    letter = 105;
                    break;
                case 105:
                    letter = 111;
                    break;
                case 111:
                    letter = 117;
                    break;
                case 117:
                    letter = 121;
                    break;
                case 121:
                    letter = 97;
                    break;
                default:
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String consonantIncrement() {

        String firstName = firstNameString;
        int i = 0;
        int j = firstName.length();
        char letter;
        String letter2 = "";

        while (i < j) {

            letter = firstName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 64:
                    letter = 66;
                    break;
                case 65:
                    letter = 65;
                    break;
                case 68:
                    letter = 70;
                    break;
                case 69:
                    letter = 69;
                    break;
                case 72:
                    letter = 74;
                    break;
                case 73:
                    letter = 73;
                    break;
                case 78:
                    letter = 80;
                    break;
                case 79:
                    letter = 79;
                    break;
                case 84:
                    letter = 86;
                    break;
                case 85:
                    letter = 85;
                    break;
                case 88:
                    letter = 90;
                    break;
                case 89:
                    letter = 89;
                    break;
                case 90:
                    letter = 66;
                    break;
                case 96:
                    letter = 98;
                    break;
                case 97:
                    letter = 97;
                    break;
                case 100:
                    letter = 102;
                    break;
                case 101:
                    letter = 101;
                    break;
                case 104:
                    letter = 106;
                    break;
                case 105:
                    letter = 105;
                    break;
                case 110:
                    letter = 112;
                    break;
                case 111:
                    letter = 111;
                    break;
                case 116:
                    letter = 118;
                    break;
                case 117:
                    letter = 117;
                    break;
                case 120:
                    letter = 122;
                    break;
                case 121:
                    letter = 121;
                    break;
                case 122:
                    letter = 98;
                    break;
                default:
                    letter++;
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String consonantIncrementLast() {

        String lastName = lastNameString;
        int i = 0;
        int j = lastName.length();
        char letter;
        String letter2 = "";

        while (i < j) {

            letter = lastName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 64:
                    letter = 66;
                    break;
                case 65:
                    letter = 65;
                    break;
                case 68:
                    letter = 70;
                    break;
                case 69:
                    letter = 69;
                    break;
                case 72:
                    letter = 74;
                    break;
                case 73:
                    letter = 73;
                    break;
                case 78:
                    letter = 80;
                    break;
                case 79:
                    letter = 79;
                    break;
                case 84:
                    letter = 86;
                    break;
                case 85:
                    letter = 85;
                    break;
                case 88:
                    letter = 90;
                    break;
                case 89:
                    letter = 89;
                    break;
                case 96:
                    letter = 98;
                    break;
                case 97:
                    letter = 97;
                    break;
                case 100:
                    letter = 102;
                    break;
                case 101:
                    letter = 101;
                    break;
                case 104:
                    letter = 106;
                    break;
                case 105:
                    letter = 105;
                    break;
                case 110:
                    letter = 112;
                    break;
                case 111:
                    letter = 111;
                    break;
                case 116:
                    letter = 118;
                    break;
                case 117:
                    letter = 117;
                    break;
                case 120:
                    letter = 122;
                    break;
                case 121:
                    letter = 121;
                    break;
                case 122:
                    letter = 97;
                    break;
                default:
                    letter++;
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String decrementalize() {

        String firstName = firstNameString;
        char letter;
        String letter2 = "";
        int i = 0;
        int j = firstNameString.length();

        while (i < j) {

            letter = firstName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 65:
                    letter = 89;
                    break;
                case 69:
                    letter = 65;
                    break;
                case 73:
                    letter = 69;
                    break;
                case 79:
                    letter = 73;
                    break;
                case 85:
                    letter = 79;
                    break;
                case 89:
                    letter = 85;
                    break;
                case 97:
                    letter = 121;
                    break;
                case 101:
                    letter = 97;
                    break;
                case 105:
                    letter = 101;
                    break;
                case 111:
                    letter = 105;
                    break;
                case 117:
                    letter = 111;
                    break;
                case 121:
                    letter = 117;
                    break;
                default:
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String decrementalizeLast() {

        String lastName = lastNameString;
        char letter;
        String letter2 = "";
        int i = 0;
        int j = lastNameString.length();

        while (i < j) {

            letter = lastName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 65:
                    letter = 89;
                    break;
                case 69:
                    letter = 65;
                    break;
                case 73:
                    letter = 69;
                    break;
                case 79:
                    letter = 73;
                    break;
                case 85:
                    letter = 79;
                    break;
                case 89:
                    letter = 85;
                    break;
                case 97:
                    letter = 121;
                    break;
                case 101:
                    letter = 97;
                    break;
                case 105:
                    letter = 101;
                    break;
                case 111:
                    letter = 105;
                    break;
                case 117:
                    letter = 111;
                    break;
                case 121:
                    letter = 117;
                    break;
                default:
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String consonantDecrement() {

        String firstName = firstNameString;
        int i = 0;
        int j = firstNameString.length();
        char letter;
        String letter2 = "";

        while (i < j) {

            letter = firstName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 65:
                    letter = 65;
                    break;
                case 66:
                    letter = 90;
                    break;
                case 69:
                    letter = 69;
                    break;
                case 70:
                    letter = 68;
                    break;
                case 73:
                    letter = 73;
                    break;
                case 74:
                    letter = 72;
                    break;
                case 79:
                    letter = 79;
                    break;
                case 80:
                    letter = 78;
                    break;
                case 85:
                    letter = 85;
                    break;
                case 86:
                    letter = 84;
                    break;
                case 89:
                    letter = 89;
                    break;
                case 90:
                    letter = 88;
                    break;
                case 97:
                    letter = 97;
                    break;
                case 98:
                    letter = 122;
                    break;
                case 101:
                    letter = 101;
                    break;
                case 102:
                    letter = 100;
                    break;
                case 105:
                    letter = 105;
                    break;
                case 106:
                    letter = 104;
                    break;
                case 111:
                    letter = 111;
                    break;
                case 112:
                    letter = 110;
                    break;
                case 117:
                    letter = 117;
                    break;
                case 118:
                    letter = 116;
                    break;
                case 121:
                    letter = 121;
                    break;
                case 122:
                    letter = 120;
                    break;
                default:
                    letter--;
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

    public String consonantDecrementLast() {

        String lastName = lastNameString;
        int i = 0;
        int j = lastNameString.length();
        char letter;
        String letter2 = "";

        while (i < j) {

            letter = lastName.charAt(i);

            switch (letter) {

                case 39:
                    letter = 39;
                    break;
                case 65:
                    letter = 65;
                    break;
                case 66:
                    letter = 90;
                    break;
                case 69:
                    letter = 69;
                    break;
                case 70:
                    letter = 68;
                    break;
                case 73:
                    letter = 73;
                    break;
                case 74:
                    letter = 72;
                    break;
                case 79:
                    letter = 79;
                    break;
                case 80:
                    letter = 78;
                    break;
                case 85:
                    letter = 85;
                    break;
                case 86:
                    letter = 84;
                    break;
                case 89:
                    letter = 89;
                    break;
                case 90:
                    letter = 88;
                    break;
                case 97:
                    letter = 97;
                    break;
                case 98:
                    letter = 122;
                    break;
                case 101:
                    letter = 101;
                    break;
                case 102:
                    letter = 100;
                    break;
                case 105:
                    letter = 105;
                    break;
                case 106:
                    letter = 104;
                    break;
                case 111:
                    letter = 111;
                    break;
                case 112:
                    letter = 110;
                    break;
                case 117:
                    letter = 117;
                    break;
                case 118:
                    letter = 116;
                    break;
                case 121:
                    letter = 121;
                    break;
                case 122:
                    letter = 120;
                    break;
                default:
                    letter--;
                    break;

            }

            letter2 = letter2 + Character.toString(letter);
            i++;

        }

        return letter2.substring(0, 1).toUpperCase() + letter2.substring(1, j);

    }

}
