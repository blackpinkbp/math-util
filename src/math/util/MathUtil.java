/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import static hungnp.util.MathUtility.*;
//lệnh mới từ JDK 8-5, khai báo sẵn hàm static
//Ở dưới gọi hàm static ko cần chấm, giống C. chỉ ap dụng cho static
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
        long actual=getFactorial(5);
        System.out.println("Excepted: "+excepted+"; Actual: "+actual);
        //excepted 720 if tinh 6!
        System.out.println("6!: "+getFactorial(6));
        
        //excepted 1 if tinh 0
        System.out.println("0!: "+getFactorial(0));
        
        //excepted IllegalArgumentException if tinh -5!
        System.out.println("-5!: "+getFactorial(-5));
        
        //in thử PI coi có giống Math.PI
        System.out.println("PI: "+PI);
    }
    
}
//muốn kết luận hàm ổn thì phải nhìn bằng mắt kết quả chạy và so sánh với kì vọng
//làm từng trường hợp chạy hàm - test case
//ổn nhưng mất sức

//Nâng cao: dùng xanh - đỏ để kết luận
//nếu xanh -> mọi tình huống ổn
// nếu  đỏ, 1 đỏ coi như hàm toang
// xài thêm 1 framework, unit test tên chung
//JUNIT, TESTING, ... là frammework cụ thể để test các hàm 1 cách hiệu quả
// có thể tích hợp vào 1 quy trình làm phần mềm lớn hơn - CI/CT/CD/DEVOPS