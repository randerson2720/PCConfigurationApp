import java.util.Scanner;
public class AndersonPCConfig {
    //for loop how many pcs they want to configure
    //outer for loop and do loop inside

    // function for printing the welcome banner
    public static void printWelcome() {
        System.out.println("************************************************************");
        System.out.println("*                                                          *");
        System.out.println("*             Welcome to the PC Configurator               *");
        System.out.println("*                                                          *");
        System.out.println("************************************************************");
        System.out.println("");

    }
    // function for the menu and choice
    public static int menu(Scanner scan) {
        System.out.println("What would you like to upgrade?");
        System.out.println("1. Processor");
        System.out.println("2. Graphics Card");
        System.out.println("3. Memory");
        System.out.println("4. Monitor");
        System.out.println("5. Nothing else - I'm done.");
        System.out.print("Enter the number of your choice: ");
        int choice = scan.nextInt();
        return choice;


    }
    
    public static void main(String[] args) {
        //declares the variables and scanners. Prints the welcome banner from the function. and asks the user how many pcs they want to purchase. 
        Scanner scan = new Scanner(System.in);
        int choice, pcTotal;
        printWelcome();
        System.out.print("How many PCs do you want to purchase? ");
        pcTotal = scan.nextInt();
        System.out.println("\n");
        int processor, graphicsCard, memory, monitor;
        double costProcessor = 0, costGraphicsCard = 0, costMonitor = 0; 
        int memoryAmt = 0, monitorSize = 0;
        double totalCost = 0;
        String typeGraphics = "";
        String typeProcessor = "";
        double costPerPc = 0;
        
        
        // for statement that takes the number of pcs and runds the do loop for the number of pcs.
        for(int i = 1; i <= pcTotal; i++) {
              System.out.println("\nPC #" + i);
              System.out.println("-----\n");
              
        
        do {
            
            choice = menu(scan); //brings in the menu function
            // if else statements for the choices that are picked
            if (choice ==1) {
                    System.out.print("Upgrade the processor to [1] Intel i7 ($200), [2] Intel i9 ($300), [3] AMD 9 5950 ($500): ");
                    processor = scan.nextInt();
                        if (processor == 1) {
                            costProcessor = costProcessor + 200;
                            typeProcessor = "Intel i7";
                        } else if (processor == 2) {
                            costProcessor = costProcessor + 300;
                            typeProcessor = "Intel i9";
                        } else if (processor == 3) {
                            costProcessor = costProcessor + 500;
                            typeProcessor = "AMD 9 5950";
                        }
                        
            } else if (choice == 2) {
                System.out.println("Upgrade the graphics card to [1] Nvidia 2060 ($150), [2] Nvidia 3060 ($250), [3] Nvidia 3080 ($350): ");
                graphicsCard = scan.nextInt();
                    if (graphicsCard == 1) {
                        costGraphicsCard = costGraphicsCard + 150;
                        typeGraphics = "Nvidia 2060";
                    } else if (graphicsCard == 2) {
                        costGraphicsCard = costGraphicsCard + 250;
                        typeGraphics = "Nvidia 3060";
                    } else if (graphicsCard == 3) {
                        costGraphicsCard = costGraphicsCard + 350;
                        typeGraphics = "Nvidida 3080";
                    } 
                    
                    
            } else if (choice == 3) {
                System.out.println("Increase the memory to [1] 16GB, [2] 32GB: ");
                memory= scan.nextInt();
                    if (memory == 1) {
                        memoryAmt = memoryAmt + 16; 
                    } else if (memory == 2) {
                        memoryAmt = memoryAmt + 32;
                    }
            } else if (choice == 4) {
                System.out.println("Add a monitor of size [1] 24 inches ($200), [2] 27 inches ($250), [3] 32 inches ($350): ");
                monitor = scan.nextInt();
                if (monitor == 1) {
                    costMonitor = costMonitor + 200;
                    monitorSize = monitorSize + 24;
                } else if (monitor == 2) {
                    costMonitor = costMonitor + 250;
                    monitorSize = monitorSize + 27;
                } else if (monitor == 3) {
                    costMonitor = costMonitor + 350;
                    monitorSize = monitorSize + 32;
                }
            }  
            
            
        } while (choice != 5); //quits the do loop if the option picked is 5
        costPerPc = 1750 + costProcessor + costGraphicsCard + costMonitor;
        System.out.printf("You have chosen these options for a PC with a total cost of $%.2f:\n", costPerPc); //prints the cost for each pc
        System.out.println("");
        System.out.println("Processor: " + typeProcessor); //prints the configurations
        System.out.println("Graphics Card: " + typeGraphics);
        System.out.println("Memory: " + memoryAmt + "GB");
        System.out.println("Monitor: " + monitorSize + " inches");
        
           
            
        
        
        
        totalCost = costPerPc * i;
        System.out.printf("\nThe total cost of your order of %d PCs is $%.2f\n", i , totalCost); //prints the total cost of the order
        
    }
    
   


        
            
      

        
    }
}