import java.util.Scanner;
public class IPAddress {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter four integer values for the IP address octets:");

          int[] octets = new int[4]; for
        (int i = 0; i < 4; i++) {

              System.out.print("Octet " + (i + 1) + ": ");

              octets[i] = scanner.nextInt();

        if (octets[i] < 0 || octets[i] > 255)

            { System.out.println("Octet " + (i + 1) + " is incorrect.");

        return; } } System.out.print("IP Address: "); for (int i = 0; i < 3; i++)

            { System.out.print(octets[i] + "."); }

            System.out.println(octets[3]); scanner.close();

    }
            }

