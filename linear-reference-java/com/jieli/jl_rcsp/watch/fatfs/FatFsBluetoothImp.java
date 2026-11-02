package com.jieli.jl_rcsp.watch.fatfs;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.IBluetoothCtrl;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.WatchCacheManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class FatFsBluetoothImp implements IBluetoothCtrl {
    public static final String e = "FatFsBluetoothImp";
    public final RcspOpImpl a;
    public final FatFsWatch b;
    public final DeviceStatusManager c;
    public final WatchCacheManager d;

    static {
    }

    public FatFsBluetoothImp(FatFsWatch r2) {
        this.c = DeviceStatusManager.getInstance();
        this.b = r2;
        this.a = r2.getRcspOp();
        this.d = new WatchCacheManager();
    }

    public static /* synthetic */ void a(FatFsBluetoothImp r0, BluetoothDevice r1, boolean r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void b(FatFsBluetoothImp r0, BluetoothDevice r1) {
        r0.a(r1);
    }

    public final int c(BluetoothDevice r2) {
        ExternalFlashMsgResponse r3 = this.c.getExtFlashMsg(r2);
        if (r3 != null) goto L7;
        return 0;
    L7:
        return r3.getCluster();
    }

    public final int d(BluetoothDevice r2) {
        ExternalFlashMsgResponse r3 = this.c.getExtFlashMsg(r2);
        if (r3 != null) goto L7;
        return 0;
    L7:
        return r3.getReceiveMtu();
    }

    public final FatFileSystem e(BluetoothDevice r2) {
        if (RcspUtil.deviceEquals(r2, this.a.getTargetDevice()) == true) goto L5;
        return null;
    L5:
        return this.b.getWatchSystem();
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public BluetoothDevice getConnectedDevice() {
        return this.a.getTargetDevice();
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void readFatDataFromDevice(BluetoothDevice r5, int r6, int r7) {
        String r0 = e;
        JL_Log.d(r0, "readFatDataFromDevice", RcspUtil.formatString("device = %s, offset = %d, size = %d", new Object[]{RcspUtil.printBtDeviceInfo(r5), Integer.valueOf(r6), Integer.valueOf(r7)}));
        FatFileSystem r1 = e(r5);
        if (r1 != null) goto L6;
        JL_Log.w(r0, "readFatDataFromDevice", "No Fat File System.");
        a(r5, false, new byte[0]);
        return;
    L6:
        r1.createReadBuffer(r7);
        a(r5, r6, r7);
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void release() {
        this.d.destroy();
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void sendWriteFlag(final BluetoothDevice r4, boolean r5) {
        String r0 = e;
        JL_Log.d(r0, "sendWriteFlag", RcspUtil.formatString("device = %s, writeFlag = %s", new Object[]{RcspUtil.printBtDeviceInfo(r4), Boolean.valueOf(r5)}));
        if (e(r4) != null) goto L6;
        JL_Log.w(r0, "sendWriteFlag", "No Fat File System.");
        a(r4, false);
        return;
    L6:
        this.b.sendWriteProtectFlag(r5, new AnonymousClass2(this, r4));
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void writeFatDataToDevice(BluetoothDevice r7, int r8, byte[] r9) {
        String r0 = e;
        JL_Log.d(r0, "writeFatDataToDevice", RcspUtil.formatString("device = %s, offset = %d, \ndata = %s", new Object[]{RcspUtil.printBtDeviceInfo(r7), Integer.valueOf(r8), CHexConver.byte2HexStr(r9)}));
        FatFileSystem r1 = e(r7);
        if (r1 != null) goto L6;
        a(r7, "writeFatDataToDevice", "No Fat File System.");
        return;
    L6:
        r1.setWriteBuffer(r9);
        if (a(r8) == false) goto L10;
        this.d.putWatchCacheByDevice(r7, new WatchCacheManager.WatchCache().setWriteOffset(r8).setWriteLen(r9.length).setCrc16(CryptoUtil.CRC16(r9, 0)));
    L10:
        if (d(r7) == 0) goto L16;
        int r3 = r1.getLeftDevSize();
        JL_Log.i(r0, "writeFatDataToDevice", "leftDevSize ==> " + r3);
        if (r3 <= 0) goto L14;
        r1.setNeedWriteData(r3);
        r9 = r1.getNeedSendLeftData();
    L14:
        b(r7, r8, r9);
        return;
    L16:
        a(r7, r8, r9);
    }

    public static /* synthetic */ FatFileSystem a(FatFsBluetoothImp r0, BluetoothDevice r1) {
        return r0.e(r1);
    }

    public static /* synthetic */ void b(FatFsBluetoothImp r0, BluetoothDevice r1, int r2, byte[] r3) {
        r0.b(r1, r2, r3);
    }

    public static /* synthetic */ void a(FatFsBluetoothImp r0, BluetoothDevice r1, boolean r2, byte[] r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void b(FatFsBluetoothImp r0, BluetoothDevice r1, boolean r2) {
        r0.b(r1, r2);
    }

    public static /* synthetic */ void a(FatFsBluetoothImp r0, BluetoothDevice r1, int r2, int r3) {
        r0.a(r1, r2, r3);
    }

    public final int b(BluetoothDevice r2) {
        ExternalFlashMsgResponse r3 = this.c.getExtFlashMsg(r2);
        if (r3 != null) goto L7;
        return 0;
    L7:
        return r3.getBlockSize();
    }

    public static /* synthetic */ void a(FatFsBluetoothImp r0, BluetoothDevice r1, String r2, String r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ String a() {
        return e;
    }

    public final void b(BluetoothDevice r4, boolean r5) {
        if (RcspUtil.deviceEquals(r4, this.a.getTargetDevice()) == false) goto L10;
        JL_Log.w(e, "updateWriteResult", "device : " + r4 + ", isSuccess : " + r5);
        if (this.b.getWatchSystem() == null) goto L9;
        this.b.getWatchSystem().updateWriteStatus(r5);
        return;
    L9:
        return;
    }

    public static /* synthetic */ void a(FatFsBluetoothImp r0, BluetoothDevice r1, int r2, byte[] r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ boolean a(FatFsBluetoothImp r0, int r1) {
        return r0.a(r1);
    }

    public static /* synthetic */ void a(FatFsBluetoothImp r0, BluetoothDevice r1, int r2) {
        r0.a(r1, r2);
    }

    public final void a(BluetoothDevice r4, int r5, byte[] r6) {
        int r0 = b(r4);
        if (r0 != 0) goto L6;
        a(r4, "handleWriteFatData", "mtu is 0.");
        return;
    L6:
        FatFileSystem r2 = e(r4);
        if (r2 != null) goto L9;
    L17:
        a(r4, "handleWriteFatData", "FatFs is null or write buffer is empty.");
        return;
    L9:
        if (r2.writeBufferIsEmpty() == true) goto L17;
        int r3 = 0;
        if (r6.length <= r0) goto L15;
        byte[] r1 = new byte[r0];
        System.arraycopy(r6, 0, r1, 0, r0);
        r3 = 1;
        r6 = r1;
    L15:
        a(r4, r3, r5, r6);
    }

    public final void b(BluetoothDevice r4, int r5, int r6, byte[] r7) {
        JL_Log.d(e, "writeDataToDeviceModify", "device =" + RcspUtil.printBtDeviceInfo(r4) + ", offset = " + r6 + ", flag = " + r5);
        this.a.sendRcspCommand(r4, CommandBuilder.buildExternalFlashWriteDataCmd(r5, r6, r7), new AnonymousClass4(this));
    }

    public final void b(BluetoothDevice r8, final int r9, final byte[] r10) {
        if (r10 != null) goto L5;
    L28:
        a(r8, "handleWriteFatDataModify", "data is null.");
        return;
    L5:
        if (r10.length == 0) goto L28;
        int r1 = b(r8);
        if (r1 != 0) goto L11;
        a(r8, "handleWriteFatDataModify", "mtu is 0.");
        return;
    L11:
        final FatFileSystem r2 = e(r8);
        if (r2 != null) goto L14;
    L26:
        a(r8, "handleWriteFatDataModify", "fatfs is null or write buffer is empty.");
        return;
    L14:
        if (r2.writeBufferIsEmpty() == true) goto L26;
        int r3 = r2.getLeftDevSize();
        JL_Log.i(e, "handleWriteFatDataModify", "lefDevSize = " + r3 + ", mtu = " + r1 + ", leftData length = " + r10.length);
        int r0 = 1;
        if (r3 >= r1) goto L21;
        this.a.sendRcspCommand(r8, CommandBuilder.buildExternalFlashQueryWriteResultCmd(1, CryptoUtil.CRC16(r2.getNeedWriteData(), 0)), new AnonymousClass5(this, r2, r9, r10));
        return;
    L21:
        if (r10.length > r1) goto L23;
        r0 = 1 ^ (r2.judgeWriteFinish(r10.length) ? 1 : 0);
    L24:
        b(r8, r0, r9, r10);
        return;
    L23:
        byte[] r4 = new byte[r1];
        System.arraycopy(r10, 0, r4, 0, r1);
        r10 = r4;
        goto L24
    }

    public final void a(BluetoothDevice r4, String r5) {
        JL_Log.w(e, "updateWriteFailed", "device : " + r4 + ", " + r5);
        b(r4, false);
    }

    public final void a(BluetoothDevice r1, String r2, String r3) {
        a(r1, RcspUtil.formatString("(%s) ---> %s", new Object[]{r2, r3}));
    }

    public final void a(BluetoothDevice r4, int r5, int r6, byte[] r7) {
        JL_Log.d(e, "writeDataToDevice", "device =" + RcspUtil.printBtDeviceInfo(r4) + ", offset = " + r6 + ", flag = " + r5);
        this.a.sendRcspCommand(r4, CommandBuilder.buildExternalFlashWriteDataCmd(r5, r6, r7), new AnonymousClass3(this));
    }

    public final void a(BluetoothDevice r11, final int r12) {
        final FatFileSystem r0 = e(r11);
        if (r0 != null) goto L6;
        a(r11, "queryWriteDataResult", "No Fat File System.");
        return;
    L6:
        int r2 = 0;
        if (r12 != 1) goto L9;
        short r3 = CryptoUtil.CRC16(r0.getNeedWriteData(), 0);
        r2 = 1;
    L10:
        JL_Log.i(e, "queryWriteDataResult", RcspUtil.formatString("version = %d, crc16 = %d(0x%X), flag = %d.", new Object[]{Integer.valueOf(r12), Short.valueOf(r3), Short.valueOf(r3), Integer.valueOf(r2)}));
        this.a.sendRcspCommand(r11, CommandBuilder.buildExternalFlashQueryWriteResultCmd(r2, r3), new AnonymousClass6(this, r12, r0));
        return;
    L9:
        r3 = r0.getCrc16();
        goto L10
    }

    public final void a(BluetoothDevice r4) {
        FatFileSystem r0 = e(r4);
        if (r0 != null) goto L6;
        a(r4, "checkWriteDataResult", "No Fat File System.");
        return;
    L6:
        WatchCacheManager.WatchCache r2 = this.d.getWatchCacheByDevice(r4);
        if (r2 != null) goto L10;
        a(r4, "checkWriteDataResult", "No write data cache.");
        return;
    L10:
        r2.setNeedCheckReadData(true);
        r0.createReadBuffer(r2.getWriteLen());
        a(r4, r2.getWriteOffset(), r2.getWriteLen());
    }

    public final void a(BluetoothDevice r7, int r8, int r9) {
        int r0 = d(r7);
        if (r0 != 0) goto L6;
        r0 = b(r7);
    L6:
        if (r0 != 0) goto L9;
        JL_Log.w(e, "handleReadData", "mtu is 0.");
        a(r7, false, new byte[0]);
        return;
    L9:
        JL_Log.d(e, "handleReadData", "offset = " + r8 + ", size = " + r9);
        if (r9 > r0) goto L13;
        a(r7, 0, r8, r9);
        return;
    L13:
        a(r7, 1, r8, r0);
    }

    public final void a(BluetoothDevice r7, boolean r8, byte[] r9) {
        FatFileSystem r0 = e(r7);
        if (r0 != null) goto L5;
        return;
    L5:
        String r1 = e;
        JL_Log.d(r1, "updateReadResult", "device : " + RcspUtil.printBtDeviceInfo(r7) + ", isSuccess : " + r8);
        if (WatchConstant.ENABLE_WRITE_DATA_CHECK == true) goto L8;
    L20:
        r0.updateReadStatus(r8, r9);
        return;
    L8:
        if (this.d.isNeedCheckReadData(r7) == false) goto L20;
        WatchCacheManager.WatchCache r2 = this.d.removeWatchCacheByDevice(r7);
        int r3 = 0;
        if (r8 == false) goto L18;
        short r10 = CryptoUtil.CRC16(r9, 0);
        JL_Log.i(r1, "updateReadResult", "readCrc16 : " + r10 + ", cacheCrc16 : " + r2.getCrc16() + ", cache offset = " + r2.getWriteOffset());
        if (r2.getCrc16() != r10) goto L18;
        if (d(r7) == 0) goto L16;
        r3 = 1;
    L16:
        a(r7, r3);
        return;
    L18:
        JL_Log.w(r1, "updateReadResult", "isSuccess : " + r8 + ", crc is error. ");
        b(r7, false);
    }

    public final void a(BluetoothDevice r6, int r7, int r8, int r9) {
        JL_Log.d(e, "readDataFromDevice", RcspUtil.formatString("device = %s, flag = %d, offset=%d, size=%s", new Object[]{RcspUtil.printBtDeviceInfo(r6), Integer.valueOf(r7), Integer.valueOf(r8), Integer.valueOf(r9)}));
        this.a.sendRcspCommand(r6, CommandBuilder.buildExternalFlashReadDataCmd(r7, r8, r9), new AnonymousClass7(this));
    }

    public final void a(BluetoothDevice r1, boolean r2) {
        FatFileSystem r3 = e(r1);
        if (r3 != null) goto L5;
        return;
    L5:
        r3.updateFlagStatus(r2);
    }

    public final boolean a(int r2) {
        if (WatchConstant.ENABLE_WRITE_DATA_CHECK == true) goto L5;
        return false;
    L5:
        if (r2 >= 8192) goto L7;
        return false;
    L7:
        if (r2 > 16384) goto L13;
        return true;
    L13:
        return false;
    }
}
