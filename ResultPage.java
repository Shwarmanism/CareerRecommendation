import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

abstract class CareerField {
    public abstract String field();
    public abstract String recommendationCourse();
    public abstract String jobOpportunities();
    public abstract String otherInfo();
}


public class ResultPage extends Application {

    @Override
    public void start(Stage primaryStage) {

        int selectedCareer = readPredictionsFromCsv("C:/Users/ghelo/Downloads/Prediction.csv");


        CareerField careerField = (selectedCareer == 0) ? new LawField() :
                                (selectedCareer == 1) ? new TradesAndCraftsField() : 
                                (selectedCareer == 2) ? new PublicServiceField() :
                                (selectedCareer == 3) ? new HospitalityField() :
                                (selectedCareer == 4) ? new BusinessCommerceField() :
                                (selectedCareer == 5) ? new EducationField() :
                                (selectedCareer == 6) ? new MediaAndCommunicationField() :
                                (selectedCareer == 7) ? new ScienceAndResearchField() :
                                (selectedCareer == 8) ? new LawField() :
                                (selectedCareer == 9) ? new NonprofitField() :
                                (selectedCareer == 10) ? new EngiAndArchiField() :
                                (selectedCareer == 11) ? new LogisticsField() : null;

        
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background: linear-gradient(from 0% 0% to 100% 100%, #190321, #5aaca4);");
 
        VBox vbox = new VBox(20); 
        vbox.setPadding(new javafx.geometry.Insets(100, 200, 50, 200));
        vbox.setAlignment(javafx.geometry.Pos.TOP_CENTER); 
        
        Label titleLabel = new Label("Career Recommendation Result:");
        titleLabel.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        titleLabel.setTextFill(Color.WHITE);
        titleLabel.setTextAlignment(TextAlignment.CENTER);
        vbox.getChildren().add(titleLabel);

        //display career info
        if (careerField != null) {
            //career field title
            Text fieldText = new Text(careerField.field());
            fieldText.setFont(Font.font("Futura", FontWeight.BOLD, 30));
            fieldText.setFill(Color.WHITE);
            fieldText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(fieldText);

            //recommended courses
            Text titleText = new Text("Recommended Courses:");
            titleText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
            titleText.setFill(Color.WHITE);
            titleText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(titleText);

            Text coursesText = new Text(careerField.recommendationCourse());
            coursesText.setFont(Font.font("Futura", FontWeight.NORMAL, 15));
            coursesText.setFill(Color.WHITE);
            coursesText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(coursesText);

            //job opportunities
            Text jobOpportunitiesTitleText = new Text("Job Opportunities:");
            jobOpportunitiesTitleText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
            jobOpportunitiesTitleText.setFill(Color.WHITE);
            jobOpportunitiesTitleText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(jobOpportunitiesTitleText);

            Text jobText = new Text(careerField.jobOpportunities());
            jobText.setFont(Font.font("Futura", FontWeight.NORMAL, 15));
            jobText.setFill(Color.WHITE);
            jobText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(jobText);

            //additional info
            Text otherInfoTitleText = new Text("Additional Information:");
            otherInfoTitleText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
            otherInfoTitleText.setFill(Color.WHITE);
            otherInfoTitleText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(otherInfoTitleText);

            Text otherInfoText = new Text(careerField.otherInfo());
            otherInfoText.setFont(Font.font("Futura", FontWeight.NORMAL, 15));
            otherInfoText.setFill(Color.WHITE);
            otherInfoText.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(otherInfoText);

        }

        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        pane.getChildren().add(scrollPane);

        Scene scene = new Scene(pane, 1100, 700);
        primaryStage.setTitle("Career Recommendation");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static int readPredictionsFromCsv(String filePath) {
        int predict = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true; // To skip the header
         

            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Skip the first line (header)
                    continue;
                }

                String[] values = line.split(","); // Assuming CSV values are comma-separated
                
                if (values.length > 0) {
                    predict = Integer.parseInt(values[0]);
                    
                }
            }
             // Store the first prediction value
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
        return predict;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
