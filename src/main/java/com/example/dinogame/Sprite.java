package com.example.dinogame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite {
    private int x, y;
    private int width, height;
    private int speedX, speedY;
    private Image image;
    private GraphicsContext gc;

    public Sprite(int x, int y, int width, int height, int speedX, int speedY, Image image, GraphicsContext gc) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speedX = speedX;
        this.speedY = speedY;
        this.image = image;
        this.gc = gc;
    }

    public void update() {
        x += speedX;
        // y += speedY;
    }

    public void render() {
        gc.drawImage(image,0, 0, 48, 48, x,y, width,height);
    }
}
