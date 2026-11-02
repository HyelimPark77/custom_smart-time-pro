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
    public static final BleCache INSTANCE = new BleCache();

    @tb1
    private static BaseBleCache _delegateCache;

    @tb1
    private static BaseBleCache multiDeviceActiveBleCache;

    /* JADX WARN: Multi-variable type inference failed */
    private BleCache() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    public final void activateMultiDeviceActiveBleCache(@aa1 BaseBleCache bleCache) {
        Intrinsics.X0O(bleCache, "bleCache");
        _delegateCache = bleCache;
        multiDeviceActiveBleCache = bleCache;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void clear() {
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.clear();
        } else {
            super.clear();
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public boolean getBoolean(@aa1 BleKey bleKey, boolean z, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return baseBleCache != null ? baseBleCache.getBoolean(bleKey, z, bleKeyFlag) : super.getBoolean(bleKey, z, bleKeyFlag);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @aa1
    public List<BleIdObject> getIdObjects(@aa1 BleKey bleKey) {
        List<BleIdObject> idObjects;
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return (baseBleCache == null || (idObjects = baseBleCache.getIdObjects(bleKey)) == null) ? super.getIdObjects(bleKey) : idObjects;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public int getInt(@aa1 BleKey bleKey, int i, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return baseBleCache != null ? baseBleCache.getInt(bleKey, i, bleKeyFlag) : super.getInt(bleKey, i, bleKeyFlag);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @aa1
    public <T> List<T> getList(@aa1 BleKey bleKey, @aa1 Class<T> clazz, @tb1 BleKeyFlag bleKeyFlag) {
        List<T> list;
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(clazz, "clazz");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return (baseBleCache == null || (list = baseBleCache.getList(bleKey, clazz, bleKeyFlag)) == null) ? super.getList(bleKey, clazz, bleKeyFlag) : list;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public long getLong(@aa1 BleKey bleKey, long j, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return baseBleCache != null ? baseBleCache.getLong(bleKey, j, bleKeyFlag) : super.getLong(bleKey, j, bleKeyFlag);
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @tb1
    public BleDeviceInfo getMDeviceInfo() {
        BaseBleCache baseBleCache = _delegateCache;
        if (baseBleCache == null) {
            i1O0OXO1O.OXO1.OXO1("BleCache  get failed: delegate cache is not initialized");
            return null;
        }
        if (baseBleCache != null) {
            return baseBleCache.getMDeviceInfo();
        }
        return null;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @tb1
    public <T> T getObject(@aa1 BleKey bleKey, @aa1 Class<T> clazz, @tb1 BleKeyFlag bleKeyFlag) {
        T t;
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(clazz, "clazz");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return (baseBleCache == null || (t = (T) baseBleCache.getObject(bleKey, clazz, bleKeyFlag)) == null) ? (T) super.getObject(bleKey, clazz, bleKeyFlag) : t;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public <T> T getObjectNotNull(@aa1 BleKey bleKey, @aa1 Class<T> clazz, @tb1 T t, @tb1 BleKeyFlag bleKeyFlag) {
        T t2;
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(clazz, "clazz");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return (baseBleCache == null || (t2 = (T) baseBleCache.getObjectNotNull(bleKey, clazz, t, bleKeyFlag)) == null) ? (T) super.getObjectNotNull(bleKey, clazz, t, bleKeyFlag) : t2;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    @aa1
    public String getString(@aa1 BleKey bleKey, @aa1 String def, @tb1 BleKeyFlag bleKeyFlag) {
        String string;
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(def, "def");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        return (baseBleCache == null || (string = baseBleCache.getString(bleKey, def, bleKeyFlag)) == null) ? super.getString(bleKey, def, bleKeyFlag) : string;
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putBoolean(@aa1 BleKey bleKey, boolean z, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.putBoolean(bleKey, z, bleKeyFlag);
        } else {
            super.putBoolean(bleKey, z, bleKeyFlag);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putInt(@aa1 BleKey bleKey, int i, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.putInt(bleKey, i, bleKeyFlag);
        } else {
            super.putInt(bleKey, i, bleKeyFlag);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public <T> void putList(@aa1 BleKey bleKey, @tb1 List<? extends T> list, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.putList(bleKey, list, bleKeyFlag);
        } else {
            super.putList(bleKey, list, bleKeyFlag);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putLong(@aa1 BleKey bleKey, long j, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.putLong(bleKey, j, bleKeyFlag);
        } else {
            super.putLong(bleKey, j, bleKeyFlag);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public <T> void putObject(@aa1 BleKey bleKey, @tb1 T t, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.putObject(bleKey, t, bleKeyFlag);
        } else {
            super.putObject(bleKey, t, bleKeyFlag);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void putString(@aa1 BleKey bleKey, @aa1 String value, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(value, "value");
        BaseBleCache baseBleCache = multiDeviceActiveBleCache;
        if (baseBleCache != null) {
            baseBleCache.putString(bleKey, value, bleKeyFlag);
        } else {
            super.putString(bleKey, value, bleKeyFlag);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleCache
    public void setMDeviceInfo(@tb1 BleDeviceInfo bleDeviceInfo) {
        BaseBleCache baseBleCache = _delegateCache;
        if (baseBleCache == null) {
            i1O0OXO1O.OXO1.OXO1("BleCache  set failed: delegate cache is not initialized");
        } else if (baseBleCache != null) {
            baseBleCache.setMDeviceInfo(bleDeviceInfo);
        }
    }
}
