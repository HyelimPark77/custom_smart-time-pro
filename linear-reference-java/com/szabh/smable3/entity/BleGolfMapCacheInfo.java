package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class BleGolfMapCacheInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 0;

    @aa1
    private String mGolfCourseId;

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

    public BleGolfMapCacheInfo() {
        this.mGolfCourseId = "";
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mGolfCourseId = BleReadable.readString$default(this, 8, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
    }

    @aa1
    public final String getMGolfCourseId() {
        return this.mGolfCourseId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 0;
    }

    public final void setMGolfCourseId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGolfCourseId = r2;
    }

    @aa1
    public String toString() {
        return "BleGolfMapCacheInfo(mGolfCourseId:" + this.mGolfCourseId + HexStringBuilder.COMMENT_END_CHAR;
    }
}
