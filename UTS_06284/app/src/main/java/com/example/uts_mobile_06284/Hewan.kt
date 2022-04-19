package com.example.uts_mobile_06284

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hewan(
    var name: String,
    var description: String,
    var photo: Int
) : Parcelable
