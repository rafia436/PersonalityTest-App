package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class whereToGoOpe extends Activity {

    private ListView listView;

    int[] images = {R.drawable.opeimg1, R.drawable.opeiflydubai2, R.drawable.opeyasisland3, R.drawable.opeqasba4, R.drawable.opeopeaventurapark5};

    String[] names = {"IMG Worlds Of Adventure", "iFly Dubai", "Yas Island", "Al Qasba", "Aventura Parks Dubai"};

    String[] place = {"Dubai", "Dubai", "Abu Dhabi", "Sharjah", "Dubai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_go_ope);

        listView = (ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
            TextView reasonTextView = (TextView) convertView.findViewById(R.id.reasonTextView);

            imageView.setImageResource(images[position]);
            nameTextView.setText(names[position]);
            reasonTextView.setText(place[position]);

            return convertView;
        }
    }
}
