package desktop.minhnhut.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by minhnhut on 12/11/17.
 */

public class FragmentListView extends ListFragment {
    private String[] arrayCity = {"Hà Nội", "Hải Phòng", "Cần Thơ", "Hồ Chí Minh", "Đà Lạt", "Cà Mau", "Đà Nẵng"};
    private ArrayAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayCity);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_listview, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(), arrayCity[position], Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
