package com.jieli.jl_filebrowse.bean;

import com.android.mltcode.paycertificationapi.OO11XIO0O;
import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class Folder extends File {
    private final transient List<File> files;
    private boolean isLoadFinish;

    public Folder(Folder r1) {
        super(r1);
        this.files = new ArrayList();
        this.isLoadFinish = false;
    }

    public static /* synthetic */ int iO(File r0, File r1) {
        return Integer.compare(r0.getFileNum(), r1.getFileNum());
    }

    public void addChild(File r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        ArrayList r0 = new ArrayList();
        r0.add(r2);
        addChild(r0, false);
    }

    public void clean() {
        Iterator<File> r0 = this.files.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        File r1 = r0.next();
        if (r1.isFolder() == false) goto L4;
        ((Folder) r1).clean();
        goto L4
    L8:
        this.files.clear();
        setLoadFinished(false);
    }

    public Folder findFolderByName(String r5) {
        if (r5 != null) goto L5;
    L16:
        return null;
    L5:
        if (r5.length() == 0) goto L16;
        Iterator<File> r1 = this.files.iterator();
    L9:
        if (r1.hasNext() == false) goto L16;
        File r2 = r1.next();
        if (r5.equals(r2.getName()) == false) goto L9;
        if (r2.isFolder() == false) goto L9;
        return (Folder) r2;
    }

    public int getChildCount() {
        return this.files.size();
    }

    public File getChildFile(int r2) {
        return getChildFile(r2, false);
    }

    public List<FileStruct> getChildFileStructs() {
        ArrayList r0 = new ArrayList();
        Iterator<File> r1 = this.files.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r0.add(r1.next().getFileStruct());
        goto L4
    L6:
        return r0;
    }

    @Override // com.jieli.jl_filebrowse.bean.File
    public List<Integer> getClusterArray() {
        ArrayList r0 = new ArrayList();
        r0.add(Integer.valueOf(getCluster()));
        Folder r1 = getParent();
    L3:
        if (r1 == null) goto L8;
        int r2 = r1.getCluster();
        if (r0.contains(Integer.valueOf(r2)) == true) goto L8;
        r0.add(Integer.valueOf(r2));
        r1 = r1.getParent();
    L8:
        Collections.reverse(r0);
        return r0;
    }

    public int getStartIndex() {
        return this.files.size() + 1;
    }

    public boolean isEndElement(FileStruct r5) {
        if (r5 != null) goto L5;
    L12:
        return false;
    L5:
        if (this.files.isEmpty() == true) goto L12;
        if (this.isLoadFinish == false) goto L12;
        List<File> r1 = this.files;
        if (r1.get(r1.size() - 1).getCluster() != r5.getCluster()) goto L12;
        return true;
    }

    public boolean isLoadFinished(boolean r1) {
        return this.isLoadFinish;
    }

    public boolean isRootFolder() {
        if (isFolder() == true) goto L5;
        return false;
    L5:
        if (getCluster() == 0) goto L7;
        return false;
    L7:
        if (File.ROOT_DIR_NAME.equals(getName()) == false) goto L13;
        return true;
    L13:
        return false;
    }

    public boolean removeChild(int r1) {
        return removeChild(getChildFile(r1));
    }

    public void setLoadFinished(boolean r1) {
        this.isLoadFinish = r1;
    }

    @Override // com.jieli.jl_filebrowse.bean.File, com.jieli.jl_filebrowse.bean.FileStruct
    public String toString() {
        return "Folder{parent=" + getParent() + ",\n level=" + getLevel() + ", isUnicode=" + isUnicode() + ", cluster=" + getCluster() + ", devIndex=" + getDevIndex() + ", name=\"" + getName() + "\", path=\"" + getPathString() + "\", isLoadFinish=" + this.isLoadFinish + i0XO1.IO;
    }

    public File getChildFile(int r4, boolean r5) {
        Iterator<File> r0 = this.files.iterator();
    L4:
        if (r0.hasNext() == false) goto L14;
        File r1 = r0.next();
        if (r1.getFileStruct().getCluster() == r4) goto L7;
        if (r5 == false) goto L4;
        if (r1.isFolder() == false) goto L4;
        File r2 = ((Folder) r1).getChildFile(r4, true);
        if (r2 == null) goto L4;
        return r2;
    L7:
        return r1;
    L14:
        return null;
    }

    public boolean removeChild(File r2) {
        if (r2 != null) goto L6;
        return false;
    L6:
        return this.files.remove(r2);
    }

    public Folder(Folder r1, FileStruct r2) throws NullPointerException {
        super(r1, r2);
        this.files = new ArrayList();
        this.isLoadFinish = false;
    }

    public void addChild(List<File> r2) {
        addChild(r2, false);
    }

    public void addChild(List<File> r3, boolean r4) {
        if (r4 == false) goto L4;
        this.files.clear();
    L4:
        if (r3 == null) goto L21;
        Iterator<File> r5 = r3.iterator();
        boolean r6 = false;
    L8:
        if (r5.hasNext() == false) goto L12;
        File r0 = r5.next();
        if (this.files.contains(r0) == true) goto L8;
        this.files.add(r0);
        r6 = true;
        goto L8
    L12:
        if (r6 == false) goto L20;
        Collections.sort(this.files, new OO11XIO0O());
        return;
    L20:
        return;
    }

    public Folder(Folder r9, boolean r10, int r11, short r12, String r13, byte r14) {
        super(r9, false, r10, r11, r12, r13, r14);
        this.files = new ArrayList();
        this.isLoadFinish = false;
    }
}
