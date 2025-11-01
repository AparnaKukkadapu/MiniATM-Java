import java.util.Scanner;

class AirportQuizProject {
    public static void main(String[] args) {
        
        System.out.println("Welcome to Airport Quiz");
        System.out.println("Please read the below game rules and your host will guide you through the entire game!");
        System.out.println("1. This is a multiple choice question game.");
        System.out.println("2. For each question there will be 4 options, you have to select one option");
        System.out.println("3. There are going to be 4 levels in the game(easy,medium,hard,difficult) and the difficulty will be increasing through each level");
        System.out.println("4. In level one, for each correct answer you will win one thousand rupees, level two-three thousand rupees for each correct answer, level three-five thousand rupees for each correct answer, level four-ten thousand rupees for each correct answer");
        System.out.println("5. We will display the airport codes and you should select the city");
        System.out.println("I hope you have read all the rules and ready to start the game");
        System.out.println("WELCOME TO LEVEL1");

        int level1score=0;
        int level2score=0;
        int level3score=0;
        int level4score=0;
      
        //Question1
        System.out.println("Airport code: DEL");
        System.out.println("option A: MUMBAI");
        System.out.println("option B: DELHI");
        System.out.println("option C: KOLKATA");
        System.out.println("option D: CHENNAI");

        Scanner scanner=new Scanner(System.in);
        char option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'B':
            {
                System.out.println("Correct Answer!");
                level1score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        
        //Question2
        System.out.println("Airport code: BOM");
        System.out.println("option A: MUMBAI");
        System.out.println("option B: BENGALURU");
        System.out.println("option C: HYDERABAD");
        System.out.println("option D: PUNE");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level1score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }

        //Question3
        System.out.println("Airport code: BLR");
        System.out.println("option A: BENGALURU");
        System.out.println("option B: CHENNAI");
        System.out.println("option C: KOCHI");
        System.out.println("option D: JAIPUR");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level1score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         //Question4
        System.out.println("Airport code: MAA");
        System.out.println("option A: CHENNAI");
        System.out.println("option B: HYDERABAD");
        System.out.println("option C: KOCHI");
        System.out.println("option D: LUCKNOW");

       
      option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level1score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        //Question5
        System.out.println("Airport code: COK");
        System.out.println("option A: CHENNAI");
        System.out.println("option B: HYDERABAD");
        System.out.println("option C: KOCHI");
        System.out.println("option D: LUCKNOW");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'C':
            {
                System.out.println("Correct Answer!");
                level1score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        int level1amount=level1score*1000;
        System.out.println("Congratulations on completing LEVEL1!!!!!");
        System.out.println("Number of correct answers in LEVEL1 is " +level1score);
        System.out.println("Amount you won in LEVEL1 is " +level1amount);
        System.out.println("Let's get started with LEVEL2!");

        //Question6
        System.out.println("Airport code: HYD");
        System.out.println("option A: PUNE");
        System.out.println("option B: PATNA");
        System.out.println("option C: KOCHI");
        System.out.println("option D: HYDERABAD");

       
      option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'D':
            {
                System.out.println("Correct Answer!");
                level2score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        //Question7
        System.out.println("Airport code: CCU");
        System.out.println("option A: CHANDIGARH");
        System.out.println("option B: CHENNAI");
        System.out.println("option C: KOLKATA");
        System.out.println("option D: COIMBATORE");

       
       option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'C':
            {
                System.out.println("Correct Answer!");
                level2score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         //Question8
        System.out.println("Airport code: LKO");
        System.out.println("option A: LEH");
        System.out.println("option B: LUCKNOW");
        System.out.println("option C: LUDHIANA");
        System.out.println("option D: SILIGURI");

       
       option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'B':
            {
                System.out.println("Correct Answer!");
                level2score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         //Question9
        System.out.println("Airport code: GAU");
        System.out.println("option A: GOA");
        System.out.println("option B: GAYA");
        System.out.println("option C: GANGTOK");
        System.out.println("option D: GUWAHATI");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'D':
            {
                System.out.println("Correct Answer!");
                level2score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        //Question10
        System.out.println("Airport code: IXR");
        System.out.println("option A: RANCHI");
        System.out.println("option B: RAIPUR");
        System.out.println("option C: RAJKOT");
        System.out.println("option D: ROURKELA");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level2score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         int level2amount=level2score*3000;
        System.out.println("Congratulations on completing LEVEL2!!!!!");
        System.out.println("Number of correct answers is " +level2score);
        System.out.println("Amount you won in LEVEL2 is " +level2amount);
        System.out.println("Let's get started with LEVEL3");

            //Question11
        System.out.println("Airport code: TRV");
        System.out.println("option A: THIRUVANANTHAPURAM");
        System.out.println("option B: TIRUPATI");
        System.out.println("option C: TRICHY");
        System.out.println("option D: TAWANG");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level3score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }

          //Question12
        System.out.println("Airport code: JAI");
        System.out.println("option A: JODHPUR");
        System.out.println("option B: JAMMU");
        System.out.println("option C: JAIPUR");
        System.out.println("option D: JALGAON");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'C':
            {
                System.out.println("Correct Answer!");
                level3score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        //Question13
        System.out.println("Airport code: IXC");
        System.out.println("option A: COIMBATORE");
        System.out.println("option B: INDORE");
        System.out.println("option C: RANCHI");
        System.out.println("option D: CHANDIGARH");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'D':
            {
                System.out.println("Correct Answer!");
                level3score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        //Question14
        System.out.println("Airport code: BBI");
        System.out.println("option A: BHUBANESWAR");
        System.out.println("option B: BILASPUR");
        System.out.println("option C: BOKARO");
        System.out.println("option D: BARODA");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level3score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         //Question15
        System.out.println("Airport code: TRZ");
        System.out.println("option A: TIRUCHIRAPALLI");
        System.out.println("option B: TRIVANDRUM");
        System.out.println("option C: TUMKUR");
        System.out.println("option D: THANJAVUR");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level3score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         int level3amount=level3score*5000;
        System.out.println("Congratulations on completing LEVEL3!!!!!");
        System.out.println("Number of correct answers is " +level3score);
        System.out.println("Amount you won in LEVEL3 is " +level3amount);
        System.out.println("Let's get started with LEVEL4");

        //Question16
        System.out.println("Airport code: IXZ");
        System.out.println("option A: JAIPUR");
        System.out.println("option B: PORT BLAIR");
        System.out.println("option C: JODHPUR");
        System.out.println("option D: AGRA");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'B':
            {
                System.out.println("Correct Answer!");
                level4score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
         //Question17
        System.out.println("Airport code: IXW");
        System.out.println("option A: SONIPAT");
        System.out.println("option B: JAISALMER");
        System.out.println("option C: DEHRADUN");
        System.out.println("option D: JAMSHEDPUR");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'D':
            {
                System.out.println("Correct Answer!");
                level4score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
        }
        //Question18
        System.out.println("Airport code: VNS");
        System.out.println("option A: VARANASI");
        System.out.println("option B: VADODARA");
        System.out.println("option C: VISAKHAPATNAM");
        System.out.println("option D: VIJAYAWADA");

       
        option = scanner.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'A':
            {
                System.out.println("Correct Answer!");
                level4score++;
                break;
            }                       
        
            default:
            System.out.println("Incorrect Answer!");
                break;
           }
             int level4amount=level4score*10000;
        System.out.println("Congratulations on completing LEVEL4!!!!!");
        System.out.println("Number of correct answers is " +level4score);
        System.out.println("Amount you won in LEVEL4 is " +level4amount);
       System.out.println("TOTAL CORRECT ANSWERS IN THE GAME IS " +(level1score+level2score+level3score+level4score));
       System.out.println("TOTAL AMOUNT YOU WON IN THIS GAME IS  " +(level1amount+level2amount+level3amount+level4amount));

    }

}