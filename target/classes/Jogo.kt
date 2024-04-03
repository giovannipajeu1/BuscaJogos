package org.example

import com.google.gson.annotations.SerializedName

class Jogo(@SerializedName("title") val titulo: String, @SerializedName("thumb") val capa:String) {

    var descricao = " "
    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Titulo= '$titulo', \n " +
                "Foto da Capa = '$capa', \n " +
                "Descrição = '$descricao'"
    }

}