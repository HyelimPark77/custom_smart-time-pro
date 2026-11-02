package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleIdObject;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCache extends BaseBleCache {

    @aa1
    public static final BleCache INSTANCE = null;

    @tb1
    private static BaseBleCache _delegateCache;

    @tb1
    private static BaseBleCache multiDeviceActiveBleCache;

    static {
        INSTANCE = new BleCache();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BleCache() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    public final void activateMultiDeviceActiveBleCache(@aa1 BaseBleCache r2) {
        Intrinsics.X0O(r2, "bleCache");
        _delegateCache = r2;
        multiDeviceActiveBleCache = r2;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void clear() {
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.clear();
        return;
    L6:
        super.clear();
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public boolean getBoolean(@aa1 BleKey r2, boolean r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L7;
        return r0.getBoolean(r2, r3, r4);
    L7:
        return super.getBoolean(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @aa1
    public List<BleIdObject> getIdObjects(@aa1 BleKey r2) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L9;
        List<BleIdObject> r1 = r0.getIdObjects(r2);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return super.getIdObjects(r2);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public int getInt(@aa1 BleKey r2, int r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L7;
        return r0.getInt(r2, r3, r4);
    L7:
        return super.getInt(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @aa1
    public <T> List<T> getList(@aa1 BleKey r2, @aa1 Class<T> r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "clazz");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L9;
        List<T> r1 = r0.getList(r2, r3, r4);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return super.getList(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public long getLong(@aa1 BleKey r2, long r3, @tb1 BleKeyFlag r5) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L7;
        return r0.getLong(r2, r3, r5);
    L7:
        return super.getLong(r2, r3, r5);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @tb1
    public BleDeviceInfo getMDeviceInfo() {
        BaseBleCache r0 = _delegateCache;
        if (r0 != null) goto L6;
        i1O0OXO1O.OXO1.OXO1("BleCache  get failed: delegate cache is not initialized");
        return null;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.getMDeviceInfo();
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @tb1
    public <T> T getObject(@aa1 BleKey r2, @aa1 Class<T> r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "clazz");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L9;
        T r1 = (T) r0.getObject(r2, r3, r4);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return (T) super.getObject(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public <T> T getObjectNotNull(@aa1 BleKey r2, @aa1 Class<T> r3, @tb1 T r4, @tb1 BleKeyFlag r5) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "clazz");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L9;
        T r1 = (T) r0.getObjectNotNull(r2, r3, r4, r5);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return (T) super.getObjectNotNull(r2, r3, r4, r5);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @aa1
    public String getString(@aa1 BleKey r2, @aa1 String r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "def");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L9;
        String r1 = r0.getString(r2, r3, r4);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return super.getString(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putBoolean(@aa1 BleKey r2, boolean r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.putBoolean(r2, r3, r4);
        return;
    L6:
        super.putBoolean(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putInt(@aa1 BleKey r2, int r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.putInt(r2, r3, r4);
        return;
    L6:
        super.putInt(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public <T> void putList(@aa1 BleKey r2, @tb1 List<? extends T> r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.putList(r2, r3, r4);
        return;
    L6:
        super.putList(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putLong(@aa1 BleKey r2, long r3, @tb1 BleKeyFlag r5) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.putLong(r2, r3, r5);
        return;
    L6:
        super.putLong(r2, r3, r5);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public <T> void putObject(@aa1 BleKey r2, @tb1 T r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.putObject(r2, r3, r4);
        return;
    L6:
        super.putObject(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putString(@aa1 BleKey r2, @aa1 String r3, @tb1 BleKeyFlag r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "value");
        BaseBleCache r0 = multiDeviceActiveBleCache;
        if (r0 == null) goto L6;
        r0.putString(r2, r3, r4);
        return;
    L6:
        super.putString(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void setMDeviceInfo(@tb1 BleDeviceInfo r2) {
        BaseBleCache r0 = _delegateCache;
        if (r0 != null) goto L6;
        i1O0OXO1O.OXO1.OXO1("BleCache  set failed: delegate cache is not initialized");
        return;
    L6:
        if (r0 == null) goto L9;
        r0.setMDeviceInfo(r2);
        return;
    }
}
