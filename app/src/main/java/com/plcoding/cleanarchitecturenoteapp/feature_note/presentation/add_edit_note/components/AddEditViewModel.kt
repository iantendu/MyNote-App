package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note.components

import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import javax.inject.Inject

class AddEditViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
):ViewModel() {

}