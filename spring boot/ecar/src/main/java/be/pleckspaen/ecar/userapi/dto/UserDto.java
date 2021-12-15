package be.pleckspaen.ecar.userapi.dto;

public class UserDto {
    private static int idIndex;
    private int id;
    private String firstname;
    private Enum userType;

    public UserDto(int id, String firstname, Enum userType) {
        this.id = id;
        this.firstname = firstname;
        this.userType = userType;
    }

    public static int getIdIndex() {
        return idIndex;
    }

    public static void setIdIndex(int idIndex) {
        UserDto.idIndex = idIndex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Enum getUserType() {
        return userType;
    }

    public void setUserType(Enum userType) {
        this.userType = userType;
    }
}
