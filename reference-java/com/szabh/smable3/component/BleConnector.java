package com.szabh.smable3.component;

import android.annotation.SuppressLint;
import android.content.Context;
import com.android.mltcode.paycertificationapi.X1i1IX1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleBuffer;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"StaticFieldLeak"})
public final class BleConnector extends BaseBleConnector {

    @aa1
    public static final String CH_MTK_OTA_META = "c6a22916-f821-18bf-9704-0266f20e80fd";

    @aa1
    public static final BleConnector INSTANCE = new BleConnector();

    @aa1
    public static final String SERVICE_MTK = "c6a22905-f821-18bf-9704-0266f20e80fd";

    @tb1
    private static BaseBleConnector multiDeviceActiveConnector;

    public static final class Builder {

        @aa1
        private final Context context;
        private int mtu;
        private boolean supportFilterEmpty;
        private boolean supportLauncher;
        private boolean supportMtkOta;
        private boolean supportNordicOta;
        private boolean supportRealtekDfu;

        public Builder(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            this.context = context;
            this.supportLauncher = true;
            this.supportFilterEmpty = true;
            this.mtu = X1i1IX1X.OXO1();
        }

        @aa1
        public final BaseBleConnector build() {
            return BaseBleConnector.init$default(BleConnector.INSTANCE, this.context, this.supportNordicOta, this.supportRealtekDfu, this.supportMtkOta, this.supportLauncher, this.supportFilterEmpty, this.mtu, null, 128, null);
        }

        @aa1
        public final Builder setMtu(int i) {
            this.mtu = i;
            return this;
        }

        @aa1
        public final Builder supportFilterEmpty(boolean z) {
            this.supportFilterEmpty = z;
            return this;
        }

        @aa1
        public final Builder supportLauncher(boolean z) {
            this.supportLauncher = z;
            return this;
        }

        @aa1
        public final Builder supportMtkOta(boolean z) {
            this.supportMtkOta = z;
            return this;
        }

        @aa1
        public final Builder supportNordicOta(boolean z) {
            this.supportNordicOta = z;
            return this;
        }

        @aa1
        public final Builder supportRealtekDfu(boolean z) {
            this.supportRealtekDfu = z;
            return this;
        }
    }

    private BleConnector() {
    }

    public final void activateMultiDeviceConnector(@aa1 MultiDeviceBleConnector connector) {
        Intrinsics.X0O(connector, "connector");
        multiDeviceActiveConnector = connector;
        BleCache bleCache = BleCache.INSTANCE;
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        Intrinsics.XXI(baseBleConnector);
        bleCache.activateMultiDeviceActiveBleCache(baseBleConnector.getBleCache());
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void addHandleCallback(@aa1 BleHandleCallback bleHandleCallback) {
        Intrinsics.X0O(bleHandleCallback, "bleHandleCallback");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.addHandleCallback(bleHandleCallback);
        } else {
            super.addHandleCallback(bleHandleCallback);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void connectClassic() {
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.connectClassic();
        } else {
            super.connectClassic();
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void connectHID() {
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.connectHID();
        } else {
            super.connectHID();
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    @aa1
    public BaseBleCache getBleCache() {
        BaseBleCache bleCache;
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return (baseBleConnector == null || (bleCache = baseBleConnector.getBleCache()) == null) ? super.getBleCache() : bleCache;
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    @aa1
    public BaseBleConnector getCurBleConnector() {
        BaseBleConnector curBleConnector;
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return (baseBleConnector == null || (curBleConnector = baseBleConnector.getCurBleConnector()) == null) ? super.getCurBleConnector() : curBleConnector;
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean isAvailable() {
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.isAvailable() : super.isAvailable();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean isBound() {
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.isBound() : super.isBound();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean isBoundClassic() {
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.isBoundClassic() : super.isBoundClassic();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void removeHandleCallback(@aa1 BleHandleCallback bleHandleCallback) {
        Intrinsics.X0O(bleHandleCallback, "bleHandleCallback");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.removeHandleCallback(bleHandleCallback);
        } else {
            super.removeHandleCallback(bleHandleCallback);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendData(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, @tb1 byte[] bArr, boolean z, boolean z2) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("BleConnector.sendData -> bleKey=");
        sb.append(bleKey);
        sb.append(", multiDeviceActiveConnector=");
        sb.append(multiDeviceActiveConnector != null);
        sb.append(", useMulti=");
        sb.append(multiDeviceActiveConnector != null);
        sb.append(", this@BleConnector hash: ");
        sb.append(System.identityHashCode(this));
        i1o0oxo1o.XIi00iiXO(sb.toString());
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendData(bleKey, bleKeyFlag, bArr, z, z2) : super.sendData(bleKey, bleKeyFlag, bArr, z, z2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendInt8(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, int i, boolean z, boolean z2) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("BleConnector.sendInt8 -> bleKey=");
        sb.append(bleKey);
        sb.append(", multiDeviceActiveConnector=");
        sb.append(multiDeviceActiveConnector != null);
        sb.append(", useMulti=");
        sb.append(multiDeviceActiveConnector != null);
        i1o0oxo1o.XIi00iiXO(sb.toString());
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendInt8(bleKey, bleKeyFlag, i, z, z2) : super.sendInt8(bleKey, bleKeyFlag, i, z, z2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendList(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, @tb1 List<? extends BleBuffer> list, boolean z, boolean z2) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendList(bleKey, bleKeyFlag, list, z, z2) : super.sendList(bleKey, bleKeyFlag, list, z, z2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendObject(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag, @tb1 BleBuffer bleBuffer, boolean z, boolean z2) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("BleConnector.sendObject -> bleKey=");
        sb.append(bleKey);
        sb.append(", multiDeviceActiveConnector=");
        sb.append(multiDeviceActiveConnector != null);
        sb.append(", useMulti=");
        sb.append(multiDeviceActiveConnector != null);
        i1o0oxo1o.XIi00iiXO(sb.toString());
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendObject(bleKey, bleKeyFlag, bleBuffer, z, z2) : super.sendObject(bleKey, bleKeyFlag, bleBuffer, z, z2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey bleKey, @aa1 byte[] bytes, int i) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bytes, "bytes");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendStream(bleKey, bytes, i) : super.sendStream(bleKey, bytes, i);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void unbind() {
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.unbind();
        } else {
            super.unbind();
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void unbindClassic(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.unbindClassic(address);
        } else {
            super.unbindClassic(address);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void unbindHID(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        if (baseBleConnector != null) {
            baseBleConnector.unbindHID(address);
        } else {
            super.unbindHID(address);
        }
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey bleKey, @aa1 File file, int i) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(file, "file");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendStream(bleKey, file, i) : super.sendStream(bleKey, file, i);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey bleKey, @aa1 InputStream inputStream, int i) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(inputStream, "inputStream");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendStream(bleKey, inputStream, i) : super.sendStream(bleKey, inputStream, i);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey bleKey, @aa1 String path, int i) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(path, "path");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendStream(bleKey, path, i) : super.sendStream(bleKey, path, i);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey bleKey, int i, int i2) {
        Intrinsics.X0O(bleKey, "bleKey");
        BaseBleConnector baseBleConnector = multiDeviceActiveConnector;
        return baseBleConnector != null ? baseBleConnector.sendStream(bleKey, i, i2) : super.sendStream(bleKey, i, i2);
    }
}
