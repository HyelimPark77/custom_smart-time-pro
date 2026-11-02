package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleEarphoneAncSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleEarphoneAncSettings.kt\ncom/szabh/smable3/entity/BleEarphoneAncSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,98:1\n232#2,3:99\n222#2,15:102\n*S KotlinDebug\n*F\n+ 1 BleEarphoneAncSettings.kt\ncom/szabh/smable3/entity/BleEarphoneAncSettings\n*L\n83#1:99,3\n83#1:102,15\n*E\n"})
public final class BleEarphoneAncSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 26;
    public static final int MODE_CLOSE = 0;
    public static final int MODE_DENOISE = 1;
    public static final int MODE_TRANSPARENT = 2;

    @aa1
    private List<BleAncMode> mAncModeList;
    private int mMode;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleEarphoneAncSettings() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleEarphoneAncSettings copy$default(BleEarphoneAncSettings r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mMode;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mAncModeList;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mMode;
    }

    @aa1
    public final List<BleAncMode> component2() {
        return this.mAncModeList;
    }

    @aa1
    public final BleEarphoneAncSettings copy(int r2, @aa1 List<BleAncMode> r3) {
        Intrinsics.X0O(r3, "mAncModeList");
        return new BleEarphoneAncSettings(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMode = readInt8();
        readInt8();
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= 3) goto L6;
        BleReadable r2 = (BleReadable) BleAncMode.class.newInstance();
        r2.setMBytes(readBytes(8));
        r2.decode();
        Intrinsics.XXI(r2);
        r0.add(r2);
        r1 = r1 + 1;
        goto L4
    L6:
        this.mAncModeList = r0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(0);
        writeList(this.mAncModeList);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleEarphoneAncSettings) == true) goto L8;
        return false;
    L8:
        BleEarphoneAncSettings r6 = (BleEarphoneAncSettings) r5;
        if (this.mMode == r6.mMode) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mAncModeList, r6.mAncModeList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final List<BleAncMode> getMAncModeList() {
        return this.mAncModeList;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 26;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mMode) * 31) + this.mAncModeList.hashCode();
    }

    public final void setMAncModeList(@aa1 List<BleAncMode> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAncModeList = r2;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    @aa1
    public String toString() {
        return "BleEarphoneAncSettings(mMode=" + this.mMode + ", mAncModeList=" + this.mAncModeList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEarphoneAncSettings(int r2, @aa1 List<BleAncMode> r3) {
        Intrinsics.X0O(r3, "mAncModeList");
        this.mMode = r2;
        this.mAncModeList = r3;
    }

    public /* synthetic */ BleEarphoneAncSettings(int r3, List r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r4 = CollectionsKt__CollectionsKt.Ii1iii0(new BleAncMode[]{new BleAncMode(0, 0, 0, 0), new BleAncMode(16384, 16384, 8000, 8000), new BleAncMode(16384, 16384, 8000, 8000)});
    L8:
        this(r3, r4);
    }
}
