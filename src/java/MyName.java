package src.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

      //Substituindo caracteres minusculos por 0"
public class MyName {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new
          InputStreamReader(new
          FileInputStream("src//java//resources//2-myname.txt")));
    String line = br.readLine();

    System.out.println("Atividade encontrar caracteres em um Range");
    System.out.println("---------------------------------------");
    while (line != null) {
      line = line.replaceAll("[a-z]", "0");
      System.out.println(line);
      line = br.readLine();
    }
  }
}

      //Substituindo caracteres maiusculos por 0"
class MyName2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new
          InputStreamReader(new
          FileInputStream("src//java//resources//2-myname.txt")));
    String line = br.readLine();

    System.out.println("Atividade encontrar caracteres em um Range");
    System.out.println("---------------------------------------");
    while (line != null) {
      line = line.replaceAll("[A-Z]", "0");
      System.out.println(line);
      line = br.readLine();
    }
  }
}


      //Substituindo caracteres maiusculos e minusculos por 0"
class MyName3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new
          InputStreamReader(new
          FileInputStream("src//java//resources//2-myname.txt")));
    String line = br.readLine();

    System.out.println("Atividade encontrar caracteres em um Range");
    System.out.println("---------------------------------------");
    while (line != null) {
      line = line.replaceAll("[A-Za-z]", "0");
      System.out.println(line);
      line = br.readLine();
    }
  }
}