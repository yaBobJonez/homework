namespace Lab2_2;

public class Point
{
    protected double x, y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double GetX() => x;
    public double GetY() => y;
}