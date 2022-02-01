package com.plcoding.cleanarchitecturenoteapp.feature_note.util

sealed class Screen(val route:String){
    object NoteScreen:Screen("notes_screen")
    object AddEditScreen:Screen("add_edit_screen")
}
