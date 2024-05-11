public class HeroIntel extends Hero {
    public String type;

    public HeroIntel(String name, double health) {
        super(name, health);
        this.type = "Intel";
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}