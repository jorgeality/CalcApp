package co.edu.unitecnologica.crudfirebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var ref: DatabaseReference

    lateinit var ListPalabras: MutableList<Palabra>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListPalabras = mutableListOf()

        ref = FirebaseDatabase.getInstance().getReference("palabras")
        var pal: String =""



        ref.addValueEventListener(object : ValueEventListener{

            override fun onCancelled(p0: DatabaseError?) {

            }

            override fun onDataChange(p0: DataSnapshot?) {
                //en esta parte va todo lo que tiene que hacer al momento de leer
                if(p0!!.exists()){

                    for (p in p0.children){

                        val paa = p.getValue(Palabra::class.java)


                        ListPalabras.add(paa!!)

                    }


                    datos.text =ListPalabras[2].palabra +": "+ ListPalabras.size.toString()
                }

            }

        })



    }
}
