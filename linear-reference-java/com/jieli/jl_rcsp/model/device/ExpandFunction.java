package com.jieli.jl_rcsp.model.device;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class ExpandFunction {
    public static final int MASK_DYNAMIC_LIMITER = 2;
    public static final int MASK_REVERBERATION = 1;
    private final Map<Integer, byte[]> dataMap;
    private int mask;

    public ExpandFunction() {
        this.dataMap = new HashMap();
    }

    public byte[] getData(int r2) {
        return this.dataMap.get(Integer.valueOf(r2));
    }

    public int getMask() {
        return this.mask;
    }

    public void putData(int r2, byte[] r3) {
        this.dataMap.put(Integer.valueOf(r2), r3);
    }

    public void setMask(int r1) {
        this.mask = r1;
    }
}
