public class PhysicsAssistant {

    // Sabit tanımlama
    public final static double GRAVITY = 9.8;

    // 1) Hız = s / t
    public static double speed(double distance, double time) {
        return distance / time;
    }

    // 2) İvme = v / t
    public static double acceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // 3) Kuvvet = m x a
    public static double force(double mass, double accelerations) {
        return mass * acceleration;
    }

    // 4) İş = F x d
    public static double work(double force, double distance) {
        return distance * force;
    }

    // 5) Güç = W / t
    public static double power(double work, double time) {
        return work / time;
    }

    // 6) Kinetik Enerji = 0.5 x m x v^2
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7) Potansiyel Enerji = m x g x h
    public static double potentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // 8) Momentum = m x v
    public static double momentum(double mass, double velocity) {
        return mass * velocity;
    }

    // Test amaçlı main metodu
    public static void main(String[] args) {

        System.out.println("Hız: " + speed(100, 5) + " m/s");
        System.out.println("İvme: " + acceleration(20, 4) + " m/s^2");
        System.out.println("Kuvvet: " + force(10, 3) + " N");
        System.out.println("İş: " + work(50, 10) + " J");
        System.out.println("Güç: " + power(500, 5) + " W");
        System.out.println("Kinetik Enerji: " + kineticEnergy(70, 5) + " J");
        System.out.println("Potansiyel Enerji: " + potentialEnergy(60, 10) + " J");
        System.out.println("Momentum: " + momentum(80, 3) + " kg·m/s");
    }
}
