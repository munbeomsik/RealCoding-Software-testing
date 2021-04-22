import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트

    @Test
    public void testAdd() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        /* 테스트 코드 입력*/
        assertTrue(result == 20);
        assertFalse(result == 19);
    }

    @Test
    public void testSubtact(){
        customCalculator = new CustomCalculator();
        int m_result = customCalculator.subtract(30,10);

        /* 테스트 코드 입력*/
        assertTrue(m_result == 20);
    }

    @Test
    public void testMultiply(){
        customCalculator = new CustomCalculator();
        assertTrue(customCalculator.multiply(2,3) == 6);
    }

    @Test
    public void testDivide(){
        customCalculator = new CustomCalculator();
        assertTrue(customCalculator.divide(25,5) == 5);
    }

}