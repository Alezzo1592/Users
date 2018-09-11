package users

class Author {
    Long id
    String Name
    static hasMany = [books:Book]
}
