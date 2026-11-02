package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.data.IDataTransferOp;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;
import com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.data.DataTransferCmd;
import com.jieli.jl_rcsp.model.data.DataParams;
import com.jieli.jl_rcsp.model.data.ReadDataCache;
import com.jieli.jl_rcsp.model.data.ReadParams;
import com.jieli.jl_rcsp.model.data.SendDataCache;
import com.jieli.jl_rcsp.model.data.SendParams;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
class DataTransferOpImpl implements IDataTransferOp {
    public static int WAITING_FOR_DATA_TIMEOUT = 20000;

    /* JADX INFO: renamed from: h */
    public static final String f37838h = "DataTransferOpImpl";

    /* JADX INFO: renamed from: i */
    public static volatile DataTransferOpImpl f37839i = null;

    /* JADX INFO: renamed from: j */
    public static final int f37840j = 5237;

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f37841a;

    /* JADX INFO: renamed from: b */
    public final DeviceStatusManager f37842b;

    /* JADX INFO: renamed from: c */
    public final CallbackManager f37843c;

    /* JADX INFO: renamed from: d */
    public volatile SendDataCache f37844d;

    /* JADX INFO: renamed from: e */
    public volatile ReadDataCache f37845e;

    /* JADX INFO: renamed from: f */
    public final Handler f37846f;

    /* JADX INFO: renamed from: g */
    public final OnRcspCallback f37847g;

    public static class CallbackManager extends BaseCallbackManager<OnDataTransferListener> implements OnDataTransferListener {
        public CallbackManager(Handler handler) {
            super(handler);
        }

