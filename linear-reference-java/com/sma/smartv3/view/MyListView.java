package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MyListView extends ListView {
    @JvmOverloads
    public MyListView(@aa1 Context r2, @aa1 AttributeSet r3) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "attrs");
        super(r2, r3);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
