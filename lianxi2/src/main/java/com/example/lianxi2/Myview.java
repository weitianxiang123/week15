package com.example.lianxi2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Myview extends View {

    private Paint paintTop,paintBottom;
    private Path pathTop;
    private Path pathBottom;
    private float φ;

    public Myview(Context context) {
        super(context);
        init(context);
    }

    public Myview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Myview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        paintTop = new Paint();
        paintTop.setColor(Color.WHITE);
        paintTop.setAntiAlias(true);
        paintBottom=new Paint();
        paintBottom.setColor(Color.BLUE);
        paintBottom.setAntiAlias(true);
        paintBottom.setAlpha(60);
        pathTop = new Path();
        pathBottom = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pathBottom.reset();
        pathTop.reset();
        //开始位置
        pathTop.moveTo(getLeft(),getBottom());
        pathBottom.moveTo(getLeft(),getBottom());
        //中间位置
        double my= Math.PI*2/getWidth();
        φ-=0.1f;

        for (float x=0;x<=getWidth();x+=20){
            pathTop.lineTo(x, (float) (10*Math.cos(my*x+φ)+10));
            pathBottom.lineTo(x, (float) (10*Math.sin(my*x+φ)));
        }
        //结束位置
        pathTop.lineTo(getRight(),getBottom());
        pathBottom.lineTo(getRight(),getBottom());

        canvas.drawPath(pathTop,paintTop);
        canvas.drawPath(pathBottom,paintBottom);

        postInvalidateDelayed(20);
    }
}
