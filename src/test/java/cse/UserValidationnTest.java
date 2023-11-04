package cse;
import org.testng.Assert;

import org.testng.annotations.Test;
public class UserValidationnTest {
     
     @Test
     public void testcase1() {
    	 UserValidationn uv=new UserValidationn();
    	 Assert.assertEquals(true,uv.check("yogi","yogi@2020"));
     }
     @Test
     public void testcase2() {
    	 UserValidationn uv=new UserValidationn();
    	 Assert.assertEquals(false,uv.check("yogi","yogi@020"));
     }
     @Test
     public void testcase3() {
    	 UserValidationn uv=new UserValidationn();
    	 Assert.assertEquals(false,uv.check("yogi","yogi@220"));
     }
     @Test
     public void testcase4() {
    	 UserValidationn uv=new UserValidationn();
    	 Assert.assertEquals(false,uv.check("yogi","yogi@202"));
     }
}
