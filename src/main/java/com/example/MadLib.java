package com.example;


import java.util.Random;
import java.util.Scanner;

public class MadLib {
    Scanner scan = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String adjective3;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    // Getters!
    public Scanner getScan() {
        return scan;
    }

    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getAdjective3() {
        return adjective3;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    // Setter!
    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public void setAdjective3(String adjective3) {
        this.adjective3 = adjective3;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    // Print Instructions to Player
    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in " +
                "words, we'll give you a story. Start by typing in a name.");
    }

    // Get Data from Player
    public void enterName() {
        setName(scan.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun!");
        setNoun1(scan.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun!");
        setNoun2(scan.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me the last noun!");
        setNoun3(scan.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Give me a adjective!");
        setAdjective1(scan.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Give me another adjective!");
        setAdjective2(scan.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Now give me an adverb!");
        setAdverb(scan.nextLine());
    }

    public void putTogetherTheStory() {
        // Give a random number to the story, for the user to get a random story.
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if (num == 0) {
            story = "Jesse and her best friend " + getName() + " went to Disney World today! " +
                    "They saw a " + getNoun1() + " in a show at the Magic Kingdom and ate a" + getAdjective1() + " feast for dinner."
                    + "The next day I ran " + getAdverb() + " to meet Micky Mouse in his " + getNoun2() + " and then that night I " +
                    "gazed at the" + getRandomNums() + " " + getAdjective2() + " fireworks shooting from the " + getNoun3() +
                    ".";
        } else {
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. " +
            "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() + ". That night they decided to climb "
            + getAdverb() + " into the " + getNoun3() + " to get closer look. The zoo was " + getAdjective1() + " at night" +
                    "but they didn't care... until" + getRandomNums() + " " + getAdjective2() + " apes yelled in their faces" +
                    ", making Amanda and" + getName() + " sprint all the way back home.";
        }
       setStory(story);
    }

    public void play() {
        // Called all methods to the play method.
        enterName();
        enterNoun1();
        enterNoun2();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args)  {
        // Made a new instance from MadLib called game, and made game called the first instruction and the play method.
        MadLib game = new MadLib();
        game.printInstructions();
        game.play();

    }
}
