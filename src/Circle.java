import java.util.Scanner;



public class Circle {
    int circles;
    double radius;
    double omkrets;
    double area;
    public Circle(){
        MakeCircle();
    }

    public void MakeCircle(){
        System.out.println("Hur många circlar vill du ha :");
        Scanner  myscan = new Scanner(System.in);
        circles = myscan.nextInt();

          try {
              for (int i = 0; i < circles; i++) {

                  System.out.println("Hur stor är radiusen : ");
                  Scanner radscan = new Scanner(System.in);
                  radius = radscan.nextDouble();

                  area = Math.PI * radius * radius;
                  omkrets = 2 * Math.PI * radius;
                  System.out.println("area = " + area);
                  System.out.println("omkrets = " + omkrets);

              }
          } catch (Exception e){
              area = Math.PI * 1 *1;
              omkrets = 2 * Math.PI * 1;
              System.out.println("area = " + area);
              System.out.println("omkrets = " + omkrets);
          }





    }



}
