package com.greetings;

import org.astro.World;
import com.spruice.Spruice;
import org.json.Jason;

public class Main {

    public static void main(String... args) {
        World world = (World) Spruice.generate("org.astro.World");
        String firstName = Jason.getAttribute(world.getGreeter(), "firstName");

        System.out.println("Hello " + firstName);



        //WorldServiceImpl worldService = new WorldServiceImpl();
        //System.out.println(worldService.hiddenWord());
    }
}
