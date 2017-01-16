package fpinscala.ch2

object MyModule {

  def abs(n: Int): Int = {
    if(n < 0) -n
    else n
  }

  def factorial(n: Int): Int = {
    def loop(n: Int, acc: Int): Int = {
      if(n <= 0)  acc
      else loop(n-1,n*acc)
    }
    loop(n, 1)
  }

  def formatResult[T](name: String, x: T)(f: T => T) = {
    val msg = "The %s of %d is %d."
    msg.format(name,x,f(x))
  }

  def fib(n: Int): Int = {
    def loop(n: Int, acc1: Int, acc2: Int): Int = n match {
      case _ if n <=2 => acc1 + acc2
      case _ => loop(n-1, acc2, acc1 + acc2)
    }
    loop(n,0,1)
  }

  def main(args: Array[String]) {
    println(formatResult("absolute value",-42)(abs))
    println(formatResult("factorial value",5)(factorial))
    println(formatResult("Fibonacci value",8)(fib))
  }

}
