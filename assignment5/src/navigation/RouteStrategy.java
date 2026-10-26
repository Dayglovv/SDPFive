package navigation;

public interface RouteStrategy {
    void buildRoute(String start, String destination, double distanceKm);
}
