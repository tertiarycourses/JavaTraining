package com.tertiaryinfotech;

public class CharacterDemo {

    public static void main(String[] args) {

        char ch = 'a';
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };


        System.out.println(ch);

        for(int i=0;i<5;i++){
            System.out.println(charArray[i]);
        }

        System.out.printf("The second character of  is %c",charArray[1]);


    }
}
