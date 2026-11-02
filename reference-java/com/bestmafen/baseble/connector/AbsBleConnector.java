package com.bestmafen.baseble.connector;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O1iiIi;
import com.android.mltcode.paycertificationapi.OIXOI;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X1i1IX1X;
import com.android.mltcode.paycertificationapi.XX0XO01i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.iO00;
import com.android.mltcode.paycertificationapi.ib1;
import com.android.mltcode.paycertificationapi.nk3;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ut3;
import com.bestmafen.baseble.connector.AbsBleConnector;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbsBleConnector {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int DEF_RECONNECT_MAX_PERIOD = 30;
    public static final int DEF_RECONNECT_MIN_PERIOD = 20;
    public static final int DEF_SCAN_MAX_DURATION = 12;
    public static final long TIMEOUT = 8000;
    private boolean disableStreamLog;
    private boolean isConnecting;
    private boolean isRefreshDeviceCache;

    @tb1
    private XX0XO01i mBleGattCallback;

    @tb1
    private BluetoothGatt mBluetoothGatt;
    protected Context mContext;
    private boolean mForceConnectDirectly;
    private boolean mNotified;
    private int mRetry;

    @tb1
    private OXOI0XII mScanner;

    @tb1
    private String mTargetAddress;
    private int mTransport;

    @aa1
    private final String LOG_HEADER = "AbsBleConnector";
    private int mMtu = X1i1IX1X.OXO1();

    @aa1
    private final Lazy mBluetoothGattCallback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOIX1OI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AbsBleConnector.XOO0ii0(this.f1807IO);
        }
    });

    @aa1
    private final Lazy mReceiver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOiXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AbsBleConnector.I0IIOi(this.f8202IO);
        }
    });
    private final BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @aa1
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @aa1
    private final O1iiIi mScanFilter = new O1iiIi("");
    private boolean isAutoReconnect = true;
    private boolean mConnectDirectly = true;
    private int mReconnectBasePeriod = 5;
    private long mTimeout = 8000;
    private int mReconnectMaxPeriod = 30;
    private int mScanMaxDuration = 12;

    @aa1
    private ScanMode mScanMode = ScanMode.BALANCED;

    @aa1
    private final XO0O10 mReconnection = new XO0O10();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String OXO1(int i) {
            switch (i) {
                case 10:
                    return "STATE_OFF";
                case 11:
                    return "STATE_TURNING_ON";
                case 12:
                    return "STATE_ON";
                case 13:
                    return "STATE_TURNING_OFF";
                default:
                    return i + " unknown";
            }
        }

        @aa1
        public final String XIi00iiXO(int i) {
            if (i == 0) {
                return "DISCONNECTED";
            }
            if (i == 1) {
                return "CONNECTING";
            }
            if (i == 2) {
                return "CONNECTED";
            }
            if (i == 3) {
                return "DISCONNECTING";
            }
            return i + " unknown";
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final String m11126iO(int i) {
            if (i == 0) {
                return i + " SUCCESS";
            }
            if (i == 13) {
                return i + " INVALID_ATTRIBUTE_LENGTH";
            }
            if (i == 15) {
                return i + " INSUFFICIENT_ENCRYPTION";
            }
            if (i == 143) {
                return i + " CONNECTION_CONGESTED";
            }
            if (i == 257) {
                return i + " FAILURE";
            }
            if (i == 2) {
                return i + " READ_NOT_PERMITTED";
            }
            if (i == 3) {
                return i + " WRITE_NOT_PERMITTED";
            }
            if (i == 5) {
                return i + " INSUFFICIENT_AUTHENTICATION";
            }
            if (i == 6) {
                return i + " REQUEST_NOT_SUPPORTED";
            }
            if (i != 7) {
                return i + " unknown";
            }
            return i + " INVALID_OFFSET";
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO implements i1OIOOIiX {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean z) {
            i1O0OXO1O.OXO1.OXO1(AbsBleConnector.this.getLOG_HEADER() + " onScan -> " + z);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice device) {
            Intrinsics.X0O(device, "device");
            i1O0OXO1O.OXO1.OXO1(AbsBleConnector.this.getLOG_HEADER() + " onDeviceFound -> " + device);
            OXOI0XII oxoi0xii = AbsBleConnector.this.mScanner;
            if (oxoi0xii != null) {
                oxoi0xii.XXI(false);
            }
            if (AbsBleConnector.this.getMBluetoothGatt() != null) {
                return;
            }
            AbsBleConnector absBleConnector = AbsBleConnector.this;
            absBleConnector.setMBluetoothGatt(absBleConnector.XO0O10(device.getMBluetoothDevice()));
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        /* JADX INFO: renamed from: iO */
        public void mo2019iO() {
        }
    }

    public static final class XO0O10 implements Runnable {
        public XO0O10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsBleConnector.this.closeConnection(false);
            if (!AbsBleConnector.this.m11124IO()) {
                AbsBleConnector.this.setConnecting(false);
                return;
            }
            AbsBleConnector.this.mRetry++;
            if (AbsBleConnector.this.mRetry < 1) {
                AbsBleConnector.this.mRetry = 1;
            }
            int mReconnectBasePeriod = AbsBleConnector.this.mRetry * AbsBleConnector.this.getMReconnectBasePeriod();
            if (mReconnectBasePeriod > AbsBleConnector.this.getMReconnectMaxPeriod()) {
                AbsBleConnector.this.mRetry = 1;
                mReconnectBasePeriod = AbsBleConnector.this.mRetry * AbsBleConnector.this.getMReconnectBasePeriod();
            }
            if (AbsBleConnector.this.getMForceConnectDirectly() || AbsBleConnector.this.getMConnectDirectly()) {
                i1O0OXO1O.OXO1.OXO1(AbsBleConnector.this.getLOG_HEADER() + " connect directly " + AbsBleConnector.this.mRetry + ' ');
                AbsBleConnector.this.m11125iO();
                AbsBleConnector.this.getMHandler().postDelayed(this, 5000L);
            } else {
                int mScanMaxDuration = (int) (mReconnectBasePeriod * 0.75f);
                if (mScanMaxDuration > AbsBleConnector.this.getMScanMaxDuration()) {
                    mScanMaxDuration = AbsBleConnector.this.getMScanMaxDuration();
                }
                i1O0OXO1O.OXO1.OXO1(AbsBleConnector.this.getLOG_HEADER() + " connect scan " + AbsBleConnector.this.getMScanMode() + ' ' + AbsBleConnector.this.getMScanMaxDuration() + ' ' + AbsBleConnector.this.getMReconnectMaxPeriod() + ' ' + AbsBleConnector.this.mRetry + ' ' + mReconnectBasePeriod + ' ' + mScanMaxDuration);
                OXOI0XII oxoi0xii = AbsBleConnector.this.mScanner;
                if (oxoi0xii != null) {
                    oxoi0xii.XX0(oxoi0xii.XOO0ii0());
                    oxoi0xii.IIX1OXO(mScanMaxDuration);
                    oxoi0xii.XXI(true);
                }
                AbsBleConnector.this.getMHandler().postDelayed(this, mReconnectBasePeriod * 1000);
            }
            AbsBleConnector absBleConnector = AbsBleConnector.this;
            absBleConnector.setMConnectDirectly(!absBleConnector.getMConnectDirectly());
        }
    }

    /* JADX INFO: renamed from: com.bestmafen.baseble.connector.AbsBleConnector$iO */
    public static final class C4244iO extends BluetoothGattCallback {
        public C4244iO() {
        }

        public static final void XIi00iiXO(AbsBleConnector absBleConnector) {
            absBleConnector.mNotified = true;
            absBleConnector.getMBleMessenger().dequeueMessage();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
            XX0XO01i mBleGattCallback;
            Intrinsics.X0O(gatt, "gatt");
            Intrinsics.X0O(characteristic, "characteristic");
            i1O0OXO1O.OXO1.XO0O10(AbsBleConnector.this.getLOG_HEADER() + " onCharacteristicChanged -> " + characteristic.getUuid() + ", " + ByteArrayExtKt.getMHexString(characteristic.getValue()));
            OIXOI mBleParser = AbsBleConnector.this.getMBleParser();
            byte[] value = characteristic.getValue();
            Intrinsics.O10IXXX0X(value, "getValue(...)");
            byte[] bArrOnReceive = mBleParser.onReceive(value);
            if (bArrOnReceive == null || (mBleGattCallback = AbsBleConnector.this.getMBleGattCallback()) == null) {
                return;
            }
            mBleGattCallback.onCharacteristicChanged(bArrOnReceive);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int i) {
            Intrinsics.X0O(gatt, "gatt");
            Intrinsics.X0O(characteristic, "characteristic");
            byte[] value = characteristic.getValue();
            String stringValue = characteristic.getStringValue(0);
            i1O0OXO1O.OXO1.XO0O10(AbsBleConnector.this.getLOG_HEADER() + " onCharacteristicRead -> " + characteristic.getUuid() + ", " + ByteArrayExtKt.getMHexString(value) + ", " + stringValue);
            AbsBleConnector.this.getMBleMessenger().dequeueMessage();
            XX0XO01i mBleGattCallback = AbsBleConnector.this.getMBleGattCallback();
            if (mBleGattCallback != null) {
                String strValueOf = String.valueOf(characteristic.getUuid());
                Intrinsics.XXI(value);
                Intrinsics.XXI(stringValue);
                mBleGattCallback.onCharacteristicRead(strValueOf, value, stringValue);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int i) {
            Intrinsics.X0O(gatt, "gatt");
            Intrinsics.X0O(characteristic, "characteristic");
            if (!AbsBleConnector.this.getDisableStreamLog()) {
                i1O0OXO1O.OXO1.XO0O10(AbsBleConnector.this.getLOG_HEADER() + " onCharacteristicWrite -> " + AbsBleConnector.Companion.m11126iO(i) + ", " + characteristic.getUuid() + ", " + ByteArrayExtKt.getMHexString(characteristic.getValue()));
            }
            AbsBleConnector.this.getMBleMessenger().dequeueWritePacket();
            XX0XO01i mBleGattCallback = AbsBleConnector.this.getMBleGattCallback();
            if (mBleGattCallback != null) {
                String strValueOf = String.valueOf(characteristic.getUuid());
                byte[] value = characteristic.getValue();
                Intrinsics.O10IXXX0X(value, "getValue(...)");
                mBleGattCallback.onCharacteristicWrite(strValueOf, value);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt gatt, int i, int i2) {
            XX0XO01i mBleGattCallback;
            Intrinsics.X0O(gatt, "gatt");
            boolean z = (i == 0) && (i2 == 2);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            StringBuilder sb = new StringBuilder();
            sb.append(AbsBleConnector.this.getLOG_HEADER());
            sb.append(" onConnectionStateChange -> ");
            sb.append(z);
            sb.append(", status=");
            OXO1 oxo1 = AbsBleConnector.Companion;
            sb.append(oxo1.m11126iO(i));
            sb.append(", newState=");
            sb.append(oxo1.XIi00iiXO(i2));
            i1o0oxo1o.XO0O10(sb.toString());
            AbsBleConnector.this.getMBleMessenger().reset();
            AbsBleConnector.this.getMBleParser().reset();
            if (z) {
                gatt.discoverServices();
                AbsBleConnector.this.connect(false);
                if (AbsBleConnector.this.getMBluetoothGatt() == null) {
                    AbsBleConnector.this.setMBluetoothGatt(gatt);
                }
                XX0XO01i mBleGattCallback2 = AbsBleConnector.this.getMBleGattCallback();
                if (mBleGattCallback2 != null) {
                    mBleGattCallback2.onConnectionStateChange(true);
                    return;
                }
                return;
            }
            if (AbsBleConnector.this.isAutoReconnect()) {
                if (AbsBleConnector.this.mNotified && (mBleGattCallback = AbsBleConnector.this.getMBleGattCallback()) != null) {
                    mBleGattCallback.onConnectionStateChange(false);
                }
                AbsBleConnector.this.connect(true);
                return;
            }
            XX0XO01i mBleGattCallback3 = AbsBleConnector.this.getMBleGattCallback();
            if (mBleGattCallback3 != null) {
                mBleGattCallback3.onConnectionStateChange(false);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int i) {
            Intrinsics.X0O(gatt, "gatt");
            Intrinsics.X0O(descriptor, "descriptor");
            i1O0OXO1O.OXO1.XO0O10(AbsBleConnector.this.getLOG_HEADER() + " -> onDescriptorWrite");
            Handler mHandler = AbsBleConnector.this.getMHandler();
            final AbsBleConnector absBleConnector = AbsBleConnector.this;
            mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XIi10
                @Override // java.lang.Runnable
                public final void run() {
                    AbsBleConnector.C4244iO.XIi00iiXO(absBleConnector);
                }
            }, 1000L);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt gatt, int i, int i2) {
            Intrinsics.X0O(gatt, "gatt");
            i1O0OXO1O.OXO1.XO0O10(AbsBleConnector.this.getLOG_HEADER() + " onMtuChanged -> mtu=" + i);
            if (AbsBleConnector.this.mNotified) {
                AbsBleConnector.this.getMBleMessenger().setMPacketSize(i - 3);
                AbsBleConnector.this.getMBleMessenger().dequeueMessage();
                XX0XO01i mBleGattCallback = AbsBleConnector.this.getMBleGattCallback();
                if (mBleGattCallback != null) {
                    mBleGattCallback.onMtuChanged();
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt gatt, int i) {
            Intrinsics.X0O(gatt, "gatt");
            i1O0OXO1O.OXO1.XO0O10(AbsBleConnector.this.getLOG_HEADER() + " -> onServicesDiscovered");
            AbsBleConnector.this.getMBleMessenger().enqueueMessage(new ib1(AbsBleConnector.this.getMService(), AbsBleConnector.this.getMNotify(), false, 4, null));
            AbsBleConnector.this.getMBleMessenger().enqueueMessage(new nk3(AbsBleConnector.this.getMMtu()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bestmafen.baseble.connector.AbsBleConnector$mReceiver$2$1] */
    public static final AbsBleConnector$mReceiver$2$1 I0IIOi(final AbsBleConnector absBleConnector) {
        return new BroadcastReceiver() { // from class: com.bestmafen.baseble.connector.AbsBleConnector$mReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.X0O(context, "context");
                Intrinsics.X0O(intent, "intent");
                if (TextUtils.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    i1O0OXO1O.OXO1.XO0O10(this.OXO1.getLOG_HEADER() + " onReceive BluetoothAdapter.ACTION_STATE_CHANGED -> state=" + AbsBleConnector.Companion.OXO1(intExtra));
                    if (intExtra != 10) {
                        if (intExtra == 12 && this.OXO1.isAutoReconnect()) {
                            this.OXO1.setMConnectDirectly(true);
                            this.OXO1.connect(true);
                            return;
                        }
                        return;
                    }
                    this.OXO1.getMBleMessenger().reset();
                    this.OXO1.getMBleParser().reset();
                    if (this.OXO1.mNotified) {
                        this.OXO1.mNotified = false;
                        XX0XO01i mBleGattCallback = this.OXO1.getMBleGattCallback();
                        if (mBleGattCallback != null) {
                            mBleGattCallback.onConnectionStateChange(false);
                        }
                    }
                    this.OXO1.setConnecting(false);
                }
            }
        };
    }

    public static final C4244iO XOO0ii0(AbsBleConnector absBleConnector) {
        return absBleConnector.new C4244iO();
    }

    public static /* synthetic */ AbsBleConnector setBleDevice$default(AbsBleConnector absBleConnector, BleDevice bleDevice, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBleDevice");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return absBleConnector.setBleDevice(bleDevice, i);
    }

    /* JADX INFO: renamed from: IO */
    public final boolean m11124IO() {
        boolean z = this.mBluetoothAdapter.isEnabled() && !TextUtils.isEmpty(this.mTargetAddress);
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " shouldReconnect -> " + z + ", BluetoothAdapter isEnabled: " + this.mBluetoothAdapter.isEnabled() + ", mTargetAddress: " + this.mTargetAddress);
        return z;
    }

    public final AbsBleConnector$mReceiver$2$1 IiI10X() {
        return (AbsBleConnector$mReceiver$2$1) this.mReceiver$delegate.getValue();
    }

    public final C4244iO O00() {
        return (C4244iO) this.mBluetoothGattCallback$delegate.getValue();
    }

    public final void OIi0() {
        try {
            Method method = BluetoothGatt.class.getMethod(ToolBar.REFRESH, new Class[0]);
            if (method != null) {
                Object objInvoke = method.invoke(this.mBluetoothGatt, new Object[0]);
                Intrinsics.X1ii(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
                i1O0OXO1O.OXO1.XO0O10(getLOG_HEADER() + " refreshDeviceCache -> " + zBooleanValue);
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO(getLOG_HEADER() + " refreshDeviceCache -> error = " + e.getMessage());
        }
    }

    public final BluetoothGatt XO0O10(BluetoothDevice bluetoothDevice) {
        int type = bluetoothDevice.getType();
        if (this.mTransport == 0 && type == 3) {
            this.mTransport = 2;
        }
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " BluetoothGatt -> type = " + bluetoothDevice.getType() + " , transport = " + this.mTransport);
        BluetoothGatt bluetoothGattConnectGatt = bluetoothDevice.connectGatt(getMContext(), false, O00(), this.mTransport);
        Intrinsics.XXI(bluetoothGattConnectGatt);
        return bluetoothGattConnectGatt;
    }

    public final synchronized void closeConnection(boolean z) {
        XX0XO01i xX0XO01i;
        try {
            i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " closeConnection -> stopReconnecting = " + z + ", " + this.isRefreshDeviceCache);
            getMBleMessenger().reset();
            getMBleParser().reset();
            if (this.mNotified) {
                this.mNotified = false;
                if (z && (xX0XO01i = this.mBleGattCallback) != null) {
                    xX0XO01i.onConnectionStateChange(false);
                }
            }
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt != null) {
                if (this.isRefreshDeviceCache) {
                    Intrinsics.XXI(bluetoothGatt);
                    bluetoothGatt.disconnect();
                    OIi0();
                }
                BluetoothGatt bluetoothGatt2 = this.mBluetoothGatt;
                Intrinsics.XXI(bluetoothGatt2);
                bluetoothGatt2.close();
                this.mBluetoothGatt = null;
            }
            if (z) {
                this.mTargetAddress = "";
                connect(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void connect(boolean z) {
        try {
            if (isConnecting() == z) {
                return;
            }
            i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " connect -> " + z);
            setConnecting(z);
            this.mRetry = 0;
            if (!z) {
                OXOI0XII oxoi0xii = this.mScanner;
                if (oxoi0xii != null) {
                    oxoi0xii.XXI(false);
                }
                this.mHandler.removeCallbacks(this.mReconnection);
            } else if (this.isAutoReconnect) {
                this.mHandler.post(this.mReconnection);
            } else {
                m11125iO();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void exit() {
        try {
            i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " -> exit");
            OXOI0XII oxoi0xii = this.mScanner;
            if (oxoi0xii != null) {
                oxoi0xii.XIi00iiXO();
            }
            closeConnection(true);
            getMContext().unregisterReceiver(IiI10X());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @aa1
    public final String getAddress() {
        String str = this.mTargetAddress;
        return str == null ? "" : str;
    }

    @tb1
    public final BluetoothGattCharacteristic getCharacteristic(@aa1 String serviceUuid, @aa1 String characteristicUuid) {
        Intrinsics.X0O(serviceUuid, "serviceUuid");
        Intrinsics.X0O(characteristicUuid, "characteristicUuid");
        if (this.mBluetoothGatt == null || TextUtils.isEmpty(serviceUuid) || TextUtils.isEmpty(characteristicUuid)) {
            return null;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        Intrinsics.XXI(bluetoothGatt);
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(serviceUuid));
        if (service == null) {
            i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getCharacteristic -> service(" + serviceUuid + ")=null");
            return null;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(characteristicUuid));
        if (characteristic != null) {
            return characteristic;
        }
        i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getCharacteristic -> service(" + serviceUuid + "), characteristic(" + characteristicUuid + ")=null");
        return null;
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
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
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
    public final BluetoothGattDescriptor getNotifyDescriptor(@tb1 BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getNotifyDescriptor -> characteristic=null");
            return null;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor != null) {
            return descriptor;
        }
        i1O0OXO1O.OXO1.XOO0ii0(getLOG_HEADER() + " getNotifyDescriptor -> descriptor=null");
        return null;
    }

    public int getWriteType() {
        return -1;
    }

    /* JADX INFO: renamed from: iO */
    public final void m11125iO() {
        i1O0OXO1O.OXO1.OXO1(getLOG_HEADER() + " connectGatt");
        try {
            BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(this.mTargetAddress);
            Intrinsics.O10IXXX0X(remoteDevice, "getRemoteDevice(...)");
            this.mBluetoothGatt = XO0O10(remoteDevice);
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO(getLOG_HEADER() + " connect Exception");
            e.printStackTrace();
        }
    }

    @aa1
    @SuppressLint({"WrongConstant"})
    public final AbsBleConnector init(@aa1 Context context, @aa1 XX0XO01i bleGattCallback) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(bleGattCallback, "bleGattCallback");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.O10IXXX0X(applicationContext, "getApplicationContext(...)");
        setMContext(applicationContext);
        this.mBleGattCallback = bleGattCallback;
        this.mScanner = ut3.XIi00iiXO(ut3.OXO1, null, null, 3, null).XiOIO(this.mScanFilter).iIiiO(false).X1ii(new XIi00iiXO());
        getMBleMessenger().setMAbsBleConnector(this);
        if (Build.VERSION.SDK_INT >= 34) {
            ContextCompat.registerReceiver(context, IiI10X(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
            return this;
        }
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
    public final AbsBleConnector setAddress(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        this.mTargetAddress = address;
        this.mScanFilter.m841iO(address);
        return this;
    }

    public final void setAutoReconnect(boolean z) {
        this.isAutoReconnect = z;
    }

    @aa1
    public final AbsBleConnector setBleDevice(@aa1 BleDevice bleDevice, int i) {
        Intrinsics.X0O(bleDevice, "bleDevice");
        this.mTransport = i;
        return setBluetoothDevice(bleDevice.getMBluetoothDevice());
    }

    @aa1
    public final AbsBleConnector setBluetoothDevice(@aa1 BluetoothDevice bluetoothDevice) {
        Intrinsics.X0O(bluetoothDevice, "bluetoothDevice");
        String address = bluetoothDevice.getAddress();
        Intrinsics.O10IXXX0X(address, "getAddress(...)");
        return setAddress(address);
    }

    public void setConnecting(boolean z) {
        this.isConnecting = z;
    }

    public final void setDisableStreamLog(boolean z) {
        this.disableStreamLog = z;
    }

    public final void setForceConnectDirectly(boolean z) {
        this.mForceConnectDirectly = z;
        this.mReconnectMaxPeriod = z ? 20 : 30;
    }

    public final void setMBleGattCallback(@tb1 XX0XO01i xX0XO01i) {
        this.mBleGattCallback = xX0XO01i;
    }

    public final void setMBluetoothGatt(@tb1 BluetoothGatt bluetoothGatt) {
        this.mBluetoothGatt = bluetoothGatt;
    }

    public final void setMConnectDirectly(boolean z) {
        this.mConnectDirectly = z;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMForceConnectDirectly(boolean z) {
        this.mForceConnectDirectly = z;
    }

    public final void setMMtu(int i) {
        this.mMtu = i;
    }

    public final void setMReconnectBasePeriod(int i) {
        this.mReconnectBasePeriod = i;
    }

    public final void setMReconnectMaxPeriod(int i) {
        this.mReconnectMaxPeriod = i;
    }

    public final void setMScanMaxDuration(int i) {
        this.mScanMaxDuration = i;
    }

    public final void setMScanMode(@aa1 ScanMode scanMode) {
        Intrinsics.X0O(scanMode, "<set-?>");
        this.mScanMode = scanMode;
    }

    public final void setMTargetAddress(@tb1 String str) {
        this.mTargetAddress = str;
    }

    public final void setMTimeout(long j) {
        this.mTimeout = j;
    }

    public final void setMTransport(int i) {
        this.mTransport = i;
    }

    public final void setReconnectMaxPeriod(int i) {
        this.mReconnectMaxPeriod = i;
    }

    public final void setRefreshDeviceCache(boolean z) {
        this.isRefreshDeviceCache = z;
    }

    public final void setScanMaxDuration(int i) {
        this.mScanMaxDuration = i;
    }

    public final void setScanMode(@aa1 ScanMode mode) {
        Intrinsics.X0O(mode, "mode");
        this.mScanMode = mode;
    }

    public final void setTimeout(long j) {
        this.mTimeout = j;
    }

    public final void isAutoReconnect(boolean z) {
        this.isAutoReconnect = z;
    }
}
