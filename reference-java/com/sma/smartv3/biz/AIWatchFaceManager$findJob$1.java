package com.sma.smartv3.biz;

import android.os.Handler;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.biz.AIWatchFaceManager$findJob$1;
import com.sma.smartv3.model.JobDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIWatchFaceManager$findJob$1 implements O1XIiIO<JobDetail> {
    /* JADX INFO: renamed from: iO */
    public static final void m38086iO() {
        AIWatchFaceManager aIWatchFaceManager = AIWatchFaceManager.OXO1;
        if (aIWatchFaceManager.O10IXXX0X()) {
            String str = AIWatchFaceManager.O00;
            Intrinsics.O10IXXX0X(str, "access$getMJobId$p(...)");
            aIWatchFaceManager.I0iXXO(str);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
    public void handleResponse(JobDetail jobDetail) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = AIWatchFaceManager.XIi00iiXO;
        AIWatchFaceManager aIWatchFaceManager = AIWatchFaceManager.OXO1;
        i1o0oxo1o.OXO1(str + " findJob -> " + aIWatchFaceManager.O10IXXX0X() + ", " + jobDetail);
        if (jobDetail == null || !aIWatchFaceManager.O10IXXX0X()) {
            return;
        }
        int jobStatus = jobDetail.getJobStatus();
        if (jobStatus == 2) {
            AIWatchFaceManager.I1XOi1(aIWatchFaceManager, null, 1, null);
        } else if (jobStatus != 3) {
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OX0X1O10X
                @Override // java.lang.Runnable
                public final void run() {
                    AIWatchFaceManager$findJob$1.m38086iO();
                }
            }, 3000L);
        } else {
            aIWatchFaceManager.OIX0iXi(jobDetail.getImages(), jobDetail.getImageSign());
        }
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String error) {
        Intrinsics.X0O(error, "error");
        i1O0OXO1O.OXO1.OXO1(AIWatchFaceManager.XIi00iiXO + " findJob -> error = " + error);
        AIWatchFaceManager.I1XOi1(AIWatchFaceManager.OXO1, null, 1, null);
    }
}
