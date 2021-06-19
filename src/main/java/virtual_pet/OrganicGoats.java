package virtual_pet;

abstract class OrganicGoats extends VirtualGoats {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int penDirtLevel;

    public OrganicGoats(String name, String description) {
        super(name, description, TypeOfGoat.ORGANIC);
        this.hungerLevel = 10;
        this.thirstLevel = 10;
        this.penDirtLevel = 5;
    }

    @Override
    public void feedGoat() {
        hungerLevel -= 8;
    }

    @Override
    public void waterGoat() {
        thirstLevel -= 8;
    }

    @Override
    public void walkGoat() {

    }

    //GETTERS
    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getPenDirtLevel() {
        return penDirtLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }


}
