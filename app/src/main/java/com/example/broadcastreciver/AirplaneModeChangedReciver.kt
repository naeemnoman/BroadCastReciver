package com.example.broadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReciver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT).show()
        }
    }

}