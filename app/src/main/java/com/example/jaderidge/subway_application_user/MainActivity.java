package com.example.jaderidge.subway_application_user;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.estimote.sdk.SystemRequirementsChecker;

public class MainActivity extends AppCompatActivity implements TextWatcher{
    EditText txtSearch;
    CustomListViewAdapter customListViewAdapter;
    ListView customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this ,"gps용 스위치",Toast.LENGTH_SHORT).show();
            }
        });

        Switch switch_bluetooth = (Switch) findViewById(R.id.switch_bluetooth);
        switch_bluetooth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true)
                    Toast.makeText(MainActivity.this, "On", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Off", Toast.LENGTH_SHORT).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        customList = (ListView)findViewById(R.id.list_main);
        customListViewAdapter = new CustomListViewAdapter();


        String[] stations = getResources().getStringArray(R.array.stations);
        for(int k = 0; k<stations.length; k++)
            customListViewAdapter.addItem(getResources().getDrawable(R.drawable.line2), stations[k]);

//        customListViewAdapter.addList(getResources().getDrawable(R.drawable.subway_line_2), getResources().getStringArray(R.array.stations));
//        customListViewAdapter.addList(getResources().getDrawable(R.drawable.line2), stations);

        customList.setAdapter(customListViewAdapter);

//        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.stations, android.R.layout.simple_list_item_1);
//        customList.setAdapter(arrayAdapter);

        txtSearch = (EditText)findViewById(R.id.txt_search);
        txtSearch.addTextChangedListener(this);






    }
    protected  void onResume() {
        super.onResume();

        SystemRequirementsChecker.checkWithDefaultDialogs(this);
    }

    protected  void onPause(){
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        String search = txtSearch.getText().toString();
        customListViewAdapter.filter(search);
    }
}

//    import android.support.design.widget.NavigationView;
//    import android.view.Menu;
//    import android.view.MenuItem;

//        implements NavigationView.OnNavigationItemSelectedListener{

//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//        Toast.makeText(MainActivity.this, "id = " + id, Toast.LENGTH_SHORT).show();

//        switch(id){
//            case R.id.app_bar_switch:
//                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
//                break;
//        }
//
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

///////////////////////////////////////////////////////////////////////////////////////////////////

//        ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.INTERNET);
//        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, 12345);
//
//        BluetoothAdapter bta = BluetoothAdapter.getDefaultAdapter();
//        if(bta == null){
//            Toast.makeText(MainActivity.this, "블루투스 미지원", Toast.LENGTH_LONG);
//        }
//        else{
//            if(!bta.isEnabled()){
//                bta.enable();
//                Toast.makeText(MainActivity.this, "블루투스 활성화", Toast.LENGTH_LONG);
//            }
//            else{
//                bta.disable();
//                Toast.makeText(MainActivity.this, "블루투스 비활성화", Toast.LENGTH_LONG);
//            }
//        }