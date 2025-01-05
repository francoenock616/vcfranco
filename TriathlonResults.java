/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triathlonresults;

/**
 *
 * @author Enock
 */
import java.util.*;
// Main class to run the triathlon program
public class TriathlonResults {
    public static void main(String[] args) {
        // Create an array of Participant objects, both Elite and Beginner participants
        Participant[] participants = {
            new EliteParticipant("Alice", 1, 25, 40, 20, "Company X"),  // Alice as an Elite Participant
            new EliteParticipant("Bob", 2, 20, 35, 25, "Company Y"),    // Bob as an Elite Participant
            new BeginnerParticipant("Charlie", 3, 30, 50, 30),           // Charlie as a Beginner Participant
            new BeginnerParticipant("Diana", 4, 28, 42, 18)              // Diana as a Beginner Participant
        };

        // Displaying the details of all participants
        System.out.println("Triathlon Results:");
        for (Participant participant : participants) {
            participant.displayDetails();  // Call displayDetails() for each participant (polymorphism in action)
            System.out.println();  // Print a blank line between participants for clarity
        }

        // Sort participants by their total time for the race
        System.out.println("Sorted Results by Total Time:");
        sortParticipantsByTime(participants);

        // Identify and display the fastest participant
        Participant fastest = getFastestParticipant(participants);
        System.out.println("Fastest participant: " + fastest.getName() + " with total time: " + fastest.calculateTotalTime() + " minutes");

        // Identify and display the second fastest participant
        Participant secondFastest = getSecondFastestParticipant(participants, fastest);
        System.out.println("Second fastest participant: " + secondFastest.getName() + " with total time: " + secondFastest.calculateTotalTime() + " minutes");
    }

    // Method to sort participants by total time (ascending order)
    public static void sortParticipantsByTime(Participant[] participants) {
        for (int i = 0; i < participants.length - 1; i++) {
            for (int j = i + 1; j < participants.length; j++) {
                if (participants[i].calculateTotalTime() > participants[j].calculateTotalTime()) {
                    // Swap participants if their total time is in the wrong order (bubble sort)
                    Participant temp = participants[i];
                    participants[i] = participants[j];
                    participants[j] = temp;
                }
            }
        }

        // Print out the sorted list of participants with their total time
        for (Participant participant : participants) {
            System.out.println(participant.getName() + ": " + participant.calculateTotalTime() + " minutes");
        }
    }

    // Method to find and return the participant with the fastest total time
    public static Participant getFastestParticipant(Participant[] participants) {
        Participant fastest = participants[0];  // Assume the first participant is the fastest initially
        for (Participant participant : participants) {
            // Update fastest if a participant has a lower total time
            if (participant.calculateTotalTime() < fastest.calculateTotalTime()) {
                fastest = participant;
            }
        }
        return fastest;  // Return the participant with the fastest time
    }

    // Method to find and return the participant with the second fastest total time
    public static Participant getSecondFastestParticipant(Participant[] participants, Participant fastest) {
        Participant secondFastest = null;  // Placeholder for second fastest
        for (Participant participant : participants) {
            // Find the participant with the second lowest time, excluding the fastest participant
            if (participant != fastest && (secondFastest == null || participant.calculateTotalTime() < secondFastest.calculateTotalTime())) {
                secondFastest = participant;
            }
        }
        return secondFastest;  // Return the second fastest participant
    }
}