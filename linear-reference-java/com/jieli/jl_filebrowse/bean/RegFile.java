package com.jieli.jl_filebrowse.bean;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RegFile extends File {
    public RegFile(Folder r1) {
        super(r1);
    }

    @Override // com.jieli.jl_filebrowse.bean.File
    public List<Integer> getClusterArray() {
        ArrayList r0 = new ArrayList();
        r0.add(Integer.valueOf(getCluster()));
        return r0;
    }

    @Override // com.jieli.jl_filebrowse.bean.File, com.jieli.jl_filebrowse.bean.FileStruct
    public String toString() {
        return "RegFile{parent=" + getParent() + ",\n level=" + getLevel() + ", isUnicode=" + isUnicode() + ", cluster=" + getCluster() + ", devIndex=" + getDevIndex() + ", fileNum=" + getFileNum() + ", name=\"" + getName() + "\", path=\"" + getPathString() + "\"" + i0XO1.IO;
    }

    public RegFile(Folder r1, FileStruct r2) throws NullPointerException {
        super(r1, r2);
    }

    public RegFile(Folder r1, boolean r2, boolean r3, int r4, short r5, String r6, byte r7) {
        super(r1, r2, r3, r4, r5, r6, r7);
    }
}
