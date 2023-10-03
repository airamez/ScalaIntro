object _06_Methods extends App {
  def averageOfThree(n1: Int, n2: Int, n3: Int): Double = (n1 + n2 + n3) / 3.toDouble
  println(averageOfThree(5, 8 , 6))

  def WeightedAverage (grade1: Double, grade2: Double, grade3: Double) (weight1: Int, weight2: Int, weight3: Int): Double = {
    val sum = (grade1 * weight1 + grade2 * weight2 + grade3 * weight3)
    val weights = (weight1 + weight2 + weight3)
    sum / weights
  }

  println(WeightedAverage(7, 6, 8)(3, 3, 4))

  def userName: String = System.getProperty("user.name")
  println(userName)

  println(util.Properties.versionNumberString)
}