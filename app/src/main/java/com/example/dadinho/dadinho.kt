package com.example.dadinho

class dadinho {

    var numdado = roll()
}

fun roll(): Int {
    return (1..6).shuffled().first()
}