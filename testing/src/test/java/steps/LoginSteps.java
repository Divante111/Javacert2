package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    
    WebDriver driver;
    

    @Given("I am testing the Implicit wait")
    public void Implicit_wait_testing() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // Implement step logic
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\JavaTest1\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
     
        System.out.println("I am on login page");
        // try {
        //     Thread.sleep(1000 * 1000);
        // } catch (Exception e) {
        //     System.out.println("Error");
        // }
        // driver.close();
        
    }

    @Given("I am  on sausedemo login")
    public void saucedemo_login_page() {
        // Implement step logic
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\JavaTest1\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
     
        System.out.println("I am on login page");
        // try {
        //     Thread.sleep(1000 * 1000);
        // } catch (Exception e) {
        //     System.out.println("Error");
        // }
        // driver.close();
        
    }
    
    

    @Given("I am on the login page")
    public void i_am_on_saucedemo() {
        // Implement step logic
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\JavaTest1\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");
        
        System.out.println("I am saucedemo page");

        try {
            Thread.sleep(1000 * 1000);
        } catch (Exception e) {
            System.out.println("Error");
        }
        driver.close();
        
    }


    @Given("I am trying a second given")
    public void trying_a_second_given() {
        // Implement step logic
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\JavaTest1\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.close();
        System.out.println("I am messing around with a second given");
        
    }
    
    @Given("setup the entries in database")
    public void setupEntries() {
        System.out.println("**********************************");
        System.out.println("setup the entries in database");
    }

    
    @When("launch the browser from config variables")
    public void launchBrowser() {
        System.out.println("launch the browser");
        // Assert.assertTrue(false);

    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        // Implement step logic
        System.out.println("I enter username and password");
        
    }
    @When("I am trying to accept two strings {string} {string}")
    public void i_am_trying_to_accept_two_strings(String number1, String number2) {
        // Implement step logic
        System.out.println("The first string " + number1 + "\nThe second string " + number2);
        
    }
    @When("I try my second test")
    public void i_try_my_second_test() {
        // Implement step logic
        System.out.println("I am trying my second test");
        
    }

    @When("click on login button")
    public void click_on_login_button() {
        // Implement step logic
        System.out.println("click on login button");
        
    }


    //  to accept things as a regular experession must start with ^ and end with $
    @When("^I am accepting any datatype (.+) and a (.+)$")
    public void accepting_any_data(int num1, int num2) {
        // Implement step logic
        System.out.println("accepting any input\n" + num1 + "\n" + num2);
        
    }
    @When("User fills out forms")
    public void user_fills_out_forms(List<String> data) {
        for(int i = 0; i < data.size(); i++){
            System.out.println("This is the " + i + " index of the datatable " + data.get(i));
        }
        // sending data to a form
        // driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).clear();
        // driver.findElement(By.xpath("//input[@id=\"LastName\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys(data.get(0));
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys(data.get(1));
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(data.get(2));
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys(data.get(3));
        driver.findElement(By.xpath("//input[@id=\"Title\"]")).sendKeys(data.get(4));
        // selecting data from a select field
        Select select = new Select(driver.findElement(By.xpath("//select[@id=\"bookedExpert\"]")));
        select.selectByIndex(1);
        // clicking a checkbox selenium
        driver.findElement(By.xpath("//label[@id=\"LblmktoCheckbox_42241_0\"]")).click();

        
       
}
//reading a json file
@When("I mess around with json file")
public void i_mess_around_with_json_file() throws IOException {
    // Create ObjectMapper instance need this to read the json file
    ObjectMapper objectMapper = new ObjectMapper();
    
    // Read JSON file into JsonNode 
    JsonNode jsonNode = objectMapper.readTree(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\random.json"));
    
    //this makes it easier to read in cmd line
    // String prettyJson = objectMapper.writeValueAsString(jsonNode);
    // System.out.println(prettyJson);

    
    //makes the json one giant string
    // System.out.println(jsonNode.get("employees").get(0).get("name"));
    // System.out.println(jsonNode.get("employees"));

    // for(int i = 0; i < jsonNode.get("employees").size(); i++){
    //     System.out.println("Iteration " + i);
    //     System.out.println(jsonNode.get("employees").get(0));
    System.out.println(jsonNode.get("employees").get(0).get("address").get("city"));
    }
    
@When("I mess around with xml file")
    public void i_mess_around_with_xml_file() {
        // Create DocumentBuilderFactory instance
        // put inside of try catch block
    try {
    // Step 1: Create a DocumentBuilderFactory
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    // Step 2: Create a DocumentBuilder
    DocumentBuilder builder = factory.newDocumentBuilder();

    // Step 3: Parse the XML file
    Document doc = builder.parse(new File("C:/JavaTest1/testing/src/main/java/resources/random.xml"));

    // Optional: Normalize the document
    doc.getDocumentElement().normalize();

    // Step 4: Get NodeList of <employee> elements
    // NodeList nodeList = doc.getElementsByTagName("employee");
    NodeList nodeList = doc.getElementsByTagName("employee");

    // Step 5: Iterate through NodeList and access id attribute
    // for (int i = 0; i < nodeList.getLength(); i++) {
    //     Element employee = (Element) nodeList.item(i);
    //     String id = employee.getAttribute("id");
    //     System.out.println("Employee id " + id);
    // }
    System.out.println("*********************");
    // System.out.println(nodeList.item(1).getTextContent());
    
    System.out.println(  ((Element) nodeList.item(0)).getElementsByTagName("name").item(0).getTextContent());
    // System.out.println(nodeList.item(1));
    System.out.println("*********************");


    } catch (Exception e) {
        System.out.println("It broke");
    }

}
@When("I try to change a json file")
public void i_try_to_change_a_json_file() throws IOException {
    
    // Create ObjectMapper instance need this to read the json file
    ObjectMapper objectMapper = new ObjectMapper();
    
    // // Read JSON file into JsonNode 
    JsonNode jsonNode = objectMapper.readTree(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\adding.json"));
    
    System.out.println("They type of class" + jsonNode.get("Student").getClass());
    
    // "Stu_id" : "1001",
    // "Stu_Name" : "Ashish",
    // "Course" : "Java",
    // "name" : "Abul Hasan"


    // Create a new student object to add to the json file
    ObjectNode newStudent = objectMapper.createObjectNode();
    newStudent.put("Stu_id", "1021");
    newStudent.put("name", "Divante");
    newStudent.put("Course", "Java");

    ObjectNode newStudentTwo = objectMapper.createObjectNode();
    newStudentTwo.put("Stu_id", "1721");
    newStudentTwo.put("name", "joe");
    newStudentTwo.put("Course", "Python");
    

    /// casts an objectnode to an arraynode and uses the method add to add a new student
    // ((ArrayNode) jsonNode.get("Student")).add(newStudent);

    /// checking to see what class these object are
    // System.out.println("Jsonnode" + jsonNode.get("Student").getClass());
    // System.out.println("newStudentTwo" + newStudentTwo.getClass());
    // ArrayNode studentsNode = (ArrayNode) jsonNode.get("Student");

    // adds an individual sudent
    // ((ObjectNode) jsonNode.get("Student").get(0)).put("name", "Abul Hasan");
    
    // studentsNode.add(newStudent);
    
    // ((ObjectNode) jsonNode.get("Student")).put("name", "Abul Hasan");

    // System.out.println(jsonNode.get("Student").get(0));
    // System.out.println("hello");
    
    ObjectWriter writer = objectMapper.writer().with(SerializationFeature.INDENT_OUTPUT);
    writer.writeValue(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\adding.json"), jsonNode);

    // System.out.println(jsonNode.get("Student").get(0));
    for(int i = 0; i < jsonNode.get("Student").size(); i++){
        System.out.println(jsonNode.get("Student").get(i));
    }
    // System.out.println(jsonNode.get("Student").get(0));
}
@When("I try to manipulate a xlsx file")
public void i_try_to_manipulate_a_xlsx_file() {
    // Write code here that turns the phrase above into concrete actions
    
    String excelFilePath = "C:\\JavaTest1\\testing\\src\\main\\java\\resources\\Book2.xlsx";

        try {
            // Create a FileInputStream to read from the Excel file
            FileInputStream file = new FileInputStream(new File(excelFilePath));
            System.out.println("1 dkafjlkdsjfjadklfjl");
            // Create a Workbook instance using XSSFWorkbook for .xlsx file
            Workbook workbook = new XSSFWorkbook(file);
            System.out.println("2");

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);
            System.out.println("3"); // Assuming there's only one sheet


            
            // Get the row at the specified index
            Row row = sheet.getRow(0);
        
            // Get the cell in the specified row and column
            Cell cell = row.getCell(0);

            int count = 0;

            System.out.println("I am printing off row 0 cell 0 " + cell);
            // Get the last cell number (1-based index, returns total number of cells in the row)
            System.out.println(row.getLastCellNum()); 
            //using a built in function ot check the xlsx values
            System.out.println("*******************************");
            for(int i = 0; i < row.getLastCellNum(); i++){
                System.out.println(i);
                System.out.println(row.getCell(i).getStringCellValue());
                System.out.println("**********************************************");
                if(row.getCell(i).getStringCellValue().equals("test values")){

                
                try{
                    while(sheet.getRow(count).getCell(i) != null){
                        System.out.println(sheet.getRow(count).getCell(i));
                        count++;
                    }
                } catch(Exception e){

                }
            }
                // if(row.getCell(i).getStringCellValue().equals("test values") ){
                //     for(int j = 1; j < 3; j++){
                        
                //         System.out.println(sheet.getRow(j).getCell(i));
                        

                //     }
                   
                // }
                System.out.println("**********************************************");
            }
            System.out.println("*******************************");
            // Close the workbook and FileInputStream
            if(sheet.getRow(2).getCell(3) == null){
                System.out.println("hello im here");
            }
            System.out.println(sheet.getRow(2).getCell(1));
            workbook.close();
            file.close();
        } catch (FileNotFoundException e) {

            System.err.println("File not found: " + excelFilePath);
            e.printStackTrace();

        } catch (IOException e) {
            System.err.println("Error reading the Excel file: " + excelFilePath);
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("it broke");
        }
}
@When("I mess with jsonLevelOne")
public void i_mess_with_json_level_one() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("It works");
    // Create ObjectMapper instance need this to read the json file
    ObjectMapper objectMapper = new ObjectMapper();
    
    try{
        JsonNode jsonNode = objectMapper.readTree(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\moreComplexJsonFiles\\level1.json"));

        // System.out.println(jsonNode.get("employees").get(0).get("projects").get(0).getClass());
        // System.out.println(jsonNode.get("employees").get(0).get("projects").getClass());


        // Updated a objects keys value
    //     {{{{{ 
    //     TextNode nameNode = (TextNode) jsonNode.get("employees").get(0).get("address").get("street");



    //     ObjectNode objectNode = (ObjectNode) jsonNode.get("employees").get(0).get("address");

    //     TextNode updatedTextNode = TextNode.valueOf("I updated this value");

    //     objectNode.set("street", updatedTextNode);

    //     System.out.println(jsonNode.get("employees").get(0).get("address"));
    // }}}}}

/// replacing an objectnode in a jsonfile
    //     {{{{{
    //     ObjectNode thingToAdd = objectMapper.createObjectNode();
    //     thingToAdd.put("name", "Divante");
    //     thingToAdd.put("role", "Developer");
    //     thingToAdd.put("startDate", "2024-11-07");
    //     thingToAdd.put("endDate", "TBD");

    //     ObjectNode projectsArrayNode = (ObjectNode) jsonNode.get("employees").get(0).get("projects").get(0);

    //     // Replace the old ObjectNode with the new one
    //     projectsArrayNode.removeAll(); // Clear the existing fields
    //     projectsArrayNode.setAll(thingToAdd); // Set all fields from the new object

    //     System.out.println(jsonNode.get("employees").get(0).get("projects").get(0));
    // }}}}}


    // Updating a textnode inside of an arraynode
    //     {{{{
    //     // Navigate to the array you want to change
    //     //and convert it to an arrayNode
    //     ArrayNode studentsArrayNode = (ArrayNode) jsonNode.get("employees").get(0).get("skills");

    //     // Modify an element in the array
    //     studentsArrayNode.set(1, "updated two");
    // }}}}
        // for(int i = 0; i < jsonNode.get("employees").size(); i++){
        //     System.out.println("************************");
        //     System.out.println(jsonNode.get("employees").get(i));
        //     System.out.println("************************");
        // }



        






        ObjectWriter writer = objectMapper.writer().with(SerializationFeature.INDENT_OUTPUT);
        writer.writeValue(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\moreComplexJsonFiles\\level1.json"), jsonNode);

    } catch(Exception e){

    }
    // // Read JSON file into JsonNode 
    
}


    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Implement step logic
        System.out.println("I should be logged in successfully");
        
    }
    @Then("I go to the forms page")
    public void i_am_on_the_login_page() {
        // Implement step logic
        // System.setProperty(
        //     "webdriver.chrome.driver",
        //     "C:\\JavaTest1\\drivers\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.navigate().to("https://saucelabs.com/ask-the-experts");
     
        System.out.println("I am on the page with the form");
        // try {
        //     Thread.sleep(1000 * 1000);
        // } catch (Exception e) {
        //     System.out.println("Error");
        // }
        // driver.close();
        
    }
}
    

