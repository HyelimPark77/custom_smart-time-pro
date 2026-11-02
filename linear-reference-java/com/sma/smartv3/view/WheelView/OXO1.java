package com.sma.smartv3.view.WheelView;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class OXO1 extends Handler {
    public static final int XIi00iiXO = 1000;
    public static final int XO0O10 = 3000;
    public static final int iO = 2000;
    public WheelView OXO1;

    public OXO1(WheelView loopview) {
        this.OXO1 = loopview;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        int r2 = msg.what;
        if (r2 != 1000) goto L5;
        this.OXO1.invalidate();
        return;
    L5:
        if (r2 != 2000) goto L7;
        this.OXO1.OIX0iXi(WheelView.ACTION.FLING);
        return;
    L7:
        if (r2 == 3000) goto L9;
        return;
    L9:
        this.OXO1.IiI10X();
    }
}
