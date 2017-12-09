package desktop.minhnhut.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by minhnhut on 12/9/17.
 */

public class FragmentA extends Fragment {

    TextView textViewFragA;
    EditText editTextFragA;
    Button buttonFragA;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        textViewFragA = view.findViewById(R.id.textViewFragA);
        editTextFragA = view.findViewById(R.id.editTextFragA);
        buttonFragA = view.findViewById(R.id.buttonFragA);

        buttonFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), editTextFragA.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public void GanNoiDung(String noidung) {
        textViewFragA.setText(noidung);
    }
}
