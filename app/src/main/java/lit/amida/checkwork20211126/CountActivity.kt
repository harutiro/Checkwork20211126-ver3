package lit.amida.checkwork20211126

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        var count = 0
        val textSizeList = listOf( 40f, 52f , 32f)
        val textView = findViewById<TextView>(R.id.count_text)

        findViewById<Button>(R.id.count_button).setOnClickListener {
            if(count >= Int.MAX_VALUE) return@setOnClickListener

            count++
            textView.text = count.toString()
            textView.textSize = textSizeList[count%2]
            textView.setTextColor(Color.HSVToColor(floatArrayOf((count*30f)%360, 0.8f, 0.8f)))

        }

        findViewById<Button>(R.id.count_to_result_button).setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("value", count)
            startActivity(intent)
        }
    }
}