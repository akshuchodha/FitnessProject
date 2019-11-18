

package Getters;

/**
 *
 * @author akshu aksh
 */
public class Plans {
    
    
    String planName,durationOfPlan,typeOfPlan,costOfPlan;
    int planId;

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getCostOfPlan() {
        return costOfPlan;
    }


    public void setCostOfPlan(String costOfPlan) {
        this.costOfPlan = costOfPlan;
    }
   

 

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getDurationOfPlan() {
        return durationOfPlan;
    }

    public void setDurationOfPlan(String durationOfPlan) {
        this.durationOfPlan = durationOfPlan;
    }

    public String getTypeOfPlan() {
        return typeOfPlan;
    }

    public void setTypeOfPlan(String typeOfPlan) {
        this.typeOfPlan = typeOfPlan;
    }

    
}
