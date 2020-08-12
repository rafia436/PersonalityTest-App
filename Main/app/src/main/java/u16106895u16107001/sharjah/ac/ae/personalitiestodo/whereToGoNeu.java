package u16106895u16107001.sharjah.ac.ae.personalitiestodo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class whereToGoNeu extends Activity {

    private ListView listView;

    int[] images = {R.drawable.neuparksandresorts1, R.drawable.neuwildwadi2, R.drawable.neualainzoo3, R.drawable.neualnoor4, R.drawable.neualzohra5};

    String[] names = {"Dubai Parks And Resorts", "Wild Wadi Water Park", "Al Ain Zoo", "Al Noor Island", "Al-Zohra District"};

    String[] place = {"Dubai", "Dubai", "Al Ain", "Sharjah", "Ajman"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_go_neu);


        listView = (ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{

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
