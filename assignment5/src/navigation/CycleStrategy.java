package navigation;

public class CycleStrategy implements RouteStrategy {

    private static final double SPEED_KM_PER_HOUR = 15;

    @Override
    public void buildRoute(String start, String destination, double distanceKm) {
        int minutes = (int) (distanceKm / SPEED_KM_PER_HOUR * 60);

        System.out.println("Cycling route from " + start + " to " + destination);
        System.out.println("Route: Bicycle lanes and cycling paths.");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Estimated time: " + minutes / 60 + " h " + minutes % 60 + " min");
    }
}
