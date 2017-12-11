package desktop.minhnhut.dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DeleteData {

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

    @Override
    public void deleteValue(boolean isDel) {
        if (isDel) {
            Toast.makeText(this, "Đồng ý xóa sản phầm", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Không đồng ý xóa sản phầm", Toast.LENGTH_SHORT).show();
        }
    }
}
