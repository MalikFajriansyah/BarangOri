package com.example.barangori

import android.os.Parcel
import android.os.Parcelable

data class Barang(val imageSrc: Int, val imageTitle: String?, val imageDesc: String?):
    Parcelable {
    class ImageViewHolder {

    }

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSrc)
        parcel.writeString(imageTitle)
        parcel.writeString(imageDesc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Barang> {
        override fun createFromParcel(parcel: Parcel): Barang {
            return Barang(parcel)
        }

        override fun newArray(size: Int): Array<Barang?> {
            return arrayOfNulls(size)
        }
    }
}