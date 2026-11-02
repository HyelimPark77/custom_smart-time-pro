package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceInfo extends JsonFieldContainer implements Serializable {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private final String binPath;
    private final int id;

    @aa1
    private final String previewPath;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String getWatchFaceExt() {
            if (q62.OXO1.IiX() == false) goto L6;
            return "wf";
        L6:
            return "bin";
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public WatchFaceInfo(int r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "previewPath");
        Intrinsics.X0O(r4, "binPath");
        this.id = r2;
        this.previewPath = r3;
        this.binPath = r4;
    }

    public static /* synthetic */ WatchFaceInfo copy$default(WatchFaceInfo r0, int r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.previewPath;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.binPath;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.previewPath;
    }

    @aa1
    public final String component3() {
        return this.binPath;
    }

    @aa1
    public final WatchFaceInfo copy(int r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "previewPath");
        Intrinsics.X0O(r4, "binPath");
        return new WatchFaceInfo(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceInfo) == true) goto L8;
        return false;
    L8:
        WatchFaceInfo r6 = (WatchFaceInfo) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.previewPath, r6.previewPath) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.binPath, r6.binPath) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getBinPath() {
        return this.binPath;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getPreviewPath() {
        return this.previewPath;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.previewPath.hashCode()) * 31) + this.binPath.hashCode();
    }

    @aa1
    public String toString() {
        return "WatchFaceInfo(id=" + this.id + ", previewPath=" + this.previewPath + ", binPath=" + this.binPath + I000IiI1O.iO.iO;
    }
}
