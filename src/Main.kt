fun main(){

    val ivan = Person("Ivan", 37, "Harlingum")
    ivan.apply {
        name = "Tommy"
        age = 57
        city = "Kisumu"

        introduction()
    }
}

class Person(_name: String, _age: Int, _city: String){

    var name = _name
    var age = _age
    var city = _city

    fun introduction(){
        println("Hello, my name is $name, I am $age years old, and I live in $city.")
    }
}