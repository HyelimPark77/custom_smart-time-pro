package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.af2;
import com.ironsource.C2985d4;
import com.jieli.jl_rcsp.constant.Command;
import com.jieli.jl_rcsp.constant.RcspConstant;
import com.jieli.jl_rcsp.interfaces.bluetooth.CmdSnGenerator;
import com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy;
import com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspEventListener;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.DataInfo;
import com.jieli.jl_rcsp.model.Option;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.SettingsMtuCmd;
import com.jieli.jl_rcsp.model.command.status.GetTargetInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.GetSysInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.UpdateSysInfoCmd;
import com.jieli.jl_rcsp.model.command.watch.HealthSettingCmd;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.DeviceStatus;
import com.jieli.jl_rcsp.model.parameter.SettingsMtuParam;
import com.jieli.jl_rcsp.model.parameter.UpdateSysInfoParam;
import com.jieli.jl_rcsp.model.response.SettingsMtuResponse;
import com.jieli.jl_rcsp.model.response.SysInfoResponse;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.DataHandlerCache;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.HealthDataParseHelper;
import com.jieli.jl_rcsp.tool.RcspDataHandler;
import com.jieli.jl_rcsp.tool.SnGenerator;
import com.jieli.jl_rcsp.tool.callback.RcspCallbackManager;
import com.jieli.jl_rcsp.tool.callback.RcspEventListenerManager;
import com.jieli.jl_rcsp.tool.datahandles.DataHandler;
import com.jieli.jl_rcsp.tool.datahandles.DataHandlerModify;
import com.jieli.jl_rcsp.tool.datahandles.DataHandlerOld;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class RcspOpImpl implements IBluetoothProxy, IRcspOp {
    private static final String TAG = "jl_rcsp";
    public static boolean sUseNewDataHandler = true;
    protected CmdSnGenerator mCmdSnGenerator;
    protected final Handler mHandler;
    private final HealthDataParseHelper mHealthDataParseHelper;
    protected final Option mOption;
    protected final RcspCallbackManager mRcspCallbackManager;
    protected final RcspDataHandler mRcspDataHandler;
    protected final RcspEventListenerManager mRcspEventListenerManager;
    protected final DeviceStatusManager mStatusManager;
    private BluetoothDevice mTargetDevice;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.jieli.jl_rcsp.impl.RcspOpImpl$1, reason: invalid class name */
    public class AnonymousClass1<T> implements RcspCommandCallback<T> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ RcspCommandCallback c;
        public final /* synthetic */ RcspOpImpl d;

        public AnonymousClass1(RcspOpImpl r1, int r2, RcspCommandCallback r3) {
            this.d = r1;
            this.b = r2;
            this.c = r3;
            this.a = 0;
        }

        public final /* synthetic */ void a(BluetoothDevice r2, CommandBase r3, int r4, RcspCommandCallback r5) {
            this.d.sendCommandAsync(r2, r3, r4, r5);
        }

        /* JADX WARN: Incorrect types in method signature: (Landroid/bluetooth/BluetoothDevice;TT;)V */
        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(final BluetoothDevice r8, final CommandBase r9) {
            if (3 != r9.getStatus()) goto L8;
            int r0 = this.a + 1;
            this.a = r0;
            if (r0 >= 3) goto L8;
            Handler r1 = this.d.mHandler;
            final int r5 = this.b;
            r1.postDelayed(new XOO0ii0(this, r8, r9, r5, this), 500);
            return;
        L8:
            this.a = 0;
            RcspCommandCallback r10 = this.c;
            if (r10 == null) goto L12;
            r10.onCommandResponse(r8, r9);
            return;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice r2, BaseError r3) {
            this.a = 0;
            RcspCommandCallback r0 = this.c;
            if (r0 == null) goto L6;
            r0.onErrCode(r2, r3);
            return;
        }
    }

    static {
    }

    public RcspOpImpl() {
        this(Option.createOption());
    }

    public static /* synthetic */ void OXO1(RcspCommandCallback r0, BluetoothDevice r1, BaseError r2) {
        r0.onErrCode(r1, r2);
    }

    public static /* synthetic */ void access$000(RcspOpImpl r0, BluetoothDevice r1) {
        r0.handleDeviceConnectedEvent(r1);
    }

    public static /* synthetic */ void access$100(RcspOpImpl r0, BluetoothDevice r1, BaseError r2) {
        r0.notifyRcspError(r1, r2);
    }

    private void addDataHandlerInCache(BluetoothDevice r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (DataHandlerCache.getInstance().getDataHandler(r3) == null) goto L6;
        return;
    L6:
        if (sUseNewDataHandler == false) goto L8;
        DataHandler r0 = new DataHandlerModify(this);
    L9:
        DataHandlerCache.getInstance().addDataHandler(r3, r0);
        return;
    L8:
        r0 = new DataHandlerOld(this);
        goto L9
    }

    private int getCmdSn(BluetoothDevice r2) {
        if (this.mCmdSnGenerator != null) goto L6;
        this.mCmdSnGenerator = new SnGenerator();
    L6:
        return this.mCmdSnGenerator.getRcspCmdSeq(r2);
    }

    private void handleDeviceConnectedEvent(BluetoothDevice r3) {
        DeviceStatus r0 = this.mStatusManager.getDeviceStatus(r3);
        if (r0 != null) goto L5;
        DeviceInfo r1 = null;
    L6:
        if (r1 != null) goto L10;
        syncDeviceInfo(r3);
        return;
    L10:
        if (r1.isMandatoryUpgrade() == false) goto L13;
        this.mStatusManager.updateDeviceMaxCommunicationMtu(r3, 530);
        this.mRcspCallbackManager.onMandatoryUpgrade(r3);
        return;
    L13:
        this.mRcspCallbackManager.onRcspInit(r3, true);
        return;
    L5:
        r1 = r0.getDeviceInfo();
        goto L6
    }

    private void handleDeviceConnection(BluetoothDevice r3, int r4) {
        this.mRcspCallbackManager.onConnectStateChange(r3, r4);
        if (r4 == 0) goto L16;
        if (r4 == 1) goto L11;
        if (r4 == 2) goto L16;
        if (r4 == 4) goto L11;
        return;
    L11:
        if (this.mTargetDevice != null) goto L13;
        setTargetDevice(r3);
    L14:
        handleDeviceConnectedEvent(r3);
        return;
    L13:
        addDataHandlerInCache(r3);
    L16:
        this.mStatusManager.removeDeviceStatus(r3);
        DataHandlerCache.getInstance().removeDataHandler(r3);
        if (RcspUtil.deviceEquals(this.mTargetDevice, r3) == false) goto L24;
        List<BluetoothDevice> r5 = DataHandlerCache.getInstance().getDeviceList();
        if (r5.isEmpty() == false) goto L22;
        setTargetDevice(null);
        return;
    L22:
        setTargetDevice(r5.get(r5.size() - 1));
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void handleRcspCommand(BluetoothDevice r4, CommandBase r5, int r6) {
        int r0 = r5.getId();
        if (Command.isValidCmd(r0) == false) goto L22;
        if (r0 != 9) goto L7;
        UpdateSysInfoParam r7 = (UpdateSysInfoParam) ((UpdateSysInfoCmd) r5).getParam();
        List<AttrBean> r1 = r7.getAttrBeanList();
        this.mRcspDataHandler.parseAttrMessage(r4, r7.getFunction(), r1);
    L19:
        this.mRcspCallbackManager.onRcspCommand(r4, r5);
        return;
    L7:
        if (r0 != 165) goto L9;
        HealthSettingCmd.Param r8 = ((HealthSettingCmd) r5).getParam();
        if ((r8 instanceof HealthSettingCmd.UpdateParam) == false) goto L19;
        List<AttrBean> r9 = ((HealthSettingCmd.UpdateParam) r8).getList();
        this.mRcspDataHandler.parseHealthSetting(r4, r9);
        goto L19
    L9:
        if (r0 != 209) goto L19;
        SettingsMtuCmd r10 = (SettingsMtuCmd) r5;
        SettingsMtuParam r2 = (SettingsMtuParam) r10.getParam();
        if (r2 == null) goto L14;
        int r3 = r2.getMtu();
        this.mStatusManager.updateDeviceMaxCommunicationMtu(r4, r3);
        r10.setResponse(new SettingsMtuResponse(r3));
    L14:
        r10.setStatus(0);
        sendCommandResponse(r4, r10, null);
        goto L19
    L22:
        if (r6 != 1) goto L25;
        CommandBase r11 = new CommandBase(r0, "unknownCommand");
        r11.setOpCodeSn(r5.getOpCodeSn());
        r11.setStatus(2);
        sendCommandResponse(r4, r11, null);
        return;
    }

    private void handleReceiveDevRcspCmd(BluetoothDevice r5, BasePacket r6) {
        int r0 = r6.getOpCode();
        if (r6.getType() != 1) goto L5;
        boolean r1 = true;
    L6:
        CommandBase r3 = ParseHelper.convert2Command(r5, r6);
        if (r3 != null) goto L10;
        BaseError r2 = new BaseError(12289);
        r2.setOpCode(r6.getOpCode());
        notifyRcspError(r5, r2);
        return;
    L10:
        if (1 != r0) goto L13;
        this.mRcspCallbackManager.onRcspDataCmd(r5, r3);
        return;
    L13:
        if (r1 == false) goto L15;
        handleRcspCommand(r5, r3, r6.getHasResponse());
    L16:
        this.mHealthDataParseHelper.receiveCmdFromDevice(r5, r3);
        return;
    L15:
        handleRcspResponse(r5, r3);
        goto L16
    L5:
        r1 = false;
        goto L6
    }

    private <T extends CommandBase> void notifyErrorEvent(final BluetoothDevice r4, final RcspCommandCallback<T> r5, final BaseError r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        if (r5 == null) goto L7;
        JL_Log.e("jl_rcsp", "notifyErrorEvent", RcspUtil.formatString("device : %s ---> %s", new Object[]{RcspUtil.printBtDeviceInfo(r4), r6}));
        this.mHandler.post(new af2(r5, r4, r6));
        return;
    L7:
        notifyRcspError(r4, r6);
    }

    private void notifyRcspError(BluetoothDevice r4, BaseError r5) {
        JL_Log.e("jl_rcsp", "notifyRcspError", RcspUtil.formatString("device : %s ---> %s", new Object[]{RcspUtil.printBtDeviceInfo(r4), r5}));
        this.mRcspCallbackManager.onRcspError(r4, r5);
    }

    private void setTargetDevice(BluetoothDevice r2) {
        if (RcspUtil.deviceEquals(this.mTargetDevice, r2) == false) goto L5;
    L12:
        addDataHandlerInCache(r2);
        return;
    L5:
        if (this.mTargetDevice == null) goto L7;
        boolean r0 = true;
    L8:
        this.mTargetDevice = r2;
        if (r0 == false) goto L12;
        if (r2 == null) goto L12;
        this.mRcspCallbackManager.onSwitchConnectedDevice(r2);
        goto L12
    L7:
        r0 = false;
        goto L8
    }

    private void syncDeviceInfo(BluetoothDevice r4) {
        JL_Log.d("jl_rcsp", "syncDeviceInfo", "device : " + RcspUtil.printBtDeviceInfo(r4));
        sendRcspCommand(r4, CommandBuilder.buildGetDeviceInfoCmdForAll(), new AnonymousClass2(this));
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void callbackErrorEvent(BaseError r3) {
        this.mRcspCallbackManager.onRcspError(getTargetDevice(), r3);
    }

    public DeviceInfo getDeviceInfo() {
        return getDeviceInfo(this.mTargetDevice);
    }

    public BluetoothDevice getTargetDevice() {
        return this.mTargetDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void handleRcspResponse(BluetoothDevice r3, CommandBase r4) {
        if (r4.getStatus() != 0) goto L31;
        int r0 = r4.getId();
        if (r0 != 3) goto L8;
        TargetInfoResponse r5 = (TargetInfoResponse) ((GetTargetInfoCmd) r4).getResponse();
        if (r5 == null) goto L30;
        this.mStatusManager.updateDeviceTargetInfo(r3, r5);
        return;
    L30:
        return;
    L8:
        if (r0 != 7) goto L10;
        SysInfoResponse r6 = (SysInfoResponse) ((GetSysInfoCmd) r4).getResponse();
        List<AttrBean> r1 = r6.getAttrs();
        this.mRcspDataHandler.parseAttrMessage(r3, r6.getFunction(), r1);
        return;
    L10:
        if (r0 != 165) goto L12;
        HealthSettingCmd.Response r7 = ((HealthSettingCmd) r4).getResponse();
        if ((r7 instanceof HealthSettingCmd.GetResponse) == false) goto L29;
        List<AttrBean> r8 = ((HealthSettingCmd.GetResponse) r7).getList();
        this.mRcspDataHandler.parseHealthSetting(r3, r8);
        return;
    L29:
        return;
    L12:
        if (r0 != 209) goto L32;
        SettingsMtuResponse r9 = (SettingsMtuResponse) ((SettingsMtuCmd) r4).getResponse();
        if (r9 == null) goto L28;
        this.mStatusManager.updateDeviceMaxCommunicationMtu(r3, r9.getRealMtu());
        return;
    L28:
        return;
    L32:
        return;
    }

    public boolean isRcspInit() {
        if (getConnectedDevice() != null) goto L5;
        return false;
    L5:
        if (getDeviceInfo() == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void notifyBtDeviceConnection(BluetoothDevice r4, int r5) {
        JL_Log.d("jl_rcsp", "notifyBtDeviceConnection", RcspUtil.formatString("device = %s, status = %d", new Object[]{RcspUtil.printBtDeviceInfo(r4), Integer.valueOf(r5)}));
        handleDeviceConnection(r4, r5);
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void notifyReceiveDeviceData(BluetoothDevice r4, byte[] r5) {
        JL_Log.d("jl_rcsp", "notifyReceiveDeviceData", RcspUtil.formatString("device = %s, data = [%s]", new Object[]{RcspUtil.printBtDeviceInfo(r4), CHexConver.byte2HexStr(r5)}));
        if (r4 == null) goto L18;
        if (r5 == null) goto L18;
        if (this.mOption.isMultiDevice() == false) goto L9;
    L12:
        DataHandler r0 = DataHandlerCache.getInstance().getDataHandler(r4);
        if (r0 != null) goto L16;
        JL_Log.w("jl_rcsp", "notifyReceiveDeviceData", "No Data Handler.");
        notifyRcspError(r4, new BaseError(8192));
        return;
    L16:
        r0.addRecvData(new DataInfo().setDevice(r4).setType(1).setRecvData(r5));
        return;
    L9:
        if (RcspUtil.deviceEquals(r4, getTargetDevice()) == true) goto L12;
        notifyRcspError(r4, new BaseError(8193));
        return;
    L18:
        notifyRcspError(r4, new BaseError(4097));
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void receiveDataFromDevice(BluetoothDevice r4, BasePacket r5) {
        if (r4 == null) goto L16;
        if (r5 == null) goto L16;
        JL_Log.v("jl_rcsp", "receiveDataFromDevice", RcspUtil.formatString("device = %s, %s", new Object[]{RcspUtil.printBtDeviceInfo(r4), r5}));
        if (this.mOption.isMultiDevice() == false) goto L8;
    L14:
        handleReceiveDevRcspCmd(r4, r5);
        return;
    L8:
        if (RcspUtil.deviceEquals(r4, getTargetDevice()) == true) goto L14;
        if (r5.getType() == 1) goto L12;
        return;
    L12:
        if (r5.getOpCode() == 194) goto L14;
        return;
    L16:
        notifyRcspError(r4, new BaseError(4097));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void registerOnRcspCallback(OnRcspCallback r3) {
        this.mRcspCallbackManager.registerCallback(r3);
        BluetoothDevice r0 = getTargetDevice();
        if (r0 == null) goto L13;
        DeviceInfo r1 = this.mStatusManager.getDeviceInfo(r0);
        if (r1 != null) goto L9;
        return;
    L9:
        if (r1.isMandatoryUpgrade() == false) goto L12;
        r3.onMandatoryUpgrade(r0);
        return;
    L12:
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void registerOnRcspEventListener(OnRcspEventListener r2) {
        this.mRcspEventListenerManager.registerCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void release() {
        JL_Log.i("jl_rcsp", "release", "clazz : " + this);
        setTargetDevice(null);
        CmdSnGenerator r1 = this.mCmdSnGenerator;
        if (r1 != null) goto L5;
    L8:
        this.mRcspCallbackManager.release();
        this.mRcspEventListenerManager.release();
        this.mStatusManager.release();
        DataHandlerCache.getInstance().destroy();
        this.mHandler.removeCallbacksAndMessages(null);
        return;
    L5:
        if ((r1 instanceof SnGenerator) == false) goto L7;
        ((SnGenerator) r1).destroy();
    L7:
        this.mCmdSnGenerator = null;
        goto L8
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public <T extends CommandBase> void sendCommandAsync(BluetoothDevice r4, CommandBase r5, int r6, RcspCommandCallback<T> r7) {
        if (r4 == null) goto L16;
        if (r5 == null) goto L16;
        DataHandler r0 = DataHandlerCache.getInstance().getDataHandler(r4);
        if (isDeviceConnected(r4) == false) goto L14;
        if (r0 == null) goto L14;
        r5.setOpCodeSn(getCmdSn(r4));
        BasePacket r1 = ParseHelper.convert2BasePacket(r5, 1);
        if (r1 != null) goto L12;
        BaseError r8 = new BaseError(12289);
        r8.setOpCode(r5.getId());
        notifyErrorEvent(r4, r7, r8);
        return;
    L12:
        CommandHelper.getInstance().putCommandBase(r4, r5);
        DataInfo r9 = new DataInfo().setDevice(r4).setType(0).setBasePacket(r1).setTimeoutMs(r6).setRcspCmdCallback(r7);
        byte[] r10 = ParseHelper.packSendBasePacket(r1);
        this.mRcspCallbackManager.onPutDataToDataHandler(r4, r10);
        r0.addSendData(r9);
        return;
    L14:
        BaseError r11 = new BaseError(8192);
        r11.setOpCode(r5.getId());
        notifyErrorEvent(r4, r7, r11);
        return;
    L16:
        notifyErrorEvent(r4, r7, new BaseError(4097));
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public <T extends CommandBase> void sendCommandResponse(BluetoothDevice r3, CommandBase r4, RcspCommandCallback<T> r5) {
        if (r4 != null) goto L6;
        notifyErrorEvent(r3, r5, new BaseError(4097));
        return;
    L6:
        if (isDeviceConnected(r3) == true) goto L8;
    L15:
        BaseError r0 = new BaseError(8192);
        r0.setOpCode(r4.getId());
        notifyErrorEvent(r3, r5, r0);
        return;
    L8:
        if (DataHandlerCache.getInstance().getDataHandler(r3) == null) goto L15;
        BasePacket r1 = ParseHelper.convert2BasePacket(r4, 0);
        if (r1 != null) goto L13;
        BaseError r2 = new BaseError(12289);
        r2.setOpCode(r4.getId());
        notifyErrorEvent(r3, r5, r2);
        return;
    L13:
        DataInfo r6 = new DataInfo().setDevice(r3).setType(0).setBasePacket(r1).setRcspCmdCallback(r5);
        DataHandlerCache.getInstance().getDataHandler(r3).addSendData(r6);
    }

    public <T extends CommandBase> void sendRcspCommand(BluetoothDevice r2, CommandBase r3, RcspCommandCallback<T> r4) {
        sendRcspCommand(r2, r3, this.mOption.getCmdTimeout(), r4);
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void setCmdSnGenerator(CmdSnGenerator r1) {
        this.mCmdSnGenerator = r1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void switchConnectedDevice(BluetoothDevice r2) {
        List<BluetoothDevice> r0 = DataHandlerCache.getInstance().getDeviceList();
        if (r2 != null) goto L5;
        return;
    L5:
        if (r0.contains(r2) == true) goto L7;
        return;
    L7:
        if (RcspUtil.deviceEquals(this.mTargetDevice, r2) == true) goto L12;
        setTargetDevice(r2);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void unregisterOnRcspCallback(OnRcspCallback r2) {
        this.mRcspCallbackManager.unregisterCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void unregisterOnRcspEventListener(OnRcspEventListener r2) {
        this.mRcspEventListenerManager.unregisterCallback(r2);
    }

    public RcspOpImpl(Option r3) {
        this.mHandler = new Handler(Looper.getMainLooper());
        if (r3 == null) goto L7;
        this.mOption = r3;
        JL_Log.d("jl_rcsp", C2985d4.a.f, RcspUtil.formatString("Lib Name : %s(%d), Option : %s. \nclazz: %s", new Object[]{RcspConstant.getLibVersionName(), Integer.valueOf(RcspConstant.getLibVersionCode()), r3, this}));
        this.mStatusManager = DeviceStatusManager.getInstance();
        this.mRcspCallbackManager = new RcspCallbackManager();
        RcspEventListenerManager r4 = new RcspEventListenerManager();
        this.mRcspEventListenerManager = r4;
        this.mRcspDataHandler = new RcspDataHandler(this, r4);
        this.mHealthDataParseHelper = new HealthDataParseHelper(this, r4);
        return;
    L7:
        throw new NullPointerException("Option can not be null.");
    }

    public DeviceInfo getDeviceInfo(BluetoothDevice r2) {
        return this.mStatusManager.getDeviceInfo(r2);
    }

    public <T extends CommandBase> void sendRcspCommand(BluetoothDevice r2, CommandBase r3, int r4, RcspCommandCallback<T> r5) {
        sendCommandAsync(r2, r3, r4, new AnonymousClass1(this, r4, r5));
    }
}
