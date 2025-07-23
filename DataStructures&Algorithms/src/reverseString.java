//Create a function that reverses a string:

package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class reverseString {
    public static void main(String[] args) {
        String input = "Reverse this String!";
        String reversed = reverseHalfWay(input);
        System.out.println(reversed);
    }

    public static String reverseAString(String str) {
        String reverse = "";
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseUsingArrayList(String str) {
        ArrayList<Character> arrayList=new ArrayList<>();
        char[] charArray=str.toCharArray();
        for(Character c:charArray){
            arrayList.add(c);
        }
        Collections.reverse(arrayList);
        StringBuilder result=new StringBuilder();
        for(char c:arrayList){
            result.append(c);
        }
        return result.toString();
    }
    public static String reverseHalfWay(String str) {
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length/2;i++){
            char temp=charArray[i];
            charArray[i]=charArray[charArray.length-i-1];
            charArray[charArray.length-i-1]=temp;
        }
        StringBuilder result=new StringBuilder();
        for(char c:charArray){
            result.append(c);
        }
        return result.toString();
    }
}
