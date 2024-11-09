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

        // ASIA

        Continent asia = new Continent(0, "Asia", new ArrayList<Country>());

        Country japan = new Country(0, "Japan", R.drawable.japan);
        Country thailand = new Country(1, "Thailand", R.drawable.thailand);
        Country china = new Country(2, "China", R.drawable.china);
        Country india = new Country(3, "India", R.drawable.india);
        Country southKorea = new Country(4, "South Korea", R.drawable.korea);
        Country uniEmirateArab = new Country(5, "Uni Emirate Arab", R.drawable.uniemiratearab);
        Country turkey = new Country(6, "Turkey", R.drawable.turkey);
        Country singapore = new Country(7, "Singapore", R.drawable.singapore);

        asia.countries.add(japan);
        asia.countries.add(thailand);
        asia.countries.add(china);
        asia.countries.add(india);
        asia.countries.add(southKorea);
        asia.countries.add(uniEmirateArab);
        asia.countries.add(turkey);
        asia.countries.add(singapore);

        continents.add(asia);

        // TODO()
        // EUROPE

        Continent europe = new Continent(0, "Europe", new ArrayList<Country>());

        Country russia = new Country(0, "Russia", R.drawable.russia);
        Country germany = new Country(1, "Germany", R.drawable.germany);
        Country france = new Country(2, "France", R.drawable.france);
        Country unitedkingdom = new Country(3, "United Kingdom", R.drawable.london);
        Country italy = new Country(4, "Italy", R.drawable.italy);
        Country spain = new Country(5, "Spain", R.drawable.spain);
        Country ukraine = new Country(6, "Ukraine", R.drawable.ukraine);
        Country poland = new Country(7, "Poland", R.drawable.poland);

        europe.countries.add(russia);
        europe.countries.add(germany);
        europe.countries.add(france);
        europe.countries.add(unitedkingdom);
        europe.countries.add(italy);
        europe.countries.add(spain);
        europe.countries.add(ukraine);
        europe.countries.add(poland);

        continents.add(europe);

        // NORTH AMERICA
        Continent northAmerica = new Continent(0, "North America", new ArrayList<Country>());

        Country unitedStates = new Country(0, "United States", R.drawable.usa);
        Country mexico = new Country(1, "Mexico", R.drawable.mexico);
        Country canada = new Country(2, "Canada", R.drawable.canada);
        Country guatemala = new Country(3, "Guatemala", R.drawable.guatemala);
        Country cuba = new Country(4, "Cuba", R.drawable.cuba);
        Country haiti = new Country(5, "Haiti", R.drawable.haiti);
        Country dominicanRepublic = new Country(6, "Dominican Republic", R.drawable.dominicanrepublic);
        Country honduras = new Country(7, "Honduras", R.drawable.honduras);

        northAmerica.countries.add(unitedStates);
        northAmerica.countries.add(mexico);
        northAmerica.countries.add(canada);
        northAmerica.countries.add(guatemala);
        northAmerica.countries.add(cuba);
        northAmerica.countries.add(haiti);
        northAmerica.countries.add(dominicanRepublic);
        northAmerica.countries.add(honduras);

        continents.add(northAmerica);

        // SOUTH AMERICA
        Continent southAmerica = new Continent(0, "South America", new ArrayList<Country>());

        Country brazil = new Country(0, "Brazil", R.drawable.brazil);
        Country colombia = new Country(1, "Colombia", R.drawable.colombia);
        Country argentina = new Country(2, "Argentina", R.drawable.argentina);
        Country peru = new Country(3, "Peru", R.drawable.peru);
        Country venezuela = new Country(4, "Venezuela", R.drawable.venezuela);

        southAmerica.countries.add(brazil);
        southAmerica.countries.add(colombia);
        southAmerica.countries.add(argentina);
        southAmerica.countries.add(peru);
        southAmerica.countries.add(venezuela);

        continents.add(southAmerica);

        // AFRICA
        Continent Africa = new Continent(0, "Africa", new ArrayList<Country>());

        Country nigeria = new Country(0, "Nigeria", R.drawable.nigeria);
        Country ethiopia = new Country(1, "Ethiopia", R.drawable.ethiopia);
        Country egypt = new Country(2, "Egypt", R.drawable.egypt);
        Country democraticRepublicCongo = new Country(3, "Democratic Republic of the Congo", R.drawable.congo);
        Country southAfrica = new Country(4, "South Africa", R.drawable.southafrica);

        Africa.countries.add(nigeria);
        Africa.countries.add(ethiopia);
        Africa.countries.add(egypt);
        Africa.countries.add(democraticRepublicCongo);
        Africa.countries.add(southAfrica);

        continents.add(Africa);

        // AUSTRALIA
        Continent australia = new Continent(0, "Australia", new ArrayList<Country>());

        Country Australia = new Country(0, "Australia", R.drawable.australia);
        Country newZealand = new Country(1, "New Zealand", R.drawable.newzealand);

        australia.countries.add(Australia);
        australia.countries.add(newZealand);

        continents.add(australia);

        // ANTARTICA
        Continent antartica = new Continent(0, "Antartica", new ArrayList<Country>());

        Country Antartica = new Country(0, "Antartica", R.drawable.antartica);

        antartica.countries.add(Antartica);

        continents.add(antartica);



        return continents;
    }
}