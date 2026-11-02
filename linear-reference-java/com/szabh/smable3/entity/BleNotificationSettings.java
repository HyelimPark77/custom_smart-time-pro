package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleNotificationSettings extends BleWritable {

    @aa1
    public static final String BAND = "bandapp";

    @aa1
    public static final String BETWEEN = "between";

    @aa1
    public static final String CALL = "tel";

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String EMAIL = "mailto";

    @aa1
    public static final String FACEBOOK_MESSENGER = "fbauth2";

    @aa1
    public static final String GMAIL = "googlegmail";

    @aa1
    public static final String INSTAGRAM = "instagram";
    public static final int ITEM_LENGTH = 4;

    @aa1
    public static final String KAKAO_TALK = "kakaolink";

    @aa1
    public static final String LINE = "line";

    @aa1
    public static final String LINKED_IN = "linkedin";

    @aa1
    public static final String MIRROR_PHONE = "mirror_phone";

    @aa1
    public static final String NAVERCAFE = "navercafe";

    @aa1
    public static final String NETFLIX = "nflx";

    @aa1
    public static final String QQ = "mqq";

    @aa1
    public static final String SINA_WEIBO = "sinaweibo";

    @aa1
    public static final String SKYPE = "skype";

    @aa1
    public static final String SMS = "sms";

    @aa1
    public static final String TELEGRAM = "telegram";

    @aa1
    public static final String TWITTER = "twitter";

    @aa1
    public static final String WE_CHAT = "wechat";

    @aa1
    public static final String WHATS_APP = "whatsapp";

    @aa1
    public static final String YOUTUBE = "youtube";

    @aa1
    private final Map<String, Integer> BIT_MASKS;
    private int mNotificationBits;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleNotificationSettings() {
        Map<String, Integer> r1 = OXO1.X11I(new Pair[]{TuplesKt.OXO1("mirror_phone", 1), TuplesKt.OXO1("tel", 2), TuplesKt.OXO1("sms", 4), TuplesKt.OXO1("mailto", 8), TuplesKt.OXO1("skype", 16), TuplesKt.OXO1("fbauth2", 32), TuplesKt.OXO1("whatsapp", 64), TuplesKt.OXO1("line", 128), TuplesKt.OXO1("instagram", 256), TuplesKt.OXO1("kakaolink", 512), TuplesKt.OXO1("googlegmail", 1024), TuplesKt.OXO1("twitter", 2048), TuplesKt.OXO1("linkedin", 4096), TuplesKt.OXO1("sinaweibo", 8192), TuplesKt.OXO1("mqq", 16384), TuplesKt.OXO1("wechat", 32768), TuplesKt.OXO1("bandapp", 65536), TuplesKt.OXO1("telegram", 131072), TuplesKt.OXO1("between", 262144), TuplesKt.OXO1("navercafe", 524288), TuplesKt.OXO1("youtube", 1048576), TuplesKt.OXO1("nflx", 2097152)});
        this.BIT_MASKS = r1;
        Iterator<String> r2 = r1.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        String r3 = r2.next();
        if (Intrinsics.XOO0ii0(r3, "tel") == true) goto L4;
        enable(r3);
        goto L4
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mNotificationBits = BleReadable.readInt32$default(this, null, 1, null);
    }

    public final void disable(@aa1 String r2) {
        Intrinsics.X0O(r2, "id");
        Integer r3 = this.BIT_MASKS.get(r2);
        if (r3 == null) goto L6;
        int r4 = r3.intValue();
        int r0 = this.mNotificationBits;
        this.mNotificationBits = (~r4) & r0;
        return;
    }

    public final void enable(@aa1 String r2) {
        Intrinsics.X0O(r2, "id");
        Integer r3 = this.BIT_MASKS.get(r2);
        if (r3 == null) goto L6;
        this.mNotificationBits = r3.intValue() | this.mNotificationBits;
        return;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mNotificationBits, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public final int getMNotificationBits() {
        return this.mNotificationBits;
    }

    public final boolean isEnabled(@aa1 String r3) {
        Intrinsics.X0O(r3, "id");
        Integer r4 = this.BIT_MASKS.get(r3);
        if (r4 != null) goto L5;
    L8:
        return false;
    L5:
        if ((r4.intValue() & this.mNotificationBits) <= 0) goto L8;
        return true;
    }

    public final void setMNotificationBits(int r1) {
        this.mNotificationBits = r1;
    }

    @aa1
    public String toString() {
        return "BleNotificationSettings(mNotificationBits=" + Integer.toBinaryString(this.mNotificationBits) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public final void toggle(@aa1 String r2) {
        Intrinsics.X0O(r2, "id");
        Integer r3 = this.BIT_MASKS.get(r2);
        if (r3 == null) goto L6;
        this.mNotificationBits = r3.intValue() ^ this.mNotificationBits;
        return;
    }
}
