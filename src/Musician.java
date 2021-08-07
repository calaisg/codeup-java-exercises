public class Musician {
    private String firstName;
    private String lastName;
    private String genre;
    private String instrument;
    private boolean isAlive;
    private int age;

    //musicians with all
    public Musician(String firstName, String lastName, String genre, String instrument, boolean isAlive, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
        this.age = age;
    }

    //musicians dead both names
    public Musician(String firstName, String lastName, String genre, String instrument, boolean isAlive){
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
    }

    //musicians alive one name
    public Musician(String firstName, String genre, String instrument, boolean isAlive, int age){
        this.firstName = firstName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
        this.age = age;
    }

    //musicians dead one name
    public Musician(String firstName, String genre, String instrument, boolean isAlive){
        this.firstName = firstName;
        this.genre = genre;
        this.instrument = instrument;
        this.isAlive = isAlive;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
