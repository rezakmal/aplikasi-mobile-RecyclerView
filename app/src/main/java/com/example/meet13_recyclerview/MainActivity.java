package com.example.meet13_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meet13_recyclerview.adapters.SubjectAdapter;
import com.example.meet13_recyclerview.models.Country;
import com.example.meet13_recyclerview.models.Continent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSubject;
    private SubjectAdapter subjectAdapter;
    private ArrayList<Continent> continents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        continents = prepareData();

        subjectAdapter = new SubjectAdapter(continents, MainActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        rvSubject.setLayoutManager(manager);
        rvSubject.setAdapter(subjectAdapter);

    }

    private void initComponents() {
        rvSubject = findViewById(R.id.rvSubject);
    }

    private ArrayList<Continent> prepareData() {
        ArrayList<Continent> continents = new ArrayList<Continent>();

        Continent asia = new Continent(0, "Asia", new ArrayList<Country>());

        Country japan = new Country(0, "Japan", "http://ashishkudale.com/images/phy/sigma.png");
        Country thailand = new Country(0, "Thailand", "http://ashishkudale.com/images/phy/sigma.png");
        Country china = new Country(1, "China", "http://ashishkudale.com/images/phy/sigma.png");
        Country india = new Country(2, "India", "http://ashishkudale.com/images/phy/sigma.png");
        Country southKorea = new Country(3, "South Korea", "http://ashishkudale.com/images/phy/sigma.png");
        Country uniEmirateArab = new Country(4, "Uni Emirate Arab", "http://ashishkudale.com/images/phy/sigma.png");
        Country turkey = new Country(5, "Turkey", "http://ashishkudale.com/images/phy/sigma.png");
        Country singapore = new Country(6, "Singapore", "http://ashishkudale.com/images/phy/sigma.png");

        asia.countries.add(japan);
        asia.countries.add(thailand);
        asia.countries.add(china);
        asia.countries.add(india);
        asia.countries.add(southKorea);
        asia.countries.add(uniEmirateArab);
        asia.countries.add(turkey);
        asia.countries.add(singapore);

        // TODO()

        continents.add(asia);

        return continents;
    }
}