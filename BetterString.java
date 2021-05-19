/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;
/**
 *
 * @author icg
 */
public class BetterString {
    
    public static boolean IsAlpha(String Str)
    {
        for (int i=0;i<Str.length();i++)
        {
            if(!Character.isLetter(Str.charAt(i)))
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String String1 = "Lamyaa";
        String String2 = "Zayed";
        
        String Str = LambdaStringCompare.BetterString (String1, String2, (S1,S2) -> String1.length() > String2.length());
        //String Str = LambdaStringCompare.BetterString (String1, String2, (S1,S2) -> true);
        System.out.println(Str);
        System.out.println(IsAlpha(Str));
        System.out.println(IsAlpha("Aa12Bn"));
    }
    
}
