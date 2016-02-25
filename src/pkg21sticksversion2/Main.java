/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21sticksversion2;

import java.util.Scanner;

/**
 * @author N1CO
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)
            throws java.io.IOException {

        int sticks = 21;
        Scanner take = new Scanner(System.in);
        int toTake = 0;
        char first, ignore;

        for (;;) {
            do {
                System.out.println("Go 1st? y/n? (Press q to quit)");
                first = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (first == 'Y' | first == 'y' | first == 'n' | first == 'N' & first != 'q' & first != 'Q');
            if (first == 'q') {
                break;
            }

            switch (first) {
                case 'y' | 'Y':
                    do {
                        System.out.println("There are " + sticks + " sticks");
                        System.out.println("How many you want to take? 1 or 2? (q to quit)");
                        toTake = take.nextInt();

                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');

                        if (toTake == 'q') {
                            break;
                        } else {
                            sticks = sticks - toTake;
                        }

                        if (sticks <= 0) {
                            System.out.println("You lose!");
                        } else {
                            if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
                                toTake = 1;
                            } else {
                                toTake = 2;
                            }
                            System.out.println("AI takes " + toTake + " sticks. Your turn");
                            sticks = sticks - toTake;

                            if (sticks <= 0) {
                                System.out.println("You win ! ! !");
                            }
                        }
                    } while (sticks > 0);

                case 'n' | 'N':
                    do {
                        if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
                            toTake = 1;
                        } else {
                            toTake = 2;
                        }
                        sticks = sticks - toTake;

                        System.out.println("There are " + sticks + " sticks");
                        System.out.println("How many you want to take? 1 or 2? (q to quit)");
                        toTake = take.nextInt();

                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');

                        if (toTake == 'q') {
                            break;
                        } else {
                            sticks = sticks - toTake;
                        }

                        if (sticks <= 0) {
                            System.out.println("You lose!");
                        } else {
                            if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
                                toTake = 1;
                            } else {
                                toTake = 2;
                            }
                            System.out.println("AI takes " + toTake + " sticks. Your turn");
                            sticks = sticks - toTake;

                            if (sticks <= 0) {
                                System.out.println("You win ! ! !");
                            }
                        }

                    } while (sticks > 0);
            }

        }
    }
}
