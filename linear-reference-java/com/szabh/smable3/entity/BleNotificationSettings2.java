package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.IXXOi1X0;
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
public final class BleNotificationSettings2 extends BleWritable {

    @aa1
    public static final String AMAZON = "com.amazon.mobile.shopping";

    @aa1
    public static final String BAND = "bandapp";

    @aa1
    public static final String BETWEEN = "between";

    @aa1
    public static final String CALL = "tel";

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String Daangn_Market = "Daangn_Market";

    @aa1
    public static final String Daum_Cafe = "Daum_Cafe";

    @aa1
    public static final String DingDing = "钉钉";

    @aa1
    public static final String Discord = "discord";

    @aa1
    public static final String EMAIL = "mailto";

    @aa1
    public static final String FACEBOOK_MESSENGER = "fbauth2";

    @aa1
    public static final String GMAIL = "googlegmail";

    @aa1
    public static final String GOOGLE_MAPS = "GOOGLE_MAPS";

    @aa1
    public static final String IMO = "IMO";

    @aa1
    public static final String INSTAGRAM = "instagram";
    public static final int ITEM_LENGTH = 8;

    @aa1
    public static final String KAKAO_TALK = "kakaolink";

    @aa1
    public static final String Kiwoom_Securities = "Kiwoom_Securities";

    @aa1
    public static final String LINE = "line";

    @aa1
    public static final String LINKED_IN = "linkedin";

    @aa1
    public static final String LYFT = "co.uk.weinstant.instant";

    @aa1
    public static final String MIRROR = "mirror";

    @aa1
    public static final String MIRROR_PHONE = "mirror_phone";

    @aa1
    public static final String MeiTuan = "美团";

    @aa1
    public static final String NAVERCAFE = "navercafe";

    @aa1
    public static final String NAVER_APP = "NAVER_APP";

    @aa1
    public static final String NETFLIX = "nflx";

    @aa1
    public static final String Nate_On = "Nate_On";

    @aa1
    public static final String Naver_Band = "Naver_Band";

    @aa1
    public static final String Naver_Cafe = "Naver_Cafe";

    @aa1
    public static final String Ozon = "Ozon";

    @aa1
    public static final String PERMITTED = "permitted";

    @aa1
    public static final String Pinterest = "Pinterest";

    @aa1
    public static final String QQ = "mqq";

    @aa1
    public static final String SINA_WEIBO = "sinaweibo";

    @aa1
    public static final String SKYPE = "skype";

    @aa1
    public static final String SLACK = "SLACK";

    @aa1
    public static final String SMS = "sms";

    @aa1
    public static final String SNAPCHAT = "snapchat";

    @aa1
    public static final String Signal = "Signal";

    @aa1
    public static final String TELEGRAM = "telegram";

    @aa1
    public static final String TWITTER = "twitter";

    @aa1
    public static final String TikTok_KOR = "TikTok_KOR";

    @aa1
    public static final String Tik_Tok = "awemesso";

    @aa1
    public static final String TumBlr = "TumBlr";

    @aa1
    public static final String UBER = "uberx";

    @aa1
    public static final String VKontakte = "VKontakte";

    @aa1
    public static final String Vieber = "Vieber";

    @aa1
    public static final String WE_CHAT = "wechat";

    @aa1
    public static final String WHATS_APP = "whatsapp";

    @aa1
    public static final String Wildberries = "Wildberries";

    @aa1
    public static final String YOUTUBE = "youtube";

    @aa1
    public static final String YandexGo = "yandex Go";

    @aa1
    public static final String YandexMap = "yandexmaps";

    @aa1
    public static final String Zalo = "Zalo";

    @aa1
    private final Map<String, Long> BIT_MASKS;
    private long mNotificationBits;

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

