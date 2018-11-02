public class Methods {
    public static void main(String[] args){
        int x = myMethod(2, 6);

        System.out.println("x = " + x);
    }
    public static int myMethod(int a, int b) {
        int product = a * b;
        System.out.println("a = " + a + ", b = " + b + ", product = " + product);
        return product;
    }
}