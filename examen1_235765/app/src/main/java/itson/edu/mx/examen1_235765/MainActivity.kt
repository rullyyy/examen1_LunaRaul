package itson.edu.mx.examen1_235765

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn5: Button = findViewById(R.id.btn5) as Button
        val btn10: Button = findViewById(R.id.btn10) as Button
        val btn15: Button = findViewById(R.id.btn15) as Button
        val btn20: Button = findViewById(R.id.btn20) as Button
        val btn25: Button = findViewById(R.id.btn25) as Button
        val btn50: Button = findViewById(R.id.btn50) as Button
        val btnTip: Button = findViewById(R.id.btnTip) as Button
        val btnDiscount: Button = findViewById(R.id.btnDiscount) as Button
        var originalPrice: TextView = findViewById(R.id.ptOriginalPrice) as TextView
        val txtPercentage: TextView = findViewById(R.id.percentage) as TextView
        val txtTotal: TextView = findViewById(R.id.total) as TextView

        var addPercentage = 0.0
        var quitPercentage = 0.0
        var price = 0.0
        var percentage = 0.0

        try {
            price = originalPrice.text.toString().toDouble()
            percentage = txtPercentage.text.toString().toDouble()
        } catch (e: java.lang.Exception){
            txtPercentage.setText("Escriba un número")
        }

        btn5.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            percentage = price * (0.05)
            txtPercentage.text = percentage.toString()
        }
        btn10.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            percentage = price * (0.1)
            txtPercentage.text = percentage.toString()
        }
        btn15.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            percentage = price * (0.15)
            txtPercentage.text = percentage.toString()
        }
        btn20.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            percentage = price * (0.20)
            txtPercentage.text = percentage.toString()
        }
        btn25.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            percentage = price * (0.25)
            txtPercentage.text = percentage.toString()
        }
        btn50.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            percentage = price * (0.50)
            txtPercentage.text = percentage.toString()
        }
        btnTip.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            addPercentage = price + percentage
            txtTotal.text = addPercentage.toString()
        }
        btnDiscount.setOnClickListener {
            price = originalPrice.text.toString().toDouble()
            quitPercentage = price - percentage
            txtTotal.text = quitPercentage.toString()
        }





    }


}