package virtual_pet;

abstract class RoboticGoats extends VirtualGoats {

    protected int battLevel;
    protected int oilLevel;
    protected int maintLevel;

    public RoboticGoats(String name, String description) {
        super(name, description,TypeOfGoat.ROBOTIC);
        this.battLevel = 10;
        this.oilLevel = 10;
        this.maintLevel = 5;

    }

    @Override
    public void feedGoat() {
        battLevel += 8;
    }

    @Override
    public void waterGoat() {
        oilLevel += 8;
    }

    //GETTERS
    public int getBattLevel() {
        return battLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintLevel() {
        return maintLevel;
    }
}
