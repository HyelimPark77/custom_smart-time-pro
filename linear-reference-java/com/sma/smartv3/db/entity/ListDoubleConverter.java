package com.sma.smartv3.db.entity;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ListDoubleConverter {
    public ListDoubleConverter() {
    }

    @aa1
    @TypeConverter
    public final String objectToString(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "list");
        String r3 = new Gson().toJson(r2);
        Intrinsics.O10IXXX0X(r3, "toJson(...)");
        return r3;
    }

    @aa1
    @TypeConverter
    public final List<Double> stringToObject(@aa1 String r3) {
        Intrinsics.X0O(r3, "value");
        Type r0 = new ListDoubleConverter$stringToObject$listType$1().getType();
        if (TextUtils.isEmpty(r3) == true) goto L5;
        Object r4 = new Gson().fromJson(r3, r0);
        Intrinsics.XXI(r4);
        return (List) r4;
    L5:
        return CollectionsKt__CollectionsKt.iI();
    }
}
