package com.jieli.jl_filebrowse.bean;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RegFile extends File {
    public RegFile(Folder folder) {
        super(folder);
    }

    @Override // com.jieli.jl_filebrowse.bean.File
    public List<Integer> getClusterArray() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(getCluster()));
        return arrayList;
    }

    @Override // com.jieli.jl_filebrowse.bean.File, com.jieli.jl_filebrowse.bean.FileStruct
    public String toString() {
        return "RegFile{parent=" + getParent() + ",\n level=" + getLevel() + ", isUnicode=" + isUnicode() + ", cluster=" + getCluster() + ", devIndex=" + ((int) getDevIndex()) + ", fileNum=" + ((int) getFileNum()) + ", name=\"" + getName() + "\", path=\"" + getPathString() + "\"" + i0XO1.f7442IO;
    }

    public RegFile(Folder folder, FileStruct fileStruct) throws NullPointerException {
        super(folder, fileStruct);
    }

    public RegFile(Folder folder, boolean z, boolean z2, int i, short s, String str, byte b) {
        super(folder, z, z2, i, s, str, b);
    }
}
