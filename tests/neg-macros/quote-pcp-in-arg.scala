import scala.quoted.*

object Foo {
  inline def foo(x: Int): Int = ${ bar('{ 'x; x }) } // error
  def bar(i: Expr[Int]): Expr[Int] = i
}
