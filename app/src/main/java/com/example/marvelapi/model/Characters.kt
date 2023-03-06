package com.example.marvelapi.model

data class Characters(
    var idCharacter: Int,
    var nameCharacter: String,
    var descriptionCharacter: String,
    var characterURL: String,
    var imageCharacter: String,
    var comicsCharacter: String
)