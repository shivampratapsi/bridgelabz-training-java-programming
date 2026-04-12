/*
Problem 4: Movie Ticket Billing System
Step 1 – Calculate Ticket Cost
Given number of seats and show time, the billing system should return the total ticket cost.

Cost: ₹150/seat (Morning), ₹250/seat (Evening)
Minimum Booking: ₹150

Step 2 – Multiple Bookings
The Billing System should now accept multiple bookings and return the aggregate total.

Step 3 – Enhanced Bill
The Bill should now return:

Total Number of Bookings
Total Amount Paid
Average Amount Per Booking

Step 4 – Ticket Service
Given a user ID, the Ticket Service fetches booking records from the Booking Repository and returns the Bill.
Step 5 – Premium Screenings
The cinema now supports 2 categories:

Regular: ₹150/seat (Morning), ₹250/seat (Evening), Minimum ₹150
IMAX/4DX: ₹400/seat (Morning), ₹600/seat (Evening), Minimum ₹400
 */

import java.util.Scanner;

public class MovieTicketBillingSystem {
    // Price
    static int regularMorningPrice = 150;
    static int regularEveningPrice = 250;
    static int imaxMorningPrice = 400;
    static int imaxEveningPrice = 600;
    // Count
    static int regularMorningCount = 100;
    static int regularEveningCount = 100;
    static int imaxMorningCount = 100;
    static int imaxEveningCount = 100;

    // For Multiple people booking return cost
    int multipleBooking(int numberOfSeats, String screeningType, String showTiming) {
        int morningCost = 0, eveningCost = 0;
        if (numberOfSeats > 0) {
            if (screeningType.equals("regular")) {

                if (showTiming.equals("morning") && regularMorningCount >= numberOfSeats) {
                    morningCost = numberOfSeats * regularMorningPrice;
                    regularMorningCount -= numberOfSeats;
                    System.out.println("Book successfull !");
                    
                } else if (showTiming.equals("evening") && regularEveningCount >= numberOfSeats) {
                    eveningCost = numberOfSeats * regularEveningPrice;
                    regularEveningCount -= numberOfSeats;
                    System.out.println("Book successfull !");
                    
                } else {
                    System.out.println("Enter correct information !");
                }
                
            } else if ((screeningType.equals("imax") || screeningType.equals("4dx"))) {
                
                if (showTiming.equals("morning") && imaxMorningCount >= numberOfSeats) {
                    morningCost = numberOfSeats * imaxMorningPrice;
                    imaxMorningCount -= numberOfSeats;
                    System.out.println("Book successfull !");
                    
                } else if (showTiming.equals("evening") && imaxEveningCount >= numberOfSeats) {
                    eveningCost = numberOfSeats * imaxEveningPrice;
                    imaxEveningCount -= numberOfSeats;
                    System.out.println("Book successfull !");
                    
                } else {
                    System.out.println("Enter correct information !");
                }
            }
            
            else {
                System.out.println("Enter valid screening type !");
            }
            return morningCost + eveningCost;
        }

        System.out.println("Enter valid count of people !");
        return -1;
        
    }
    
    // For single person booking return cost
    int singleBooking(String screeningType, String showTiming) {
        int morningCost = 0, eveningCost = 0;
        
        if (screeningType.equals("regular")) {
            
            if (showTiming.equals("morning") && regularMorningCount > 0) {
                morningCost = regularMorningPrice;
                regularMorningCount--;
                System.out.println("Book successfull !");
                
            } else if (showTiming.equals("evening") && regularEveningCount > 0) {
                eveningCost = regularEveningPrice;
                regularEveningCount--;
                System.out.println("Book successfull !");
            } else {
                System.out.println("Enter correct information ! ");
            }
        }
        
        else if ((screeningType.equals("imax") || screeningType.equals("4dx"))) {
            
            if (showTiming.equals("morning") && imaxMorningCount > 0) {
                morningCost = imaxMorningPrice;
                imaxMorningCount--;
                System.out.println("Book successfull !");
                
            } else if (showTiming.equals("evening") && imaxEveningCount > 0) {
                eveningCost = imaxEveningPrice;
                imaxEveningCount--;
                System.out.println("Book successfull !");
            } else {
                System.out.println("Enter correct information ! ");
            }
        } else {
            System.out.println("Enter valid screening type !");
        }

        return morningCost + eveningCost;

    }

