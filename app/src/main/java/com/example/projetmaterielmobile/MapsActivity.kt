package com.example.projetmaterielmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.projetmaterielmobile.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.LatLngBounds

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private val paris = LatLng(48.8578, 2.3461)
    private val ileDeFranceBounds = LatLngBounds(
        LatLng(48.7721,2.1634),//Sud-Ouest
        LatLng(48.9384,2.523713)//Nord-Est
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(paris,11f))
        mMap.setLatLngBoundsForCameraTarget(ileDeFranceBounds)
        mMap.setMinZoomPreference(9.7f)

        //mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Paris"))
    }
}