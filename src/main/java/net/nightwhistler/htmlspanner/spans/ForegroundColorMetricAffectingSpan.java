package net.nightwhistler.htmlspanner.spans;

import android.os.Parcel;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/**
 * Created by Benjamin on 9/30/2016.
 */
public class ForegroundColorMetricAffectingSpan extends MetricAffectingSpan {

    private final int mColor;

    public ForegroundColorMetricAffectingSpan(int color) {
        mColor = color;
    }

    public ForegroundColorMetricAffectingSpan(Parcel src) {
        mColor = src.readInt();
    }

    public int getForegroundColor() {
        return mColor;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setColor(mColor);
    }

    @Override
    public void updateMeasureState(TextPaint p) {
        p.setColor(mColor);
    }
}