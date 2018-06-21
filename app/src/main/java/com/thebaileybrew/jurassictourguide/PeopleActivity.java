package com.thebaileybrew.jurassictourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PeopleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<people> Temp = new ArrayList<>();
    ArrayList<people> People = new ArrayList<>();

    TextView people, peopleActor, peopleClassification, peopleLocation, peopleDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people_recycler);
        Intent getFragIntent = getIntent();
        String movieSelection = getFragIntent.getStringExtra("FromMovie");

        people = findViewById(R.id.people);
        peopleActor = findViewById(R.id.people_actor);
        peopleClassification = findViewById(R.id.people_classification);
        peopleLocation = findViewById(R.id.people_location);
        peopleDetails = findViewById(R.id.people_details);

        DinoCollectionArray importantPeople = new DinoCollectionArray();
        Temp = importantPeople.getPeopleList();
        for (people peeps : Temp) {
            if (peeps.getPeopleLocation().contains(movieSelection)) {
                People.add(peeps);
            }
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView = findViewById(R.id.people_recycler);
        recyclerView.setLayoutManager(linearLayoutManager);
        PeopleAdapter adapter = new PeopleAdapter(this, People, new CustomRecyclerListener() {
            @Override
            public void onItemClick(View v, int position) {
                people currentPeep = People.get(position);
                String selected = currentPeep.getPeople();
                Toast.makeText(PeopleActivity.this, "You've selected: " + selected,
                        Toast.LENGTH_SHORT).show();
                people.setText(currentPeep.getPeople());
                if (currentPeep.getPeopleLocation().contains("World") ||
                        currentPeep.getPeopleLocation().contains("Fallen")) {
                    people.setTextColor(getResources().getColor(R.color.colorAccentWorld));
                } else {
                    people.setTextColor(getResources().getColor(R.color.colorPrimary));
                }
                peopleActor.setText(getString(R.string.portrayed_by));
                peopleActor.append("  ");
                peopleActor.append(currentPeep.getPeopleActor());
                peopleClassification.setText(getString(R.string.role_in_films));
                peopleClassification.append("  ");
                peopleClassification.setText(currentPeep.getPeopleClassification());
                peopleLocation.setText(getString(R.string.films_appeared));
                peopleLocation.append("\n");
                if (currentPeep.getPeopleLocation().contains("One")) {
                    peopleLocation.append("  Jurassic Park\n"); }
                if (currentPeep.getPeopleLocation().contains("Two")) {
                    peopleLocation.append("  The Lost World: Jurassic Park\n"); }
                if (currentPeep.getPeopleLocation().contains("Three")) {
                    peopleLocation.append("  Jurassic Park III\n"); }
                if (currentPeep.getPeopleLocation().contains("World")) {
                    peopleLocation.append("  Jurassic World\n"); }
                if (currentPeep.getPeopleLocation().contains("Fallen")) {
                    peopleLocation.append("  Jurassic World: Fallen Kingdom\n"); }
                peopleDetails.setText(getString(R.string.character_details));
                peopleDetails.append("\n  ");
                peopleDetails.append(currentPeep.getPeopleDetails());
            }
        });
        recyclerView.setAdapter(adapter);
    }
}
