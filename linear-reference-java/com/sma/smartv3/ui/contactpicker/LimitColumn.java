package com.sma.smartv3.ui.contactpicker;

/* JADX INFO: loaded from: classes19.dex */
public final enum LimitColumn extends Enum<LimitColumn> {
    private static final /* synthetic */ LimitColumn[] $VALUES = null;
    public static final LimitColumn EMAIL = null;
    public static final LimitColumn NONE = null;
    public static final LimitColumn PHONE = null;

    private static /* synthetic */ LimitColumn[] $values() {
        return new LimitColumn[]{EMAIL, PHONE, NONE};
    }

    static {
        EMAIL = new LimitColumn("EMAIL", 0);
        PHONE = new LimitColumn("PHONE", 1);
        NONE = new LimitColumn("NONE", 2);
        $VALUES = $values();
    }

    private LimitColumn(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    public static LimitColumn valueOf(String name) {
        return (LimitColumn) Enum.valueOf(LimitColumn.class, name);
    }

    public static LimitColumn[] values() {
        return (LimitColumn[]) $VALUES.clone();
    }
}
