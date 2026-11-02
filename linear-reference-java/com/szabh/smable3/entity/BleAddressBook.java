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
    public static /* synthetic */ BleAddressBook copy$default(BleAddressBook r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mAddBook;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<BleContactPerson> component1() {
        return this.mAddBook;
    }

    @aa1
    public final BleAddressBook copy(@aa1 List<BleContactPerson> r2) {
        Intrinsics.X0O(r2, "mAddBook");
        return new BleAddressBook(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte[] r0 = getMBytes();
        int r1 = 0;
        if (r0 == null) goto L5;
        int r2 = r0.length / 40;
    L6:
        ArrayList r3 = new ArrayList();
    L7:
        if (r1 >= r2) goto L9;
        BleReadable r4 = (BleReadable) BleContactPerson.class.newInstance();
        r4.setMBytes(readBytes(40));
        r4.decode();
        Intrinsics.XXI(r4);
        r3.add(r4);
        r1 = r1 + 1;
        goto L7
    L9:
        this.mAddBook = r3;
        return;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeList(this.mAddBook);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleAddressBook) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mAddBook, ((BleAddressBook) r4).mAddBook) == true) goto L11;
        return false;
    L11:
        return true;
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

    public final void setMAddBook(@aa1 List<BleContactPerson> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAddBook = r2;
    }

    @aa1
    public String toString() {
        return "BleAddressBook(mAddBook=" + this.mAddBook + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAddressBook(@aa1 List<BleContactPerson> r2) {
        Intrinsics.X0O(r2, "mAddBook");
        this.mAddBook = r2;
    }

    public /* synthetic */ BleAddressBook(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ArrayList();
    L5:
        this(r1);
    }
}
