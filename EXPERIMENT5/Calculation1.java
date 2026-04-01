
public class Calculation1 extends
        Calculation {

    public void
            multiplication(int x, int y) {
        z = x * y;
        System.out.println("the product of the given numbers:" + z);
    }

    public static void main(String[] args) {
        int a = 30, b = 20;
Calculation1 demo=new 
Calculation1();
demo.addition(a,b);
demo.Subtraction(a,b);
demo.multiplication(a,b);
    }

}
