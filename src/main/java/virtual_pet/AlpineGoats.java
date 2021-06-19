package virtual_pet;

public class AlpineGoats extends OrganicGoats {

    public AlpineGoats(String name, String description) {
        super(name, description);
    }

    public String toString() {
        String hLevel = GoatShelter.returnStatusBar((double) hungerLevel);
        String tLevel = GoatShelter.returnStatusBar((double) thirstLevel);
        String pLevel = GoatShelter.returnStatusBar((double) penDirtLevel);
        String bLevel = GoatShelter.returnStatusBar((double) boredomLevel);
        return FontFun.PURPLE + " " + name + " (Alpine), " + description +
                "\n Hunger " + hLevel + "\t" +
                FontFun.PURPLE + "Thirst " + tLevel + "\t" +
                FontFun.PURPLE + "Pen Dirt " + pLevel + "\t" +
                FontFun.PURPLE + " Boredom " + bLevel +
                "\n" + FontFun.GREEN_BRIGHT + "––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––" + FontFun.RESET;
    }

    @Override
    public void feedGoat() {
        hungerLevel = Math.max(hungerLevel - 8, 0);
    }

    @Override
    public void waterGoat() {
        thirstLevel = Math.max(thirstLevel - 8, 0);
    }
}
