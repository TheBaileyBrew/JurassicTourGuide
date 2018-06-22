package com.thebaileybrew.jurassictourguide;

import java.util.ArrayList;

public class DinoCollectionArray extends ArrayList {
    private ArrayList<dinosaur> Dinosaurs = new ArrayList<>();
    private ArrayList<people> People = new ArrayList<>();
    private ArrayList<locations> Location = new ArrayList<>();
    private ArrayList<sublocations> SubLocations = new ArrayList<>();
    private ArrayList<event> Events = new ArrayList<>();

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

    public ArrayList getPeopleList() {
        People.add(new people(1,"Dr. Alan Grant",R.drawable.alangrant, "One, Three",
                "Protagonist",
                "Sam Neill",
                "Dr. Grant was first introduced as an archaeologist in Montana digging " +
                        "for Velociraptor fossils. He is approached by John Hammond in an attempt to " +
                        "have Dr. Grant sign off on the unbelievable Jurassic Park. Through the " +
                        "series of films, Dr. Grant transitions from wide-eyed awe to much more " +
                        "cynical and standoffish."));
        People.add(new people(2,"Dr. Ellie Satler",R.drawable.elliesatler, "One, Three",
                "Protagonist",
                "Laura Dern",
                "Dr. Satler is a Paleobotanist who is introduced with Dr. Grant in " +
                        "Montana. In the first film Dr. Satler learns that the team behind Jurassic Park " +
                        "hadn't actually taken into consideration how the island itself wasn't habitable" +
                        " for the dinosaurs they created, as some of the plant life was actually toxic."));
        People.add(new people(3,"Dr. Ian Malcolm", R.drawable.ianmalcolm, "One, Two, Fallen",
                "Protagonist",
                "Jeff Goldblum",
                "Dr. Malcolm is one of the main characters in the first films, and acts " +
                        "as the ironic commentator through much of the films. He is a brilliant " +
                        "mathematician who specialized in chaos theory. Based on \'chaos theory\' Malcolm " +
                        "is able to make several predictions about the inherent dangers and ultimate failures " +
                        "of trying to control nature through genetic power."));
        People.add(new people(4, "Dr. Henry Wu", R.drawable.henrywu, "One, World, Fallen",
                "Bystander / Antagonist",
                "B.D. Wong",
                "Dr. Wu was the chief genetic engineer in Jurassic Park, and takes great pride" +
                        " in what he has accomplished. After the havoc on Isla Nublar, he believes that there" +
                        " simply not enough control. He felt that when the dinosaurs proved to be " +
                        "breeding on the island, that was a \"tremendous validation of his work.\"" +
                        " It's this belief that motivates Dr. Wu to further his research in Jurassic World and" +
                        " eventually engineer the Indominus Rex."));
        People.add(new people(5,"John Hammond", R.drawable.johnhammond,"One, Two",
                "Bystander / Antagonist",
                "Richard Attenborough",
                "John Hammond is the founder of InGen, and believes that his dream of " +
                        "creating a park that encourages every attendee to stop in wonder and awe of " +
                        "the scientific reality of dinosaurs walking on the earth again. Hammond is " +
                        "a kind, jovial and charismatic individual. Although his intent seemed to be " +
                        "pure-of-heart, his vision turned out to be a truly dangerous idea."));
        People.add(new people(6, "Paul Kirby", R.drawable.paulkirby,
                "Three",
                "Bystander / Protagonist",
                "William H. Macy",
                "Mr. Kirby, along with his ex-wife, Amanda, pose as a wealthy couple to lure " +
                        "Dr. Grant onto Isla Sorna under the facade of a sight-seeing aerial tour. Ultimately, " +
                        "Paul's goal is to land on the island in search of his missing son. After the group is" +
                        " attacked by a Spinosaurus on the river, Paul uses himself as bait so the others can escape. " +
                        "Although he finds his son, they all barely survive the island if not for the actions of" +
                        "Dr. Satler who sends in the US Navy and Marines when she receives a call from Dr. Grant on a sat-phone and hears a dinosaur roar."));
        People.add(new people(7, "Billy Brennan", R.drawable.billybrennan,
                "Three",
                "Protagonist",
                "Alessandro Nivola",
                "Billy is an overenthusiastic graduate student who works at Dr. Grant's " +
                        "dig site in the third film. Billy accompanies Dr. Grant on the expedition " +
                        "to Isla Sorna, and while there decides to steal a collection of Velociraptor " +
                        "eggs in the hopes that he could sell them to help fund Dr. Grant's dig. Although his actions" +
                        " were noble in his mind, it caused the Raptors to trap the group in order to retrieve the eggs."));
        People.add(new people(8, "Owen Grady", R.drawable.owengrady,
                "World, Fallen",
                "Protagonist",
                "Chris Pratt",
                "Owen is introduced as an on-site staff at Jurassic World. Formerly in " +
                        "the United States Navy, Owen currently conducts behavioral research on the " +
                        "parks pack of Velociraptors. Owen has trained the raptors since they hatched " +
                        "thus he was able to imprint on them and has created personal relationships with them -" +
                        "specifically on the pack leader \'Blue\'. Owen criticizes the genetic modification" +
                        " of the dinosaurs, and openly disagrees with the paddock design of Indominus Rex."));
        People.add(new people(9, "Claire Dearing", R.drawable.clairedearing,
                "World, Fallen",
                "Protagonist",
                "Bryce Dallas Howard",
                "As Jurassic World's work-aholic operations manager, Claire is seen initially as" +
                        " part of the problem, since she only sees the dinosaurs as an attraction rather " +
                        "than a living, breathing creature. Through her time in the film, she begins to realize " +
                        "that there is more to life than her position at Jurassic World, after her two " +
                        "visiting nephews become lost in the park after the Indominus Rex escapes."));
        return People;
    }

