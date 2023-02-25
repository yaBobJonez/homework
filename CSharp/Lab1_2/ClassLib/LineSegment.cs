namespace ClassLib
{
    public class LineSegment
    {
        private (int x, int y) begin, end;
        
        public LineSegment((int x, int y) begin, (int x, int y) end) { this.begin = begin; this.end = end; }
        public LineSegment(int x1, int y1, int x2, int y2) : this((x1, y1), (x2, y2)) { }
        public LineSegment() : this(0, 0, 1, 0) { }
        public LineSegment(LineSegment o) : this(o.begin, o.end) { }
        
        public (int x, int y) getBegin() => begin;
        public (int x, int y) getEnd() => end;
        
        public void set((int x, int y) begin, (int x, int y) end) { this.begin = begin; this.end = end; }
        public void set(int x1, int y1, int x2, int y2) { set((x1, y1), (x2, y2)); }
        public void setBegin((int x, int y) begin) { this.begin = begin; }
        public void setBegin(int x, int y) { setBegin((x, y)); }
        public void setEnd((int x, int y) end) { this.end = end; }
        public void setEnd(int x, int y) { setEnd((x, y)); }
        
        public double length() => Math.Round( Math.Sqrt(Math.Pow(end.x - begin.x, 2) + Math.Pow(end.y - begin.y, 2)), 2 );
        public double getAngleRelToOY() => Math.Round( Math.Atan2(Math.Abs(end.x - begin.x), Math.Abs(end.y - begin.y)) * (180/Math.PI), 2 );
        
        public override string ToString() => $"({begin.x}, {begin.y})\u2192({end.x}, {end.y})";
    }
};
