package com.thebaileybrew.jurassictourguide;

import java.util.ArrayList;

public class DinoCollectionArray extends ArrayList {
    private ArrayList<dinosaur> Dinosaurs = new ArrayList<>();

    public ArrayList getDinosaurList() {
        Dinosaurs.add(new dinosaur(1, "Tyranosaurus Rex", R.drawable.trex,
                "One, Two, Three, World",
                "Carnivore",
                "Late Cretaceous (66mya)",
                "The T.Rex is one of the most dangerous hunters of the Jurassic.",
                "40 Feet",
                "25,000+ Lbs",
                "1905"));
        Dinosaurs.add(new dinosaur(2,"Stegosaurus", R.drawable.stegosaurus,
                "One, Two, Three, World",
                "Herbivore",
                "Late Jurassic (150mya)",
                "The Stegasaurus had 17 bony plates along it's back and tail in two rows.",
                "30 Feet",
                "6,000+ Lbs",
                "1876"));
        Dinosaurs.add(new dinosaur(3, "Velociraptor", R.drawable.velociraptor,
                "One, Two, Three, World",
                "Carnivore",
                "Late Cretaceous (71mya)",
                "The Velociraptor had a sharp, sickle-shaped retractable claw on each foot.",
                "6 Feet",
                "20+ Lbs",
                "1924"));
        Dinosaurs.add(new dinosaur(4, "Triceratops", R.drawable.triceratops,
                "One, Two, Three, World",
                "Herbivore",
                "Late Cretaceous (66mya)",
                "When threatened, the Triceratops charged into its enemy like modern the Rhinoceros.",
                "30 Feet",
                "12,000+ Lbs",
                "1889"));
        Dinosaurs.add(new dinosaur(5, "Parasaurolophus", R.drawable.parasaurolophus,
                "One, Two, Three, World",
                "Herbivore",
                "Late Cretaceous (73mya)",
                "The bony crest on the Parasaurolophus' head, is believed to have helped the dinosaur make a low-frequency, fog-horn-like sound.",
                "40 Feet",
                "10,000+ Lbs",
                "1922"));
        Dinosaurs.add(new dinosaur(6, "Gallimimus", R.drawable.gallimimus,
                "One, Two, World",
                "Omnivore",
                "Late Cretaceous (70mya)",
                "The Gallimimus was a fast-moving, bird-like dinosaur with a toothless beak.",
                "15 Feet",
                "900 Lbs",
                "1972"));
        Dinosaurs.add(new dinosaur(7,"Brachiosaurus", R.drawable.brachiosaurus,
                "One, Three, World",
                "Herbivore",
                "Late Jurassic (153mya)",
                "The Brachiosaurus' front legs were longer than it's rear, giving it the name \"Arm Lizard\"",
                "80 Feet",
                "64,000+ Lbs",
                "1903"));
        Dinosaurs.add(new dinosaur(8,"Dilophosaurus", R.drawable.dilophosaurus,
                "One, World",
                "Carnivore",
                "Early Jurassic (193mya)",
                "The was a fast predator, whom in the film is depicted as spitting poison - but there is no fossil evidence of this.",
                "20 Feet",
                "700 Lbs",
                "1970"));
        Dinosaurs.add(new dinosaur(9, "Compsognathus", R.drawable.compsognathus,
                "Two, Three",
                "Carnivore",
                "Late Jurassic (150mya)",
                "The Compsognathus is the smallest known dinosaur, and was about the size of a chicken.",
                "28 Inches - 4 Feet",
                "6 Lbs",
                "1859"));
        Dinosaurs.add(new dinosaur(10, "Pteranodon", R.drawable.pteranodon,
                "Two, Three, World",
                "Carnivore",
                "Late Cretaceous (84mya)",
                "The Pteranodon was actually a flying reptile, and technically not a dinosaur.",
                "30 Feet (Wingspan)",
                "55 Lbs",
                "1876"));
        Dinosaurs.add(new dinosaur(11,"Pachycephalosaurus",R.drawable.pachycephalosaurus,
                "Two, World",
                "Herbovire",
                "Late Cretaceous (66mya)",
                "The Pachycephalosaurus had an incredibly thick skull (10 inches). It's believed that this dinosaur used their hard skulls in intra-species combat as well as a defense mechanism.",
                "16 Feet",
                "1000 Lbs",
                "1938"));
        Dinosaurs.add(new dinosaur(12, "Spinosaurus", R.drawable.spinosaurus,
                "Three, World",
                "Carnivore",
                "Mid Cretaceous (110mya)",
                "The large sail along the Spinosaurus' back may have been for heat dissipation, as it lived primarily in swampy areas near the equator.",
                "40+ Feet",
                "8,000+ Lbs",
                "1915"));
        Dinosaurs.add(new dinosaur(13,"Ankylosaurus", R.drawable.ankylosaurus,
                "Three, World",
                "Herbivore",
                "Late Cretaceous (66mya)",
                "The Ankylosaurus was a tank-like dinosaur. It's entire top was covered with thick, oval plates fused into it's leathery skin. It also had two rows of spikes along it's body, horns and a club-like tail.",
                "30+ Feet",
                "6000+ Lbs",
                "1908"));
        Dinosaurs.add(new dinosaur(14, "Apatosaurus", R.drawable.apatosaurus,
                "World",
                "Herbivore",
                "Late Jurassic (150mya)",
                "Also called \"Brontosaurus\", this large dinosaur would swallow large stones to help grind up it's tough plant diet since it did not chew it's food.",
                "70+ Feet",
                "65,000+ Lbs",
                "1877"));
        Dinosaurs.add(new dinosaur(15, "Dimorphodon", R.drawable.dimorphodon,
                "World",
                "Carnivore",
                "Early Jurassic (190mya)",
                "The Dimorphodon gets it's name from the Greek for Two Teeth, because it had two distinct shapes of teeth in its jaw - which is incredibly rare among reptiles",
                "4+ Feet (Wingspan)",
                "4 Lbs",
                "1859"));
        Dinosaurs.add(new dinosaur(16, "Mosasaurus", R.drawable.mosasaurus,
                "World",
                "Carnivore",
                "Late Cretaceous (66mya)",
                "The Mosasaurus was one of the largest aquatic reptiles during the time of the dinosaurs. This creature likely lived near the ocean surface and ate anything that approached the water.",
                "40+ Feet",
                "30,000+ Lbs",
                "1822"));
        Dinosaurs.add(new dinosaur(17, "Indominus Rex",R.drawable.indominus,
                "World",
                "Carnivore",
                "Movie Only - Not Real",
                "The Indominus Rex was a genectically modified hybrid. The base genomes consisted of Tyrannosaurus Rex, Gigantosaurus, Velociraptors, Pit Vipers among several other modern creatures.",
                "50 Feet",
                "Unknown",
                "2012"));
        //Add more dinosaur listings here
        return Dinosaurs;
    }


}