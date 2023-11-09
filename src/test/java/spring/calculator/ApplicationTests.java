package spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculator() {
        //given
        //when
        calculator.add(10,5);
        calculator.sub(10,5);
        calculator.mul(10,5);
        calculator.div(10,5);
        //then
    }

}
