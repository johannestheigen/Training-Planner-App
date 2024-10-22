package edu.ntnu.idi.bidata.userinterface;

import edu.ntnu.idi.bidata.userexercise.Exercise;
import edu.ntnu.idi.bidata.userprofile.Profile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents an interactive user interface where the user can create a profile,
 * add/remove exercises, and print a list of exercises.
 */
public class Interface {
  private Scanner userInput;
  private Profile userProfile;
  private Exercise userExercise;
  private ArrayList<Exercise> userExerciseList;

  /**
   * Creates a user interface for interacting with the training planning application.
   */
  public Interface() {
    userInput = new Scanner(System.in);
    userExerciseList = new ArrayList<>();
  }

  /**
   * Starts the entire application.
   * This method displays a welcome message and initiates user interaction.
   */
  public void start() {
    welcomeMessage();
    inputScanner();
  }

  /**
   * Prints a welcome greeting to the user.
   */
  public void welcomeMessage() {
    System.out.println("Welcome to the training planning application");
    System.out.println("Press 1 to create profile or press 0 to exit");
  }

  /**
   * Displays the menu options for the user.
   */
  public void printMenu() {
    System.out.println("Press 2 to add an exercise.");
    System.out.println("Press 3 to remove an exercise.");
    System.out.println("Press 4 to print all exercises.");
    System.out.println("Press 0 to exit.");
  }

  /**
   * Handles user interaction.
   * Based on user input, it calls methods to create a profile,
   * add exercises, etc.
   */
  public void inputScanner() {
    String input = userInput.nextLine();
    switch (input) {
      case "0":
        System.out.println("Exiting program...");
        break;
      case "1":
        createProfile();
        inputScanner();
        break;
      case "2":
        addExercise();
        inputScanner();
        break;
      case "3":
        removeExercise();
        inputScanner();
        break;
      case "4":
        printExerciseList();
        inputScanner();
        break;
      default:
        System.out.println("Invalid input, please try again.");
        inputScanner();
        break;
    }
  }

  /**
   * Creates a profile for the user.
   * Prompts the user for height, weight, gender, and total workouts per week.
   */
  public void createProfile() {

    userProfile = new Profile();

    System.out.println("Please enter your height:");
    while (!userInput.hasNextInt()) {
      System.out.println("Invalid height, please enter a valid integer:");
      userInput.next();
    }
    int height = userInput.nextInt();
    userInput.nextLine();
    userProfile.setHeight(height);

    System.out.println("Please enter your weight:");
    while (!userInput.hasNextInt()) {
      System.out.println("Invalid weight, please enter a valid integer:");
      userInput.next();
    }
    int weight = userInput.nextInt();
    userInput.nextLine();
    userProfile.setWeight(weight);

    System.out.println("Please enter your gender:");
    while (!userInput.hasNextLine()) {
      System.out.println("Invalid String, please enter a valid String:");

    }
    String gender = userInput.nextLine();
    userInput.nextLine();
    userProfile.setGender(gender);

    System.out.println("Please enter total workouts per week:");
    while (!userInput.hasNextInt()) {
      System.out.println("Invalid input, please enter a valid integer:");
      userInput.next();
    }
    int totalWorkoutPerWeek = userInput.nextInt();
    userInput.nextLine();
    userProfile.setTotalWorkoutPerWeek(totalWorkoutPerWeek);

    System.out.println("Successfully created user!");
    printMenu();
  }

  /**
   * Adds an exercise.
   * Checks if the user has reached the maximum number of exercises allowed
   * for the week before adding a new exercise to the list.
   */
  public void addExercise() {
    if (userExerciseList.size() >= userProfile.getTotalWorkoutPerWeek()) {
      System.out.println("You have reached the maximum number of exercises for the week.");
      return;
    }

    userExercise = new Exercise();
    System.out.println("Please enter the exercise name");

    while (!userInput.hasNextLine()) {
      System.out.println("Invalid name, please enter a valid String:");
      userInput.next();
    }
    String nameOfExercise = userInput.nextLine();
    userInput.nextLine();
    userExercise.setNameOfExercise(nameOfExercise);

    System.out.println("Please enter total sets");
    while (!userInput.hasNextLine()) {
      System.out.println("Invalid integer, please enter a valid integer:");
      userInput.next();
    }
    int totalSets = userInput.nextInt();
    userInput.nextLine();
    userExercise.setTotalSets(totalSets);

    System.out.println("Please enter total repetitions");
    while (!userInput.hasNextLine()) {
      System.out.println("Invalid integer, please enter a valid integer:");
      userInput.next();
    }
    int totalRepetitions = userInput.nextInt();
    userInput.nextLine();
    userExercise.setTotalRepetitions(totalRepetitions);

    System.out.println("Please enter weight");
    while (!userInput.hasNextFloat()) {
      System.out.println("Invalid float, please enter a valid float:");
      userInput.next();
    }
    float weight = userInput.nextFloat();
    userInput.nextLine();
    userExercise.setWeight(weight);

    userExerciseList.add(userExercise);
    System.out.println("Successfully added exercise!");
    printMenu();
  }

  /**
   * Removes an exercise.
   */
  public void removeExercise() {

    printExerciseList();  // Show the list before removing.
    System.out.println("Please enter the index of the exercise to remove:");

    while (!userInput.hasNextInt()) {
      System.out.println("Invalid input, please enter a valid integer index:");
      userInput.next();
    }
    int index = userInput.nextInt();
    userInput.nextLine();

    if (index < 0 || index >= userExerciseList.size()) {
      System.out.println("Invalid index, please try again.");
    }

    userExerciseList.remove(index);
    System.out.println("Successfully removed an exercise.");
    printMenu();
  }

  /**
   * Prints a list of all exercises.
   * Displays the name, sets, repetitions, and weight for each exercise.
   */
  public void printExerciseList() {
    System.out.println("Exercise List:");

    if (userExerciseList.isEmpty()) {
      System.out.println("No exercises added yet.");
      printMenu();
      return;
    }

    for (int i = 0; i < userExerciseList.size(); i++) {
      Exercise exercise = userExerciseList.get(i);
      System.out.println("Exercise Name: " + exercise.getNameOfExercise()
          +
          ", Sets: " + exercise.getTotalSets()
          +
          ", Repetitions: " + exercise.getTotalRepetitions()
          +
          ", Weight: " + exercise.getWeight() + " kg");
    }
    System.out.println("Total exercises: " + userExerciseList.size());
    printMenu();
  }
}
