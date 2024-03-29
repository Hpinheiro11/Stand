package pt.ipg.stand

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import pt.ipg.pt.Venda

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class BdInstrumentedTest {

    private fun getAppContext(): Context =
        InstrumentationRegistry.getInstrumentation().targetContext

    @Before

    fun apagaBAseDados(){
        getAppContext().deleteDatabase(BDStandOpenHelper.NOME_BASE_DADOS)

    }


    @Test
    fun consegueAbrirBaseDados() {
        val openHelper = BDStandOpenHelper(getAppContext())
        val bd = openHelper.readableDatabase
        assert(bd.isOpen)


        // Context of the app under test.
        val appContext = getAppContext()
        assertEquals("pt.ipg.stand", appContext.packageName)
    }

    fun consegueInserirVenda(){
        val openHelper = BDStandOpenHelper(getAppContext())
        val bd = openHelper.writableDatabase

        val venda = Venda("Drama")
        val id = TabelaVenda(bd).insere(venda.toContentValue())
        assertNotEquals(-1,id)

        //TabelaVenda(bd).insere()
    }

}