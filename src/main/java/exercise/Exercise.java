package exercise;

/**
 * Exercise represents an exercise for the training planner application.
 * It consists of exercise type, total sets, total reps and weight.

 * @author Johannes Nupen Theigen
 * @since 10.14.2024
 * @version 0.0.2
 */
public class Exercise {
  private String exerciseType;
  private int totalSets;
  private int totalReps;
  private float weight;

  /**
   * Creates a new exercise.

   * @param exerciseType the exercise type
   */
  public Exercise(String exerciseType) {
    setExerciseType(exerciseType); // Set the exerciseType provided by user.
    totalSets = 0; // Default value for total sets.
    totalReps = 0; // Default value for total reps.
    weight = 0; // Default value for weight.
  }

  /**
   * Returns the exercise type.

   * @return the exercise type.
   */
  public String getExerciseType() {
    return exerciseType;
  }

  /**
   * Sets the exercise type. If the exercise type is null, empty or blank,
   * an IllegalArgumenException is thrown.

   * @param exerciseType the exercise type.
   */
  public void setExerciseType(String exerciseType) {
    if (exerciseType == null || exerciseType.isEmpty() || exerciseType.isBlank()) {
      throw new IllegalArgumentException("Exercise type cannot be null, empty or blank");
    }
    this.exerciseType = exerciseType;
  }

  /**
   * Returns the total sets of the exercise.

   * @return the totals sets of the exercise
   */
  public int getTotalSets() {
    return totalSets;
  }

  /**
   * Sets the total sets of the exercise. If the total sets are negative, an
   * IllegalArgumentException is thrown.

   * @param totalSets the total sets of the exercise.
   */
  public void setTotalSets(int totalSets) {
    if (totalSets < 0) {
      throw new IllegalArgumentException("Total reps cannot be negative");
    }
    this.totalSets = totalSets;
  }

  /**
   * Returns the total reps of the exercise.

   * @return the total reps of the exercise.
   */
  public int getTotalReps() {
    return totalReps;
  }

  /**
   * Sets the total reps of the exercise. If the total reps are negative, an
   * IllegalArgumentException is thrown.

   * @param totalReps the total reps of the exercise.
   */
  public void setTotalReps(int totalReps) {
    if (totalReps < 0) {
      throw new IllegalArgumentException("Total reps cannot be negative");
    }
    this.totalReps = totalReps;
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
   */
  public void setWeight(int weight) {
    if (weight < 0) {
      throw new IllegalArgumentException("Weight cannot be negative");
    }
    this.weight = weight;
  }

}
