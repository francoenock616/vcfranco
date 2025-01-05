/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triathlonresults;

/**
 *
 * @author Enock
 */

// Base class representing a Participant in the triathlon
class Participant {
    private String name;             // Participant's name
    private int id;                  // Participant's unique ID
    private int swimmingTime;        // Time spent swimming in minutes
    private int cyclingTime;         // Time spent cycling in minutes
    private int runningTime;         // Time spent running in minutes

    // Constructor to initialize participant details with validation
    public Participant(String name, int id, int swimmingTime, int cyclingTime, int runningTime) {
        this.name = name;  // Initialize participant name
        this.id = id;      // Initialize participant ID
        setSwimmingTime(swimmingTime); // Set swimming time with validation
        setCyclingTime(cyclingTime);   // Set cycling time with validation
        setRunningTime(runningTime);   // Set running time with validation
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
        /* Please note These method validate if the time is negative. 
        If it is, an error message is displayed. If valid, it sets the respective event time.
        */
    }

    // Getter method for ID
    public int getId() {
        return id;
    }

    // Setter method for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for swimming time
    public int getSwimmingTime() {
        return swimmingTime;
    }

    // Setter method for swimming time with validation
    public void setSwimmingTime(int swimmingTime) {
        // Validation: Ensure that swimming time is not negative
        if (swimmingTime < 0) {
            System.out.println("Error: Swimming time cannot be negative.");
        } else {
            this.swimmingTime = swimmingTime;  // Set valid swimming time
        }
    }

    // Getter method for cycling time
    public int getCyclingTime() {
        return cyclingTime;
    }

    // Setter method for cycling time with validation
    public void setCyclingTime(int cyclingTime) {
        // Validation: Ensure that cycling time is not negative
        if (cyclingTime < 0) {
            System.out.println("Error: Cycling time cannot be negative.");
        } else {
            this.cyclingTime = cyclingTime;  // Set valid cycling time
        }
    }

    // Getter method for running time
    public int getRunningTime() {
        return runningTime;
    }

    // Setter method for running time with validation
    public void setRunningTime(int runningTime) {
        // Validation: Ensure that running time is not negative
        if (runningTime < 0) {
            System.out.println("Error: Running time cannot be negative.");
        } else {
            this.runningTime = runningTime;  // Set valid running time
        }
    }

    // Method to calculate the total time by adding swimming, cycling, and running times
    public int calculateTotalTime() {
        return swimmingTime + cyclingTime + runningTime; // Sum up all event times to get the total time
    }

    // Method to display participant details (name, ID, and total time)
    public void displayDetails() {
        System.out.println("Name: " + name); // Display participant's name
        System.out.println("ID: " + id);     // Display participant's unique ID
        System.out.println("Total Time: " + calculateTotalTime() + " minutes"); // Display total time (sum of all events)
    }
}

// Derived class for Elite Participants (inherits from Participant)
class EliteParticipant extends Participant {
    private String sponsorName;  // Additional attribute for sponsor name

    // Constructor to initialize EliteParticipant with sponsor's name
    public EliteParticipant(String name, int id, int swimmingTime, int cyclingTime, int runningTime, String sponsorName) {
        super(name, id, swimmingTime, cyclingTime, runningTime); // Call the base class constructor
        this.sponsorName = sponsorName; // Set the sponsor name
    }

    // Getter method for sponsorName
    public String getSponsorName() {
        return sponsorName;
    }

    // Setter method for sponsorName
    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    // Overriding displayDetails() to include sponsor information along with base details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the base class's displayDetails() method
        System.out.println("Sponsor: " + sponsorName);  // Display sponsor information for elite participants
    }
}

// Derived class for Beginner Participants (inherits from Participant)
class BeginnerParticipant extends Participant {
    // Constructor: No additional attributes, just calls the base class constructor
    public BeginnerParticipant(String name, int id, int swimmingTime, int cyclingTime, int runningTime) {
        super(name, id, swimmingTime, cyclingTime, runningTime); // Call the base class constructor
    }

    // Overriding displayDetails() to retain the basic display (without sponsor info)
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the base class's displayDetails() method
    }
}
