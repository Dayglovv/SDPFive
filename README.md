# Strategy Pattern - Navigation System

## Introduction
This project demonstrates the Strategy design pattern using a navigation system.
The navigator can build a route to the same place in different ways: by car,
on foot or by bicycle. The way of building the route can be changed while the
program is running.

## Strategies
- CarStrategy - builds a route for a car (speed 60 km/h).
- WalkStrategy - builds a route for a pedestrian (speed 5 km/h).
- CycleStrategy - builds a route for a bicycle (speed 15 km/h).

Each strategy prints its own route and calculates the estimated travel time.

## Project Structure
- RouteStrategy.java - common strategy interface.
- CarStrategy.java - car route algorithm.
- WalkStrategy.java - walking route algorithm.
- CycleStrategy.java - cycling route algorithm.
- Navigator.java - context that stores the strategy and runs it.
- Main.java - client that demonstrates the program.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 or a compatible JDK is configured.
3. Open `src/navigation/Main.java` and run it.

Or from the command line:
```
javac -d out src/navigation/*.java
java -cp out navigation.Main
```

## How to Add a New Strategy
1. Create a class that implements RouteStrategy.
2. Implement the buildRoute() method.
3. Pass the new strategy to Navigator using setStrategy().

## Example Output
```
=== Car Strategy ===
Car route from Astana to Borovoe
Route: Highway and main roads.
Distance: 250.0 km
Estimated time: 4 h 10 min

=== Walking Strategy ===
Walking route from Astana to Borovoe
Route: Sidewalks and pedestrian paths.
Distance: 250.0 km
Estimated time: 50 h 0 min

=== Cycling Strategy ===
Cycling route from Astana to Borovoe
Route: Bicycle lanes and cycling paths.
Distance: 250.0 km
Estimated time: 16 h 40 min
```
