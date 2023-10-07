/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuankiet.mathutil.core;

/**
 *
 * @author TuanKiet
 */
//Đây là bộ thư viện chứa các hàm dùng trong tính toán
//Toán học, clone giống class Math bên JDK
/*Khi gọi làm thư việ dùng chung mà không cần nhớ gì
sau khi xử lý -> thư viện chứa static */
public class MathUtility {
    public static final double PI = 3.1415;
    
    // hàm tính n! = 1.2.3...n
    // n < 0 n > 20 không tính do 21! tràn kiểu long
    // không tính giai thừa âm!!
    // 0! = 1! = 1
    public static long getFactorial(int n){
        long result = 1;
        
        if(n < 0 || n >20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        
        if(n == 0 || n == 1) 
            return 1;
        
        for(int i = 2; i <= n; i ++) 
            result *= i;
        
        return result;
    }
}
