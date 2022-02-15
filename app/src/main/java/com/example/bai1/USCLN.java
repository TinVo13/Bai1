package com.example.bai1;

public class USCLN {
    private int a;
    private int b;
    public int TimUSCLN(int a, int b){
        while (a*b != 0){
            if (a > b){
                a %= b; // a = a % b
            }else{
                b %= a;
            }
        }
        return a + b;
    }
}
