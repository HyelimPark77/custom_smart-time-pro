package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;

/* JADX INFO: loaded from: classes17.dex */
public class GetFileByClusterTask extends GetFileTask {

    /* JADX INFO: renamed from: n */
    public final Param f38039n;

    public static class Param {
        public int cluster;
        public int devHandler;
        public int offset;
        public String outPath;

        public Param(int i, int i2, int i3, String str) {
            this.devHandler = i;
            this.offset = i2;
            this.cluster = i3;
            this.outPath = str;
        }
    }

    public GetFileByClusterTask(RcspOpImpl rcspOpImpl, Param param) throws RuntimeException {
        super(rcspOpImpl, m27448a(param));
        this.f38039n = param;
    }

    /* JADX INFO: renamed from: a */
    public static String m27448a(Param param) throws RuntimeException {
        if (param != null) {
            return param.outPath;
        }
        throw new RuntimeException("GetFileByClusterTask.Param can not be null");
    }

    @Override // com.jieli.jl_rcsp.task.GetFileTask
    public ReadFileFromDeviceCmd.Param createParam(BluetoothDevice bluetoothDevice) {
        Param param = this.f38039n;
        return new ReadFileFromDeviceCmd.StartWithClusterParam(param.devHandler, param.offset, param.cluster);
    }
}
