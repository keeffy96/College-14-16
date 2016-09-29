public class Point
{
    private double x;
    private double y;
    
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public void setX(double newX)
    {
        this.x = newX;
        System.out.println("The x-cord is now " + this.x);
    }
    
    public double getY()
    {
        return this.y;
    }
    
    public void setY(double newY)
    {
        this.y = newY;
        System.out.println("The y-cord is now " + this.y);
    }
    
    public double getDistance(Point p)
    {
        //d=sqr((x2-x1)^2+(y2-y1)^2)
        return Math.sqrt((Math.pow((this.x-p.x),2))+(Math.pow((this.y-p.y),2)));
    }
    
    public static double getDistance(Point a, Point b)
    {
        return Math.sqrt((Math.pow((a.x-b.x),2))+(Math.pow((a.y-b.y),2)));
    }
}