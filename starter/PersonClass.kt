class Person {
  var age: Int
  var name: String

  constructor(name: String, age: Int) {
      this.name = name
      this.age = age
  }

  fun getName(): String {
    return this.name
  }
}
