package desktop.minhnhut.dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String tagFragAlertDialog = "alertDialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void remove(View view) {
        FragmentAlertDialog fragmentAlertDialog = new FragmentAlertDialog();
        fragmentAlertDialog.show(getFragmentManager(), "tagFragAlertDialog");
    }
}
