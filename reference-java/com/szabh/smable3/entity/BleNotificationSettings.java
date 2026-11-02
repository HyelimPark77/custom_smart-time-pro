package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Map;
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
    public static final Companion Companion = new Companion(null);

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

    /* JADX INFO: renamed from: QQ */
    @aa1
    public static final String f55346QQ = "mqq";

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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleNotificationSettings() {
        Map<String, Integer> mapX11I = OXO1.X11I(TuplesKt.OXO1("mirror_phone", 1), TuplesKt.OXO1("tel", 2), TuplesKt.OXO1("sms", 4), TuplesKt.OXO1("mailto", 8), TuplesKt.OXO1("skype", 16), TuplesKt.OXO1("fbauth2", 32), TuplesKt.OXO1("whatsapp", 64), TuplesKt.OXO1("line", 128), TuplesKt.OXO1("instagram", 256), TuplesKt.OXO1("kakaolink", 512), TuplesKt.OXO1("googlegmail", 1024), TuplesKt.OXO1("twitter", 2048), TuplesKt.OXO1("linkedin", 4096), TuplesKt.OXO1("sinaweibo", 8192), TuplesKt.OXO1("mqq", 16384), TuplesKt.OXO1("wechat", 32768), TuplesKt.OXO1("bandapp", 65536), TuplesKt.OXO1("telegram", 131072), TuplesKt.OXO1("between", 262144), TuplesKt.OXO1("navercafe", 524288), TuplesKt.OXO1("youtube", 1048576), TuplesKt.OXO1("nflx", 2097152));
        this.BIT_MASKS = mapX11I;
        for (String str : mapX11I.keySet()) {
            if (!Intrinsics.XOO0ii0(str, "tel")) {
                enable(str);
            }
        }
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mNotificationBits = BleReadable.readInt32$default(this, null, 1, null);
    }

    public final void disable(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        Integer num = this.BIT_MASKS.get(id);
        if (num != null) {
            int iIntValue = num.intValue();
            this.mNotificationBits = (~iIntValue) & this.mNotificationBits;
        }
    }

    public final void enable(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        Integer num = this.BIT_MASKS.get(id);
        if (num != null) {
            this.mNotificationBits = num.intValue() | this.mNotificationBits;
        }
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

    public final boolean isEnabled(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        Integer num = this.BIT_MASKS.get(id);
        return num != null && (num.intValue() & this.mNotificationBits) > 0;
    }

    public final void setMNotificationBits(int i) {
        this.mNotificationBits = i;
    }

    @aa1
    public String toString() {
        return "BleNotificationSettings(mNotificationBits=" + Integer.toBinaryString(this.mNotificationBits) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public final void toggle(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        Integer num = this.BIT_MASKS.get(id);
        if (num != null) {
            this.mNotificationBits = num.intValue() ^ this.mNotificationBits;
        }
    }
}
