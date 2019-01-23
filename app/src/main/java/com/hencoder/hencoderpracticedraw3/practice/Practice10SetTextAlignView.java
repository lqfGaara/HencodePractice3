package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10SetTextAlignView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice10SetTextAlignView(Context context) {
        super(context);
    }

    public Practice10SetTextAlignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10SetTextAlignView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint1.setTextSize(60);
        paint2.setTextSize(60);
        paint3.setTextSize(60);
        // 使用 Paint.setTextAlign() 来调整文字对齐方式
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 Paint.setTextAlign() 来调整文字对齐方式

        // 第一处：使用 Paint.Align.LEFT
        paint1.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(text, getWidth() / 2, 100, paint1);

        // 第二处：使用 Paint.Align.CENTER
        paint2.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(text, getWidth() / 2, 200, paint2);

        // 第三处：使用 Paint.Align.RIGHT
        paint3.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(text, getWidth() / 2, 300, paint3);
    }
}
