package steps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FeatureFileGenerator {

    public static void main(String[] args) {
        generateFeatureFile("C:\\JavaTest1\\testing\\src\\test\\java\\resources\\features");
    }

    public static void generateFeatureFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Feature: User login\n");
            writer.write("@writingToFeature\n");
            writer.write("  Scenario Outline:\n");
            writer.write("  Given User logs into Saucedemo page\n");
            
            writer.write("  Examples:\n");

            writer.write("  | FirstName | LastName | ZipCode |\n");
            writer.write("  | Divante   | Parness  |  55112  |\n");

            System.out.println("Feature file generated successfully at: " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to generate feature file: " + e.getMessage());
        }
    }
}

