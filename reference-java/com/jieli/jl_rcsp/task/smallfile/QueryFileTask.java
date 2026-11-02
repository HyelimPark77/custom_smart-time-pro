package com.jieli.jl_rcsp.task.smallfile;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class QueryFileTask extends TaskBase {
    public static final byte TYPE_BLOOD_OXYGEN = 4;
    public static final byte TYPE_CALL_LOG = 8;
    public static final byte TYPE_CONTACTS = 1;
    public static final byte TYPE_HEART_RATE = 3;
    public static final byte TYPE_MESSAGE_SYNC = 6;
    public static final byte TYPE_SLEEP = 5;
    public static final byte TYPE_SPORTS_RECORD = 2;
    public static final byte TYPE_STEP = 9;
    public static final byte TYPE_WEATHER = 7;

    /* JADX INFO: renamed from: b */
    public final Param f38165b;

    /* JADX INFO: renamed from: c */
    public List<File> f38166c;

    public static class File {

        /* JADX INFO: renamed from: id */
        public short f38168id;
        public int size;
        public byte type;

        public File(byte b, short s, int i) {
            this.f38168id = s;
            this.size = i;
            this.type = b;
        }

        public String toString() {
            return "File{id=" + ((int) this.f38168id) + ", size=" + this.size + ", type=" + ((int) this.type) + i0XO1.f7442IO;
        }
    }

    public static class Param {
        public byte type;

        public Param(byte b) {
            this.type = b;
        }
    }

    public QueryFileTask(RcspOpImpl rcspOpImpl, Param param) {
        super(rcspOpImpl);
        if (param == null) {
            throw new RuntimeException("QueryFileTask.Param can not be null.");
        }
        this.f38165b = param;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
    }

    public List<File> getFiles() {
        return this.f38166c;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
        } else {
            callbackBegin();
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(new SmallFileTransferCmd.QueryParam(this.f38165b.type)), new RcspCommandCallback<SmallFileTransferCmd>() { // from class: com.jieli.jl_rcsp.task.smallfile.QueryFileTask.1
                @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
                public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
                    QueryFileTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
                public void onCommandResponse(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                    if (smallFileTransferCmd.getStatus() != 0) {
                        onErrCode(bluetoothDevice, QueryFileTask.this.buildResponseBadState(smallFileTransferCmd.getId(), smallFileTransferCmd.getStatus()));
                        return;
                    }
                    List<SmallFileTransferCmd.QueryResponse.File> files = ((SmallFileTransferCmd.QueryResponse) smallFileTransferCmd.getResponse()).getFiles();
                    QueryFileTask.this.f38166c = new ArrayList();
                    if (files != null) {
                        for (SmallFileTransferCmd.QueryResponse.File file : files) {
                            QueryFileTask.this.f38166c.add(new File(file.type, file.f38015id, file.size));
                        }
                    }
                    QueryFileTask.this.callbackFinish();
                }
            });
        }
    }
}
