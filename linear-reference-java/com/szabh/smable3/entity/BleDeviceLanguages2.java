package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleDeviceLanguages2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleDeviceLanguages2.kt\ncom/szabh/smable3/entity/BleDeviceLanguages2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,87:1\n232#2,3:88\n222#2,15:91\n*S KotlinDebug\n*F\n+ 1 BleDeviceLanguages2.kt\ncom/szabh/smable3/entity/BleDeviceLanguages2\n*L\n19#1:88,3\n19#1:91,15\n*E\n"})
public final class BleDeviceLanguages2 extends BleReadable {

    @aa1
    private List<BleDeviceLanguagesItem> mList;
    private int mSize;

    /* JADX WARN: Multi-variable type inference failed */
    public BleDeviceLanguages2() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleDeviceLanguages2 copy$default(BleDeviceLanguages2 r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mSize;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mList;
    L9:
        return r0.copy(r1, r2);
    }

    public static /* synthetic */ boolean isUpgrade$default(BleDeviceLanguages2 r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        return r0.isUpgrade(r1, r2);
    }

    public final int component1() {
        return this.mSize;
    }

    @aa1
    public final List<BleDeviceLanguagesItem> component2() {
        return this.mList;
    }

    @aa1
    public final BleDeviceLanguages2 copy(int r2, @aa1 List<BleDeviceLanguagesItem> r3) {
        Intrinsics.X0O(r3, "mList");
        return new BleDeviceLanguages2(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mSize = readInt8();     // Catch: Exception -> L6
        byte[] r0 = getMBytes();     // Catch: Exception -> L6
        Intrinsics.XXI(r0);     // Catch: Exception -> L6
        int r1 = (r0.length - 1) / 4;     // Catch: Exception -> L6
        ArrayList r2 = new ArrayList();     // Catch: Exception -> L6
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L8;
        BleReadable r4 = (BleReadable) BleDeviceLanguagesItem.class.newInstance();     // Catch: Exception -> L6
        r4.setMBytes(readBytes(4));     // Catch: Exception -> L6
        r4.decode();     // Catch: Exception -> L6
        Intrinsics.XXI(r4);     // Catch: Exception -> L6
        r2.add(r4);     // Catch: Exception -> L6
        r3 = r3 + 1;     // Catch: Exception -> L6
        goto L4
    L8:
        this.mList = r2;     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceLanguages2) == true) goto L8;
        return false;
    L8:
        BleDeviceLanguages2 r6 = (BleDeviceLanguages2) r5;
        if (this.mSize == r6.mSize) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mList, r6.mList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final List<BleDeviceLanguagesItem> getMList() {
        return this.mList;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mSize) * 31) + this.mList.hashCode();
    }

    public final boolean isUpgrade(@aa1 String r12, int r13) {
        Intrinsics.X0O(r12, "serverVersion");
        if (this.mList.size() > r13) goto L5;
        return false;
    L5:
        List r0 = StringsKt__StringsKt.i1I(this.mList.get(r13).getMVersion(), new String[]{FileUtils.FILE_EXTENSION_SEPARATOR}, false, 0, 6, null);
        if (r0.size() >= 2) goto L8;
        return false;
    L8:
        String r2 = (String) r0.get(r0.size() - 1);
        String r1 = (String) r0.get(r0.size() - 2);
        List r14 = StringsKt__StringsKt.i1I(r12, new String[]{FileUtils.FILE_EXTENSION_SEPARATOR}, false, 0, 6, null);
        if (r14.size() >= 2) goto L11;
        return false;
    L11:
        String r15 = (String) r14.get(r14.size() - 1);
        if (TextUtils.equals(r1, (String) r14.get(r14.size() - 2)) == true) goto L19;
        return false;
    L19:
        if (Integer.parseInt(r15) <= Integer.parseInt(r2)) goto L17;
        return true;
    L17:
        return false;
    }

    public final void setMList(@aa1 List<BleDeviceLanguagesItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    @aa1
    public String toString() {
        return "BleDeviceLanguages2(mSize=" + this.mSize + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceLanguages2(int r2, @aa1 List<BleDeviceLanguagesItem> r3) {
        Intrinsics.X0O(r3, "mList");
        this.mSize = r2;
        this.mList = r3;
    }

    public /* synthetic */ BleDeviceLanguages2(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = CollectionsKt__CollectionsKt.iI();
    L8:
        this(r1, r2);
    }
}
