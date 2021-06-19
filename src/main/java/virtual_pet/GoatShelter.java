package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class GoatShelter {

    public ArrayList<VirtualGoats> shelterList = new ArrayList<VirtualGoats>();
    public ArrayList<VirtualGoats> selectionList = new ArrayList<VirtualGoats>();

    public void addDefaultGoats() {
        VirtualGoats underTestAlpine = new AlpineGoats("Ricardo", "loves to salsa");
        VirtualGoats underTestPygmy = new PygmyGoats("Tiny", "sick of short jokes");
        VirtualGoats underTestRoboAlpine = new RoboAlpine("Biggy", "misses Tupac");
        VirtualGoats underTestRoboPygmy = new RoboPygmy("Alfred", "sick of Bruce's shit");

        addGoatToShelter(underTestAlpine);
        addGoatToShelter(underTestPygmy);
        addGoatToShelter(underTestRoboAlpine);
        addGoatToShelter(underTestRoboPygmy);
    }

    public void selectGoats() {

        printShelterList();

        Scanner input = new Scanner(System.in);
        //goatShelter.selectionList.clear();

        String userContinue = "y";
        int i = 0;

        while (userContinue.equalsIgnoreCase("y") && i < shelterList.size()) {

            System.out.printf(FontFun.BLUE + "Which goat would you like to select (1 - %s): " + FontFun.RESET, shelterList.size());
            int selection = input.nextInt();
            selectionList.add(shelterList.get(selection - 1));
            input.nextLine();
            i++;
            if (i < shelterList.size()) {
                System.out.print(FontFun.BLUE + "Would you like to select another goat (y/n)? " + FontFun.RESET);
                userContinue = input.nextLine();
            }

        }
    }

    public void addGoatToShelter(VirtualGoats goat) {
        shelterList.add(goat);
    }

    public void removeGoatFromShelter() {
        for (VirtualGoats virtualPet : selectionList) {
            shelterList.remove(virtualPet);
        }
        AsciiArt.manualClearScreen();
        AsciiArt.fireWorks();
        System.out.println(FontFun.GREEN + "~~~~~~~\\|/~~~~~~~~\\|/~~~~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " Adoption successful! They will be missed! " + FontFun.RESET + FontFun.GREEN + "~~~~~~~\\|/~~~~~~~~~\\|/~~~~~~" + FontFun.RESET);
    }

    public void printShelterList() {
        AsciiArt.sectionBreakGreen();
        System.out.println(FontFun.GREEN_BRIGHT + "____________________________________________________________________________________________________" + FontFun.RESET);
        int i = 1;
        for (VirtualGoats virtualGoats : shelterList) {
            System.out.println(FontFun.PURPLE + i + ". " + virtualGoats.toString());
            i++;
        }
        AsciiArt.sectionBreakGreen();
    }

    public void printSelectionList() {
        for (VirtualGoats virtualGoats : selectionList) {
            System.out.println(virtualGoats.toString());
        }
    }

    public void feedGoats() {
        for (VirtualGoats virtualGoats : shelterList) {
            virtualGoats.feedGoat();
        }
        AsciiArt.manualClearScreen();
        AsciiArt.sun();
        AsciiArt.grazingGoat();
        System.out.println(FontFun.GREEN + "~~~~~~~\\|/~~~~~~~\\|/~~~\\|/~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " The goats have been fed and/or charged! " + FontFun.RESET + FontFun.GREEN + "~\\|/~~~~~~\\|/~~~~~~~~\\|/~~~~" + FontFun.RESET);
    }

    public void waterGoats() {
        for (VirtualGoats virtualGoats : shelterList) {
            virtualGoats.waterGoat();
        }
        AsciiArt.manualClearScreen();
        AsciiArt.beer();
        System.out.println(FontFun.GREEN + "~~~~~\\|/~~~~~~~\\|/~~~\\|/~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " The goats have been given water and/or oil! " + FontFun.RESET + FontFun.GREEN + "~\\|/~~~~~~\\|/~~~~~~\\|/~~~~" + FontFun.RESET);
    }

    public void cleanGoatPens() {
        int i = 0;
        for (VirtualGoats virtualGoats : shelterList) {

            if (shelterList.get(i).goatType == VirtualGoats.TypeOfGoat.ORGANIC) {
                ((OrganicGoats) shelterList.get(i)).penDirtLevel = 0;
            }
            i++;
        }
        AsciiArt.manualClearScreen();
        AsciiArt.penPoo();
        System.out.println(FontFun.GREEN + "~~~~~~~\\|/~~~~~\\|/~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " You had fun cleaning the goat poop out of their pens! " + FontFun.RESET + FontFun.GREEN + "~~~\\|/~~~~~~~\\|/~~~~~~" + FontFun.RESET);
    }

    public void maintRoboGoats() {
        int i = 0;
        for (VirtualGoats virtualGoats : shelterList) {
            if (shelterList.get(i).goatType == VirtualGoats.TypeOfGoat.ROBOTIC) {
                ((RoboticGoats) shelterList.get(i)).maintLevel = 0;
            }
            i++;
        }
        AsciiArt.manualClearScreen();
        AsciiArt.screw();
        System.out.println(FontFun.GREEN + "~~~~~\\|/~~~~~\\|/~~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " The robotic goats had their nuts and screws tightened! " + FontFun.RESET + FontFun.GREEN + "~~~\\|/~~~~~~~\\|/~~~~~~" + FontFun.RESET);
    }

    public void playWithGoats() {
        int i = 0;
        for (VirtualGoats virtualGoats : shelterList) {

            if (shelterList.get(i).goatType == VirtualGoats.TypeOfGoat.ORGANIC) {
                shelterList.get(i).boredomLevel = Math.max(shelterList.get(i).boredomLevel - 10, 0);
                ((OrganicGoats) shelterList.get(i)).thirstLevel = Math.min(((OrganicGoats) shelterList.get(i)).thirstLevel + 3, 20);
            } else {
                shelterList.get(i).boredomLevel = Math.max(shelterList.get(i).boredomLevel - 10, 0);
                ((RoboticGoats) shelterList.get(i)).oilLevel = Math.max(((RoboticGoats) shelterList.get(i)).oilLevel - 3, 0);
            }
            i++;
        }
        AsciiArt.manualClearScreen();
        AsciiArt.sun();
        AsciiArt.jumpingGoat();
        System.out.println(FontFun.GREEN + "~~~~~~~\\|/~~~~~~~~\\|/~~~~\\|/~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " The goats had a fun time playing! " + FontFun.RESET + FontFun.GREEN + "~\\|/~~~~~~\\|/~~~~~~~~~~\\|/~~~~~~" + FontFun.RESET);
    }

    public void dailyGoatUpkeep() {
        int i = 0;
        for (VirtualGoats virtualGoats : shelterList) {

            if (shelterList.get(i).goatType == VirtualGoats.TypeOfGoat.ORGANIC) {
                ((OrganicGoats) shelterList.get(i)).hungerLevel = Math.min(((OrganicGoats) shelterList.get(i)).hungerLevel + 3, 20);
                ((OrganicGoats) shelterList.get(i)).thirstLevel = Math.min(((OrganicGoats) shelterList.get(i)).thirstLevel + 2, 20);
                ((OrganicGoats) shelterList.get(i)).penDirtLevel = Math.min(((OrganicGoats) shelterList.get(i)).penDirtLevel + 2, 20);
                shelterList.get(i).boredomLevel = Math.min(shelterList.get(i).boredomLevel + 2, 20);//Don't have to cast because it's in VirtualGoats
            } else {
                ((RoboticGoats) shelterList.get(i)).battLevel = Math.max(((RoboticGoats) shelterList.get(i)).battLevel - 3, 0);
                ((RoboticGoats) shelterList.get(i)).oilLevel = Math.max(((RoboticGoats) shelterList.get(i)).oilLevel - 2, 0);
                ((RoboticGoats) shelterList.get(i)).maintLevel = Math.min(((RoboticGoats) shelterList.get(i)).maintLevel + 2, 20);
                shelterList.get(i).boredomLevel = Math.min(shelterList.get(i).boredomLevel + 2, 20);//don't have to cast because it's in VirtualGoats
            }
            i++;
        }
    }

    public void walkGoats() {
        int i = 0;
        for (VirtualGoats virtualGoats : shelterList) {

            if (shelterList.get(i).goatType == VirtualGoats.TypeOfGoat.ORGANIC) {
                ((OrganicGoats) shelterList.get(i)).boredomLevel = Math.max(((OrganicGoats) shelterList.get(i)).boredomLevel - 3, 0);
                ((OrganicGoats) shelterList.get(i)).hungerLevel = Math.min(((OrganicGoats) shelterList.get(i)).hungerLevel + 3, 20);
                ((OrganicGoats) shelterList.get(i)).thirstLevel = Math.min(((OrganicGoats) shelterList.get(i)).thirstLevel + 3, 20);
            } else {
                ((RoboticGoats) shelterList.get(i)).boredomLevel = Math.max(((RoboticGoats) shelterList.get(i)).boredomLevel - 3, 0);
                ((RoboticGoats) shelterList.get(i)).battLevel = Math.max(((RoboticGoats) shelterList.get(i)).battLevel - 3, 0);
                ((RoboticGoats) shelterList.get(i)).oilLevel = Math.max(((RoboticGoats) shelterList.get(i)).oilLevel - 3, 0);
                ((RoboticGoats) shelterList.get(i)).maintLevel = Math.min(((RoboticGoats) shelterList.get(i)).maintLevel + 3, 20);
            }
            i++;
        }
        AsciiArt.manualClearScreen();
        AsciiArt.leftGoat();
        System.out.println(FontFun.GREEN + "~~~~~~~\\|/~~~~~~~~\\|/~~~~\\|/~~~~~~" + FontFun.BLACK_BOLD + FontFun.GREEN_BACKGROUND + " The goats enjoyed their walk! " + FontFun.RESET + FontFun.GREEN + "~~~\\|/~~~~~~\\|/~~~~~~~~~~\\|/~~~~~~~" + FontFun.RESET);
    }

    public boolean deathCheck() {
        boolean goatIsDead = false;
        boolean checkAllPets;
        int i = 0;
        for (VirtualGoats virtualGoats : shelterList) {

            if (shelterList.get(i).goatType == VirtualGoats.TypeOfGoat.ORGANIC) {

                checkAllPets = (((OrganicGoats) shelterList.get(i)).getHungerLevel() >= 20 ||
                        ((OrganicGoats) shelterList.get(i)).getThirstLevel() >= 20 ||
                        ((OrganicGoats) shelterList.get(i)).getBoredomLevel() >= 20);

                if (checkAllPets) {
                    ((OrganicGoats) shelterList.get(i)).isAlive = false;
                    goatIsDead = true;
                }
            } else {
                checkAllPets = (((RoboticGoats) shelterList.get(i)).getBattLevel() <= 0 ||
                        ((RoboticGoats) shelterList.get(i)).getOilLevel() <= 0 ||
                        ((RoboticGoats) shelterList.get(i)).getBoredomLevel() >= 20);

                if (checkAllPets) {
                    ((RoboticGoats) shelterList.get(i)).isAlive = false;
                    goatIsDead = true;
                }
            }
            i++;
        }
        return goatIsDead;
    }

    public static String returnStatusBar(double statusNum) {
        double roundedStatus = Math.ceil(statusNum / 4);
        String barFill = FontFun.GREEN + "▓" + FontFun.GREEN;
        String barEmpty = FontFun.CYAN + "░" + FontFun.RESET;
        String finalBar = "";
        for (int i = 0; i < 5; i++) {
            if (i < roundedStatus) {
                finalBar = finalBar + barFill;
            } else {
                finalBar = finalBar + barEmpty;
            }
        }
        return finalBar;
    }
}
