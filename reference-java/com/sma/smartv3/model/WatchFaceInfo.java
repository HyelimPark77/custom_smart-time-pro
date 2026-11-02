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
    public static final Companion Companion = new Companion(null);

    @aa1
    private final String binPath;

    /* JADX INFO: renamed from: id */
    private final int f51331id;

    @aa1
    private final String previewPath;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String getWatchFaceExt() {
            return q62.OXO1.IiX() ? "wf" : "bin";
        }

        private Companion() {
        }
    }

    public WatchFaceInfo(int i, @aa1 String previewPath, @aa1 String binPath) {
        Intrinsics.X0O(previewPath, "previewPath");
        Intrinsics.X0O(binPath, "binPath");
        this.f51331id = i;
        this.previewPath = previewPath;
        this.binPath = binPath;
    }

    public static /* synthetic */ WatchFaceInfo copy$default(WatchFaceInfo watchFaceInfo, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = watchFaceInfo.f51331id;
        }
        if ((i2 & 2) != 0) {
            str = watchFaceInfo.previewPath;
        }
        if ((i2 & 4) != 0) {
            str2 = watchFaceInfo.binPath;
        }
        return watchFaceInfo.copy(i, str, str2);
    }

    public final int component1() {
        return this.f51331id;
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
    public final WatchFaceInfo copy(int i, @aa1 String previewPath, @aa1 String binPath) {
        Intrinsics.X0O(previewPath, "previewPath");
        Intrinsics.X0O(binPath, "binPath");
        return new WatchFaceInfo(i, previewPath, binPath);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceInfo)) {
            return false;
        }
        WatchFaceInfo watchFaceInfo = (WatchFaceInfo) obj;
        return this.f51331id == watchFaceInfo.f51331id && Intrinsics.XOO0ii0(this.previewPath, watchFaceInfo.previewPath) && Intrinsics.XOO0ii0(this.binPath, watchFaceInfo.binPath);
    }

    @aa1
    public final String getBinPath() {
        return this.binPath;
    }

    public final int getId() {
        return this.f51331id;
    }

    @aa1
    public final String getPreviewPath() {
        return this.previewPath;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f51331id) * 31) + this.previewPath.hashCode()) * 31) + this.binPath.hashCode();
    }

    @aa1
    public String toString() {
        return "WatchFaceInfo(id=" + this.f51331id + ", previewPath=" + this.previewPath + ", binPath=" + this.binPath + I000IiI1O.C2156iO.f1007iO;
    }
}
