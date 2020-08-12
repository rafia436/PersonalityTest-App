package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class whereToGoExy extends Activity {

    private ListView listView;

    int[] images = {R.drawable.extski1, R.drawable.extdubaifountain2, R.drawable.extautomuseum3, R.drawable.extinterieurmusee4, R.drawable.extkhattsprings5};

    String[] names = {"Ski Dubai", "Dubai Fountain", "National Auto Museum", "Sharjah Car Museum", "Khatt Springs"};

    String[] place = {"Dubai", "Dubai", "Abu Dhabi", "Sharjah", "RAK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_go_exy);

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
