package exercise;

/**
 * UserExercise represents an exercise for the training planner application.
 * It consists of exercise type, total sets, total reps and weight.

 * @author Johannes Nupen Theigen
 * @since 10.22.2024
 */
public class UserExercise {
  private String nameOfExercise;
  private int totalSets;
  private int totalRepetitions;
  private float weight;

  /**
   * Creates a new exercise.

   * @param nameOfExercise the exercise type
   */
  public UserExercise(String nameOfExercise, int totalSets, int totalRepetitions, float weight) {
    setNameOfExercise(nameOfExercise); // Set the exerciseType provided by user.
    setTotalSets(totalSets); // Set the total sets provided by user.
    setTotalRepetitions(totalRepetitions); // Set the total reps provided by user.
    setWeight(weight); // Set the weight provided by user.
  }

  /**
   * Returns the exercise type.

   * @return the exercise type.
   */
  public String getNameOfExercise() {
    return nameOfExercise;
  }

  /**
   * Sets the exercise type. If the exercise type is null, empty or blank,
   * an IllegalArgumentException is thrown.

   * @param nameOfExercise the exercise type.
   * @throws IllegalArgumentException if the exercise type is null or empty.
   */
  public void setNameOfExercise(String nameOfExercise) throws IllegalArgumentException {
    if (nameOfExercise == null || nameOfExercise.isEmpty()) {
      throw new IllegalArgumentException("Exercise type cannot be null, empty or blank");
    }
    this.nameOfExercise = nameOfExercise;
  }

  /**
   * Returns the total sets of the exercise.

   * @return the totals sets of the exercise
   */
  public int getTotalSets() {
    return totalSets;
  }

  /**
   * Sets the total sets of the exercise. If the total sets of the exercise are negative, an
   * IllegalArgumentException is thrown.

   * @param totalSets the total sets of the exercise.
   * @throws IllegalArgumentException if the total sets of the exercise are negative
   */
  public void setTotalSets(int totalSets) throws IllegalArgumentException {
    if (totalSets < 0) {
      throw new IllegalArgumentException("Total reps cannot be negative");
    }
    this.totalSets = totalSets;
  }

  /**
   * Returns the total reps of the exercise.

   * @return the total reps of the exercise.
   */
  public int getTotalRepetitions() {
    return totalRepetitions;
  }

  /**
   * Sets the total reps of the exercise. If the total reps of the exercise are negative, an
   * IllegalArgumentException is thrown.

   * @param totalRepetitions the total reps of the exercise.
   * @throws IllegalArgumentException if the total reps of the exercise are negative
   */
  public void setTotalRepetitions(int totalRepetitions) throws IllegalArgumentException {
    if (totalRepetitions < 0) {
      throw new IllegalArgumentException("Total reps cannot be negative");
    }
    this.totalRepetitions = totalRepetitions;
  }

  /**
   * Returns the weight of the exercise.

   * @return the weight of the exercise.
   */
  public float getWeight() {
    return weight;
  }

  /**
   * Sets the weight of the exercise. If the weight of the exercise is negative, an
   * IllegalArgumentException is thrown.

   * @param weight the weight of the exercise.
   * @throws IllegalArgumentException if the weight of the exercise is negative
   */
  public void setWeight(float weight) throws IllegalArgumentException {
    if (weight < 0) {
      throw new IllegalArgumentException("Weight cannot be negative");
    }
    this.weight = weight;
  }

}