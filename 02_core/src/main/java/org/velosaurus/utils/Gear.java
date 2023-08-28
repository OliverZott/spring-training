package org.velosaurus.utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Gear {

    public List<String> ShowGear() {
        var gear = new ArrayList<String>();
        gear.add("Trek Slash 8 - 2023");
        gear.add("Atomic Hiking-Ski Set");
        gear.add("Atomic Nordic Ski Set");
        return gear;
    }
}
