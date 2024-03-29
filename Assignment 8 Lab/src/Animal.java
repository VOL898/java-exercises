public abstract class Animal {

    protected String name;
    protected String gender;
    protected String genus;
    protected String mood;
    protected int speed;

    public String getMood() {
        return mood;
    }

    public abstract void generateMood( int animals, int maxOfAnimals );

    public Animal(String name, String gender, String genus, int speed ){
        this.name = name;
        this.gender = gender;
        this.genus = genus;
        this.speed = speed;
    }
    public String getName() { return name; }

    public String getGender() { return gender; }

    public String getGenus() { return genus; }

    public int getSpeed() {
        return speed;
    }

}
