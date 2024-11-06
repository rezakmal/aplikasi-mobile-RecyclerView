package com.example.meet13_recyclerview;

//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ImageAdapter adapter;
    private List<ImageModel> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Mengisi data gambar
        imageList = new ArrayList<>();
        imageList.add(new ImageModel(R.drawable.australia));
        imageList.add(new ImageModel(R.drawable.canada));
        imageList.add(new ImageModel(R.drawable.france));
        imageList.add(new ImageModel(R.drawable.greece));
        imageList.add(new ImageModel(R.drawable.italy));
        imageList.add(new ImageModel(R.drawable.japan));
        imageList.add(new ImageModel(R.drawable.korea));
        imageList.add(new ImageModel(R.drawable.latvia));
        imageList.add(new ImageModel(R.drawable.london));
        imageList.add(new ImageModel(R.drawable.usa));

        // Menampilkan dalam orientasi vertikal
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ImageAdapter(this, imageList);
        recyclerView.setAdapter(adapter);

        // Untuk menampilkan orientasi horizontal, ganti menjadi:
        // recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
