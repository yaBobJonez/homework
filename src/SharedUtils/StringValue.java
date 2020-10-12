package SharedUtils;

public class StringValue implements Value {
    public String value;
    public StringValue(String value){
        this.value = value;
    }
    @Override
    public String asString() {
        return this.value;
    }
    @Override
    public int asInt() {
        try{
            return Integer.parseInt(this.value);
        } catch(Exception e){
            System.err.println("Can't cast string "+this.value+" to int.");
            return 0;
        }
    }
    @Override
    public double asDouble() {
        try{
            return Double.parseDouble(this.value);
        } catch(Exception e){
            System.err.println("Can't cast string "+this.value+" to double.");
            return 0.0;
        }
    }
    @Override
    public boolean asBool() {
        try{
            return Boolean.parseBoolean(this.value);
        } catch(Exception e){
            System.err.println("Can't cast string "+this.value+" to boolean.");
            return false;
        }
    }
}
