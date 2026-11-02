package com.sma.smartv3.p608db.converter;

import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.dto.ChatAiMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatAiModeConverter {
    @aa1
    @TypeConverter
    public final String fromAiMode(@aa1 ChatAiMode mode) {
        Intrinsics.X0O(mode, "mode");
        return mode.name();
    }

    @aa1
    @TypeConverter
    public final ChatAiMode toAiMode(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        return ChatAiMode.valueOf(value);
    }
}
