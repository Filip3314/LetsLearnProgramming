public class StanfordAdmission {
    public static void main(String[] args) {
        boolean Yoda = standfordApplication(4.0, false, false);
        if(Yoda) println("Yoda gets into Standford!");
        else println("Yoda does not get into Standford!");
    
        boolean Leia = standfordApplication(4.0, false, true);
        if(Leia) println("Leia gets into Standford!");
        else println("Leia does not get into Standford!");
    
        boolean Kylo = standfordApplication(3.5, false, false);
        if(Kylo) println("Kylo gets into Standford!");
        else println("Kylo does not get into Standford!");
    
        boolean Rey = standfordApplication(3.34, true, false);
        if(Rey) println("Rey gets into Standford!");
        else println("Rey does not get into Standford!");
    }
 
    public static boolean standfordApplication(double GPA, boolean FRC, boolean vader)
    {
        //your code here
        return false;
    }
}