        @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
        public void onError(final BluetoothDevice bluetoothDevice, final BaseError baseError) {
            callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.jieli.jl_rcsp.impl.XIi00iiXO
                @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
                public final void onPost(Object obj) {
                    ((OnDataTransferListener) obj).onError(bluetoothDevice, baseError);
                }
            });
        }

        @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
        public void onReceiveData(final BluetoothDevice bluetoothDevice, final int i, final byte[] bArr) {
            callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.jieli.jl_rcsp.impl.iO
                @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
                public final void onPost(Object obj) {
                    ((OnDataTransferListener) obj).onReceiveData(bluetoothDevice, i, bArr);
                }
            });
        }
    }

    public DataTransferOpImpl(RcspOpImpl rcspOpImpl) {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.jieli.jl_rcsp.impl.OXO1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f37927IO.m27341a(message);
            }
        });
        this.f37846f = handler;
        OnRcspCallback onRcspCallback = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.7
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onConnectStateChange(BluetoothDevice bluetoothDevice, int i) {
                if (i != 1) {
                    BaseError baseError = new BaseError(8192, "Device is not connected.");
                    DataTransferOpImpl.this.m27336a(baseError);
                    DataTransferOpImpl.this.m27333a(bluetoothDevice, baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (commandBase == null || commandBase.getId() != 48) {
                    return;
                }
                DataTransferCmd dataTransferCmd = (DataTransferCmd) commandBase;
                JL_Log.m27877d(DataTransferOpImpl.f37838h, "onRcspCommand", "" + dataTransferCmd);
                if (dataTransferCmd.getParam() instanceof DataTransferCmd.SendDataParam) {
                    DataTransferOpImpl.this.m27335a(bluetoothDevice, dataTransferCmd, (DataTransferCmd.SendDataParam) dataTransferCmd.getParam());
                } else if (dataTransferCmd.getParam() instanceof DataTransferCmd.ReadDataParam) {
                    DataTransferOpImpl.this.m27334a(bluetoothDevice, dataTransferCmd, (DataTransferCmd.DataTransferParam) dataTransferCmd.getParam());
                } else if (dataTransferCmd.getParam() instanceof DataTransferCmd.DataTransferParam) {
                    DataTransferOpImpl.this.m27334a(bluetoothDevice, dataTransferCmd, (DataTransferCmd.DataTransferParam) dataTransferCmd.getParam());
                }
            }
        };
        this.f37847g = onRcspCallback;
        if (rcspOpImpl == null) {
            throw new NullPointerException("RcspOpImpl can not be null.");
        }
        this.f37841a = rcspOpImpl;
        this.f37842b = DeviceStatusManager.getInstance();
        this.f37843c = new CallbackManager(handler);
        rcspOpImpl.registerOnRcspCallback(onRcspCallback);
    }

    public static DataTransferOpImpl instance(RcspOpImpl rcspOpImpl) {
        if (f37839i == null) {
            synchronized (DataTransferOpImpl.class) {
                try {
                    if (f37839i == null) {
                        f37839i = new DataTransferOpImpl(rcspOpImpl);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37839i;
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void addListener(OnDataTransferListener onDataTransferListener) {
        this.f37843c.registerCallback(onDataTransferListener);
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void cancelDataTransfer(OnOperationCallback<Boolean> onOperationCallback) {
        if (onOperationCallback != null) {
            onOperationCallback.onSuccess(Boolean.FALSE);
        }
    }

    public void destroy() {
        this.f37846f.removeMessages(f37840j);
        this.f37846f.removeCallbacksAndMessages(null);
        this.f37841a.unregisterOnRcspCallback(this.f37847g);
        m27336a(new BaseError(4098, "Cancel send data task."));
        this.f37843c.release();
        f37839i = null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public boolean isDataTransfer() {
        return this.f37842b.isDataTransfer(m27342b());
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void readLargeData(DataParams dataParams, final OnDataEventCallback onDataEventCallback) {
        if (dataParams == null) {
            if (onDataEventCallback != null) {
                onDataEventCallback.onError(new BaseError(4097, "ReadParams can not be null."));
            }
        } else if (isDataTransfer() || m27344d() || m27343c()) {
            if (onDataEventCallback != null) {
                onDataEventCallback.onError(new BaseError(4352, "Data task is in progress."));
            }
        } else {
            DataTransferCmd.ReadDataParam readDataParam = new DataTransferCmd.ReadDataParam(dataParams.getDataType(), dataParams.getVersion(), dataParams.getSendLimit(), dataParams.getReceiveLimit());
            final BluetoothDevice connectedDevice = this.f37841a.getConnectedDevice();
            m27338a(readDataParam, new OnOperationCallback<DataTransferCmd.ReadDataResponse>() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.2
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    OnDataEventCallback onDataEventCallback2 = onDataEventCallback;
                    if (onDataEventCallback2 != null) {
                        onDataEventCallback2.onError(baseError);
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(DataTransferCmd.ReadDataResponse readDataResponse) {
                    if (readDataResponse.getResult() != 0) {
                        onFailed(RcspErrorCode.buildJsonError(48, 12293, readDataResponse.getResult(), null));
                        return;
                    }
                    int maxReceiveMtu = DeviceStatusManager.getInstance().getMaxReceiveMtu(DataTransferOpImpl.this.f37841a.getConnectedDevice());
                    if (readDataResponse.getSendDataLimit() >= maxReceiveMtu) {
                        onFailed(new BaseError(4097, RcspUtil.formatString("Data sending limit exceeded the protocol MTU[%d] range.", Integer.valueOf(maxReceiveMtu))));
                        return;
                    }
                    DataTransferOpImpl.this.f37845e = new ReadDataCache(new ReadParams(readDataResponse.getType(), readDataResponse.getVersion(), readDataResponse.getSendDataLimit(), readDataResponse.getReceiveDataLimit(), readDataResponse.getDataLen(), readDataResponse.getCrc()));
                    DataTransferOpImpl.this.f37845e.setCallback(onDataEventCallback);
                    DataTransferOpImpl.this.f37842b.updateDataTransfer(DataTransferOpImpl.this.m27342b(), true);
                    if (DataTransferOpImpl.this.f37845e.getCallback() != null) {
                        DataTransferOpImpl.this.f37845e.getCallback().onBegin(0);
                    }
                    DataTransferOpImpl.this.f37846f.sendMessageDelayed(DataTransferOpImpl.this.f37846f.obtainMessage(DataTransferOpImpl.f37840j, connectedDevice), DataTransferOpImpl.WAITING_FOR_DATA_TIMEOUT);
                }
            });
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void removeListener(OnDataTransferListener onDataTransferListener) {
        this.f37843c.unregisterCallback(onDataTransferListener);
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void sendLargeData(SendParams sendParams, OnDataEventCallback onDataEventCallback) {
        if (sendParams == null) {
            if (onDataEventCallback != null) {
                onDataEventCallback.onError(new BaseError(4097, "SendDataParam can not be null."));
            }
        } else if (isDataTransfer() || m27344d()) {
            if (onDataEventCallback != null) {
                onDataEventCallback.onError(new BaseError(4352, WatchError.getErrorDesc(4352)));
            }
        } else {
            this.f37844d = new SendDataCache(sendParams, onDataEventCallback);
            this.f37842b.updateDataTransfer(m27342b(), true);
            m27339a(new DataTransferCmd.SendDataParam(sendParams.getDataType(), sendParams.getVersion(), sendParams.getDataLen(), sendParams.getDataCrc(), sendParams.getSendLimit(), sendParams.getReceiveLimit()), new OnOperationCallback<DataTransferCmd.SendDataResponse>() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.1
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    DataTransferOpImpl.this.m27336a(baseError);
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(DataTransferCmd.SendDataResponse sendDataResponse) {
                    if (sendDataResponse.getResult() != 0) {
                        onFailed(RcspErrorCode.buildJsonError(48, 12293, sendDataResponse.getResult(), null));
                        return;
                    }
                    if (DataTransferOpImpl.this.isDataTransfer() && DataTransferOpImpl.this.m27344d()) {
                        int maxReceiveMtu = DeviceStatusManager.getInstance().getMaxReceiveMtu(DataTransferOpImpl.this.f37841a.getConnectedDevice());
                        if (sendDataResponse.getReceiveDataLimit() >= maxReceiveMtu) {
                            onFailed(new BaseError(4097, RcspUtil.formatString("Data Receiving limit exceeded the protocol MTU[%d] range.", Integer.valueOf(maxReceiveMtu))));
                            return;
                        }
                        DataTransferOpImpl.this.f37844d.setSendLimit(sendDataResponse.getSendDataLimit());
                        DataTransferOpImpl.this.f37844d.setReceiveLimit(sendDataResponse.getReceiveDataLimit());
                        DataTransferOpImpl.this.f37844d.setOffset(0);
                        DataTransferOpImpl.this.f37844d.setSeq(-1);
                        if (DataTransferOpImpl.this.f37844d.getCallback() != null) {
                            DataTransferOpImpl.this.f37844d.getCallback().onBegin(1);
                        }
                        DataTransferOpImpl dataTransferOpImpl = DataTransferOpImpl.this;
                        dataTransferOpImpl.m27340a(dataTransferOpImpl.f37844d);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27343c() {
        return this.f37845e != null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27344d() {
        return this.f37844d != null;
    }

    /* JADX INFO: renamed from: b */
    public final BluetoothDevice m27342b() {
        return this.f37841a.getConnectedDevice();
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean m27341a(Message message) {
        if (message == null) {
            return false;
        }
        if (5237 != message.what) {
            return true;
        }
        Object obj = message.obj;
        if (!(obj instanceof BluetoothDevice)) {
            return true;
        }
        m27333a((BluetoothDevice) obj, new BaseError(12290, "Waiting for data timeout."));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m27336a(BaseError baseError) {
        if (baseError != null && m27344d()) {
            OnDataEventCallback callback = this.f37844d.getCallback();
            this.f37844d.release();
            this.f37844d = null;
            this.f37842b.updateDataTransfer(m27342b(), false);
            JL_Log.m27887w(f37838h, "onSendError", "device : " + m27342b() + ", " + baseError);
            if (callback != null) {
                callback.onError(baseError);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27333a(BluetoothDevice bluetoothDevice, BaseError baseError) {
        if (baseError != null && m27343c()) {
            OnDataEventCallback callback = this.f37845e.getCallback();
            this.f37846f.removeMessages(f37840j);
            this.f37845e.release();
            this.f37845e = null;
            this.f37842b.updateDataTransfer(m27342b(), false);
            JL_Log.m27887w(f37838h, "onReadError", "device : " + bluetoothDevice + ", " + baseError);
            if (callback != null) {
                callback.onError(baseError);
            }
            this.f37843c.onError(bluetoothDevice, baseError);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27340a(SendDataCache sendDataCache) {
        if (sendDataCache == null || !isDataTransfer()) {
            return;
        }
        int receiveLimit = sendDataCache.getReceiveLimit();
        boolean z = sendDataCache.getOffset() + receiveLimit >= sendDataCache.getDataLen();
        int iMin = Math.min(sendDataCache.getDataLen() - sendDataCache.getOffset(), receiveLimit);
        byte[] bArr = new byte[iMin];
        System.arraycopy(sendDataCache.getData(), sendDataCache.getOffset(), bArr, 0, iMin);
        short sCRC16 = CryptoUtil.CRC16(bArr, (short) 0);
        sendDataCache.setSeq(sendDataCache.getSeq() + 1);
        DataTransferCmd.DataTransferParam dataTransferParam = new DataTransferCmd.DataTransferParam(sendDataCache.getDataType(), z, sendDataCache.getSeq(), sCRC16, sendDataCache.getOffset(), bArr);
        sendDataCache.setOffset(sendDataCache.getOffset() + iMin);
        m27337a(dataTransferParam, new OnOperationCallback<DataTransferCmd.DataTransferResponse>() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.3
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                DataTransferOpImpl.this.m27336a(baseError);
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(DataTransferCmd.DataTransferResponse dataTransferResponse) {
                String str;
                if (dataTransferResponse.getResult() != 0) {
                    try {
                        str = (dataTransferResponse.getMessage() == null || dataTransferResponse.getMessage().length <= 0) ? "" : new String(dataTransferResponse.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    onFailed(RcspErrorCode.buildJsonError(48, 12293, dataTransferResponse.getResult(), str));
                    return;
                }
                if (DataTransferOpImpl.this.isDataTransfer() && DataTransferOpImpl.this.m27344d()) {
                    if (!dataTransferResponse.isEnd()) {
                        if (DataTransferOpImpl.this.f37844d.getDataLen() > 0) {
                            float offset = (DataTransferOpImpl.this.f37844d.getOffset() * 100.0f) / DataTransferOpImpl.this.f37844d.getDataLen();
                            if (DataTransferOpImpl.this.f37844d.getCallback() != null) {
                                DataTransferOpImpl.this.f37844d.getCallback().onProgress(offset);
                            }
                        }
                        DataTransferOpImpl dataTransferOpImpl = DataTransferOpImpl.this;
                        dataTransferOpImpl.m27340a(dataTransferOpImpl.f37844d);
                        return;
                    }
                    OnDataEventCallback callback = DataTransferOpImpl.this.f37844d.getCallback();
                    int dataType = DataTransferOpImpl.this.f37844d.getDataType();
                    byte[] data = DataTransferOpImpl.this.f37844d.getData();
                    DataTransferOpImpl.this.f37844d.release();
                    DataTransferOpImpl.this.f37844d = null;
                    DataTransferOpImpl.this.f37842b.updateDataTransfer(DataTransferOpImpl.this.m27342b(), false);
                    if (callback != null) {
                        callback.onProgress(100.0f);
                        callback.onStop(dataType, data);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27335a(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd, DataTransferCmd.SendDataParam sendDataParam) {
        if (dataTransferCmd == null || sendDataParam == null) {
            return;
        }
        if (m27343c()) {
            dataTransferCmd.setParam(null);
            dataTransferCmd.setStatus(3);
            this.f37841a.sendCommandResponse(bluetoothDevice, dataTransferCmd, null);
            return;
        }
        String str = f37838h;
        JL_Log.m27877d(str, "handleDataParam", "" + sendDataParam);
        DataTransferCmd.SendDataResponse sendDataResponse = new DataTransferCmd.SendDataResponse(sendDataParam.getWay(), sendDataParam.getType(), sendDataParam.getVersion(), 0, sendDataParam.getSendDataLimit(), sendDataParam.getReceiveDataLimit());
        JL_Log.m27877d(str, "handleDataParam", sendDataResponse + "\n data = " + CHexConver.byte2HexStr(sendDataResponse.getParamData()));
        dataTransferCmd.setParam(new DataTransferCmd.CustomReplyParam(sendDataResponse.getParamData()));
        dataTransferCmd.setStatus(0);
        this.f37841a.sendCommandResponse(bluetoothDevice, dataTransferCmd, null);
        this.f37845e = new ReadDataCache(new ReadParams(sendDataParam.getType(), sendDataParam.getVersion(), sendDataParam.getSendDataLimit(), sendDataParam.getReceiveDataLimit(), sendDataParam.getDataLen(), sendDataParam.getCrc()));
        this.f37842b.updateDataTransfer(m27342b(), true);
        Handler handler = this.f37846f;
        handler.sendMessageDelayed(handler.obtainMessage(f37840j, bluetoothDevice), WAITING_FOR_DATA_TIMEOUT);
    }

    /* JADX INFO: renamed from: a */
    public final void m27334a(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd, DataTransferCmd.DataTransferParam dataTransferParam) {
        int i;
        if (dataTransferCmd == null || dataTransferParam == null) {
            return;
        }
        if (!m27343c()) {
            dataTransferCmd.setParam(new DataTransferCmd.CustomReplyParam(new DataTransferCmd.DataTransferResponse(dataTransferParam.getType(), true, dataTransferParam.getSeq(), 7, m27319a(7).getBytes()).getParamData()));
            dataTransferCmd.setStatus(0);
            this.f37841a.sendCommandResponse(bluetoothDevice, dataTransferCmd, null);
            return;
        }
        this.f37846f.removeMessages(f37840j);
        byte[] data = dataTransferParam.getData();
        short sCRC16 = CryptoUtil.CRC16(data, (short) 0);
        String str = f37838h;
        JL_Log.m27877d(str, "handleDataEvent", RcspUtil.formatString("device give crc = %d, hex --> %s, app count crc = %d, hex --> %s", Short.valueOf(dataTransferParam.getCrc()), Integer.toHexString(dataTransferParam.getCrc()), Short.valueOf(sCRC16), Integer.toHexString(sCRC16)));
        int i2 = 1;
        if (sCRC16 == dataTransferParam.getCrc()) {
            JL_Log.m27877d(str, "handleDataEvent", RcspUtil.formatString("device give seq = %d, app count seq = %d", Integer.valueOf(dataTransferParam.getSeq()), Integer.valueOf(this.f37845e.getSeq() + 1)));
            if (this.f37845e.getSeq() + 1 == dataTransferParam.getSeq()) {
                boolean zPutData = this.f37845e.putData(data);
                JL_Log.m27877d(str, "handleDataEvent", "write data result : " + zPutData + ", data size = " + data.length);
                if (zPutData) {
                    this.f37845e.setOffset(dataTransferParam.getOffset());
                    this.f37845e.setSeq(dataTransferParam.getSeq());
                    if (dataTransferParam.isEnd()) {
                        short sCRC17 = CryptoUtil.CRC16(this.f37845e.getOutputData(), (short) 0);
                        JL_Log.m27883i(str, "handleDataEvent", RcspUtil.formatString("Checking Data Integrity. totalCrc : %d, hex --> %s, device give data crc = %d, hex --> %s.", Short.valueOf(sCRC17), Integer.toHexString(sCRC17), Short.valueOf(this.f37845e.getCrc()), Integer.toHexString(this.f37845e.getCrc())));
                        if (sCRC17 != this.f37845e.getCrc()) {
                        }
                    }
                    i = 0;
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 2;
            }
            i = i2;
        } else {
            i = i2;
        }
        DataTransferCmd.DataTransferResponse dataTransferResponse = new DataTransferCmd.DataTransferResponse(dataTransferParam.getType(), dataTransferParam.isEnd(), dataTransferParam.getSeq(), i, m27319a(i).getBytes());
        int i3 = i;
        JL_Log.m27877d(str, "handleDataEvent", "result = " + i3);
        dataTransferCmd.setParam(new DataTransferCmd.CustomReplyParam(dataTransferResponse.getParamData()));
        dataTransferCmd.setStatus(0);
        this.f37841a.sendCommandResponse(bluetoothDevice, dataTransferCmd, null);
        if (i3 == 0) {
            OnDataEventCallback callback = this.f37845e.getCallback();
            if (dataTransferParam.isEnd()) {
                byte[] bArr = (byte[]) this.f37845e.getOutputData().clone();
                this.f37845e.release();
                this.f37845e = null;
                this.f37842b.updateDataTransfer(m27342b(), false);
                if (callback != null) {
                    callback.onProgress(100.0f);
                    callback.onStop(dataTransferParam.getType(), bArr);
                }
                this.f37843c.onReceiveData(bluetoothDevice, dataTransferParam.getType(), bArr);
                return;
            }
            if (this.f37845e.getDataLen() > 0) {
                float offset = ((this.f37845e.getOffset() + data.length) * 100.0f) / this.f37845e.getDataLen();
                if (callback != null) {
                    callback.onProgress(offset);
                }
            }
            Handler handler = this.f37846f;
            handler.sendMessageDelayed(handler.obtainMessage(f37840j, bluetoothDevice), WAITING_FOR_DATA_TIMEOUT);
            return;
        }
        m27333a(bluetoothDevice, RcspErrorCode.buildJsonError(48, 12293, i3, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m27339a(DataTransferCmd.SendDataParam sendDataParam, OnOperationCallback<DataTransferCmd.SendDataResponse> onOperationCallback) {
        if (sendDataParam != null) {
            this.f37841a.sendRcspCommand(m27342b(), new DataTransferCmd(sendDataParam), new CustomRcspActionCallback("sendDataParam", onOperationCallback, new IHandleResult<DataTransferCmd.SendDataResponse, DataTransferCmd>() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.4
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public int hasResult(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd) {
                    return 0;
                }

                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public DataTransferCmd.SendDataResponse handleResult(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd) {
                    if (dataTransferCmd != null && dataTransferCmd.getStatus() == 0 && (dataTransferCmd.getResponse() instanceof DataTransferCmd.SendDataResponse)) {
                        return (DataTransferCmd.SendDataResponse) dataTransferCmd.getResponse();
                    }
                    return null;
                }
            }));
        } else if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(4097, "SendDataParam can not be null."));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27338a(DataTransferCmd.ReadDataParam readDataParam, OnOperationCallback<DataTransferCmd.ReadDataResponse> onOperationCallback) {
        if (readDataParam != null) {
            this.f37841a.sendRcspCommand(m27342b(), new DataTransferCmd(readDataParam), new CustomRcspActionCallback("readDataParam", onOperationCallback, new IHandleResult<DataTransferCmd.ReadDataResponse, DataTransferCmd>() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.5
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public int hasResult(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd) {
                    return 0;
                }

                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public DataTransferCmd.ReadDataResponse handleResult(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd) {
                    if (dataTransferCmd != null && dataTransferCmd.getStatus() == 0 && (dataTransferCmd.getResponse() instanceof DataTransferCmd.ReadDataResponse)) {
                        return (DataTransferCmd.ReadDataResponse) dataTransferCmd.getResponse();
                    }
                    return null;
                }
            }));
        } else if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(4097, "ReadDataParam can not be null."));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27337a(DataTransferCmd.DataTransferParam dataTransferParam, OnOperationCallback<DataTransferCmd.DataTransferResponse> onOperationCallback) {
        if (dataTransferParam != null) {
            this.f37841a.sendRcspCommand(m27342b(), new DataTransferCmd(dataTransferParam), new CustomRcspActionCallback("sendDataBlock", onOperationCallback, new IHandleResult<DataTransferCmd.DataTransferResponse, DataTransferCmd>() { // from class: com.jieli.jl_rcsp.impl.DataTransferOpImpl.6
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public int hasResult(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd) {
                    return 0;
                }

                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public DataTransferCmd.DataTransferResponse handleResult(BluetoothDevice bluetoothDevice, DataTransferCmd dataTransferCmd) {
                    if (dataTransferCmd != null && dataTransferCmd.getStatus() == 0 && (dataTransferCmd.getResponse() instanceof DataTransferCmd.DataTransferResponse)) {
                        return (DataTransferCmd.DataTransferResponse) dataTransferCmd.getResponse();
                    }
                    return null;
                }
            }));
        } else if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(4097, "DataTransferParam can not be null."));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27332a(int i, OnOperationCallback<Boolean> onOperationCallback) {
        this.f37841a.sendRcspCommand(m27342b(), new DataTransferCmd(new DataTransferCmd.CancelTransferParam(i)), new BooleanRcspActionCallback("cancelTransfer", onOperationCallback));
    }

    /* JADX INFO: renamed from: a */
    public static String m27319a(int i) {
        switch (i) {
            case 0:
                return "Successful.";
            case 1:
                return "CRC error.";
            case 2:
                return "Sequence error.";
            case 3:
                return "Data type is not supported.";
            case 4:
                return "Transfer way is not supported.";
            case 5:
                return "Data length is out of bounds.";
            case 6:
                return "Read/write Data Exception.";
            case 7:
                return "Missing parameter configuration.";
            default:
                return "";
        }
    }
}
