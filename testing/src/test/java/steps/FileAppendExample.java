package steps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//hhs is horrible spreadsheet

import io.cucumber.java.en.Given;

public class FileAppendExample {

    public static void main(String[] args) {
        String filePath = "C:\\JavaTest1\\testing\\src\\test\\java\\resources\\features\\testingAppending.feature";

        List<List<String>> nested_list;

        List<List<String>> data = dataFromExcel();
        try {
            // Open given file in append mode.
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

           
           

                writer.write("Feature: User login\n");
                writer.write("@writingToFeature\n");
                writer.write("Scenario Outline: Login attempt.\n");
                writer.write("  Given I am on the login page for saucedemo\n\n");
                writer.write("  Then The user inputs \"<Username>\" and \"<Password>\" and clicks login\n\n");
                
                writer.write("  Examples:\n");

                // writer.write("  | FirstName | LastName | ZipCode |\n");
                // writer.write("  | Divante   | Parness  |  55112  |\n");

                int count = 0;
                String toAppend = "";
                int currentIteration = 0;
                while(count < data.get(0).size()){
                    for (List<String> list : data) {
                        String currentCell = " | " + list.get(count);
                        toAppend += currentCell;
                        
                        currentIteration++;
                        
                        if(currentIteration == data.size()){
                            // System.out.println(toAppend + " |");
                            writer.write(toAppend + " |\n");
                            toAppend = "";
                            System.out.println("im here");
                            currentIteration = 0;
                        }
                        // System.out.println(toAppend); 
                    }
                    

                    
                    
                    
                    count++;
                    
                }
                
              
            
                 
                

                writer.close();
            System.out.println("Content appended successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to append content to " + filePath + ": " + e.getMessage());
        }
    }


    public static List<List<String>> dataFromExcel(){
        List<List<String>> data = new ArrayList<>();
        try {
            String excelFilePath = "C:\\JavaTest1\\testing\\src\\main\\java\\resources\\Book2.xlsx";
            // Create a FileInputStream to read from the Excel file
            FileInputStream file = new FileInputStream(new File(excelFilePath));
        
            // Create a Workbook instance using XSSFWorkbook for .xlsx file
            Workbook workbook = new XSSFWorkbook(file);

            Sheet sheet = workbook.getSheetAt(0);

            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            int count = 0;

            // System.out.println("\n*********************");
            // System.out.println(row.getLastCellNum()); // = 3
            // System.out.println(sheet.getLastRowNum()); // = 4
            // System.out.println("*********************");

            for(int i = 0; i < row.getLastCellNum(); i++){
                List<String> columnData = new ArrayList<>();

                // System.out.println(sheet.getRow(i).toString());

                for(int j = 0; j <= sheet.getLastRowNum(); j++){
                    // System.out.println(sheet.getRow(j).getCell(i).getStringCellValue());

                    columnData.add(sheet.getRow(j).getCell(i).getStringCellValue());
                    
                }
                // System.out.println(columnData);
                
                data.add(columnData);
            }
            } catch (Exception e){
                ;
            }
            
        return data;
    }
    }

            // for(int i = 0; i < row.getLastCellNum(); i++){
            //                 // System.out.println(i);
            //                 // System.out.println(row.getCell(i).getStringCellValue());
            //                 // System.out.println("**********************************************");
            //                 for(int j = 0; j < row.getLastCellNum(); j++){
            //                     // System.out.println(j);
            //                     System.out.println(row.getCell(j).getStringCellValue());
            //                     System.out.println("**********************************************");
            //                     if(row.getCell(j).getStringCellValue().equals(row.getCell(i).getStringCellValue())){
                
                                
            //                     try{
            //                         while(sheet.getRow(count).getCell(j) != null){
            //                             System.out.println(sheet.getRow(count).getCell(j));
            //                             count++;
            //                         }
            //                     } catch(Exception e){
            //            }
                         
            // }
            //                     }
            //                 }
                 
            
           




            //         // Get the row at the specified index
    //         Row row = sheet.getRow(0);
        
    //         // Get the cell in the specified row and column
    //         Cell cell = row.getCell(0);

    //         int count = 0;

    //         System.out.println("I am printing off row 0 cell 0 " + cell);
    //         // Get the last cell number (1-based index, returns total number of cells in the row)
    //         System.out.println(row.getLastCellNum()); 
    //         //using a built in function ot check the xlsx values
    //         System.out.println("*******************************");
    //         for(int i = 0; i < row.getLastCellNum(); i++){
    //             System.out.println(i);
    //             System.out.println(row.getCell(i).getStringCellValue());
    //             System.out.println("**********************************************");
    //             if(row.getCell(i).getStringCellValue().equals("test values")){

                
    //             try{
    //                 while(sheet.getRow(count).getCell(i) != null){
    //                     System.out.println(sheet.getRow(count).getCell(i));
    //                     count++;
    //                 }
    //             } catch(Exception e){

    //             }
            



    // String excelFilePath = "C:\\JavaTest1\\testing\\src\\main\\java\\resources\\Book2.xlsx";

    //     try {
    //         // Create a FileInputStream to read from the Excel file
    //         FileInputStream file = new FileInputStream(new File(excelFilePath));
    //         System.out.println("1 dkafjlkdsjfjadklfjl");
    //         // Create a Workbook instance using XSSFWorkbook for .xlsx file
    //         Workbook workbook = new XSSFWorkbook(file);
    //         System.out.println("2");

    //         // Get the first sheet from the workbook
    //         Sheet sheet = workbook.getSheetAt(0);
    //         System.out.println("3"); // Assuming there's only one sheet


            
    //         // Get the row at the specified index
    //         Row row = sheet.getRow(0);
        
    //         // Get the cell in the specified row and column
    //         Cell cell = row.getCell(0);

    //         int count = 0;

    //         System.out.println("I am printing off row 0 cell 0 " + cell);
    //         // Get the last cell number (1-based index, returns total number of cells in the row)
    //         System.out.println(row.getLastCellNum()); 
    //         //using a built in function ot check the xlsx values
    //         System.out.println("*******************************");
    //         for(int i = 0; i < row.getLastCellNum(); i++){
    //             System.out.println(i);
    //             System.out.println(row.getCell(i).getStringCellValue());
    //             System.out.println("**********************************************");
    //             if(row.getCell(i).getStringCellValue().equals("test values")){

                
    //             try{
    //                 while(sheet.getRow(count).getCell(i) != null){
    //                     System.out.println(sheet.getRow(count).getCell(i));
    //                     count++;
    //                 }
    //             } catch(Exception e){

    //             }
    //         }
    //         }
    //     }
    


