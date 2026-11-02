package com.sma.smartv3.view.chart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.ed6;
import com.android.mltcode.paycertificationapi.m00;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class MyMarkerView extends MarkerView {
    public final TextView X11iII1O1;

    public MyMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);
        this.X11iII1O1 = (TextView) findViewById(R.id.tvContent);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.android.mltcode.paycertificationapi.I10XIIXi0
    public m00 getOffset() {
        return new m00(-(getWidth() / 2), -getHeight());
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.android.mltcode.paycertificationapi.I10XIIXi0
    public void iO(Entry e, X110O highlight) {
        if ((e instanceof CandleEntry) == false) goto L5;
        this.X11iII1O1.setText(ed6.O10IXXX0X(((CandleEntry) e).X0O(), 0, true));
    L6:
        super.iO(e, highlight);
        return;
    L5:
        this.X11iII1O1.setText(ed6.O10IXXX0X(e.O00(), 0, true));
        goto L6
    }
}
