package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.he5;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfWatchVersionInfo extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 18;

    @aa1
    private String mCourseId = "";
    private int mVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCourseId = BleReadable.readString$default(this, 16, null, 2, null);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mVersion = readInt16(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeStringWithFix(this.mCourseId, 16, Charsets.IiI10X);
        int i = this.mVersion;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
    }

    @aa1
    public final String getMCourseId() {
        return this.mCourseId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 18;
    }

    public final int getMVersion() {
        return this.mVersion;
    }

    public final void setMCourseId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCourseId = str;
    }

    public final void setMVersion(int i) {
        this.mVersion = i;
    }

    @aa1
    public String toString() {
        return he5.OiIIX101O("\n            BleGolfWatchVersionInfo(mCourseId=" + this.mCourseId + ",mVersion=" + this.mVersion + ")\n        ");
    }
}
