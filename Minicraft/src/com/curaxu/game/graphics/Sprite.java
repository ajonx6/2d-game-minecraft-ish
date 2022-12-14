package com.curaxu.game.graphics;

import java.util.Arrays;

public class Sprite {
    public static final int COLOR0 = 0xFF000000;
    public static final int COLOR1 = 0xFF444444;
    public static final int COLOR2 = 0xFF888888;
    public static final int COLOR3 = 0xFFCCCCCC;
    public static final int COLOR4 = 0xFFFFFFFF;

    private GrayscaleSprite sprite;
    private int[] pixels;

    public Sprite(GrayscaleSprite sprite, int c1, int c2, int c3, int c4) {
        int[] ps = sprite.getPixels();
        this.sprite = sprite;
        this.pixels = new int[ps.length];

        for (int i = 0; i < ps.length; i++) {
            if (ps[i] == COLOR0) pixels[i] = 0x0;
            else if (ps[i] == COLOR1) pixels[i] = c1;
            else if (ps[i] == COLOR2) pixels[i] = c2;
            else if (ps[i] == COLOR3) pixels[i] = c3;
            else if (ps[i] == COLOR4) pixels[i] = c4;
        }
    }

    public Sprite(GrayscaleSprite sprite, int[] colors) {
        int[] ps = sprite.getPixels();
        this.sprite = sprite;
        this.pixels = new int[ps.length];

        for (int i = 0; i < ps.length; i++) {
            if (ps[i] == COLOR0) pixels[i] = 0x0;
            else if (ps[i] == COLOR1) pixels[i] = colors[0];
            else if (ps[i] == COLOR2) pixels[i] = colors[1];
            else if (ps[i] == COLOR3) pixels[i] = colors[2];
            else if (ps[i] == COLOR4) pixels[i] = colors[3];
        }
    }

    public Sprite(Sprite sprite) {
        this.sprite = sprite.getGrayscaleSprite();
        this.pixels = new int[sprite.getPixels().length];
        System.arraycopy(sprite.getPixels(), 0, pixels, 0, pixels.length);
    }

    public Sprite(int colour) {
        pixels = new int[256];
        Arrays.fill(pixels, colour);
    }

    public GrayscaleSprite getGrayscaleSprite() {
        return sprite;
    }

    public int getWidth() {
        return sprite.getWidth();
    }

    public int getHeight() {
        return sprite.getHeight();
    }

    public int[] getPixels() {
        return pixels;
    }
}
