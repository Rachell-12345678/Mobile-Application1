package com.demoetxt.droidsrce.homedashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

// Note: ", View.OnClickListener" has been removed from the class definition.
class Home : AppCompatActivity() {

    // These properties remain the same.
    private lateinit var bankCard: CardView
    private lateinit var ideasCard: CardView
    private lateinit var addCard: CardView
    private lateinit var linksCard: CardView
    private lateinit var wifiCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.active_home)

        // The findViewById calls remain the same.
        bankCard = findViewById(R.id.bank_card)
        ideasCard = findViewById(R.id.ideas_card)
        addCard = findViewById(R.id.add_card)
        linksCard = findViewById(R.id.links_card)
        wifiCard = findViewById(R.id.wifi_card)

        // --- THIS IS THE CORRECTED PART ---
        // I've replaced the old setOnClickListener(this) with modern lambdas.
        // This is cleaner and avoids the need for a separate onClick method.
        bankCard.setOnClickListener { startActivity(Intent(this, Bank::class.java)) }
        ideasCard.setOnClickListener { startActivity(Intent(this, Ideas::class.java)) }
        addCard.setOnClickListener { startActivity(Intent(this, Add::class.java)) }
        linksCard.setOnClickListener { startActivity(Intent(this, Links::class.java)) }
        wifiCard.setOnClickListener { startActivity(Intent(this, Wifi::class.java)) }
    }

    // The old "override fun onClick(...)" method has been completely removed
    // because its logic is now handled directly where setOnClickListener is called.
}
