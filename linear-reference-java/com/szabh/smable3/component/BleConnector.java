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
    public static final BleConnector INSTANCE = null;

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

        public Builder(@aa1 Context r2) {
            Intrinsics.X0O(r2, "context");
            this.context = r2;
            this.supportLauncher = true;
            this.supportFilterEmpty = true;
            this.mtu = X1i1IX1X.OXO1();
        }

        @aa1
        public final BaseBleConnector build() {
            return BaseBleConnector.init$default(BleConnector.INSTANCE, this.context, this.supportNordicOta, this.supportRealtekDfu, this.supportMtkOta, this.supportLauncher, this.supportFilterEmpty, this.mtu, null, 128, null);
        }

        @aa1
        public final Builder setMtu(int r1) {
            this.mtu = r1;
            return this;
        }

        @aa1
        public final Builder supportFilterEmpty(boolean r1) {
            this.supportFilterEmpty = r1;
            return this;
        }

        @aa1
        public final Builder supportLauncher(boolean r1) {
            this.supportLauncher = r1;
            return this;
        }

        @aa1
        public final Builder supportMtkOta(boolean r1) {
            this.supportMtkOta = r1;
            return this;
        }

        @aa1
        public final Builder supportNordicOta(boolean r1) {
            this.supportNordicOta = r1;
            return this;
        }

        @aa1
        public final Builder supportRealtekDfu(boolean r1) {
            this.supportRealtekDfu = r1;
            return this;
        }
    }

    static {
        INSTANCE = new BleConnector();
    }

    private BleConnector() {
    }

    public final void activateMultiDeviceConnector(@aa1 MultiDeviceBleConnector r2) {
        Intrinsics.X0O(r2, "connector");
        multiDeviceActiveConnector = r2;
        BleCache r3 = BleCache.INSTANCE;
        BaseBleConnector r0 = multiDeviceActiveConnector;
        Intrinsics.XXI(r0);
        r3.activateMultiDeviceActiveBleCache(r0.getBleCache());
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void addHandleCallback(@aa1 BleHandleCallback r2) {
        Intrinsics.X0O(r2, "bleHandleCallback");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.addHandleCallback(r2);
        return;
    L6:
        super.addHandleCallback(r2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void connectClassic() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.connectClassic();
        return;
    L6:
        super.connectClassic();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void connectHID() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.connectHID();
        return;
    L6:
        super.connectHID();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    @aa1
    public BaseBleCache getBleCache() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L9;
        BaseBleCache r1 = r0.getBleCache();
        if (r1 == null) goto L9;
        return r1;
    L9:
        return super.getBleCache();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    @aa1
    public BaseBleConnector getCurBleConnector() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L9;
        BaseBleConnector r1 = r0.getCurBleConnector();
        if (r1 == null) goto L9;
        return r1;
    L9:
        return super.getCurBleConnector();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean isAvailable() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.isAvailable();
    L7:
        return super.isAvailable();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean isBound() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.isBound();
    L7:
        return super.isBound();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean isBoundClassic() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.isBoundClassic();
    L7:
        return super.isBoundClassic();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void removeHandleCallback(@aa1 BleHandleCallback r2) {
        Intrinsics.X0O(r2, "bleHandleCallback");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.removeHandleCallback(r2);
        return;
    L6:
        super.removeHandleCallback(r2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendData(@aa1 BleKey r9, @aa1 BleKeyFlag r10, @tb1 byte[] r11, boolean r12, boolean r13) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        StringBuilder r1 = new StringBuilder();
        r1.append("BleConnector.sendData -> bleKey=");
        r1.append(r9);
        r1.append(", multiDeviceActiveConnector=");
        boolean r3 = false;
        if (multiDeviceActiveConnector == null) goto L5;
        boolean r2 = true;
    L6:
        r1.append(r2);
        r1.append(", useMulti=");
        if (multiDeviceActiveConnector == null) goto L9;
        r3 = true;
    L9:
        r1.append(r3);
        r1.append(", this@BleConnector hash: ");
        r1.append(System.identityHashCode(this));
        r0.XIi00iiXO(r1.toString());
        BaseBleConnector r4 = multiDeviceActiveConnector;
        if (r4 == null) goto L14;
        return r4.sendData(r9, r10, r11, r12, r13);
    L14:
        return super.sendData(r9, r10, r11, r12, r13);
    L5:
        r2 = false;
        goto L6
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendInt8(@aa1 BleKey r9, @aa1 BleKeyFlag r10, int r11, boolean r12, boolean r13) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        StringBuilder r1 = new StringBuilder();
        r1.append("BleConnector.sendInt8 -> bleKey=");
        r1.append(r9);
        r1.append(", multiDeviceActiveConnector=");
        boolean r3 = false;
        if (multiDeviceActiveConnector == null) goto L5;
        boolean r2 = true;
    L6:
        r1.append(r2);
        r1.append(", useMulti=");
        if (multiDeviceActiveConnector == null) goto L9;
        r3 = true;
    L9:
        r1.append(r3);
        r0.XIi00iiXO(r1.toString());
        BaseBleConnector r4 = multiDeviceActiveConnector;
        if (r4 == null) goto L14;
        return r4.sendInt8(r9, r10, r11, r12, r13);
    L14:
        return super.sendInt8(r9, r10, r11, r12, r13);
    L5:
        r2 = false;
        goto L6
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendList(@aa1 BleKey r8, @aa1 BleKeyFlag r9, @tb1 List<? extends BleBuffer> r10, boolean r11, boolean r12) {
        Intrinsics.X0O(r8, "bleKey");
        Intrinsics.X0O(r9, "bleKeyFlag");
        BaseBleConnector r1 = multiDeviceActiveConnector;
        if (r1 == null) goto L7;
        return r1.sendList(r8, r9, r10, r11, r12);
    L7:
        return super.sendList(r8, r9, r10, r11, r12);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendObject(@aa1 BleKey r9, @aa1 BleKeyFlag r10, @tb1 BleBuffer r11, boolean r12, boolean r13) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        StringBuilder r1 = new StringBuilder();
        r1.append("BleConnector.sendObject -> bleKey=");
        r1.append(r9);
        r1.append(", multiDeviceActiveConnector=");
        boolean r3 = false;
        if (multiDeviceActiveConnector == null) goto L5;
        boolean r2 = true;
    L6:
        r1.append(r2);
        r1.append(", useMulti=");
        if (multiDeviceActiveConnector == null) goto L9;
        r3 = true;
    L9:
        r1.append(r3);
        r0.XIi00iiXO(r1.toString());
        BaseBleConnector r4 = multiDeviceActiveConnector;
        if (r4 == null) goto L14;
        return r4.sendObject(r9, r10, r11, r12, r13);
    L14:
        return super.sendObject(r9, r10, r11, r12, r13);
    L5:
        r2 = false;
        goto L6
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey r2, @aa1 byte[] r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "bytes");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.sendStream(r2, r3, r4);
    L7:
        return super.sendStream(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void unbind() {
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.unbind();
        return;
    L6:
        super.unbind();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void unbindClassic(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.unbindClassic(r2);
        return;
    L6:
        super.unbindClassic(r2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public void unbindHID(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L6;
        r0.unbindHID(r2);
        return;
    L6:
        super.unbindHID(r2);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey r2, @aa1 File r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "file");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.sendStream(r2, r3, r4);
    L7:
        return super.sendStream(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey r2, @aa1 InputStream r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "inputStream");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.sendStream(r2, r3, r4);
    L7:
        return super.sendStream(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "path");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.sendStream(r2, r3, r4);
    L7:
        return super.sendStream(r2, r3, r4);
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    public boolean sendStream(@aa1 BleKey r2, int r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        BaseBleConnector r0 = multiDeviceActiveConnector;
        if (r0 == null) goto L7;
        return r0.sendStream(r2, r3, r4);
    L7:
        return super.sendStream(r2, r3, r4);
    }
}
