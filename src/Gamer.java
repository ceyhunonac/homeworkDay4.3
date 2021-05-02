public class Gamer {
    private String tcId;
    private String firstName;
    private String lastName;
    private int birthOfYear;

    public Gamer() {

    }

    public Gamer(String tcId, String firstName, String lastName, int birthOfYear) {

        this.tcId = tcId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }


}
