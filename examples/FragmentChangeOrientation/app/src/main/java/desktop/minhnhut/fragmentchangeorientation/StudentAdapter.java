package desktop.minhnhut.fragmentchangeorientation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by minhnhut on 12/11/17.
 */

public class StudentAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Student> students;

    public StudentAdapter(Context context, int layout, List<Student> students) {
        this.context = context;
        this.layout = layout;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    private class ViewHolder {
        TextView txtHoTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            viewHolder.txtHoTen = view.findViewById(R.id.txtHoTen);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Student student = students.get(i);
        viewHolder.txtHoTen.setText(student.getHoTen());

        return view;
    }
}
