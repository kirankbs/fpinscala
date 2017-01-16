package fpinscala.ch2

import org.junit.Test
import org.scalatest.Matchers._

class MyModuleTest {

  @Test
  def itShouldTestAbs(): Unit ={
    //given
    val expected = 42
    //when
    val actual = MyModule.abs(-42)
    //then
    actual should equal(expected)
  }

  @Test
  def itShouldTestFormatResultForAbs(): Unit ={
    //given
    val expected = "The absolute value of -42 is 42."
    //when
    val actual = MyModule.formatResult("absolute value",-42)(MyModule.abs)
    //then
    actual should equal(expected)
  }

  @Test
  def itShouldTestFactorial(): Unit ={
    //given
    val expected = 120
    //when
    val actual = MyModule.factorial(5)
    //then
    actual should equal(expected)
  }

  @Test
  def itShouldTestFormatResultForFactorial(): Unit ={
    //given
    val expected = "The factorial value of 5 is 120."
    //when
    val actual = MyModule.formatResult("factorial value",5)(MyModule.factorial)
    //then
    actual should equal(expected)
  }

  @Test
  def itShouldTestFibonacci(): Unit ={
    //given
    val expected = 21
    //when
    val actual = MyModule.fib(8)
    //then
    actual should equal(expected)
  }

  @Test
  def itShouldTestFormatResultForFibonacci(): Unit ={
    //given
    val expected = "The fibonacci value of 8 is 21."
    //when
    val actual = MyModule.formatResult("fibonacci value",8)(MyModule.fib)
    //then
    actual should equal(expected)
  }
}
