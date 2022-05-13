package com.example.projetmaterielmobile


import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.TextView
import com.example.projetmaterielmobile.model.StationVelib
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker


class CustomInfoWindowAdapter(context: Context) : GoogleMap.InfoWindowAdapter {

    var mContext = context
    var mWindow = (context as Activity).layoutInflater.inflate(R.layout.custom_info_window, null)

    private fun rendowWindowText(marker: Marker, view: View){

        val tvTitle = view.findViewById<TextView>(R.id.title)
        val tvSnippet = view.findViewById<TextView>(R.id.snippet)
        val tvCapacity = view.findViewById<TextView>(R.id.capacity)
        val tvNbrVelosDispo = view.findViewById<TextView>(R.id.nbrVelosDispo)
        val tvNbrDockDispo = view.findViewById<TextView>(R.id.nbrDockDispo)

        //fun  listStationVelib.
        tvTitle.text = marker.title
        tvSnippet.text = marker.snippet
        tvCapacity.text= "aaa"
        tvNbrVelosDispo.text="aaa"
        tvNbrDockDispo.text="aaa"

    }

    override fun getInfoContents(marker: Marker): View {
        rendowWindowText(marker, mWindow)
        return mWindow
    }

    override fun getInfoWindow(marker: Marker): View? {
        rendowWindowText(marker, mWindow)
        return mWindow
    }
}


