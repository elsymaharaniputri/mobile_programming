package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    //deklrasi var

    private  lateinit var inputTinggi : EditText
    private  lateinit var inputLebar : EditText
    private lateinit var inputPanjang : EditText
    private  lateinit var  submit : Button
    private lateinit var result : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//inisialisasi variable
        inputPanjang = findViewById(R.id.edt_length)
        inputLebar = findViewById(R.id.edt_width)
        inputTinggi = findViewById(R.id.edt_height)
        submit = findViewById(R.id.btn_result)
        result = findViewById(R.id.result)

        submit.setOnClickListener (this)

    }

    override fun onClick(v: View?) {
        //view dari id yang sama dengan btn_result
        if (v?.id == R.id.btn_result){
            var Panjang = inputPanjang.text.toString().trim()
            var Lebar = inputLebar.text.toString().trim()
            var  Tinggi = inputTinggi.text.toString().trim()

            //cek

            var check = false
            if(Tinggi.isEmpty()){
                check = true
                inputTinggi.error = "Wajib isi tinggi"
            }
            if (Lebar.isEmpty()){
                check = true
                inputLebar.error ="Wajib isi lebar"
            }
            if(Panjang.isEmpty()){
                check = true
                inputPanjang.error = "Wajib isi panjang"
            }

            if (!check){
                //untuk menampilkan
                var volume = Tinggi.toDouble()*Lebar.toDouble()*Panjang.toDouble()
                //diubah dulu ke string
                result.text = volume.toString()
            }


        }

    }
}