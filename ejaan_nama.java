/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
*NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class ejaan_nama {
     public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their first name
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String name = scanner.nextLine();

        // Spell out the name
        System.out.println("Ejaan untuk \"" + name + "\" adalah :");

        // Loop through each letter in the name and print its position
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + name.charAt(i));
        }

        // Close the scanner object
        scanner.close();
    }
}