    public ArrayList getLocationList() {
        Location.add(new locations("Isla Nublar",
                "Costa Rica",
                "One, World"));
        Location.add(new locations("Isla Sorna",
                "Costa Rica",
                "Two, Three"));
        return Location;
    }

    public ArrayList getSublocationList() {
        SubLocations.add(new sublocations("Brachiosaurus Enclosure",
                "Isla Nublar - Central",
                "One",
                R.drawable.brach_map, R.drawable.brach_icon));
        SubLocations.add(new sublocations("Gallimimus Enclosure",
                "Isla Nublar - South",
                "One",
                R.drawable.gallimimus_map, R.drawable.gallimimus_icon));
        SubLocations.add(new sublocations("Triceratops Enclosure",
                "Isla Nublar - Central",
                "One",
                R.drawable.triceratops_map, R.drawable.triceratops_icon));
        SubLocations.add(new sublocations("Parasaurolophus Enclosure",
                "Isla Nublar - Central",
                "One",
                R.drawable.parasaur_map, R.drawable.parasaur_icon));
        SubLocations.add(new sublocations("Tyrannosaurus Rex Enclosure",
                "Isla Nublar - East",
                "One",
                R.drawable.rex_map, R.drawable.rex_icon));
        SubLocations.add(new sublocations("Velociraptor Enclosure",
                "Isla Nublar - West (Main Compound)",
                "One",
                R.drawable.raptor_map, R.drawable.raptor_icon));
        SubLocations.add(new sublocations("Dilophosaurus Enclosure",
                "Isla Nublar - East",
                "One",
                R.drawable.diloph_map, R.drawable.diloph_icon));
        SubLocations.add(new sublocations("Herrerasaurus Enclosure",
                "Isla Nublar - West",
                "One",
                R.drawable.herra_map, R.drawable.herra_icon));
        SubLocations.add(new sublocations("Baryonyx Enclosure",
                "Isla Nublar - South",
                "One",
                R.drawable.baryonyx_map, R.drawable.baryonyx_icon));
        SubLocations.add(new sublocations("Visitor Center",
                "Isla Nublar - West (Main Compound)",
                "One",
                R.drawable.visitor_map, R.drawable.visitor_icon));
        SubLocations.add(new sublocations("Port",
                "Isla Nublar - North & East",
                "One",
                R.drawable.port_map, R.drawable.port_icon));
        SubLocations.add(new sublocations("Helipad",
                "Isla Nublar - South",
                "One",
                R.drawable.helipad_map, R.drawable.helipad_icon));
        return SubLocations;
    }

