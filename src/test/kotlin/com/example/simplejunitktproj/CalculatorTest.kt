package com.example.simplejunitktproj

import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.function.Executable

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `Adding 1 and 3 should be equal to 4`() {
        Assertions.assertEquals(4, calculator.add(1, 3))
    }

    @Test
    fun test_div_by_zero() {
        val exc = Assertions.assertThrows(DivideByZeroException::class.java){
            calculator.divide(9,0)
        }
        Assertions.assertEquals(9, exc.numerator)
    }

    @Test
    fun square_multiple() {

        Assertions.assertAll(

                Executable { Assertions.assertEquals(1,calculator.square(1)) },
                Executable { Assertions.assertEquals(4,calculator.square(2)) },
                Executable { Assertions.assertEquals(9,calculator.square(3)) }
        )
    }

    @Tags(Tag("slow"),Tag("logarithms"))
    @Test
    fun logarithms_calc_test(){
        Assertions.assertEquals(3.0, calculator.log(2,8))
    }
}