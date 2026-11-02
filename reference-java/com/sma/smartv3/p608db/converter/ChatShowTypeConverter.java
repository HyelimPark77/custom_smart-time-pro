package com.sma.smartv3.p608db.converter;

import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.dto.ChatShowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatShowTypeConverter {
    @aa1
    @TypeConverter
    public final String fromShowType(@aa1 ChatShowType type) {
        Intrinsics.X0O(type, "type");
        return type.name();
    }

    @aa1
    @TypeConverter
    public final ChatShowType toShowType(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        return ChatShowType.valueOf(value);
    }
}
