package com.sma.smartv3.model;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OnlineWatchFaceKt {
    public static final int getWatchFaceCategoryName(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            int identifier = mContext.getResources().getIdentifier("watch_face_category" + i, TypedValues.Custom.S_STRING, mContext.getPackageName());
            return identifier == 0 ? q62.OXO1.iO11i() : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return q62.OXO1.iO11i();
        }
    }
}
