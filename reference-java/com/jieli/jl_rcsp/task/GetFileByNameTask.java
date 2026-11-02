package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;

/* JADX INFO: loaded from: classes17.dex */
public class GetFileByNameTask extends GetFileTask {

    /* JADX INFO: renamed from: n */
    public final Param f38040n;

    public static class Param {

        /* JADX INFO: renamed from: a */
        public String f38041a;

        /* JADX INFO: renamed from: b */
        public boolean f38042b;

        /* JADX INFO: renamed from: c */
        public int f38043c;
        public int devHandler;
        public String name;

        public Param(int i, String str, String str2) {
            this(i, str, str2, false);
        }

        public Param(int i, String str, String str2, boolean z) {
            this.devHandler = i;
            this.name = str;
            this.f38041a = str2;
            this.f38042b = z;
        }
    }

    public GetFileByNameTask(RcspOpImpl rcspOpImpl, Param param) throws RuntimeException {
        super(rcspOpImpl, m27449a(param));
        this.f38040n = param;
    }

    /* JADX INFO: renamed from: a */
    public static String m27449a(Param param) throws RuntimeException {
        if (param != null) {
            return param.f38041a;
        }
        throw new RuntimeException("GetFileByNameTask.Param can not be null");
    }

    @Override // com.jieli.jl_rcsp.task.GetFileTask
    public ReadFileFromDeviceCmd.Param createParam(BluetoothDevice bluetoothDevice) {
        if (this.mRcspOp.getDeviceInfo(bluetoothDevice) != null && !this.mRcspOp.getDeviceInfo(bluetoothDevice).isGetFileByNameWithDev()) {
            this.useCrc = false;
            int i = this.f38040n.f38043c;
            Param param = this.f38040n;
            return new ReadFileFromDeviceCmd.StartWithNameParam(i, param.name, param.f38042b);
        }
        Param param2 = this.f38040n;
        int i2 = param2.devHandler;
        if (i2 == -1) {
            throw new RuntimeException("please set devHandler");
        }
        int i3 = param2.f38043c;
        Param param3 = this.f38040n;
        return new ReadFileFromDeviceCmd.StartWithDevAndNameParam(i2, i3, param3.name, param3.f38042b);
    }

    public void setName(String str) {
        Param param = this.f38040n;
        if (param != null) {
            param.name = str;
        }
    }
}
