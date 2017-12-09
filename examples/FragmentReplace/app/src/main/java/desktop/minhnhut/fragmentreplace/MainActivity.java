package desktop.minhnhut.fragmentreplace;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.btnFragmentA:
                fragment = new FragmentA();
                Toast.makeText(this, "Fragment A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnFragmentB:
                fragment = new FragmentB();
                Toast.makeText(this, "Fragment B", Toast.LENGTH_SHORT).show();
                break;
        }

//        fragmentTransaction.add(R.id.frameContent, fragment);
        fragmentTransaction.replace(R.id.frameContent, fragment);
        fragmentTransaction.commit();
    }
}
