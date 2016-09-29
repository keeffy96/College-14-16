public class PointTest
{
    public static void main(String args [])
    {
        Point home = new Point();
        Point destination = new Point();
        Point distance = new Point();
        
        home.setX(10);
        home.setY(10);
        destination.setX(5);
        destination.setY(5);
        
        System.out.println("\n" +distance.getDistance(home, destination));
        
        System.out.println("\n" +distance.getDistance(home));
    }
}