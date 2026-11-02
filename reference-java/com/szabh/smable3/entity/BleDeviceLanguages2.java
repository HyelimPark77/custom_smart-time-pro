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
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleDeviceLanguages2 copy$default(BleDeviceLanguages2 bleDeviceLanguages2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleDeviceLanguages2.mSize;
        }
        if ((i2 & 2) != 0) {
            list = bleDeviceLanguages2.mList;
        }
        return bleDeviceLanguages2.copy(i, list);
    }

    public static /* synthetic */ boolean isUpgrade$default(BleDeviceLanguages2 bleDeviceLanguages2, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return bleDeviceLanguages2.isUpgrade(str, i);
    }

    public final int component1() {
        return this.mSize;
    }

    @aa1
    public final List<BleDeviceLanguagesItem> component2() {
        return this.mList;
    }

    @aa1
    public final BleDeviceLanguages2 copy(int i, @aa1 List<BleDeviceLanguagesItem> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleDeviceLanguages2(i, mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        try {
            this.mSize = readInt8();
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            int length = (mBytes.length - 1) / 4;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                BleReadable bleReadable = (BleReadable) BleDeviceLanguagesItem.class.newInstance();
                bleReadable.setMBytes(readBytes(4));
                bleReadable.decode();
                Intrinsics.XXI(bleReadable);
                arrayList.add(bleReadable);
            }
            this.mList = arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceLanguages2)) {
            return false;
        }
        BleDeviceLanguages2 bleDeviceLanguages2 = (BleDeviceLanguages2) obj;
        return this.mSize == bleDeviceLanguages2.mSize && Intrinsics.XOO0ii0(this.mList, bleDeviceLanguages2.mList);
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

    public final boolean isUpgrade(@aa1 String serverVersion, int i) {
        Intrinsics.X0O(serverVersion, "serverVersion");
        if (this.mList.size() <= i) {
            return false;
        }
        List listI1I = StringsKt__StringsKt.i1I(this.mList.get(i).getMVersion(), new String[]{FileUtils.FILE_EXTENSION_SEPARATOR}, false, 0, 6, null);
        if (listI1I.size() < 2) {
            return false;
        }
        String str = (String) listI1I.get(listI1I.size() - 1);
        String str2 = (String) listI1I.get(listI1I.size() - 2);
        List listI1I2 = StringsKt__StringsKt.i1I(serverVersion, new String[]{FileUtils.FILE_EXTENSION_SEPARATOR}, false, 0, 6, null);
        if (listI1I2.size() < 2) {
            return false;
        }
        String str3 = (String) listI1I2.get(listI1I2.size() - 1);
        if (!TextUtils.equals(str2, (String) listI1I2.get(listI1I2.size() - 2))) {
            return false;
        }
        try {
            return Integer.parseInt(str3) > Integer.parseInt(str);
        } catch (Exception unused) {
        }
    }

    public final void setMList(@aa1 List<BleDeviceLanguagesItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    @aa1
    public String toString() {
        return "BleDeviceLanguages2(mSize=" + this.mSize + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceLanguages2(int i, @aa1 List<BleDeviceLanguagesItem> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mSize = i;
        this.mList = mList;
    }

    public /* synthetic */ BleDeviceLanguages2(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list);
    }
}
