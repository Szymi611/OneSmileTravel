package com.travelmobileapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.travelmobileapp.Country
import com.travelmobileapp.Flags
import com.travelmobileapp.Name

@Entity
data class CountryEntity(
    @PrimaryKey val id: String, // Use cca2 as a unique identifier
    @ColumnInfo(name="country-name")  val name: String,
    @ColumnInfo(name="visited") val visited: Boolean = false
)

fun CountryEntity.toCountry(): Country {
    return Country(
        name = Name(commonName = this.name),
        cca2 = this.id,
        flags = Flags(png = "https://flagcdn.com/w320/${this.id.lowercase()}.png"),
        visited = this.visited
    )
}
