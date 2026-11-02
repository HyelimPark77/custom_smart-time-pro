package com.bestmafen.baseble.connector;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IOIX1OI0;
import com.android.mltcode.paycertificationapi.O1iiIi;
import com.android.mltcode.paycertificationapi.OIXOI;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X1i1IX1X;
import com.android.mltcode.paycertificationapi.XIi10;
import com.android.mltcode.paycertificationapi.XX0XO01i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.iO00;
import com.android.mltcode.paycertificationapi.iOiXX;
import com.android.mltcode.paycertificationapi.ib1;
import com.android.mltcode.paycertificationapi.nk3;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ut3;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.ironsource.C2985d4;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbsBleConnector {

    @aa1
    public static final OXO1 Companion = null;
    public static final int DEF_RECONNECT_MAX_PERIOD = 30;
    public static final int DEF_RECONNECT_MIN_PERIOD = 20;
    public static final int DEF_SCAN_MAX_DURATION = 12;
    public static final long TIMEOUT = 8000;

    @aa1
    private final String LOG_HEADER;
    private boolean disableStreamLog;
    private boolean isAutoReconnect;
    private boolean isConnecting;
    private boolean isRefreshDeviceCache;

    @tb1
    private XX0XO01i mBleGattCallback;
    private final BluetoothAdapter mBluetoothAdapter;

    @tb1
    private BluetoothGatt mBluetoothGatt;

    @aa1
    private final Lazy mBluetoothGattCallback$delegate;
    private boolean mConnectDirectly;
    protected Context mContext;
    private boolean mForceConnectDirectly;

    @aa1
    private final Handler mHandler;
    private int mMtu;
    private boolean mNotified;

    @aa1
    private final Lazy mReceiver$delegate;
    private int mReconnectBasePeriod;
    private int mReconnectMaxPeriod;

    @aa1
    private final XO0O10 mReconnection;
    private int mRetry;

    @aa1
    private final O1iiIi mScanFilter;
    private int mScanMaxDuration;

    @aa1
    private ScanMode mScanMode;

    @tb1
    private OXOI0XII mScanner;

    @tb1
    private String mTargetAddress;
    private long mTimeout;
    private int mTransport;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String OXO1(int r2) {
            switch(r2) {
                case 10: goto L11;
                case 11: goto L9;
                case 12: goto L7;
                case 13: goto L5;
                default: goto L4;
            };
        L5:
            return "STATE_TURNING_OFF";
        L7:
            return "STATE_ON";
        L9:
            return "STATE_TURNING_ON";
        L11:
            return "STATE_OFF";
        L4:
            return r2 + " unknown";
        }

        @aa1
        public final String XIi00iiXO(int r2) {
            if (r2 != 0) goto L4;
            return "DISCONNECTED";
        L4:
            if (r2 != 1) goto L6;
            return "CONNECTING";
        L6:
            if (r2 != 2) goto L8;
            return "CONNECTED";
        L8:
            if (r2 != 3) goto L10;
            return "DISCONNECTING";
        L10:
            return r2 + " unknown";
        }

        @aa1
        public final String iO(int r2) {
            if (r2 == 0) goto L42;
            if (r2 == 13) goto L40;
            if (r2 == 15) goto L38;
            if (r2 == 143) goto L36;
            if (r2 == 257) goto L34;
            if (r2 == 2) goto L32;
            if (r2 == 3) goto L30;
            if (r2 == 5) goto L28;
            if (r2 == 6) goto L26;
            if (r2 == 7) goto L24;
            return r2 + " unknown";
        L24:
            return r2 + " INVALID_OFFSET";
        L26:
            return r2 + " REQUEST_NOT_SUPPORTED";
        L28:
            return r2 + " INSUFFICIENT_AUTHENTICATION";
        L30:
            return r2 + " WRITE_NOT_PERMITTED";
        L32:
            return r2 + " READ_NOT_PERMITTED";
        L34:
            return r2 + " FAILURE";
        L36:
            return r2 + " CONNECTION_CONGESTED";
        L38:
            return r2 + " INSUFFICIENT_ENCRYPTION";
        L40:
            return r2 + " INVALID_ATTRIBUTE_LENGTH";
        L42:
            return r2 + " SUCCESS";
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO implements i1OIOOIiX {
        public final /* synthetic */ AbsBleConnector OXO1;

        public XIi00iiXO(AbsBleConnector r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r4) {
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getLOG_HEADER() + " onScan -> " + r4);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r4) {
            Intrinsics.X0O(r4, "device");
            i1O0OXO1O.OXO1.OXO1(this.OXO1.getLOG_HEADER() + " onDeviceFound -> " + r4);
            OXOI0XII r0 = AbsBleConnector.access$getMScanner$p(this.OXO1);
            if (r0 == null) goto L6;
            r0.XXI(false);
        L6:
            if (this.OXO1.getMBluetoothGatt() == null) goto L8;
            return;
        L8:
            AbsBleConnector r1 = this.OXO1;
            r1.setMBluetoothGatt(AbsBleConnector.access$getBluetoothGatt(r1, r4.getMBluetoothDevice()));
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    public static final class XO0O10 implements Runnable {
        public final /* synthetic */ AbsBleConnector IO;

        public XO0O10(AbsBleConnector r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.IO.closeConnection(false);
            if (AbsBleConnector.access$shouldReconnect(this.IO) == true) goto L6;
            this.IO.setConnecting(false);
            return;
        L6:
            AbsBleConnector.access$setMRetry$p(this.IO, AbsBleConnector.access$getMRetry$p(this.IO) + 1);
            if (AbsBleConnector.access$getMRetry$p(this.IO) >= 1) goto L9;
            AbsBleConnector.access$setMRetry$p(this.IO, 1);
        L9:
            int r0 = AbsBleConnector.access$getMRetry$p(this.IO) * this.IO.getMReconnectBasePeriod();
            if (r0 <= this.IO.getMReconnectMaxPeriod()) goto L13;
            AbsBleConnector.access$setMRetry$p(this.IO, 1);
            r0 = AbsBleConnector.access$getMRetry$p(this.IO) * this.IO.getMReconnectBasePeriod();
        L13:
            if (this.IO.getMForceConnectDirectly() == false) goto L15;
        L23:
            i1O0OXO1O.OXO1.OXO1(this.IO.getLOG_HEADER() + " connect directly " + AbsBleConnector.access$getMRetry$p(this.IO) + ' ');
            AbsBleConnector.access$connectGatt(this.IO);
            this.IO.getMHandler().postDelayed(this, 5000);
        L24:
            AbsBleConnector r1 = this.IO;
            r1.setMConnectDirectly(!r1.getMConnectDirectly());
            return;
        L15:
            if (this.IO.getMConnectDirectly() == true) goto L23;
            int r2 = (int) (r0 * 0.75f);
            if (r2 <= this.IO.getMScanMaxDuration()) goto L19;
            r2 = this.IO.getMScanMaxDuration();
        L19:
            i1O0OXO1O.OXO1.OXO1(this.IO.getLOG_HEADER() + " connect scan " + this.IO.getMScanMode() + ' ' + this.IO.getMScanMaxDuration() + ' ' + this.IO.getMReconnectMaxPeriod() + ' ' + AbsBleConnector.access$getMRetry$p(this.IO) + ' ' + r0 + ' ' + r2);
            OXOI0XII r3 = AbsBleConnector.access$getMScanner$p(this.IO);
            if (r3 == null) goto L22;
            r3.XX0(r3.XOO0ii0());
            r3.IIX1OXO(r2);
            r3.XXI(true);
        L22:
            this.IO.getMHandler().postDelayed(this, r0 * 1000);
            goto L24
        }
    }

    public static final class iO extends BluetoothGattCallback {
        public final /* synthetic */ AbsBleConnector OXO1;

        public iO(AbsBleConnector r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(AbsBleConnector r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(AbsBleConnector r1) {
            AbsBleConnector.access$setMNotified$p(r1, true);
            r1.getMBleMessenger().dequeueMessage();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt r3, BluetoothGattCharacteristic r4) {
            Intrinsics.X0O(r3, "gatt");
            Intrinsics.X0O(r4, "characteristic");
            i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " onCharacteristicChanged -> " + r4.getUuid() + ", " + ByteArrayExtKt.getMHexString(r4.getValue()));
            OIXOI r5 = this.OXO1.getMBleParser();
            byte[] r6 = r4.getValue();
            Intrinsics.O10IXXX0X(r6, "getValue(...)");
            byte[] r7 = r5.onReceive(r6);
            if (r7 == null) goto L8;
            XX0XO01i r8 = this.OXO1.getMBleGattCallback();
            if (r8 == null) goto L9;
            r8.onCharacteristicChanged(r7);
            return;
        L9:
            return;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt r5, BluetoothGattCharacteristic r6, int r7) {
            Intrinsics.X0O(r5, "gatt");
            Intrinsics.X0O(r6, "characteristic");
            byte[] r8 = r6.getValue();
            String r9 = r6.getStringValue(0);
            i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " onCharacteristicRead -> " + r6.getUuid() + ", " + ByteArrayExtKt.getMHexString(r8) + ", " + r9);
            this.OXO1.getMBleMessenger().dequeueMessage();
            XX0XO01i r0 = this.OXO1.getMBleGattCallback();
            if (r0 == null) goto L6;
            String r10 = String.valueOf(r6.getUuid());
            Intrinsics.XXI(r8);
            Intrinsics.XXI(r9);
            r0.onCharacteristicRead(r10, r8, r9);
            return;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt r3, BluetoothGattCharacteristic r4, int r5) {
            Intrinsics.X0O(r3, "gatt");
            Intrinsics.X0O(r4, "characteristic");
            if (this.OXO1.getDisableStreamLog() == true) goto L5;
            i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " onCharacteristicWrite -> " + AbsBleConnector.Companion.iO(r5) + ", " + r4.getUuid() + ", " + ByteArrayExtKt.getMHexString(r4.getValue()));
        L5:
            this.OXO1.getMBleMessenger().dequeueWritePacket();
            XX0XO01i r6 = this.OXO1.getMBleGattCallback();
            if (r6 == null) goto L9;
            String r7 = String.valueOf(r4.getUuid());
            byte[] r8 = r4.getValue();
            Intrinsics.O10IXXX0X(r8, "getValue(...)");
            r6.onCharacteristicWrite(r7, r8);
            return;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt r7, int r8, int r9) {
            Intrinsics.X0O(r7, "gatt");
            if (r8 != 0) goto L5;
            boolean r2 = true;
        L7:
            if (r9 != 2) goto L9;
            boolean r3 = true;
        L10:
            if (r2 == false) goto L13;
            if (r3 == false) goto L13;
            boolean r4 = true;
        L14:
            i1O0OXO1O r5 = i1O0OXO1O.OXO1;
            StringBuilder r6 = new StringBuilder();
            r6.append(this.OXO1.getLOG_HEADER());
            r6.append(" onConnectionStateChange -> ");
            r6.append(r4);
            r6.append(", status=");
            OXO1 r10 = AbsBleConnector.Companion;
            r6.append(r10.iO(r8));
            r6.append(", newState=");
            r6.append(r10.XIi00iiXO(r9));
            r5.XO0O10(r6.toString());
            this.OXO1.getMBleMessenger().reset();
            this.OXO1.getMBleParser().reset();
            if (r4 == false) goto L24;
            r7.discoverServices();
            this.OXO1.connect(false);
            if (this.OXO1.getMBluetoothGatt() != null) goto L19;
            this.OXO1.setMBluetoothGatt(r7);
        L19:
            XX0XO01i r11 = this.OXO1.getMBleGattCallback();
            if (r11 == null) goto L36;
            r11.onConnectionStateChange(true);
            return;
        L36:
            return;
        L24:
            if (this.OXO1.isAutoReconnect() == true) goto L26;
            XX0XO01i r12 = this.OXO1.getMBleGattCallback();
            if (r12 == null) goto L37;
            r12.onConnectionStateChange(false);
            return;
        L37:
            return;
        L26:
            if (AbsBleConnector.access$getMNotified$p(this.OXO1) == false) goto L30;
            XX0XO01i r13 = this.OXO1.getMBleGattCallback();
            if (r13 == null) goto L30;
            r13.onConnectionStateChange(false);
        L30:
            this.OXO1.connect(true);
            return;
        L13:
            r4 = false;
            goto L14
        L9:
            r3 = false;
            goto L10
        L5:
            r2 = false;
            goto L7
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt r3, BluetoothGattDescriptor r4, int r5) {
            Intrinsics.X0O(r3, "gatt");
            Intrinsics.X0O(r4, "descriptor");
            i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " -> onDescriptorWrite");
            Handler r6 = this.OXO1.getMHandler();
            final AbsBleConnector r7 = this.OXO1;
            r6.postDelayed(new XIi10(r7), 1000);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt r2, int r3, int r4) {
            Intrinsics.X0O(r2, "gatt");
            i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " onMtuChanged -> mtu=" + r3);
            if (AbsBleConnector.access$getMNotified$p(this.OXO1) == false) goto L10;
            this.OXO1.getMBleMessenger().setMPacketSize(r3 - 3);
            this.OXO1.getMBleMessenger().dequeueMessage();
            XX0XO01i r5 = this.OXO1.getMBleGattCallback();
            if (r5 == null) goto L9;
            r5.onMtuChanged();
            return;
        L9:
            return;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt r7, int r8) {
            Intrinsics.X0O(r7, "gatt");
            i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " -> onServicesDiscovered");
            this.OXO1.getMBleMessenger().enqueueMessage(new ib1(this.OXO1.getMService(), this.OXO1.getMNotify(), false, 4, null));
            this.OXO1.getMBleMessenger().enqueueMessage(new nk3(this.OXO1.getMMtu()));
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public AbsBleConnector() {
        this.LOG_HEADER = "AbsBleConnector";
        this.mMtu = X1i1IX1X.OXO1();
        this.mBluetoothGattCallback$delegate = LazyKt__LazyJVMKt.iO(new IOIX1OI0(this));
        this.mReceiver$delegate = LazyKt__LazyJVMKt.iO(new iOiXX(this));
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScanFilter = new O1iiIi("");
        this.isAutoReconnect = true;
        this.mConnectDirectly = true;
        this.mReconnectBasePeriod = 5;
        this.mTimeout = 8000;
        this.mReconnectMaxPeriod = 30;
        this.mScanMaxDuration = 12;
        this.mScanMode = ScanMode.BALANCED;
        this.mReconnection = new XO0O10(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bestmafen.baseble.connector.AbsBleConnector$mReceiver$2$1] */
    public static final AbsBleConnector$mReceiver$2$1 I0IIOi(final AbsBleConnector r1) {
        return new AbsBleConnector$mReceiver$2$1(r1);
    }

    public static /* synthetic */ iO OXO1(AbsBleConnector r0) {
        return XOO0ii0(r0);
    }

    public static /* synthetic */ AbsBleConnector$mReceiver$2$1 XIi00iiXO(AbsBleConnector r0) {
        return I0IIOi(r0);
    }

    public static final iO XOO0ii0(AbsBleConnector r1) {
        return new iO(r1);
    }

    public static final /* synthetic */ void access$connectGatt(AbsBleConnector r0) {
        r0.iO();
    }

    public static final /* synthetic */ BluetoothGatt access$getBluetoothGatt(AbsBleConnector r0, BluetoothDevice r1) {
        return r0.XO0O10(r1);
    }

    public static final /* synthetic */ boolean access$getMNotified$p(AbsBleConnector r0) {
        return r0.mNotified;
    }

    public static final /* synthetic */ int access$getMRetry$p(AbsBleConnector r0) {
        return r0.mRetry;
    }

    public static final /* synthetic */ OXOI0XII access$getMScanner$p(AbsBleConnector r0) {
        return r0.mScanner;
    }

    public static final /* synthetic */ void access$setMNotified$p(AbsBleConnector r0, boolean r1) {
        r0.mNotified = r1;
    }

    public static final /* synthetic */ void access$setMRetry$p(AbsBleConnector r0, int r1) {
        r0.mRetry = r1;
    }

    public static final /* synthetic */ boolean access$shouldReconnect(AbsBleConnector r0) {
        return r0.IO();
    }

    public static /* synthetic */ AbsBleConnector setBleDevice$default(AbsBleConnector r0, BleDevice r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        return r0.setBleDevice(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBleDevice");
    }

    public final boolean IO() {
        if (this.mBluetoothAdapter.isEnabled() == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " shouldReconnect -> " + r0 + ", BluetoothAdapter isEnabled: " + this.mBluetoothAdapter.isEnabled() + ", mTargetAddress: " + this.mTargetAddress);
        return r0;
    L5:
        if (TextUtils.isEmpty(this.mTargetAddress) == true) goto L7;
        r0 = true;
        goto L8
    }

    public final AbsBleConnector$mReceiver$2$1 IiI10X() {
        return (AbsBleConnector$mReceiver$2$1) getValue();
    }

    public final iO O00() {
        return (iO) getValue();
    }

    public final void OIi0() {
        Method r0 = BluetoothGatt.class.getMethod(ToolBar.REFRESH, new Class[0]);     // Catch: Exception -> L6
        if (r0 == null) goto L11;
        Object r1 = r0.invoke(this.mBluetoothGatt, new Object[0]);     // Catch: Exception -> L6
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type kotlin.Boolean");     // Catch: Exception -> L6
        boolean r2 = ((Boolean) r1).booleanValue();     // Catch: Exception -> L6
        i1O0OXO1O.OXO1.XO0O10(getLOG_HEADER() + " refreshDeviceCache -> " + r2);     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO(getLOG_HEADER() + " refreshDeviceCache -> error = " + e.getMessage());
    }

    public final BluetoothGatt XO0O10(BluetoothDevice r5) {
        int r0 = r5.getType();
        if (this.mTransport == 0) goto L5;
    L7:
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " BluetoothGatt -> type = " + r5.getType() + " , transport = " + this.mTransport);
        BluetoothGatt r6 = r5.connectGatt(getMContext(), false, O00(), this.mTransport);
        Intrinsics.XXI(r6);
        return r6;
    L5:
        if (r0 != 3) goto L7;
        this.mTransport = 2;
        goto L7
    }

    public final synchronized void closeConnection(boolean r4) {
        monitor-enter(this);
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " closeConnection -> stopReconnecting = " + r4 + ", " + this.isRefreshDeviceCache);     // Catch: Throwable -> L10
        getMBleMessenger().reset();     // Catch: Throwable -> L10
        getMBleParser().reset();     // Catch: Throwable -> L10
        if (this.mNotified == false) goto L12;
        this.mNotified = false;     // Catch: Throwable -> L10
        if (r4 == false) goto L12;
        XX0XO01i r0 = this.mBleGattCallback;     // Catch: Throwable -> L10
        if (r0 == null) goto L12;
        r0.onConnectionStateChange(false);     // Catch: Throwable -> L10
    L12:
        BluetoothGatt r1 = this.mBluetoothGatt;     // Catch: Throwable -> L10
        if (r1 != null) goto L15;
    L18:
        if (r4 == false) goto L20;
        this.mTargetAddress = "";     // Catch: Throwable -> L10
        connect(false);     // Catch: Throwable -> L10
    L20:
        monitor-exit(this);
        return;
    L15:
        if (this.isRefreshDeviceCache == false) goto L17;
        Intrinsics.XXI(r1);     // Catch: Throwable -> L10
        r1.disconnect();     // Catch: Throwable -> L10
        OIi0();     // Catch: Throwable -> L10
    L17:
        BluetoothGatt r2 = this.mBluetoothGatt;     // Catch: Throwable -> L10
        Intrinsics.XXI(r2);     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L10
        this.mBluetoothGatt = null;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized void connect(boolean r4) {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (isConnecting() != r4) goto L7;
        monitor-exit(this);
        return;
    L7:
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " connect -> " + r4);     // Catch: Throwable -> L12
        setConnecting(r4);     // Catch: Throwable -> L12
        this.mRetry = 0;     // Catch: Throwable -> L12
        if (r4 == true) goto L10;
        OXOI0XII r5 = this.mScanner;     // Catch: Throwable -> L12
        if (r5 == null) goto L18;
        r5.XXI(false);     // Catch: Throwable -> L12
    L18:
        this.mHandler.removeCallbacks(this.mReconnection);     // Catch: Throwable -> L12
    L19:
        monitor-exit(this);
        return;
    L10:
        if (this.isAutoReconnect == false) goto L14;
        this.mHandler.post(this.mReconnection);     // Catch: Throwable -> L12
        goto L19
    L14:
        iO();     // Catch: Throwable -> L12
        goto L19
    }

    public final void exit() {
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " -> exit");     // Catch: Exception -> L5
        OXOI0XII r0 = this.mScanner;     // Catch: Exception -> L5
        if (r0 == null) goto L7;
        r0.XIi00iiXO();     // Catch: Exception -> L5
    L7:
        closeConnection(true);     // Catch: Exception -> L5
        getMContext().unregisterReceiver(IiI10X());     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    @aa1
    public final String getAddress() {
        String r0 = this.mTargetAddress;
        if (r0 != null) goto L6;
        return "";
    L6:
        return r0;
    }

    @tb1
    public final BluetoothGattCharacteristic getCharacteristic(@aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r7, "serviceUuid");
        Intrinsics.X0O(r8, "characteristicUuid");
        if (this.mBluetoothGatt != null) goto L6;
        return null;
    L6:
        if (TextUtils.isEmpty(r7) == false) goto L8;
    L19:
        return null;
    L8:
        if (TextUtils.isEmpty(r8) == true) goto L19;
        BluetoothGatt r0 = this.mBluetoothGatt;
        Intrinsics.XXI(r0);
        BluetoothGattService r1 = r0.getService(UUID.fromString(r7));
        if (r1 != null) goto L14;
        i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getCharacteristic -> service(" + r7 + ")=null");
        return null;
    L14:
        BluetoothGattCharacteristic r2 = r1.getCharacteristic(UUID.fromString(r8));
        if (r2 != null) goto L18;
        i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getCharacteristic -> service(" + r7 + "), characteristic(" + r8 + ")=null");
        return null;
    L18:
        return r2;
    }

    public final boolean getDisableStreamLog() {
        return this.disableStreamLog;
    }

    @aa1
    public String getLOG_HEADER() {
        return this.LOG_HEADER;
    }

    @tb1
    public final XX0XO01i getMBleGattCallback() {
        return this.mBleGattCallback;
    }

    @aa1
    public abstract iO00 getMBleMessenger();

    @aa1
    public abstract OIXOI getMBleParser();

    @tb1
    public final BluetoothGatt getMBluetoothGatt() {
        return this.mBluetoothGatt;
    }

    public final boolean getMConnectDirectly() {
        return this.mConnectDirectly;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    public final boolean getMForceConnectDirectly() {
        return this.mForceConnectDirectly;
    }

    @aa1
    public final Handler getMHandler() {
        return this.mHandler;
    }

    public final int getMMtu() {
        return this.mMtu;
    }

    @aa1
    public abstract String getMNotify();

    public final int getMReconnectBasePeriod() {
        return this.mReconnectBasePeriod;
    }

    public final int getMReconnectMaxPeriod() {
        return this.mReconnectMaxPeriod;
    }

    public final int getMScanMaxDuration() {
        return this.mScanMaxDuration;
    }

    @aa1
    public final ScanMode getMScanMode() {
        return this.mScanMode;
    }

    @aa1
    public abstract String getMService();

    @tb1
    public final String getMTargetAddress() {
        return this.mTargetAddress;
    }

    public final long getMTimeout() {
        return this.mTimeout;
    }

    public final int getMTransport() {
        return this.mTransport;
    }

    @tb1
    public final BluetoothGattDescriptor getNotifyDescriptor(@tb1 BluetoothGattCharacteristic r4) {
        if (r4 != null) goto L6;
        i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getNotifyDescriptor -> characteristic=null");
        return null;
    L6:
        BluetoothGattDescriptor r5 = r4.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (r5 != null) goto L10;
        i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getNotifyDescriptor -> descriptor=null");
        return null;
    L10:
        return r5;
    }

    public int getWriteType() {
        return -1;
    }

    public final void iO() {
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " connectGatt");
        BluetoothDevice r0 = this.mBluetoothAdapter.getRemoteDevice(this.mTargetAddress);     // Catch: Exception -> L5
        Intrinsics.O10IXXX0X(r0, "getRemoteDevice(...)");     // Catch: Exception -> L5
        this.mBluetoothGatt = XO0O10(r0);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO(getLOG_HEADER() + " connect Exception");
        e.printStackTrace();
    }

    @aa1
    @SuppressLint({"WrongConstant"})
    public final AbsBleConnector init(@aa1 Context r3, @aa1 XX0XO01i r4) {
        Intrinsics.X0O(r3, "context");
        Intrinsics.X0O(r4, "bleGattCallback");
        Context r0 = r3.getApplicationContext();
        Intrinsics.O10IXXX0X(r0, "getApplicationContext(...)");
        setMContext(r0);
        this.mBleGattCallback = r4;
        this.mScanner = ut3.XIi00iiXO(ut3.OXO1, null, null, 3, null).XiOIO(this.mScanFilter).iIiiO(false).X1ii(new XIi00iiXO(this));
        getMBleMessenger().setMAbsBleConnector(this);
        if (Build.VERSION.SDK_INT < 34) goto L6;
        ContextCompat.registerReceiver(r3, IiI10X(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
        return this;
    L6:
        getMContext().registerReceiver(IiI10X(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        return this;
    }

    public final boolean isAutoReconnect() {
        return this.isAutoReconnect;
    }

    public boolean isConnecting() {
        return this.isConnecting;
    }

    public final boolean isRefreshDeviceCache() {
        return this.isRefreshDeviceCache;
    }

    @aa1
    public final AbsBleConnector setAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        this.mTargetAddress = r2;
        iO(r2);
        return this;
    }

    public final void setAutoReconnect(boolean r1) {
        this.isAutoReconnect = r1;
    }

    @aa1
    public final AbsBleConnector setBleDevice(@aa1 BleDevice r2, int r3) {
        Intrinsics.X0O(r2, "bleDevice");
        this.mTransport = r3;
        return setBluetoothDevice(r2.getMBluetoothDevice());
    }

    @aa1
    public final AbsBleConnector setBluetoothDevice(@aa1 BluetoothDevice r2) {
        Intrinsics.X0O(r2, "bluetoothDevice");
        String r3 = r2.getAddress();
        Intrinsics.O10IXXX0X(r3, "getAddress(...)");
        return setAddress(r3);
    }

    public void setConnecting(boolean r1) {
        this.isConnecting = r1;
    }

    public final void setDisableStreamLog(boolean r1) {
        this.disableStreamLog = r1;
    }

    public final void setForceConnectDirectly(boolean r1) {
        this.mForceConnectDirectly = r1;
        if (r1 == false) goto L5;
        int r2 = 20;
    L6:
        this.mReconnectMaxPeriod = r2;
        return;
    L5:
        r2 = 30;
        goto L6
    }

    public final void setMBleGattCallback(@tb1 XX0XO01i r1) {
        this.mBleGattCallback = r1;
    }

    public final void setMBluetoothGatt(@tb1 BluetoothGatt r1) {
        this.mBluetoothGatt = r1;
    }

    public final void setMConnectDirectly(boolean r1) {
        this.mConnectDirectly = r1;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setMForceConnectDirectly(boolean r1) {
        this.mForceConnectDirectly = r1;
    }

    public final void setMMtu(int r1) {
        this.mMtu = r1;
    }

    public final void setMReconnectBasePeriod(int r1) {
        this.mReconnectBasePeriod = r1;
    }

    public final void setMReconnectMaxPeriod(int r1) {
        this.mReconnectMaxPeriod = r1;
    }

    public final void setMScanMaxDuration(int r1) {
        this.mScanMaxDuration = r1;
    }

    public final void setMScanMode(@aa1 ScanMode r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mScanMode = r2;
    }

    public final void setMTargetAddress(@tb1 String r1) {
        this.mTargetAddress = r1;
    }

    public final void setMTimeout(long r1) {
        this.mTimeout = r1;
    }

    public final void setMTransport(int r1) {
        this.mTransport = r1;
    }

    public final void setReconnectMaxPeriod(int r1) {
        this.mReconnectMaxPeriod = r1;
    }

    public final void setRefreshDeviceCache(boolean r1) {
        this.isRefreshDeviceCache = r1;
    }

    public final void setScanMaxDuration(int r1) {
        this.mScanMaxDuration = r1;
    }

    public final void setScanMode(@aa1 ScanMode r2) {
        Intrinsics.X0O(r2, C2985d4.a.t);
        this.mScanMode = r2;
    }

    public final void setTimeout(long r1) {
        this.mTimeout = r1;
    }

    public final void isAutoReconnect(boolean r1) {
        this.isAutoReconnect = r1;
    }
}
