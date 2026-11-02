package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum ChatShowType extends Enum<ChatShowType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ChatShowType[] $VALUES = null;
    public static final ChatShowType FROM = null;
    public static final ChatShowType TO = null;
    private final int flag;

    private static final /* synthetic */ ChatShowType[] $values() {
        return new ChatShowType[]{FROM, TO};
    }

    static {
        FROM = new ChatShowType("FROM", 0, 1);
        TO = new ChatShowType("TO", 1, 2);
        ChatShowType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private ChatShowType(String r1, int r2, int r3) {
        super(r1, r2);
        this.flag = r3;
    }

    @aa1
    public static EnumEntries<ChatShowType> getEntries() {
        return $ENTRIES;
    }

    public static ChatShowType valueOf(String r1) {
        return (ChatShowType) Enum.valueOf(ChatShowType.class, r1);
    }

    public static ChatShowType[] values() {
        return (ChatShowType[]) $VALUES.clone();
    }

    public final int getFlag() {
        return this.flag;
    }
}
