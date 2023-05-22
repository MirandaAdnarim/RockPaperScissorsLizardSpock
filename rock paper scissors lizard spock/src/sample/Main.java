package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.util.*;
import javafx.event.EventHandler;

public class Main extends Application {
    int wins=0;
    int losses=0;
    int ties=0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();

        Image paper = new Image("file:images/paper.png", 150, 150, true, true);
        Image scissors = new Image("file:images/scissors.png", 150, 150, true, true);
        Image lizard = new Image("file:images/lizard.png", 150, 150, true, true);
        Image spock = new Image("file:images/spock.png", 150, 150, true, true);
        Image topLeft = new Image("file:images/topLeft.png", 150, 150, true, true);
        Image topRight = new Image("file:images/topRight.png", 150, 150, true, true);

        ImageView viewTopLeft = new ImageView(topLeft);
        ImageView viewTopRight = new ImageView(topRight);
        ImageView viewPaper = new ImageView(paper);
        ImageView viewScissors = new ImageView(scissors);
        ImageView viewLizard = new ImageView(lizard);
        ImageView viewSpock = new ImageView(spock);

        Label gameSpace = new Label("Please click on symbol to play.");
        Label score = new Label("Wins: "+wins+"  Losses: "+losses+"  Ties: "+ties);

        root.add(viewTopLeft, 0, 1, 3, 1);
        root.add(viewTopRight, 3, 1, 3, 1);
        root.add(viewPaper, 0, 2, 3, 1);
        root.add(viewSpock, 3, 3, 3, 1);
        root.add(viewLizard, 3, 2, 3, 1);
        root.add(viewScissors, 0, 3, 3, 1);
        root.add(gameSpace, 1, 4, 5, 1);
        root.add(score, 1, 7);

