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
        String movieSelection = getFragIntent.getStringExtra(getString(R.string.FromMovie_Intent_String));

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
                people.setText(currentPeep.getPeople());
                if (currentPeep.getPeopleLocation().contains(getString(R.string.World_validation)) ||
                        currentPeep.getPeopleLocation().contains(getString(R.string.Fallen_validation))) {
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
                if (currentPeep.getPeopleLocation().contains(getString(R.string.One_validation))) {
                    peopleLocation.append(getString(R.string.Space_Jurassic_Park));
                    peopleLocation.append("\n");
                }
                if (currentPeep.getPeopleLocation().contains(getString(R.string.Two_validation))) {
                    peopleLocation.append(getString(R.string.Space_The_Lost_World));
                    peopleLocation.append("\n");
                }
                if (currentPeep.getPeopleLocation().contains(getString(R.string.Three_validation))) {
                    peopleLocation.append(getString(R.string.Space_Jurassic_Three));
                    peopleLocation.append("\n");
                }
                if (currentPeep.getPeopleLocation().contains(getString(R.string.World_validation))) {
                    peopleLocation.append(getString(R.string.Space_Jurassic_World));
                    peopleLocation.append("\n");
                }
                if (currentPeep.getPeopleLocation().contains(getString(R.string.Fallen_validation))) {
                    peopleLocation.append(getString(R.string.Space_World_Fallen_Kingdom));
                    peopleLocation.append("\n");
                }
                peopleDetails.setText(getString(R.string.character_details));
                peopleDetails.append("\n  ");
                peopleDetails.append(currentPeep.getPeopleDetails());
            }
        });
        recyclerView.setAdapter(adapter);
    }
}
