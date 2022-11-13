package com.example.notify.feature_note.domain.use_cases

import com.example.notify.feature_note.domain.model.Note
import com.example.notify.feature_note.domain.repository.NoteRepository

class GetNote (private val repository: NoteRepository) {
        suspend operator  fun invoke(id : Int) : Note? {
            return repository.getNoteById(id)
        }
}