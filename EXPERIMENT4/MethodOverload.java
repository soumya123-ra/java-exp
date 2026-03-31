public class MethodOverload{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        System.out.println("Sum of 2 integers: " + mo.add(5, 10));
        System.out.println("Sum of 3 integers: " + mo.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + mo.add(5.5, 10.5));
    }
}