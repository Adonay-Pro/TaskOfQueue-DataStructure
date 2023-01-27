package taskqueue;
public class Task {
   protected double x, y;
public Task(double a, double b) {
this.x = a;
this.y = b;
}

public double execute() {
throw new UnsupportedOperationException();
}

public static Task getInstance(String oper, double a, double b){
switch(oper){
    case "+" -> {
        return new Adder(a,b);
           }
    case "*" -> {
        return new Multiplier(a,b);
           }
    case "/" -> {
        return new Divider(a,b);
           }
    case "-" -> {
        return new Substractor(a, b);
           }
    default -> {
        return null;
           }
    }

    }
}






