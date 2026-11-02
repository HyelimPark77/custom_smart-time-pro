package com.sma.smartv3.p608db.converter;

import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.dto.FunctionType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FunctionTypeConverter {
    @aa1
    @TypeConverter
    public final String fromFunctionType(@aa1 FunctionType type) {
        Intrinsics.X0O(type, "type");
        return type.name();
    }

    @aa1
    @TypeConverter
    public final FunctionType toFunctionType(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        return FunctionType.valueOf(value);
    }
}
