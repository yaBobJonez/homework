namespace Lab1_4;

public class CharArray
{
    private char[][] chars;
    private int vowelChars;
    public int vowelCount
    {
        get => vowelChars;
        private set => vowelChars = value;
    }

    public CharArray(char[][] chars)
    {
        this.vowelCount = 0;
        foreach (char[] cs in chars)
        {
            if (cs.Length != chars.Length) throw new ArgumentException("Матриця має бути квадратною");
            foreach(char c in cs) if("аеєиіїоуюяaeiouy".Contains(Char.ToLower(c))) this.vowelCount++;
        }
        this.chars = chars;
    }

    public CharArray(string[] strings) : this(strings.Select(s => s.ToCharArray()).ToArray()){}
    public CharArray(string str) : this(str.Split("\n")){}

    public string this[int diag]
    {
        get
        {
            string s = "";
            if(diag < 0 && Math.Abs(diag)%2==0) for(int i = chars.Length-1; i >= 0; i--) s += chars[i][i];
            else if(diag < 0) for(int i = chars.Length-1; i >= 0; i--) s += chars[i][chars.Length-i-1];
            else if(diag%2==0) for(int i = 0; i < chars.Length; i++) s += chars[i][i];
            else for(int i = 0; i < chars.Length; i++) s += chars[i][chars.Length-i-1];
            return s;
        }
    }

    public override string ToString()
    {
        string s = "";
        foreach (char[] cs in chars)
        {
            s += "( ";
            foreach (char c in cs) s += c + " ";
            s += ")\n";
        }
        return s.Remove(s.Length - 1);
    }
}