package org.astro;

import org.astro.internal.WorldServiceImpl;
import org.user.Person;

public class World {

    private final WorldServiceImpl worldService;

    public World() {
        this.worldService = new WorldServiceImpl();
    }

    public String world() {
        return worldService.hiddenWord();
    }

    public Person getGreeter() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        return person;
    }

}
