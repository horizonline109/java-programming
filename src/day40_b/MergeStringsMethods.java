package day40_b;
import java.util.*;

public class MergeStringsMethods {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "defghi";
        System.out.println(mergeString(str1, str2));
    }

    public static String mergeString(String str1, String str2){
        String result = "";
            for(int i = 0; i < str1.length() || i < str2.length(); i++){
                if(i < str1.charAt(i)){
                    result += str1.charAt(i);
                }
                if(i < str2.length()){
                    result += str2.charAt(i);
                }

            }
        return result;
        }

    }

