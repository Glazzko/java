package zaidejas;

import java.util.ArrayList;
import java.util.Scanner;

public class ZaidejoIvestis {
  public static void main(String[] args) {
    ArrayList<zaidejas> players = new ArrayList<zaidejas>();

    zaidejas player1 = new zaidejas("Bob", 50, 100);
    player1.gydyti(25);
    player1.zala(40);
    System.out.println("Player 1 name: " + player1.getVardas());
    System.out.println("Player 1 hitpoints: " + player1.getHitpoints());
    System.out.println("Player 1 max hitpoints: " + player1.getMaxHitpoints());
    System.out.println("Player 1 status: " + player1.koksStatusas());
    
    
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("1. Prideti zaideja");
      System.out.println("2. Atspausdinti zaidejus");
      System.out.println("3. Iseiti");
      System.out.print("Iveskite komanda: ");
      int command = scanner.nextInt();

      if (command == 1) {
        zaidejas player = ZaidejoIvestis(scanner);
        players.add(player);
      } else if (command == 2) {
    	  AtspausdintiZaidejuSarasa(players);
      } else if (command == 3) {
        break;
      }
    }

    scanner.close();
  }

  public static zaidejas ZaidejoIvestis(Scanner scanner) {
    System.out.print("Iveskite varda: ");
    String vardas = scanner.next();
    System.out.print("Iveskite hitpoints: ");
    int hitpoints = scanner.nextInt();
    System.out.print("Iveskite max hitpoints: ");
    int maxHitpoints = scanner.nextInt();
    return new zaidejas(vardas, hitpoints, maxHitpoints);
  }

  public static void AtspausdintiZaidejuSarasa(ArrayList<zaidejas> players) {
    for (int i = 0; i < players.size(); i++) {
      zaidejas player = players.get(i);
      System.out.println(player.getVardas() + " " + player.getHitpoints() + " " + player.getMaxHitpoints() + " " + player.koksStatusas());
    }
  }
}
