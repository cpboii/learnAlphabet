package com.example.learnalphabet

data class alphabetList(
    val title: String,
    val word: String,
    var image: String


){
    override fun toString(): String {
        return "BlogPost(title='$title', username='$word', image='$image')"
    }
}
