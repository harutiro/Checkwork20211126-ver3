package lit.amida.checkwork20211126

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        findViewById<Button>(R.id.to_count_button).setOnClickListener {
            val intent = Intent(this, CountActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.to_input_button).setOnClickListener {
            val intent = Intent(this, InputActivity::class.java)
            startActivity(intent)
        }
    }


}