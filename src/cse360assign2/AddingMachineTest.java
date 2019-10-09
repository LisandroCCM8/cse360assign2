package cse360assign2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddingMachineTest {

    @Test
    void testGetTotal()
    {
        AddingMachine calculator = new AddingMachine();
        assertEquals(0, calculator.getTotal());
    }

    @Test
    void testAdd()
    {
        AddingMachine calculator = new AddingMachine();
        calculator.add(4);
        assertEquals(4, calculator.getTotal());
    }

    @Test
    void testSubtract()
    {
        AddingMachine calculator = new AddingMachine();
        calculator.subtract(4);
        assertEquals(-4, calculator.getTotal());
    }

    @Test
    void testToString()
    {
        AddingMachine calculator = new AddingMachine();
        calculator.add(4);
        calculator.subtract(2);
        String obj1 = calculator.toString();
        String obj2 = "0 + 4 - 2 ";
        assertEquals(obj2, obj1);
    }

    @Test
    void test3Inputs()
    {
        AddingMachine calculator = new AddingMachine();
        calculator.add(4);
        calculator.subtract(2);
        calculator.add(5);
        String obj1 = calculator.toString();
        String obj2 = "0 + 4 - 2 + 5 ";
        assertEquals(obj2, obj1);
    }

    @Test
    void testClear()
    {
    }
}