package view;

import java.util.Scanner;

public class Menu {
    private int option;
    Scanner sc = new Scanner(System.in);

    /**
     * constructor
     */
    public Menu() {
        super();
    }

    /**
     * Menu que contiene los opciones que controla los submenus
     * @return retorna las opciones
     */
    public int mainMenu() {

        System.out.println("-----------------------------------------");
        System.out.println("-			Main Menu			        -");
        System.out.println("-----------------------------------------");
        System.out.println("- 	1. Show all the Characters	        -");
        System.out.println("-	2. Show the characters with region  -");
        System.out.println("-	3. Show all the 5 stars characters  -");
        System.out.println("-	4. Show the characters with name    -");
        System.out.println("-	5. Modifier a character name    	-");
        System.out.println("-	6. Modifier a character         	-");
        System.out.println("-	7. Delete a character with name     -");
        System.out.println("-	8. Delete characters with region	-");
        System.out.println("-	9. Exit                         	-");
        System.out.println("-----------------------------------------");

        System.out.println("Choose a option : ");
        try{
            option = sc.nextInt();
        }catch (Exception e){
            System.out.println("The option you have choice doesn't exist");
        }
        return option;
    }

}