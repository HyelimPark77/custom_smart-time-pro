package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.nfc.INfcOp;
import com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback;
import com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationNoResponseCmd;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.SimpleTaskListener;
import com.jieli.jl_rcsp.task.TaskListener;
import com.jieli.jl_rcsp.task.TransferTask;
import com.jieli.jl_rcsp.task.nfc.NfcSyncTask;
import com.jieli.jl_rcsp.tool.BooleanNfcActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.NfcEventCbHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class NfcOpImpl implements INfcOp {

    /* JADX INFO: renamed from: g */
    public static final String f37889g = "NfcOpImpl";

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f37890a;

    /* JADX INFO: renamed from: c */
    public ITask f37892c;

    /* JADX INFO: renamed from: d */
    public List<NfcMsg> f37893d;

    /* JADX INFO: renamed from: f */
    public final OnRcspCallback f37895f;

    /* JADX INFO: renamed from: b */
    public final NfcEventCbHelper f37891b = new NfcEventCbHelper();

    /* JADX INFO: renamed from: e */
    public short f37894e = 255;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.impl.NfcOpImpl$7 */
    public class C132417 implements TaskListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TaskListener f37917a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BluetoothDevice f37918b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f37919c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f37920d;

        public C132417(TaskListener taskListener, BluetoothDevice bluetoothDevice, int i, String str) {
            this.f37917a = taskListener;
            this.f37918b = bluetoothDevice;
            this.f37919c = i;
            this.f37920d = str;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onBegin() {
            JL_Log.m27880e(NfcOpImpl.f37889g, "startTransferTask", "onBegin >> ");
            TaskListener taskListener = this.f37917a;
            if (taskListener != null) {
                taskListener.onBegin();
            }
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onCancel(int i) {
            TaskListener taskListener = this.f37917a;
            if (taskListener != null) {
                taskListener.onCancel(i);
            }
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onError(int i, String str) {
            JL_Log.m27880e(NfcOpImpl.f37889g, "startTransferTask", "onError = " + i + ", msg = " + str);
            NfcOpImpl.this.f37892c = null;
            TaskListener taskListener = this.f37917a;
            if (taskListener != null) {
                taskListener.onError(i, str);
            }
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onFinish() {
            JL_Log.m27880e(NfcOpImpl.f37889g, "startTransferTask", "onFinish >> ");
            NfcOpImpl.this.f37892c = null;
            NfcOpImpl.this.f37890a.sendRcspCommand(this.f37918b, CommandBuilder.buildInsertNfcFileEndCmd(this.f37919c, NfcOpImpl.this.m27387a(this.f37920d)), new BooleanNfcActionCallback("InsertNfcFileEnd", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.7.1
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    TaskListener taskListener = C132417.this.f37917a;
                    if (taskListener != null) {
                        taskListener.onError(baseError.getSubCode(), baseError.getMessage());
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    C132417 c132417 = C132417.this;
                    NfcOpImpl.this.syncNfcMsg(c132417.f37918b, c132417.f37919c, new OnSyncNfcMsgListener() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.7.1.1
                        @Override // com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener
                        public void onError(BaseError baseError) {
                            TaskListener taskListener = C132417.this.f37917a;
                            if (taskListener != null) {
                                taskListener.onError(baseError.getSubCode(), baseError.getMessage());
                            }
                        }

                        @Override // com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener
                        public void onFinish(List<NfcMsg> list) {
                            JL_Log.m27880e(NfcOpImpl.f37889g, "startTransferTask", "success >> list = " + list.size());
                            TaskListener taskListener = C132417.this.f37917a;
                            if (taskListener != null) {
                                taskListener.onFinish();
                            }
                        }

                        @Override // com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener
                        public void onStart() {
                        }
                    });
                }
            }));
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onProgress(int i) {
            TaskListener taskListener = this.f37917a;
            if (taskListener != null) {
                taskListener.onProgress(i);
            }
        }
    }

    public NfcOpImpl(RcspOpImpl rcspOpImpl) {
        OnRcspCallback onRcspCallback = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (commandBase.getId() == 164 && (commandBase instanceof NFCOperationNoResponseCmd)) {
                    NFCOperationNoResponseCmd.Param param = (NFCOperationNoResponseCmd.Param) ((NFCOperationNoResponseCmd) commandBase).getParam();
                    if (param instanceof NFCOperationNoResponseCmd.NotifyDefaultNfcParam) {
                        NfcOpImpl.this.f37894e = ((NFCOperationNoResponseCmd.NotifyDefaultNfcParam) param).getId();
                        NfcOpImpl.this.f37891b.onDefaultNfc(bluetoothDevice, NfcOpImpl.this.f37894e);
                    }
                }
            }
        };
        this.f37895f = onRcspCallback;
        if (rcspOpImpl == null) {
            throw new NullPointerException("RcspOpImpl can not be null.");
        }
        this.f37890a = rcspOpImpl;
        rcspOpImpl.registerOnRcspCallback(onRcspCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void addNfcFile(final BluetoothDevice bluetoothDevice, final String str, final int i, final TaskListener taskListener) {
        JL_Log.m27883i(f37889g, "addNfcFile", "path : " + str);
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            this.f37890a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildInsertNfcFileCmd(i, (int) file.length(), file.getName()), new BooleanNfcActionCallback("addNfcFile", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.2
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    JL_Log.m27883i(NfcOpImpl.f37889g, "addNfcFile", "onFailed :: " + baseError);
                    TaskListener taskListener2 = taskListener;
                    if (taskListener2 != null) {
                        taskListener2.onError(baseError.getSubCode(), baseError.getMessage());
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    JL_Log.m27883i(NfcOpImpl.f37889g, "addNfcFile", "onSuccess :: " + bool);
                    NfcOpImpl.this.m27390a(bluetoothDevice, str, i, taskListener);
                }
            }));
        } else if (taskListener != null) {
            taskListener.onError(4, "File not found.");
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void addOnNfcEventCallback(OnNfcEventCallback onNfcEventCallback) {
        this.f37891b.registerCallback(onNfcEventCallback);
    }

    public void destroy() {
        m27392b();
        this.f37890a.unregisterOnRcspCallback(this.f37895f);
        this.f37891b.release();
        this.f37893d.clear();
        this.f37894e = (short) 255;
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void getDefaultNfc(BluetoothDevice bluetoothDevice, int i, OnOperationCallback<Short> onOperationCallback) {
        this.f37890a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildGetDefaultNfcOpCmd(i), new CustomRcspActionCallback("getDefaultNfc", onOperationCallback, new IHandleResult<Short, NFCOperationCmd>() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public Short handleResult(BluetoothDevice bluetoothDevice2, NFCOperationCmd nFCOperationCmd) {
                NfcOpImpl.this.f37894e = ((NFCOperationCmd.GetDefaultNfcResponse) nFCOperationCmd.getResponse()).getId();
                NfcOpImpl.this.f37891b.onDefaultNfc(bluetoothDevice2, NfcOpImpl.this.f37894e);
                return Short.valueOf(NfcOpImpl.this.f37894e);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice2, NFCOperationCmd nFCOperationCmd) {
                if (nFCOperationCmd == null) {
                    return 1;
                }
                if (nFCOperationCmd.getStatus() != 1) {
                    return nFCOperationCmd.getStatus();
                }
                if (nFCOperationCmd.getResponse() == 0) {
                    return 1;
                }
                return ((NFCOperationCmd.Response) nFCOperationCmd.getResponse()).getResult();
            }
        }));
    }

    public short getDefaultNfcId() {
        return this.f37894e;
    }

    public NfcMsg getNfcMsgByID(short s) {
        List<NfcMsg> list = this.f37893d;
        if (list == null) {
            return null;
        }
        for (NfcMsg nfcMsg : list) {
            if (nfcMsg.getId() == s) {
                return nfcMsg;
            }
        }
        return null;
    }

    public List<NfcMsg> getNfcMsgList() {
        return this.f37893d;
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void modifyNfcMsg(final BluetoothDevice bluetoothDevice, final NFCOperationCmd.ModifyMsgParam modifyMsgParam, final OnOperationCallback<Boolean> onOperationCallback) {
        this.f37890a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildModifyNFCInfoCmd(modifyMsgParam), new BooleanNfcActionCallback("modifyNfcMsg", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.3
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                NfcOpImpl.this.m27389a(bluetoothDevice, modifyMsgParam);
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onSuccess(bool);
                }
            }
        }));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void removeNfcMsg(final BluetoothDevice bluetoothDevice, int i, final short s, final OnOperationCallback<Boolean> onOperationCallback) {
        this.f37890a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildDeleteNFCInfoSyncCmd(i, s), new BooleanNfcActionCallback("removeNfcMsg", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.4
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                NfcOpImpl.this.m27391a(bluetoothDevice, s);
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onSuccess(bool);
                }
            }
        }));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void removeOnNfcEventCallback(OnNfcEventCallback onNfcEventCallback) {
        this.f37891b.registerCallback(onNfcEventCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void setDefaultNfc(final BluetoothDevice bluetoothDevice, int i, final short s, final OnOperationCallback<Boolean> onOperationCallback) {
        this.f37890a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildSetDefaultNfcOpCmd(i, s), new BooleanNfcActionCallback("setDefaultNfc", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.6
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                NfcOpImpl.this.f37894e = s;
                NfcOpImpl.this.f37891b.onDefaultNfc(bluetoothDevice, NfcOpImpl.this.f37894e);
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onSuccess(bool);
                }
            }
        }));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void syncNfcMsg(final BluetoothDevice bluetoothDevice, int i, final OnSyncNfcMsgListener onSyncNfcMsgListener) {
        m27388a(bluetoothDevice, i, new OnSyncNfcMsgListener() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.1
            @Override // com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener
            public void onError(BaseError baseError) {
                OnSyncNfcMsgListener onSyncNfcMsgListener2 = onSyncNfcMsgListener;
                if (onSyncNfcMsgListener2 != null) {
                    onSyncNfcMsgListener2.onError(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener
            public void onFinish(List<NfcMsg> list) {
                NfcOpImpl.this.f37893d = list;
                OnSyncNfcMsgListener onSyncNfcMsgListener2 = onSyncNfcMsgListener;
                if (onSyncNfcMsgListener2 != null) {
                    onSyncNfcMsgListener2.onFinish(list);
                }
                NfcOpImpl.this.f37891b.onNfcMsgChange(bluetoothDevice, list);
                String str = NfcOpImpl.f37889g;
                StringBuilder sb = new StringBuilder();
                sb.append("onFinish =  ");
                sb.append(list == null ? 0 : list.size());
                JL_Log.m27880e(str, "syncNfcMsg", sb.toString());
            }

            @Override // com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener
            public void onStart() {
                JL_Log.m27883i(NfcOpImpl.f37889g, "syncNfcMsg", "onStart >>>>>>");
                OnSyncNfcMsgListener onSyncNfcMsgListener2 = onSyncNfcMsgListener;
                if (onSyncNfcMsgListener2 != null) {
                    onSyncNfcMsgListener2.onStart();
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m27392b() {
        ITask iTask = this.f37892c;
        if (iTask != null) {
            if (iTask.isRun()) {
                this.f37892c.cancel((byte) 0);
            }
            this.f37892c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27390a(BluetoothDevice bluetoothDevice, String str, int i, TaskListener taskListener) {
        ITask iTask = this.f37892c;
        if (iTask != null && iTask.isRun()) {
            if (this.f37892c.isRun()) {
                if (taskListener != null) {
                    taskListener.onError(4352, "Operation is in operation.");
                    return;
                }
                return;
            }
        } else {
            TransferTask.Param param = new TransferTask.Param();
            param.devHandler = i;
            this.f37892c = new TransferTask(this.f37890a, str, param);
        }
        this.f37892c.setListener(new C132417(taskListener, bluetoothDevice, i, str));
        ((TransferTask) this.f37892c).setPath(str);
        JL_Log.m27880e(f37889g, "startTransferTask", "Task =  " + this.f37892c + " start");
        this.f37892c.start();
    }

    /* JADX INFO: renamed from: a */
    public final String m27387a(String str) {
        if (str == null) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            return str;
        }
        return iLastIndexOf == str.length() + (-1) ? "" : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m27388a(BluetoothDevice bluetoothDevice, int i, final OnSyncNfcMsgListener onSyncNfcMsgListener) {
        ITask iTask = this.f37892c;
        if (iTask == null || !iTask.isRun()) {
            NfcSyncTask nfcSyncTask = new NfcSyncTask(this.f37890a, bluetoothDevice, i);
            this.f37892c = nfcSyncTask;
            nfcSyncTask.setListener(new SimpleTaskListener() { // from class: com.jieli.jl_rcsp.impl.NfcOpImpl.8
                @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
                public void onBegin() {
                    OnSyncNfcMsgListener onSyncNfcMsgListener2 = onSyncNfcMsgListener;
                    if (onSyncNfcMsgListener2 != null) {
                        onSyncNfcMsgListener2.onStart();
                    }
                }

                @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
                public void onError(int i2, String str) {
                    OnSyncNfcMsgListener onSyncNfcMsgListener2 = onSyncNfcMsgListener;
                    if (onSyncNfcMsgListener2 != null) {
                        onSyncNfcMsgListener2.onError(new BaseError(i2, str));
                    }
                }

                @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
                public void onFinish() {
                    OnSyncNfcMsgListener onSyncNfcMsgListener2 = onSyncNfcMsgListener;
                    if (onSyncNfcMsgListener2 != null) {
                        onSyncNfcMsgListener2.onFinish(((NfcSyncTask) NfcOpImpl.this.f37892c).getNfcMsgs());
                    }
                }
            });
        }
        this.f37892c.start();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX INFO: renamed from: a */
    public final void m27389a(BluetoothDevice bluetoothDevice, NFCOperationCmd.ModifyMsgParam modifyMsgParam) {
        NfcMsg nfcMsgByID;
        boolean z;
        String strTrim;
        if (this.f37893d == null || modifyMsgParam == null || modifyMsgParam.getValue() == null || (nfcMsgByID = getNfcMsgByID(modifyMsgParam.getId())) == null) {
            return;
        }
        int i = 0;
        boolean zCheckMaskHasBit = RcspUtil.checkMaskHasBit(modifyMsgParam.getMask(), (byte) 0);
        boolean z2 = true;
        boolean zCheckMaskHasBit2 = RcspUtil.checkMaskHasBit(modifyMsgParam.getMask(), (byte) 1);
        byte[] value = modifyMsgParam.getValue();
        String str = f37889g;
        JL_Log.m27883i(str, "modifyNfcMsg", "hasTime : " + zCheckMaskHasBit + ", hasNickname = " + zCheckMaskHasBit2 + ",  value : " + value.length);
        if (!zCheckMaskHasBit || 4 > value.length) {
            z = false;
        } else {
            long jIntToTime = RcspUtil.intToTime(CHexConver.bytesToInt(value, 0, 4));
            JL_Log.m27883i(str, "modifyNfcMsg", "realTime : " + jIntToTime + ", UpdateTime = " + nfcMsgByID.getUpdateTime());
            if (nfcMsgByID.getUpdateTime() != jIntToTime) {
                nfcMsgByID.setUpdateTime(jIntToTime);
                z = true;
            } else {
                z = false;
            }
            i = 4;
        }
        if (!zCheckMaskHasBit2 || i + 24 > value.length) {
            z2 = z;
        } else {
            try {
                strTrim = new String(value, i, 24).trim();
            } catch (Exception e) {
                e.printStackTrace();
                strTrim = null;
            }
            JL_Log.m27883i(f37889g, "modifyNfcMsg", "name : " + strTrim + ", Nickname = " + nfcMsgByID.getNickname());
            if (strTrim == null || strTrim.equalsIgnoreCase(nfcMsgByID.getNickname())) {
                z2 = z;
            } else {
                nfcMsgByID.setNickname(strTrim);
            }
        }
        if (z2) {
            JL_Log.m27883i(f37889g, "modifyNfcMsg", "nfcMsg = " + nfcMsgByID);
            this.f37891b.onModifyNfcMsg(bluetoothDevice, nfcMsgByID);
            this.f37891b.onNfcMsgChange(bluetoothDevice, this.f37893d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27391a(BluetoothDevice bluetoothDevice, short s) {
        NfcMsg nfcMsgByID;
        if (this.f37893d == null || (nfcMsgByID = getNfcMsgByID(s)) == null || !this.f37893d.remove(nfcMsgByID)) {
            return;
        }
        this.f37891b.onNfcMsgChange(bluetoothDevice, this.f37893d);
    }
}
