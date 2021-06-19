package virtual_pet;

public class RoboAlpine extends RoboticGoats {

    public RoboAlpine(String name, String description) {
        super(name, description);
    }

    public String toString() {
        String hLevel = GoatShelter.returnStatusBar((double) battLevel);
        String tLevel = GoatShelter.returnStatusBar((double) oilLevel);
        String pLevel = GoatShelter.returnStatusBar((double) maintLevel);
        String bLevel = GoatShelter.returnStatusBar((double) boredomLevel);
        return FontFun.PURPLE + " " + name + " (Robo Alpine), " + description +
                "\nBattery " + hLevel + "\t" +
                FontFun.PURPLE + "   Oil " + tLevel + "\t" +
                FontFun.PURPLE + "  Maint. " + pLevel + "\t" +
                FontFun.PURPLE + " Boredom " + bLevel +
                "\n" + FontFun.GREEN_BRIGHT + "––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––" + FontFun.RESET;
    }

    @Override
    public void feedGoat() {
        battLevel = Math.min(battLevel + 8, 20);
    }

    @Override
    public void waterGoat() {
        oilLevel = Math.min(oilLevel + 8, 20);
    }

    @Override
    public void walkGoat() {

    }
}
