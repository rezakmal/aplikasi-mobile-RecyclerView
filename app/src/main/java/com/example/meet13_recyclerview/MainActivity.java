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
        Country thailand = new Country(1, "Thailand", "http://ashishkudale.com/images/phy/sigma.png");
        Country china = new Country(2, "China", "https://unsplash.com/photos/a-view-of-the-great-wall-of-china-in-the-fog-80OWrQGTtG8");
        Country india = new Country(3, "India", "http://ashishkudale.com/images/phy/sigma.png");
        Country southKorea = new Country(4, "South Korea", "http://ashishkudale.com/images/phy/sigma.png");
        Country uniEmirateArab = new Country(5, "Uni Emirate Arab", "http://ashishkudale.com/images/phy/sigma.png");
        Country turkey = new Country(6, "Turkey", "http://ashishkudale.com/images/phy/sigma.png");
        Country singapore = new Country(7, "Singapore", "http://ashishkudale.com/images/phy/sigma.png");

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

        Continent europe = new Continent(0, "Europe", new ArrayList<Country>());

        Country russia = new Country(0, "Russia", "http://ashishkudale.com/images/phy/sigma.png");
        Country germany = new Country(1, "Germany", "http://ashishkudale.com/images/phy/sigma.png");
        Country france = new Country(2, "France", "http://ashishkudale.com/images/phy/sigma.png");
        Country unitedkingdom = new Country(3, "United Kingdom", "http://ashishkudale.com/images/phy/sigma.png");
        Country italy = new Country(4, "Italy", "http://ashishkudale.com/images/phy/sigma.png");
        Country spain = new Country(5, "Spain", "http://ashishkudale.com/images/phy/sigma.png");
        Country ukraine = new Country(6, "Ukraine", "http://ashishkudale.com/images/phy/sigma.png");
        Country poland = new Country(7, "Poland", "http://ashishkudale.com/images/phy/sigma.png");

        europe.countries.add(russia);
        europe.countries.add(germany);
        europe.countries.add(france);
        europe.countries.add(unitedkingdom);
        europe.countries.add(italy);
        europe.countries.add(spain);
        europe.countries.add(ukraine);
        europe.countries.add(poland);

        continents.add(europe);

        Continent northAmerica = new Continent(0, "North America", new ArrayList<Country>());

        Country unitedStates = new Country(0, "United States", "http://ashishkudale.com/images/phy/sigma.png");
        Country mexico = new Country(1, "Mexico", "http://ashishkudale.com/images/phy/sigma.png");
        Country canada = new Country(2, "Canada", "http://ashishkudale.com/images/phy/sigma.png");
        Country guatemala = new Country(3, "Guatemala", "http://ashishkudale.com/images/phy/sigma.png");
        Country cuba = new Country(4, "Cuba", "http://ashishkudale.com/images/phy/sigma.png");
        Country haiti = new Country(5, "Haiti", "http://ashishkudale.com/images/phy/sigma.png");
        Country dominicanRepublic = new Country(6, "Dominican Republic", "http://ashishkudale.com/images/phy/sigma.png");
        Country honduras = new Country(7, "Honduras", "http://ashishkudale.com/images/phy/sigma.png");

        northAmerica.countries.add(unitedStates);
        northAmerica.countries.add(mexico);
        northAmerica.countries.add(canada);
        northAmerica.countries.add(guatemala);
        northAmerica.countries.add(cuba);
        northAmerica.countries.add(haiti);
        northAmerica.countries.add(dominicanRepublic);
        northAmerica.countries.add(honduras);

        continents.add(northAmerica);

        Continent southAmerica = new Continent(0, "South America", new ArrayList<Country>());

        Country brazil = new Country(0, "Brazil", "http://ashishkudale.com/images/phy/sigma.png");
        Country colombia = new Country(1, "Colombia", "http://ashishkudale.com/images/phy/sigma.png");
        Country argentina = new Country(2, "Argentina", "http://ashishkudale.com/images/phy/sigma.png");
        Country peru = new Country(3, "Peru", "http://ashishkudale.com/images/phy/sigma.png");
        Country venezuela = new Country(4, "Venezuela", "http://ashishkudale.com/images/phy/sigma.png");

        southAmerica.countries.add(brazil);
        southAmerica.countries.add(colombia);
        southAmerica.countries.add(argentina);
        southAmerica.countries.add(peru);
        southAmerica.countries.add(venezuela);

        continents.add(southAmerica);

        Continent Africa = new Continent(0, "Africa", new ArrayList<Country>());

        Country nigeria = new Country(0, "Nigeria", "http://ashishkudale.com/images/phy/sigma.png");
        Country ethiopia = new Country(1, "Ethiopia", "http://ashishkudale.com/images/phy/sigma.png");
        Country egypt = new Country(2, "Egypt", "http://ashishkudale.com/images/phy/sigma.png");
        Country democraticRepublicCongo = new Country(3, "Democratic Republic of the Congo", "http://ashishkudale.com/images/phy/sigma.png");
        Country southAfrica = new Country(4, "South Africa", "http://ashishkudale.com/images/phy/sigma.png");

        Africa.countries.add(nigeria);
        Africa.countries.add(ethiopia);
        Africa.countries.add(egypt);
        Africa.countries.add(democraticRepublicCongo);
        Africa.countries.add(southAfrica);

        continents.add(Africa);

        Continent australia = new Continent(0, "Australia", new ArrayList<Country>());

        Country Australia = new Country(0, "Australia", "http://ashishkudale.com/images/phy/sigma.png");
        Country newZealand = new Country(1, "New Zealand", "http://ashishkudale.com/images/phy/sigma.png");

        australia.countries.add(Australia);
        australia.countries.add(newZealand);

        continents.add(australia);

        Continent antartica = new Continent(0, "Antartica", new ArrayList<Country>());

        Country Antartica = new Country(0, "Antartica", "http://ashishkudale.com/images/phy/sigma.png");

        antartica.countries.add(Antartica);

        continents.add(antartica);



        return continents;
    }
}