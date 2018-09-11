package users

import grails.converters.JSON

class UsersController {

    def index() { }

    def save = {
        def json = request.JSON
        def newUser = new User()
        newUser.name = json.name
        newUser.age = json.age
        newUser.lastName = json.lastName
        newUser.registrationDate = json.registrationDate
        newUser.email = json.email

        newUser.save(flush:true)
        return [id:newUser.id]
    }

    def get = {
        def user = User.findById(params.id)
        return user as JSON
    }
}
