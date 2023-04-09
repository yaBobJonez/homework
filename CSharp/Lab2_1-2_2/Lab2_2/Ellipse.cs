namespace Lab2_2;

public class Ellipse : Circle
{
    public double MajorAxis { protected set; get; }
    public (double x, double y) Focus1 { protected set; get; }
    public (double x, double y) Focus2 { protected set; get; }
    public double Eccentricity { protected set; get; }
    public bool IsVertical { protected set; get; }

    public Ellipse(double x, double y, double co_vertexDistance, double vertexDistance)
        : base(x, y, co_vertexDistance)
    {
        this.MajorAxis = Math.Abs(vertexDistance);
        this.IsVertical = Math.Abs(vertexDistance) < Math.Abs(co_vertexDistance);
        if (vertexDistance == 0.0) throw new ArgumentException("Еліпс не може бути відрізком");
        double dtf = GetDistanceToFoci();
        this.Focus1 = IsVertical? (x, dtf+y) : (dtf+x, y);
        this.Focus2 = IsVertical? (x, -dtf+y) : (-dtf+x, y);
        this.Eccentricity = IsVertical ? (dtf / co_vertexDistance) : (dtf / vertexDistance);
    }

    public double Area
    {
        get => Math.PI * this.MajorAxis * this.MinorAxis;
    }

    public double GetDistanceToFoci()
    {
        return IsVertical
            ? Math.Sqrt(MinorAxis * MinorAxis - MajorAxis * MajorAxis)
            : Math.Sqrt(MajorAxis * MajorAxis - MinorAxis * MinorAxis);
    }
}