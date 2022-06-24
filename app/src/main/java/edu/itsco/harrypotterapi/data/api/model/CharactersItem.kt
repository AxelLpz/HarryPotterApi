package edu.itsco.harrypotterapi.data.api.model

data class CharactersItem(
    val actor: String,
    val alive: String,
    val alternate_actors: List<String>,
    val alternate_names: List<String>,
    val ancestry: String,
    val dateOfBirth: String,
    val eyeColour: String,
    val gender: String,
    val hairColour: String,
    val hogwartsStaff: String,
    val hogwartsStudent: String,
    val house: String,
    val image: String,
    val name: String,
    val patronus: String,
    val species: String,
    val wand: Wand,
    val wizard: String,
    val yearOfBirth: String
)