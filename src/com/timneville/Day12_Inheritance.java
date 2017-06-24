package com.timneville;

/**
 * Created by timneville on 24/6/17.
 */

public class Day12_Inheritance {

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person{
        private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
        // Write your constructor here

        public Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
        // Write your method here
        public char calculate() {
            int averageScore = 0;

            for (int each : testScores)
                averageScore += each;

            averageScore/=testScores.length;

            if (averageScore >= 90)
                return 'O';
            else
            if (averageScore >= 80)
                return 'E';
            else
            if (averageScore >= 70)
                return 'A';
            else
            if (averageScore >= 55)
                return 'P';
            else
            if (averageScore >= 40)
                return 'D';
            else
            return 'T';
        }
    }
}
