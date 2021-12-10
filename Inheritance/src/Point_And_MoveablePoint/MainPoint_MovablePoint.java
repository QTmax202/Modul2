package Point_And_MoveablePoint;


public class MainPoint_MovablePoint {
    public static void main(String[] args) {
//        Point point = new Point(2,3);
        MovablePoint point1 = new MovablePoint(4,5,2,3);
        System.out.println(point1);
        point1.move();
        System.out.println(point1);
    }
}
