package com.sma.smartv3.model;

import android.app.Application;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.Utils;
import com.facebook.share.internal.ShareConstants;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.Languages;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMKt {
    @aa1
    public static final String getInsights(@aa1 BloodGlucose2 data) {
        Intrinsics.X0O(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data.getMLocaleInsights());
            String string = jSONObject.getString(Languages.DEFAULT_LANGUAGE);
            jSONObject.getString("id");
            String string2 = jSONObject.getString(Languages.DEFAULT_LANGUAGE_ZH);
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            if (UtilsKt.IiiXiI0I(app)) {
                Intrinsics.XXI(string2);
                return string2;
            }
            Intrinsics.XXI(string);
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return data.getMInsights();
        }
    }

    @aa1
    public static final String getInsightsTip(@aa1 BloodGlucose2 data) {
        Intrinsics.X0O(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data.getMLocaleTips());
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            if (UtilsKt.IiiXiI0I(app)) {
                JSONArray jSONArray = jSONObject.getJSONArray(Languages.DEFAULT_LANGUAGE_ZH);
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                    jSONObject2.getInt("id");
                    String string = jSONObject2.getString(ShareConstants.FEED_CAPTION_PARAM);
                    Intrinsics.XXI(string);
                    return string;
                }
            } else {
                JSONArray jSONArray2 = jSONObject.getJSONArray(Languages.DEFAULT_LANGUAGE);
                if (jSONArray2.length() > 0) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                    jSONObject3.getInt("id");
                    String string2 = jSONObject3.getString(ShareConstants.FEED_CAPTION_PARAM);
                    Intrinsics.XXI(string2);
                    return string2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data.getMTips();
    }
}
