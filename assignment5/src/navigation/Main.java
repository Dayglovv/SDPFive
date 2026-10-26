package navigation;

public class Main {

    public static void main(String[] args) {

        Navigator navigator = new Navigator(new CarStrategy());

        System.out.println("=== Car Strategy ===");
        navigator.navigate("Astana", "Borovoe", 250);

        System.out.println();

        System.out.println("=== Walking Strategy ===");
        navigator.setStrategy(new WalkStrategy());
        navigator.navigate("Astana", "Borovoe", 250);

        System.out.println();

        System.out.println("=== Cycling Strategy ===");
        navigator.setStrategy(new CycleStrategy());
        navigator.navigate("Astana", "Borovoe", 250);
    }
}
