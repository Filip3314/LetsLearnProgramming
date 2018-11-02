 public class Conditionals4 {
    public static void main(String[] args) {
    
        //Voldemort
        print("Voldemort ");
        isASuperHero(true, false, true);
    
        //Thor
        print("Thor ");
        isASuperHero(false, true, true);
    
        //Batman
        print("Batman ");
        isASuperHero(false, true, false);
    
        //Squidward
        print("Squidward ");
        isASuperHero(false, false, false);
    }
    
    public static void isASuperHero(boolean canFly, boolean isGood, boolean isStrong)
    {
        if(/*has a super power (strength or flight)*/) {
            if(/*must not be evil*/) {
                println("is a super hero.");
            }
            else {
                println("is a super villian.");
            }
        }
        else {
            if(!isGood) {
                println("is mean but otherwise ");
            }
            println("is a normal person.");
        }
    
    }
}