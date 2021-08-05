package com.example.apkgooglemaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.apkgooglemaps.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Menambahkan Lokasi Di IMB ATMALUHUR and memindahkan kamera
        LatLng Atmaluhur = new LatLng(-2.086817, 106.111549);
        mMap.addMarker(new MarkerOptions().position(Atmaluhur).title("Saya Disini"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Atmaluhur));

        // Menambahkan Lokasi 0 Kilometer and memindahkan Kamera
        LatLng OKM = new LatLng(-2.12013, 106.11350);
        mMap.addMarker(new MarkerOptions().position(OKM).title("Saya Di 0 KM PGK"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(OKM));
    }
}