package com.sma.smartv3.dto;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum ChatEndType extends Enum<ChatEndType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ChatEndType[] $VALUES = null;
    public static final ChatEndType Ended = null;
    public static final ChatEndType Sending = null;
    private final int flag;

    private static final /* synthetic */ ChatEndType[] $values() {
        return new ChatEndType[]{Ended, Sending};
    }

    static {
        Ended = new ChatEndType("Ended", 0, 1);
        Sending = new ChatEndType("Sending", 1, 0);
        ChatEndType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private ChatEndType(String r1, int r2, int r3) {
        super(r1, r2);
        this.flag = r3;
    }

    @aa1
    public static EnumEntries<ChatEndType> getEntries() {
        return $ENTRIES;
    }

    public static ChatEndType valueOf(String r1) {
        return (ChatEndType) Enum.valueOf(ChatEndType.class, r1);
    }

    public static ChatEndType[] values() {
        return (ChatEndType[]) $VALUES.clone();
    }

    public final int getFlag() {
        return this.flag;
    }
}
