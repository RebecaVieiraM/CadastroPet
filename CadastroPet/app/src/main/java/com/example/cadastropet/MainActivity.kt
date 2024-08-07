package com.example.cadastropet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cadastropet.model.PetModel
import com.example.cadastropet.repository.AppDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val petDatabase = AppDatabase.getDataBase(this).petDao()

        val retornoInsert = petDatabase.insertPet(PetModel().apply {
            this.nome = "Rex"
            this.idade = 3
            this.cor = "Marrom"
            this.tipo = "Cachorro"
            this.peso_kg = 25.0
        })

        petDatabase.insertPet(PetModel().apply {
            this.nome = "Bombom"
            this.idade = 9
            this.cor = "Preto"
            this.tipo = "Cachorro"
            this.peso_kg = 7.5
        })

        petDatabase.insertPet(PetModel().apply {
            this.nome = "Totó"
            this.idade = 14
            this.cor = "Caramelo"
            this.tipo = "Cachorro"
            this.peso_kg = 15.0
        })

        petDatabase.insertPet(PetModel().apply {
            this.nome = "Lise"
            this.idade = 5
            this.cor = "Branco"
            this.tipo = "Gato"
            this.peso_kg = 3.0
        })

        petDatabase.updatePet(PetModel().apply {
            this.id_pet = 4
            this.nome = "Maggie"
            this.idade = 3
            this.cor = "Dourado"
            this.tipo = "Cachorro"
            this.peso_kg = 12.0
        })

        petDatabase.updatePet(PetModel().apply {
            this.id_pet = 2
            this.nome = "Pipoca"
            this.idade = 16
            this.cor = "Bege"
            this.tipo = "Cachorro"
            this.peso_kg = 8.0
        })

        petDatabase.deletePet(PetModel().apply {
            this.id_pet = 1
        })
        petDatabase.deletePet(PetModel().apply {
            this.id_pet = 3
        })

        val retornoSelectMultiplo = petDatabase.getAll()

        for (item in retornoSelectMultiplo) {
            Log.d(
                "Retorno",
                "id_pet: ${item.id_pet}, nome: ${item.nome}," +
                        "idade: ${item.idade}, cor: ${item.cor}, tipo: ${item.tipo}, peso_kg: ${item.peso_kg}"
            )
        }
    }
}