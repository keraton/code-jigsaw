module org.astro {
    requires transitive org.user;
    exports org.astro;
    exports org.astro.internal to com.greetings;
}