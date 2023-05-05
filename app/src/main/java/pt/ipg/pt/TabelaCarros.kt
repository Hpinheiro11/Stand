package pt.ipg.stand

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns


class TabelaCarros(db: SQLiteDatabase) : TabelaBD(db, NOME_TABELA) {

    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA ($CHAVE_TABELA,nome_carro TEXT NOT NULL, isbn TEXT, id_carro INTEGER NOT NULL),FOREIGN KEY(id_venda) REFENCES${TabelaVenda.NOME_TABELA}(${BaseColuns._ID})")
    }

    companion object{
    const val NOME_TABELA = "Carros"
    }
}
