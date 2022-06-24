package edu.itsco.harrypotterapi.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.itsco.harrypotterapi.data.api.model.CharactersItem
import edu.itsco.harrypotterapi.data.repository.HarryPotterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val HarryPotterRepository: HarryPotterRepository
): ViewModel() {
    private val  _state= MutableStateFlow(emptyList<CharactersItem>())
    val state: StateFlow<List<CharactersItem>>
        get()=_state

    init {
        viewModelScope.launch { _state.value=HarryPotterRepository.getCharacters() }
    }
}