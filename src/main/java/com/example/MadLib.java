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

    public void setRandomNums(String randomNums) {
        this.randomNums = randomNums;
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
        setNoun1(scan.nextLine());
    }

    public void enterNoun2() {
        setNoun2(scan.nextLine());
    }

    public void enterNoun3() {
        setNoun3(scan.nextLine());
    }

    public void enterAdjective1() {
        setAdjective1(scan.nextLine());
    }

    public void enterAdjective2() {
        setAdjective2(scan.nextLine());
    }

    public void enterAdverb() {
        setAdverb(scan.nextLine());
    }

    public void putTogetherTheStory() {
       String story = "Jesse and her best friend " + getName() + " went to Disney World today! " +
       "They saw a " + getNoun1() + " in a show at the Magic Kingdom and ate a" + getAdjective1() + " feast for dinner."
       + "The next day I ran " + getAdverb() + " to meet Micky Mouse in his " + getNoun2() + " and then that night I " +
               "gazed at the" + getRandomNums() + " " + getAdjective2() + " fireworks shooting from the " + getNoun3() +
               ".";
       setStory(story);
    }

    public static void main(String[] args)  {
        MadLib game = new MadLib();
        game.printInstructions();

    }
}
