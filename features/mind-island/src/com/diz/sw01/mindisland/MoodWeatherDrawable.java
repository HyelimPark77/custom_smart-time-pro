package com.diz.sw01.mindisland;

import android.graphics.*;
import android.graphics.drawable.Drawable;

/** Vector companion to assets/mind-island/icons; keeps water and air visually distinct. */
final class MoodWeatherDrawable extends Drawable {
    private final boolean calm;
    private final Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    MoodWeatherDrawable(boolean calm){this.calm=calm;}
    @Override public void draw(Canvas canvas){
        int save=canvas.save();Rect bounds=getBounds();canvas.translate(bounds.left,bounds.top);canvas.scale(bounds.width()/64f,bounds.height()/64f);
        paint.setStyle(Paint.Style.FILL);paint.setColor(Color.parseColor(calm?"#E4F5F1":"#EEE5FC"));canvas.drawCircle(32,32,28,paint);
        Path p=new Path();
        if(calm){
            paint.setColor(Color.parseColor("#FFE6AE"));p.moveTo(23,25);p.cubicTo(23,13,41,13,41,25);p.close();canvas.drawPath(p,paint);p.reset();
            p.moveTo(14,28);p.lineTo(50,28);p.moveTo(13,34);p.cubicTo(19,32,25,32,31,34);p.cubicTo(37,36,43,36,51,34);
            p.moveTo(17,42);p.cubicTo(23,40,29,40,35,42);p.cubicTo(41,44,43,44,47,42);p.moveTo(24,49);p.lineTo(40,49);
        }else{
            p.moveTo(10,24);p.lineTo(37,24);p.cubicTo(46,24,46,12,38,12);p.cubicTo(34,12,32,14,32,17);
            p.moveTo(10,33);p.lineTo(49,33);p.cubicTo(58,33,58,19,50,19);p.cubicTo(46,19,44,22,44,25);
            p.moveTo(14,42);p.lineTo(34,42);p.cubicTo(43,42,43,54,35,54);p.cubicTo(31,54,29,52,29,49);
        }
        paint.setStyle(Paint.Style.STROKE);paint.setStrokeWidth(3.5f);paint.setStrokeCap(Paint.Cap.ROUND);paint.setStrokeJoin(Paint.Join.ROUND);paint.setColor(Color.parseColor(calm?"#65A99C":"#9470C0"));canvas.drawPath(p,paint);canvas.restoreToCount(save);
    }
    @Override public void setAlpha(int alpha){paint.setAlpha(alpha);invalidateSelf();}
    @Override public void setColorFilter(ColorFilter filter){paint.setColorFilter(filter);invalidateSelf();}
    @Override public int getOpacity(){return PixelFormat.TRANSLUCENT;}
}
