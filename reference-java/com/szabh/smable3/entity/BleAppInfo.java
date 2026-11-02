package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAppStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAppStore.kt\ncom/szabh/smable3/entity/BleAppInfo\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,174:1\n222#2,4:175\n222#2,4:179\n*S KotlinDebug\n*F\n+ 1 BleAppStore.kt\ncom/szabh/smable3/entity/BleAppInfo\n*L\n67#1:175,4\n72#1:179,4\n*E\n"})
public final class BleAppInfo extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    public static final String PACKAGE_ALIPAY = "built-in.alipay";

    @aa1
    public static final String PACKAGE_CALCULATOR = "built-in.Calculator";

    @aa1
    public static final String PACKAGE_CARD_WALLET = "built-in.Card_Wallet";

    @aa1
    public static final String PACKAGE_GAME_2048 = "built-in.game_2048";

    @aa1
    public static final String PACKAGE_GAME_PLAN = "built-in.game_plan";

    @aa1
    public static final String PACKAGE_GAME_TTT = "built-in.game_ttt";

    @aa1
    public static final String PACKAGE_NAVIGATION = "built-in.navigation";

    @aa1
    public static final String PACKAGE_STOCK = "built-in.stock";

    @aa1
    public static final String PACKAGE_WORLD_CLOCK = "built-in.world_clock";

    @aa1
    private String mApiVersion;
    private int mHide;
    private int mIsGame;

    @aa1
    private String mName;

    @aa1
    private String mPackage;
    private int mSize;

    @aa1
    private String mVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleAppInfo() {
        this(null, null, null, 0, 0, 0, null, 127, null);
    }

    public static /* synthetic */ BleAppInfo copy$default(BleAppInfo bleAppInfo, String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bleAppInfo.mPackage;
        }
        if ((i4 & 2) != 0) {
            str2 = bleAppInfo.mVersion;
        }
        if ((i4 & 4) != 0) {
            str3 = bleAppInfo.mName;
        }
        if ((i4 & 8) != 0) {
            i = bleAppInfo.mSize;
        }
        if ((i4 & 16) != 0) {
            i2 = bleAppInfo.mHide;
        }
        if ((i4 & 32) != 0) {
            i3 = bleAppInfo.mIsGame;
        }
        if ((i4 & 64) != 0) {
            str4 = bleAppInfo.mApiVersion;
        }
        int i5 = i3;
        String str5 = str4;
        int i6 = i2;
        String str6 = str3;
        return bleAppInfo.copy(str, str2, str6, i, i6, i5, str5);
    }

    @aa1
    public final String component1() {
        return this.mPackage;
    }

    @aa1
    public final String component2() {
        return this.mVersion;
    }

    @aa1
    public final String component3() {
        return this.mName;
    }

    public final int component4() {
        return this.mSize;
    }

    public final int component5() {
        return this.mHide;
    }

    public final int component6() {
        return this.mIsGame;
    }

    @aa1
    public final String component7() {
        return this.mApiVersion;
    }

    @aa1
    public final BleAppInfo copy(@aa1 String mPackage, @aa1 String mVersion, @aa1 String mName, int i, int i2, int i3, @aa1 String mApiVersion) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mVersion, "mVersion");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mApiVersion, "mApiVersion");
        return new BleAppInfo(mPackage, mVersion, mName, i, i2, i3, mApiVersion);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mPackage = BleReadable.readString$default(this, 24, null, 2, null);
        BleReadable bleReadable = (BleReadable) BleAppVersion.class.newInstance();
        bleReadable.setMBytes(readBytes(4));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mVersion = ((BleAppVersion) bleReadable).getMVersion();
        this.mName = BleReadable.readString$default(this, 32, null, 2, null);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mSize = readInt32(LITTLE_ENDIAN);
        this.mHide = readInt8();
        this.mIsGame = readInt8();
        BleReadable bleReadable2 = (BleReadable) BleAppVersion.class.newInstance();
        bleReadable2.setMBytes(readBytes(4));
        bleReadable2.decode();
        Intrinsics.XXI(bleReadable2);
        this.mApiVersion = ((BleAppVersion) bleReadable2).getMVersion();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAppInfo)) {
            return false;
        }
        BleAppInfo bleAppInfo = (BleAppInfo) obj;
        return Intrinsics.XOO0ii0(this.mPackage, bleAppInfo.mPackage) && Intrinsics.XOO0ii0(this.mVersion, bleAppInfo.mVersion) && Intrinsics.XOO0ii0(this.mName, bleAppInfo.mName) && this.mSize == bleAppInfo.mSize && this.mHide == bleAppInfo.mHide && this.mIsGame == bleAppInfo.mIsGame && Intrinsics.XOO0ii0(this.mApiVersion, bleAppInfo.mApiVersion);
    }

    @aa1
    public final String getMApiVersion() {
        return this.mApiVersion;
    }

    public final int getMHide() {
        return this.mHide;
    }

    public final int getMIsGame() {
        return this.mIsGame;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    @aa1
    public final String getMPackage() {
        return this.mPackage;
    }

    public final int getMSize() {
        return this.mSize;
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return (((((((((((this.mPackage.hashCode() * 31) + this.mVersion.hashCode()) * 31) + this.mName.hashCode()) * 31) + Integer.hashCode(this.mSize)) * 31) + Integer.hashCode(this.mHide)) * 31) + Integer.hashCode(this.mIsGame)) * 31) + this.mApiVersion.hashCode();
    }

    public final void setMApiVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mApiVersion = str;
    }

    public final void setMHide(int i) {
        this.mHide = i;
    }

    public final void setMIsGame(int i) {
        this.mIsGame = i;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMPackage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPackage = str;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    public final void setMVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mVersion = str;
    }

    @aa1
    public String toString() {
        return "BleAppInfo(mPackage=" + this.mPackage + ", mVersion=" + this.mVersion + ", mName=" + this.mName + ", mSize=" + this.mSize + ", mHide=" + this.mHide + ", mApiVersion=" + this.mApiVersion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppInfo(@aa1 String mPackage, @aa1 String mVersion, @aa1 String mName, int i, int i2, int i3, @aa1 String mApiVersion) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mVersion, "mVersion");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mApiVersion, "mApiVersion");
        this.mPackage = mPackage;
        this.mVersion = mVersion;
        this.mName = mName;
        this.mSize = i;
        this.mHide = i2;
        this.mIsGame = i3;
        this.mApiVersion = mApiVersion;
    }

    public /* synthetic */ BleAppInfo(String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str4);
    }
}
