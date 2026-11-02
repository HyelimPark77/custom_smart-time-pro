package com.jieli.jl_rcsp.watch.fatfs;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.IBluetoothCtrl;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.external_flash.ExtFlashIOCtrlNoResponseCmd;
import com.jieli.jl_rcsp.model.command.external_flash.ExternalFlashIOCtrlCmd;
import com.jieli.jl_rcsp.model.parameter.ExternalFlashIOCtrlParam;
import com.jieli.jl_rcsp.model.response.ExternalFlashIOCtrlResponse;
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

    /* JADX INFO: renamed from: e */
    public static final String f38410e = "FatFsBluetoothImp";

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f38411a;

    /* JADX INFO: renamed from: b */
    public final FatFsWatch f38412b;

    /* JADX INFO: renamed from: c */
    public final DeviceStatusManager f38413c = DeviceStatusManager.getInstance();

    /* JADX INFO: renamed from: d */
    public final WatchCacheManager f38414d = new WatchCacheManager();

    public FatFsBluetoothImp(FatFsWatch fatFsWatch) {
        this.f38412b = fatFsWatch;
        this.f38411a = fatFsWatch.getRcspOp();
    }

    /* JADX INFO: renamed from: c */
    public final int m27944c(BluetoothDevice bluetoothDevice) {
        ExternalFlashMsgResponse extFlashMsg = this.f38413c.getExtFlashMsg(bluetoothDevice);
        if (extFlashMsg == null) {
            return 0;
        }
        return extFlashMsg.getCluster();
    }

    /* JADX INFO: renamed from: d */
    public final int m27945d(BluetoothDevice bluetoothDevice) {
        ExternalFlashMsgResponse extFlashMsg = this.f38413c.getExtFlashMsg(bluetoothDevice);
        if (extFlashMsg == null) {
            return 0;
        }
        return extFlashMsg.getReceiveMtu();
    }

    /* JADX INFO: renamed from: e */
    public final FatFileSystem m27946e(BluetoothDevice bluetoothDevice) {
        if (RcspUtil.deviceEquals(bluetoothDevice, this.f38411a.getTargetDevice())) {
            return this.f38412b.getWatchSystem();
        }
        return null;
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public BluetoothDevice getConnectedDevice() {
        return this.f38411a.getTargetDevice();
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void readFatDataFromDevice(BluetoothDevice bluetoothDevice, int i, int i2) {
        String str = f38410e;
        JL_Log.m27877d(str, "readFatDataFromDevice", RcspUtil.formatString("device = %s, offset = %d, size = %d", RcspUtil.printBtDeviceInfo(bluetoothDevice), Integer.valueOf(i), Integer.valueOf(i2)));
        FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e == null) {
            JL_Log.m27887w(str, "readFatDataFromDevice", "No Fat File System.");
            m27938a(bluetoothDevice, false, new byte[0]);
        } else {
            fatFileSystemM27946e.createReadBuffer(i2);
            m27931a(bluetoothDevice, i, i2);
        }
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void release() {
        this.f38414d.destroy();
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void sendWriteFlag(final BluetoothDevice bluetoothDevice, boolean z) {
        String str = f38410e;
        JL_Log.m27877d(str, "sendWriteFlag", RcspUtil.formatString("device = %s, writeFlag = %s", RcspUtil.printBtDeviceInfo(bluetoothDevice), Boolean.valueOf(z)));
        if (m27946e(bluetoothDevice) != null) {
            this.f38412b.sendWriteProtectFlag(z, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsBluetoothImp.2
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    FatFsBluetoothImp.this.m27937a(bluetoothDevice, false);
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(Boolean bool) {
                    FatFsBluetoothImp.this.m27937a(bluetoothDevice, true);
                }
            });
        } else {
            JL_Log.m27887w(str, "sendWriteFlag", "No Fat File System.");
            m27937a(bluetoothDevice, false);
        }
    }

    @Override // com.jieli.jl_fatfs.interfaces.IBluetoothCtrl
    public void writeFatDataToDevice(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str = f38410e;
        JL_Log.m27877d(str, "writeFatDataToDevice", RcspUtil.formatString("device = %s, offset = %d, \ndata = %s", RcspUtil.printBtDeviceInfo(bluetoothDevice), Integer.valueOf(i), CHexConver.byte2HexStr(bArr)));
        FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e == null) {
            m27936a(bluetoothDevice, "writeFatDataToDevice", "No Fat File System.");
            return;
        }
        fatFileSystemM27946e.setWriteBuffer(bArr);
        if (m27939a(i)) {
            this.f38414d.putWatchCacheByDevice(bluetoothDevice, new WatchCacheManager.WatchCache().setWriteOffset(i).setWriteLen(bArr.length).setCrc16(CryptoUtil.CRC16(bArr, (short) 0)));
        }
        if (m27945d(bluetoothDevice) == 0) {
            m27934a(bluetoothDevice, i, bArr);
            return;
        }
        int leftDevSize = fatFileSystemM27946e.getLeftDevSize();
        JL_Log.m27883i(str, "writeFatDataToDevice", "leftDevSize ==> " + leftDevSize);
        if (leftDevSize > 0) {
            fatFileSystemM27946e.setNeedWriteData(leftDevSize);
            bArr = fatFileSystemM27946e.getNeedSendLeftData();
        }
        m27942b(bluetoothDevice, i, bArr);
    }

    /* JADX INFO: renamed from: b */
    public final int m27940b(BluetoothDevice bluetoothDevice) {
        ExternalFlashMsgResponse extFlashMsg = this.f38413c.getExtFlashMsg(bluetoothDevice);
        if (extFlashMsg == null) {
            return 0;
        }
        return extFlashMsg.getBlockSize();
    }

    /* JADX INFO: renamed from: b */
    public final void m27943b(BluetoothDevice bluetoothDevice, boolean z) {
        if (RcspUtil.deviceEquals(bluetoothDevice, this.f38411a.getTargetDevice())) {
            JL_Log.m27887w(f38410e, "updateWriteResult", "device : " + bluetoothDevice + ", isSuccess : " + z);
            if (this.f38412b.getWatchSystem() != null) {
                this.f38412b.getWatchSystem().updateWriteStatus(z);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27934a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        int iM27940b = m27940b(bluetoothDevice);
        if (iM27940b == 0) {
            m27936a(bluetoothDevice, "handleWriteFatData", "mtu is 0.");
            return;
        }
        FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e != null && !fatFileSystemM27946e.writeBufferIsEmpty()) {
            int i2 = 0;
            if (bArr.length > iM27940b) {
                byte[] bArr2 = new byte[iM27940b];
                System.arraycopy(bArr, 0, bArr2, 0, iM27940b);
                i2 = 1;
                bArr = bArr2;
            }
            m27933a(bluetoothDevice, i2, i, bArr);
            return;
        }
        m27936a(bluetoothDevice, "handleWriteFatData", "FatFs is null or write buffer is empty.");
    }

    /* JADX INFO: renamed from: b */
    public final void m27941b(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
        JL_Log.m27877d(f38410e, "writeDataToDeviceModify", "device =" + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", offset = " + i2 + ", flag = " + i);
        this.f38411a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildExternalFlashWriteDataCmd(i, i2, bArr), new RcspCommandCallback<ExtFlashIOCtrlNoResponseCmd>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsBluetoothImp.4
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "writeDataToDeviceModify", "onErrCode ---> " + baseError);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice2, ExtFlashIOCtrlNoResponseCmd extFlashIOCtrlNoResponseCmd) {
                FatFileSystem fatFileSystemM27946e = FatFsBluetoothImp.this.m27946e(bluetoothDevice2);
                if (fatFileSystemM27946e == null || fatFileSystemM27946e.writeBufferIsEmpty()) {
                    FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "writeDataToDeviceModify", "fatFs is null or write buffer is empty.");
                    return;
                }
                ExternalFlashIOCtrlParam externalFlashIOCtrlParam = (ExternalFlashIOCtrlParam) extFlashIOCtrlNoResponseCmd.getParam();
                int length = externalFlashIOCtrlParam.getData().length;
                JL_Log.m27877d(FatFsBluetoothImp.f38410e, "writeDataToDeviceModify", RcspUtil.formatString("device = %s, dataLen = %d, ctrlCmd = %s", RcspUtil.printBtDeviceInfo(bluetoothDevice2), Integer.valueOf(length), extFlashIOCtrlNoResponseCmd));
                fatFileSystemM27946e.callbackProgress(length);
                int offset = externalFlashIOCtrlParam.getOffset();
                if (externalFlashIOCtrlParam.getFlag() == 1) {
                    byte[] needSendLeftData = fatFileSystemM27946e.getNeedSendLeftData();
                    FatFsBluetoothImp.this.m27942b(bluetoothDevice2, offset + length, needSendLeftData);
                } else if (FatFsBluetoothImp.this.m27939a(offset)) {
                    FatFsBluetoothImp.this.m27929a(bluetoothDevice2);
                } else {
                    FatFsBluetoothImp.this.m27930a(bluetoothDevice2, 1);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m27942b(BluetoothDevice bluetoothDevice, final int i, final byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            int iM27940b = m27940b(bluetoothDevice);
            if (iM27940b == 0) {
                m27936a(bluetoothDevice, "handleWriteFatDataModify", "mtu is 0.");
                return;
            }
            final FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
            if (fatFileSystemM27946e != null && !fatFileSystemM27946e.writeBufferIsEmpty()) {
                int leftDevSize = fatFileSystemM27946e.getLeftDevSize();
                JL_Log.m27883i(f38410e, "handleWriteFatDataModify", "lefDevSize = " + leftDevSize + ", mtu = " + iM27940b + ", leftData length = " + bArr.length);
                int i2 = 1;
                if (leftDevSize < iM27940b) {
                    this.f38411a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildExternalFlashQueryWriteResultCmd(1, CryptoUtil.CRC16(fatFileSystemM27946e.getNeedWriteData(), (short) 0)), new RcspCommandCallback<ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsBluetoothImp.5
                        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
                        public void onErrCode(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                            FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "handleWriteFatDataModify", "onErrCode ---> " + baseError);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
                        public void onCommandResponse(BluetoothDevice bluetoothDevice2, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                            JL_Log.m27883i(FatFsBluetoothImp.f38410e, "handleWriteFatDataModify", "onCommandResponse = " + externalFlashIOCtrlCmd);
                            ExternalFlashIOCtrlResponse externalFlashIOCtrlResponse = (ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse();
                            int status = externalFlashIOCtrlCmd.getStatus();
                            int result = externalFlashIOCtrlResponse.getResult();
                            if (status == 0 && result == 0) {
                                int size = externalFlashIOCtrlResponse.getSize();
                                if (size > 0) {
                                    fatFileSystemM27946e.setNeedWriteData(size);
                                    FatFsBluetoothImp.this.m27942b(bluetoothDevice2, i, bArr);
                                    return;
                                }
                                JL_Log.m27880e(FatFsBluetoothImp.f38410e, "handleWriteFatDataModify", "left size is zero. error data");
                            } else {
                                JL_Log.m27880e(FatFsBluetoothImp.f38410e, "handleWriteFatDataModify", RcspUtil.formatString("Device reply bad status(%d). result : %d.", Integer.valueOf(status), Integer.valueOf(result)));
                            }
                            FatFsBluetoothImp.this.m27943b(bluetoothDevice2, false);
                        }
                    });
                    return;
                }
                if (bArr.length <= iM27940b) {
                    i2 = 1 ^ (fatFileSystemM27946e.judgeWriteFinish(bArr.length) ? 1 : 0);
                } else {
                    byte[] bArr2 = new byte[iM27940b];
                    System.arraycopy(bArr, 0, bArr2, 0, iM27940b);
                    bArr = bArr2;
                }
                m27941b(bluetoothDevice, i2, i, bArr);
                return;
            }
            m27936a(bluetoothDevice, "handleWriteFatDataModify", "fatfs is null or write buffer is empty.");
            return;
        }
        m27936a(bluetoothDevice, "handleWriteFatDataModify", "data is null.");
    }

    /* JADX INFO: renamed from: a */
    public final void m27935a(BluetoothDevice bluetoothDevice, String str) {
        JL_Log.m27887w(f38410e, "updateWriteFailed", "device : " + bluetoothDevice + ", " + str);
        m27943b(bluetoothDevice, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m27936a(BluetoothDevice bluetoothDevice, String str, String str2) {
        m27935a(bluetoothDevice, RcspUtil.formatString("(%s) ---> %s", str, str2));
    }

    /* JADX INFO: renamed from: a */
    public final void m27933a(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
        JL_Log.m27877d(f38410e, "writeDataToDevice", "device =" + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", offset = " + i2 + ", flag = " + i);
        this.f38411a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildExternalFlashWriteDataCmd(i, i2, bArr), new RcspCommandCallback<ExtFlashIOCtrlNoResponseCmd>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsBluetoothImp.3
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "writeDataToDevice", RcspUtil.formatString("device = %s, error = %s", RcspUtil.printBtDeviceInfo(bluetoothDevice2), baseError));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice2, ExtFlashIOCtrlNoResponseCmd extFlashIOCtrlNoResponseCmd) {
                FatFileSystem fatFileSystemM27946e = FatFsBluetoothImp.this.m27946e(bluetoothDevice2);
                if (fatFileSystemM27946e == null || fatFileSystemM27946e.writeBufferIsEmpty()) {
                    FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "writeDataToDevice", "fatFs is null or write buffer is empty.");
                    return;
                }
                ExternalFlashIOCtrlParam externalFlashIOCtrlParam = (ExternalFlashIOCtrlParam) extFlashIOCtrlNoResponseCmd.getParam();
                int length = externalFlashIOCtrlParam.getData().length;
                JL_Log.m27877d(FatFsBluetoothImp.f38410e, "writeDataToDevice", RcspUtil.formatString("device = %s, ctrlCmd = %s, dataLen = %d", RcspUtil.printBtDeviceInfo(bluetoothDevice2), extFlashIOCtrlNoResponseCmd, Integer.valueOf(length)));
                fatFileSystemM27946e.callbackProgress(length);
                int offset = externalFlashIOCtrlParam.getOffset();
                if (externalFlashIOCtrlParam.isFinalData()) {
                    if (FatFsBluetoothImp.this.m27939a(offset)) {
                        FatFsBluetoothImp.this.m27929a(bluetoothDevice2);
                        return;
                    } else {
                        FatFsBluetoothImp.this.m27930a(bluetoothDevice2, 0);
                        return;
                    }
                }
                int i3 = length + offset;
                byte[] writeLeftData = fatFileSystemM27946e.getWriteLeftData();
                JL_Log.m27883i(FatFsBluetoothImp.f38410e, "writeDataToDevice", RcspUtil.formatString("oldOffset = %d, offset = %d", Integer.valueOf(offset), Integer.valueOf(i3)));
                FatFsBluetoothImp.this.m27934a(bluetoothDevice2, i3, writeLeftData);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27930a(BluetoothDevice bluetoothDevice, final int i) {
        short crc16;
        final FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e == null) {
            m27936a(bluetoothDevice, "queryWriteDataResult", "No Fat File System.");
            return;
        }
        int i2 = 0;
        if (i == 1) {
            crc16 = CryptoUtil.CRC16(fatFileSystemM27946e.getNeedWriteData(), (short) 0);
            i2 = 1;
        } else {
            crc16 = fatFileSystemM27946e.getCrc16();
        }
        JL_Log.m27883i(f38410e, "queryWriteDataResult", RcspUtil.formatString("version = %d, crc16 = %d(0x%X), flag = %d.", Integer.valueOf(i), Short.valueOf(crc16), Short.valueOf(crc16), Integer.valueOf(i2)));
        this.f38411a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildExternalFlashQueryWriteResultCmd(i2, crc16), new RcspCommandCallback<ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsBluetoothImp.6
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "queryWriteDataResult", "onErrCode ---> " + baseError);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice2, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                ExternalFlashIOCtrlResponse externalFlashIOCtrlResponse = (ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse();
                JL_Log.m27887w(FatFsBluetoothImp.f38410e, "queryWriteDataResult", "FlashQueryWriteResultCmd  = " + externalFlashIOCtrlCmd);
                int status = externalFlashIOCtrlCmd.getStatus();
                int result = externalFlashIOCtrlResponse.getResult();
                if (status != 0 || result != 0) {
                    FatFsBluetoothImp.this.m27936a(bluetoothDevice2, "queryWriteDataResult", RcspUtil.formatString("Device reply bad status(%d). result : %d.", Integer.valueOf(status), Integer.valueOf(result)));
                    return;
                }
                if (i == 1) {
                    fatFileSystemM27946e.setNeedWriteData(externalFlashIOCtrlResponse.getSize());
                }
                FatFsBluetoothImp.this.m27943b(bluetoothDevice2, true);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27929a(BluetoothDevice bluetoothDevice) {
        FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e == null) {
            m27936a(bluetoothDevice, "checkWriteDataResult", "No Fat File System.");
            return;
        }
        WatchCacheManager.WatchCache watchCacheByDevice = this.f38414d.getWatchCacheByDevice(bluetoothDevice);
        if (watchCacheByDevice == null) {
            m27936a(bluetoothDevice, "checkWriteDataResult", "No write data cache.");
            return;
        }
        watchCacheByDevice.setNeedCheckReadData(true);
        fatFileSystemM27946e.createReadBuffer(watchCacheByDevice.getWriteLen());
        m27931a(bluetoothDevice, watchCacheByDevice.getWriteOffset(), watchCacheByDevice.getWriteLen());
    }

    /* JADX INFO: renamed from: a */
    public final void m27931a(BluetoothDevice bluetoothDevice, int i, int i2) {
        int iM27945d = m27945d(bluetoothDevice);
        if (iM27945d == 0) {
            iM27945d = m27940b(bluetoothDevice);
        }
        if (iM27945d == 0) {
            JL_Log.m27887w(f38410e, "handleReadData", "mtu is 0.");
            m27938a(bluetoothDevice, false, new byte[0]);
            return;
        }
        JL_Log.m27877d(f38410e, "handleReadData", "offset = " + i + ", size = " + i2);
        if (i2 <= iM27945d) {
            m27932a(bluetoothDevice, 0, i, i2);
        } else {
            m27932a(bluetoothDevice, 1, i, iM27945d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27938a(BluetoothDevice bluetoothDevice, boolean z, byte[] bArr) {
        FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e == null) {
            return;
        }
        String str = f38410e;
        JL_Log.m27877d(str, "updateReadResult", "device : " + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", isSuccess : " + z);
        if (WatchConstant.ENABLE_WRITE_DATA_CHECK && this.f38414d.isNeedCheckReadData(bluetoothDevice)) {
            WatchCacheManager.WatchCache watchCacheRemoveWatchCacheByDevice = this.f38414d.removeWatchCacheByDevice(bluetoothDevice);
            if (z) {
                short sCRC16 = CryptoUtil.CRC16(bArr, (short) 0);
                JL_Log.m27883i(str, "updateReadResult", "readCrc16 : " + ((int) sCRC16) + ", cacheCrc16 : " + ((int) watchCacheRemoveWatchCacheByDevice.getCrc16()) + ", cache offset = " + watchCacheRemoveWatchCacheByDevice.getWriteOffset());
                if (watchCacheRemoveWatchCacheByDevice.getCrc16() == sCRC16) {
                    m27930a(bluetoothDevice, m27945d(bluetoothDevice) != 0 ? 1 : 0);
                    return;
                }
            }
            JL_Log.m27887w(str, "updateReadResult", "isSuccess : " + z + ", crc is error. ");
            m27943b(bluetoothDevice, false);
            return;
        }
        fatFileSystemM27946e.updateReadStatus(z, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m27932a(BluetoothDevice bluetoothDevice, int i, int i2, int i3) {
        JL_Log.m27877d(f38410e, "readDataFromDevice", RcspUtil.formatString("device = %s, flag = %d, offset=%d, size=%s", RcspUtil.printBtDeviceInfo(bluetoothDevice), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        this.f38411a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildExternalFlashReadDataCmd(i, i2, i3), new RcspCommandCallback<ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsBluetoothImp.7
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                JL_Log.m27887w(FatFsBluetoothImp.f38410e, "readDataFromDevice", "onErrCode ---> " + baseError);
                FatFsBluetoothImp.this.m27938a(bluetoothDevice2, false, new byte[0]);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice2, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                FatFileSystem fatFileSystemM27946e = FatFsBluetoothImp.this.m27946e(bluetoothDevice2);
                if (fatFileSystemM27946e == null || fatFileSystemM27946e.readBufferIsEmpty()) {
                    String str = FatFsBluetoothImp.f38410e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fatfs = ");
                    sb.append(fatFileSystemM27946e);
                    sb.append(", readBufferIsEmpty : ");
                    sb.append(fatFileSystemM27946e != null && fatFileSystemM27946e.readBufferIsEmpty());
                    JL_Log.m27887w(str, "readDataFromDevice", sb.toString());
                    FatFsBluetoothImp.this.m27938a(bluetoothDevice2, false, new byte[0]);
                    return;
                }
                ExternalFlashIOCtrlResponse externalFlashIOCtrlResponse = (ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse();
                if (externalFlashIOCtrlResponse == null) {
                    JL_Log.m27887w(FatFsBluetoothImp.f38410e, "readDataFromDevice", "No response.");
                    FatFsBluetoothImp.this.m27938a(bluetoothDevice2, false, new byte[0]);
                    return;
                }
                JL_Log.m27877d(FatFsBluetoothImp.f38410e, "readDataFromDevice", RcspUtil.formatString("device = %s, ctrlCmd = %s", RcspUtil.printBtDeviceInfo(bluetoothDevice2), externalFlashIOCtrlCmd));
                int status = externalFlashIOCtrlCmd.getStatus();
                int result = externalFlashIOCtrlResponse.getResult();
                if (status != 0 || result != 0) {
                    JL_Log.m27883i(FatFsBluetoothImp.f38410e, "readDataFromDevice", RcspUtil.formatString("Device reply bad status(%d). result : %d.", Integer.valueOf(status), Integer.valueOf(result)));
                    FatFsBluetoothImp.this.m27938a(bluetoothDevice2, false, new byte[0]);
                    return;
                }
                ExternalFlashIOCtrlParam externalFlashIOCtrlParam = (ExternalFlashIOCtrlParam) externalFlashIOCtrlCmd.getParam();
                byte[] data = externalFlashIOCtrlResponse.getData();
                int offset = externalFlashIOCtrlParam.getOffset();
                if (data != null && data.length > 0) {
                    fatFileSystemM27946e.putDataInReadBuff(data);
                    offset += data.length;
                }
                if (externalFlashIOCtrlParam.isFinalData()) {
                    FatFsBluetoothImp.this.m27938a(bluetoothDevice2, true, fatFileSystemM27946e.getReadBuffer());
                } else {
                    FatFsBluetoothImp.this.m27931a(bluetoothDevice2, offset, fatFileSystemM27946e.getReadLeftSize());
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27937a(BluetoothDevice bluetoothDevice, boolean z) {
        FatFileSystem fatFileSystemM27946e = m27946e(bluetoothDevice);
        if (fatFileSystemM27946e == null) {
            return;
        }
        fatFileSystemM27946e.updateFlagStatus(z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27939a(int i) {
        return WatchConstant.ENABLE_WRITE_DATA_CHECK && i >= 8192 && i <= 16384;
    }
}
