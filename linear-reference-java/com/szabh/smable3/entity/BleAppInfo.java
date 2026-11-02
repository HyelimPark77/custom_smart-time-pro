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
    public static final Companion Companion = null;

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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleAppInfo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleAppInfo copy$default(BleAppInfo r0, String r1, String r2, String r3, int r4, int r5, int r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mPackage;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mVersion;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mName;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mSize;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mHide;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mIsGame;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mApiVersion;
    L23:
        int r10 = r6;
        String r11 = r7;
        int r12 = r4;
        int r13 = r5;
        String r14 = r3;
        String r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
    public final BleAppInfo copy(@aa1 String r10, @aa1 String r11, @aa1 String r12, int r13, int r14, int r15, @aa1 String r16) {
        Intrinsics.X0O(r10, "mPackage");
        Intrinsics.X0O(r11, "mVersion");
        Intrinsics.X0O(r12, "mName");
        Intrinsics.X0O(r16, "mApiVersion");
        return new BleAppInfo(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mPackage = BleReadable.readString$default(this, 24, null, 2, null);
        BleReadable r3 = (BleReadable) BleAppVersion.class.newInstance();
        r3.setMBytes(readBytes(4));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mVersion = ((BleAppVersion) r3).getMVersion();
        this.mName = BleReadable.readString$default(this, 32, null, 2, null);
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mSize = readInt32(r1);
        this.mHide = readInt8();
        this.mIsGame = readInt8();
        BleReadable r0 = (BleReadable) BleAppVersion.class.newInstance();
        r0.setMBytes(readBytes(4));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mApiVersion = ((BleAppVersion) r0).getMVersion();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppInfo) == true) goto L8;
        return false;
    L8:
        BleAppInfo r6 = (BleAppInfo) r5;
        if (Intrinsics.XOO0ii0(this.mPackage, r6.mPackage) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mVersion, r6.mVersion) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L18;
        return false;
    L18:
        if (this.mSize == r6.mSize) goto L21;
        return false;
    L21:
        if (this.mHide == r6.mHide) goto L24;
        return false;
    L24:
        if (this.mIsGame == r6.mIsGame) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mApiVersion, r6.mApiVersion) == true) goto L29;
        return false;
    L29:
        return true;
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

    public final void setMApiVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mApiVersion = r2;
    }

    public final void setMHide(int r1) {
        this.mHide = r1;
    }

    public final void setMIsGame(int r1) {
        this.mIsGame = r1;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMPackage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPackage = r2;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    public final void setMVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mVersion = r2;
    }

    @aa1
    public String toString() {
        return "BleAppInfo(mPackage=" + this.mPackage + ", mVersion=" + this.mVersion + ", mName=" + this.mName + ", mSize=" + this.mSize + ", mHide=" + this.mHide + ", mApiVersion=" + this.mApiVersion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, int r5, int r6, int r7, @aa1 String r8) {
        Intrinsics.X0O(r2, "mPackage");
        Intrinsics.X0O(r3, "mVersion");
        Intrinsics.X0O(r4, "mName");
        Intrinsics.X0O(r8, "mApiVersion");
        this.mPackage = r2;
        this.mVersion = r3;
        this.mName = r4;
        this.mSize = r5;
        this.mHide = r6;
        this.mIsGame = r7;
        this.mApiVersion = r8;
    }

    public /* synthetic */ BleAppInfo(String r3, String r4, String r5, int r6, int r7, int r8, String r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        String r12 = "";
    L23:
        int r13 = r8;
        int r14 = r7;
        int r15 = r6;
        String r16 = r5;
        this(r3, r4, r16, r15, r14, r13, r12);
        return;
    L24:
        r12 = r9;
        goto L23
    }
}
