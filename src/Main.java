import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i>0){
        System.out.println("Choose function: 1 - '+'  2 - '-'  3 - '*'  4 - 'square'  5 - '/'" +
                "6 - 'sin'  7 - 'cos'  8 - 'tg'  9 - '√'  10 - 'ln' 0 - 'exit'");
        Scanner sc = new Scanner(System.in);
        int choise;
        if(sc.hasNextInt()) {
            choise = sc.nextInt();
            switch (choise) {
                case 0:
                    sc.close();
                    System.exit(0);
                case 1:
                    int x1;
                    int x2;
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println("Enter x2");
                        if (sc.hasNextInt()) {
                            x2 = sc.nextInt();
                            System.out.println(x1 + x2);
                            break;
                        }else System.out.println("Error. Enter a number of type int");
                    }
                    else System.out.println("Error. Enter a number of type int");
                    break;
                case 2:
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println("Enter x2");
                        if (sc.hasNextInt()) {
                            x2 = sc.nextInt();
                            System.out.println(x1 - x2);
                            break;
                        }else System.out.println("Error. Enter a number of type int");
                    }
                    else System.out.println("Error. Enter a number of type int");
                    break;
                case 3:
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println("Enter x2");
                        if (sc.hasNextInt()) {
                            x2 = sc.nextInt();
                            System.out.println(x1 * x2);
                            break;
                        }else System.out.println("Error. Enter a number of type int");
                    }
                    else System.out.println("Error. Enter a number of type int");
                    break;
                case 4:
                    System.out.println("Enter x1");
                    if (sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println("Enter degree x1");
                        if (sc.hasNextInt()) {
                            x2 = sc.nextInt();
                            System.out.println(Math.pow(x1, x2));
                            break;
                        }else System.out.println("Error. Enter a number of type int");
                    }else System.out.println("Error. Enter a number of type int");
                    break;
                case 5:
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println("Enter x2");
                        if (sc.hasNextInt()) {
                            x2 = sc.nextInt();
                            System.out.println(x1 / x2);
                            break;
                        }else System.out.println("Error. Enter a number of type int");
                    }
                    else System.out.println("Error. Enter a number of type int");
                    break;
                case 6:
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()){
                    x1 = sc.nextInt();
                    System.out.println(Math.sin(x1));
                    break;
                    }else System.out.println("Error. Enter a number of type int");
                    break;
                case 7:
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println(Math.cos(x1));
                        break;
                    }else System.out.println("Error. Enter a number of type int");
                    break;
                case 8:
                    System.out.println("Enter x1");
                    if(sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println(Math.tan(x1));
                        break;
                    }else System.out.println("Error. Enter a number of type int");
                    break;
                case 9:
                    System.out.println("Enter x1");
                    if (sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println(Math.sqrt(x1));
                        break;
                    }else System.out.println("Error. Enter a number of type int");
                    break;
                case 10:
                    System.out.println("Enter x1");
                    if (sc.hasNextInt()) {
                        x1 = sc.nextInt();
                        System.out.println(Math.log(x1));
                        break;
                    }else System.out.println("Error. Enter a number of type int");
                    break;
                default: System.out.println("Function not found");
            }
        }
        else System.out.println("Error. Enter a number of type int");
        }
    }
}