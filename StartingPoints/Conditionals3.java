public class Conditonals3 {
    public static void main(String[] args) {
        int foo = 6;
        int bar = 7;
     
        if(foo == 4) {
            println("happy ");
        }
        else if(foo > 4) {
            println("merry ");
        }
        else {
            println("feliz ");
        }
     
        if(bar % 2 == 1) {
            if(foo + bar > 6) {
                println("easter!");
            }
            else {
                println("birthday!");
            }
            
        }
        else {
            println("Leif Erikson Day!");
        }
     
    }
}