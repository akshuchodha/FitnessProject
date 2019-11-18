
package Getters;

public class TrainerDetails {
    
    String name,post,specialization,trainerExperience,photoGraph;
    int trainerId;

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getPhotoGraph() {
        return photoGraph;
    }

    public void setPhotoGraph(String photoGraph) {
        this.photoGraph = photoGraph;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainerExperience() {
        return trainerExperience;
    }

    public void setTrainerExperience(String trainerExperience) {
        this.trainerExperience = trainerExperience;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

  
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
}
