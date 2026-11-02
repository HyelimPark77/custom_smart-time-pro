package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class BleNotification extends BleWritable {

    @aa1
    public static final String ALIBABA_RIMET = "com.alibaba.android.rimet";

    @aa1
    public static final String ALIPAY = "com.alipay.iphoneclient";

    @aa1
    public static final String ANDROID_EMAIL = "com.android.email";

    @aa1
    public static final String ANDROID_INCALLUI = "com.android.incallui";

    @aa1
    public static final String ANDROID_MMS = "com.android.mms";

    @aa1
    public static final String ANDROID_MMS_SERVICE = "com.android.mms.service";

    @aa1
    public static final String ANDROID_TELECOM = "com.android.server.telecom";

    @aa1
    public static final String AVITO = "ru.avito.android";

    @aa1
    public static final String BAND = "com.nhn.android.band";

    @aa1
    public static final String BETWEEN = "kr.co.vcnc.android.couple";

    @aa1
    public static final String CAFE = "net.daum.android.cafe";
    public static final int CATEGORY_INCOMING_CALL = 1;
    public static final int CATEGORY_INCOMING_CALL_NICKNAME = 12;
    public static final int CATEGORY_MESSAGE = 127;
    public static final int CONTENT_MAX_LENGTH = 250;

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String DISCORD = "com.discord";

    @aa1
    public static final String FACEBOOK = "com.facebook.katana";

    @aa1
    public static final String FACEBOOK_LITE = "com.facebook.lite";

    @aa1
    public static final String FACEBOOK_MESSENGER = "com.facebook.orca";

    @aa1
    public static final String FACEBOOK_MESSENGER_LITE = "com.facebook.mlite";

    @aa1
    public static final String GIF_MAKER = "com.smile.gifmaker";

    @aa1
    public static final String GMAIL = "com.google.android.gm";

    @aa1
    public static final String GOLD = "goldapple.ru.goldapple.customers";

    @aa1
    public static final String GOOGLE_CHROME = "com.android.chrome";

    @aa1
    public static final String GOOGLE_DUO = "com.google.android.apps.tachyon";

    @aa1
    public static final String GOOGLE_MMS = "com.google.android.apps.messaging";

    @aa1
    public static final String GOOGLE_TELECOM = "com.google.android.dialer";

    @aa1
    public static final String GOSUSLUGI = "ru.rostel";

    @aa1
    public static final String HEROMTS = "com.kiwoom.heromts";

    @aa1
    public static final String HONOR_OF_KING = "com.tencent.smoba";

    @aa1
    public static final String HONOR_OF_KING_IN = "com.levelinfinite.sgameGlobal";

    @aa1
    public static final String HUAWEI_SYSTEM_MANAGER = "com.huawei.systemmanager";

    @aa1
    public static final String INSTAGRAM = "com.instagram.android";

    @aa1
    public static final String KAKAO_TALK = "com.kakao.talk";

    @aa1
    public static final String LINE = "jp.naver.line.android";

    @aa1
    public static final String LINKED_IN = "com.linkedin.android";

    @aa1
    public static final String MAX = "ru.beru.android";

    @aa1
    public static final String MEITUAN = "com.sankuai.meituan";

    @aa1
    public static final String MEITUAN_TAKEOUTNEW = "com.sankuai.meituan.takeoutnew";

    @aa1
    public static final String MEI_TUAN = "com.sankuai.meituan";

    @aa1
    public static final String NAVERCAFE = "com.nhn.android.navercafe";

    @aa1
    public static final String NETFLIX = "com.netflix.mediaclient";

    @aa1
    public static final String ONEME_Q = "ru.oneme.app";

    @aa1
    public static final String ONE_PLUS_MMS = "com.oneplus.mms";

    @aa1
    public static final String ONE_PLUS_TELECOM = "com.oneplus.dialer";

    @aa1
    public static final String OUT_LOOK = "com.microsoft.office.outlook";

    @aa1
    public static final String OUT_LOOK2 = "park.outlook.sign.in.client";

    @aa1
    public static final String OZON = "ru.ozon.app.android";
    public static final int PACKAGE_LENGTH = 32;

    @aa1
    public static final String PACKAGE_MISSED_CALL = "com.android.mobilephone";

    @aa1
    public static final String PACKAGE_SMS = "com.android.mms";
    public static final int PHONE_LENGTH = 32;

    @aa1
    public static final String QQ = "com.tencent.mobileqq";

    @aa1
    public static final String SAMSUNG_INCALLUI = "com.samsung.android.incallui";

    @aa1
    public static final String SAMSUNG_MMS = "com.samsung.android.messaging";

    @aa1
    public static final String SAMSUNG_TELECOM = "com.samsung.android.dialer";

    @aa1
    public static final String SBERBANK = "ru.sberbank.mobile";

    @aa1
    public static final String SEARCH = "com.nhn.android.search";

    @aa1
    public static final String SECURESMS = "org.thoughtcrime.securesms";

    @aa1
    public static final String SINA_WEIBO = "com.sina.weibo";

    @aa1
    public static final String SKYPE = "com.skype.raider";

    @aa1
    public static final String SNAPCHAT = "com.snapchat.android";

    @aa1
    public static final String TELEGRAM = "org.telegram.messenger";

    @aa1
    public static final String TIKTOK = "com.zhiliaoapp.musically";
    public static final int TITLE_LENGTH = 32;

    @aa1
    public static final String TOWNEERS = "com.towneers.www";

    @aa1
    public static final String TRILL = "com.ss.android.ugc.trill";

    @aa1
    public static final String TWITTER = "com.twitter.android";

    @aa1
    public static final String UC = "Uxpp.UC";

    @aa1
    public static final String VIBER = "com.viber.voip";

    @aa1
    public static final String VK = "com.vkontakte.android";

    @aa1
    public static final String WE_CHAT = "com.tencent.mm";

    @aa1
    public static final String WHATS_APP = "com.whatsapp";

    @aa1
    public static final String WILDBERRIES = "com.wildberries.ru";

    @aa1
    public static final String YAHOO_MAIL = "com.yahoo.mobile.client.android.mail";

    @aa1
    public static final String YANDEX_GO = "ru.yandex.taxi";

    @aa1
    public static final String YANDEX_MAPS = "ru.yandex.yandexmaps";

    @aa1
    public static final String YOUTUBE = "com.google.android.youtube";

    @aa1
    public static final String ZALO = "com.zing.zalo";

    @aa1
    private static final List<String> sEmailPackages = null;
    private int mCategory;

    @aa1
    private String mContent;

    @aa1
    private String mPackage;
    private long mTime;

    @aa1
    private String mTitle;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public final boolean isEmail(@aa1 String r5) {
            Intrinsics.X0O(r5, "packageName");
            if (StringsKt__StringsKt.iIi011O(r5, "mail", false, 2, null) == false) goto L5;
            return true;
        L5:
            if (BleNotification.access$getSEmailPackages$cp().contains(r5) == true) goto L10;
            return false;
        L10:
            return true;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        sEmailPackages = CollectionsKt__CollectionsKt.iXiX011(new String[]{GMAIL, OUT_LOOK, OUT_LOOK2});
    }

    public BleNotification() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r4, r5, r6, 31, null);
    }

    public static final /* synthetic */ List access$getSEmailPackages$cp() {
        return sEmailPackages;
    }

    public static /* synthetic */ BleNotification copy$default(BleNotification r0, int r1, long r2, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mCategory;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = r0.mPackage;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.mTitle;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.mContent;
    L17:
        String r9 = r6;
        String r10 = r4;
        long r11 = r2;
        int r3 = r1;
        return r0.copy(r3, r11, r10, r5, r9);
    }

    public final int component1() {
        return this.mCategory;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mPackage;
    }

    @aa1
    public final String component4() {
        return this.mTitle;
    }

    @aa1
    public final String component5() {
        return this.mContent;
    }

    @aa1
    public final BleNotification copy(int r9, long r10, @aa1 String r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r12, "mPackage");
        Intrinsics.X0O(r13, "mTitle");
        Intrinsics.X0O(r14, "mContent");
        return new BleNotification(r9, r10, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCategory);
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        BleWritable.writeStringWithFix$default(this, this.mPackage, 32, null, 4, null);
        BleWritable.writeStringWithMax$default(this, this.mTitle, 32, null, 4, null);
        BleWritable.writeStringWithLimit$default(this, this.mContent, 250, null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleNotification) == true) goto L8;
        return false;
    L8:
        BleNotification r9 = (BleNotification) r8;
        if (this.mCategory == r9.mCategory) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mPackage, r9.mPackage) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTitle, r9.mTitle) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMCategory() {
        return this.mCategory;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 250) + 71;
    }

    @aa1
    public final String getMPackage() {
        return this.mPackage;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mCategory) * 31) + Long.hashCode(this.mTime)) * 31) + this.mPackage.hashCode()) * 31) + this.mTitle.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMCategory(int r1) {
        this.mCategory = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMPackage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPackage = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleNotification(mCategory=");
        r0.append(this.mCategory);
        r0.append(", mTime=");
        r0.append(this.mTime);
        r0.append(", mPackage='");
        r0.append(this.mPackage);
        r0.append("', mTitle='");
        r0.append(this.mTitle);
        r0.append("', mLength=");
        byte[] r1 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        r0.append(Math.min(r1.length, 250));
        r0.append(", mContent='");
        r0.append(this.mContent);
        r0.append("')");
        return r0.toString();
    }

    public BleNotification(int r2, long r3, @aa1 String r5, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r5, "mPackage");
        Intrinsics.X0O(r6, "mTitle");
        Intrinsics.X0O(r7, "mContent");
        this.mCategory = r2;
        this.mTime = r3;
        this.mPackage = r5;
        this.mTitle = r6;
        this.mContent = r7;
    }

    public /* synthetic */ BleNotification(int r2, long r3, String r5, String r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        String r10 = "";
    L19:
        this(r2, r3, r5, r6, r10);
        return;
    L18:
        r10 = r7;
        goto L19
    }
}
