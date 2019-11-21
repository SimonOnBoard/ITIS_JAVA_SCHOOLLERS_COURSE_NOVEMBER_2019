package lesson2111;

public class ActorFilm {
    private long idFilm;
    private long idAct;
    private String charName;

    public ActorFilm(long idFilm, long idAct, String charName) {
        this.idFilm = idFilm;
        this.idAct = idAct;
        this.charName = charName;
    }

    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public long getIdAct() {
        return idAct;
    }

    public void setIdAct(long idAct) {
        this.idAct = idAct;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
