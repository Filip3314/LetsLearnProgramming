public class BottlesOfBeer {
    public static void main(String[] args) {
        int i = 99;
        while(i > 0) {
            System.out.print(i + " bottles of beer on the wall...");
            i = i - 1;
            System.out.println("Take one down, pass it around, " + i + " bottles of beer of the wall ");
        }
    }
}