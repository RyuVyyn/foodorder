package com.app.foodorder.v1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.foodorder.v1.databinding.ActivityMainBinding

// MainActivity adalah activity utama aplikasi setelah splash screen
class MainActivity: AppCompatActivity() {
    // Deklarasi variabel binding untuk mengakses komponen UI dari layout activity_main.xml
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inisialisasi binding dengan layout inflater
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Menentukan tampilan utama activity menggunakan root dari binding
        setContentView(binding.root)

        // Bagian ini masih berupa placeholder (sementara)
        // Nanti akan diganti dengan data dinamis dari RecyclerView atau sumber lain

        // Menampilkan teks sambutan pada TextView tvGreeting melaui incHeader
        binding.incHeader.tvGreeting.text = "Selamat datang👋"

        // Menampilkan lokasi pada TextView tvLocation melalui incHeader
        binding.incHeader.tvLocation.text = "UPNVJ, Jakarta"

        // Memberikan hint pada EditText etSearch melalui incSearch agar pengguna tahu fungsi pencarian
        binding.incSearch.etSearch.hint = "Cari makanan, minuman, atau restoran"

        binding.incPromo.btnExplore.setOnClickListener {
            startActivity(Intent(this, MenuListActivity::class.java))
        }
    }
}