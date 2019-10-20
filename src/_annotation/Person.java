package _annotation;

@JsonSerializable
public class Person {
    @JsonElement
    private String givenName;

    @JsonElement
    private String familyName;

    private String birthday;

    @JsonElement(key = "nationality")
    private String country;

    private String planet;

    public Person(String givenName, String familyName, String birthday, String country, String planet) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.birthday = birthday;
        this.country = country;
        this.planet = planet;
    }

    @Init
    private void initNames() {
        this.givenName = this.givenName.toUpperCase();
        this.familyName = this.familyName.toUpperCase();
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
}
