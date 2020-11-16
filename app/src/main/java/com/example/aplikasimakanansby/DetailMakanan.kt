package com.example.aplikasimakanansby

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_makanan.*

class DetailMakanan : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_makanan)
        val intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val gbrM = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            val namaM = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val hrgM = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val deskM = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            detail_gambar.setImageResource(gbrM)
            detail_nama.text = namaM
            detail_harga.text = hrgM
            detail_deskripsi.text = deskM
        }
    }
}