package labs.example.fileOperations;

import java.io.*;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.* ;

public class fileOperator{

    private static final String FILE_PATH = "C:/Git/CSC_151_Madeleine_Vansky/src/labs/example/fileOperations/";
    private static final String FILE_NAME = FILE_PATH + "files/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/csv_error.log";

public static void main(String[] args) throws IOException{
    BufferedReader file = openCSVFile();
    file.close();
    
}
private static BufferedReader openCSVFile() throws IOException{

    File csv_file = new File(FILE_NAME);


    BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(FILE_NAME, true));

        int count = 0;
        int alice = 0;
        int bob = 0;
        File log_file = new File(FILE_NAME);
        BufferedReader file = new BufferedReader(new FileReader(FILE_NAME));
        try{
            String line;
           
            if(log_file.exists() ){
                 
                while((line = file.readLine()) != null){
                    String[] value = line.split(",");
                    if (count == 1){
                        int int1 = Integer.parseInt(value[1]);
                        int int2 = Integer.parseInt(value[2]);
                        int int3 = Integer.parseInt(value[3]);

                        alice = (int1 + int2 + int3) / 3;

                        
                    }
                    else if (count == 2){
                        int int1 = Integer.parseInt(value[1]);
                        int int2 = Integer.parseInt(value[2]);
                        int int3 = Integer.parseInt(value[3]);

                        bob = (int1 + int2 + int3) / 3;
                    }
                    
                    count++;                    
                   
                }
                }
                System.out.println("The average for Alice's scores are: " + alice);
                System.out.println("The average for Bobs's scores are: " + bob);

           
        }
        catch(Exception e){
     
    }
    
    return new BufferedReader(new FileReader(ERROR_LOG_FILE));
    }
}
