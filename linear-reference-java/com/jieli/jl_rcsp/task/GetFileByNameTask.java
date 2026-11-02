package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;

/* JADX INFO: loaded from: classes17.dex */
public class GetFileByNameTask extends GetFileTask {
    public final Param n;

    public static class Param {
        public String a;
        public boolean b;
        public int c;
        public int devHandler;
        public String name;

        public Param(int r2, String r3, String r4) {
            this(r2, r3, r4, false);
        }

        public static /* synthetic */ int a(Param r0) {
            return r0.c;
        }

        public static /* synthetic */ boolean b(Param r0) {
            return r0.b;
        }

        public static /* synthetic */ String c(Param r0) {
            return r0.a;
        }

        public Param(int r1, String r2, String r3, boolean r4) {
            this.devHandler = r1;
            this.name = r2;
            this.a = r3;
            this.b = r4;
        }
    }

    public GetFileByNameTask(RcspOpImpl r2, Param r3) throws RuntimeException {
        super(r2, a(r3));
        this.n = r3;
    }

    public static String a(Param r1) throws RuntimeException {
        if (r1 == null) goto L6;
        return Param.c(r1);
    L6:
        throw new RuntimeException("GetFileByNameTask.Param can not be null");
    }

    @Override // com.jieli.jl_rcsp.task.GetFileTask
    public ReadFileFromDeviceCmd.Param createParam(BluetoothDevice r5) {
        if (this.mRcspOp.getDeviceInfo(r5) != null) goto L5;
    L9:
        Param r6 = this.n;
        int r0 = r6.devHandler;
        if (r0 == (-1)) goto L14;
        int r7 = Param.a(r6);
        Param r2 = this.n;
        return new ReadFileFromDeviceCmd.StartWithDevAndNameParam(r0, r7, r2.name, Param.b(r2));
    L14:
        throw new RuntimeException("please set devHandler");
    L5:
        if (this.mRcspOp.getDeviceInfo(r5).isGetFileByNameWithDev() == true) goto L9;
        this.useCrc = false;
        int r1 = Param.a(this.n);
        Param r3 = this.n;
        return new ReadFileFromDeviceCmd.StartWithNameParam(r1, r3.name, Param.b(r3));
    }

    public void setName(String r2) {
        Param r0 = this.n;
        if (r0 == null) goto L6;
        r0.name = r2;
        return;
    }
}