    // Total number of booking
    void totalBooking() {
        System.out.println("Total regular morning bookings are " + (100 - regularMorningCount));
        System.out.println("Total regular evening bookings are " + (100 - regularEveningCount));
        System.out.println("Total IMAX/4DX morning bookings are " + (100 - imaxMorningCount));
        System.out.println("Total IMAX/4DX evening bookings are " + (100 - imaxEveningCount));

    }

    // Total amount paid
    void totalAmount() {
        System.out.println("Total regular morning amount is " + ((100 - regularMorningCount) * regularMorningPrice));
        System.out.println("Total regular evening amount is " + ((100 - regularEveningCount) * regularEveningPrice));
        System.out.println("Total IMAX/4DX morning amount is " + ((100 - imaxMorningCount) * imaxMorningPrice));
        System.out.println("Total IMAX/4DX evening amount is " + ((100 - imaxEveningCount) * imaxEveningPrice));

    }

    // Average Amount Per Booking
    void averageAmountPerBooking() {

        if (regularMorningCount < 100) {

            System.out.println("Average amount for regular morning screening is "
                    + ((float) (100 - regularMorningCount) * regularMorningPrice) / (100 - regularMorningCount));
        }
        if (regularEveningCount < 100) {

            System.out.println("Average amount for regular evening screening is "
                    + ((float) (100 - regularEveningCount) * regularEveningPrice) / (100 - regularEveningCount));
        }
        if (imaxMorningCount < 100) {

            System.out.println("Average amount for IMAX/4DX morning screening is "
                    + ((float) (100 - imaxMorningCount) * imaxMorningPrice) / (100 - imaxMorningCount));
        }
        if (imaxEveningCount < 100) {

            System.out.println("Average amount for IMAX/4DX evening screening is "
                    + ((float) (100 - imaxEveningCount) * imaxEveningPrice) / (100 - imaxEveningCount));
        }

    }

    public static void main(String[] args) {
        MovieTicketBillingSystem movieBillingSystem = new MovieTicketBillingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========================================");
            System.out.println("========================================");

            System.out.println("1. For single person");
            System.out.println("2. For multiple persons");
            System.out.println("3. For enhanced bill");
            System.out.println("4. For exit system ");
            try {
                
                System.out.println("Enter number -");
                int input = Integer.parseInt(scanner.nextLine().trim()) ;

                switch (input) {

                    case 1:
                        
                            System.out.println("Enter screening type:");
                            String type1 = scanner.nextLine().trim().toLowerCase();
                            System.out.println("Enter show timing :");
                            String showTime1 = scanner.nextLine().trim().toLowerCase();
                            movieBillingSystem.singleBooking(type1, showTime1);
                            break;
                     
                    case 2:
                        
                            System.out.println("Enter number of people :");
                            int peopleNumber = Integer.parseInt(scanner.nextLine().trim());
                            System.out.println("Enter screening type :");
                            String type2 = scanner.nextLine().trim().toLowerCase();
                            System.out.println("Enter show timing :");
                            String showTime2 = scanner.nextLine().trim().toLowerCase();
                            movieBillingSystem.multipleBooking(peopleNumber, type2, showTime2);
                            break;
                      
                    case 3:

                            System.out.println("Total number of booking ");
                            movieBillingSystem.totalBooking();
                            System.out.println("Total amount paid ");
                            movieBillingSystem.totalAmount();
                            System.out.println("Average amount per booking ");
                            movieBillingSystem.averageAmountPerBooking();
                            break;
                       
                    case 4:
                        System.out.println("Log out !");
                        return;
                    default:
                        System.out.println("Enter correct input !");

                }
            } catch (Exception e) {
                System.out.println("Enter correct input  " +  e);
                
            }
            
        }
        // scanner.close();
    }

}

/*
 * using switch case
 * taking input
 * step 1. single user -->
 * screening type - imax or regular
 * show time - morning or evening
 * check seat availability
 * count -- or remaining seat capacity
 * 
 * cost -> result print
 * 
 * then ask for addition or not
 * 
 * step 2. multiple user ->
 * 
 * screening type - imax or regular
 * show time - morning or evening
 * check seat availability
 * count -- or remaining seat capacity
 * 
 * cost print
 * 
 * then ask for addition or not
 * 
 * 
 */