package com.example.broadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleBroadcast:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
       if(Intent.ACTION_TIME_TICK == intent?.action){
           Toast.makeText(context, "Time updated", Toast.LENGTH_SHORT).show()
       }else if(ConnectivityManager.CONNECTIVITY_ACTION == intent?.action){
           val booleanExtra = intent?.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false)
   if(booleanExtra!!){
       Toast.makeText(context, "Network connected", Toast.LENGTH_SHORT).show()
   }

    }else{
        Toast.makeText(context, "Network disconnected", Toast.LENGTH_SHORT).show()

       }


    }

}