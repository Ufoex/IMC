package com.proyecto.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var edad:Int = 25
    var peso:Int = 75
    var altura1:Int = 150
    var sexo:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekAltura.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var altura = 120
                altura += progress
                tvaltura.text = "$altura"
                altura1 = altura

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        btnedadmenos.setOnClickListener(this)
        btnedadmas.setOnClickListener(this)
        btnpesomas.setOnClickListener(this)
        btnpesomenos.setOnClickListener(this)
        imBtnFemenino.setOnClickListener(this)
        imBtnMasculino.setOnClickListener(this)
        btncalcular.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btnedadmenos->{
                edad--
                txtnumedad.text = "$edad"
            }
            R.id.btnedadmas->{
                edad++
                txtnumedad.text = "$edad"
            }
            R.id.btnpesomenos->{
                peso--
                txtnumpeso.text = "$peso"
            }
            R.id.btnpesomas->{
                peso++
                txtnumpeso.text = "$peso"
            }
            R.id.imBtnFemenino->sexo="f"
            R.id.imBtnMasculino->sexo="m"
            R.id.btncalcular->{
                val imc = calcularIMC(peso,altura1)
                val intencion = Intent(this,ActivityResultados::class.java)
                intencion.putExtra("imc",imc)
                intencion.putExtra("sexo",sexo)
                intencion.putExtra("edad",edad)
                startActivity(intencion)
            }
        }
    }

    fun calcularIMC(peso:Int, altura:Int):Float{
        val pesoF = peso.toFloat()
        val alturaF = altura.toFloat()/100
        var imc = pesoF/(alturaF*alturaF)
        return imc.toFloat()
    }
}
