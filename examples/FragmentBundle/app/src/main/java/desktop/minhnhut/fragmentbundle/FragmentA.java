package desktop.minhnhut.fragmentbundle;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by minhnhut on 12/9/17.
 */

public class FragmentA extends Fragment {

    TextView txtNoiDung;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        txtNoiDung = view.findViewById(R.id.txtNoiDung);

        Bundle bundle = getArguments();

        if (bundle != null) {
            txtNoiDung.setText(bundle.getString("hoten"));
        }

        return view;
    }
}
