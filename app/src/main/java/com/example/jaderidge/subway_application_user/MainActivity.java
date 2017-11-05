package com.example.jaderidge.subway_application_user;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1); // imageView1 생성
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout); // linearLayout 생성

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        imageView1.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                float x = motionEvent.getX();
                float y = motionEvent.getY();

                if ((x >= 64 && x <= 81) && (y >= 538 && y <= 562))
                {
                    Toast.makeText(MainActivity.this, "문양", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE); // linearLayout 볼 수 있게 하기
                }
                else if ((x >= 102 && x <= 120) && (y >= 553 && y <= 579))
                {
                    Toast.makeText(MainActivity.this, "다사", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 137 && x <= 152) && (y >= 573 && y <= 600))
                {
                    Toast.makeText(MainActivity.this, "대실", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 169 && x <= 187) && (y >= 591 && y <= 620))
                {
                    Toast.makeText(MainActivity.this, "강창", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 205 && x <= 219) && (y >= 609 && y <= 635))
                {
                    Toast.makeText(MainActivity.this, "계명대", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 234 && x <= 252) && (y >= 623 && y <= 647))
                {
                    Toast.makeText(MainActivity.this, "성서산업단지", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 263 && x <= 278) && (y >= 635 && y <= 667))
                {
                    Toast.makeText(MainActivity.this, "이곡", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 296 && x <= 307) && (y >= 653 && y <= 685))
                {
                    Toast.makeText(MainActivity.this, "용산", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 319 && x <= 340) && (y >= 670 && y <= 697))
                {
                    Toast.makeText(MainActivity.this, "죽전", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 354 && x <= 369) && (y >= 682 && y <= 714))
                {
                    Toast.makeText(MainActivity.this, "감삼", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 386 && x <= 404) && (y >= 700 && y <= 723))
                {
                    Toast.makeText(MainActivity.this, "두류", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 422 && x <= 439) && (y >= 700 && y <= 723))
                {
                    Toast.makeText(MainActivity.this, "내당", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 460 && x <= 474) && (y >= 697 && y <= 723))
                {
                    Toast.makeText(MainActivity.this, "반고개", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 497 && x <= 510) && (y >= 691 && y <= 732))
                {
                    Toast.makeText(MainActivity.this, "신남", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 542 && x <= 560) && (y >= 691 && y <= 729))
                {
                    Toast.makeText(MainActivity.this, "반월당", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 574 && x <= 589) && (y >= 700 && y <= 726))
                {
                    Toast.makeText(MainActivity.this, "경대병원", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 604 && x <= 621) && (y >= 697 && y <= 726))
                {
                    Toast.makeText(MainActivity.this, "대구은행", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 642 && x <= 653) && (y >= 700 && y <= 729))
                {
                    Toast.makeText(MainActivity.this, "범어", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 674 && x <= 695) && (y >= 705 && y <= 732))
                {
                    Toast.makeText(MainActivity.this, "수성구청", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 715 && x <= 733) && (y >= 714 && y <= 741))
                {
                    Toast.makeText(MainActivity.this, "만촌", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 750 && x <= 768) && (y >= 720 && y <= 749))
                {
                    Toast.makeText(MainActivity.this, "담티", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 785 && x <= 800) && (y >= 723 && y <= 752))
                {
                    Toast.makeText(MainActivity.this, "연호", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 815 && x <= 832) && (y >= 729 && y <= 758))
                {
                    Toast.makeText(MainActivity.this, "대공원", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 850 && x <= 865) && (y >= 735 && y <= 764))
                {
                    Toast.makeText(MainActivity.this, "고산", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 879 && x <= 897) && (y >= 744 && y <= 770))
                {
                    Toast.makeText(MainActivity.this, "신매", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 912 && x <= 929) && (y >= 752 && y <= 776))
                {
                    Toast.makeText(MainActivity.this, "사월", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 953 && x <= 964) && (y >= 752 && y <= 785))
                {
                    Toast.makeText(MainActivity.this, "정평", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 985 && x <= 1003) && (y >= 761 && y <= 790))
                {
                    Toast.makeText(MainActivity.this, "임당", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else if ((x >= 1029 && x <= 1041) && (y >= 767 && y <= 793))
                {
                    Toast.makeText(MainActivity.this, "영남대", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else
                {
                    linearLayout.setVisibility(View.GONE);
                }
                //Toast.makeText(MainActivity.this, "x = " + x + "y = " + y, Toast.LENGTH_SHORT).show();

                return false;
            }
        }); // 터치 이벤트 처리
        linearLayout.setVisibility(View.GONE); // linearLayout 공간 숨기기
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera)
        {
            // Handle the camera action
        }
        else if (id == R.id.nav_gallery)
        {

        }
        else if (id == R.id.nav_slideshow)
        {

        }
        else if (id == R.id.nav_manage)
        {

        }
        else if (id == R.id.nav_share)
        {

        }
        else if (id == R.id.nav_send)
        {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
/*
    protected class MyView extends View
    {
        public MyView(Context context)
        {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event)
        {
            if (event.getAction() == MotionEvent.ACTION_DOWN)
            {
                toast();

                return true;
            }
            return false;
        }
    } // 터치이벤트를 발생하는 새로운 뷰 생성

    public void toast()
    {
        String str = "확인";
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    } // 터치시 메시지 출력*/
}