import javafx.animation.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.util.*;

public class LoadingPage {

    public Pane createLoadingPane() {
        //loading text
        Text loadingText = new Text("Analyzing data...");
        loadingText.setFont(Font.font("Futura", FontWeight.BOLD, 30));
        loadingText.setFill(Color.WHITE);

        //progress bar
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setPrefWidth(500);

        Timeline timeline = new Timeline(
            new KeyFrame(Duration.ZERO, new KeyValue(progressBar.progressProperty(), 0)),
            new KeyFrame(Duration.seconds(5), new KeyValue(progressBar.progressProperty(), 1))
        );
        timeline.setCycleCount(1);
        timeline.play();

        VBox loadingPane = new VBox(20, loadingText, progressBar);
        loadingPane.setAlignment(Pos.CENTER);
        loadingPane.setStyle("-fx-background: linear-gradient(from 0% 0% to 100% 100%, rgb(25, 3, 33), #5aaca4);");

        //transition to result page
        timeline.setOnFinished(event -> {
            ResultPage mainApp = new ResultPage();
            Stage primaryStage = (Stage) loadingPane.getScene().getWindow();
            mainApp.start(primaryStage);
        });

        return loadingPane;
    }
}
