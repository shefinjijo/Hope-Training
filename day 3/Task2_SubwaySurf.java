import java.util.*;
public class SubwaySurf {
    static final int LEFT = 0, CENTER = 1, RIGHT = 2;
    static final int SPAWN_DISTANCE = 10; // How far away obstacles appear

    static int playerLane = CENTER;
    static boolean isJumping = false;
    static boolean isGameOver = false;
    static int score = 0;
    static List<Obstacle> obstacles = new ArrayList<>();
    static Random random = new Random();

    static class Obstacle {
        int lane;
        int distance;

        Obstacle(int lane, int distance) {
            this.lane = lane;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- SUBWAY SURFERS ---");
        System.out.println("Controls: A (Left), D (Right), W (Jump), S (Stay/Wait)");

        spawnObstacle();

        while (!isGameOver) {
            renderState();
            System.out.print("Action: ");
            String input = scanner.nextLine().toLowerCase();
            handleInput(input);
            updateObstacles();
            if (random.nextInt(10) > 7) spawnObstacle();
            score++;
        }

        System.out.println("\nGAME OVER! Final Score: " + score);
        scanner.close();
    }

    static void handleInput(String input) {
        isJumping = false; 
        switch (input) {
            case "a": if (playerLane > LEFT) playerLane--; break;
            case "d": if (playerLane < RIGHT) playerLane++; break;
            case "w": isJumping = true; break;
            default: break; 
        }
    }

    static void updateObstacles() {
        for (int i = 0; i < obstacles.size(); i++) {
            Obstacle o = obstacles.get(i);
            o.distance--;
            if (o.distance == 0) {
                if (o.lane == playerLane && !isJumping) {
                    isGameOver = true;
                }
            }
        }
        obstacles.removeIf(o -> o.distance < 0);
    }

    static void spawnObstacle() {
        obstacles.add(new Obstacle(random.nextInt(3), SPAWN_DISTANCE));
    }

    static void renderState() {
        System.out.println("\n-------------------------");
        System.out.println("Score: " + score + " | Lane: " + 
            (playerLane == 0 ? "LEFT" : playerLane == 1 ? "CENTER" : "RIGHT") +
            (isJumping ? " [JUMPING]" : ""));
        for (int d = 5; d >= 0; d--) {
            String row = "| ";
            for (int l = 0; l < 3; l++) {
                boolean hasObstacle = false;
                for (Obstacle o : obstacles) {
                    if (o.lane == l && o.distance == d) hasObstacle = true;
                }
                
                if (d == 0 && playerLane == l) row += "P "; // Player
                else if (hasObstacle) row += "X ";         // Obstacle
                else row += ". ";                         // Empty track
            }
            System.out.println(row + "|");
        }
    }
}