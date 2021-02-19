public class Main {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double raidius) {
        if(raidius >= 0) {
            return Math.PI * Math.pow(raidius,2);
        } else {
            return -1.0;
        }
    }

    public static double area(double x, double y) {
        if(x >= 0 && y >= 0) {
            return x * y;
        } else {
            return -1.0;
        }
    }
}
