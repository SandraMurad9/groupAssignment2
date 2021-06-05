package course.edu.apps.groupassignmenttwo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import static Classes.Item.items;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.sport_recycler);

        String[] names = new String[items.length];
        int[] ids = new int[items.length];
        int [] prices = new int [items.length];
        double [] ratings = new double [items.length];

        for(int i = 0; i<names.length;i++){
            names[i] = items[i].getName();
            ids[i] = items[i].getImageID();
            prices[i] = items[i].getPrice();
            ratings[i] = items[i].getRating();
        }
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(this,names, ids,prices,ratings);
        recycler.setAdapter(adapter);
    }
}