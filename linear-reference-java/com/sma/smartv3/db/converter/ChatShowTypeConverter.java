package com.sma.smartv3.db.converter;

import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.dto.ChatShowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatShowTypeConverter {
    public ChatShowTypeConverter() {
    }

    @aa1
    @TypeConverter
    public final String fromShowType(@aa1 ChatShowType r2) {
        Intrinsics.X0O(r2, "type");
        return r2.name();
    }

    @aa1
    @TypeConverter
    public final ChatShowType toShowType(@aa1 String r2) {
        Intrinsics.X0O(r2, "value");
        return ChatShowType.valueOf(r2);
    }
}
