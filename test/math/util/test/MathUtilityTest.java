/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util.test;

import static hungnp.util.MathUtility.*;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Win 10
 */
public class MathUtilityTest {
    
    @Test //@test biến hàm thahf public static void main
    //cách đặt tên hàm sẽ nói lên mục tiêu test hàm. Có nhiều quy tắc đặt tên
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(720, getFactorial(6));//xanh vì mình tính ra như kì vọng
        assertEquals(1, getFactorial(0));
    }
    //cần test xem có ném về ngoại lệ hay không
    //nếu đúng là IllegalArgumentException trong tình huống -5! thì có màu xanh
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        getFactorial(-5);
    }
//    ngoại lệ không phải value để so sánh, chỉ có thể kiểm tra coi nó xuất hiện hay không
    
   
    
}
