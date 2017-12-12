package desktop.minhnhut.fragmentchangeorientation;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TransformerStudent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void dataStudent(Student student) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragInfo);

        Configuration configuration = getResources().getConfiguration();
        //fragmentStudentInfo != null && fragmentStudentInfo.isInLayout()
        if (fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentStudentInfo.setInfo(student);
        } else {
            Intent intent = new Intent(this, StudentInfoActivity.class);
            intent.putExtra("ThongTinSinhVien", student);
            startActivity(intent);
        }
    }
}
