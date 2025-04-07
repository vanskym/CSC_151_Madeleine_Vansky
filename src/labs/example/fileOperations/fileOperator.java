package labs.example.fileOperations;

import java.io.*;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.* ;
// reference to page 255 in books will look into more for assistance
// we will be finding the average of the two students and their 3 different classes so this should be parsed as doubles
public class fileOperator{

    private static final String FILE_PATH = "c:/myFiles/src/labs/example/fileOperations/";
    private static final String FILE_NAME = "file/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/csv_error.log";

    public static void main(){
        //call the open() file method //
    }


private static void openCSVFile(){
    /* INSTANCES OF DIFFERENT FILES, THESE ARE OBJECT REFERENCES  */
    File csv_file = new File(FILE_NAME);
    File log_file = new File(ERROR_LOG_FILE);

    //more common error catcher
    try{
        /*buffer writer: making it a new variable here. it is taking the filewriter object as an argument with error_log_file and append true(this just meaning you can add to it at the bottom
         * 
        */

        BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(ERROR_LOG_FILE, true));
        String line;
        int count = 0;
            /*if(count > 0){
                /* the split method is good for splitting a list into a string array  
                String[] value = line.split(",");
            }*/

        if(csv_file.exists() && log_file.exists() ){
            
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            while((line = br.readLine()) != null){

                /* this is a way to convert a string into an integer, parses it into an integer */
               /*  Integer.parseInt("52");*/
                
                csv_file_writer.write("message");
                if(count > 0){
                    /* the split method is good for splitting a list into a string array  */
                    String[] value = line.split(",");
                }

            }

            csv_file_writer.close();

        }
    }
    catch(Exception e){

    }

}

}