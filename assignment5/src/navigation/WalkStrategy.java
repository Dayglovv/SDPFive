package navigation;

public class WalkStrategy implements RouteStrategy {

    private static final double SPEED_KM_PER_HOUR = 5;

    @Override
    public void buildRoute(String start, String destination, double distanceKm) {
        int minutes = (int) (distanceKm / SPEED_KM_PER_HOUR * 60);

        System.out.println("Walking route from " + start + " to " + destination);
        System.out.println("Route: Sidewalks and pedestrian paths.");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Estimated time: " + minutes / 60 + " h " + minutes % 60 + " min");
    }
}
