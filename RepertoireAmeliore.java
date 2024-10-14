package up.mi.paa.td04;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;

public class RepertoireAmeliore extends RepertoireSimple {
	
	private Personne proprietaire ;
	
	
	public RepertoireAmeliore(Personne p) {
		
		this.proprietaire = p;
	}
	
	
	public String cherchePersonne(String numero) {
		for(Personne p : getRepertoire()) {
			if(numero.equals(p.getNumero()) ) {
				return p.getPrenom() + p.getNom();
			}
		}
		return "Le numero : "+ numero + " est inconnue.";
	}
	
	
	public void afficheRepertoire() {
        System.out.println("Propriétaire du répertoire : " + proprietaire);
        
        List<Personne> contacts = new ArrayList<>(getRepertoire());

        contacts.sort(Comparator.comparing(Personne::getNom)
                .thenComparing(Personne::getPrenom));

        for (Personne p : contacts) {
            System.out.println(p.getPrenom() + " " + p.getNom() + " - " + p.getNumero());
        }
	
	}
}
