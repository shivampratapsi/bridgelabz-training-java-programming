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
    static final int MAX_LIMIT = 100;
    static final int[] PRICES = { 150, 250, 400, 600 };
    static final int[] COUNTS = { 100, 100, 100, 100 };
    static final String[] SCREENINGS = { "regular morning", "regular evening", "IMAX/4DX morning", "IMAX/4DX evening" };

    MovieTicketBillingSystem() {
        System.out.println("WELCOME TO MOVIE TICKET BILLING SYSTEM !! \n");
    }

    // For Multiple people booking return cost
    void multipleBooking(int numberOfSeats, String screeningType, String showTiming) {
        if (numberOfSeats > 0) {
            if (screeningType.equals("regular")) {

                if (showTiming.equals("morning") && COUNTS[0] >= numberOfSeats) {
                    COUNTS[0] -= numberOfSeats;
                    System.out.println("Book successfull !");

                } else if (showTiming.equals("evening") && COUNTS[1] >= numberOfSeats) {

                    COUNTS[1] -= numberOfSeats;
                    System.out.println("Book successfull !");

                } else {
                    System.out.println("Enter correct information or limit reached !");
                }

            } else if ((screeningType.equals("imax") || screeningType.equals("4dx"))) {

                if (showTiming.equals("morning") && COUNTS[2] >= numberOfSeats) {
                    COUNTS[2] -= numberOfSeats;
                    System.out.println("Book successfull !");

                } else if (showTiming.equals("evening") && COUNTS[3] >= numberOfSeats) {
                    COUNTS[3] -= numberOfSeats;
                    System.out.println("Book successfull !");

                } else {
                    System.out.println("Enter correct information or limit reached !");
                }
            } else {
                System.out.println("Enter valid screening type !");
            }
        } else {
            System.out.println("Enter valid count of people !");
        }
    }

    // For single person booking return cost
    void singleBooking(String screeningType, String showTiming) {

        if (screeningType.equals("regular")) {

            if (showTiming.equals("morning") && COUNTS[0] > 0) {

                COUNTS[0]--;
                System.out.println("Book successfull !");

            } else if (showTiming.equals("evening") && COUNTS[1] > 0) {

                COUNTS[1]--;
                System.out.println("Book successfull !");
            } else {
                System.out.println("Enter correct information or limit reached ! ");
            }
        }

        else if ((screeningType.equals("imax") || screeningType.equals("4dx"))) {

            if (showTiming.equals("morning") && COUNTS[2] > 0) {

                COUNTS[2]--;
                System.out.println("Book successfull !");

            } else if (showTiming.equals("evening") && COUNTS[3] > 0) {

                COUNTS[3]--;
                System.out.println("Book successfull !");
            } else {
                System.out.println("Enter correct information ! ");
            }
        } else {
            System.out.println("Enter valid screening type !");
        }
    }

    // Total number of booking
    void totalBooking() {
        System.out.println("========================================");
        System.out.println("========================================");
        for (int i = 0; i < COUNTS.length; i++) {
            int countOfBooking = MAX_LIMIT - COUNTS[i];
            if (countOfBooking > 0) {
                System.out.println("Total " + SCREENINGS[i] + " bookings are " + countOfBooking);
            } else {
                System.out.println("No booking in " + SCREENINGS[i]);
            }
        }
    }

    // Total amount paid
    void totalAmount() {
        System.out.println("========================================");
        System.out.println("========================================");
        for (int i = 0; i < COUNTS.length; i++) {
            int countOfBooking = MAX_LIMIT - COUNTS[i];
            if (countOfBooking > 0) {

                System.out.println("Total " + SCREENINGS[i] + " amount is " + (countOfBooking * PRICES[i]));
            } else {
                System.out.println("No booking in " + SCREENINGS[i]);
            }
        }
    }

    // Average Amount Per Booking
    void averageAmountPerBooking() {
        System.out.println("========================================");
        System.out.println("========================================");

        for (int i = 0; i < PRICES.length; i++) {
            int countOfPeople = MAX_LIMIT - COUNTS[i];

            if (countOfPeople > 0) {

                System.out.println("Average amount for " + SCREENINGS[i] + " screening is "
                        + ((float) countOfPeople * PRICES[i]) / countOfPeople);
            } else {
                System.out.println("No booking in " + SCREENINGS[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicketBillingSystem movieBillingSystem = new MovieTicketBillingSystem();
        while (true) {
            System.out.println("========================================");
            System.out.println("========================================");

            System.out.println("1. For single person");
            System.out.println("2. For multiple persons");
            System.out.println("3. For enhanced bill");
            System.out.println("4. For exit system ");
            try {

                System.out.println("Enter number -");
                int input = Integer.parseInt(scanner.nextLine().trim());

                switch (input) {

                    case 1:

                        System.out.println("Enter screening type: Regular or IMAX/4DX");
                        String type1 = scanner.nextLine().trim().toLowerCase();
                        System.out.println("Enter show timing : Morning or Evening");
                        String showTime1 = scanner.nextLine().trim().toLowerCase();
                        movieBillingSystem.singleBooking(type1, showTime1);
                        break;

                    case 2:

                        System.out.println("Enter number of people :");
                        int peopleNumber = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println("Enter screening type : Regular or IMAX/4DX");
                        String type2 = scanner.nextLine().trim().toLowerCase();
                        System.out.println("Enter show timing : Morning or Evening");
                        String showTime2 = scanner.nextLine().trim().toLowerCase();
                        movieBillingSystem.multipleBooking(peopleNumber, type2, showTime2);
                        break;

                    case 3:

                        System.out.println("========================================");
                        System.out.println("Total number of booking ");
                        movieBillingSystem.totalBooking();

                        System.out.println("========================================");
                        System.out.println("Total amount paid ");
                        movieBillingSystem.totalAmount();

                        System.out.println("========================================");
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
                System.out.println("Enter correct input  " + e);
            }
        }
    }
}



/*flow of system
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