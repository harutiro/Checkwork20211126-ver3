package lit.amida.checkwork20211126

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        findViewById<Button>(R.id.input_to_result_button).setOnClickListener {
            var value = 0
            value = try{
                findViewById<EditText>(R.id.number_input_edit).text.toString().toInt()
            }catch (e: Exception){
                0
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("value", value)
            startActivity(intent)
        }
    }
}