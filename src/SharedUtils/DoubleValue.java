package SharedUtils;

public class DoubleValue implements Value {
    public double value;
    public DoubleValue(double value){
        this.value = value;
    }
    @Override
    public String asString() {
        return String.valueOf(this.value);
    }
    @Override
    public int asInt() {
        return (int)this.value;
    }
    @Override
    public double asDouble() {
        return this.value;
    }
    @Override
    public boolean asBool() {
        if(this.value == 0.0) return false;
        return true;
    }
}
