package pl.coderslab.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final static int ADD_A = 10;
    private final static int ADD_B = 10;
    private final static int ADD_RESULT = 20;

    @Test
    void add() {

        int a = 100_000;
        Calculator calculator = new Calculator();
        int add = calculator.add(ADD_A, ADD_B);
        assertEquals(ADD_RESULT, add);
    }
    @Test
    void given2and3_whenMultiply_resultShouldEquals6(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }
}