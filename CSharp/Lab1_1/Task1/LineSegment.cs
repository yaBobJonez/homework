namespace Task1;

public class LineSegment
{
    public (int x, int y) Begin;
    public (int x, int y) End;

    public LineSegment((int x, int y) begin, (int x, int y) end)
    {
        this.Begin = begin;
        this.End = end;
    }

    public double GetLength()
    {
        return Math.Round(Math.Sqrt( Math.Pow(End.x - Begin.x, 2) + Math.Pow(End.y - Begin.y, 2) ), 2);
    }

    public double GetAngleRelToOY()
    {
        double hor = Math.Abs(End.x - Begin.x);
        double ver = Math.Abs(End.y - Begin.y);
        return Math.Round(Math.Atan2(hor, ver)*(180/Math.PI), 2);
    }
}