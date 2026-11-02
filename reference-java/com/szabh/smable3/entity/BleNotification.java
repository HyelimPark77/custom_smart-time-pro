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
    public static final String OZON = "ru.ozon.app.android";
    public static final int PACKAGE_LENGTH = 32;

    @aa1
    public static final String PACKAGE_MISSED_CALL = "com.android.mobilephone";

    @aa1
    public static final String PACKAGE_SMS = "com.android.mms";
    public static final int PHONE_LENGTH = 32;

    /* JADX INFO: renamed from: QQ */
    @aa1
    public static final String f55343QQ = "com.tencent.mobileqq";

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

    /* JADX INFO: renamed from: UC */
    @aa1
    public static final String f55344UC = "Uxpp.UC";

    @aa1
    public static final String VIBER = "com.viber.voip";

    /* JADX INFO: renamed from: VK */
    @aa1
    public static final String f55345VK = "com.vkontakte.android";

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
    private int mCategory;

    @aa1
    private String mContent;

    @aa1
    private String mPackage;
    private long mTime;

    @aa1
    private String mTitle;

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    public static final String GMAIL = "com.google.android.gm";

    @aa1
    public static final String OUT_LOOK = "com.microsoft.office.outlook";

    @aa1
    public static final String OUT_LOOK2 = "park.outlook.sign.in.client";

    @aa1
    private static final List<String> sEmailPackages = CollectionsKt__CollectionsKt.iXiX011(GMAIL, OUT_LOOK, OUT_LOOK2);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isEmail(@aa1 String packageName) {
            Intrinsics.X0O(packageName, "packageName");
            return StringsKt__StringsKt.iIi011O(packageName, "mail", false, 2, null) || BleNotification.sEmailPackages.contains(packageName);
        }

        private Companion() {
        }
    }

    public BleNotification() {
        this(0, 0L, null, null, null, 31, null);
    }

    public static /* synthetic */ BleNotification copy$default(BleNotification bleNotification, int i, long j, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleNotification.mCategory;
        }
        if ((i2 & 2) != 0) {
            j = bleNotification.mTime;
        }
        if ((i2 & 4) != 0) {
            str = bleNotification.mPackage;
        }
        if ((i2 & 8) != 0) {
            str2 = bleNotification.mTitle;
        }
        if ((i2 & 16) != 0) {
            str3 = bleNotification.mContent;
        }
        String str4 = str3;
        String str5 = str;
        return bleNotification.copy(i, j, str5, str2, str4);
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
    public final BleNotification copy(int i, long j, @aa1 String mPackage, @aa1 String mTitle, @aa1 String mContent) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        return new BleNotification(i, j, mPackage, mTitle, mContent);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleNotification)) {
            return false;
        }
        BleNotification bleNotification = (BleNotification) obj;
        return this.mCategory == bleNotification.mCategory && this.mTime == bleNotification.mTime && Intrinsics.XOO0ii0(this.mPackage, bleNotification.mPackage) && Intrinsics.XOO0ii0(this.mTitle, bleNotification.mTitle) && Intrinsics.XOO0ii0(this.mContent, bleNotification.mContent);
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
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return Math.min(bytes.length, 250) + 71;
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

    public final void setMCategory(int i) {
        this.mCategory = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMPackage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPackage = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitle = str;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleNotification(mCategory=");
        sb.append(this.mCategory);
        sb.append(", mTime=");
        sb.append(this.mTime);
        sb.append(", mPackage='");
        sb.append(this.mPackage);
        sb.append("', mTitle='");
        sb.append(this.mTitle);
        sb.append("', mLength=");
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        sb.append(Math.min(bytes.length, 250));
        sb.append(", mContent='");
        sb.append(this.mContent);
        sb.append("')");
        return sb.toString();
    }

    public BleNotification(int i, long j, @aa1 String mPackage, @aa1 String mTitle, @aa1 String mContent) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        this.mCategory = i;
        this.mTime = j;
        this.mPackage = mPackage;
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public /* synthetic */ BleNotification(int i, long j, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3);
    }
}
