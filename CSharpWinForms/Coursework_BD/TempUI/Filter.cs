using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UIComponents
{
    public interface Filter
    {
        bool IsUsed { get; }
        string Query { get; }
        void Clear();
    }
}
