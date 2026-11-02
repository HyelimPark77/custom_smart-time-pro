package com.jieli.jl_bt_ota.impl;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.command.OnDataHandlerListener;
import com.jieli.jl_bt_ota.interfaces.p199bt.IBtProxy;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtListener;
import com.jieli.jl_bt_ota.interfaces.rcsp.ICmdSnGenerator;
import com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult;
import com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp;
import com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.GetDevMD5Cmd;
import com.jieli.jl_bt_ota.model.command.GetTargetInfoCmd;
import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;
import com.jieli.jl_bt_ota.model.response.GetDevMD5Response;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.tool.DeviceStatusCache;
import com.jieli.jl_bt_ota.tool.SnGenerator;
import com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper;
import com.jieli.jl_bt_ota.tool.callback.CmdResultCallback;
import com.jieli.jl_bt_ota.tool.data_handler.IDataHandler;
import com.jieli.jl_bt_ota.tool.data_handler.RcspDataHandler;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CommandBuilder;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class RcspOpImpl implements IRcspOp {

    /* JADX INFO: renamed from: a */
    private final String f37542a;

    /* JADX INFO: renamed from: b */
    private final Context f37543b;

    /* JADX INFO: renamed from: c */
    private final IBtProxy f37544c;

    /* JADX INFO: renamed from: d */
    private final RcspAuth f37545d;

    /* JADX INFO: renamed from: e */
    private final DeviceStatusCache f37546e;

    /* JADX INFO: renamed from: f */
    private final CallbackManager f37547f;

    /* JADX INFO: renamed from: g */
    private BluetoothOTAConfigure f37548g;

    /* JADX INFO: renamed from: h */
    private volatile BluetoothDevice f37549h;

    /* JADX INFO: renamed from: i */
    private volatile IDataHandler f37550i;

    /* JADX INFO: renamed from: j */
    private ICmdSnGenerator f37551j;

    public static final class CallbackManager extends BaseCallbackHelper<OnRcspCallback> {
        private CallbackManager() {
        }

        public void onConnectStateChange(final BluetoothDevice bluetoothDevice, final int i) {
            callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.jieli.jl_bt_ota.impl.OXO1
                @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
                public final void onHandle(Object obj) {
                    ((OnRcspCallback) obj).onConnectStateChange(bluetoothDevice, i);
                }
            });
        }

        public void onMandatoryUpgrade(final BluetoothDevice bluetoothDevice) {
            callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.jieli.jl_bt_ota.impl.iO
                @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
                public final void onHandle(Object obj) {
                    ((OnRcspCallback) obj).onMandatoryUpgrade(bluetoothDevice);
                }
            });
        }

        public void onRcspCommand(final BluetoothDevice bluetoothDevice, final CommandBase commandBase) {
            callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.jieli.jl_bt_ota.impl.XO0O10
                @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
                public final void onHandle(Object obj) {
                    ((OnRcspCallback) obj).onRcspCommand(bluetoothDevice, commandBase);
                }
            });
        }

        public void onRcspError(final BluetoothDevice bluetoothDevice, final BaseError baseError) {
            callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.jieli.jl_bt_ota.impl.XIi00iiXO
                @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
                public final void onHandle(Object obj) {
                    ((OnRcspCallback) obj).onRcspError(bluetoothDevice, baseError);
                }
            });
        }

        public void onRcspInit(final BluetoothDevice bluetoothDevice, final boolean z) {
            callbackEvent(new BaseCallbackHelper.ICallbackHandler() { // from class: com.jieli.jl_bt_ota.impl.O00
                @Override // com.jieli.jl_bt_ota.tool.callback.BaseCallbackHelper.ICallbackHandler
                public final void onHandle(Object obj) {
                    ((OnRcspCallback) obj).onRcspInit(bluetoothDevice, z);
                }
            });
        }
    }

    public RcspOpImpl(Context context, IBtProxy iBtProxy) {
        this(context, iBtProxy, BluetoothOTAConfigure.createDefault());
    }

    /* JADX INFO: renamed from: d */
    private void m26977d(BluetoothDevice bluetoothDevice) {
        this.f37549h = bluetoothDevice;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void configure(BluetoothOTAConfigure bluetoothOTAConfigure) {
        if (bluetoothOTAConfigure == null) {
            return;
        }
        this.f37548g = bluetoothOTAConfigure;
        this.f37551j = bluetoothOTAConfigure.getSnGenerator();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public BluetoothOTAConfigure getBluetoothOption() {
        return this.f37548g;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public TargetInfoResponse getDeviceInfo(BluetoothDevice bluetoothDevice) {
        return this.f37546e.getDeviceInfo(bluetoothDevice);
    }

    public DeviceStatusCache getDeviceStatusCache() {
        return this.f37546e;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public BluetoothDevice getTargetDevice() {
        return this.f37549h;
    }

    public boolean isDeviceAuthPass(BluetoothDevice bluetoothDevice) {
        return !this.f37548g.isUseAuthDevice() || this.f37546e.isAuthBtDevice(bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void registerOnRcspCallback(OnRcspCallback onRcspCallback) {
        this.f37547f.addCallback(onRcspCallback);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void release() {
        this.f37545d.destroy();
        this.f37546e.clear();
        this.f37547f.release();
        ICmdSnGenerator iCmdSnGenerator = this.f37551j;
        if (iCmdSnGenerator != null) {
            if (iCmdSnGenerator instanceof SnGenerator) {
                ((SnGenerator) iCmdSnGenerator).destroy();
            }
            this.f37551j = null;
        }
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandAsync(BluetoothDevice bluetoothDevice, T t, int i, CommandCallback<T> commandCallback) {
        m26963a(bluetoothDevice, t, 1, i, commandCallback);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(BluetoothDevice bluetoothDevice, T t, CommandCallback<T> commandCallback) {
        m26963a(bluetoothDevice, t, 0, getBluetoothOption().getTimeoutMs(), commandCallback);
    }

    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendRcspCommand(T t, CommandCallback<T> commandCallback) {
        sendCommandAsync(getTargetDevice(), t, getBluetoothOption().getTimeoutMs(), commandCallback);
    }

    public void syncDeviceInfo(final IActionCallback<TargetInfoResponse> iActionCallback) {
        sendRcspCommand(CommandBuilder.buildGetTargetInfoCmdForAll(), new CmdResultCallback("getDeviceInfo", new IActionCallback<TargetInfoResponse>() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.3
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                IActionCallback iActionCallback2 = iActionCallback;
                if (iActionCallback2 != null) {
                    iActionCallback2.onError(baseError);
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(final TargetInfoResponse targetInfoResponse) {
                if (targetInfoResponse.isSupportMD5()) {
                    RcspOpImpl.this.m26971a(new IActionCallback<String>() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.3.1
                        @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                        public void onError(BaseError baseError) {
                            IActionCallback iActionCallback2 = iActionCallback;
                            if (iActionCallback2 != null) {
                                iActionCallback2.onSuccess(targetInfoResponse);
                            }
                        }

                        @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                        public void onSuccess(String str) {
                            IActionCallback iActionCallback2 = iActionCallback;
                            if (iActionCallback2 != null) {
                                iActionCallback2.onSuccess(targetInfoResponse);
                            }
                        }
                    });
                    return;
                }
                IActionCallback iActionCallback2 = iActionCallback;
                if (iActionCallback2 != null) {
                    iActionCallback2.onSuccess(targetInfoResponse);
                }
            }
        }, new IHandleResult<TargetInfoResponse, GetTargetInfoCmd>() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.4
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(GetTargetInfoCmd getTargetInfoCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public TargetInfoResponse handleResult(GetTargetInfoCmd getTargetInfoCmd) {
                if (getTargetInfoCmd == null) {
                    return null;
                }
                TargetInfoResponse targetInfoResponse = (TargetInfoResponse) getTargetInfoCmd.getResponse();
                RcspOpImpl.this.f37546e.updateDeviceTargetInfo(RcspOpImpl.this.getTargetDevice(), targetInfoResponse);
                return targetInfoResponse;
            }
        }));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void unregisterOnRcspCallback(OnRcspCallback onRcspCallback) {
        this.f37547f.removeCallback(onRcspCallback);
    }

    public RcspOpImpl(Context context, IBtProxy iBtProxy, BluetoothOTAConfigure bluetoothOTAConfigure) {
        this.f37542a = getClass().getSimpleName();
        this.f37543b = (Context) CommonUtil.checkNotNull(context);
        final IBtProxy iBtProxy2 = (IBtProxy) CommonUtil.checkNotNull(iBtProxy);
        this.f37544c = iBtProxy2;
        configure(bluetoothOTAConfigure);
        Objects.requireNonNull(iBtProxy2);
        this.f37545d = new RcspAuth(context, new RcspAuth.IRcspAuthOp() { // from class: com.android.mltcode.paycertificationapi.bf2
            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.IRcspAuthOp
            public final boolean sendAuthDataToDevice(BluetoothDevice bluetoothDevice, byte[] bArr) {
                return iBtProxy2.writeData(bluetoothDevice, bArr);
            }
        }, new RcspAuth.OnRcspAuthListener() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.1
            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.OnRcspAuthListener
            public void onAuthFailed(BluetoothDevice bluetoothDevice, int i, String str) {
                if (i == 40977) {
                    onAuthSuccess(bluetoothDevice);
                    return;
                }
                RcspOpImpl.this.f37546e.updateDeviceIsAuth(bluetoothDevice, false);
                RcspOpImpl.this.f37547f.onRcspError(bluetoothDevice, OTAError.buildError(20481, i, str));
                RcspOpImpl.this.f37547f.onRcspInit(bluetoothDevice, false);
            }

            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.OnRcspAuthListener
            public void onAuthSuccess(BluetoothDevice bluetoothDevice) {
                RcspOpImpl.this.f37546e.updateDeviceIsAuth(bluetoothDevice, true);
                RcspOpImpl.this.m26961a(bluetoothDevice);
            }

            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.OnRcspAuthListener
            public void onInitResult(boolean z) {
                JL_Log.m27232d(RcspOpImpl.this.f37542a, "onInitResult", "" + z);
            }
        });
        this.f37546e = new DeviceStatusCache();
        this.f37547f = new CallbackManager();
        iBtProxy2.setOnBtListener(new OnBtListener() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.2
            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtListener
            public void onConnection(BluetoothDevice bluetoothDevice, int i) {
                RcspOpImpl.this.m26962a(bluetoothDevice, i);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtListener
            public void onReceivedData(BluetoothDevice bluetoothDevice, byte[] bArr) {
                RcspOpImpl.this.m26965a(bluetoothDevice, bArr);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m26974b(BluetoothDevice bluetoothDevice) {
        if (BluetoothUtil.deviceEquals(bluetoothDevice, getTargetDevice())) {
            m26977d(null);
        }
        this.f37546e.removeDeviceStatus(bluetoothDevice);
        m26960a();
    }

    /* JADX INFO: renamed from: c */
    private int m26975c(BluetoothDevice bluetoothDevice) {
        if (this.f37551j == null) {
            this.f37551j = new SnGenerator();
        }
        return this.f37551j.getRcspCmdSeq(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26962a(BluetoothDevice bluetoothDevice, int i) {
        this.f37547f.onConnectStateChange(bluetoothDevice, i);
        if (i != 0) {
            if (i == 1) {
                m26961a(bluetoothDevice);
                return;
            } else if (i != 2) {
                return;
            }
        }
        m26974b(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26965a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (!isDeviceAuthPass(bluetoothDevice)) {
            this.f37545d.handleAuthData(bluetoothDevice, bArr);
            return;
        }
        if (this.f37550i == null) {
            JL_Log.m27236i(this.f37542a, "onReceiveDeviceData", "No data processor.");
            return;
        }
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
        ReceivedDataInfo receivedDataInfo = new ReceivedDataInfo(bluetoothDevice, bArr);
        if (deviceInfo != null && deviceInfo.getSendMtu() > 0) {
            receivedDataInfo.setDeviceSendMtu(deviceInfo.getSendMtu());
        }
        this.f37550i.addRecvData(receivedDataInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26961a(final BluetoothDevice bluetoothDevice) {
        m26977d(bluetoothDevice);
        if (!isDeviceAuthPass(bluetoothDevice)) {
            this.f37545d.stopAuth(bluetoothDevice, false);
            if (this.f37545d.startAuth(bluetoothDevice)) {
                return;
            }
            this.f37547f.onRcspError(bluetoothDevice, OTAError.buildError(20481));
            return;
        }
        if (this.f37550i == null) {
            this.f37550i = new RcspDataHandler(this.f37544c, new OnDataHandlerListener() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.5
                @Override // com.jieli.jl_bt_ota.interfaces.command.OnDataHandlerListener
                public void onRCSPError(BluetoothDevice bluetoothDevice2, BaseError baseError) {
                    RcspOpImpl.this.f37547f.onRcspError(bluetoothDevice2, baseError);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.command.OnDataHandlerListener
                public void onReceivedCmd(BluetoothDevice bluetoothDevice2, CommandBase commandBase) {
                    RcspOpImpl.this.f37547f.onRcspCommand(bluetoothDevice2, commandBase);
                }
            });
        }
        syncDeviceInfo(new IActionCallback<TargetInfoResponse>() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.6
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                RcspOpImpl.this.f37547f.onRcspError(bluetoothDevice, baseError);
                RcspOpImpl.this.f37547f.onRcspInit(bluetoothDevice, false);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(TargetInfoResponse targetInfoResponse) {
                RcspOpImpl.this.m26964a(bluetoothDevice, targetInfoResponse);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m26960a() {
        JL_Log.m27236i(this.f37542a, "releaseDataHandler", "dataHandler : " + this.f37550i);
        if (this.f37550i == null) {
            return;
        }
        this.f37550i.release();
        this.f37550i = null;
    }

    /* JADX INFO: renamed from: a */
    private <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void m26963a(BluetoothDevice bluetoothDevice, T t, int i, int i2, CommandCallback<T> commandCallback) {
        if (bluetoothDevice == null) {
            bluetoothDevice = getTargetDevice();
        }
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        if (bluetoothDevice2 == null) {
            m26972a(OTAError.buildError(4114), (CommandCallback<?>) commandCallback);
            return;
        }
        if (t == null) {
            m26972a(OTAError.buildError(4097), (CommandCallback<?>) commandCallback);
            return;
        }
        if (!isDeviceAuthPass(bluetoothDevice2)) {
            m26972a(OTAError.buildError(20481), (CommandCallback<?>) commandCallback);
            return;
        }
        IDataHandler iDataHandler = this.f37550i;
        if (iDataHandler == null) {
            m26972a(OTAError.buildError(4114, "No data processor."), (CommandCallback<?>) commandCallback);
            return;
        }
        if (i == 1) {
            t.setOpCodeSn(m26975c(bluetoothDevice2));
        }
        SendDataInfo<?> sendDataInfo = new SendDataInfo<>(bluetoothDevice2, i, t, i2, commandCallback);
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice2);
        if (deviceInfo != null && deviceInfo.getReceiveMtu() > 0) {
            sendDataInfo.setDeviceReceiveMtu(deviceInfo.getReceiveMtu());
        }
        iDataHandler.addSendData(sendDataInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26971a(IActionCallback<String> iActionCallback) {
        sendRcspCommand(new GetDevMD5Cmd(), new CmdResultCallback("getMD5", iActionCallback, new IHandleResult<String, GetDevMD5Cmd>() { // from class: com.jieli.jl_bt_ota.impl.RcspOpImpl.7
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public int hasResult(GetDevMD5Cmd getDevMD5Cmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult
            public String handleResult(GetDevMD5Cmd getDevMD5Cmd) {
                if (getDevMD5Cmd == null || getDevMD5Cmd.getResponse() == 0) {
                    return "";
                }
                String md5 = ((GetDevMD5Response) getDevMD5Cmd.getResponse()).getMd5();
                RcspOpImpl.this.f37546e.updateDeviceMD5(RcspOpImpl.this.getTargetDevice(), md5);
                return md5;
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    private void m26972a(BaseError baseError, CommandCallback<?> commandCallback) {
        if (baseError == null) {
            return;
        }
        JL_Log.m27240w(this.f37542a, "cbCommandError", "callback : " + commandCallback + ", " + baseError);
        if (commandCallback != null) {
            commandCallback.onErrCode(baseError);
        } else {
            this.f37547f.onRcspError(getTargetDevice(), baseError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26964a(BluetoothDevice bluetoothDevice, TargetInfoResponse targetInfoResponse) {
        if (bluetoothDevice == null || targetInfoResponse == null) {
            return;
        }
        if (!targetInfoResponse.isMandatoryUpgrade() && (!targetInfoResponse.isSupportReuseSpaceOTA() || targetInfoResponse.getExpandMode() != 3)) {
            this.f37547f.onRcspInit(bluetoothDevice, true);
        } else {
            this.f37547f.onRcspInit(bluetoothDevice, true);
            this.f37547f.onMandatoryUpgrade(bluetoothDevice);
        }
    }
}
