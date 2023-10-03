object _05_Functions extends App {
  val addOne = (x: Int) => x + 1
  println(addOne(5))

  val sum = (n1: Int, n2: Int, n3: Int) => n1 + n2 + n3
  println(sum(5, 8, 9))

  val message = () => "I love Scala"
  println(message())
}