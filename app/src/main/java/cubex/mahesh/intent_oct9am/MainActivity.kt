package cubex.mahesh.intent_oct9am

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dial.setOnClickListener {
            var i = Intent( )
         /*   i.setAction(Intent.ACTION_DIAL)
            i.setData(Uri.parse("tel:"+et1.text.toString())) */
         /*   i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse(et1.text.toString())) */
            i.setAction(Intent.ACTION_GET_CONTENT)
            i.setType("image/*")
            startActivity(i)
        }
        next.setOnClickListener {

                var i = Intent(this@MainActivity,
                        WelcomeActivity::class.java)
                i.putExtra("person_name",et2.text.toString())
                 startActivity(i)

        }
        whatsapp.setOnClickListener {
            var i = packageManager.getLaunchIntentForPackage("com.whatsapp")
            if(i!=null) {
                startActivity(i)
            }else{
                i = Intent()
                i.setAction(Intent.ACTION_VIEW)
                i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
                startActivity(i)
            }
        }
    }
}
