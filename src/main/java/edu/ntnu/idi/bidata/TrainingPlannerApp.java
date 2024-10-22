package edu.ntnu.idi.bidata;

import edu.ntnu.idi.bidata.userinterface.Interface;
import java.util.InputMismatchException;

/**
 * The main application for the training planning system.
 * This class initializes the user interface and starts the application.
 */
public class TrainingPlannerApp {

  /**
   * Runs the main program for the training planning application.
   * This method creates an instance of the user interface,
   * starts the application, and handles potential input errors.
   *
   * @param args Command-line arguments passed to the application (not used).
   */
  public static void main(String[] args) {
    // Create an instance of the user interface
    Interface app = new Interface();

    try {
      // Start the application
      app.start();
    } catch (InputMismatchException e) {
      // Handle invalid input types, such as non-integers when an integer is expected
      System.out.println("Invalid input type. Please restart the application and enter valid data.");
    } catch (IllegalArgumentException e) {
      // Handle cases where an illegal argument is passed, providing specific feedback to the user.
      System.out.println("Illegal argument: " + e.getMessage());
    } catch (Exception e) {
      // Catch any other unexpected exceptions
      System.out.println("An unexpected error occurred: " + e.getMessage());
    } finally {
      System.out.println("Thank you for using the training planning application!");
    }
  }
}
