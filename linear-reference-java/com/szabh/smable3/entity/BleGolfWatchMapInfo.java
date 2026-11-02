package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.he5;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleGolfWatchMapInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGolfWatchMapInfo.kt\ncom/szabh/smable3/entity/BleGolfWatchMapInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class BleGolfWatchMapInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 16;

    @aa1
    private String mCourseId;

    @aa1
    private ArrayList<GolfMapData> mDataList;

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

    public BleGolfWatchMapInfo() {
        this.mCourseId = "";
        this.mDataList = new ArrayList();
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCourseId = BleReadable.readString$default(this, 16, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeStringWithFix(this.mCourseId, 16, Charsets.IiI10X);
        writeList(this.mDataList);
    }

    @aa1
    public final String getMCourseId() {
        return this.mCourseId;
    }

    @aa1
    public final ArrayList<GolfMapData> getMDataList() {
        return this.mDataList;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        Iterator<T> r0 = this.mDataList.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L7;
        r1 = r1 + ((GolfMapData) r0.next()).getMLengthToWrite();
        goto L4
    L7:
        return 16 + r1;
    }

    public final void setMCourseId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCourseId = r2;
    }

    public final void setMDataList(@aa1 ArrayList<GolfMapData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDataList = r2;
    }

    @aa1
    public String toString() {
        return he5.OiIIX101O("\n            BleGolfWatchMapInfo(mCourseId=" + this.mCourseId + ", mDataList=" + this.mDataList.size() + ")\n        ");
    }
}
