/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import hungnp.util.MathUtility;

/**
 *
 * @author Win 10
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ta test thử hàm của ta
        // dùng mắt để so sánh kết quả thực tế khi chạy và kết quả mong đợi
        long excepted= 120;//ta mong nhận 120 nếu gọi hàm 5!
        long actual=MathUtility.getFactorial(5);
        System.out.println("Excepted: "+excepted+"; Actual: "+actual);
        //excepted 720 if tinh 6!
        System.out.println("6!: "+MathUtility.getFactorial(6));
        
        //excepted 1 if tinh 0
        System.out.println("0!: "+MathUtility.getFactorial(0));
        
        //excepted IllegalArgumentException if tinh -5!
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
    }
    
}
