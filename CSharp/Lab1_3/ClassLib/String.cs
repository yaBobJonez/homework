namespace ClassLib
{
    public class String
    {
        private string str;

        public String(string str)
        {
            if (!str.All(Char.IsDigit)) throw new ArgumentException($"Рядок \"{str}\" не є числовим");
            this.str = str;
        }
        public String(int n){ this.str = n.ToString(); }
        public String() : this(0) {}
        public String(String o) : this(o.str) {}

        public int Length => this.str.Length;
        public string GetRaw() => this.str;
        public override string ToString() => this.str;
        public int Get(){ int.TryParse(this.str, out int n); return n; }
        public void Set(string str){ this.str = str; }
        public void Set(int n){ this.str = n.ToString(); }
        
        public void Reverse()
        {
            char[] t = this.str.ToCharArray();
            Array.Reverse(t);
            this.str = new string(t);
        }
        public void Append(char c)
        {
            if (!Char.IsDigit(c)) throw new ArgumentException($"Символ '{c}' не є цифрою");
            this.str += c;
        }

        public static String operator *(String s, int n) => new String(s.str + n.ToString());
        public static String operator *(int n, String s) => new String(n.ToString() + s.str);
        public static String operator +(String lhv, String rhv) => new String(lhv.str + rhv.str);
        public static bool operator ==(String lhv, String rhv) => lhv.str == rhv.str;
        public static bool operator !=(String lhv, String rhv) => lhv.str != rhv.str;
        public static String operator --(String s)
        {
            if(s.str != "") s = new String(s.str.Remove(s.Length - 1));
            return s;
        }
        public static bool operator true(String s) => s.str != "0";
        public static bool operator false(String s) => s.str == "0";
    }
};
