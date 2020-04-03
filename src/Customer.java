public class Customer {
    private String firstname;
    private String secondname;
    private String gender;
    private String mobileNumber;
    private String location;
    private String isInfected;
    private String isAwareofInfection;
    private String isAwareOfSocialDistancing;

    @Override
    public String toString() {
        return "Customer" + "\n" + " firstname = " + firstname + ", secondname = " + secondname + ", gender = " + gender
                + ", mobileNumber = " + mobileNumber + ", location = " + location + ", isInfected = " + isInfected
                + ", isAwareofInfection = " + isAwareofInfection + ", isAwareOfSocialDistancing = "
                + isAwareOfSocialDistancing + "\n";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsInfected() {
        return isInfected;
    }

    public void setIsInfected(String isInfected) {
        this.isInfected = isInfected;
    }

    public String getIsAwareofInfection() {
        return isAwareofInfection;
    }

    public void setIsAwareofInfection(String isAwareofInfection) {
        this.isAwareofInfection = isAwareofInfection;
    }

    public String getIsAwareOfSocialDistancing() {
        return isAwareOfSocialDistancing;
    }

    public void setIsAwareOfSocialDistancing(String isAwareOfSocialDistancing) {
        this.isAwareOfSocialDistancing = isAwareOfSocialDistancing;
    }
}
