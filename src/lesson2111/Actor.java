package lesson2111;

public class Actor {
    private String name;
    private String lastname;
    private String patronymic;
    private Long id;
    private Long experience;

    public Actor(String name, String lastname, String patronymic, Long id, Long experience) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.id = id;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
