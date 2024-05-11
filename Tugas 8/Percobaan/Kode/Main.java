public class Main {
    public static void main(String[] args) {
        // Upcasting dari HeroMagic ke Hero
        HeroMagic heroMagic = new HeroMagic("Merlin", 150);
        Hero heroUp = heroMagic;

        // Downcasting dari Hero ke HeroMagic
        HeroMagic heroMagicDown = (HeroMagic) heroUp;

        // Memanggil metode display dari HeroMagic
        heroMagicDown.display();

        // Memanggil metode dari kelas Hero
        System.out.println("Name: " + heroMagicDown.getName());
        System.out.println("Health: " + heroMagicDown.getHealth());
        System.out.println("Power: " + heroMagicDown.getPower());
    }
}
