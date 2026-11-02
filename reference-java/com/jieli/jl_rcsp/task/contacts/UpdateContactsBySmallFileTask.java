package com.jieli.jl_rcsp.task.contacts;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.SimpleTaskListener;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.task.smallfile.AddFileTask;
import com.jieli.jl_rcsp.task.smallfile.DeleteFileTask;
import com.jieli.jl_rcsp.task.smallfile.UpdateFileTask;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateContactsBySmallFileTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public ITask f38107b;

    /* JADX INFO: renamed from: c */
    public final List<DeviceContacts> f38108c;

    public UpdateContactsBySmallFileTask(RcspOpImpl rcspOpImpl, List<DeviceContacts> list) throws RuntimeException {
        super(rcspOpImpl);
        if (list == null) {
            throw new RuntimeException("contacts can not be null.");
        }
        this.f38108c = list;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        if (isRun()) {
            ITask iTask = this.f38107b;
            if (iTask != null) {
                iTask.cancel(b);
            } else {
                callbackCancel(b);
            }
        }
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
            return;
        }
        callbackBegin();
        if (this.f38108c.isEmpty() || this.f38108c.get(0).getFileId() <= 0) {
            JL_Log.m27877d(this.tag, "start", "Query first, then update");
            m27532a();
        } else {
            JL_Log.m27877d(this.tag, "start", "Update");
            this.f38107b = new UpdateFileTask(this.mRcspOp, new UpdateFileTask.Param((byte) 1, this.f38108c.get(0).getFileId(), DeviceContacts.toData(this.f38108c)));
            m27534b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27534b() {
        this.f38107b.setListener(new SimpleTaskListener() { // from class: com.jieli.jl_rcsp.task.contacts.UpdateContactsBySmallFileTask.3
            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onCancel(int i) {
                UpdateContactsBySmallFileTask.this.callbackCancel(i);
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onError(int i, String str) {
                UpdateContactsBySmallFileTask.this.callbackError(i, str);
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onFinish() {
                UpdateContactsBySmallFileTask.this.callbackFinish();
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onProgress(int i) {
                UpdateContactsBySmallFileTask.this.callbackProgress(i);
            }
        });
        this.f38107b.start();
    }

    /* JADX INFO: renamed from: a */
    public final void m27532a() {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(new SmallFileTransferCmd.QueryParam((byte) 1)), new CustomRcspActionCallback("queryContactList", new OnOperationCallback<SmallFileTransferCmd.QueryResponse>() { // from class: com.jieli.jl_rcsp.task.contacts.UpdateContactsBySmallFileTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                UpdateContactsBySmallFileTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(SmallFileTransferCmd.QueryResponse queryResponse) {
                UpdateContactsBySmallFileTask.this.m27533a(queryResponse.getFiles());
            }
        }, new IHandleResult<SmallFileTransferCmd.QueryResponse, SmallFileTransferCmd>() { // from class: com.jieli.jl_rcsp.task.contacts.UpdateContactsBySmallFileTask.2
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public SmallFileTransferCmd.QueryResponse handleResult(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                if (smallFileTransferCmd != null && smallFileTransferCmd.getStatus() == 0 && (smallFileTransferCmd.getResponse() instanceof SmallFileTransferCmd.QueryResponse)) {
                    return (SmallFileTransferCmd.QueryResponse) smallFileTransferCmd.getResponse();
                }
                return null;
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public final void m27533a(List<SmallFileTransferCmd.QueryResponse.File> list) {
        byte[] data = DeviceContacts.toData(this.f38108c);
        if (data.length == 0 && list.isEmpty()) {
            JL_Log.m27877d(this.tag, "updateByQuery", "No contact data, no contact file, end.");
            callbackFinish();
            return;
        }
        if (data.length == 0) {
            JL_Log.m27877d(this.tag, "updateByQuery", "No contact data and contact files, delete the contact files.");
            this.f38107b = new DeleteFileTask(this.mRcspOp, new DeleteFileTask.Param((byte) 1, list.get(0).f38015id));
        } else if (list.isEmpty()) {
            JL_Log.m27877d(this.tag, "updateByQuery", "There is contact data but no contact file, add the contact file.");
            this.f38107b = new AddFileTask(this.mRcspOp, new AddFileTask.Param((byte) 1, data));
        } else {
            JL_Log.m27877d(this.tag, "updateByQuery", "There is contact data and contact file, update the contact file.");
            this.f38107b = new UpdateFileTask(this.mRcspOp, new UpdateFileTask.Param((byte) 1, list.get(0).f38015id, data));
        }
        m27534b();
    }
}
