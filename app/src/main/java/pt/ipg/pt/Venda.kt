package pt.ipg.pt

import android.content.ContentValues
import pt.ipg.stand.TabelaVenda

data class Venda (
                  var descricao: String,
                  var id: Long = -1)
{
    fun toContentValue() : ContentValues{
        val valores = ContentValues()

        valores.put(TabelaVenda.CAMPO_DESCRICAO, descricao)

        return valores
    }
}