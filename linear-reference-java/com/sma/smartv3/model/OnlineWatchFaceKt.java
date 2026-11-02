package com.sma.smartv3.model;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OnlineWatchFaceKt {
    public static final int getWatchFaceCategoryName(@aa1 Context r3, int r4) {
        Intrinsics.X0O(r3, "mContext");
        int r5 = r3.getResources().getIdentifier("watch_face_category" + r4, TypedValues.Custom.S_STRING, r3.getPackageName());     // Catch: Exception -> L7
        if (r5 != 0) goto L12;
        return q62.OXO1.iO11i();
    L12:
        return r5;
    L7:
        e = move-exception;
        e.printStackTrace();
        return q62.OXO1.iO11i();
    }
}
