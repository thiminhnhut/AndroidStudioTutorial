package desktop.minhnhut.fragmentchangeorientation;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by minhnhut on 12/11/17.
 */

public class FragmentStudentList extends ListFragment {

    ArrayList<Student> arrayList;
    StudentAdapter studentAdapter;
    TransformerStudent transformerStudent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        transformerStudent = (TransformerStudent) getActivity();

        arrayList = new ArrayList<>();

        addStudent();

        studentAdapter = new StudentAdapter(getActivity(), R.layout.row_student, arrayList);
        setListAdapter(studentAdapter);

        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
//        Toast.makeText(getActivity(), arrayList.get(position).getHoTen(), Toast.LENGTH_SHORT).show();
        transformerStudent.dataStudent(arrayList.get(position));

    }

    private void addStudent() {
        arrayList.add(new Student("Nguyễn Văn A", 1990, "Cần Thơ", "nva@gmail.com"));
        arrayList.add(new Student("Nguyễn Văn B", 1991, "Hậu Giang", "nvb@gmail.com"));
        arrayList.add(new Student("Nguyễn Văn C", 1992, "Cà Mau", "nvc@gmail.com"));
        arrayList.add(new Student("Nguyễn Văn D", 1993, "Sóc Trăng", "nvd@gmail.com"));
        arrayList.add(new Student("Nguyễn Văn E", 1994, "Bến Tre", "nve@gmail.com"));
        arrayList.add(new Student("Nguyễn Văn F", 1995, "Vĩnh Long", "nvf@gmail.com"));
    }
}
