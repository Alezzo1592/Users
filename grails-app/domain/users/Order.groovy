package users

class Order {
    Long id
    String Category
    static belongsTo = [user:User,book:Book]
}
