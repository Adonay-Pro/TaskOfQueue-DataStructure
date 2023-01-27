package taskqueue;
public class Divider extends Task {
    public Divider(double a, double b){
        super(a, b);
    }
    @Override
    public double execute(){
        return x / y;
    }
}
