```scala
class MyClass[T](val value: T) {
  def this(value: String) = this(value.toInt)
}
```