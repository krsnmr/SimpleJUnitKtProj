package com.example.simplejunitktproj

import org.junit.Test
import org.junit.jupiter.api.Assertions

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `Adding 1 and 3 should be equal to 4`() {
        Assertions.assertEquals(4, calculator.add(1, 3))
    }
}