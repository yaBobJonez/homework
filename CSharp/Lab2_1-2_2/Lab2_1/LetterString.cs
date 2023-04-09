using System.Text.RegularExpressions;

namespace Lab2_1;

public class LetterString : String
{
    public LetterString(string str) : base(str)
    {
        if (Regex.IsMatch(Value, @"[^a-zA-Zа-яА-Яіїґєёéèêęíìîáàâãąäóòôöúùûçćś]", RegexOptions.IgnoreCase))
            throw new ArgumentException("Рядок містить не лише літери");
    }

    public void Rsh()
    {
        if(Value=="") return;
        Value = Value[Length - 1] + Value.Remove(Length - 1);
    }
}