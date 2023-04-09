namespace Lab2_1;

public class String
{
    public string Value { protected set; get; }
    public int Length
    {
        get => Value.Length;
    }
    public String(string value) => Value = value;
}