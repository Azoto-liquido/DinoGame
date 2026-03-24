package com.example.dinogame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class SpriteWithGravity extends Sprite {
    private int gravity;
    private int jumpForce;

    public SpriteWithGravity(int x, int y, int width, int height, int speedX, int speedY, Image image, GraphicsContext gc, int gravity, int jumpForce) {
        super(x, y, width, height, speedX, speedY, image, gc);
        this.gravity = gravity;
        this.jumpForce = jumpForce;
    }

    @Override
    public void update() {
        super.update();
    }
}
