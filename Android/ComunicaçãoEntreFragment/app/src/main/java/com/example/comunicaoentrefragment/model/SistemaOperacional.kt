package com.example.comunicaoentrefragment.model

import android.os.Parcel
import android.os.Parcelable

class SistemaOperacional(var imagem: Int, var nome: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imagem)
        parcel.writeString(nome)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SistemaOperacional> {
        override fun createFromParcel(parcel: Parcel): SistemaOperacional {
            return SistemaOperacional(parcel)
        }

        override fun newArray(size: Int): Array<SistemaOperacional?> {
            return arrayOfNulls(size)
        }
    }
}