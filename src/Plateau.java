public class Plateau {
	
	private char[][] map;
	
	// Cette methode créer un plateau sous forme d'un tableau 20 par 20
	public Plateau(String terrain) {     
		char[][] map = new char[20][20];
		int count = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0 ; j < 20; j++) {
				map [j][i] = terrain.charAt(count);
				count++;				
			}
		}
		this.map = map;
	}
	

	public char[][] getMap() {
		return map;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}

	public void affichageMap() {

		for (int i = 0; i < 20; i++) {
			for (int j = 0 ; j < 20; j++) {
				System.out.print(this.map[j][i]);
			}
			System.out.println(""); // Retour à la ligne au bout de 20 caractères
		}
	}
	
	public boolean verifCoordonnees(int x, int y) {	
		if (this.map [x][y] == '#' || x >= 20 || y >= 20 || this.map [x][y] == '.') {
			return false;
		}
		// Si le personnage n'est ni sur un arbre, ni en dehors de la map :
		else { 
			return true;		
		}
	}
	
	public void ajoutElement(int x, int y, char charactere) {
		this.map[x][y] = charactere;
	}
	
	
}