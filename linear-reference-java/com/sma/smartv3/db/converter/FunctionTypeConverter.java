package com.sma.smartv3.db.converter;

import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.dto.FunctionType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FunctionTypeConverter {
    public FunctionTypeConverter() {
    }

    @aa1
    @TypeConverter
    public final String fromFunctionType(@aa1 FunctionType r2) {
        Intrinsics.X0O(r2, "type");
        return r2.name();
    }

    @aa1
    @TypeConverter
    public final FunctionType toFunctionType(@aa1 String r2) {
        Intrinsics.X0O(r2, "value");
        return FunctionType.valueOf(r2);
    }
}
