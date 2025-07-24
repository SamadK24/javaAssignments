package com.swabhav.GuitarFinal.model;

import java.util.*;

public class GuitarInventory {
    private List<Final_Guitar> guitars = new ArrayList<>();

    public void addGuitar(Final_Guitar guitar) {
        guitars.add(guitar);
    }

    public List<Final_Guitar> search(GuitarSpec searchSpec) {
        List<Final_Guitar> matchingGuitars = new ArrayList<>();
        for (Final_Guitar guitar : guitars) {
            if (searchSpec.matches(guitar.getSpec())) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List<Final_Guitar> flexibleSearch(GuitarSpec searchSpec) {
        List<Final_Guitar> matchingGuitars = new ArrayList<>();
        for (Final_Guitar guitar : guitars) {
            if (guitar.getSpec().matchesPartially(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List<Final_Guitar> getAllGuitars() {
        return guitars;
    }

    
    public boolean deleteGuitarBySerial(String serialNumber) {
        Iterator<Final_Guitar> iterator = guitars.iterator();
        while (iterator.hasNext()) {
            Final_Guitar g = iterator.next();
            if (g.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}
