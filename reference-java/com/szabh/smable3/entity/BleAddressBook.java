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
@SourceDebugExtension({"SMAP\nBleAddressBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAddressBook.kt\ncom/szabh/smable3/entity/BleAddressBook\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,65:1\n232#2,3:66\n222#2,15:69\n*S KotlinDebug\n*F\n+ 1 BleAddressBook.kt\ncom/szabh/smable3/entity/BleAddressBook\n*L\n58#1:66,3\n58#1:69,15\n*E\n"})
public final class BleAddressBook extends BleWritable {

    @aa1
    private List<BleContactPerson> mAddBook;

    /* JADX WARN: Multi-variable type inference failed */
    public BleAddressBook() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAddressBook copy$default(BleAddressBook bleAddressBook, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleAddressBook.mAddBook;
        }
        return bleAddressBook.copy(list);
    }

    @aa1
    public final List<BleContactPerson> component1() {
        return this.mAddBook;
    }

    @aa1
    public final BleAddressBook copy(@aa1 List<BleContactPerson> mAddBook) {
        Intrinsics.X0O(mAddBook, "mAddBook");
        return new BleAddressBook(mAddBook);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte[] mBytes = getMBytes();
        int length = mBytes != null ? mBytes.length / 40 : 0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            BleReadable bleReadable = (BleReadable) BleContactPerson.class.newInstance();
            bleReadable.setMBytes(readBytes(40));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            arrayList.add(bleReadable);
        }
        this.mAddBook = arrayList;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeList(this.mAddBook);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleAddressBook) && Intrinsics.XOO0ii0(this.mAddBook, ((BleAddressBook) obj).mAddBook);
    }

    @aa1
    public final List<BleContactPerson> getMAddBook() {
        return this.mAddBook;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mAddBook.size() * 40;
    }

    public int hashCode() {
        return this.mAddBook.hashCode();
    }

    public final void setMAddBook(@aa1 List<BleContactPerson> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAddBook = list;
    }

    @aa1
    public String toString() {
        return "BleAddressBook(mAddBook=" + this.mAddBook + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAddressBook(@aa1 List<BleContactPerson> mAddBook) {
        Intrinsics.X0O(mAddBook, "mAddBook");
        this.mAddBook = mAddBook;
    }

    public /* synthetic */ BleAddressBook(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
