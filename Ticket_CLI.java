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
        System.out.println("(1) to Create a ticket\n(2) to List all tickets\n(3) to Update a ticket\n(4) to Close/Delete a ticket\n(5) to Exit");
        


        // procces user choice

        while(count){
            System.out.print("\n>> Choose your service: ");
            int choice = input.nextInt();
            if (choice > 0 && choice < 6){

                // Add new ticket
                if (choice == 1){
                    System.out.print("\nEnter your new ticket: ");
                    String ticket = input.next();
                    if (gitIndex(tickets,ticket) != -1){
                        System.out.println("This ticket already exists!!");
                    }
                    else{
                        tickets.add(ticket);
                        System.out.println("Congrats! Your ticket has been added ...");
                    }
                }
            
                // List all tickets
                else if (choice == 2){
                    System.out.println("=".repeat(50));
                    System.out.println("            Your Tickets");
                    System.out.println("=".repeat(50));

                    if (tickets.size()<1){
                        System.out.println("You have no tickets yet ...!");
                    }
                    else{
                        for(String ticket: tickets){
                        System.out.println((gitIndex(tickets,ticket)+1) + " - " + ticket);
                        }
                    }
                    
                    System.out.println("=".repeat(50));
                }

                // Update ticket
                else if (choice == 3){
                    // declear updateTicket function
                }

                // Delete ticket
                else if (choice == 4){
                    // declear deleteTicket function
                }

                // Exit the program
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
    static int gitIndex(ArrayList<String> tickets,String ticket){
        int index = -1;
        for (int i=0 ; i<tickets.size() ; i++){
            if (tickets.get(i).equals(ticket)){
                index = i;
            }
        }
        return index;
    }


    

    
}
