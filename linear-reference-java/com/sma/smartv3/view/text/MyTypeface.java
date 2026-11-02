package com.sma.smartv3.view.text;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum MyTypeface extends Enum<MyTypeface> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ MyTypeface[] $VALUES = null;

    @Deprecated(message = "字体库已删除")
    public static final MyTypeface DIN_COND_BOLD = null;

    @Deprecated(message = "字体库已删除")
    public static final MyTypeface PF_BOLD = null;

    @Deprecated(message = "字体库已删除")
    public static final MyTypeface PF_EXTRA_LIGHT = null;

    @Deprecated(message = "字体库已删除")
    public static final MyTypeface PF_MEDIUM = null;

    @Deprecated(message = "字体库已删除")
    public static final MyTypeface PF_REGULAR = null;

    @aa1
    private final String fontName;

    private static final /* synthetic */ MyTypeface[] $values() {
        return new MyTypeface[]{DIN_COND_BOLD, PF_MEDIUM, PF_BOLD, PF_EXTRA_LIGHT, PF_REGULAR};
    }

    static {
        DIN_COND_BOLD = new MyTypeface("DIN_COND_BOLD", 0, "DINCond-Bold.otf");
        PF_MEDIUM = new MyTypeface("PF_MEDIUM", 1, "PingFang Medium_0.ttf");
        PF_BOLD = new MyTypeface("PF_BOLD", 2, "PingFang Bold.ttf");
        PF_EXTRA_LIGHT = new MyTypeface("PF_EXTRA_LIGHT", 3, "PingFang ExtraLight.ttf");
        PF_REGULAR = new MyTypeface("PF_REGULAR", 4, "PingFang Regular_0.ttf");
        MyTypeface[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private MyTypeface(String r1, int r2, String r3) {
        super(r1, r2);
        this.fontName = r3;
    }

    @aa1
    public static EnumEntries<MyTypeface> getEntries() {
        return $ENTRIES;
    }

    public static MyTypeface valueOf(String r1) {
        return (MyTypeface) Enum.valueOf(MyTypeface.class, r1);
    }

    public static MyTypeface[] values() {
        return (MyTypeface[]) $VALUES.clone();
    }

    @aa1
    public final String getFontName() {
        return this.fontName;
    }
}
