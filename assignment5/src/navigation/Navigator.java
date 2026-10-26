package navigation;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String start, String destination, double distanceKm) {
        if (strategy == null) {
            System.out.println("Strategy is not selected!");
            return;
        }
        strategy.buildRoute(start, destination, distanceKm);
    }
}
