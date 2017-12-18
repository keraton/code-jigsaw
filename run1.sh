rm -rf out/

javac -d out/production/com.greetings/ com.greetings/src/com/greetings/Main.java com.greetings/src/module-info.java

java --module-path out/production -m com.greetings/com.greetings.Main