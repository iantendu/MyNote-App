package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject

class AddEditViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
):ViewModel() {

    private val _noteTitle= mutableStateOf(NoteTextFieldState())
    val noteTitle: State<NoteTextFieldState> = _noteTitle

    private val _noteContent= mutableStateOf(NoteTextFieldState())
    val noteContent:State<NoteTextFieldState> =_noteContent

    private val _noteColor = mutableStateOf<Int>(Note.noteColors.random().toArgb())
    val noteColor:State<Int> =_noteColor

    private val _eventFlow= MutableSharedFlow<UiEvent>()
    val eventFlow= _eventFlow.asSharedFlow()

    sealed class UiEvent{
        data class ShowSnackBar(val message:String):UiEvent()
        object SaveNote:UiEvent()
    }


}