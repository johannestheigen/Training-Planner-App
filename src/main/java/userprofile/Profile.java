package userprofile;

public class Profile
{
    private int height;
    private float weight;
    private String gender;
    private int  totalWorkoutPerWeek;

    public Profile(String gender, int totalWorkoutPerWeek)
    {
        setHeight(this.height);
        setWeight(this.weight);
        setGender(this.gender);
        setTotalWorkoutPerWeek(this.totalWorkoutPerWeek);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height < 0) {
            throw new IllegalArgumentException("Invalid input, height cannot be negative.");
        }
        else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight < 0) {
           throw new IllegalArgumentException("Invalid input, height cannot be negative.");
        }
        else {
            this.weight = weight;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        boolean isEmpty = false;
        if(gender == null || gender.isEmpty()) {
            isEmpty = true;
        }
        if(isEmpty) {
            throw new IllegalArgumentException("No input, gender cannot be null or empty.");
        }
        else {
            this.gender = gender;
        }
    }

    public int getTotalWorkoutPerWeek() {
        return totalWorkoutPerWeek;
    }

    public void setTotalWorkoutPerWeek(int totalWorkoutPerWeek) {
        if(totalWorkoutPerWeek < 0 ) {
            throw new IllegalArgumentException("Invalid input, total workout cannot be negative");
        }
        else {
            this.totalWorkoutPerWeek = totalWorkoutPerWeek;
        }
    }
}

