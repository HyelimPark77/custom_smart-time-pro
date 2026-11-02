package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.LtvBean;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DevStorageInfo {
    public static final int INDEX_FLASH = 3;
    public static final int INDEX_FLASH2 = 5;
    public static final int INDEX_FLASH3 = 6;
    public static final int INDEX_LINE_IN = 4;
    public static final int INDEX_SD0 = 1;
    public static final int INDEX_SD1 = 2;
    public static final int INDEX_USB = 0;
    private static final String TAG = "DevStorageInfo";
    private static final int TYPE_REUSE_STORAGE = 2;
    private static final int TYPE_STORAGE_INFO = 1;
    private boolean isStorageReuse;
    private final List<DevStorageState> storageStates;
    private int version;

    static {
    }

    public DevStorageInfo() {
        this.storageStates = new ArrayList();
    }

    private void parseNewVersion(byte[] r5) {
        if (r5[0] != (-1)) goto L16;
        this.storageStates.clear();
        if (r5.length <= 1) goto L17;
        setVersion(CHexConver.byteToInt(r5[1]));
        if (r5.length <= 2) goto L18;
        int r1 = r5.length - 2;
        byte[] r3 = new byte[r1];
        System.arraycopy(r5, 2, r3, 0, r1);
        if (this.version != 0) goto L15;
        parseV0(r3);
        return;
    L15:
        return;
    L18:
        return;
    L17:
        return;
    }

    private void parseStorageInfo(byte[] r10) {
        boolean r0 = false;
        byte r1 = r10[0];
        this.storageStates.clear();
        int r3 = 0;
        int r4 = 1;
    L4:
        if (r3 >= 6) goto L14;
        DevStorageState r5 = new DevStorageState().setIndex(r3);
        r5.setOnline(CHexConver.checkBitValue(r1, r3));
        if (r3 == 4) goto L12;
        int r7 = r4 + 4;
        if (r7 > r10.length) goto L14;
        r5.setHandle(CHexConver.bytesToInt(r10, r4, 4));
        this.storageStates.add(r5);
        r4 = r7;
    L12:
        r3 = r3 + 1;
    L14:
        if (r10.length >= (r4 + 1)) goto L16;
        return;
    L16:
        if (CHexConver.byteToInt(r10[r4]) != 1) goto L18;
        r0 = true;
    L18:
        setStorageReuse(r0);
    }

    private void parseV0(byte[] r9) {
        Iterator<LtvBean> r10 = RcspUtil.parseLTVData(r9).iterator();
    L4:
        if (r10.hasNext() == false) goto L27;
        LtvBean r0 = r10.next();
        byte[] r1 = r0.getData();
        if (r1 == null) goto L4;
        if (r1.length == 0) goto L4;
        int r2 = r0.getType();
        boolean r3 = true;
        if (r2 != 1) goto L13;
        int r4 = 0;
    L22:
        if (r4 >= r1.length) goto L4;
        int r5 = r1.length - r4;
        byte[] r6 = new byte[r5];
        System.arraycopy(r1, r4, r6, 0, r5);
        DevStorageState r7 = new DevStorageState();
        int r8 = r7.parseData(r6);
        JL_Log.d(TAG, "parseV0", "size : " + r8 + ", " + r7);
        if (r8 == 0) goto L4;
        this.storageStates.add(r7);
        r4 = r4 + r8;
        goto L22
    L13:
        if (r2 != 2) goto L4;
        if (CHexConver.byteToInt(r1[0]) == 1) goto L19;
        r3 = false;
    L19:
        setStorageReuse(r3);
        goto L4
    }

    public List<DevStorageState> getStorageStates() {
        return new ArrayList(this.storageStates);
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isStorageReuse() {
        return this.isStorageReuse;
    }

    public void parseData(byte[] r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.length >= 1) goto L7;
        return;
    L7:
        if (r3[0] != (-1)) goto L10;
        parseNewVersion(r3);
        return;
    L10:
        parseStorageInfo(r3);
    }

    public DevStorageInfo setStorageReuse(boolean r1) {
        this.isStorageReuse = r1;
        return this;
    }

    public DevStorageInfo setVersion(int r1) {
        this.version = r1;
        return this;
    }

    public String toString() {
        return "DevStorageInfo{storageStates=" + this.storageStates + ", isStorageReuse=" + this.isStorageReuse + i0XO1.IO;
    }
}
