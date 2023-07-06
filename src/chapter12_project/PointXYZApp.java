package chapter12_project;

public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(1.0, 2.0, 3.0);

        System.out.println(point.convertToString());

        point.setX(2.0);
        point.setY(3.0);
        point.setZ(9.0);

        System.out.println(point.convertToString());

        double x = point.getX();
        double y = point.getY();
        double z = point.getZ();

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}
