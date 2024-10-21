package up.mi.paa.td05.exo1;


public class Comprehension {
    public static void m1() {
        try {
            m2();
        } catch (ArithmeticException ex2) {
            System.out.println("Exception2 attrapée");
        }
    }

    public static void m2() {
        System.out.println("Début méthode m2");
        try {
            int[] tab = {1,2,3,4}; 				// instruction 1
            tab[4] = 8/0; 							// instruction 2
            System.out.println(tab.length); 		// instruction 3
        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println("Exception attrapée");
        }
        System.out.println("Fin méthode m2");
    }

    public static void main(String[] args) {
        System.out.println("Début du programme");
        m1();
        System.out.println("Fin du programme");
    }
}



/*
 
1. Qu’affiche ce programme ?

	ce programme affiche : 
	debut du programme
	debut methode m2
	Exception attrapée 
	fin methode m2
	fin du programme
 
2. Si instruction 1 est replacée par le code suivant : int[] tab = {1,2,3,4,5}; . Qu’affiche mainte-
nant le programme ?

	debut du programme
	debut methode m2
	5
	fin methode m2
	fin du programme

3. Si, en plus, on modifie instruction 2 de la façon suivante : tab[4] = 8/0;. Qu’affiche maintenant
le programme ?

	Début du programme
	Début méthode m2
	Exception2 attrapée
	Fin du programme
	
	cette exception n'est pas capturée dans le try de m2 et donc remonte à 
	l'arithmetique exception de m1
	
 */









