package com.sma.smartv3.model;

import android.app.Application;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.Utils;
import com.facebook.share.internal.ShareConstants;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.Languages;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMKt {
    @aa1
    public static final String getInsights(@aa1 BloodGlucose2 r4) {
        Intrinsics.X0O(r4, "data");
        JSONObject r1 = new JSONObject(r4.getMLocaleInsights());     // Catch: Exception -> L7
        String r0 = r1.getString(Languages.DEFAULT_LANGUAGE);     // Catch: Exception -> L7
        r1.getString("id");     // Catch: Exception -> L7
        String r2 = r1.getString(Languages.DEFAULT_LANGUAGE_ZH);     // Catch: Exception -> L7
        Application r3 = Utils.getApp();     // Catch: Exception -> L7
        Intrinsics.O10IXXX0X(r3, "getApp(...)");     // Catch: Exception -> L7
        if (UtilsKt.IiiXiI0I(r3) == false) goto L9;
        Intrinsics.XXI(r2);     // Catch: Exception -> L7
        return r2;
    L9:
        Intrinsics.XXI(r0);     // Catch: Exception -> L7
        return r0;
    L7:
        e = move-exception;
        e.printStackTrace();
        return r4.getMInsights();
    }

    @aa1
    public static final String getInsightsTip(@aa1 BloodGlucose2 r5) {
        Intrinsics.X0O(r5, "data");
        JSONObject r1 = new JSONObject(r5.getMLocaleTips());     // Catch: Exception -> L10
        Application r0 = Utils.getApp();     // Catch: Exception -> L10
        Intrinsics.O10IXXX0X(r0, "getApp(...)");     // Catch: Exception -> L10
        if (UtilsKt.IiiXiI0I(r0) == false) goto L12;
        JSONArray r2 = r1.getJSONArray(Languages.DEFAULT_LANGUAGE_ZH);     // Catch: Exception -> L10
        if (r2.length() <= 0) goto L18;
        JSONObject r3 = r2.getJSONObject(0);     // Catch: Exception -> L10
        r3.getInt("id");     // Catch: Exception -> L10
        String r4 = r3.getString(ShareConstants.FEED_CAPTION_PARAM);     // Catch: Exception -> L10
        Intrinsics.XXI(r4);     // Catch: Exception -> L10
        return r4;
    L18:
        return r5.getMTips();
    L12:
        JSONArray r6 = r1.getJSONArray(Languages.DEFAULT_LANGUAGE);     // Catch: Exception -> L10
        if (r6.length() <= 0) goto L18;
        JSONObject r7 = r6.getJSONObject(0);     // Catch: Exception -> L10
        r7.getInt("id");     // Catch: Exception -> L10
        String r8 = r7.getString(ShareConstants.FEED_CAPTION_PARAM);     // Catch: Exception -> L10
        Intrinsics.XXI(r8);     // Catch: Exception -> L10
        return r8;
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L18
    }
}
