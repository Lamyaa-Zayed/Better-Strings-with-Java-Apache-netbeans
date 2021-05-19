/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;

//interface CompareString
//{
//    boolean Compare (String S1,String S2);
//}
/**
 *
 * @author icg
 */
public class LambdaStringCompare {
    
    public static String BetterString (String S1, String S2, CompareString Cmp)
    {
        if(Cmp.Compare(S1, S2))
        {
            return S1;
        }
        else
        {
            return S2;
        }
    }
    
}
