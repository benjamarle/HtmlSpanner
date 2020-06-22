package net.nightwhistler.htmlspanner.spans;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/**
 * Created by Benjamin on 9/29/2016.
 */
public class BackgroundColorMetricAffectingSpan extends MetricAffectingSpan {

    private final int mColor;

    public BackgroundColorMetricAffectingSpan(int color) {
        mColor = color;
    }


    public int getBackgroundColor() {
        return mColor;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.bgColor = mColor;
    }

    @Override
    public void updateMeasureState(TextPaint p) {
        // nothing to do
        p.bgColor = mColor;
    }
}
