import java.util.ArrayList;
import java.util.List;

public class Election {
    private List<Candidat> candidats;

    public Election() {
        this.candidats = new ArrayList<>();
    }

    public void ajouterCandidat(Candidat candidat) {
        candidats.add(candidat);
    }

    public List<Candidat> getCandidats() {
        return candidats;
    }
}
