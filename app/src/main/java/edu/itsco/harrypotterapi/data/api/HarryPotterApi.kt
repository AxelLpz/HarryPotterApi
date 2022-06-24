package edu.itsco.harrypotterapi.data.api

import edu.itsco.harrypotterapi.data.api.model.Characters
import retrofit2.http.GET

interface HarryPotterApi {
    @GET("characters")
    suspend fun getCharacters(): Characters
}