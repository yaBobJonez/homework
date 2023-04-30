namespace Lab2_4;

public class SpecialCharacters : IChangingString
{
    public string Value;

    public SpecialCharacters(string s)
    {
        if (s.Any(char.IsLetterOrDigit)) throw new ArgumentException("Рядок містить не лише спец. символи.");
        Value = s;
    }

    public int Length { get => Value.Length; }
    public void Change(char c)
    {
        if(!char.IsLetterOrDigit(c))
            Value = Value.Replace(new string(c, 1), new string(c, 3));
    }

    public override string ToString() => Value;
}