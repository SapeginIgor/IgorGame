package com.example.nasha;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public abstract class Entity {
    public boolean alive = false;
    protected final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public int x;
    public int y;

    public int vx;
    public int vy;

    public int getVerticalCenter() { return y; }
    public int getHorizontalCenter() { return x; }

    public abstract void draw(Canvas canvas);



    public Rect occupiedRectangle() {
        return new Rect(x, y, x, y);
    }
    /**
     * Отрисовать сущность на холсте как прямоугольник
     * <p>
     * Может использоваться для проверки границ, занимаемых сущностью
     *
     * @param canvas холст, на котором необходимо отрисовать сущность
     */
    public final void drawAsRectangle(Canvas canvas) {
        if (alive) {
            canvas.drawRect(occupiedRectangle(), paint);
        }
    }
}
