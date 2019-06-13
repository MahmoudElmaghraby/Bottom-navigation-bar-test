package com.elmaghraby.android.firstapplication;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

//
//    EditText num1;
//    EditText num2;
//    Button plus;
//    Button minus;
//    Button multiply;
//    Button divide;
//    TextView result;
//    int z ;
//    int m ;

    FrameLayout frameLayout;
    BottomNavigationView navigationView;
    homeFragment homef;
    contactFragment contactf;
    NotifiFragment notif;
    PractiseFragment practice;
    RewardsFragment reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homef = new homeFragment();
        contactf = new contactFragment();
        notif = new NotifiFragment();
        practice = new PractiseFragment();
        reward = new RewardsFragment();
        frameLayout = findViewById(R.id.fram_layout);
        navigationView = findViewById(R.id.navview);


        display(homef);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.home_nav:
                        display(homef);
                        return true;

                    case R.id.noti_nav:
                        display(notif);
                        return true;

                    case R.id.contact_nav:
                        display(contactf);
                        return true;

                    case R.id.practise_nav:
                        display(practice);
                        return true;

                    case R.id.reward_nav:
                        display(reward);
                        return true;

                    default:
                        return false;

                }

            }
        });

//        num1 = findViewById(R.id.firstnum);
//        num2 = findViewById(R.id.secondnum);
//        plus = findViewById(R.id.plus);
//        minus = findViewById(R.id.minus);
//        divide = findViewById(R.id.divide);
//        multiply = findViewById(R.id.multiply);
//        result = findViewById(R.id.finalresult);
//
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                method();
//                int finaly = z + m;
//                result.setText(""+ finaly);
//            }
//
//
//
//
//        });
//        minus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//              method();
//                int finaly = z - m;
//                result.setText(""+ finaly);
//            }
//
//
//
//
//        });
//        multiply.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                method();
//               int finaly = z * m;
//                result.setText(""+ finaly);
//            }
//
//
//
//
//        });
//        divide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                method();
//              int finaly = z / m;
//                result.setText(""+ finaly);
//            }
//
//
//
//
//        });


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(MainActivity.this, Main2Activity.class);
//                startActivity(i);
//                finish();
//            }
//        }, 2000)    ;
//
//
//        loginemail=findViewById(R.id.usernameet);
//        loginpass=findViewById(R.id.passwordet);
//        MYBUTTON=findViewById(R.id.button);
//        MYBUTTON.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //String emailString=loginemail.getText().toString();
//                //String passString=loginpass.getText().toString();
//                Uri i = Uri.parse("http://www.google.com");
//                Intent intent = new Intent(Intent.ACTION_VIEW,i);
//                //intent.putExtra("emailkey",emailString);
//                //intent.putExtra("passkey",passString);
//                startActivity(intent);
//            }
//        });
    }

//
//    void method (){
//
//        z = Integer.parseInt(num1.getText().toString());
//        m = Integer.parseInt(num2.getText().toString());
//
//
//    }


    void display(Fragment my_fragment) {

        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
        ft2.replace(R.id.fram_layout, my_fragment);
        ft2.commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.my_search_icom:
                Toast.makeText(this, "that is search !", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
