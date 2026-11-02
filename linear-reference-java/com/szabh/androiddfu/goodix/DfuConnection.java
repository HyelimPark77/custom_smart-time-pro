package com.szabh.androiddfu.goodix;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.android.mltcode.paycertificationapi.OIO1Xii1;
import com.android.mltcode.paycertificationapi.X1O1O;
import com.android.mltcode.paycertificationapi.iIIII0XX;
import com.goodix.ble.gr.libdfu.EasyDfu;
import com.goodix.ble.libcomx.transceiver.IFrameSender;
import com.ironsource.C2985d4;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class DfuConnection {
    public static final String I0iXXO = "GoodixDfu";
    public static final int I1XOi1 = 247;
    public static final UUID O10IXXX0X = null;
    public static final UUID X0O = null;
    public static final UUID X1ii = null;
    public static final UUID XXI = null;
    public MutableLiveData<String> I0IIOi;
    public IFrameSender IO;
    public Context IiI10X;
    public EasyDfu O00;
    public iIIII0XX OIX0iXi;
    public Handler OIi0;
    public BluetoothGattCharacteristic OXO1;
    public BluetoothGattCharacteristic XIi00iiXO;
    public OIO1Xii1 XO0O10;
    public MutableLiveData<ConnState> XOO0ii0;
    public BluetoothDevice iO;

    public static final enum ConnState extends Enum<ConnState> {
        private static final /* synthetic */ ConnState[] $VALUES = null;
        public static final ConnState CONNECTED = null;
        public static final ConnState CONNECTING = null;
        public static final ConnState DISCONNECTED = null;
        public static final ConnState DISCONNECTING = null;
        public static final ConnState INIT = null;
        public static final ConnState READY = null;

        private static /* synthetic */ ConnState[] $values() {
            return new ConnState[]{CONNECTING, CONNECTED, INIT, READY, DISCONNECTING, DISCONNECTED};
        }

        static {
            CONNECTING = new ConnState("CONNECTING", 0);
            CONNECTED = new ConnState("CONNECTED", 1);
            INIT = new ConnState("INIT", 2);
            READY = new ConnState("READY", 3);
            DISCONNECTING = new ConnState("DISCONNECTING", 4);
            DISCONNECTED = new ConnState("DISCONNECTED", 5);
            $VALUES = $values();
        }

        private ConnState(String r1, int r2) {
            super(r1, r2);
        }

        public static ConnState valueOf(String r1) {
            return (ConnState) Enum.valueOf(ConnState.class, r1);
        }

        public static ConnState[] values() {
            return (ConnState[]) $VALUES.clone();
        }
    }

    public class OXO1 implements IFrameSender {
        public final /* synthetic */ DfuConnection IO;

        public OXO1(DfuConnection r1) {
            this.IO = r1;
        }

        @Override // com.goodix.ble.libcomx.transceiver.IFrameSender
        public boolean sendFrame(byte[] r4) {
            if (DfuConnection.OXO1(this.IO).getValue() != ConnState.READY) goto L6;
            Log.v(DfuConnection.I0iXXO, "sendFrame()" + X1O1O.IiI10X(r4));
            DfuConnection.XIi00iiXO(this.IO).setValue(r4);
            DfuConnection.XO0O10(this.IO).O10IXXX0X(DfuConnection.XIi00iiXO(this.IO), r4, DfuConnection.XIi00iiXO(this.IO).getWriteType());
            return true;
        L6:
            return false;
        }
    }

    public class XIi00iiXO implements iIIII0XX {
        public final /* synthetic */ DfuConnection OXO1;

        public class OXO1 implements Runnable {
            public final /* synthetic */ XIi00iiXO IO;

            public OXO1(XIi00iiXO r1) {
                this.IO = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                DfuConnection.XO0O10(this.IO.OXO1).OIi0(247);
            }
        }

        public XIi00iiXO(DfuConnection r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void I0IIOi(BluetoothGatt r3) {
            Log.d(DfuConnection.I0iXXO, "onBleServicesDiscovered() called with: gatt = [" + r3 + C2985d4.j.e);
            BluetoothGattService r4 = r3.getService(DfuConnection.O00());
            if (r4 == null) goto L6;
            DfuConnection.XOO0ii0(this.OXO1, r4.getCharacteristic(DfuConnection.I0IIOi()));
            DfuConnection.iO(this.OXO1, r4.getCharacteristic(DfuConnection.OIi0()));
        L6:
            if (DfuConnection.IiI10X(this.OXO1) != null) goto L8;
        L11:
            DfuConnection.IO(this.OXO1).postValue("Device Not Support");
            this.OXO1.IIX1OXO();
            return;
        L8:
            if (DfuConnection.XIi00iiXO(this.OXO1) == null) goto L11;
            DfuConnection.XO0O10(this.OXO1).I0iXXO(DfuConnection.IiI10X(this.OXO1));
            DfuConnection.OXO1(this.OXO1).postValue(ConnState.INIT);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void IiI10X() {
            Log.d(DfuConnection.I0iXXO, "onBleConnected() called");
            DfuConnection.OXO1(this.OXO1).postValue(ConnState.CONNECTED);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void O00(BluetoothGattCharacteristic r3) {
            Log.d(DfuConnection.I0iXXO, "onBleCharacteristicWriteComplete() called with: characteristic = [" + r3.getUuid() + C2985d4.j.e + X1O1O.IiI10X(r3.getValue()));
            DfuConnection.OIX0iXi(this.OXO1).onSentPduSegment();
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void OIi0() {
            Log.d(DfuConnection.I0iXXO, "onBleNotifyEnable() called");
            DfuConnection.I0iXXO(this.OXO1).postDelayed(new OXO1(this), 2000);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void OXO1(BluetoothGattCharacteristic r3) {
            Log.d(DfuConnection.I0iXXO, "onBleCharacteristicNotify() called with: characteristic = [" + r3.getUuid() + C2985d4.j.e + X1O1O.IiI10X(r3.getValue()));
            if (r3.equals(DfuConnection.IiI10X(this.OXO1)) == false) goto L6;
            DfuConnection.OIX0iXi(this.OXO1).onRcvPduSegment(r3.getValue());
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void XIi00iiXO(String r5) {
            Log.d(DfuConnection.I0iXXO, "onBleTimeOut() called with: type = [" + r5 + C2985d4.j.e);
            DfuConnection.IO(this.OXO1).postValue("onBleTimeOut() called with: type = [" + r5 + C2985d4.j.e);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void XO0O10(String r3, int r4) {
            Log.d(DfuConnection.I0iXXO, "onBleError() called with: message = [" + r3 + "], errorCode = [" + r4 + C2985d4.j.e);
            DfuConnection.IO(this.OXO1).postValue(r3);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void XOO0ii0(int r3) {
            Log.d(DfuConnection.I0iXXO, "onBleMtuChanged() called with: mtu = [" + r3 + C2985d4.j.e);
            DfuConnection.OIX0iXi(this.OXO1).setMaxSegmentSize(r3 + (-3));
            DfuConnection.OXO1(this.OXO1).postValue(ConnState.READY);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void iO() {
            Log.d(DfuConnection.I0iXXO, "onBleDisconnected() called");
            DfuConnection.OXO1(this.OXO1).postValue(ConnState.DISCONNECTED);
        }
    }

    static {
        XXI = UUID.fromString("a6ed0401-d344-460a-8075-b9e8ec90d71b");
        X1ii = UUID.fromString("a6ed0402-d344-460a-8075-b9e8ec90d71b");
        O10IXXX0X = UUID.fromString("a6ed0403-d344-460a-8075-b9e8ec90d71b");
        X0O = UUID.fromString("a6ed0404-d344-460a-8075-b9e8ec90d71b");
    }

    public DfuConnection(Context r3) {
        this.O00 = new EasyDfu();
        this.XOO0ii0 = new MutableLiveData();
        this.I0IIOi = new MutableLiveData();
        this.OIi0 = new Handler();
        this.IO = new OXO1(this);
        this.OIX0iXi = new XIi00iiXO(this);
        this.IiI10X = r3;
        this.XO0O10 = new OIO1Xii1(r3, this.OIX0iXi);
        setPduSender(this.IO);
    }

    public static /* synthetic */ UUID I0IIOi() {
        return X1ii;
    }

    public static /* synthetic */ Handler I0iXXO(DfuConnection r0) {
        return r0.OIi0;
    }

    public static /* synthetic */ MutableLiveData IO(DfuConnection r0) {
        return r0.I0IIOi;
    }

    public static /* synthetic */ BluetoothGattCharacteristic IiI10X(DfuConnection r0) {
        return r0.OXO1;
    }

    public static /* synthetic */ UUID O00() {
        return XXI;
    }

    public static /* synthetic */ EasyDfu OIX0iXi(DfuConnection r0) {
        return r0.O00;
    }

    public static /* synthetic */ UUID OIi0() {
        return O10IXXX0X;
    }

    public static /* synthetic */ MutableLiveData OXO1(DfuConnection r0) {
        return r0.XOO0ii0;
    }

    public static /* synthetic */ BluetoothGattCharacteristic XIi00iiXO(DfuConnection r0) {
        return r0.XIi00iiXO;
    }

    public static /* synthetic */ OIO1Xii1 XO0O10(DfuConnection r0) {
        return r0.XO0O10;
    }

    public static /* synthetic */ BluetoothGattCharacteristic XOO0ii0(DfuConnection r0, BluetoothGattCharacteristic r1) {
        r0.OXO1 = r1;
        return r1;
    }

    public static /* synthetic */ BluetoothGattCharacteristic iO(DfuConnection r0, BluetoothGattCharacteristic r1) {
        r0.XIi00iiXO = r1;
        return r1;
    }

    public void I1XOi1() {
        if (this.iO != null) goto L5;
        return;
    L5:
        postValue(ConnState.CONNECTING);
        IO(this.iO, false, 30000);
    }

    public void IIX1OXO() {
        if (this.iO != null) goto L5;
        return;
    L5:
        postValue(ConnState.DISCONNECTING);
        OIX0iXi();
    }

    public EasyDfu O10IXXX0X() {
        return this.O00;
    }

    public LiveData<String> X0O() {
        return this.I0IIOi;
    }

    public BluetoothDevice X1ii() {
        return this.iO;
    }

    public LiveData<ConnState> XXI() {
        return this.XOO0ii0;
    }

    public void XiOIO(BluetoothDevice r1) {
        this.iO = r1;
    }

    public DfuConnection(Context r3, BluetoothDevice r4) {
        this.O00 = new EasyDfu();
        this.XOO0ii0 = new MutableLiveData();
        this.I0IIOi = new MutableLiveData();
        this.OIi0 = new Handler();
        this.IO = new OXO1(this);
        this.OIX0iXi = new XIi00iiXO(this);
        this.IiI10X = r3;
        this.XO0O10 = new OIO1Xii1(r3, this.OIX0iXi);
        this.iO = r4;
        setPduSender(this.IO);
    }
}
