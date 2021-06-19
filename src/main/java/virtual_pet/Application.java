package virtual_pet;

import java.io.IOException;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        GoatShelter goatShelter = new GoatShelter();
        goatShelter.addDefaultGoats();
        boolean isDead = false;

        int userSelection = 0;
        int day = 1;

        welcomeMessage(goatShelter);

        do {
            System.out.flush();
            System.out.print(FontFun.BLUE + "Please enter your selection (1-9 or 0): " + FontFun.RESET);
            Scanner input = new Scanner(System.in);
            userSelection = input.nextInt();
            getUserInput(userSelection, goatShelter, day);

            if (userSelection != 0 && userSelection <= 9 && userSelection >= 1) {
                if (userSelection != 4) {
                    day = tick(day, goatShelter);
                } else {
                    day++;
                }
            }
            goatShelter.printShelterList();
            System.out.println("<1> Feed/Charge        <2> Water/Oil         <3> Play              <4> Walk           <5> Clean Pens");
            System.out.println("<6> Robo Maint         <7> Adopt             <8> Admit New         <9> Quit           <0> Help Menu");
            AsciiArt.sectionBreakGreen();

            System.out.println("Current day is : " + day);

            isDead = goatShelter.deathCheck();

        } while (userSelection != 9 && !isDead);


        if (isDead) {
            AsciiArt.manualClearScreen();
            AsciiArt.grimReaper();
            System.out.println(FontFun.RED+"PETA shut down your shelter.");
            System.out.println("You're a terrible goatherder."+FontFun.RESET);
        } else {
            AsciiArt.manualClearScreen();
            System.out.println(FontFun.GREEN + "~~~~~~~~~~~~~~~~~~~ Thanks for stopping by! Have a great day. Game is exiting... ~~~~~~~~~~~~~~~~~~" + FontFun.RESET);
        }

    }

    public static void getUserInput(int userSelection, GoatShelter goatShelter, int day) {
        switch (userSelection) {
            case 1:
                goatShelter.feedGoats();
                break;
            case 2:
                goatShelter.waterGoats();
                break;
            case 3:
                goatShelter.selectGoats();
                goatShelter.playWithGoats();
                break;
            case 4:
                goatShelter.walkGoats();
                break;
            case 5:
                goatShelter.cleanGoatPens();
                break;
            case 6:
                goatShelter.maintRoboGoats();
                break;
            case 7:
                goatShelter.selectGoats();
                goatShelter.removeGoatFromShelter();
                break;
            case 8:
                addNewGoat(goatShelter);
                break;
            case 9:
                System.out.println(FontFun.GREEN + "~~~~~~~~~ Thanks for stopping by! Game exiting..." + FontFun.RESET);
                break;
            case 0:
                helpMenu(goatShelter);
                break;
            default:
                System.out.println("Bad selection");
                break;
        }
    }

    private static void helpMenu(GoatShelter goatShelter) {
        AsciiArt.helpMenu();
        System.out.println(FontFun.CYAN + "Organic goats will die if their Hunger or Thirst levels reach 20.\n");
        System.out.println("Robotic goats will die if their Battery or Oil levels reach 0.\n");
        System.out.println("All goats will die if their Boredom level reaches 20.\n");
        System.out.println("The organic goat pens need to be cleaned before Pen Dirt level reaches 20.\n");
        System.out.println("The robotic goats need maintenance before Maint level reaches 20.\n" + FontFun.RESET);
        promptEnterKey();
    }

    private static void welcomeMessage(GoatShelter goatShelter) {
        AsciiArt.manualClearScreen();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ WELCOME TO ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        AsciiArt.welcomeLogo();
        System.out.println();
        AsciiArt.portraitGoat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~(Best viewed in a separate console window)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~(Right-click console bar > View Mode > select Window)~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~(Resize console window from the top line to the bottom and start playing!)~~~~~~~~~~~~~~");
        promptEnterKey();
        AsciiArt.manualClearScreen();
        System.out.println(FontFun.BLUE + "                            Here are the goats currently in the shelter:\n" + FontFun.RESET);
        goatShelter.printShelterList();
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "1. Feed & Charge Goats" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "2. Water & Oil Goats" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "3. Play with goats" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "4. Take goats for a walk" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "5. Clean goat pens" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "6. Maintenance robo goats" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "7. Give goats away for adoption" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "8. Admit a new goat to the shelter" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "9. Quit" + FontFun.RESET);
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "0. Help Menu" + FontFun.RESET);
        AsciiArt.sectionBreakGreen();
    }

    private static void addNewGoat(GoatShelter goatShelter) {
        Scanner userInput = new Scanner(System.in);
        AsciiArt.sectionBreakGreen();
        System.out.println(FontFun.CYAN + "What type of goat would you like to add (1-4):");
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "1. Organic Pygmy");
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "2. Organic Alpine");
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "3. Robotic Pygmy");
        System.out.println(FontFun.BLUE + "-➤ " + FontFun.CYAN + "4. Robotic Alpine" + FontFun.RESET);
        int goatType = userInput.nextInt();
        userInput.nextLine();
        AsciiArt.sectionBreakGreen();
        System.out.println("What would you like to name the new goat?");
        String goatName = userInput.nextLine();
        System.out.printf("How would you describe %s?%n", goatName);
        String goatDesc = userInput.nextLine();

        VirtualGoats goatToAdd;
        switch (goatType) {
            case 1:
                goatToAdd = new PygmyGoats(goatName, goatDesc);
                goatShelter.shelterList.add(goatToAdd);
                break;
            case 2:
                goatToAdd = new AlpineGoats(goatName, goatDesc);
                goatShelter.shelterList.add(goatToAdd);
                break;
            case 3:
                goatToAdd = new RoboPygmy(goatName, goatDesc);
                goatShelter.shelterList.add(goatToAdd);
                break;
            case 4:
                goatToAdd = new RoboAlpine(goatName, goatDesc);
                goatShelter.shelterList.add(goatToAdd);
                break;
            default:
                System.out.println(FontFun.RED + "Invalid goat type, please try again." + FontFun.RESET);
                break;
        }

        AsciiArt.manualClearScreen();
        AsciiArt.sectionBreakGreen();
//        goatShelter.printShelterList();
        System.out.printf(FontFun.YELLOW + "            ☺ ☺ ☺ ☺ ☺" + FontFun.RESET + " Congrats! %s has been admitted into the shelter." + FontFun.YELLOW + " ☺ ☺ ☺ ☺ ☺%n", goatName + FontFun.RESET);
    }

    public static int tick(int day, GoatShelter goatShelter) {
        day++;
        goatShelter.dailyGoatUpkeep();
        return day;
    }

    public static void promptEnterKey() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Press " + FontFun.BLUE + "\"ENTER\"" + FontFun.RESET + " to continue ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
