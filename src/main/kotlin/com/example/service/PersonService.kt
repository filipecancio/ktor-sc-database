class PersonService {
    private val client = KMongo.createClient()
    private val database = client.getDatabase("person")
    private val personCollection = database.getCollection<Person>()

    fun create(person: Person): Id<Person>? {
        personCollection.insertOne(person)
        return person.id
    }
}