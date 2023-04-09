namespace Lab2_2;

public class Circle : Point
{
    protected double MinorAxis;
    public double Radius
    {
        get => MinorAxis;
        protected set => MinorAxis = value;
    }

    public Circle(double x, double y, double radius) : base(x, y)
    {
        this.Radius = Math.Abs(radius);
        if (radius == 0.0) throw new ArgumentException("Коло не може бути точкою");
    }

    public double Area
    {
        get => Math.PI * (this.Radius * this.Radius);
    }
    
}