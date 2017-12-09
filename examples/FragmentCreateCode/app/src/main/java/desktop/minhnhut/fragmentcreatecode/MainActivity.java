package desktop.minhnhut.fragmentcreatecode;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();

        fragmentTransaction.add(R.id.frameContent, fragmentA);
        fragmentTransaction.add(R.id.frameContent, fragmentB);

        fragmentTransaction.commit();
    }

}
