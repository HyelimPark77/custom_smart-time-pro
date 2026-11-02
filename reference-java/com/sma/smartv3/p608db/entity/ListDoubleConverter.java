package com.sma.smartv3.p608db.entity;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ListDoubleConverter {
    @aa1
    @TypeConverter
    public final String objectToString(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "list");
        String json = new Gson().toJson(list);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        return json;
    }

    @aa1
    @TypeConverter
    public final List<Double> stringToObject(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        Type type = new TypeToken<List<? extends Double>>() { // from class: com.sma.smartv3.db.entity.ListDoubleConverter$stringToObject$listType$1
        }.getType();
        if (TextUtils.isEmpty(value)) {
            return CollectionsKt__CollectionsKt.m39402iI();
        }
        Object objFromJson = new Gson().fromJson(value, type);
        Intrinsics.XXI(objFromJson);
        return (List) objFromJson;
    }
}
