/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.mavenproject2.*;
/**
 *
 * @author bagas
 */
public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();

        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();

        assertEquals(3, calc.subtract(5, 2));
    }
}
