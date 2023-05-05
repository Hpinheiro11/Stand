package pt.ipg.stand

import android.database.sqlite.SQLiteDatabase


private const val NOME_TABELA = "categoria"


class TabelaVenda(db: SQLiteDatabase, venda: String) : TabelaBD(db,"categoria" ) {
    override fun cria() {
        db.execSQL("CREATE TABLE  $NOME_TABLE (${BaseColumns._ID}, $CHAVE_TABELA,descricao TEXT NOT NULL)")
    }

    }


/*
categorias = venda
livros = carros
 */