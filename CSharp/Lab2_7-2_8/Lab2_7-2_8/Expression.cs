namespace Lab2_7_2_8;

public class Expression
{
    public double A { get; set; }
    public double B { get; set; }
    public double C { get; set; }

    public Expression(double a, double b, double c)
    {
        A = a;
        B = b;
        C = c;
    }
    public Expression() : this(1, 1, 1){}

    public double Eval()
    {
        if (A*B+2 <= 0) throw new LnNotGreaterThanZeroException();
        if (C == 0) throw new DivideByZeroException("Знаменник \"c\" дорівнює нулю!");
        double numerator = Math.Log(A*B+2)*C;
        double denominator = 41-B/C+1;
        if(denominator == 0) throw new DivideByZeroException("Знаменник \"41-b/c+1\" дорівнює нулю!");
        return numerator / denominator;
    }

    public override string ToString() => "ln("+A+" * "+B+" + 2) * "+C
                                         +"\n-----------------------\n"
                                         +"41 - "+B+"/"+C+" + 1";
}