package com.sma.smartv3.biz.voice.v2;

import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIIdentificationManager$savePcmFile$1$2 implements Comparator<File> {
    public AIIdentificationManager$savePcmFile$1$2() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(File r1, File r2) {
        return compare2(r1, r2);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(File r3, File r4) {
        Intrinsics.X0O(r3, "file1");
        Intrinsics.X0O(r4, "file2");
        return Intrinsics.XX0(r3.lastModified(), r4.lastModified());
    }
}
