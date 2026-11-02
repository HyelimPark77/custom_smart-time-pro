package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class JsonField {
    @aa1
    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        return json;
    }
}
