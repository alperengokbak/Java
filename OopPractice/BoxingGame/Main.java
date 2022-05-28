package OopPractice.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("Mike Tyson", 25, 100, 85, 100);
        Boxer boxer2 = new Boxer("Muhammed Ali", 15, 150, 90, 50);

        Ring match1 = new Ring(boxer1, boxer2, 80, 90);

        match1.fight();
    }
}
