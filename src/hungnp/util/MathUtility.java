/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungnp.util;

/**
 *
 * @author Win 10
 */
public class MathUtility {
    //class nay fake class Math cua JDK
    // Math cua JDK co .abs() .sqrt() .sin() .PI
    //chung la static, vi la thu vien dung chung
    public static final double PI=3.1415;
    // n! = 1.2.3.4...n
    //0!=1
    //ko tinh giai thua am
    //21! lon, tràn kiểu long, chứa ko nổi
    //int:toi da 2.x ty
    //hàm giai thừa viết trong giới hạn đầu vào từ 0..20
//    public static long getFactorial(int n){
//        if(n<0 || n>20)
//            throw new IllegalArgumentException("n must be between 0..20");
//        if(n==0 || n==1)
//            return 1;
//        //ko xài else, có else trừ điểm
//        long result = 1;
//        //n=2 -> 20
//        for (int i = 2; i <= n; i++) {
//            result *=i;
//        }
//        return result;
//    }
    
    // viết đệ quy
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n==0 || n==1)
            return 1;
        return n*getFactorial(n-1);
    }
    //Mình minh họa khái niệm refactoring - tối ưu code, chỉnh sửa lại code cho tốt hơn
    // và minh họa khái niệm Regression test- test hồi quy, test lại những gì đã từng test
    //để check xem code còn XANH như ngày xưa không sau khi đã sửa code
    
}
