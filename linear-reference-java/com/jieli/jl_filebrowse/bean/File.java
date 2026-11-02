package com.jieli.jl_filebrowse.bean;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class File extends FileStruct {
    public static final String ROOT_DIR_NAME = "ROOT";
    private final int level;
    private final transient Folder parent;

    public File(Folder r1) {
        this.parent = r1;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        this.level = r2;
        return;
    L5:
        r2 = r1.getLevel() + 1;
        goto L6
    }

    public static Folder createRootFolder(int r7) {
        return new Folder(null, true, 0, 1, ROOT_DIR_NAME, (byte) r7);
    }

    public PathData convertPathData(SDCardBean r7, short r8, int r9) {
        if (r7.getIndex() == getDevIndex()) goto L7;
        return null;
    L7:
        return new PathData(CHexConver.intToByte(isFile() ? 1 : 0), CHexConver.intToByte(r9), r8, r7.getDevHandler(), getClusterArray());
    }

    public abstract List<Integer> getClusterArray();

    public FileStruct getFileStruct() {
        return new FileStruct(isFile(), isUnicode(), getCluster(), getFileNum(), getName(), getDevIndex());
    }

    public int getLevel() {
        return this.level;
    }

    public Folder getParent() {
        return this.parent;
    }

    public byte[] getPathData() {
        List<Integer> r0 = getClusterArray();
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        int r2 = r0.size() - 1;     // Catch: IOException -> L7
    L4:
        if (r2 < 0) goto L10;
        r1.write(CHexConver.intToBigBytes(r0.get(r2).intValue()));     // Catch: IOException -> L7
        r2 = r2 - 1;
    L10:
        return r1.toByteArray();
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L10
    }

    public String getPathString() {
        if (this.parent != null) goto L7;
        return "/" + getName();
    L7:
        return this.parent.getPathString() + "/" + getName();
    }

    public boolean isFolder() {
        return !isFile();
    }

    @Override // com.jieli.jl_filebrowse.bean.FileStruct
    public String toString() {
        return "File{parent=" + this.parent + ",\n level=" + this.level + ", isFile=" + isFile() + ", isUnicode=" + isUnicode() + ", cluster=" + getCluster() + ", devIndex=" + getDevIndex() + ", fileNum=" + getFileNum() + ", name=\"" + getName() + "\", path=\"" + getPathString() + "\"" + i0XO1.IO;
    }

    public File(Folder r9, FileStruct r10) throws NullPointerException {
        this(r9, r10.isFile(), r10.isUnicode(), r10.getCluster(), r10.getFileNum(), r10.getName(), r10.getDevIndex());
    }

    public File(Folder r8, boolean r9, boolean r10, int r11, short r12, String r13, byte r14) {
        super(r9, r10, r11, r12, r13, r14);
        this.parent = r8;
        if (r8 != null) goto L5;
        int r15 = 0;
    L6:
        this.level = r15;
        return;
    L5:
        r15 = r8.getLevel() + 1;
        goto L6
    }
}
