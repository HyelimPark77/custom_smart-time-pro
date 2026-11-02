package com.jieli.jl_bt_ota.impl;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.android.mltcode.paycertificationapi.bf2;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.bt.IBtProxy;
import com.jieli.jl_bt_ota.interfaces.command.OnDataHandlerListener;
import com.jieli.jl_bt_ota.interfaces.rcsp.ICmdSnGenerator;
import com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp;
import com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.command.GetDevMD5Cmd;
import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;
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
    private final String a;
    private final Context b;
    private final IBtProxy c;
    private final RcspAuth d;
    private final DeviceStatusCache e;
    private final CallbackManager f;
    private BluetoothOTAConfigure g;
    private volatile BluetoothDevice h;
    private volatile IDataHandler i;
    private ICmdSnGenerator j;

    public static final class CallbackManager extends BaseCallbackHelper<OnRcspCallback> {
        private CallbackManager() {
        }

        public static /* synthetic */ void O00(BluetoothDevice r0, boolean r1, OnRcspCallback r2) {
            a(r0, r1, r2);
        }

        public static /* synthetic */ void OXO1(BluetoothDevice r0, OnRcspCallback r1) {
            a(r0, r1);
        }

        public static /* synthetic */ void XIi00iiXO(BluetoothDevice r0, BaseError r1, OnRcspCallback r2) {
            a(r0, r1, r2);
        }

        public static /* synthetic */ void XO0O10(BluetoothDevice r0, CommandBase r1, OnRcspCallback r2) {
            a(r0, r1, r2);
        }

        private static /* synthetic */ void a(BluetoothDevice r0, boolean r1, OnRcspCallback r2) {
            r2.onRcspInit(r0, r1);
        }

        public static /* synthetic */ void iO(BluetoothDevice r0, int r1, OnRcspCallback r2) {
            a(r0, r1, r2);
        }

        public void onConnectStateChange(final BluetoothDevice r2, final int r3) {
            callbackEvent(new OXO1(r2, r3));
        }

        public void onMandatoryUpgrade(final BluetoothDevice r2) {
            callbackEvent(new iO(r2));
        }

        public void onRcspCommand(final BluetoothDevice r2, final CommandBase r3) {
            callbackEvent(new XO0O10(r2, r3));
        }

        public void onRcspError(final BluetoothDevice r2, final BaseError r3) {
            callbackEvent(new XIi00iiXO(r2, r3));
        }

        public void onRcspInit(final BluetoothDevice r2, final boolean r3) {
            callbackEvent(new O00(r2, r3));
        }

        public /* synthetic */ CallbackManager(AnonymousClass1 r1) {
            this();
        }

        private static /* synthetic */ void a(BluetoothDevice r0, CommandBase r1, OnRcspCallback r2) {
            r2.onRcspCommand(r0, r1);
        }

        private static /* synthetic */ void a(BluetoothDevice r0, BaseError r1, OnRcspCallback r2) {
            r2.onRcspError(r0, r1);
        }

        private static /* synthetic */ void a(BluetoothDevice r0, OnRcspCallback r1) {
            r1.onMandatoryUpgrade(r0);
        }

        private static /* synthetic */ void a(BluetoothDevice r0, int r1, OnRcspCallback r2) {
            r2.onConnectStateChange(r0, r1);
        }
    }

    public RcspOpImpl(Context r2, IBtProxy r3) {
        this(r2, r3, BluetoothOTAConfigure.createDefault());
    }

    public static /* synthetic */ String a(RcspOpImpl r0) {
        return r0.a;
    }

    public static /* synthetic */ DeviceStatusCache b(RcspOpImpl r0) {
        return r0.e;
    }

    public static /* synthetic */ CallbackManager c(RcspOpImpl r0) {
        return r0.f;
    }

    private void d(BluetoothDevice r1) {
        this.h = r1;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void configure(BluetoothOTAConfigure r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        this.g = r1;
        this.j = r1.getSnGenerator();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public BluetoothOTAConfigure getBluetoothOption() {
        return this.g;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public TargetInfoResponse getDeviceInfo(BluetoothDevice r2) {
        return this.e.getDeviceInfo(r2);
    }

    public DeviceStatusCache getDeviceStatusCache() {
        return this.e;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public BluetoothDevice getTargetDevice() {
        return this.h;
    }

    public boolean isDeviceAuthPass(BluetoothDevice r2) {
        if (this.g.isUseAuthDevice() == true) goto L5;
        return true;
    L5:
        if (this.e.isAuthBtDevice(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void registerOnRcspCallback(OnRcspCallback r2) {
        this.f.addCallback(r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void release() {
        this.d.destroy();
        this.e.clear();
        this.f.release();
        ICmdSnGenerator r0 = this.j;
        if (r0 != null) goto L5;
        return;
    L5:
        if ((r0 instanceof SnGenerator) == false) goto L7;
        ((SnGenerator) r0).destroy();
    L7:
        this.j = null;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandAsync(BluetoothDevice r7, T r8, int r9, CommandCallback<T> r10) {
        a(r7, r8, 1, r9, r10);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(BluetoothDevice r8, T r9, CommandCallback<T> r10) {
        a(r8, r9, 0, getBluetoothOption().getTimeoutMs(), r10);
    }

    public <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendRcspCommand(T r3, CommandCallback<T> r4) {
        sendCommandAsync(getTargetDevice(), r3, getBluetoothOption().getTimeoutMs(), r4);
    }

    public void syncDeviceInfo(final IActionCallback<TargetInfoResponse> r5) {
        sendRcspCommand(CommandBuilder.buildGetTargetInfoCmdForAll(), new CmdResultCallback("getDeviceInfo", new AnonymousClass3(this, r5), new AnonymousClass4(this)));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.rcsp.IRcspOp
    public void unregisterOnRcspCallback(OnRcspCallback r2) {
        this.f.removeCallback(r2);
    }

    public RcspOpImpl(Context r3, IBtProxy r4, BluetoothOTAConfigure r5) {
        this.a = getClass().getSimpleName();
        this.b = (Context) CommonUtil.checkNotNull(r3);
        final IBtProxy r6 = (IBtProxy) CommonUtil.checkNotNull(r4);
        this.c = r6;
        configure(r5);
        Objects.requireNonNull(r6);
        this.d = new RcspAuth(r3, new bf2(r6), new AnonymousClass1(this));
        this.e = new DeviceStatusCache();
        this.f = new CallbackManager(null);
        r6.setOnBtListener(new AnonymousClass2(this));
    }

    public static /* synthetic */ void a(RcspOpImpl r0, BluetoothDevice r1) {
        r0.a(r1);
    }

    private void b(BluetoothDevice r2) {
        if (BluetoothUtil.deviceEquals(r2, getTargetDevice()) == false) goto L5;
        d(null);
    L5:
        this.e.removeDeviceStatus(r2);
        a();
    }

    private int c(BluetoothDevice r2) {
        if (this.j != null) goto L6;
        this.j = new SnGenerator();
    L6:
        return this.j.getRcspCmdSeq(r2);
    }

    public static /* synthetic */ void a(RcspOpImpl r0, BluetoothDevice r1, int r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void a(RcspOpImpl r0, BluetoothDevice r1, byte[] r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void a(RcspOpImpl r0, IActionCallback r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void a(RcspOpImpl r0, BluetoothDevice r1, TargetInfoResponse r2) {
        r0.a(r1, r2);
    }

    private void a(BluetoothDevice r2, int r3) {
        this.f.onConnectStateChange(r2, r3);
        if (r3 != 0) goto L5;
    L11:
        b(r2);
        return;
    L5:
        if (r3 != 1) goto L7;
        a(r2);
        return;
    L7:
        if (r3 == 2) goto L11;
    }

    private void a(BluetoothDevice r3, byte[] r4) {
        if (isDeviceAuthPass(r3) == true) goto L7;
        this.d.handleAuthData(r3, r4);
        return;
    L7:
        if (this.i != null) goto L10;
        JL_Log.i(this.a, "onReceiveDeviceData", "No data processor.");
        return;
    L10:
        TargetInfoResponse r0 = getDeviceInfo(r3);
        ReceivedDataInfo r1 = new ReceivedDataInfo(r3, r4);
        if (r0 != null) goto L13;
    L15:
        this.i.addRecvData(r1);
        return;
    L13:
        if (r0.getSendMtu() <= 0) goto L15;
        r1.setDeviceSendMtu(r0.getSendMtu());
        goto L15
    }

    private void a(final BluetoothDevice r4) {
        d(r4);
        if (isDeviceAuthPass(r4) == true) goto L9;
        this.d.stopAuth(r4, false);
        if (this.d.startAuth(r4) == true) goto L13;
        this.f.onRcspError(r4, OTAError.buildError(20481));
        return;
    L13:
        return;
    L9:
        if (this.i != null) goto L11;
        OnDataHandlerListener r0 = new AnonymousClass5(this);
        this.i = new RcspDataHandler(this.c, r0);
    L11:
        syncDeviceInfo(new AnonymousClass6(this, r4));
    }

    private void a() {
        JL_Log.i(this.a, "releaseDataHandler", "dataHandler : " + this.i);
        if (this.i != null) goto L5;
        return;
    L5:
        this.i.release();
        this.i = null;
    }

    private <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void a(BluetoothDevice r8, T r9, int r10, int r11, CommandCallback<T> r12) {
        if (r8 != null) goto L4;
        r8 = getTargetDevice();
    L4:
        BluetoothDevice r1 = r8;
        if (r1 != null) goto L8;
        a(OTAError.buildError(4114), r12);
        return;
    L8:
        if (r9 != null) goto L12;
        a(OTAError.buildError(4097), r12);
        return;
    L12:
        if (isDeviceAuthPass(r1) == true) goto L15;
        a(OTAError.buildError(20481), r12);
        return;
    L15:
        IDataHandler r6 = this.i;
        if (r6 != null) goto L20;
        a(OTAError.buildError(4114, "No data processor."), r12);
        return;
    L20:
        if (r10 != 1) goto L22;
        r9.setOpCodeSn(c(r1));
    L22:
        SendDataInfo<?> r0 = new SendDataInfo(r1, r10, r9, r11, r12);
        TargetInfoResponse r13 = getDeviceInfo(r1);
        if (r13 != null) goto L25;
    L27:
        r6.addSendData(r0);
        return;
    L25:
        if (r13.getReceiveMtu() <= 0) goto L27;
        r0.setDeviceReceiveMtu(r13.getReceiveMtu());
        goto L27
    }

    private void a(IActionCallback<String> r5) {
        sendRcspCommand(new GetDevMD5Cmd(), new CmdResultCallback("getMD5", r5, new AnonymousClass7(this)));
    }

    private void a(BaseError r4, CommandCallback<?> r5) {
        if (r4 != null) goto L4;
        return;
    L4:
        JL_Log.w(this.a, "cbCommandError", "callback : " + r5 + ", " + r4);
        if (r5 == null) goto L8;
        r5.onErrCode(r4);
        return;
    L8:
        this.f.onRcspError(getTargetDevice(), r4);
    }

    private void a(BluetoothDevice r3, TargetInfoResponse r4) {
        if (r3 == null) goto L16;
        if (r4 != null) goto L6;
        return;
    L6:
        if (r4.isMandatoryUpgrade() == false) goto L8;
    L14:
        this.f.onRcspInit(r3, true);
        this.f.onMandatoryUpgrade(r3);
        return;
    L8:
        if (r4.isSupportReuseSpaceOTA() == true) goto L10;
    L12:
        this.f.onRcspInit(r3, true);
        return;
    L10:
        if (r4.getExpandMode() != 3) goto L12;
    }
}
