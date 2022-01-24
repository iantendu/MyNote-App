package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class NoteOrder{
    class Title(orderType: OrderType):NoteOrder()
    class Date(orderType: OrderType):NoteOrder()
    class Color(orderType: OrderType):NoteOrder()
}
