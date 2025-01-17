package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController

class ScoreViewModel(finalScore: Int): ViewModel() {
    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}