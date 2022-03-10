package com.example.kotlinpractice

fun main() {
    println("Creating a cat...")
    Cat("Claude", "Russian Blue")
    val morrisCat = Cat()
    val zoraCat = Cat("Zora", "maine coon")
    morrisCat.favoriteFood = "chicken heart"
    morrisCat.stateFavoriteFood()
    morrisCat.favoriteActivity = "roll up in a box"
    morrisCat.stateFavoriteActivity()
    zoraCat.stateFavoriteFood()
    zoraCat.stateFavoriteActivity()
}

class Cat(name: String = "Morris", breed: String = "Tabby") {
    // member variables or properties
    var name = name;
    var breed = breed;
    var age: Int? = null
    var favoriteFood: String = "beef liver"
    var favoriteActivity: String = "play with yarn"

    init {
        println("Cat created")
        println("Cat's name is $name and the breed is $breed")
    }

    // member functions or methods
    fun stateFavoriteFood() {
        println("$name's favorite food is $favoriteFood.")
    }

    fun stateFavoriteActivity() {
        println("$name's favorite activity is to")
    }
}