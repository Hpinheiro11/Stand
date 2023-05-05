package pt.ipg.stand

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import java.lang.ArithmeticException

class TabelaBD (val db: SQLiteDatabase, val venda: String) {
    abstract fun cria()

    fun insere( valores: ContentValues) {
        db.insert(venda, null, valores)

    }

    fun consulta(
        colunas: Array<String>,
        selecao: String?,
        argsSelecao: Array<String>?,
        groupby: String?,
        having: String?,
        orderby: String?
    ) : Cursor = db.query(venda,colunas, selecao, argsSelecao,groupby, having,orderby)

    fun altera(valores: ContentValues, where: String, argsWhere: Array<String>) =
        db.update(venda ,valores, where, argsWhere)

    fun elimina(where: String, argsWhere: Array<String>) =
        db.delete(venda, where, argsWhere)



}
