package com.sma.smartv3.model;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class JsonFieldContainer {
    public final /* synthetic */ <T> T jsonField(String json) {
        Intrinsics.X0O(json, "json");
        try {
            Gson gson = new Gson();
            Intrinsics.m39537OX(4, "T");
            return (T) gson.fromJson(json, (Class) Object.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
