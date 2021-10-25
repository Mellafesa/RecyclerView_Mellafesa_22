package com.example.recyclerview_mellafesa_22

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Karakter Ant-Man pertama kali diperkenalkan dalam film 'Captain America: Civil War' yang rilis pada 27 April 2016. Ant-Man merupakan superhero dengan kemampuan dapat mengubah ukuran dirinya menjadi seukuran semut."
            ),
            Superhero(
                R.drawable.blackwidow,
                "Black Widow",
                "Natasha romanoff atau Black Widow, adalah karakter fiksi yang diperankan oleh Scarlett Johansson dalam film black widow. Romanoff adalah seorang mata-mata dan petarung tangan kosong yang ahli, dilatih di Red Room sejak kecil."
            ),
            Superhero(
                R.drawable.blackpanther,
                "Black Panther",
                "Tokoh utama dalam film Black Panther."
            ),
            Superhero(
                R.drawable.captamerica,
                "Captain America",
                "Captain America adalah sosok pahlawan super fiktif dari Marvel Comics. Memiliki musuh besar bernama Red Skull dan Baron Zemo, Rogers adalah tentara AS yang tidak memiliki kemampuan sama sekali. "
            ),
            Superhero(
                R.drawable.captmarvel,
                "Captain Marvel",
                "Captain Marvel adalah salah satu karakter superhero yang disebut-sebut sangat kuat. Menurut Marvel, kekuatannya meliputi kemampuan terbang, ledakan energi, serta kekuatan dan ketanan manusia super."
            ),
            Superhero(
                R.drawable.doctorstrange,
                "Doctor Strange",
                "Doctor Strange digambarkan sebagai pesulap terkuat di kosmos dan lebih kuat daripada sesama humanoids oleh Eternity, sentimen Marvel Universe."
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Gamora adalah karakter fiksi Marvel yang diciptakan oleh Jim Starlin. Gamora sendiri adalah alien Zen Whoberi wanita yang juga bergabung dengan aliansi Guardians of the Galaxy."
            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "Hawkeye diperkenalkan sebagai penjahat dalam Tales of Suspense #57 (September 1964). Setelah dua penampilan lagi sebagai penjahat di Tales of Suspense #60 dan #64 (Desember 1964 dan April 1965), Hawkeye bergabung dengan barisan Avengers di Avengers Vol.1 #16 (Mei 1965)."
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk diciptakan sebagai orang yang memiliki alter ego hasrat dan emosional yang bisa mengubah fisik seorang Dr. Bruce Banner. Hulk muncul setelah Banner secara tidak sengaja terkena test ledakan dari bom gamma yang ia temukan. Sesudah kejadian itu, Banner akan berubah menjadi Hulk, digambarkan sebagai seorang raksasa"
            ),
            Superhero(
                R.drawable.ironman,
                "Iron Man",
                "Iron Man (Anthony Edward Tony Stark) adalah pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh Marvel Comics, "
            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "Loki memiliki kemampuan ekstrasensori dan mampu melakukan proyeksi astral dan mengarahkan pikirannya melintasi jarak yang jauh—bahkan melintasi rintangan dimensi, seperti di antara Asgard dan Bumi—bahkan jika dia tidak dapat bergerak."
            ),
            Superhero(
                R.drawable.nebula,
                "Nebula",
                "Nebula adalah karakter yang paling dekat dengan Thanos.Nebula jadi karakter yang cukup misterius dan banyak hal tentangnya yang belum diketahui banyak orang."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHeroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

            }
        }
    }

