package Calculator;

public class Model {
    public double x, y;
    public Model(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Model(double x, int y) {
        this.x = x;
        this.y = y;
    }
    public Model(int x, double y) {
        this.x = x;
        this.y = y;
    }
    public Model(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Model() {}
}
