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
import com.goodix.ble.libcomx.transceiver.IFrameSender;
import com.goodix.ble.p595gr.libdfu.EasyDfu;
import com.ironsource.C12616d4;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class DfuConnection {
    public static final String I0iXXO = "GoodixDfu";
    public static final int I1XOi1 = 247;
    public Context IiI10X;
    public BluetoothGattCharacteristic OXO1;
    public BluetoothGattCharacteristic XIi00iiXO;
    public OIO1Xii1 XO0O10;

    /* JADX INFO: renamed from: iO */
    public BluetoothDevice f55294iO;
    public static final UUID XXI = UUID.fromString("a6ed0401-d344-460a-8075-b9e8ec90d71b");
    public static final UUID X1ii = UUID.fromString("a6ed0402-d344-460a-8075-b9e8ec90d71b");
    public static final UUID O10IXXX0X = UUID.fromString("a6ed0403-d344-460a-8075-b9e8ec90d71b");
    public static final UUID X0O = UUID.fromString("a6ed0404-d344-460a-8075-b9e8ec90d71b");
    public EasyDfu O00 = new EasyDfu();
    public MutableLiveData<ConnState> XOO0ii0 = new MutableLiveData<>();
    public MutableLiveData<String> I0IIOi = new MutableLiveData<>();
    public Handler OIi0 = new Handler();

    /* JADX INFO: renamed from: IO */
    public IFrameSender f55293IO = new OXO1();
    public iIIII0XX OIX0iXi = new XIi00iiXO();

    public enum ConnState {
        CONNECTING,
        CONNECTED,
        INIT,
        READY,
        DISCONNECTING,
        DISCONNECTED
    }

    public class OXO1 implements IFrameSender {
        public OXO1() {
        }

        @Override // com.goodix.ble.libcomx.transceiver.IFrameSender
        public boolean sendFrame(byte[] bArr) {
            if (DfuConnection.this.XOO0ii0.getValue() != ConnState.READY) {
                return false;
            }
            Log.v(DfuConnection.I0iXXO, "sendFrame()" + X1O1O.IiI10X(bArr));
            DfuConnection.this.XIi00iiXO.setValue(bArr);
            DfuConnection.this.XO0O10.O10IXXX0X(DfuConnection.this.XIi00iiXO, bArr, DfuConnection.this.XIi00iiXO.getWriteType());
            return true;
        }
    }

    public class XIi00iiXO implements iIIII0XX {

        public class OXO1 implements Runnable {
            public OXO1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                DfuConnection.this.XO0O10.OIi0(247);
            }
        }

        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void I0IIOi(BluetoothGatt bluetoothGatt) {
            Log.d(DfuConnection.I0iXXO, "onBleServicesDiscovered() called with: gatt = [" + bluetoothGatt + C12616d4.j.f34442e);
            BluetoothGattService service = bluetoothGatt.getService(DfuConnection.XXI);
            if (service != null) {
                DfuConnection.this.OXO1 = service.getCharacteristic(DfuConnection.X1ii);
                DfuConnection.this.XIi00iiXO = service.getCharacteristic(DfuConnection.O10IXXX0X);
            }
            if (DfuConnection.this.OXO1 == null || DfuConnection.this.XIi00iiXO == null) {
                DfuConnection.this.I0IIOi.postValue("Device Not Support");
                DfuConnection.this.IIX1OXO();
            } else {
                DfuConnection.this.XO0O10.I0iXXO(DfuConnection.this.OXO1);
                DfuConnection.this.XOO0ii0.postValue(ConnState.INIT);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void IiI10X() {
            Log.d(DfuConnection.I0iXXO, "onBleConnected() called");
            DfuConnection.this.XOO0ii0.postValue(ConnState.CONNECTED);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void O00(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Log.d(DfuConnection.I0iXXO, "onBleCharacteristicWriteComplete() called with: characteristic = [" + bluetoothGattCharacteristic.getUuid() + C12616d4.j.f34442e + X1O1O.IiI10X(bluetoothGattCharacteristic.getValue()));
            DfuConnection.this.O00.onSentPduSegment();
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void OIi0() {
            Log.d(DfuConnection.I0iXXO, "onBleNotifyEnable() called");
            DfuConnection.this.OIi0.postDelayed(new OXO1(), 2000L);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void OXO1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Log.d(DfuConnection.I0iXXO, "onBleCharacteristicNotify() called with: characteristic = [" + bluetoothGattCharacteristic.getUuid() + C12616d4.j.f34442e + X1O1O.IiI10X(bluetoothGattCharacteristic.getValue()));
            if (bluetoothGattCharacteristic.equals(DfuConnection.this.OXO1)) {
                DfuConnection.this.O00.onRcvPduSegment(bluetoothGattCharacteristic.getValue());
            }
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void XIi00iiXO(String str) {
            Log.d(DfuConnection.I0iXXO, "onBleTimeOut() called with: type = [" + str + C12616d4.j.f34442e);
            DfuConnection.this.I0IIOi.postValue("onBleTimeOut() called with: type = [" + str + C12616d4.j.f34442e);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void XO0O10(String str, int i) {
            Log.d(DfuConnection.I0iXXO, "onBleError() called with: message = [" + str + "], errorCode = [" + i + C12616d4.j.f34442e);
            DfuConnection.this.I0IIOi.postValue(str);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        public void XOO0ii0(int i) {
            Log.d(DfuConnection.I0iXXO, "onBleMtuChanged() called with: mtu = [" + i + C12616d4.j.f34442e);
            DfuConnection.this.O00.setMaxSegmentSize(i + (-3));
            DfuConnection.this.XOO0ii0.postValue(ConnState.READY);
        }

        @Override // com.android.mltcode.paycertificationapi.iIIII0XX
        /* JADX INFO: renamed from: iO */
        public void mo2079iO() {
            Log.d(DfuConnection.I0iXXO, "onBleDisconnected() called");
            DfuConnection.this.XOO0ii0.postValue(ConnState.DISCONNECTED);
        }
    }

    public DfuConnection(Context context) {
        this.IiI10X = context;
        this.XO0O10 = new OIO1Xii1(context, this.OIX0iXi);
        this.O00.setPduSender(this.f55293IO);
    }

    public void I1XOi1() {
        if (this.f55294iO == null) {
            return;
        }
        this.XOO0ii0.postValue(ConnState.CONNECTING);
        this.XO0O10.m861IO(this.f55294iO, false, 30000);
    }

    public void IIX1OXO() {
        if (this.f55294iO == null) {
            return;
        }
        this.XOO0ii0.postValue(ConnState.DISCONNECTING);
        this.XO0O10.OIX0iXi();
    }

    public EasyDfu O10IXXX0X() {
        return this.O00;
    }

    public LiveData<String> X0O() {
        return this.I0IIOi;
    }

    public BluetoothDevice X1ii() {
        return this.f55294iO;
    }

    public LiveData<ConnState> XXI() {
        return this.XOO0ii0;
    }

    public void XiOIO(BluetoothDevice bluetoothDevice) {
        this.f55294iO = bluetoothDevice;
    }

    public DfuConnection(Context context, BluetoothDevice bluetoothDevice) {
        this.IiI10X = context;
        this.XO0O10 = new OIO1Xii1(context, this.OIX0iXi);
        this.f55294iO = bluetoothDevice;
        this.O00.setPduSender(this.f55293IO);
    }
}
