package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;

/* JADX INFO: loaded from: classes17.dex */
public class GetFileByClusterTask extends GetFileTask {
    public final Param n;

    public static class Param {
        public int cluster;
        public int devHandler;
        public int offset;
        public String outPath;

        public Param(int r1, int r2, int r3, String r4) {
            this.devHandler = r1;
            this.offset = r2;
            this.cluster = r3;
            this.outPath = r4;
        }
    }

    public GetFileByClusterTask(RcspOpImpl r2, Param r3) throws RuntimeException {
        super(r2, a(r3));
        this.n = r3;
    }

    public static String a(Param r1) throws RuntimeException {
        if (r1 == null) goto L6;
        return r1.outPath;
    L6:
        throw new RuntimeException("GetFileByClusterTask.Param can not be null");
    }

    @Override // com.jieli.jl_rcsp.task.GetFileTask
    public ReadFileFromDeviceCmd.Param createParam(BluetoothDevice r4) {
        Param r0 = this.n;
        return new ReadFileFromDeviceCmd.StartWithClusterParam(r0.devHandler, r0.offset, r0.cluster);
    }
}
