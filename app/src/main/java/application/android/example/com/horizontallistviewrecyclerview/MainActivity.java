package application.android.example.com.horizontallistviewrecyclerview;

import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    ImageView img,plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawer);
        img=findViewById(R.id.Xplus);
        plus=findViewById(R.id.plus);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        drawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {

            }

            @Override
            public void onDrawerOpened(@NonNull View view) {
                img.setVisibility(View.INVISIBLE);
                if(drawerLayout.isDrawerVisible(GravityCompat.START)==true){
                    Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onDrawerClosed(@NonNull View view) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START)==false){
                    Toast.makeText(getApplicationContext(),"Closed",Toast.LENGTH_SHORT).show();
                    img.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onDrawerStateChanged(int i) {

            }
        });
    }

}
