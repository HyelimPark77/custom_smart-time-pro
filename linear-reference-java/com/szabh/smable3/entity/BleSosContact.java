package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleSosContact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSosContact.kt\ncom/szabh/smable3/entity/BleSosContact\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,80:1\n232#2,3:81\n222#2,15:84\n*S KotlinDebug\n*F\n+ 1 BleSosContact.kt\ncom/szabh/smable3/entity/BleSosContact\n*L\n70#1:81,3\n70#1:84,15\n*E\n"})
public final class BleSosContact extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 232;
    private int mEnabled;

    @aa1
    private List<BleSosItem> mList;

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
    public BleSosContact() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleSosContact copy$default(BleSosContact r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mList;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final List<BleSosItem> component2() {
        return this.mList;
    }

    @aa1
    public final BleSosContact copy(int r2, @aa1 List<BleSosItem> r3) {
        Intrinsics.X0O(r3, "mList");
        return new BleSosContact(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readInt8();
        readInt8();
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= 5) goto L6;
        BleReadable r2 = (BleReadable) BleSosItem.class.newInstance();
        r2.setMBytes(readBytes(46));
        r2.decode();
        Intrinsics.XXI(r2);
        r0.add(r2);
        r1 = r1 + 1;
        goto L4
    L6:
        this.mList = r0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(0);
        writeList(this.mList);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSosContact) == true) goto L8;
        return false;
    L8:
        BleSosContact r6 = (BleSosContact) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mList, r6.mList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 232;
    }

    @aa1
    public final List<BleSosItem> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mEnabled) * 31) + this.mList.hashCode();
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMList(@aa1 List<BleSosItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleSosContact(mEnabled=" + this.mEnabled + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSosContact(int r2, @aa1 List<BleSosItem> r3) {
        Intrinsics.X0O(r3, "mList");
        this.mEnabled = r2;
        this.mList = r3;
    }

    public /* synthetic */ BleSosContact(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
