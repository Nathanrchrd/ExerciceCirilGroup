public class Personnage {
	private int x;
	private int y;
	private static Plateau plateau;
	private String nom;
	

	public Personnage(int x, int y, Plateau plateau, String nom) {
		this.x = x;
		this.y = y;
		this.plateau = plateau;
		this.nom = nom;
		plateau.ajoutElement(x, y, 'X');
	}
	
	public static Plateau getPlateau() {
		return plateau;
	}

	public static void setPlateau(Plateau plateau) {
		Personnage.plateau = plateau;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void deplacement (String orientation) {
		plateau.ajoutElement(x, y, 'x');  // On remplace l'ancienne position du personnage par un petit "x"
		
		// On traite chaque élement de orientation (ex : "SSSSEEEEEENN")
		for (int i = 0; i < orientation.length(); i++) {
			if (plateau.verifCoordonnees(x, y)) {
				
				if (i != 0) {
					plateau.ajoutElement(x, y, '.'); // Pour ne pas remplacer le "x" par un "."
				}
				
				
				// On modifie les coordonnées du personnage
				if (orientation.charAt(i) == 'N') {
					y--;
				}
				else if (orientation.charAt(i) == 'S') {
					y++;
				}
				else if (orientation.charAt(i) == 'O') {
					x--;
				}
				else if (orientation.charAt(i) == 'E') {
					x++;
				}
				else {
					System.out.println("Veuillez entrer en paramètre uniquement les lettres N, S, O et E");
					break;
				}
				
				
			}
		}
		
		// On place le personnage à sa position finale
		if (plateau.verifCoordonnees(x, y)) {
			plateau.ajoutElement(x, y, 'X');
		}
		
	}
	
	public void afficherCoordonnees() {
		if (plateau.verifCoordonnees(x, y)) {  
			System.out.println("Les coordonnées de " + this.nom +" sont : (" + x + "," + y + ")");
		}
		else {
			System.out.println(this.nom +" ne peut ni se trouver sur un arbre, ni sortir de la map");
		}
	}
}
