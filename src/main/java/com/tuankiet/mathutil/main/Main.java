/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuankiet.mathutil.main;

import com.tuankiet.mathutil.core.MathUtility;

/**
 *
 * @author TuanKiet
 */
public class Main {
    public static void main(String[] args) {
        //PE !!!
        //test thử hàm mình vừa viết tính giai thừa
        // có  đúng không
        // chuẩn bị bộ data test, test case
        //# Test case 1: Check if getFactorial() run well with n=0
        //Test Procedures/Steps:
        //              Given n = 0
        //              Invoke getFactorial(n = 0)
        
        //Expected Result: 1;  //0! == 1?????
        long expected = 1; //em hy vọng 1 được trả về 
        int n = 0;         //nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(n);   //chạy hàm mới biết
        
        //in ra và tự kết luận có giống kỳ vọng hay không?
        System.out.println(n + "! | expected = " + expected +
                                " | actual = " + actual);
        
        //# Test case 2: Check if getFactorial() run well with n=1
        //Test Procedures/Steps:
        //              Given n = 1
        //              Invoke getFactorial(n = 1)
        
        //Expected Result: 1;  //1! == 1?????
        System.out.println("1! | expected = 1"+
                                " | actual = " + MathUtility.getFactorial(1));
    }
}
