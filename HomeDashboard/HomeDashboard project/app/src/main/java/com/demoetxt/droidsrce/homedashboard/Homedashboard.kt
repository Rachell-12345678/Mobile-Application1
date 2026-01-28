// Corrected package name to match the file's folder structure
package com.demoetxt.droidsrce.homedashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

// The class is correctly named 'Home' to match your AndroidManifest.xml and LoginActivity
class Homedashboard : AppCompatActivity() {

    // --- ADDED THIS PART BACK ---
    // Declare the CardView variables that will represent your buttons.
    private lateinit var bankCard: CardView
    private lateinit var ideasCard: CardView
    private lateinit var addCard: CardView
    private lateinit var linksCard: CardView
    private lateinit var wifiCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This sets the visual layout for the screen. Ensure 'active_home.xml' exists.
        setContentView(R.layout.active_home)

        // --- ADDED THIS PART BACK ---
        // Find each CardView in your layout by its unique ID.
        // Make sure these IDs (e.g., R.id.bank_card) are defined in your active_home.xml file.
        bankCard = findViewById(R.id.bank_card)
        ideasCard = findViewById(R.id.ideas_card)
        addCard = findViewById(R.id.add_card)
        linksCard = findViewById(R.id.links_card)
        wifiCard = findViewById(R.id.wifi_card)

        // --- ADDED THIS PART BACK ---
        // Set up click listeners for each card using the modern lambda style.
        // This is the recommended way to handle clicks in Kotlin.
        bankCard.setOnClickListener { startActivity(Intent(this, Bank::class.java)) }
        ideasCard.setOnClickListener { startActivity(Intent(this, Ideas::class.java)) }
        addCard.setOnClickListener { startActivity(Intent(this, Add::class.java)) }
        linksCard.setOnClickListener { startActivity(Intent(this, Links::class.java)) }
        wifiCard.setOnClickListener { startActivity(Intent(this, Wifi::class.java)) }
    }
}
