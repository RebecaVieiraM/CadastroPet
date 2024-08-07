package com.example.cadastropet.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Pet")
class PetModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_pet")
    var id_pet: Int = 0

    @ColumnInfo(name = "nome")
    var nome: String = ""

    @ColumnInfo(name = "idade")
    var idade: Int = 0

    @ColumnInfo(name = "cor")
    var cor: String = ""

    @ColumnInfo(name = "tipo")
    var tipo: String = ""

    @ColumnInfo(name = "peso_kg")
    var peso_kg: Double = 0.0
}