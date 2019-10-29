package tj.belajar.asu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_phone_detail.*
import tj.belajar.wisataJogja.R
import tj.belajar.wisataJogja.R.*

class   WisataDetailActivity: AppCompatActivity() {

    private lateinit var kembali : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_phone_detail)

        kembali = findViewById(id.kembali)

        kembali.setOnClickListener {
            val  kembali = Intent(this, MainActivity::class.java)
            startActivity(kembali)
        }


        var intentData = getIntent()
        if(intentData.hasExtra("data")){
            val data = intentData.getSerializableExtra("data") as WisataData
            tv_item_id.text = data.detailDiskripsi
            tv_item_id1.text = data.tempat.toString()
            Picasso.get().load(data.image).resize(400,200).into(img_view_phone_detail1)
        }
    }
}