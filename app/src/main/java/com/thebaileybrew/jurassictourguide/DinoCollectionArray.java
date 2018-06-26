package com.thebaileybrew.jurassictourguide;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

public class DinoCollectionArray extends ArrayList {
    private ArrayList<dinosaur> Dinosaurs = new ArrayList<>();
    private ArrayList<people> People = new ArrayList<>();
    private ArrayList<sublocations> SubLocations = new ArrayList<>();
    private ArrayList<event> Events = new ArrayList<>();

    //ArrayList complete with String Resources
    public ArrayList getDinosaurList() {
        Dinosaurs.add(new dinosaur(1, App.getContext().getResources().getString(R.string.Tyranosaurus_rex), R.drawable.trex,
                App.getContext().getResources().getString(R.string.One_two_three_world),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.trex_hunter),
                App.getContext().getResources().getString(R.string.Feet_40),
                App.getContext().getResources().getString(R.string.Lbs_25000),
                App.getContext().getResources().getString(R.string.Year_1905)));
        Dinosaurs.add(new dinosaur(2, App.getContext().getResources().getString(R.string.Stegosaurus), R.drawable.stegosaurus,
                App.getContext().getResources().getString(R.string.One_two_three_world),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Jurassic),
                App.getContext().getResources().getString(R.string.Steg_fact),
                App.getContext().getResources().getString(R.string.Feet_30),
                App.getContext().getResources().getString(R.string.Lbs_6000),
                App.getContext().getResources().getString(R.string.Year_1876)));
        Dinosaurs.add(new dinosaur(3, App.getContext().getResources().getString(R.string.Velociraptor), R.drawable.velociraptor,
                App.getContext().getResources().getString(R.string.One_two_three_world),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Velociraptor_fact),
                App.getContext().getResources().getString(R.string.Feet_6),
                App.getContext().getResources().getString(R.string.Lbs_20),
                App.getContext().getResources().getString(R.string.Year_1924)));
        Dinosaurs.add(new dinosaur(4, App.getContext().getResources().getString(R.string.Triceratops), R.drawable.triceratops,
                App.getContext().getResources().getString(R.string.One_two_three_world),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Triceratops_fact),
                App.getContext().getResources().getString(R.string.Feet_30),
                App.getContext().getResources().getString(R.string.Lbs_12000),
                App.getContext().getResources().getString(R.string.Year_1889)));
        Dinosaurs.add(new dinosaur(5, App.getContext().getResources().getString(R.string.Parasaurolophus), R.drawable.parasaurolophus,
                App.getContext().getResources().getString(R.string.One_two_three_world),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Para_fact),
                App.getContext().getResources().getString(R.string.Feet_40),
                App.getContext().getResources().getString(R.string.Lbs_10000),
                App.getContext().getResources().getString(R.string.Year_1922)));
        Dinosaurs.add(new dinosaur(6, App.getContext().getResources().getString(R.string.Gallimimus), R.drawable.gallimimus,
                App.getContext().getResources().getString(R.string.One_two_world),
                App.getContext().getResources().getString(R.string.Omnivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.gallimimus_fact),
                App.getContext().getResources().getString(R.string.Feet_15),
                App.getContext().getResources().getString(R.string.Lbs_900),
                App.getContext().getResources().getString(R.string.Year_1972)));
        Dinosaurs.add(new dinosaur(7, App.getContext().getResources().getString(R.string.Brachiosaurus), R.drawable.brachiosaurus,
                App.getContext().getResources().getString(R.string.One_two_world),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Jurassic),
                App.getContext().getResources().getString(R.string.Brach_fact),
                App.getContext().getResources().getString(R.string.Feet_80),
                App.getContext().getResources().getString(R.string.Lbs_64000),
                App.getContext().getResources().getString(R.string.Year_1903)));
        Dinosaurs.add(new dinosaur(8, App.getContext().getResources().getString(R.string.Dilophosaurus), R.drawable.dilophosaurus,
                App.getContext().getResources().getString(R.string.One_world),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Early_Jurassic),
                App.getContext().getResources().getString(R.string.Diloph_fact),
                App.getContext().getResources().getString(R.string.Feet_20),
                App.getContext().getResources().getString(R.string.Lbs_700),
                App.getContext().getResources().getString(R.string.Year_1970)));
        Dinosaurs.add(new dinosaur(9, App.getContext().getResources().getString(R.string.Compsognathus), R.drawable.compsognathus,
                App.getContext().getResources().getString(R.string.Two_three),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Late_Jurassic),
                App.getContext().getResources().getString(R.string.Compy_fact),
                App.getContext().getResources().getString(R.string.Feet_4_Inch_28),
                App.getContext().getResources().getString(R.string.Lbs_6),
                App.getContext().getResources().getString(R.string.Year_1859)));
        Dinosaurs.add(new dinosaur(10, App.getContext().getResources().getString(R.string.Pteranodon), R.drawable.pteranodon,
                App.getContext().getResources().getString(R.string.Two_three_world),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Pteranodon_fact),
                App.getContext().getResources().getString(R.string.Wingspan_30_Feet),
                App.getContext().getResources().getString(R.string.Lbs_55),
                App.getContext().getResources().getString(R.string.Year_1876)));
        Dinosaurs.add(new dinosaur(11, App.getContext().getResources().getString(R.string.Pachycephalosaurus), R.drawable.pachycephalosaurus,
                App.getContext().getResources().getString(R.string.Two_world),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Pachy_fact),
                App.getContext().getResources().getString(R.string.Feet_16),
                App.getContext().getResources().getString(R.string.Lbs_1000),
                App.getContext().getResources().getString(R.string.Year_1938)));
        Dinosaurs.add(new dinosaur(12, App.getContext().getResources().getString(R.string.Spinosaurus), R.drawable.spinosaurus,
                App.getContext().getResources().getString(R.string.Three_world),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Mid_Cretaceous),
                App.getContext().getResources().getString(R.string.Spinosaurus_fact),
                App.getContext().getResources().getString(R.string.Feet_40Plus),
                App.getContext().getResources().getString(R.string.Lbs_8000),
                App.getContext().getResources().getString(R.string.Year_1915)));
        Dinosaurs.add(new dinosaur(13, App.getContext().getResources().getString(R.string.Ankylosaurus), R.drawable.ankylosaurus,
                App.getContext().getResources().getString(R.string.Three_world),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Anky_fact),
                App.getContext().getResources().getString(R.string.Feet_30),
                App.getContext().getResources().getString(R.string.Lbs_6000),
                App.getContext().getResources().getString(R.string.Year_1908)));
        Dinosaurs.add(new dinosaur(14, App.getContext().getResources().getString(R.string.Apatosaurus), R.drawable.apatosaurus,
                App.getContext().getResources().getString(R.string.World_validation),
                App.getContext().getResources().getString(R.string.Herbivore),
                App.getContext().getResources().getString(R.string.Late_Jurassic),
                App.getContext().getResources().getString(R.string.Apat_fact),
                App.getContext().getResources().getString(R.string.Feet_70),
                App.getContext().getResources().getString(R.string.Lbs_65000),
                App.getContext().getResources().getString(R.string.Year_1877)));
        Dinosaurs.add(new dinosaur(15, App.getContext().getResources().getString(R.string.Dimorphodon), R.drawable.dimorphodon,
                App.getContext().getResources().getString(R.string.World_validation),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Early_Jurassic),
                App.getContext().getResources().getString(R.string.Dimorph_fact),
                App.getContext().getResources().getString(R.string.Feet_4_Wingspan),
                App.getContext().getResources().getString(R.string.Lbs_6),
                App.getContext().getResources().getString(R.string.Year_1859)));
        Dinosaurs.add(new dinosaur(16, App.getContext().getResources().getString(R.string.Mosasaurus), R.drawable.mosasaurus,
                App.getContext().getResources().getString(R.string.World_validation),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Late_Cretaceous),
                App.getContext().getResources().getString(R.string.Mos_fact),
                App.getContext().getResources().getString(R.string.Feet_40Plus),
                App.getContext().getResources().getString(R.string.Lbs_30000),
                App.getContext().getResources().getString(R.string.Year_1822)));
        Dinosaurs.add(new dinosaur(17, App.getContext().getResources().getString(R.string.Indominous_Rex), R.drawable.indominus,
                App.getContext().getResources().getString(R.string.World_validation),
                App.getContext().getResources().getString(R.string.Carnivore),
                App.getContext().getResources().getString(R.string.Movie_Only),
                App.getContext().getResources().getString(R.string.Indom_fact),
                App.getContext().getResources().getString(R.string.Feet_50),
                App.getContext().getResources().getString(R.string.Unknown),
                App.getContext().getResources().getString(R.string.Year_2012)));
        //Add more dinosaur listings here
        return Dinosaurs;
    }

    //ArrayList complete with String Resources
    public ArrayList getPeopleList() {
        People.add(new people(1, App.getContext().getResources().getString(R.string.Dr_Grant), R.drawable.alangrant,
                App.getContext().getResources().getString(R.string.One_Three),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.Sam_Neill),
                App.getContext().getResources().getString(R.string.Fact_Grant)));
        People.add(new people(2, App.getContext().getResources().getString(R.string.Dr_Satler), R.drawable.elliesatler,
                App.getContext().getResources().getString(R.string.One_Three),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.Laura_Dern),
                App.getContext().getResources().getString(R.string.Fact_Satler)));
        People.add(new people(3, App.getContext().getResources().getString(R.string.Dr_Malcolm), R.drawable.ianmalcolm,
                App.getContext().getResources().getString(R.string.One_Two_Fallen),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.Jeff_Goldblum),
                App.getContext().getResources().getString(R.string.Fact_Malcolm)));
        People.add(new people(4, App.getContext().getResources().getString(R.string.Dr_Henry_Wu), R.drawable.henrywu,
                App.getContext().getResources().getString(R.string.One_World_Fallen),
                App.getContext().getResources().getString(R.string.Antagonist),
                App.getContext().getResources().getString(R.string.B_D_Wong),
                App.getContext().getResources().getString(R.string.Fact_Wu)));
        People.add(new people(5, App.getContext().getResources().getString(R.string.John_Hammond), R.drawable.johnhammond,
                App.getContext().getResources().getString(R.string.One_two),
                App.getContext().getResources().getString(R.string.Bystander_Antagonist),
                App.getContext().getResources().getString(R.string.Richard_Attenborough),
                App.getContext().getResources().getString(R.string.Fact_Hammond)));
        People.add(new people(6, App.getContext().getResources().getString(R.string.Paul_Kirby), R.drawable.paulkirby,
                App.getContext().getResources().getString(R.string.Three_validation),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.William_H_Macy),
                App.getContext().getResources().getString(R.string.Fact_Paul)));
        People.add(new people(7, App.getContext().getResources().getString(R.string.Billy_Brennan), R.drawable.billybrennan,
                App.getContext().getResources().getString(R.string.Three_validation),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.Alessandro_Nivola),
                App.getContext().getResources().getString(R.string.Fact_Billy)));
        People.add(new people(8, App.getContext().getResources().getString(R.string.Owen_Grady), R.drawable.owengrady,
                App.getContext().getResources().getString(R.string.World_fallen),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.Chris_Pratt),
                App.getContext().getResources().getString(R.string.Fact_Owen)));
        People.add(new people(9, App.getContext().getResources().getString(R.string.Clarie_Dearing), R.drawable.clairedearing,
                App.getContext().getResources().getString(R.string.World_fallen),
                App.getContext().getResources().getString(R.string.Protagonist),
                App.getContext().getResources().getString(R.string.Bryce_Dallas_Howard),
                App.getContext().getResources().getString(R.string.Fact_Claire)));
        return People;
    }

    //ArrayList complete with String Resources
    public ArrayList getSublocationList() {
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Brach_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_Central),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.brach_map, R.drawable.brach_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Gall_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_South),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.gallimimus_map, R.drawable.gallimimus_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Triceratops_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_Central),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.triceratops_map, R.drawable.triceratops_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Para_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_Central),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.parasaur_map, R.drawable.parasaur_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Rex_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_East),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.rex_map, R.drawable.rex_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Raptor_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_West_Compound),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.raptor_map, R.drawable.raptor_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Diloph_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_East),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.diloph_map, R.drawable.diloph_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Herr_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_West),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.herra_map, R.drawable.herra_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Bary_enclosure),
                App.getContext().getResources().getString(R.string.Isla_N_South),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.baryonyx_map, R.drawable.baryonyx_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Vis_Center),
                App.getContext().getResources().getString(R.string.Isla_N_West_Compound),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.visitor_map, R.drawable.visitor_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Port),
                App.getContext().getResources().getString(R.string.Isla_N_North_East),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.port_map, R.drawable.port_icon));
        SubLocations.add(new sublocations(App.getContext().getResources().getString(R.string.Helipad),
                App.getContext().getResources().getString(R.string.Isla_N_South),
                App.getContext().getResources().getString(R.string.One_validation),
                R.drawable.helipad_map, R.drawable.helipad_icon));
        return SubLocations;
    }

    //ArrayList complete with String Resources
    public ArrayList<event> getEvents() {
        Events.add(new event(R.drawable.nublar_incident, 1992,
                App.getContext().getResources().getString(R.string.Isla_Nublar_Incident),
                App.getContext().getResources().getString(R.string.Robert_Muldoon),
                App.getContext().getResources().getString(R.string.Isla_N_Containment_Pen),
                App.getContext().getResources().getString(R.string.Jurassic_Park),
                App.getContext().getResources().getString(R.string.Incident_Nublar_Details)));
        Events.add(new event(R.drawable.park_incident, 1993,
                App.getContext().getResources().getString(R.string.T_Rex_Incident),
                App.getContext().getResources().getString(R.string.Grant_Murphy_Malcolm),
                App.getContext().getResources().getString(R.string.Isla_N_Rex_Paddock),
                App.getContext().getResources().getString(R.string.Jurassic_Park),
                App.getContext().getResources().getString(R.string.Incident_Rex_Paddock_Details)));
        Events.add(new event(R.drawable.nedry_incident, 1993,
                App.getContext().getResources().getString(R.string.Dilop_Incident),
                App.getContext().getResources().getString(R.string.Dennis_Nedry),
                App.getContext().getResources().getString(R.string.Isla_N_Access_Rd),
                App.getContext().getResources().getString(R.string.Jurassic_Park),
                App.getContext().getResources().getString(R.string.Incident_Diloph_Details)));
        Events.add(new event(R.drawable.bowman_incident, 1996,
                App.getContext().getResources().getString(R.string.Compy_Incident),
                App.getContext().getResources().getString(R.string.Bowman_Family),
                App.getContext().getResources().getString(R.string.Isla_N_Coast),
                App.getContext().getResources().getString(R.string.The_Lost_World),
                App.getContext().getResources().getString(R.string.Incident_Compy_Details)));
        Events.add(new event(R.drawable.rescue_incident, 1997,
                App.getContext().getResources().getString(R.string.Sorna_Rescue_Incident),
                App.getContext().getResources().getString(R.string.Malcolm_Harding_Carr_Owen),
                App.getContext().getResources().getString(R.string.Isla_S),
                App.getContext().getResources().getString(R.string.The_Lost_World),
                App.getContext().getResources().getString(R.string.Incident_Rescue_Sorna)));
        Events.add(new event(R.drawable.hunt_incident, 1997,
                App.getContext().getResources().getString(R.string.Rex_Capture_Incident),
                App.getContext().getResources().getString(R.string.Ludlow_Tembo_Malcolm),
                App.getContext().getResources().getString(R.string.Isla_S_Central),
                App.getContext().getResources().getString(R.string.The_Lost_World),
                App.getContext().getResources().getString(R.string.Incident_Rex_Capture_Details)));
        Events.add(new event(R.drawable.sandiego_incident, 1997,
                App.getContext().getResources().getString(R.string.San_Diego_Incident),
                App.getContext().getResources().getString(R.string.Malcolm_Harding),
                App.getContext().getResources().getString(R.string.San_Diego_California),
                App.getContext().getResources().getString(R.string.The_Lost_World),
                App.getContext().getResources().getString(R.string.Incident_San_Diego_Details)));
        Events.add(new event(R.drawable.dinobreed_incident, 1997,
                App.getContext().getResources().getString(R.string.New_Species_Incident),
                App.getContext().getResources().getString(R.string.Unnamed_InGen),
                App.getContext().getResources().getString(R.string.Isla_S),
                App.getContext().getResources().getString(R.string.Jurassic_Three),
                App.getContext().getResources().getString(R.string.Incident_New_Species)));
        Events.add(new event(R.drawable.worldplan_incident, 1998,
                App.getContext().getResources().getString(R.string.JW_Planning_Incident),
                App.getContext().getResources().getString(R.string.Simon_Masrani),
                App.getContext().getResources().getString(R.string.Masrani_Global),
                App.getContext().getResources().getString(R.string.Jurassic_World),
                App.getContext().getResources().getString(R.string.Incident_World_Planning)));
        Events.add(new event(R.drawable.kirby_incident, 2001,
                App.getContext().getResources().getString(R.string.E_Kirby_Rescue_Incident),
                App.getContext().getResources().getString(R.string.Grant_EKirby_PKirby),
                App.getContext().getResources().getString(R.string.Isla_S),
                App.getContext().getResources().getString(R.string.Jurassic_Three),
                App.getContext().getResources().getString(R.string.Incident_Rescue_Kirby_Details)));
        Events.add(new event(R.drawable.raptor_incident, 2001,
                App.getContext().getResources().getString(R.string.Raptor_incident),
                App.getContext().getResources().getString(R.string.Grant_Brennan),
                App.getContext().getResources().getString(R.string.Isla_S),
                App.getContext().getResources().getString(R.string.Jurassic_Three),
                App.getContext().getResources().getString(R.string.Incident_Raptor_Hunt_Details)));
        Events.add(new event(R.drawable.masrani_incident, 2004,
                App.getContext().getResources().getString(R.string.World_New_Dino_Incident),
                App.getContext().getResources().getString(R.string.Dr_Henry_Wu),
                App.getContext().getResources().getString(R.string.Isla_N),
                App.getContext().getResources().getString(R.string.Jurassic_World),
                App.getContext().getResources().getString(R.string.Incident_New_Dino_Details)));
        Events.add(new event(R.drawable.irex_incident, 2009,
                App.getContext().getResources().getString(R.string.Hybrid_Incident),
                App.getContext().getResources().getString(R.string.Dr_Henry_Wu),
                App.getContext().getResources().getString(R.string.Isla_N),
                App.getContext().getResources().getString(R.string.Jurassic_World),
                App.getContext().getResources().getString(R.string.Incident_Hybrid_Details)));
        Events.add(new event(R.drawable.world_incident, 1997,
                App.getContext().getResources().getString(R.string.Jurassic_World_Incident),
                App.getContext().getResources().getString(R.string.Grady_Dearing),
                App.getContext().getResources().getString(R.string.Isla_N),
                App.getContext().getResources().getString(R.string.Jurassic_World),
                App.getContext().getResources().getString(R.string.Incident_World_Details)));
        return Events;
    }
}
