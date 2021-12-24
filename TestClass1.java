/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass1 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int testCases = Integer.parseInt(s.nextLine());
        for(int i=0; i<testCases; i++){
            String noOfBallons[] = s.nextLine().split(" ");
            int a[] = new int[noOfBallons.length];
            for(int m = 0; m<noOfBallons.length; m++){
                a[m] = Integer.parseInt(noOfBallons[m]);
            }

            int noOfParticipants = Integer.parseInt(s.nextLine());
            int totalPrice = 0;
            for(int j=0; j<noOfParticipants; j++){
                String allProblems[] = s.nextLine().split(" ");
                int problems[] = new int[allProblems.length];
                boolean alternate = false;
                for(int k = 0; k<allProblems.length; k++){
                    problems[k] = Integer.parseInt(allProblems[k]);
                    if(problems[k] == 1 && alternate==false) {
                        totalPrice = totalPrice + (a[k] * problems[k]);
                        alternate = true;
                    }
                    
                    else if(problems[k] == 1 && alternate==true){
                        if(k == 0)
                            totalPrice = totalPrice + (a[k+1] * problems[k]);
                        else if(k==1)
                             totalPrice = totalPrice + (a[k-1] * problems[k]);
                        
                        alternate = false;
                    }
                   
                    }
                    }
                    System.out.println(totalPrice);
                }
                s.close();
            }
        
}
