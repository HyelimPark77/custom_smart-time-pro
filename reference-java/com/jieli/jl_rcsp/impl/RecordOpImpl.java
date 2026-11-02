package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.interfaces.record.IRecordOp;
import com.jieli.jl_rcsp.interfaces.record.OnRecordStateCallback;
import com.jieli.jl_rcsp.model.RecordParam;
import com.jieli.jl_rcsp.model.RecordState;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.data.DataHasResponseCmd;
import com.jieli.jl_rcsp.model.command.speech.StartSpeechCmd;
import com.jieli.jl_rcsp.model.command.speech.StopSpeechCmd;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.model.parameter.StartSpeechParam;
import com.jieli.jl_rcsp.model.parameter.StopSpeechParam;
import com.jieli.jl_rcsp.model.response.StopSpeechResponse;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.RecordStateCallbackHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class RecordOpImpl implements IRecordOp {

    /* JADX INFO: renamed from: b */
    public final RcspOpImpl f37960b;

    /* JADX INFO: renamed from: c */
    public final RecordState f37961c;

    /* JADX INFO: renamed from: d */
    public final RecordStateCallbackHelper f37962d;

    /* JADX INFO: renamed from: i */
    public final OnRcspCallback f37967i;

    /* JADX INFO: renamed from: a */
    public final String f37959a = RecordOpImpl.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    public boolean f37963e = false;

    /* JADX INFO: renamed from: f */
    public boolean f37964f = false;

    /* JADX INFO: renamed from: g */
    public boolean f37965g = false;

    /* JADX INFO: renamed from: h */
    public final RcspCommandCallback<CommandBase> f37966h = new RcspCommandCallback<CommandBase>() { // from class: com.jieli.jl_rcsp.impl.RecordOpImpl.3
        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
            if (baseError == null) {
                return;
            }
            RecordOpImpl.this.m27419a(bluetoothDevice, baseError.getSubCode(), baseError.getMessage());
        }
    };

    public RecordOpImpl(RcspOpImpl rcspOpImpl) {
        OnRcspCallback onRcspCallback = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.impl.RecordOpImpl.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (commandBase == null) {
                    return;
                }
                int id = commandBase.getId();
                if (id == 4) {
                    if (RecordOpImpl.this.m27423a()) {
                        return;
                    }
                    StartSpeechCmd startSpeechCmd = (StartSpeechCmd) commandBase;
                    StartSpeechParam startSpeechParam = (StartSpeechParam) startSpeechCmd.getParam();
                    if (startSpeechParam == null) {
                        return;
                    }
                    RecordOpImpl.this.m27421a(bluetoothDevice, new RecordParam(startSpeechParam.getType(), startSpeechParam.getFreq(), startSpeechParam.getWay()));
                    startSpeechCmd.setParam(null);
                    startSpeechCmd.setStatus(0);
                    RecordOpImpl.this.f37960b.sendCommandResponse(bluetoothDevice, startSpeechCmd, RecordOpImpl.this.f37966h);
                    return;
                }
                if (id == 5 && RecordOpImpl.this.m27423a()) {
                    StopSpeechCmd stopSpeechCmd = (StopSpeechCmd) commandBase;
                    StopSpeechParam stopSpeechParam = (StopSpeechParam) stopSpeechCmd.getParam();
                    if (stopSpeechParam == null) {
                        return;
                    }
                    boolean z = stopSpeechParam.isPlayTTS() || RecordOpImpl.this.f37965g;
                    boolean z2 = stopSpeechParam.isSyncIatText() || RecordOpImpl.this.f37963e;
                    boolean z3 = stopSpeechParam.isSyncNlpText() || RecordOpImpl.this.f37964f;
                    RecordOpImpl.this.m27420a(bluetoothDevice, stopSpeechParam.getReason(), z2, z3, z);
                    stopSpeechCmd.setParam(new StopSpeechCmd.ReplyParam(z2, z3, z));
                    stopSpeechCmd.setStatus(0);
                    RecordOpImpl.this.f37960b.sendCommandResponse(bluetoothDevice, stopSpeechCmd, RecordOpImpl.this.f37966h);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspDataCmd(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (commandBase != null) {
                    if (commandBase.getId() != 1) {
                        return;
                    }
                    boolean z = commandBase.getType() == 2;
                    DataParam dataParam = z ? (DataParam) ((DataHasResponseCmd) commandBase).getParam() : (DataParam) ((DataCmd) commandBase).getParam();
                    if (dataParam == null || dataParam.getXmOpCode() != 4) {
                        return;
                    }
                    RecordOpImpl.this.m27422a(bluetoothDevice, dataParam.getData());
                    if (z) {
                        ((DataHasResponseCmd) commandBase).setParam(null);
                        commandBase.setStatus(0);
                        RecordOpImpl.this.f37960b.sendCommandResponse(bluetoothDevice, commandBase, RecordOpImpl.this.f37966h);
                    }
                }
            }
        };
        this.f37967i = onRcspCallback;
        if (rcspOpImpl == null) {
            throw new NullPointerException("RcspOpImpl can not be null.");
        }
        this.f37960b = rcspOpImpl;
        this.f37961c = new RecordState();
        this.f37962d = new RecordStateCallbackHelper();
        rcspOpImpl.registerOnRcspCallback(onRcspCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void addOnRecordStateCallback(OnRecordStateCallback onRecordStateCallback) {
        this.f37962d.addOnRecordStateCallback(onRecordStateCallback);
    }

    public BluetoothDevice getConnectedDevice() {
        return this.f37960b.getConnectedDevice();
    }

    public RcspOpImpl getRcspOp() {
        return this.f37960b;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public RecordState getRecordState() {
        return this.f37961c;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void release() {
        stopRecord(this.f37960b.getConnectedDevice(), 1, false, false, false, null);
        this.f37960b.unregisterOnRcspCallback(this.f37967i);
        this.f37962d.release();
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void removeOnRecordStateCallback(OnRecordStateCallback onRecordStateCallback) {
        this.f37962d.removeOnRecordStateCallback(onRecordStateCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void setSupportPlayTTS(boolean z) {
        this.f37965g = z;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void setSupportSyncIatText(boolean z) {
        this.f37963e = z;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void setSupportSyncNlpText(boolean z) {
        this.f37964f = z;
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void startRecord(final BluetoothDevice bluetoothDevice, RecordParam recordParam, final OnOperationCallback<Boolean> onOperationCallback) {
        if (recordParam == null) {
            if (onOperationCallback != null) {
                onOperationCallback.onFailed(new BaseError(4097, "startRecord : RecordParam is null."));
            }
        } else if (!m27423a()) {
            m27421a(bluetoothDevice, recordParam);
            this.f37960b.sendRcspCommand(bluetoothDevice, new StartSpeechCmd(new StartSpeechParam(CHexConver.intToByte(recordParam.getVoiceType()), CHexConver.intToByte(recordParam.getSampleRate()), CHexConver.intToByte(recordParam.getVadWay()))), new BooleanRcspActionCallback("startRecord", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.RecordOpImpl.1
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    OnOperationCallback onOperationCallback2 = onOperationCallback;
                    if (onOperationCallback2 != null) {
                        onOperationCallback2.onFailed(baseError);
                    }
                    RecordOpImpl.this.m27419a(bluetoothDevice, baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    OnOperationCallback onOperationCallback2 = onOperationCallback;
                    if (onOperationCallback2 != null) {
                        onOperationCallback2.onSuccess(bool);
                    }
                }
            }));
        } else if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(12291, "startRecord : Recording"));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.record.IRecordOp
    public void stopRecord(BluetoothDevice bluetoothDevice, final int i, boolean z, boolean z2, boolean z3, final OnOperationCallback<Boolean> onOperationCallback) {
        if (!m27423a()) {
            if (onOperationCallback != null) {
                onOperationCallback.onFailed(new BaseError(4097, "Recording is not started."));
                return;
            }
            return;
        }
        this.f37963e = z;
        this.f37964f = z2;
        this.f37965g = z3;
        StopSpeechParam stopSpeechParam = new StopSpeechParam();
        stopSpeechParam.setReason(CHexConver.intToByte(i));
        stopSpeechParam.setSyncIatText(z);
        stopSpeechParam.setSyncNlpText(z2);
        stopSpeechParam.setPlayTTS(z3);
        this.f37960b.sendRcspCommand(bluetoothDevice, new StopSpeechCmd(stopSpeechParam), new RcspCommandCallback<StopSpeechCmd>() { // from class: com.jieli.jl_rcsp.impl.RecordOpImpl.2
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onFailed(baseError);
                }
                RecordOpImpl.this.m27419a(bluetoothDevice2, baseError.getSubCode(), baseError.getMessage());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice2, StopSpeechCmd stopSpeechCmd) {
                StopSpeechResponse stopSpeechResponse = (StopSpeechResponse) stopSpeechCmd.getResponse();
                if (stopSpeechResponse == null || stopSpeechCmd.getStatus() != 0) {
                    onErrCode(bluetoothDevice2, RcspErrorCode.buildJsonError(stopSpeechCmd.getId(), 12292, stopSpeechCmd.getStatus(), null));
                } else {
                    RecordOpImpl.this.m27420a(bluetoothDevice2, i, stopSpeechResponse.isSyncIatText() || RecordOpImpl.this.f37963e, stopSpeechResponse.isSyncNlpText() || RecordOpImpl.this.f37964f, stopSpeechResponse.isPlayTTS() || RecordOpImpl.this.f37965g);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27423a() {
        return this.f37961c.getState() != 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m27421a(BluetoothDevice bluetoothDevice, RecordParam recordParam) {
        if (recordParam != null && !m27423a()) {
            this.f37961c.setState(1).setRecordParam(recordParam).setVoiceData(new byte[0]);
            this.f37962d.onStateChange(bluetoothDevice, this.f37961c);
            return;
        }
        JL_Log.m27887w(this.f37959a, "cbRecordStart", "RecordParam is null or state error. " + this.f37961c.getState());
    }

    /* JADX INFO: renamed from: a */
    public final void m27422a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (bArr != null && bArr.length != 0 && m27423a()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (this.f37961c.getVoiceData() != null && this.f37961c.getVoiceData().length > 0) {
                    byteArrayOutputStream.write(this.f37961c.getVoiceData());
                }
                byteArrayOutputStream.write(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f37961c.setState(2).setVoiceDataBlock(bArr).setVoiceData(byteArrayOutputStream.toByteArray());
            this.f37962d.onStateChange(bluetoothDevice, this.f37961c);
            return;
        }
        JL_Log.m27887w(this.f37959a, "cbRecordWorking", "data is null or state error. " + this.f37961c.getState());
    }

    /* JADX INFO: renamed from: a */
    public final void m27420a(BluetoothDevice bluetoothDevice, int i, boolean z, boolean z2, boolean z3) {
        if (!m27423a()) {
            JL_Log.m27887w(this.f37959a, "cbRecordStop", "state error. " + this.f37961c.getState() + ", reason = " + i);
            return;
        }
        this.f37961c.setState(0).setVoiceDataBlock(new byte[0]).setSyncIatText(z).setSyncNlpText(z2).setPlayTTS(z3).setReason(i);
        this.f37962d.onStateChange(bluetoothDevice, this.f37961c);
    }

    /* JADX INFO: renamed from: a */
    public final void m27419a(BluetoothDevice bluetoothDevice, int i, String str) {
        if (!m27423a()) {
            JL_Log.m27887w(this.f37959a, "cbRecordError", "state error. " + this.f37961c.getState() + ", code = " + i + ", explain = " + str);
            return;
        }
        this.f37961c.setState(0).setVoiceDataBlock(new byte[0]).setVoiceData(new byte[0]).setReason(i).setMessage(str);
        this.f37962d.onStateChange(bluetoothDevice, this.f37961c);
    }
}
