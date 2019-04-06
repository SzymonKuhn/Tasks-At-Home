package pl.szymonkuhn.javaFXTasks;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Base64Task extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Coder");

        TextArea area1 = new TextArea();
        area1.setPrefHeight(200);
        area1.setPrefWidth(600);
        area1.setPromptText("Type in text in here...");

        TextArea area2 = new TextArea();
        area2.setPrefHeight(200);
        area2.setPrefWidth(600);
        area2.setPromptText("Here will be coded text.");

        Button button1 = new Button("Button 1");
        Label label1 = new Label("Click button to go to scene2");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(15));
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setAlignment(Pos.TOP_CENTER);

        GridPane.setConstraints(area1,0,0);
        GridPane.setConstraints(label1,0,1);
        GridPane.setConstraints(button1,0,2);
        GridPane.setConstraints(area2,0,3);

        layout.getChildren().addAll(area1, button1, label1, area2);
        Scene scene1 = new Scene(layout, 600, 600);

        // scene 2, layout 2, button 2
//        Button button2 = new Button ("Button 2");
//        Label label2 = new Label("Click button to go to scene 1");

//        HBox layout2 = new HBox();
//        layout2.getChildren().add(label2);
//        layout2.getChildren().add(button2);

//        Scene scene2 = new Scene (layout2, 600,300);

//        button1.setOnAction(e -> primaryStage.setScene(scene2));
//        button2.setOnAction(e-> primaryStage.setScene(scene1));


        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}
