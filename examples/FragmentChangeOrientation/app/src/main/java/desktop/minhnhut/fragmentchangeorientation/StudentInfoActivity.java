package desktop.minhnhut.fragmentchangeorientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("ThongTinSinhVien");

        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragDetail);

        fragmentStudentInfo.setInfo(student);
    }
}
