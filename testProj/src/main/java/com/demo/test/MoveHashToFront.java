package com.demo.test;

/**
 * Rajyalaxmi_Thumarada on 08-05-2023
 */
public class MoveHashToFront {

    public static void main(String args[]) {
        moveAllHashesToFront("Move#Hash#To#Front", 18);
    }

    private static void moveAllHashesToFront(String s, int n) {
        String temp1 = "";
        String temp2 = "";
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == '#') {
                temp1 = temp1 + s.charAt(i);
            } else {
                temp2 = temp2 + s.charAt(i);
            }
        }
        String result  = temp1.concat(temp2);
        System.out.println(result);
    }
}
