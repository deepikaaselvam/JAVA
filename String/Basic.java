package String;

public class Basic {
    public static void firstTwoandlastTwoCharacter(String str)
    {
        System.out.println(str.substring(0,2)+str.substring(str.length()-2));
    }
    public static void main(String[] args) {
        String s="Deepika";
        firstTwoandlastTwoCharacter(s);
    }
    
}
