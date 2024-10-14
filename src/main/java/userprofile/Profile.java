package userprofile;

/**
 * Profile represents a user profile for a training planner application.
 * It holds information provided by the user such as height, weight,
 * gender, and total workouts per week. This information can be used
 * to generate a workout plan that fits the user.
 *
 * @author Johannes Nupen Theigen
 * @since 2024.10.14
 * @version 0.0.3
 */
public class Profile {
  private int height;
  private float weight;
  private String gender;
  private int totalWorkoutPerWeek;

  /**
     * Creates a user profile that holds information about the user
     * This includes the user's gender and total workouts per week.
     * The height and weight are initialized to default values 0
     * and can be set later using the appropriate setter methods.

     * @param gender gender of the user (must not be null or empty)
     * @param totalWorkoutPerWeek the total number of workouts the user plans to do each week
     * @throws IllegalArgumentException if gender is null or empty
     or if totalWorkoutPerWeek is negative
     */
  public Profile(String gender, int totalWorkoutPerWeek) {
    this.height = 0; // Default value for height.
    this.weight = 0; // Default value for weight.
    setGender(gender); // Set the gender provided by the user
    setTotalWorkoutPerWeek(totalWorkoutPerWeek);
    // Set the total workouts per week provided by the user
  }

  /**
    * Returns the height of the user.

     * @return The height of the user.
     */
  public int getHeight() {
    return height;
  }

  /**
     * Sets the height for the user. If the value is less than zero
     * an IllegalArgumentException is thrown.
     *
     * @param height The height of the user must be non-negative.
     * @throws IllegalArgumentException if the value is less than zero.
     */

  public void setHeight(int height) throws IllegalArgumentException {
    if (height < 0) {
      throw new IllegalArgumentException("Invalid input, height cannot be negative.");
    }
    this.height = height;
  }

  /**
    * Returns the weight of the user.
    *
    * @return The weight of the user.
    */

  public float getWeight() {
    return weight;
  }

  /**
     * Sets the weight of the user. If the value is less than zero
     * an IllegalArgumentException is thrown.
     *
     * @param weight The weight of the user must be non-negative.
     * @throws IllegalArgumentException if the value is less than zero.
     */

  public void setWeight(float weight) throws IllegalArgumentException {
    if (weight < 0) {
      throw new IllegalArgumentException("Invalid input, weight cannot be negative.");
    }
    this.weight = weight;
  }

  /**
    * Returns the gender of the user.

     * @return The gender of the user.
     */

  public String getGender() {
    return gender;
  }

  /**
     * Sets the gender of the user. If the input is null or empty
     * an IllegalArgumentException is thrown.
     *
     * @param gender The gender of the user must not be null or empty.
     * @throws IllegalArgumentException if the input is null or empty
     */

  public void setGender(String gender) throws IllegalArgumentException {
    if (gender == null || gender.isEmpty()) {
      throw new IllegalArgumentException("No input, gender cannot be null or empty.");
    }
    this.gender = gender;
  }

  /**
    * Returns the total workouts per week of the user.
    *
    * @return The total workouts per week of the user.
    */
  public int getTotalWorkoutPerWeek() {
    return totalWorkoutPerWeek;
  }

  /**
     * Sets the total workout per week of the user. If the value is less than zero
     * an IllegalArgumentException is thrown.
     *
     * @param totalWorkoutPerWeek The total workouts per week of the user must be non-negative.
     * @throws IllegalArgumentException if the value is less than zero
     */

  public void setTotalWorkoutPerWeek(int totalWorkoutPerWeek) throws IllegalArgumentException {
    if (totalWorkoutPerWeek < 0) {
      throw new IllegalArgumentException("Invalid input, total workout cannot be negative");
    }
    this.totalWorkoutPerWeek = totalWorkoutPerWeek;
  }
}