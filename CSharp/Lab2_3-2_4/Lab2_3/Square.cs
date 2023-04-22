namespace Lab2_3;

public class Square : Shape
{
    public (double x, double y) P1 { get; private set; }
    public (double x, double y) P2 { get; private set; }
    public (double x, double y) P3 { get; private set; }
    public (double x, double y) P4 { get; private set; }
    private double side;

    public Square((double, double) p1, (double, double) p2, (double, double) p3, (double, double) p4)
    {
        var dist = ((double x, double y) p1, (double x, double y) p2) =>
            Math.Sqrt(Math.Pow(p2.x - p1.x, 2) + Math.Pow(p2.y - p1.y, 2));
        if (dist(p1, p3) != dist(p2, p4)
            || dist(p1, p2) != dist(p2, p3)
            || dist(p2, p3) != dist(p3, p4)
            || dist(p3, p4) != dist(p4, p1)
            || dist(p1, p2) == 0
            || dist(p1, p3) == 0) throw new ArgumentException("Точки не утворюють квадрат!");
        P1 = p1;
        P2 = p2;
        P3 = p3;
        P4 = p4;
        side = dist(p1, p2);
    }

    public override double Area() => side * side;

    public override double Perimeter() => 4 * side;
}