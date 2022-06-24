package edu.itsco.harrypotterapi.data.repository

import edu.itsco.harrypotterapi.data.api.HarryPotterApi
import edu.itsco.harrypotterapi.data.api.model.Characters
import javax.inject.Inject

class HarryPotterRepository@Inject constructor(private val HarryPotterApi: HarryPotterApi) {

    suspend fun getCharacters(): Characters {
        return  HarryPotterApi.getCharacters()}
}