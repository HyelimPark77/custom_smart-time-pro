package com.sma.smartv3.biz;

import android.os.Handler;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OX0X1O10X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.model.JobDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIWatchFaceManager$findJob$1 implements O1XIiIO<JobDetail> {
    public AIWatchFaceManager$findJob$1() {
    }

    public static /* synthetic */ void OXO1() {
        iO();
    }

    public static final void iO() {
        AIWatchFaceManager r0 = AIWatchFaceManager.OXO1;
        if (r0.O10IXXX0X() == false) goto L6;
        String r1 = AIWatchFaceManager.XO0O10();
        Intrinsics.O10IXXX0X(r1, "access$getMJobId$p(...)");
        r0.I0iXXO(r1);
        return;
    }

    public void XIi00iiXO(JobDetail r6) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = AIWatchFaceManager.O00();
        AIWatchFaceManager r2 = AIWatchFaceManager.OXO1;
        r0.OXO1(r1 + " findJob -> " + r2.O10IXXX0X() + ", " + r6);
        if (r6 != null) goto L5;
        return;
    L5:
        if (r2.O10IXXX0X() == false) goto L17;
        int r3 = r6.getJobStatus();
        if (r3 != 2) goto L9;
        AIWatchFaceManager.I1XOi1(r2, null, 1, null);
        return;
    L9:
        if (r3 == 3) goto L12;
        new Handler().postDelayed(new OX0X1O10X(), 3000);
        return;
    L12:
        r2.OIX0iXi(r6.getImages(), r6.getImageSign());
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String r4) {
        Intrinsics.X0O(r4, "error");
        i1O0OXO1O.OXO1.OXO1(AIWatchFaceManager.O00() + " findJob -> error = " + r4);
        AIWatchFaceManager.I1XOi1(AIWatchFaceManager.OXO1, null, 1, null);
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public /* bridge */ /* synthetic */ void handleResponse(JobDetail r1) {
        XIi00iiXO(r1);
    }
}
