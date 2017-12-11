package desktop.minhnhut.fragmentremovepopbackstack;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getFragmentManager();
    private String tagFragA = "fragA";
    private String tagFragB = "fragB";
    private String tagFragC = "fragC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addA(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameContent, new FragmentA(),tagFragA);
        fragmentTransaction.commit();
    }

    public void addB(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameContent, new FragmentB(),tagFragB);
        fragmentTransaction.commit();
    }

    public void addC(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameContent, new FragmentC(),tagFragC);
        fragmentTransaction.commit();
    }

    public void removeA(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentByTag(tagFragA);
        if (fragmentA != null) {
            fragmentTransaction.remove(fragmentA);
            fragmentTransaction.commit();
        }
    }

    public void removeB(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentByTag(tagFragB);
        if (fragmentB != null) {
            fragmentTransaction.remove(fragmentB);
            fragmentTransaction.commit();
        }
    }

    public void removeC(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentC fragmentC = (FragmentC) getFragmentManager().findFragmentByTag(tagFragC);
        if (fragmentC != null) {
            fragmentTransaction.remove(fragmentC);
            fragmentTransaction.commit();
        }
    }
}
