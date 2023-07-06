package chapter14_project1;

public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Constructs a User object with the specified ID, first name, and last name.
     *
     * @param id        the ID of the user
     * @param firstname the first name of the user
     * @param lastname  the last name of the user
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Registers the user.
     */
    public void registerUser() {
        System.out.println("User is registered successfully.");
    }

    /**
     * Returns the ID of the user.
     *
     * @return the ID of the user
     */
    public Long getId() {
        return id;
    }

    /**
     * Returns the first name of the user.
     *
     * @return the first name of the user
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Returns the last name of the user.
     *
     * @return the last name of the user
     */
    public String getLastname() {
        return lastname;
    }
}
