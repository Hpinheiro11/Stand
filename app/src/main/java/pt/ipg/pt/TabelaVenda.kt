package pt.ipg.stand

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns


class TabelaVenda(db: SQLiteDatabase) : TabelaBD(db,"vendas" ) {
    override fun cria() {
        db.execSQL("CREATE TABLE  $NOME_TABELA ($CHAVE_TABELA,descricao TEXT NOT NULL)")
    }
    companion object
        const val  NOME_TABELA = "vendas"
    }


/*
categorias = venda
livros = carros
 */