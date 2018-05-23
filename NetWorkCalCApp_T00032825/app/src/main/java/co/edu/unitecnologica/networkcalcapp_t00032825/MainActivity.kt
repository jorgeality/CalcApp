package co.edu.unitecnologica.networkcalcapp_t00032825

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.kittinunf.*
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPost
import com.github.kittinunf.result.Result
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject


class MainActivity : AppCompatActivity() {


    var operacion: String = ""
    var num1: Double = 0.0
    var num2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }



    fun numero1(View:View){

        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"1")
    }
    fun numero2(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"2")
    }
    fun numero3(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"3")
    }
    fun numero4(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"4")
    }
    fun numero5(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"5")
    }
    fun numero6(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"6")
    }
    fun numero7(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"7")
    }
    fun numero8(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"8")
    }
    fun numero9(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"9")
    }
    fun numero0(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+"0")
    }
    fun suma(View:View){

        num1 = Pantalla.text.toString().toDouble()

       operacion = "sum"
        Pantalla.setText("")
    }
    fun resta(View:View){
        num1 = Pantalla.text.toString().toDouble()
        operacion ="res"
        Pantalla.setText("")
    }
    fun multiplicacion(View:View){
        num1 = Pantalla.text.toString().toDouble()
        operacion ="mul"
        Pantalla.setText("")
    }
    fun division(View:View){
        num1 = Pantalla.text.toString().toDouble()
        operacion ="div"
        Pantalla.setText("")
    }
    fun punto(View:View){
        val resultado: String = Pantalla.text.toString()
        Pantalla.setText(resultado+".")
    }
    fun igual(View:View){
        num2 = Pantalla.text.toString().toDouble()
        val resulta: String = respuestas.text.toString()
        Fuel.Companion.post("http://parcial.getsandbox.com/operation", listOf("operation" to operacion, "num1" to num1 , "num2" to num2))
                .responseJson { request, response, result ->

                    respuestas.text = resulta + "\n" + result.get().content

                }
    }
}
