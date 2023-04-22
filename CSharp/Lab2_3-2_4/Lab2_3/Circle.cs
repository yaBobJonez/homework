namespace Lab2_3;

public class Circle : Shape
{
    public double Radius { get; private set; }

    public Circle(double radius)
    {
        if (radius == 0) throw new ArgumentException("Коло не може бути точкою!");
        this.Radius = Math.Abs(radius);
    }

    public override double Area() => Math.PI * (Radius * Radius);

    public override double Perimeter() => 2 * Math.PI * Radius;
}