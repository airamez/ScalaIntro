class Person (var name: String, var email: String, var age: Int) {
  override def toString(): String = s"[Name: $name; Email: $email; Age: $age]"
}

object _07_Class extends App{
  val person1 = new Person("Jose", "jose@email.com", 51)
  println(person1.toString())
  person1.name = "Leila"
  person1.email = "leila@email.com"
  person1.age = 40
  println(person1.toString())
  val person2 = new Person("Artur", "artur@noemail.com", 20)
  println(person2.toString())
}



