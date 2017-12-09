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

public class FragmentB extends Fragment {

    TextView textViewFragB;
    EditText editTextFragB;
    Button buttonFragB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        textViewFragB = view.findViewById(R.id.textViewFragB);
        editTextFragB = view.findViewById(R.id.editTextFragB);
        buttonFragB = view.findViewById(R.id.buttonFragB);

        buttonFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(), editTextFragB.getText().toString(), Toast.LENGTH_SHORT).show();
                TextView textViewFragA = getActivity().findViewById(R.id.textViewFragA);
                textViewFragA.setText(editTextFragB.getText().toString());
            }
        });


        return view;
    }
}
