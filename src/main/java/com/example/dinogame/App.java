package com.example.dinogame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {

    final int CANVAS_WIDTH = 800, CANVAS_HEIGHT = 600;
    final int GROUND_Y = 200;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        StackPane root = new StackPane(canvas);

        Image player = new Image(getClass().getResourceAsStream("/assets/01_player.png"));
        Sprite s = new Sprite(0, GROUND_Y, 100, 100, 1, 1, player, gc);

        Image img = new Image(getClass().getResourceAsStream("/assets/rocks.png"));
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                s.update();

                gc.setFill(Color.rgb(20, 20, 35));
                gc.fillRect(0, 0, 800, 600); // Cancella tutto

                s.render();
                gc.drawImage(img,24,24,24,24,0,0,100,100);
            }
        };
        timer.start();

        stage.setScene(new Scene(root, 800, 600));
        stage.setTitle("Dino");
        stage.show();
    }

    static void main() {
        new App();
    }
}