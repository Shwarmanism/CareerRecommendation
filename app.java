import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CareerRecommendation extends Application {


    @Override
    public void start(Stage primaryStage) {

        //create pane
        Pane pane = new Pane();

        //background
        pane.setStyle("-fx-background: linear-gradient(from 0% 0% to 100% 100%, #190321, #5aaca4);");

        //main image picture
        Image image = new Image("file:/C:/Users/ghelo/Downloads/Test 2/OOP Test/lib/Resume-folder-cuate-2.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(530); 
        imageView.setFitHeight(530); 
        imageView.setPreserveRatio(true); 
        imageView.setLayoutX(530);
        imageView.setLayoutY(90);

        //group name
        Text groupText = new Text("Codestract");
        groupText.setFont(Font.font("Futura", FontWeight.BOLD, 17));
        groupText.setFill(Color.WHITE);
        groupText.setLayoutX(30); 
        groupText.setLayoutY(40);

        //title
        Text titleText = new Text("Career Recommendation");
        titleText.setFont(Font.font("Futura", FontWeight.BOLD, 40));
        titleText.setFill(Color.WHITE);
        titleText.setLayoutX(80); 
        titleText.setLayoutY(270); 

        //subtitle
        Text subtitleText = new Text("\"Your Path, Your Future: Personalized Career\nRecommendations for Success\"");
        subtitleText.setFont(new Font("Futura", 15));
        subtitleText.setFill(Color.WHITE);
        subtitleText.setLayoutX(85); 
        subtitleText.setLayoutY(310);

        //start button
        Button getStartedButton = new Button("Get Started");
        getStartedButton.setStyle("-fx-background-color: white; -fx-text-fill: #5aaca4; -fx-font-size: 14px; -fx-font-weight: bold;");
        getStartedButton.setPrefWidth(300);
        getStartedButton.setPrefHeight(50);
        getStartedButton.setLayoutX(80); 
        getStartedButton.setLayoutY(360); 

        //exit button
        Button exitButton = new Button("Exit");
        exitButton.setStyle("-fx-background-color: #5aaca4; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold;");
        exitButton.setPrefWidth(300);
        exitButton.setPrefHeight(50);
        exitButton.setLayoutX(80); 
        exitButton.setLayoutY(430); 

        //add elements to pane
        pane.getChildren().addAll(titleText, subtitleText, getStartedButton, exitButton, imageView, groupText);

        //form pane (questions)
        Pane formPane = new Pane();
        formPane.setPrefSize(1100, 2100); 

        getStartedButton.setOnAction(e -> {
            
            pane.getChildren().clear(); //clears the main pane
            formPage(formPane); //adds form pane
        
            //scrollpane 
            ScrollPane scrollPane = new ScrollPane(formPane);
            scrollPane.setFitToWidth(true); 
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED); 
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); 
            scrollPane.setPrefHeight(primaryStage.getHeight()); 
            pane.getChildren().add(scrollPane); 
        });

        exitButton.setOnAction(event -> {
            Platform.exit(); 
        });

        //main menu scene
        Scene scene = new Scene(pane, 1100, 700);

        //scene properties
        primaryStage.setTitle("Career Recommendation");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void formPage(Pane formPane1) {
        
        double paneWidth = formPane1.getPrefWidth();
        
        //Question 1: Age
        Text ageText = new Text("Input your age (19-25):");
        ageText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        ageText.setFill(Color.WHITE);
        ageText.setLayoutX((paneWidth - ageText.getLayoutBounds().getWidth()) / 2);
        ageText.setLayoutY(90);
    
        TextField ageInput = new TextField();
        ageInput.setPrefWidth(300);
        ageInput.setPrefHeight(50);
        ageInput.setLayoutX((paneWidth - ageInput.getPrefWidth()) / 2); 
        ageInput.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        ageInput.setLayoutY(120); 
    
        //Question 2: Strand
        Text strandText = new Text("What was your Senior High School strand?");
        strandText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        strandText.setFill(Color.WHITE);
        strandText.setLayoutX((paneWidth - strandText.getLayoutBounds().getWidth()) / 2); 
        strandText.setLayoutY(210);
    
        ComboBox<String> strandComboBox = new ComboBox<>();
        strandComboBox.getItems().addAll("STEM", "HUMSS", "ABM", "GAS", "ICT", "TVL");
        strandComboBox.setPrefWidth(300);
        strandComboBox.setPrefHeight(50);
        strandComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        strandComboBox.setLayoutX((paneWidth - strandComboBox.getPrefWidth()) / 2); 
        strandComboBox.setLayoutY(240);

        //Question 3: MBTI
        Text mbtiText = new Text("What is your MBTI (Myers-Briggs Type Indicator)?");
        mbtiText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        mbtiText.setFill(Color.WHITE);
        mbtiText.setLayoutX((paneWidth - mbtiText.getLayoutBounds().getWidth()) / 2); 
        mbtiText.setLayoutY(330);
    
        ComboBox<String> mbtiComboBox = new ComboBox<>();
        mbtiComboBox.getItems().addAll("INTJ", "INFJ", "ISTJ", "ISFJ", "ENTJ", "ENFJ", "ESTJ", 
        "ESFJ", "INTP", "INFP", "ISTP", "ISFP", "ENTP", "ENFP", "ESTP", "ESFP");
        mbtiComboBox.setPrefWidth(300);
        mbtiComboBox.setPrefHeight(50);
        mbtiComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        mbtiComboBox.setLayoutX((paneWidth - mbtiComboBox.getPrefWidth()) / 2);
        mbtiComboBox.setLayoutY(360);

        //Question 4: Extracurricular
        Text extraCurricularText = new Text("Which extracurricular activity do you do the most?");
        extraCurricularText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        extraCurricularText.setFill(Color.WHITE);
        extraCurricularText.setLayoutX((paneWidth - extraCurricularText.getLayoutBounds().getWidth()) / 2); 
        extraCurricularText.setLayoutY(450);
    
        ComboBox<String> extraCurricularComboBox = new ComboBox<>();
        extraCurricularComboBox.getItems().addAll("Debate", "Art Club", "Science Club", "Volunteering", "Sports", "Drama", "Music", "Entrepreneurship");
        extraCurricularComboBox.setPrefWidth(300);
        extraCurricularComboBox.setPrefHeight(50);
        extraCurricularComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        extraCurricularComboBox.setLayoutX((paneWidth - extraCurricularComboBox.getPrefWidth()) / 2);
        extraCurricularComboBox.setLayoutY(480);

        //Question 5: Personality Type
        Text personalityText = new Text("What is your personality type?");
        personalityText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        personalityText.setFill(Color.WHITE);
        personalityText.setLayoutX((paneWidth - personalityText.getLayoutBounds().getWidth()) / 2); 
        personalityText.setLayoutY(570);
    
        ComboBox<String> personalityComboBox = new ComboBox<>();
        personalityComboBox.getItems().addAll("Introvert", "Extrovert");
        personalityComboBox.setPrefWidth(300);
        personalityComboBox.setPrefHeight(50);
        personalityComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        personalityComboBox.setLayoutX((paneWidth - personalityComboBox.getPrefWidth()) / 2);
        personalityComboBox.setLayoutY(600);

        //Question 6: Study Hours
        Text studyHoursText = new Text("How many hours do you study a day? (Ex. 2.5)");
        studyHoursText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        studyHoursText.setFill(Color.WHITE);
        studyHoursText.setLayoutX((paneWidth - studyHoursText.getLayoutBounds().getWidth()) / 2);
        studyHoursText.setLayoutY(690);
    
        TextField studyHoursInput = new TextField();
        studyHoursInput.setPrefWidth(300);
        studyHoursInput.setPrefHeight(50);
        studyHoursInput.setLayoutX((paneWidth - studyHoursInput.getPrefWidth()) / 2); 
        studyHoursInput.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        studyHoursInput.setLayoutY(720); 

        //Question 7: Tech Savvy Score
        Text techText = new Text("How well do you know modern technology (1-10)?");
        techText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        techText.setFill(Color.WHITE);
        techText.setLayoutX((paneWidth - techText.getLayoutBounds().getWidth()) / 2);
        techText.setLayoutY(810);
    
        TextField techInput = new TextField();
        techInput.setPrefWidth(300);
        techInput.setPrefHeight(50);
        techInput.setLayoutX((paneWidth - techInput.getPrefWidth()) / 2); 
        techInput.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        techInput.setLayoutY(840); 

        //Question 8: Creativity Score
        Text creativityText = new Text("How creative do you consider yourself to be (1-10)?");
        creativityText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        creativityText.setFill(Color.WHITE);
        creativityText.setLayoutX((paneWidth - creativityText.getLayoutBounds().getWidth()) / 2);
        creativityText.setLayoutY(930);
    
        TextField creativeInput = new TextField();
        creativeInput.setPrefWidth(300);
        creativeInput.setPrefHeight(50);
        creativeInput.setLayoutX((paneWidth - creativeInput.getPrefWidth()) / 2); 
        creativeInput.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        creativeInput.setLayoutY(960); 

        //Question 9: Family Income Bracket
        Text famIncomeText = new Text("What is your family's income bracket?");
        famIncomeText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        famIncomeText.setFill(Color.WHITE);
        famIncomeText.setLayoutX((paneWidth - famIncomeText.getLayoutBounds().getWidth()) / 2); 
        famIncomeText.setLayoutY(1050);
    
        ComboBox<String> familyComboBox = new ComboBox<>();
        familyComboBox.getItems().addAll("High", "Middle", "Low");
        familyComboBox.setPrefWidth(300);
        familyComboBox.setPrefHeight(50);
        familyComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        familyComboBox.setLayoutX((paneWidth - familyComboBox.getPrefWidth()) / 2);
        familyComboBox.setLayoutY(1080);

        //Question 10: Cultural Influence
        Text culturalText = new Text("What influences your cultural choices most?");
        culturalText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        culturalText.setFill(Color.WHITE);
        culturalText.setLayoutX((paneWidth - culturalText.getLayoutBounds().getWidth()) / 2); 
        culturalText.setLayoutY(1170);
    
        ComboBox<String> culturalComboBox = new ComboBox<>();
        culturalComboBox.getItems().addAll("Personal Interest", "Family", "Society");
        culturalComboBox.setPrefWidth(300);
        culturalComboBox.setPrefHeight(50);
        culturalComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        culturalComboBox.setLayoutX((paneWidth - culturalComboBox.getPrefWidth()) / 2);
        culturalComboBox.setLayoutY(1200);

        //Question 11: Scholarship Status
        Text scholarshipText = new Text("Do you currently have a scholarship?");
        scholarshipText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        scholarshipText.setFill(Color.WHITE);
        scholarshipText.setLayoutX((paneWidth - scholarshipText.getLayoutBounds().getWidth()) / 2); 
        scholarshipText.setLayoutY(1290);
    
        ComboBox<String> scholarshipComboBox = new ComboBox<>();
        scholarshipComboBox.getItems().addAll("Yes", "No");
        scholarshipComboBox.setPrefWidth(300);
        scholarshipComboBox.setPrefHeight(50);
        scholarshipComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        scholarshipComboBox.setLayoutX((paneWidth - scholarshipComboBox.getPrefWidth()) / 2);
        scholarshipComboBox.setLayoutY(1320);

        //Question 12: Primary Skill
        Text skillText = new Text("Which primary skill do you excel in the most?");
        skillText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        skillText.setFill(Color.WHITE);
        skillText.setLayoutX((paneWidth - skillText.getLayoutBounds().getWidth()) / 2); 
        skillText.setLayoutY(1410);
    
        ComboBox<String> skillComboBox = new ComboBox<>();
        skillComboBox.getItems().addAll("Critical Thinking", "Communication", "Creativity", "Leadership", "Adaptability", "Leadership Skills", 
        "Problem Solving", "Technical Skills", "Teamwork");
        skillComboBox.setPrefWidth(300);
        skillComboBox.setPrefHeight(50);
        skillComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        skillComboBox.setLayoutX((paneWidth - skillComboBox.getPrefWidth()) / 2);
        skillComboBox.setLayoutY(1440);

        //Question 13: Hobby
        Text hobbyText = new Text("What is your main hobby?");
        hobbyText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        hobbyText.setFill(Color.WHITE);
        hobbyText.setLayoutX((paneWidth - hobbyText.getLayoutBounds().getWidth()) / 2); 
        hobbyText.setLayoutY(1530);
    
        ComboBox<String> hobbyComboBox = new ComboBox<>();
        hobbyComboBox.getItems().addAll("Cooking", "Sports", "Photography", "Traveling", "Music", "Drawing", "Gardening", "Gaming", "Reading", 
        "Writing", "Programming");
        hobbyComboBox.setPrefWidth(300);
        hobbyComboBox.setPrefHeight(50);
        hobbyComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        hobbyComboBox.setLayoutX((paneWidth - hobbyComboBox.getPrefWidth()) / 2);
        hobbyComboBox.setLayoutY(1560);

        //Question 14: Future Field Security
        Text securityText = new Text("How secure would you like your career to be?");
        securityText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        securityText.setFill(Color.WHITE);
        securityText.setLayoutX((paneWidth - securityText.getLayoutBounds().getWidth()) / 2); 
        securityText.setLayoutY(1650);
    
        ComboBox<String> securityComboBox = new ComboBox<>();
        securityComboBox.getItems().addAll("High", "Moderate", "Low");
        securityComboBox.setPrefWidth(300);
        securityComboBox.setPrefHeight(50);
        securityComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        securityComboBox.setLayoutX((paneWidth - securityComboBox.getPrefWidth()) / 2);
        securityComboBox.setLayoutY(1680);

        //Question 15: Work Flexibility
        Text flexibilityText = new Text("What kind of work environment do you prefer?");
        flexibilityText.setFont(Font.font("Futura", FontWeight.BOLD, 20));
        flexibilityText.setFill(Color.WHITE);
        flexibilityText.setLayoutX((paneWidth - flexibilityText.getLayoutBounds().getWidth()) / 2); 
        flexibilityText.setLayoutY(1770);
    
        ComboBox<String> flexibilityComboBox = new ComboBox<>();
        flexibilityComboBox.getItems().addAll("Rigid", "Flexible");
        flexibilityComboBox.setPrefWidth(300);
        flexibilityComboBox.setPrefHeight(50);
        flexibilityComboBox.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        flexibilityComboBox.setLayoutX((paneWidth - flexibilityComboBox.getPrefWidth()) / 2);
        flexibilityComboBox.setLayoutY(1800);

        //submit button
        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-background-color: #5aaca4; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold;");
        submitButton.setPrefWidth(300);
        submitButton.setPrefHeight(50);
        submitButton.setLayoutX((paneWidth - submitButton.getPrefWidth()) / 2);
        submitButton.setLayoutY(1890);

        submitButton.setOnAction(e -> {
        try {
        String inputCsvPath = "C:/Users/ghelo/Downloads/test_dataset.csv";
        String outputCsvPath = "C:/Users/ghelo/Downloads/prediction.csv";

        //save user input to CSV
        saveUserInputToCsv(ageInput.getText(), strandComboBox.getValue(), mbtiComboBox.getValue(),
        extraCurricularComboBox.getValue(), personalityComboBox.getValue(),
        studyHoursInput.getText(), techInput.getText(), creativeInput.getText(),
        familyComboBox.getValue(), culturalComboBox.getValue(), scholarshipComboBox.getValue(),
        skillComboBox.getValue(), hobbyComboBox.getValue(), securityComboBox.getValue(),
        flexibilityComboBox.getValue()
        );

        Stage primaryStage = (Stage) submitButton.getScene().getWindow();

        //loading page
        LoadingPage loadingPage = new LoadingPage();
        Scene loadingScene = new Scene(loadingPage.createLoadingPane(), 1100, 700);
        primaryStage.setScene(loadingScene);

        //run python script in a new thread to prevent UI freezing
        new Thread(() -> {
            try {
                runPythonScript(inputCsvPath, outputCsvPath);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    });

        
    
        //add components to pane
        formPane1.getChildren().addAll(ageText, ageInput, strandText, strandComboBox, mbtiText, mbtiComboBox, extraCurricularText, 
        extraCurricularComboBox, personalityText, personalityComboBox, studyHoursText, studyHoursInput, techText, techInput, 
        creativityText, creativeInput, famIncomeText, familyComboBox, culturalText, culturalComboBox, scholarshipText, scholarshipComboBox, 
        skillText, skillComboBox, hobbyText, hobbyComboBox, securityText, securityComboBox, flexibilityText, flexibilityComboBox, submitButton);

    }

    //method to save user input to csv
    public static void saveUserInputToCsv(String age, String strand, String mbti, String extra_curricular, String personality,
                                      String study_hours, String tech_score, String creativity_score, String family_income,
                                      String cultural_influence, String scholarship_status, String primary_skill, String hobby,
                                      String field_security, String flexibility) {
    String filePath = "C:/Users/ghelo/Downloads/test_dataset.csv";
    String newRow = String.join(",", age, strand, mbti, extra_curricular, personality, study_hours, tech_score,
            creativity_score, family_income, cultural_influence, scholarship_status, primary_skill, hobby,
            field_security, flexibility);

    List<String> lines = new ArrayList<>();

    //read the existing file
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
    } catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
        return;
    }

    //overwrites old data with new
    if (lines.size() > 1) {
        lines.set(1, newRow); 
    } else if (lines.size() == 1) {
        lines.add(newRow); //adds a second row if it doesn't exist
    }

    //write updated content back to file
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
        for (String line : lines) {
            writer.println(line);
        }
    } catch (IOException e) {
        System.err.println("Error writing file: " + e.getMessage());
    }
}

public static void runPythonScript(String inputCsvPath, String outputCsvPath) throws IOException, InterruptedException {
    ProcessBuilder processBuilder = new ProcessBuilder("python", "main.py", inputCsvPath, outputCsvPath);
    processBuilder.redirectErrorStream(true);

    Process process = processBuilder.start();

    //read and log standard output
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
         BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {

        String line;
        System.out.println("Python Script Output:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println("Python Script Errors (if any):");
        while ((line = errorReader.readLine()) != null) {
            System.err.println(line);
        }
    }

    int exitCode = process.waitFor();
    if (exitCode == 0) {
        System.out.println("Python script executed successfully.");
    } else {
        System.err.println("Python script failed with exit code: " + exitCode);
    }
}


    public static void main(String[] args) {
        launch(args);
    }
}
