package com.proyecto.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resultados.*

class ActivityResultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        val intencion = intent

        val imc = intencion.getFloatExtra("imc", 0.0F)
        var sexo = intencion.getStringExtra("sexo")
        sexo = sexo.toString()
        val edad = intencion.getIntExtra( "edad", 0)

        txtresultado.text = "$imc"

        interpretaIMC(imc, edad, sexo)


        btnrecalcular.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }

    fun interpretaIMC(imc: Float, edad: Int, sexo: String){
        if (sexo == "f"){
            when(edad){
                in 19..24->{
                    when(imc){
                        in 18.9 .. 22.1 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "18.9 - 22.1 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                        in 22.2 .. 25.0->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 25 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                        in 25.6 .. 29.6->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = ">29.6 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }

                }
            }
            when (edad){
                in 25..29->{
                    when (imc){
                        in 18.9 .. 22.0 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "18.9 - 22.2 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 22.1 .. 25.4 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 25.4 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 25.5 .. 29.8 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 29.8 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 30..34 ->{
                    when (imc){
                        in 19.7 .. 22.7 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "19.7 - 22.7 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 22.8 .. 26.4->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 26 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 26.5 .. 30.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 30.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 35..39 ->{
                    when (imc){
                        in 21.0 .. 24.0 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "21.0 - 24.0 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 21.1 .. 27.7 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 27.7 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 27.8 .. 31.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 31.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 40..44 ->{
                    when (imc){
                        in 22.6 ..25.6 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "22.5 - 25.6 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 25.7 ..29.3 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 29.3 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 29.4 .. 32.8 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 32.8 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 45..49 ->{
                    when (imc){
                        in 24.3 .. 27.3 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "24. - 27.3 km/m2"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 27.4 .. 30.9 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 30.9 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 30.10 .. 34.1 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 34.1 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 50..54 ->{
                    when (imc){
                        in 26.6 .. 29.7 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "26.6 - 29.7.1 km/m2"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 29.8 .. 33.1 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 33.1 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 32.2 .. 36.2 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 36.2 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 55..59 ->{
                    when (imc){
                        in 27.4 .. 30.7 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "27.4 - 30.7 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 30.8 .. 34.0 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 34.0 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 34.1 .. 37.3 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 37.3 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            if (edad >= 60){
                when (imc){
                    in 27.6 .. 31.0 ->{
                        Log.d("valor_imc","imc")
                        tvNormalidad.text = "NORMAL"
                        tvRango.text = "27.6 - 31.0 %"
                        tvMensaje.text = "Tienes un PESO CORPORAL normal"
                    }
                }
                when (imc){
                    in 31.2 .. 34.4 ->{
                        Log.d("valor_imc","imc")
                        tvNormalidad.text = "BUENO"
                        tvRango.text = "Hasta 34.4 %"
                        tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                    }
                }
                when (imc){
                    in 34.5 .. 38.0 ->{
                        Log.d("valor_imc","imc")
                        tvNormalidad.text = "MALO"
                        tvRango.text = "> 38.0 %"
                        tvMensaje.text = "Tienes un PESO CORPORAL malo"
                    }
                }
            }
        }else if(sexo == "m"){
            when (edad){
                in 19..24 ->{
                    when (imc){
                        in 10.8 .. 14.9 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "10.8 - 14.9 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 15.0..19.0 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 19.0 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 19.1..23.3 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 23.3 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 25..29 ->{
                    when (imc){
                        in 12.8 .. 16.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "12.8 - 16.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 16.5..20.3 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 20.3 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 20.4..24.4 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 24.4 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 30 .. 34 ->{
                    when (imc){
                        in 14.5 .. 18.0 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "14.5 - 18.0 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 18.1..21.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 21.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 21.6..25.2 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 25.2 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 35..39 ->{
                    when (imc){
                        in 16.1..19.4 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "16.1 - 19.1 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 19.5..22.6 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 22.6 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 22.7..26.1 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 26.1 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 40..44 ->{
                    when (imc){
                        in 17.5..20.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "17.5 - 20.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 20.6..23.6 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 23.6 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 23.7..26.9 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 6.9%"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 45..49 ->{
                    when (imc){
                        in 18.6..21.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "18.6 - 21.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 21.6..24.5 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 24.5 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 24.6..27.6 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 27.6 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 50..54 ->{
                    when (imc){
                        in 19.8..22.7 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "19.8 - 22.7 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 22.8..25.6 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 25.6 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 25.7..28.7 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 28.7 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            when (edad){
                in 55..59 ->{
                    when (imc){
                        in 20.2..23.2 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "NORMAL"
                            tvRango.text = "20.2 - 23.2 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL normal"
                        }
                    }
                    when (imc){
                        in 23.3..26.2 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "BUENO"
                            tvRango.text = "Hasta 26.2 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                        }
                    }
                    when (imc){
                        in 26.3..29.3 ->{
                            Log.d("valor_imc","imc")
                            tvNormalidad.text = "MALO"
                            tvRango.text = "> 29.3 %"
                            tvMensaje.text = "Tienes un PESO CORPORAL malo"
                        }
                    }
                }
            }
            if (edad >= 60){
                when (imc){
                    in 20.3..23.5 ->{
                        Log.d("valor_imc","imc")
                        tvNormalidad.text = "NORMAL"
                        tvRango.text = "20.3 - 23.5 %"
                        tvMensaje.text = "Tienes un PESO CORPORAL normal"
                    }
                }
                when (imc){
                    in 23.6..26.7 ->{
                        Log.d("valor_imc","imc")
                        tvNormalidad.text = "BUENO"
                        tvRango.text = "Hasta 26.7 %"
                        tvMensaje.text = "Tienes un PESO CORPORAL bueno"
                    }
                }
                when (imc){
                    in 26.7..29.8 ->{
                        Log.d("valor_imc","imc")
                        tvNormalidad.text = "MALO"
                        tvRango.text = "> 29.8 %"
                        tvMensaje.text = "Tienes un PESO CORPORAL malo"
                    }
                }
            }
        }
    }
}