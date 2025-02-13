```scala
class MyClass[T](val value: T) {
  def this(value: String) = try {
    this(value.toInt)
  } catch {
    case e: NumberFormatException =>
      println(s"Error converting string to integer: "
          + e.getMessage)
      this(null.asInstanceOf[T]) // Or handle it appropriately based on your needs
  }
}
```