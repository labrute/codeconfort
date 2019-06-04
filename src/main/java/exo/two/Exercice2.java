package exo.two;

public class Exercice2 {

  // 5 carte !=
  // 2 à 10 Valet Dame Roi, As
  // 2 liste de 5 cartes comparer, celui qui a la carte la plus haute gagne

  // Contraintes
  // Pas d'abreviation (nommage)
  // Pas de else
  // 1 niveau d'indentation / compléxité cyclomatique
  // Pas de primitif null (Int, Char, Double ...) ==> Wrapper
  // Collections wrapper dans un objet
  // 2 attributs max par classe
  // un seul point par ligne
  // Petite entité : petite ligne <= 120 char, func <= 4 lignes, class, interface ... <= 10 methodes (constrcteur, privé, static ...), package <= 10 entités
  // pas de getter setter properties champs public ==> Encapsulation

  // Object calistenics
  // https://williamdurand.fr/2013/06/03/object-calisthenics/


  public String poker(ListCartes joueur, ListCartes adversaire) {
    IntWrapped result = joueur.compare(adversaire);
    if (result.equals( new IntWrapped(1))) {
      return "Joueur 1";
    }
    if (result.equals( new IntWrapped(-1)))  {
      return "Joueur 2";
    }
    return "Draw !";
  }
}
