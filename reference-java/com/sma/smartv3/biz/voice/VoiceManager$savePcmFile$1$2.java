package com.sma.smartv3.biz.voice;

import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManager$savePcmFile$1$2 implements Comparator<File> {
    @Override // java.util.Comparator
    public int compare(File file1, File file2) {
        Intrinsics.X0O(file1, "file1");
        Intrinsics.X0O(file2, "file2");
        return Intrinsics.XX0(file1.lastModified(), file2.lastModified());
    }
}
