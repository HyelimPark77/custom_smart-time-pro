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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 232;
    private int mEnabled;

    @aa1
    private List<BleSosItem> mList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleSosContact() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleSosContact copy$default(BleSosContact bleSosContact, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleSosContact.mEnabled;
        }
        if ((i2 & 2) != 0) {
            list = bleSosContact.mList;
        }
        return bleSosContact.copy(i, list);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final List<BleSosItem> component2() {
        return this.mList;
    }

    @aa1
    public final BleSosContact copy(int i, @aa1 List<BleSosItem> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleSosContact(i, mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readInt8();
        readInt8();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            BleReadable bleReadable = (BleReadable) BleSosItem.class.newInstance();
            bleReadable.setMBytes(readBytes(46));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            arrayList.add(bleReadable);
        }
        this.mList = arrayList;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(0);
        writeList(this.mList);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSosContact)) {
            return false;
        }
        BleSosContact bleSosContact = (BleSosContact) obj;
        return this.mEnabled == bleSosContact.mEnabled && Intrinsics.XOO0ii0(this.mList, bleSosContact.mList);
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

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMList(@aa1 List<BleSosItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    @aa1
    public String toString() {
        return "BleSosContact(mEnabled=" + this.mEnabled + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSosContact(int i, @aa1 List<BleSosItem> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mEnabled = i;
        this.mList = mList;
    }

    public /* synthetic */ BleSosContact(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
