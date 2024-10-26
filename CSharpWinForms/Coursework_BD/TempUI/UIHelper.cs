using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UIComponents
{
    internal class UIHelper
    {
        public static string OperatorToSQL(string op)
        {
            switch (op)
            {
                case "між": return "BETWEEN";
                case "<": return "<";
                case "≤": return "<=";
                case "=": return "=";
                case "≠": return "<>";
                case "≥": return ">=";
                case ">": return ">";
                default: return "";
            };
        }
    }
}