        EventHandler<MouseEvent> clickRock = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                int num=computerChoice();
                String result=switchStatment("rock",num,gameSpace );
                if (result.equals("win")){
                    wins++;

                }else if (result.equals("tie")){
                    ties++;

                }else{
                    losses++;
                }
                score.setText("Wins: "+wins+"  Losses: "+losses+"  Ties: "+ties);

            }
        };
        EventHandler<MouseEvent> clickPaper = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                int num=computerChoice();
                String result=switchStatment("paper",num,gameSpace );
                if (result.equals("win")){
                    wins++;

                }else if (result.equals("tie")){
                    ties++;

                }else{
                    losses++;
                }
                score.setText("Wins: "+wins+"  Losses: "+losses+"  Ties: "+ties);
            }
        };
        EventHandler<MouseEvent> clickScissors = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                int num=computerChoice();
                String result=switchStatment("scissors",num,gameSpace );
                if (result.equals("win")){
                    wins++;

                }else if (result.equals("tie")){
                    ties++;

                }else{
                    losses++;
                }
                score.setText("Wins: "+wins+"  Losses: "+losses+"  Ties: "+ties);

            }
        };
        EventHandler<MouseEvent> clickLizard = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                int num=computerChoice();
                String result=switchStatment("lizard",num,gameSpace );
                if (result.equals("win")){
                    wins++;

                }else if (result.equals("tie")){
                    ties++;

                }else{
                    losses++;
                }
                score.setText("Wins: "+wins+"  Losses: "+losses+"  Ties: "+ties);

            }
        };
        EventHandler<MouseEvent> clickSpock = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                int num=computerChoice();
                String result=switchStatment("spock",num,gameSpace );
                if (result.equals("win")){
                    wins++;

                }else if (result.equals("tie")){
                    ties++;

                }else{
                    losses++;
                }
                score.setText("Wins: "+wins+"  Losses: "+losses+"  Ties: "+ties);

            }
        };

        viewTopLeft.setOnMouseClicked(clickRock);
        viewTopRight.setOnMouseClicked(clickRock);
        viewPaper.setOnMouseClicked(clickPaper);
        viewScissors.setOnMouseClicked(clickScissors);
        viewLizard.setOnMouseClicked(clickLizard);
        viewSpock.setOnMouseClicked(clickSpock);

        primaryStage.setTitle("Rock Paper Scissors Lizard Spock");
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static int computerChoice() {
        Random rand=new Random();
        int num = rand.nextInt(5);
        return num;


    }
    public static String switchStatment(String word, int computerChoice, Label gameSpace ){
        switch (computerChoice+1){
            case 0://rock

                if (word.equals("rock")){
                    gameSpace.setText("You chose "+ word +". Computer chose rock. Its a tie!");
                    return "tie";
                }else if(word.equals("paper")){
                    gameSpace.setText("You chose "+ word +". Computer chose rock. You win!");
                    return "win";
                }else if (word.equals("scissors")) {
                    gameSpace.setText("You chose " + word + ". Computer chose rock. You loose!");
                    return "loose";
                }else  if (word.equals("lizard")) {
                    gameSpace.setText("You chose " + word + ". Computer chose rock. You loose!");
                    return "loose";
                }else {
                    gameSpace.setText("You chose " + word + ". Computer chose rock. You win!");
                    return "win";
                }


            case 1://paper

                if (word.equals("paper")){
                    gameSpace.setText("You chose "+ word +". Computer chose paper. Its a tie!");
                    return "tie";
                }else if(word.equals("rock")){
                    gameSpace.setText("You chose "+ word +". Computer chose paper. You loose!");
                    return "loose";
                }else if (word.equals("scissors")) {
                    gameSpace.setText("You chose " + word + ". Computer chose paper. You win!");
                    return "win";
                }else  if (word.equals("lizard")) {
                    gameSpace.setText("You chose " + word + ". Computer chose paper. You win!");
                    return "win";
                }else {
                    gameSpace.setText("You chose " + word + ". Computer chose paper. You loose!");
                    return "loose";
                }

            case 2://scissors

                if (word.equals("scissors")){
                    gameSpace.setText("You chose "+ word +". Computer chose scissors. Its a tie!");
                    return "tie";
                }else if(word.equals("paper")){
                    gameSpace.setText("You chose "+ word +". Computer chose scissors. You loose!");
                    return "loose";
                }else if (word.equals("rock")){
                    gameSpace.setText("You chose " + word + ". Computer chose scissor. You win!");
                    return "win";
                }else  if (word.equals("lizard")) {
                    gameSpace.setText("You chose " + word + ". Computer chose scissors. You loose!");
                    return "loose";
                }else {
                    gameSpace.setText("You chose " + word + ". Computer chose scissors. You win!");
                    return "win";
                }

            case 3://lizard

                if (word.equals("lizard")){
                    gameSpace.setText("You chose "+ word +". Computer chose lizard. Its a tie!");
                    return "tie";
                }else if(word.equals("paper")){
                    gameSpace.setText("You chose "+ word +". Computer chose lizard. You loose!");
                    return "loose";
                }else if (word.equals("scissors")){
                    gameSpace.setText("You chose " + word + ". Computer chose lizard. You win!");
                    return "win";
                }else  if (word.equals("rock")) {
                    gameSpace.setText("You chose " + word + ". Computer chose lizard. You loose!");
                    return "loose";
                }else {
                    gameSpace.setText("You chose " + word + ". Computer chose lizard. You win!");
                    return "win";
                }

            case 4://spock

                if (word.equals("spock")){
                    gameSpace.setText("You chose "+ word +". Computer chose spock. Its a tie!");
                    return "tie";
                }else if(word.equals("paper")){
                    gameSpace.setText("You chose "+ word +". Computer chose spock. You win!");
                    return "win";
                }else if (word.equals("scissors")){
                    gameSpace.setText("You chose " + word + ". Computer chose spock. You loose!");
                    return "loose";
                }else  if (word.equals("lizard")) {
                    gameSpace.setText("You chose " + word + ". Computer chose spock. You win!");
                    return "win";
                }else {
                    gameSpace.setText("You chose " + word + ". Computer chose rock. You win!");
                    return "win";
                }
        }
        return "error";
    }
}