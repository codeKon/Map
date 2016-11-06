package map.codekon.de.map.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.google.android.gms.maps.SupportMapFragment;

import map.codekon.de.map.R;
import map.codekon.de.map.fragment.MapFragment;

public class MainActivity extends FragmentActivity {

    private SupportMapFragment mMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getSupportFragmentManager();
                mMapFragment = new MapFragment();

                fm.beginTransaction()
                        .add(R.id.frame, mMapFragment)
                        .commit();

            }
        });
    }


}
