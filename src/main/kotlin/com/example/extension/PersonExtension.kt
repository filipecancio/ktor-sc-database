fun Person.toDto(): PersonDto =
    PersonDto(
        id = this.id.toString(),
        name = this.name,
        age = this.age
    )
fun PersonDto.toPerson(): Person =
    Person(
        name = this.name,
        age = this.age
    )