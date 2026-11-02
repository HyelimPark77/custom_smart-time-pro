package com.sma.smartv3.db.converter;

import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.ironsource.C2985d4;
import com.sma.smartv3.dto.ChatAiMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatAiModeConverter {
    public ChatAiModeConverter() {
    }

    @aa1
    @TypeConverter
    public final String fromAiMode(@aa1 ChatAiMode r2) {
        Intrinsics.X0O(r2, C2985d4.a.t);
        return r2.name();
    }

    @aa1
    @TypeConverter
    public final ChatAiMode toAiMode(@aa1 String r2) {
        Intrinsics.X0O(r2, "value");
        return ChatAiMode.valueOf(r2);
    }
}
