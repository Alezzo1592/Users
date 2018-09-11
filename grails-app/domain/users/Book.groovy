package users

class Book implements Serializable {
    Long id
    String name
    static belongsTo = [owner:Author]
}
