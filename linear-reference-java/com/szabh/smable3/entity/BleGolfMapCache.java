package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class BleGolfMapCache extends BleWritable {
    private final int ITEM_HEADER_LENGTH;

    @aa1
    private String mGolfCourseId;

    public BleGolfMapCache() {
        this.mGolfCourseId = "";
        this.ITEM_HEADER_LENGTH = 8;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeStringWithFix$default(this, this.mGolfCourseId, 8, null, 4, null);
    }

    public final int getITEM_HEADER_LENGTH() {
        return this.ITEM_HEADER_LENGTH;
    }

    @aa1
    public final String getMGolfCourseId() {
        return this.mGolfCourseId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.ITEM_HEADER_LENGTH;
    }

    public final void setMGolfCourseId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGolfCourseId = r2;
    }

    @aa1
    public String toString() {
        return "BleGolfMapCache(mGolfCourseId:" + this.mGolfCourseId + HexStringBuilder.COMMENT_END_CHAR;
    }
}
