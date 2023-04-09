package com.example.nasha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class DrawView extends View {

        Paint p;
        Rect rect;
        Paint paint;
        Bitmap bitmap_with_tp;
        Bitmap bitmap_grass;
        Bitmap bitmap_straitroad;
        Bitmap bitmap_rotateroad1;
        Bitmap bitmap_rotateroad2;
        Bitmap bitmap_rotateroad3;
        Bitmap bitmap_rotateroad4;




    public DrawView(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);

            p = new Paint();
            rect = new Rect();

            //Подгрузка местности

            bitmap_with_tp = BitmapFactory.decodeResource(context.getResources(), R.drawable.grass_with_tower_place);
            bitmap_with_tp = Bitmap.createScaledBitmap(bitmap_with_tp, 200,200, false);

            bitmap_grass = BitmapFactory.decodeResource(context.getResources(), R.drawable.grass);
            bitmap_grass = Bitmap.createScaledBitmap(bitmap_grass, 200,200, false);

            //Подгрузка дороги

            bitmap_straitroad = BitmapFactory.decodeResource(context.getResources(), R.drawable.road_n1);
            bitmap_straitroad = Bitmap.createScaledBitmap(bitmap_straitroad, 200,200, false);

            bitmap_rotateroad1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.road_n2_rot1);
            bitmap_rotateroad1 = Bitmap.createScaledBitmap(bitmap_rotateroad1, 200,200, false);
            bitmap_rotateroad2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.road_n2_rot2);
            bitmap_rotateroad2 = Bitmap.createScaledBitmap(bitmap_rotateroad2, 200,200, false);
            bitmap_rotateroad3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.road_n2_rot3);
            bitmap_rotateroad3 = Bitmap.createScaledBitmap(bitmap_rotateroad3, 200,200, false);
            bitmap_rotateroad4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.road_n2_rot4);
            bitmap_rotateroad4 = Bitmap.createScaledBitmap(bitmap_rotateroad4, 200,200, false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            p.setStyle(Paint.Style.FILL);
            p.setColor(Color.YELLOW);
            //Временная дорога
            for(int i = 0;i<4;i++){
                canvas.drawBitmap(bitmap_straitroad, i*200, 200, paint);
            }
            canvas.drawBitmap(bitmap_rotateroad1, 800, 200, paint);
            canvas.drawBitmap(bitmap_straitroad, 800, 400, paint);
            canvas.drawBitmap(bitmap_rotateroad3, 800, 600, paint);
            for(int i = 5;i<7;i++){
                canvas.drawBitmap(bitmap_straitroad, i*200, 600, paint);
            }
            canvas.drawBitmap(bitmap_rotateroad2, 1400, 600, paint);
            canvas.drawBitmap(bitmap_rotateroad4, 1400, 400, paint);
            for(int i = 8;i<12;i++){
                canvas.drawBitmap(bitmap_straitroad, i*200, 400, paint);
            }

            //Площадки для строительства башен
            canvas.drawBitmap(bitmap_with_tp, 1000, 200, paint);
            canvas.drawBitmap(bitmap_with_tp, 1000, 400, paint);
            canvas.drawBitmap(bitmap_with_tp, 1200, 400, paint);
            canvas.drawBitmap(bitmap_with_tp, 1200, 800, paint);
            canvas.drawBitmap(bitmap_with_tp, 1600, 600, paint);
            canvas.drawBitmap(bitmap_with_tp, 400, 0, paint);
            canvas.drawBitmap(bitmap_with_tp, 600, 400, paint);
            //Обычная трава
            for(int i = 0;i<2;i++){
                canvas.drawBitmap(bitmap_grass, i*200, 0, paint);
            }
            for(int i = 600;i<2400;i+=200){
                canvas.drawBitmap(bitmap_grass, i, 0, paint);
            }
            for(int i = 0;i<3000;i+=200){
                canvas.drawBitmap(bitmap_grass, i, 1000, paint);
            }
            for(int i = 0;i<6;i+=1){
                canvas.drawBitmap(bitmap_grass, i*200, 800, paint);
            }
            for(int i = 0;i<3;i++){
                canvas.drawBitmap(bitmap_grass, i*200, 400, paint);
            }
            for(int i = 0;i<4;i++){
                canvas.drawBitmap(bitmap_grass, i*200, 600, paint);
            }
            for(int i = 6;i<12;i++){
                canvas.drawBitmap(bitmap_grass, i*200, 200, paint);
            }
            for(int i = 9;i<12;i++){
                canvas.drawBitmap(bitmap_grass, i*200, 600, paint);
            }
            for(int i = 7;i<12;i++){
                canvas.drawBitmap(bitmap_grass, i*200, 800, paint);
            }



        }

}
