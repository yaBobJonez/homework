package SharedUtils;

public class BooleanValue implements Value {
    public boolean value;
    public BooleanValue(boolean value){
        this.value = value;
    }
    @Override
    public String asString() {
        return String.valueOf(this.value);
    }
    @Override
    public int asInt() {
        if(this.value) return 1;
        return 0;
    }
    @Override
    public double asDouble() {
        if(this.value) return 1.0;
        return 0.0;
    }
    @Override
    public boolean asBool() {
        return this.value;
    }
}
