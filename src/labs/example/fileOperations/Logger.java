package labs.example.fileOperations;


import java.io.*;
import java.util.ArrayList;

public class Logger {

    private static final String FILE_PATH = "C:/Git/CSC_151_Madeleine_Vansky/src/labs/example/fileOperations/";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/api_error.log";
    private static final String HTTP_LOG = FILE_PATH + "logs/http_access.log";

public static void main(String[] args) throws IOException{

    BufferedReader file = openErrorLog();
    getCountOfErrorTypes(file);
    file.close();

    BufferedReader file3 = openErrorLog();
    getMemoryLimitExceededCount(file3);

    file3.close();
    BufferedReader file2 = openErrorLog();
    getDiskSpaceErrorsWithIPAddress(file2); /* problem 1 */
    file2.close();

    BufferedReader typeOfLog = openErrorLog("http_access_log"); /* the overloaded method here, works for now */
    getGMTOffset(typeOfLog);
    typeOfLog.close();

    BufferedReader httpCodes = openErrorLog("http_access_log");
    getHTTPCodes(httpCodes);
    httpCodes.close();

    BufferedReader responseSize = openErrorLog("http_access_log");
    getResponseSizes(responseSize);
    responseSize.close();

    BufferedReader verbs = openErrorLog("http_access_log");
    groupHTTPMethodsAndEndPoints(verbs);
    verbs.close();
    ArrayList<String> httpMethod = new ArrayList<String>();
  }

public static BufferedReader openErrorLog() throws IOException{

    File log_file = new File(ERROR_LOG_FILE);
    BufferedReader file = new BufferedReader(new FileReader(ERROR_LOG_FILE));
    try{
        String line;
       
        if(log_file.exists() ){
             
            while((line = file.readLine()) != null){
                String[] value = line.split(",");              
                   
               
            }
            }
       
    }
    catch(Exception e){
 
}

return new BufferedReader(new FileReader(ERROR_LOG_FILE));
}

private static BufferedReader openErrorLog(String typeOfLog) throws IOException{
    File httpFile = new File(HTTP_LOG);
    BufferedReader http_access = new BufferedReader(new FileReader(HTTP_LOG));
    try {
       
        String line;
        if(httpFile.exists() ){
            while ((line = http_access.readLine())!= null){
                String[] value = line.split(",");
                for (String i : value){
                   
                }

               
            }
        }
    } catch (Exception e) {

    }
    return new BufferedReader(new FileReader(HTTP_LOG));

}

private static void getGMTOffset(BufferedReader typeOfLog) throws IOException {
    BufferedReader fileHTTP = new BufferedReader(typeOfLog);

   
    int quadZero = 0;
    int threeZero = 0;
    String lineSplit1;



    try {
       

    while ((lineSplit1 = fileHTTP.readLine()) != null){
        String[] valueHTTP = lineSplit1.split("[\\s\\-/]+");
      
            if (valueHTTP[4].equals("0500]")){
                threeZero++;
        
                   
            }
            else if (valueHTTP[4].equals("+0000]")){
                quadZero++;

            }
            else{
              
            }
        }
        
    
    System.out.println("There were " + quadZero + " instances of [0000] appearing within the http access log.");
    System.out.println("There were " + threeZero + " instances of [0500] appearing within the http access log.");

}
   
    catch (Exception e) {
   

    }
}

private static void getHTTPCodes(BufferedReader httpCodes) throws IOException {
    /* the easiest way I could see to do this would be to make an array list for each of the 2xx, 3xx, 5xx and then
     * count if the value is contained in said arraylist 
     */
    BufferedReader fileHTTP = new BufferedReader(httpCodes);
    ArrayList<String> twoX = new ArrayList<String>();
        twoX.add("200");
        twoX.add("201");
        twoX.add("202");
        twoX.add("203");
        twoX.add("204");
        twoX.add("205");
   

    ArrayList<String> threeX = new ArrayList<String>();
        threeX.add("300");
        threeX.add("301");
        threeX.add("302");
        threeX.add("303");
        threeX.add("304");
        threeX.add("305");

    ArrayList<String> fiveX = new ArrayList<String>();
        fiveX.add("500");
        fiveX.add("501");
        fiveX.add("502");
        fiveX.add("503");
        fiveX.add("504");
        fiveX.add("505");
    
    int twoXX = 0;
    int threeXX = 0;
    int fiveXX = 0;

    String lineSplit1;
    try {
       

        while ((lineSplit1 = fileHTTP.readLine()) != null){
            String[] valueHTTP = lineSplit1.split("[\\s\\-/]+");
            if (twoX.contains(valueHTTP[9]) || twoX.contains(valueHTTP[10]) || twoX.contains(valueHTTP[11]) ){
                twoXX++;
            }
            else if (threeX.contains(valueHTTP[9]) || threeX.contains(valueHTTP[10]) || threeX.contains(valueHTTP[11]) ){
                threeXX++;
            }
            else if(fiveX.contains(valueHTTP[9]) || fiveX.contains(valueHTTP[10]) || fiveX.contains(valueHTTP[11])){
                fiveXX++;
            }

            
        }
        System.out.println("5xx Errors: " + fiveXX);
        System.out.println("2xx Errors: " + twoXX);
        System.out.println("3xx Errors: " + threeXX);

    }
   
    catch (Exception e) {
   

    }
}

private static void getResponseSizes(BufferedReader responseSize) throws IOException{
    /* made this by simply getting value of where four digit long num would be and parsing it into an int to test against 3900 */
    BufferedReader responses = new BufferedReader(responseSize);
    String lineSplit1;
    int responseSizeCount = 0;
    
    try {
        while ((lineSplit1 = responses.readLine()) != null){

            String[] valueHTTP2 = lineSplit1.split(" ");

            int valueHTTPInt1 = Integer.parseInt(valueHTTP2[9]);

            if (valueHTTPInt1 > 3900 ){
                responseSizeCount++;
            }
            
    }
        
        System.out.println("There are " + responseSizeCount + " response sizes that exceed 3900.");
    }
    catch (Exception e) {
   

    }
    

}

private static void groupHTTPMethodsAndEndPoints(BufferedReader verbs) throws IOException{
    try {
        /* made an array list as was hinted. it gets to the point on the line, removes the quotation before it and checks 
         * to see if it is already contained within the array list
         */
        BufferedReader verbMethods = new BufferedReader(verbs);
        String lineSplit1;
        ArrayList<String> knownVerbs = new ArrayList<String>();

        while ((lineSplit1 = verbMethods.readLine()) != null){

            String[] methodsEnds = lineSplit1.split(" ");
            String strVerb = methodsEnds[5];
            strVerb = strVerb.replace("\"", "");

            if (knownVerbs.contains(strVerb))
            { /* a check and then it passes if it contains */
            }
           
            else {
                
                knownVerbs.add(strVerb);
            }
    }
    System.out.println("These are the HTTP verbs found in the log: ");
    for (String i: knownVerbs){    
        System.out.println(i);
    }
}

    catch (Exception e) {

    }
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

private static void getMemoryLimitExceededCount(BufferedReader file3) throws IOException{
    String line;
    int exceededCount = 0;
    ArrayList<String> endPoint = new ArrayList<>();

    while ((line = file3.readLine()) != null){
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

private static void getDiskSpaceErrorsWithIPAddress(BufferedReader file2) throws IOException{
    BufferedReader file3 = new BufferedReader(file2);
    String line3;
    int lineCount = 0;
    /*ArrayList<String> lineCounter = new ArrayList<>();
    ArrayList<String> ipAddress = new ArrayList<>();*/
    try {
       
        while((line3 = file3.readLine()) != null){
            lineCount++;
            String[] value = line3.split("[\\s,]+");
            if (value[2].equals("[ERROR]")){
                System.out.println(" Disk space error on line " + lineCount + " for IP Address: " + value[3] );
            System.out.println(value[2]);
      

                }
            }            
}
    catch (Exception e) {

    }
}

}

