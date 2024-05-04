public class Edge {
    int l, r;
    public Edge(int l, int r) {
        this.l = l;
        this.r = r;
    }
    public boolean isIncidental(int v) {
        return v == l || v == r;
    }
    public int traverse(int v) {
        if (v == l) return r;
        else if (v == r) return l;
        else return -1;
    }
    public String toString() {
        return "(" + l + ", " + r + ")";
    }
}
