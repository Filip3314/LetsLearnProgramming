public class WhileLoops {
    public static void main(String[] args) {
        int i = 3;
        int j = 365;
        int count = 0;
        int product = 0;
        while(product<j) {
            product += i;
            count ++;
        }
     
        count --; //we overshoot j, so lets subtract 1
     
        println(i + " goes into " +  j + " wholly " + count + " times");
    }
}