package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class whereToGoCon extends Activity {

    private ListView listView;

    int[] images = {R.drawable.conburjkhalifa1, R.drawable.conautodrome2, R.drawable.conjabalhafeet3, R.drawable.condreamland4, R.drawable.conmaritime5};

    String[] names = {"Top Of Burj Khalifa", "Dubai Autodrome", "Jabel Hafeet", "Dreamland Aqua Park", "Sharjah Maritime"};

    String[] place = {"Dubai", "Dubai", "Al Ain", "Umm Al Quwain", "Sharjah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_go_con);


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
