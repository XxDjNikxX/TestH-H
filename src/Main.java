import Creatures.*;
import java.security.SecureRandom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int n = sc.nextInt();
        int m = sc.nextInt();
        Monsters ms = new Monsters(rand.nextInt(n - 1),n,m);
        Player p = new Player(rand.nextInt(n-1),n,m);

    }
}
