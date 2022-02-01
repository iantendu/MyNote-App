package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
      if (note.title.isBlank()) {
          Note.InvalidNoteException("The note title can't be empty")
      }
        if (note.content.isBlank()){
            Note.InvalidNoteException("The note content can't empty")
        }
        repository.insertNote(note)
    }
}