package adapterPattern;

import java.util.Scanner;

public class PowerOutlet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Laptop laptop = new Laptop();
        PowerOutletFunction macBook = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        RefrigeratorAdapter ref = new RefrigeratorAdapter(refrigerator);

        SmartPhone smartPhone = new SmartPhone();
        PowerOutletFunction iPhone = new SmartPhoneAdapter(smartPhone);


                        System.out.println("Initiating-------- Adapter----- Pattern!");

                        boolean toExit = false;
                        while (!toExit) {
                            System.out.println("Choose Automative Functions:\n");
                            System.out.println("[1]: Plug In All Appliances");
                            System.out.println("[2]: Plug Off All Appliances");
                            System.out.println("[3]: Get Voltage For All Appliances");
                            System.out.println("[4]: Get Amperage For All Appliances");
                            System.out.println("[5]: Get All Status!");
                            System.out.println("[6]: Program Terminate");

                            System.out.println("Enter Choice: ");

                            int choices = sc.nextInt();

                            switch (choices) {
                                case 1:
                                    System.out.println(macBook.plugIn());
                                    System.out.println(ref.plugIn());
                                    System.out.println(iPhone.plugIn());
                                    break;
                                case 2:
                                    System.out.println(macBook.plugOff());
                                    System.out.println(ref.plugOff());
                                    System.out.println(iPhone.plugOff());
                                    break;
                                case 3:
                                    System.out.println(macBook.getVoltageData());
                                    System.out.println(ref.getVoltageData());
                                    System.out.println(iPhone.getVoltageData());
                                    break;
                                case 4:
                                    System.out.println(macBook.getAmperageData());
                                    System.out.println(ref.getAmperageData());
                                    System.out.println(iPhone.getAmperageData());
                                    break;
                                case 5:
                                    System.out.println(macBook.plugIn());
                                    System.out.println(macBook.getVoltageData());
                                    System.out.println(macBook.getAmperageData());
                                    System.out.println(ref.plugIn());
                                    System.out.println(ref.getVoltageData());
                                    System.out.println(ref.getAmperageData());
                                    System.out.println(iPhone.plugIn());
                                    System.out.println(iPhone.getVoltageData());
                                    System.out.println(iPhone.getAmperageData());
                                    break;
                                case 6:
                                    toExit = true;
                                    System.out.print("Program-Terminating.... -CHUA,VINCE");
                                    break;
                                default:
                                    System.out.println("Incorrect Choice, Try again!");
                                    break;
                            }
                        }
                    }
                }
