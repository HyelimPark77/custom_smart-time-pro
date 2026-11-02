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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 26;
    public static final int MODE_CLOSE = 0;
    public static final int MODE_DENOISE = 1;
    public static final int MODE_TRANSPARENT = 2;

    @aa1
    private List<BleAncMode> mAncModeList;
    private int mMode;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleEarphoneAncSettings() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleEarphoneAncSettings copy$default(BleEarphoneAncSettings bleEarphoneAncSettings, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleEarphoneAncSettings.mMode;
        }
        if ((i2 & 2) != 0) {
            list = bleEarphoneAncSettings.mAncModeList;
        }
        return bleEarphoneAncSettings.copy(i, list);
    }

    public final int component1() {
        return this.mMode;
    }

    @aa1
    public final List<BleAncMode> component2() {
        return this.mAncModeList;
    }

    @aa1
    public final BleEarphoneAncSettings copy(int i, @aa1 List<BleAncMode> mAncModeList) {
        Intrinsics.X0O(mAncModeList, "mAncModeList");
        return new BleEarphoneAncSettings(i, mAncModeList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMode = readInt8();
        readInt8();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            BleReadable bleReadable = (BleReadable) BleAncMode.class.newInstance();
            bleReadable.setMBytes(readBytes(8));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            arrayList.add(bleReadable);
        }
        this.mAncModeList = arrayList;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(0);
        writeList(this.mAncModeList);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEarphoneAncSettings)) {
            return false;
        }
        BleEarphoneAncSettings bleEarphoneAncSettings = (BleEarphoneAncSettings) obj;
        return this.mMode == bleEarphoneAncSettings.mMode && Intrinsics.XOO0ii0(this.mAncModeList, bleEarphoneAncSettings.mAncModeList);
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

    public final void setMAncModeList(@aa1 List<BleAncMode> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAncModeList = list;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    @aa1
    public String toString() {
        return "BleEarphoneAncSettings(mMode=" + this.mMode + ", mAncModeList=" + this.mAncModeList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEarphoneAncSettings(int i, @aa1 List<BleAncMode> mAncModeList) {
        Intrinsics.X0O(mAncModeList, "mAncModeList");
        this.mMode = i;
        this.mAncModeList = mAncModeList;
    }

    public /* synthetic */ BleEarphoneAncSettings(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.Ii1iii0(new BleAncMode(0, 0, 0, 0), new BleAncMode(16384, 16384, 8000, 8000), new BleAncMode(16384, 16384, 8000, 8000)) : list);
    }
}
