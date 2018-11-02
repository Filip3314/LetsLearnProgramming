public class BottlesOfBeer {
    public static void main(String[] args) {
        int i = 99;
        while(i > 0) {
            print(i + " bottles of coke on the wall...");
            i = i - 1;
            println("Take one down, pass it around, " + i + " bottles of code of the wall ");
        }
    }
}