    public ArrayList<event> getEvents() {
        Events.add(new event(R.drawable.nublar_incident, 1992, "Isla Nublar Incident",
                "Robert Muldoon", "Isla Nublar - Containment Pen",
                "Jurassic Park", "Due to the growing number of incidents involving " +
                "the park's Velociraptors; it was decided that they would be moved from an open " +
                "paddock to the more structurally sound Velociraptor Pen in the Main Compound. During" +
                " the move, late at night while transplanting the largest of the raptors the crate " +
                "where the Raptor was confined was jostled and Jophery was pulled inside by the raptor."));
        Events.add(new event(R.drawable.park_incident, 1993, "Tyrannasaurus Escape",
                "Dr. Alan Grant, Tim Murphy, Lex Murphy, Dr. Ian Malcolm", "Isla Nublar - Tyrannasaurus Paddock",
                "Jurassic Park", "Due to Dennis Nedry's industrial sabotage, Jurassic Park's " +
                "security is crippled and all of the main systems are taken offline. While the system is down " +
                "most of the perimiter and paddock fences are taken offline, leaving them un-electrified. " +
                "During this time while the visiting team is trapped within their jeeps, the Tyrannasaur " +
                "crashes through his paddock fence."));
        Events.add(new event(R.drawable.nedry_incident,1993, "Dilophosaurus Attack",
                "Dennis Nedry", "Isla Nublar - Access Road", "Jurassic Park",
                "While attempting to escape Jurassic Park with his theft of dozens of Dinosaur" +
                        " Embryos, Dennis Nedry becomes lost as a massive storm whips through the park. " +
                        "Nedry slips and falls down a rocky waterfall before encountering a couple Dilophosaurs" +
                        " who have surrounded him. As he thinks that he has escaped he finds that one " +
                        "of the Dilophosaurs has climbed into his Jeep. He is attacked while the canister of " +
                        "Embryos is buried in the silt and gravel."));
        Events.add(new event(R.drawable.bowman_incident,1996, "Compsognathus Attack",
                "Bowman Family", "Isla Sorna - Coast", "The Lost World",
                "While sailing on a family yacht, the Bowman family is vacationing on the beach. While" +
                        " her parents are enjoying the sun and sand, Cindy wanders across the beach with her " +
                        "sandwich before stumbling upon a friendly looking Compsognathus. She offers some of her " +
                        "to which the Compy eats before a dozen more Compy's appear and attack her."));
        Events.add(new event(R.drawable.rescue_incident, 1997, "Rescue on Isla Sorna",
                "Dr. Ian Malcolm, Dr. Sarah Harding, Eddie Carr, Nick Van Owen",
                "Isla Sorna", "The Lost World",
                "After meeting with a bed-ridden John Hammond, Dr. Malcolm learns that ownership " +
                        "of InGen has passed to Hammond's nephew, Peter Ludlow. As a last ditch effort to " +
                        "catalog and research how the dinosaurs on 'site b' were able to survive, Hammond " +
                        "explains that Sarah Harding has already left for the island. Malcolm joins the " +
                        "expedition that Hammond intended to create, but declares that this will be a " +
                        "rescue mission rather than a research trip."));
        Events.add(new event(R.drawable.hunt_incident, 1997, "Capturing the Tyrannasaurus",
                "Peter Ludlow, Roland Tembo, Dr. Ian Malcolm", "Isla Sorna - Central",
                "The Lost World", "Opposed to John Hammond's research expedition, Peter Ludlow, the new " +
                "CEO of InGen decides to exploit the surviving dinosaurs on Isla Sorna so that InGen doesn't " +
                "go bankrupt. Ludlow puts together a team of hunters and trackers to catalog and capture dozens " +
                "of dinosaurs with the goal of returning them to a new park being built in San Diego. " +
                "While on the hunt, Roland tracks and eventually captures the mighty Tyrannasaurus Rex."));
        Events.add(new event(R.drawable.sandiego_incident, 1997, "Havoc in San Diego",
                "Dr. Ian Malcolm, Sarah Harding", "San Diego, California",
                "The Lost World", "After capturing the Tyrannasaurus Rex, Ludlow has " +
                "the carnivorous monster transported to the United States with the intent of it being " +
                "the star attraction at the new park in San Diego. Yet, Ludlow's ship had a few problems " +
                "while out at sea, and it appears that the T. Rex had awoken from it's drug-induced " +
                "sleep and attacked the crew. Although it was trapped below deck, it was inadvertently " +
                "released and began rampaging through the streets of San Diego."));
        Events.add(new event(R.drawable.dinobreed_incident, 1997, "New Species Bred",
                "Unnamed InGen Scientists", "Isla Sorna", "Jurassic Park III",
                "In secret, several dinosaurs were bred and cloned on Isla Sorna. These cloning " +
                        "experiments where entirely illegal, as the Gene Guard Act was passed a few months earlier. " +
                        "In direct violation of the law, the scientists bred dinosaurs like Ankylosaurus, Ceratosaurus," +
                        " Corythosaurus and Spinosaurus. These dinosaurs are bred without consent from " +
                        "InGen or the new owner Masrani Global - but rather directed by Henry Wu."));
        Events.add(new event(R.drawable.worldplan_incident, 1998, "Jurassic World Planning",
                "Simon Masrani", "Masrani Global", "Jurassic World",
                "After Masrani Global offers InGen a corporate buy out, Simon Masrani declares " +
                        "that his old friend, John Hammond, would have wanted him to bring his dream " +
                        "to fruition by developing and building Jurassic World. Thus the planning and " +
                        "conceptual designs are started."));
        Events.add(new event(R.drawable.kirby_incident, 2001, "Rescue of Eric Kirby",
                "Dr. Alan Grant, Eric Kirby, Peter Kirby", "Isla Sorna",
                "Jurassic Park III", "After Erik survives a crash landing on Isla Sorna " +
                "while on a parasailing adventure with his step-father, Ben, a rescue mission is created " +
                "and Dr. Grant is tricked into joining the expedition. Erik's parents, now separated, " +
                "decide that they need to get to the island at all costs. After the plane lands, it's discovered " +
                "that there are even more dangerous things on this island."));
        Events.add(new event(R.drawable.raptor_incident, 2001, "Hunted by Velociraptors",
                "Dr. Alan Grant, Billy Brennan", "Isla Sorna",
                "Jurassic Park III", "After being stranded on the island after their " +
                "plane crashes through the jungle, Billy finds a nest of Velociraptor eggs and thinks that " +
                "he could help Dr. Grant's dig site by bringing them home and selling them. Although his intentions " +
                "had slight nobility to them, it caused the pack of raptors to track and trap the team in a clearing. " +
                "It appears as though all they want are the eggs, so Dr. Grant returns the eggs freely."));
        Events.add(new event(R.drawable.masrani_incident, 2004, "Jurassic World Has New Dinosaurs",
                "Masrani Global Employees", "Isla Nublar", "Jurassic World",
                "After jumping through several hoops, and getting the Gene Guard Act re-written, Masrani " +
                        "Global is allowed to breed new dinosaurs. During this process the dinosaurs from " +
                        "Isla Sorna are transported to Isla Nublar. Now as the park is finally completed, Masrani " +
                        "begins the process of creating new attractions under the supervision of Dr. Henry Wu."));
        Events.add(new event(R.drawable.irex_incident, 2009, "The Birth of a Hybrid",
                "Dr. Henry Wu", "Isla Nublar", "Jurassic World",
                "Through several attempts at genetic modification, Dr. Wu has been given full authorization " +
                        "to breed hybrid dinosaurs to bring new life and visitors to the park. During Dr. Wu's " +
                        "experiments, the Indominus Rex is hatched. The Indominus was genetical modified from " +
                        "Gigantosaurus, Tyrannosaurus Rex, Velociraptor, Pit Vipers, Tree Frogs, Cuttlefish, " +
                        "and an unidentified number of modern animals."));
        Events.add(new event(R.drawable.world_incident, 1997, "Jurassic World Incident",
                "Owen Grady, Claire Dearing", "Isla Nublar", "Jurassic World",
                "After requesting Owen's input on any potential flaws in Paddock 11, Owen and Claire fear that " +
                        "the Indominus Rex had climbed out of the paddock, only to discover that the I.Rex " +
                        "had a sort of active camoflauge and could hide itself from heat-vision. While Owen " +
                        "escapes, the I.Rex does as well and begins searching for more food."));
        return Events;
    }
}