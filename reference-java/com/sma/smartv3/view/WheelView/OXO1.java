package com.sma.smartv3.view.WheelView;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class OXO1 extends Handler {
    public static final int XIi00iiXO = 1000;
    public static final int XO0O10 = 3000;

    /* JADX INFO: renamed from: iO */
    public static final int f55062iO = 2000;
    public WheelView OXO1;

    public OXO1(WheelView loopview) {
        this.OXO1 = loopview;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        int i = msg.what;
        if (i == 1000) {
            this.OXO1.invalidate();
        } else if (i == 2000) {
            this.OXO1.OIX0iXi(WheelView.ACTION.FLING);
        } else {
            if (i != 3000) {
                return;
            }
            this.OXO1.IiI10X();
        }
    }
}
