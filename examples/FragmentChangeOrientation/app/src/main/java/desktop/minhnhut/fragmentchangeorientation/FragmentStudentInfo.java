package desktop.minhnhut.fragmentchangeorientation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by minhnhut on 12/11/17.
 */

public class FragmentStudentInfo extends Fragment {

    TextView txtHoTen, txtNamSinh, txtDiaChi, txtEmail;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);

        txtHoTen = view.findViewById(R.id.txtHoTen);
        txtNamSinh = view.findViewById(R.id.txtNamSinh);
        txtDiaChi = view.findViewById(R.id.txtDiaChi);
        txtEmail = view.findViewById(R.id.txtEmail);

        return view;
    }

    public void setInfo(Student student) {
        txtHoTen.setText(student.getHoTen());
        txtNamSinh.setText("Năm sinh: " + student.getNamSinh());
        txtDiaChi.setText("Địa chỉ: " + student.getDiaChi());
        txtEmail.setText("Email: " + student.getEmail());
    }
}
