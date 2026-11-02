package com.jieli.jl_bt_ota.model.response.device;

import android.bluetooth.BluetoothAdapter;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class BleInfo implements IDataOp {
    private String bleAddr;
    private boolean bleOnly;
    private boolean isBLEToSppWay;

    public BleInfo() {
    }

    public String getBleAddr() {
        return this.bleAddr;
    }

    public boolean isBLEToSppWay() {
        return this.isBLEToSppWay;
    }

    public boolean isBleOnly() {
        return this.bleOnly;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r4) {
        if (r4 != null) goto L5;
    L16:
        return 0;
    L5:
        if (r4.length < 7) goto L16;
        ByteBuffer r5 = ByteBuffer.wrap(r4);
        boolean r2 = true;
        if (CHexConver.byteToInt(r5.get()) == 1) goto L11;
        r2 = false;
    L11:
        setBleOnly(r2);
        byte[] r1 = new byte[6];
        r5.get(r1);
        setBleAddr(CHexConver.hexDataCovetToAddress(r1));
        if (r5.hasRemaining() == false) goto L15;
        setBLEToSppWay(CHexConver.checkBitValue(r5.get(), 0));
    L15:
        return r5.position();
    }

    public BleInfo setBLEToSppWay(boolean r1) {
        this.isBLEToSppWay = r1;
        return this;
    }

    public BleInfo setBleAddr(String r1) {
        this.bleAddr = r1;
        return this;
    }

    public BleInfo setBleOnly(boolean r1) {
        this.bleOnly = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
    L7:
        e = move-exception;
        e.printStackTrace();
    L10:
        return r0.toByteArray();
    L4:
        if (BluetoothAdapter.checkBluetoothAddress(this.bleAddr) == false) goto L10;
        r0.write(this.bleOnly ? 1 : 0);     // Catch: IOException -> L7
        r0.write(CHexConver.addressCovertToByteArray(this.bleAddr));     // Catch: IOException -> L7
        r0.write(CHexConver.setBitValue((byte) 0, 0, this.isBLEToSppWay));     // Catch: IOException -> L7
        goto L10
    }

    public String toString() {
        return "BleInfo{bleOnly=" + this.bleOnly + ", bleAddr='" + this.bleAddr + "', isBLEToSppWay=" + this.isBLEToSppWay + i0XO1.IO;
    }
}
