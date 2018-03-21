package com.udacity.notepad.data

import java.util.Date

data class Note (
        val id: Int=-1,
        val text:String?=null,
        val isPinned: Boolean=false,
        val createAt:Date=Date(),
        val updateAt: Date?
)