package desktop.minhnhut.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by minhnhut on 12/11/17.
 */

public class FragmentAlertDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());

        dialog.setTitle("Xác nhận");
        dialog.setMessage("Bạn có muốn xóa sản phẩm này không?");

        dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Đồng ý xóa sản phầm", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Không đồng ý xóa sản phầm", Toast.LENGTH_SHORT).show();
            }
        });

        Dialog _dialog = dialog.create();
        _dialog.setCanceledOnTouchOutside(false);

        return _dialog;
    }
}
