package pt.ipg.stand

import android.content.ContentValues

data class Carros (
    var titulo: String,
    var idCategoria: Int,
    var isbn: String? = null,
    var id : Long = -1

        )
{
    fun toContentValue() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaCarros.CAMPO_TITULO, titulo)
        valores.put(TabelaCarros.CAMPO_ISBN, isbn)
        valores.put(TabelaCarros.CAMPO_FK_CATEGORIA, idCategoria)


        return valores
    }

}