    public BleNotificationSettings2() {
        Map<String, Long> r1 = OXO1.X11I(new Pair[]{TuplesKt.OXO1("mirror_phone", 1L), TuplesKt.OXO1("tel", 2L), TuplesKt.OXO1("sms", 4L), TuplesKt.OXO1("mailto", 8L), TuplesKt.OXO1("skype", 16L), TuplesKt.OXO1("fbauth2", 32L), TuplesKt.OXO1("whatsapp", 64L), TuplesKt.OXO1("line", 128L), TuplesKt.OXO1("instagram", 256L), TuplesKt.OXO1("kakaolink", 512L), TuplesKt.OXO1("googlegmail", 1024L), TuplesKt.OXO1("twitter", 2048L), TuplesKt.OXO1("linkedin", 4096L), TuplesKt.OXO1("sinaweibo", 8192L), TuplesKt.OXO1("mqq", 16384L), TuplesKt.OXO1("wechat", 32768L), TuplesKt.OXO1("bandapp", 65536L), TuplesKt.OXO1("telegram", 131072L), TuplesKt.OXO1("between", 262144L), TuplesKt.OXO1("navercafe", 524288L), TuplesKt.OXO1("youtube", 1048576L), TuplesKt.OXO1("nflx", 2097152L), TuplesKt.OXO1(Tik_Tok, 4194304L), TuplesKt.OXO1(SNAPCHAT, Long.valueOf(IXXOi1X0.OII)), TuplesKt.OXO1("com.amazon.mobile.shopping", Long.valueOf(IXXOi1X0.OX)), TuplesKt.OXO1(UBER, Long.valueOf(IXXOi1X0.I1)), TuplesKt.OXO1(LYFT, Long.valueOf(IXXOi1X0.iOOX010X)), TuplesKt.OXO1(GOOGLE_MAPS, Long.valueOf(IXXOi1X0.X01IiOiIi)), TuplesKt.OXO1(SLACK, 268435456L), TuplesKt.OXO1(Discord, Long.valueOf(IXXOi1X0.i010I)), TuplesKt.OXO1(TumBlr, 1073741824L), TuplesKt.OXO1(Pinterest, Long.valueOf(IXXOi1X0.IXXOO)), TuplesKt.OXO1(Zalo, 1L), TuplesKt.OXO1(IMO, 2L), TuplesKt.OXO1(VKontakte, 4L), TuplesKt.OXO1(TikTok_KOR, 8L), TuplesKt.OXO1(Naver_Band, 16L), TuplesKt.OXO1(NAVER_APP, 32L), TuplesKt.OXO1(Naver_Cafe, 64L), TuplesKt.OXO1(Signal, 128L), TuplesKt.OXO1(Nate_On, 256L), TuplesKt.OXO1(Daangn_Market, 512L), TuplesKt.OXO1(Kiwoom_Securities, 1024L), TuplesKt.OXO1(Daum_Cafe, 2048L), TuplesKt.OXO1(Vieber, 4096L), TuplesKt.OXO1(MeiTuan, 8192L), TuplesKt.OXO1(DingDing, 16384L), TuplesKt.OXO1(YandexMap, 32768L), TuplesKt.OXO1(YandexGo, 65536L), TuplesKt.OXO1(Wildberries, 131072L), TuplesKt.OXO1(Ozon, 262144L), TuplesKt.OXO1(PERMITTED, 4611686018427387904L), TuplesKt.OXO1(MIRROR, Long.MIN_VALUE)});
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
        this.mNotificationBits = BleReadable.readInt64$default(this, null, 1, null);
    }

    public final void disable(@aa1 String r5) {
        Intrinsics.X0O(r5, "id");
        Long r6 = this.BIT_MASKS.get(r5);
        if (r6 == null) goto L6;
        long r0 = r6.longValue();
        long r2 = this.mNotificationBits;
        this.mNotificationBits = (~r0) & r2;
        return;
    }

    public final void enable(@aa1 String r5) {
        Intrinsics.X0O(r5, "id");
        Long r6 = this.BIT_MASKS.get(r5);
        if (r6 == null) goto L6;
        this.mNotificationBits = r6.longValue() | this.mNotificationBits;
        return;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeLong$default(this, this.mNotificationBits, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final long getMNotificationBits() {
        return this.mNotificationBits;
    }

    public final boolean isEnabled(@aa1 String r6) {
        Intrinsics.X0O(r6, "id");
        Long r7 = this.BIT_MASKS.get(r6);
        if (r7 != null) goto L5;
    L8:
        return false;
    L5:
        if ((r7.longValue() & this.mNotificationBits) <= 0) goto L8;
        return true;
    }

    public final void setMNotificationBits(long r1) {
        this.mNotificationBits = r1;
    }

    @aa1
    public String toString() {
        return "BleNotificationSettings2(mNotificationBits=" + Long.toBinaryString(this.mNotificationBits) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public final void toggle(@aa1 String r5) {
        Intrinsics.X0O(r5, "id");
        Long r6 = this.BIT_MASKS.get(r5);
        if (r6 == null) goto L6;
        this.mNotificationBits = r6.longValue() ^ this.mNotificationBits;
        return;
    }
}
