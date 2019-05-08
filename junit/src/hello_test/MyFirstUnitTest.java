package hello_test;
import hello_pack.MyFirstUnit;
import static org.junit.jupiter.api.Assertion.assertEquals;
imort org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;note
public class MyFirstUnitTest{

       @Test
       public void testShow(){
         
       MyFirstUnit myunit=new MyFirstUnit();

       assertEquals("Hello World",String, myunit.show()); 
   }


}