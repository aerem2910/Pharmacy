// Main.java
package org.example.seminar.Apteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent azitroment1 = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmancyComponent water = new Water("Water", "10 Мг", 20);
        PharmancyComponent water2 = new Water("Water", "10 Мг", 20);

        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);

        System.out.println(pharmancyComponents);

        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);

        for (PharmancyComponent comp : pharmacy1) {
            System.out.println(comp.getName());
        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);

        Set<PharmancyComponent> set = new HashSet<>();
        set.add(azitroment);
        set.add(azitroment1);
        set.add(azitroment);

        System.out.println("/////////////////////////");
        System.out.println(set);
    }
}

