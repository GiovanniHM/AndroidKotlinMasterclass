package com.tracusa.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Class 74 minuto 6

private const val TEXT_CONTENTS = "TextContent"

class MainActivity : AppCompatActivity() {
    /*   private var userInput: EditText? = null
       private  var button: Button? = null*/
    private var textView: TextView? = null

    // private  var numeTimesClicked:Int = 0
    private val TAG = "MainActivity"
    private val TEXT_CONTENTS = "TextContent"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.couter_layout)

        val userInput: EditText = findViewById(R.id.editTextTextPersonName2)
        val button: Button = findViewById(R.id.button5)
        textView = findViewById(R.id.textView4)
        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "OnClick: called")
                /*numeTimesClicked = numeTimesClicked.inc()
                textView?.append("The button got tapped ${numeTimesClicked} time")
                if(numeTimesClicked != 1) textView?.append("s \n")
                else textView?.append("\n")*/
                textView?.append(userInput?.text)
                textView?.append("\n")
                // userInput.text.clear()
                userInput.setText("")
                //reparar
                //clean

            }
        })


    }

    override fun onStart() {
        Log.d(TAG, "onStart: called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: called")
        super.onRestoreInstanceState(savedInstanceState)
        //val savedString = savedInstanceState?.getString(TEXT_CONTENTS, "")
        //textView?.text = savedString
        //Recupera los datos del textView
        textView?.text = savedInstanceState?.getString(TEXT_CONTENTS, "")
    }

    override fun onResume() {
        Log.d(TAG, "onResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: called")
        super.onSaveInstanceState(outState)
        //Guarda el valor de nuestro textView
        outState?.putString(TEXT_CONTENTS, textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "onStop: called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: called")
        super.onDestroy()
    }
}





