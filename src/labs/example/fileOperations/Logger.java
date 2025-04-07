package labs.example.fileOperations;


import java.io.*;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.* ;

public class Logger {

    private static final String FILE_PATH = "E:/spring/java/wk12/git/CSC_151_Madeleine_Vansky/src/labs/example/fileOperations/";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/api_error.log";

public static void main(String[] args) throws IOException{

    BufferedReader file = openErrorLog();
    getCountOfErrorTypes(file);
    file.close();

    BufferedReader file2 = openErrorLog();
    getMemoryLimitExceededCount(file2);
    file2.close();
  }

  public static BufferedReader openErrorLog() throws IOException{
    File log_file = new File(ERROR_LOG_FILE);
    BufferedReader file = new BufferedReader(new FileReader(ERROR_LOG_FILE));
    try{
        String line;
       
        if(log_file.exists() ){
             
            while((line = file.readLine()) != null){
                String[] value = line.split(" ");
                for (String i: value){
                    
                    
                }
            }
            }
        
    }
    catch(Exception e){
  
}

return new BufferedReader(new FileReader(ERROR_LOG_FILE));
}

public static void getCountOfErrorTypes(BufferedReader file) throws IOException{
    BufferedReader file2 = new BufferedReader(file);
    try{

    int error_count = 0;
    int warn_count = 0;
    int info_count = 0;
    int debug_count = 0;
    String line2;


    while((line2 = file2.readLine()) != null){
        String[] value = line2.split(" ");
        for (String i: value){
            if (i.equals("[INFO]")){
                info_count++;
            }
            if (i.equals("[ERROR]")){
                error_count++;
            }
            if (i.equals("[WARN]")){
                warn_count++;
            }
            if (i.equals("[DEBUG]")){
                debug_count++;
            }        
            
        }
 
}
System.out.println("There are " + info_count + " instances of INFO lines in the log.");
System.out.println("There are " + error_count + " instances of ERROR lines in the log.");
System.out.println("There are " + warn_count + " instances of WARN lines in the log.");
System.out.println("There are " + debug_count + " instances of DEBUG lines in the log.");
}
catch(Exception e){
}
}
private static void getMemoryLimitExceededCount(BufferedReader file2) throws IOException{
    String line;
    int exceededCount = 0;
    ArrayList<String> endPoint = new ArrayList<>();

    while ((line = file2.readLine()) != null){
        String[] value = line.split(",");
        for (String i: value){
            String[] addition = i.split("[-:]");
            for (String i2: addition){
                if (i2.equals(" Memory limit exceeded in worker thread | Endpoint")){
                    exceededCount++;
                    String endPointInfo = i;
                    endPoint.add(endPointInfo);
                    System.out.println("Current Memory Limit Exceeding Count: " + exceededCount + "\nEndpoint found: " + endPointInfo );


                }
            }


}

}
}
}

