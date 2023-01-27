package taskqueue;
public class Substractor extends Task{
    public Substractor(double a, double b){
        super(a, b);
    }
    @Override
    public double execute(){
        return x - y;
    }
}
