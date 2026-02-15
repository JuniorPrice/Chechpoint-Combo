import java.util.ArrayList;
import java.util.Scanner;

public class Ticket_CLI {

    
    public static void main(String[] args) {

        // declear variables
        ArrayList<String> tickets = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean count = true;
        // display user menu and take user choice
        System.out.println("=".repeat(50));
        System.out.println("               Welcom to Ticket Desk CLI");
        System.out.println("=".repeat(50));
        System.out.println("Available Servecies:");
        System.out.println("(1) to Create a ticket\n(2) to List all tickets\n(3) to Update a ticket\n(4) to Close/Delete a ticket\n(5) to Exit\n");
        


        // procces user choice

        while(count){
            System.out.print(">> Choose your service: ");
            int choice = input.nextInt();
            if (choice > 0 && choice < 6){

                if (choice == 1){
                    // createTicket();
                }
                else if (choice == 2){
                    // listTickets();
                }
                else if (choice == 3){
                    // updateTicket();
                }
                else if (choice == 4){
                    // deleteTicket();
                }
                else if (choice == 5){
                    System.out.println("\nThank you for your time!...\n");
                    count = false;
                }
            }
            else{
                System.out.println("Invalid input! Try Again...");
            }

        }


    }

    // declear gitIndex function
    


    // declear createTicket function


    // declear listTickets function


    // declear updateTicket function


    // declear deleteTicket function

    
}
