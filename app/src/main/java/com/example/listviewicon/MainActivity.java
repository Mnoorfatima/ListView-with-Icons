package com.example.listviewicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"Apple", "Mango", "Grapes", "Banana", "Orange"};
    Integer[] images = {R.drawable.aa, R.drawable.mm, R.drawable.gg, R.drawable.bb, R.drawable.o};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter();
        listView.setAdapter(adapter);
    }

    class ArrayAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View m = getLayoutInflater().inflate(R.layout.list, null);
            TextView textView = m.findViewById(R.id.textview);
            ImageView imageView = m.findViewById(R.id.imageview);
            imageView.setImageResource(images[i]);
            textView.setText(fruits[i]);
            return m;
        }
    }
}