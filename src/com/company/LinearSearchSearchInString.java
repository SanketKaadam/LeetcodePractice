package com.company;

public class LinearSearchSearchInString {
    public static void main(String[] args){
        String name = "Sankeat";
        char target= 'a';
        System.out.println(searchInRange(name,target));
        System.out.println(searchInRange2(name,target));
    }

    static int searchInRange(String name, char target){
        for (int i=0; i<name.length(); i++){
            if (name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    static boolean searchInRange2(String name, char target){
        for (char ch : name.toCharArray()){     // The java string toCharArray() method converts the given string into a sequence of characters.
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
