data class Person(
    @BsonId
    val id: Id<Person>? = null,
    val name: String,
    val age: Int
)