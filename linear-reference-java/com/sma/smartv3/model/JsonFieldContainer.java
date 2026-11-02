package com.sma.smartv3.model;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class JsonFieldContainer {
    public JsonFieldContainer() {
    }

    public final /* synthetic */ <T> T jsonField(String r4) {
        Intrinsics.X0O(r4, "json");
        Gson r0 = new Gson();     // Catch: Exception -> L5
        Intrinsics.OX(4, "T");     // Catch: Exception -> L5
        return (T) r0.fromJson(r4, Object.class);
    L5:
        e = move-exception;
        e.printStackTrace();
        return null;
    }
}
