package lesson2111;

public class Film {
    private String name;
    private int year;
    private long idProd;
    private long id;

    public Film(String name, int year, long idProd, long id) {
        this.name = name;
        this.year = year;
        this.idProd = idProd;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getIdProd() {
        return idProd;
    }

    public void setIdProd(long idProd) {
        this.idProd = idProd;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", idProd=" + idProd +
                ", id=" + id +
                '}';
    }
}
