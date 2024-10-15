import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionnaireDeVotes {
    private Election election;
    private List<Vote> votes;

    public GestionnaireDeVotes() {
        this.election = new Election();
        this.votes = new ArrayList<>();
    }

    public void initialiserElection() {
        // Ajouter des candidats à l'élection
        election.ajouterCandidat(new Candidat("Alice", "Parti A"));
        election.ajouterCandidat(new Candidat("Bob", "Parti B"));
        // Ajoutez d'autres candidats si nécessaire
    }

    public void demarrerVote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom :");
        String nomUtilisateur = scanner.nextLine();
        System.out.println("Entrez votre ID :");
        String idUtilisateur = scanner.nextLine();

        Utilisateur utilisateur = new Utilisateur(nomUtilisateur, idUtilisateur);
        System.out.println("Candidats disponibles :");

        for (int i = 0; i < election.getCandidats().size(); i++) {
            Candidat candidat = election.getCandidats().get(i);
            System.out.println((i + 1) + ". " + candidat.getNom() + " - " + candidat.getParti());
        }

        System.out.println("Entrez le numéro du candidat pour voter :");
        int choix = scanner.nextInt() - 1;

        if (choix >= 0 && choix < election.getCandidats().size()) {
            Candidat candidatChoisi = election.getCandidats().get(choix);
            Vote vote = new Vote(candidatChoisi, utilisateur);
            votes.add(vote);
            candidatChoisi.ajouterVote();
            System.out.println("Vote enregistré pour " + candidatChoisi.getNom());
        } else {
            System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}
