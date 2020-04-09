package com.mario21ic.session1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTabHost

class MiFragmentTabhost : AppCompatActivity() {

    private var tabHost: FragmentTabHost? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_fragment_tabhost)

        tabHost = findViewById(android.R.id.tabhost) as FragmentTabHost
        tabHost!!.setup(this, FragmentManager(), android.R.id.tabcontent)

    }

//    private FragmentTabHost tabHost;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mi_fragment_tabhost);
//        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
//        tabHost.setup(this,
//            getSupportFragmentManager(),android.R.id.tabcontent);
//
//        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Lengüeta 1"),
//            Tab1.class, null);
//        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Lengüeta 2"),
//            Tab2.class, null);
//        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Lengüeta 3"),
//            Tab3.class, null);
//    }
}
