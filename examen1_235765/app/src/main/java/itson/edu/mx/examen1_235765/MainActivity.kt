package itson.edu.mx.examen1_235765

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val btn5: Button = findViewById(R.id.btn5)
    val btn10: Button = findViewById(R.id.btn10)
    val btn15: Button = findViewById(R.id.btn15)
    val btn20: Button = findViewById(R.id.btn20)
    val btn25: Button = findViewById(R.id.btn25)
    val btn50: Button = findViewById(R.id.btn50)
    val btnTip: Button = findViewById(R.id.btnTip)
    val btnDiscount: Button = findViewById(R.id.btnDiscount)
    var originalPrice: TextView = findViewById(R.id.ptOriginalPrice)
    val txtPercentage: TextView = findViewById(R.id.percentage)
    val txtTotal: TextView = findViewById(R.id.total)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var price: Double = originalPrice.text.toString().toDouble()
        var percentage: Double = txtPercentage.text.toString().toDouble()

        btn5.setOnClickListener {
             percentage = price * (0.05)
            txtPercentage.text = percentage.toString()
        }
        btn10.setOnClickListener {
            percentage = price * (0.1)
            txtPercentage.text = percentage.toString()
        }
        btn15.setOnClickListener {
            percentage = price * (0.15)
            txtPercentage.text = percentage.toString()
        }
        btn20.setOnClickListener {
            percentage = price * (0.20)
            txtPercentage.text = percentage.toString()
        }
        btn25.setOnClickListener {
            percentage = price * (0.25)
            txtPercentage.text = percentage.toString()
        }
        btn50.setOnClickListener {
            percentage = price * (0.50)
            txtPercentage.text = percentage.toString()
        }
        btnTip.setOnClickListener {
            var addPercentage = price + percentage
            txtTotal.text = addPercentage.toString()
        }
        btnDiscount.setOnClickListener {
            var quitPercentage = price - percentage
            txtTotal.text = quitPercentage.toString()
        }





    }


}