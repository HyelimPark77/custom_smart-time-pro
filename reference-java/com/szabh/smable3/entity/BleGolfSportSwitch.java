package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfSportSwitch extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 12;

    @aa1
    private String mGolfCourseId = "";
    private int mHoleId;
    private int mSportSwitch;
    private int mStartDownload;

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
        this.mSportSwitch = readInt8();
        this.mHoleId = readInt8();
        this.mStartDownload = readInt8();
        readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mSportSwitch);
        writeInt8(this.mHoleId);
        writeInt8(this.mStartDownload);
        writeInt8(0);
        BleWritable.writeStringWithFix$default(this, this.mGolfCourseId, 8, null, 4, null);
    }

    @aa1
    public final String getMGolfCourseId() {
        return this.mGolfCourseId;
    }

    public final int getMHoleId() {
        return this.mHoleId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 12;
    }

    public final int getMSportSwitch() {
        return this.mSportSwitch;
    }

    public final int getMStartDownload() {
        return this.mStartDownload;
    }

    public final void setMGolfCourseId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mGolfCourseId = str;
    }

    public final void setMHoleId(int i) {
        this.mHoleId = i;
    }

    public final void setMSportSwitch(int i) {
        this.mSportSwitch = i;
    }

    public final void setMStartDownload(int i) {
        this.mStartDownload = i;
    }

    @aa1
    public String toString() {
        return "BleGolfSportSwitch(mSportSwitch=" + this.mSportSwitch + ", mHoleId=" + this.mHoleId + ", mStartDownload=" + this.mStartDownload + " mGolfCourseId=" + this.mGolfCourseId + HexStringBuilder.COMMENT_END_CHAR;
    }
}
