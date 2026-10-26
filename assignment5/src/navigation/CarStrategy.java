package navigation;

public class CarStrategy implements RouteStrategy {

    private static final double SPEED_KM_PER_HOUR = 60;

    @Override
    public void buildRoute(String start, String destination, double distanceKm) {
        int minutes = (int) (distanceKm / SPEED_KM_PER_HOUR * 60);

        System.out.println("Car route from " + start + " to " + destination);
        System.out.println("Route: Highway and main roads.");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Estimated time: " + minutes / 60 + " h " + minutes % 60 + " min");
    }
}
