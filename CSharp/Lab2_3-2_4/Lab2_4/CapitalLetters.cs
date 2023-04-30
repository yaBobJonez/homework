namespace Lab2_4;

public class CapitalLetters : IChangingString
{
    public string Value;

    public CapitalLetters(string s)
    {
        if (!s.All(char.IsLetter) || s.ToUpper() != s)
            throw new ArgumentException("Рядок містить не лише великі літери.");
        Value = s;
    }

    public int Length { get => Value.Length; }
    public void Change(char c)
    {
        if (char.IsLetter(c) && char.IsUpper(c))
            Value = Value.Replace(new string(c,1), "");
    }

    public override string ToString() => Value;
}