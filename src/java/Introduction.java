package src.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Introduction {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new
          InputStreamReader(new
          FileInputStream("src//java//resources//introduction.txt")));
    String line = br.readLine();

    System.out.println("Atividade encontrar item e trocar por 0");
    System.out.println("---------------------------------------");
    while (line != null) {
      //Substituindo o primeiro caractere após "item (whitespace), que seja 'a' 'c' ou 'd'  "
      line = line.replaceAll("item\\s[acd]", "item 0");
      System.out.println(line);
      line = br.readLine();
    }
  }
}

class Introduction2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new
          InputStreamReader(new
          FileInputStream("src//java//resources//introduction.txt")));
    String line = br.readLine();

    System.out.println("Atividade encontrar item por negação");
    System.out.println("---------------------------------------");
    while (line != null) {
      //Substituindo o primeiro caractere após "item (whitespace), que NÃO seja 'a' 'c' ou 'd'  "
      line = line.replaceAll("item\\s[^acd]", "item 0");
      System.out.println(line);
      line = br.readLine();
    }
  }
}
