package com.tracusa.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var userInput: EditText? = null
    private  var button: Button? = null
    private var textView: TextView? = null
    private  var numeTimesClicked:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.couter_layout)

        userInput = findViewById(R.id.editTextTextPersonName2)
        button = findViewById(R.id.button5)
        textView = findViewById(R.id.textView4)
        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                numeTimesClicked = numeTimesClicked.inc()
                textView?.append("The button got tapped ${numeTimesClicked} time")
                if(numeTimesClicked != 1) textView?.append("s \n")
<<<<<<< HEAD
                else textView?.append("\n")
=======
                else textView?.append("\n")*/
                textView?.append(userInput?.text)
                textView?.append("\n")
               // userInput.text.clear()
                userInput.setText("")
                //Repara repara 
>>>>>>> 856a5b7d0788601336b7e331b68945b2459387a0

            }
        })



    }
}


