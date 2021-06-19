package virtual_pet;

abstract class VirtualGoats {

    protected String name;
    protected String description;
    protected int boredomLevel;
    protected boolean isAlive;
    public enum TypeOfGoat {ORGANIC, ROBOTIC};
    public TypeOfGoat goatType;

    public VirtualGoats(String name, String description, TypeOfGoat typeOfGoat) {
        this.name = name;
        this.description = description;
        this.boredomLevel = 0;
        this.isAlive = true;
        this.goatType = typeOfGoat;
    }


    public abstract void feedGoat();
    public abstract void waterGoat();
    public abstract void walkGoat();

    //GETTERS
    public String getName() {
        return name;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public String getDescription() {
        return description;
    }


}
