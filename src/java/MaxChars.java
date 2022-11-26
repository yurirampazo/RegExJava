package src.java;

public class MaxChars {
  public static void main(String[] args) {

    String instant = "2022-11-21T21:34:55.773785800"
          .replaceAll("(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)T(\\d\\d):(\\d\\d):(\\d\\d).\\d+",
                "Data: $3/$2/$1\nHorário: $4:$5:$6h");

    System.out.println(instant);

  }
}
