public class Main {
	
	public static void main (String[] args) {
		
		Plateau plateau = new Plateau("###    ######    ######      ##      #####     ##  ##     ###      ##  ##      ###                #######          ########### ##  ##  ##### #     ######     #      ########           ############        ############         ########      # #     ######     ######## ##  ## ###########          #######                ###   ## #    # ##   ###   ##      ##   #####    #    #    ######    ######    ###");
		Personnage personnage1 = new Personnage(3, 0, plateau, "perso1");
		Personnage personnage2 = new Personnage(14, 0, plateau, "perso2");
		
		personnage1.afficherCoordonnees();
		personnage2.afficherCoordonnees();
		
		//Les personnages se déplacent
		personnage1.deplacement("SSSSEEEEEENN");
		personnage2.deplacement("SSSSSSSSEEESSSOOOSOSSSOOOSS");
		
		plateau.affichageMap();
		
		personnage1.afficherCoordonnees();
		personnage2.afficherCoordonnees();
		
	}
}