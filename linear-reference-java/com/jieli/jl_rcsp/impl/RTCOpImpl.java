package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.bc2;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.facebook.login.widget.ToolTipPopup;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.alarm.IRTCOp;
import com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.LtvBean;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.AlarmExpandCmd;
import com.jieli.jl_rcsp.model.device.AlarmBean;
import com.jieli.jl_rcsp.model.device.AlarmListInfo;
import com.jieli.jl_rcsp.model.device.AuditionParam;
import com.jieli.jl_rcsp.model.device.DefaultAlarmBell;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.callback.RcspEventListenerManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.DataUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RTCOpImpl implements IRTCOp {
    public static final int WAY_NOTIFY = 1;
    public static final int WAY_REPLY = 0;
    public static final String f = "RTCOpImpl";
    public static final int g = 6000;
    public static final int h = 41216;
    public final RcspOpImpl a;
    public final DataTransferOpImpl b;
    public OnOperationCallback<Boolean> c;
    public final Handler d;
    public final OnDataTransferListener e;

    public static class BigRTCData {
        public int a;
        public int b;
        public byte[] c;

        public BigRTCData(byte[] r1) {
            a(r1);
        }

        public void a(byte[] r5) {
            int r1 = CHexConver.byteToInt(r5[0]);
            this.a = r1;
            if (r1 != 0) goto L6;
            this.b = CHexConver.byteToInt(r5[1]);
            int r2 = Math.min(CHexConver.bytesToInt(r5, 2, 2), r5.length - 4);
            byte[] r3 = new byte[r2];
            this.c = r3;
            System.arraycopy(r5, 4, r3, 0, r2);
            return;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append("BigRTCData{version=");
            r0.append(this.a);
            r0.append(", way=");
            r0.append(this.b);
            r0.append(", len=");
            byte[] r1 = this.c;
            if (r1 != null) goto L5;
            int r2 = 0;
        L6:
            r0.append(r2);
            r0.append(", payload=");
            r0.append(CHexConver.byte2HexStr(this.c));
            r0.append(i0XO1.IO);
            return r0.toString();
        L5:
            r2 = r1.length;
            goto L6
        }
    }

    public class ReadAlarmRcspCallback implements RcspCommandCallback<CommandBase> {
        public final OnOperationCallback<Boolean> a;
        public final /* synthetic */ RTCOpImpl b;

        public ReadAlarmRcspCallback(RTCOpImpl r1, OnOperationCallback<Boolean> r2) {
            this.b = r1;
            this.a = r2;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice r4, CommandBase r5) {
            if (r5.getStatus() != 0) goto L5;
            OnOperationCallback<Boolean> r6 = this.a;
            if (r6 == null) goto L14;
            r6.onSuccess(Boolean.TRUE);
            return;
        L14:
            return;
        L5:
            if (r5.getStatus() != 8) goto L8;
            JL_Log.w(RTCOpImpl.a(), "STATUS_RESPONSE_DATA_OVER_LIMIT", "start .... MSG_WAIT_ALARM_DATA >> ");
            RTCOpImpl.a(this.b, this.a);
            RTCOpImpl.c(this.b).removeMessages(RTCOpImpl.h);
            RTCOpImpl.c(this.b).sendEmptyMessageDelayed(RTCOpImpl.h, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            return;
        L8:
            onErrCode(r4, RcspErrorCode.buildJsonError(r5.getId(), 12292, r5.getStatus(), null));
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice r1, BaseError r2) {
            OnOperationCallback<Boolean> r3 = this.a;
            if (r3 == null) goto L6;
            r3.onFailed(r2);
            return;
        }
    }

    static {
    }

    public RTCOpImpl(RcspOpImpl r4) {
        this.d = new Handler(Looper.getMainLooper(), new bc2(this));
        OnDataTransferListener r0 = new AnonymousClass2(this);
        this.e = r0;
        if (r4 == null) goto L7;
        this.a = r4;
        DataTransferOpImpl r5 = DataTransferOpImpl.instance(r4);
        this.b = r5;
        r5.addListener(r0);
        return;
    L7:
        throw new NullPointerException("WatchOpImpl can not be null.");
    }

    public static /* synthetic */ boolean a(RTCOpImpl r0) {
        return r0.b();
    }

    public static /* synthetic */ OnOperationCallback b(RTCOpImpl r0) {
        return r0.c;
    }

    public static /* synthetic */ Handler c(RTCOpImpl r0) {
        return r0.d;
    }

    public static void parseRTCBigData(RcspOpImpl r1, RcspEventListenerManager r2, byte[] r3) {
        if (r1 == null) goto L9;
        BigRTCData r0 = new BigRTCData(r3);
        if (r0.a != 0) goto L8;
        a(r1, r2, r0.c);
        return;
    L8:
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void addOrModifyAlarm(BluetoothDevice r4, AlarmBean r5, OnOperationCallback<Boolean> r6) {
        if (r5 != null) goto L7;
        BaseError r7 = new BaseError(4097, "AlarmBean is null.");
        if (r6 == null) goto L9;
        r6.onFailed(r7);
        return;
    L9:
        return;
    L7:
        this.a.sendRcspCommand(r4, CommandBuilder.buildSetAlarmCmd(AlarmBean.toAttrbean(r5, false)), new BooleanRcspActionCallback("addOrModifyAlarm", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void auditionAlarmBell(BluetoothDevice r4, AuditionParam r5, OnOperationCallback<Boolean> r6) {
        if (r5 != null) goto L7;
        BaseError r7 = new BaseError(4097, "AlarmExpandCmd.BellArg is null.");
        if (r6 == null) goto L9;
        r6.onFailed(r7);
        return;
    L9:
        return;
    L7:
        this.a.sendRcspCommand(r4, CommandBuilder.buildAuditionAlarmBellCmd(r5.getType(), r5.getDev(), r5.getCluster()), new BooleanRcspActionCallback("auditionAlarmBell", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void deleteAlarm(BluetoothDevice r4, AlarmBean r5, OnOperationCallback<Boolean> r6) {
        if (r5 != null) goto L7;
        BaseError r7 = new BaseError(4097, "AlarmBean is null.");
        if (r6 == null) goto L9;
        r6.onFailed(r7);
        return;
    L9:
        return;
    L7:
        this.a.sendRcspCommand(r4, CommandBuilder.buildDelAlarmCmd(AlarmBean.toAttrbean(r5, true)), new BooleanRcspActionCallback("deleteAlarm", r6));
    }

    public void destroy() {
        this.d.removeCallbacksAndMessages(null);
        this.b.removeListener(this.e);
    }

    public BluetoothDevice getConnectedDevice() {
        return this.a.getConnectedDevice();
    }

    public RcspOpImpl getRcspOp() {
        return this.a;
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void readAlarmBellArgs(BluetoothDevice r5, byte r6, OnOperationCallback<List<AlarmExpandCmd.BellArg>> r7) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildReadBellArgsCmd(r6), new CustomRcspActionCallback("readAlarmBellArgs", r7, new AnonymousClass1(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void readAlarmDefaultBellList(BluetoothDevice r4, OnOperationCallback<Boolean> r5) {
        if (b() == false) goto L7;
        if (r5 == null) goto L9;
        r5.onFailed(new BaseError(4352, "Reading alarm data is in progress."));
        return;
    L9:
        return;
    L7:
        this.a.sendRcspCommand(r4, CommandBuilder.buildGetDefaultAlarmBellsCmd(), new ReadAlarmRcspCallback(this, r5));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void readAlarmList(BluetoothDevice r4, OnOperationCallback<Boolean> r5) {
        if (b() == false) goto L7;
        if (r5 == null) goto L9;
        r5.onFailed(new BaseError(4352, "Reading alarm data is in progress."));
        return;
    L9:
        return;
    L7:
        this.a.sendRcspCommand(r4, CommandBuilder.buildGetAlarmCmd(), new ReadAlarmRcspCallback(this, r5));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void setAlarmBellArg(BluetoothDevice r4, AlarmExpandCmd.BellArg r5, OnOperationCallback<Boolean> r6) {
        if (r5 != null) goto L7;
        BaseError r7 = new BaseError(4097, "AlarmExpandCmd.BellArg is null.");
        if (r6 == null) goto L9;
        r6.onFailed(r7);
        return;
    L9:
        return;
    L7:
        this.a.sendRcspCommand(r4, CommandBuilder.buildSetBellArgsCmd(r5), new BooleanRcspActionCallback("setAlarmBellArg", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void stopAlarmBell(BluetoothDevice r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildStopAlarmCmd(), new BooleanRcspActionCallback("stopAlarmBell", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void stopPlayAlarmBell(BluetoothDevice r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildStopAuditionAlarmBellCmd(), new BooleanRcspActionCallback("stopPlayAlarmBell", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void syncTime(BluetoothDevice r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildSyncTimeCmd(Calendar.getInstance()), new BooleanRcspActionCallback("syncTime", r6));
    }

    public static /* synthetic */ OnOperationCallback a(RTCOpImpl r0, OnOperationCallback r1) {
        r0.c = r1;
        return r1;
    }

    public final boolean b() {
        return this.d.hasMessages(h);
    }

    public static /* synthetic */ String a() {
        return f;
    }

    public final /* synthetic */ boolean a(Message r4) {
        if (r4.what != 41216) goto L9;
        JL_Log.w(f, "MSG_WAIT_ALARM_DATA", "");
        OnOperationCallback<Boolean> r5 = this.c;
        if (r5 == null) goto L10;
        r5.onFailed(new BaseError(12290, "The device replies to the alarm clock data timeout."));
        this.c = null;
        return true;
    L10:
        return true;
    L9:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(RcspOpImpl r24, RcspEventListenerManager r25, byte[] r26) {
        List<LtvBean> r0 = DataUtil.parseLTVData2(r26);
        if (r0.isEmpty() == true) goto L99;
        BluetoothDevice r2 = r24.getConnectedDevice();
        DeviceInfo r3 = r24.getDeviceInfo(r2);
        if (r3 == null) goto L144;
        int r4 = a(r0);
        Iterator<LtvBean> r5 = r0.iterator();
    L10:
        if (r5.hasNext() == false) goto L145;
        LtvBean r1 = r5.next();
        byte[] r6 = r1.getData();
        int r7 = r1.getType();
        int r9 = 5;
        int r11 = 1;
        boolean r12 = false;
        if (r7 != 1) goto L14;
        int r8 = CHexConver.byteToInt(r6[0]);
        ArrayList r13 = new ArrayList();
        if (r8 <= 0) goto L94;
        int r10 = 1;
        int r14 = 0;
    L59:
        if (r14 >= r8) goto L92;
        if ((r6.length - r10) <= r9) goto L92;
        byte r15 = r6[r10];
        int r16 = r10 + 2;
        if (CHexConver.byteToInt(r6[r10 + 1]) != r11) goto L65;
        boolean r17 = r11;
    L66:
        byte r18 = r6[r16];
        byte r19 = r6[r10 + 3];
        byte r110 = r6[r10 + 4];
        int r111 = r10 + 6;
        int r20 = CHexConver.byteToInt(r6[r10 + 5]);
        int r112 = r4;
        if (r20 > (r6.length - r111)) goto L68;
        if (r20 > 0) goto L102;
    L74:
        String r21 = null;
    L75:
        if (r112 != 0) goto L77;
        int r22 = r3.getAlarmVersion();
    L78:
        int r23 = r6.length - r111;
        int r27 = r8;
        if (r22 == 1) goto L81;
    L90:
        String r113 = "";
        int r114 = r111;
        byte r28 = 0;
        byte r29 = 0;
        int r115 = 0;
        r6 = r6;
    L91:
        AlarmBean r30 = new AlarmBean().setVersion(r22).setIndex(r15).setRepeatMode(r18).setName(r21).setDevIndex(r28).setHour(r19).setMin(r110).setBellCluster(r115).setBellName(r113).setBellType(r29).setOpen(r17);
        JL_Log.d(f, "parseRTCDataVersion0", r30.toString());
        r13.add(r30);
        r14 = r14 + 1;
        r4 = r22;
        r10 = r114;
        r6 = r6;
        r5 = r5;
        r8 = r27;
        r9 = 5;
        r11 = 1;
        r12 = false;
        goto L59
    L81:
        if (r23 <= 6) goto L90;
        byte r31 = r6[r111];
        int r32 = r111 + 2;
        r28 = r6[r111 + 1];
        int r116 = r111;
        byte[] r117 = new byte[4];
        System.arraycopy(r6, r32, r117, 0, 4);
        r115 = CHexConver.bytesToInt(r117);
        int r33 = r116 + 7;
        int r34 = r6[r116 + 6] & 255;
        if (r34 <= (r6.length - r33)) goto L100;
    L89:
        r113 = "";
        r114 = r33;
    L86:
        r29 = r31;
        goto L91
    L100:
        r113 = new String(r6, r33, r34);     // Catch: Exception -> L87
        r114 = r33 + r34;
    L87:
        e = move-exception;
        e.printStackTrace();
        goto L89
    L77:
        r22 = r112;
        goto L78
    L102:
        r21 = new String(r6, r111, r20);     // Catch: Exception -> L72
        r111 = r111 + r20;
    L72:
        e = move-exception;
        e.printStackTrace();
    L68:
        Iterator<LtvBean> r118 = r5;
        r4 = r112;
    L95:
        AlarmListInfo r35 = new AlarmListInfo(r13);
        r35.setVersion(r4);
        r3.setAlarmListInfo(r35);
        if (r25 == null) goto L98;
        r25.onAlarmListChange(r2, r35);
    L98:
        r5 = r118;
        goto L10
    L65:
        r17 = r12;
    L92:
        r112 = r4;
        goto L68
    L94:
        r118 = r5;
        goto L95
    L14:
        if (r7 == 2) goto L35;
        if (r7 == 3) goto L35;
        if (r7 != 4) goto L17;
        r3.setAlarmVersion(r4);
        if (r3.getAlarmListInfo() == null) goto L33;
        r3.getAlarmListInfo().setVersion(r4);
        goto L10
    L33:
        r3.setAlarmListInfo(new AlarmListInfo(r4, new ArrayList()));
        goto L10
    L17:
        if (r7 != 5) goto L19;
        int r36 = r6[0] & 15;
        ArrayList r37 = new ArrayList();
    L24:
        if (r11 >= r6.length) goto L28;
        if (r37.size() >= r36) goto L28;
        int r38 = r11 + 1;
        byte r39 = r6[r11];
        int r119 = r11 + 2;
        int r40 = r6[r38];
        byte[] r120 = new byte[r40];
        System.arraycopy(r6, r119, r120, 0, r40);
        r11 = r119 + r40;
        r37.add(new DefaultAlarmBell(r39, new String(r120), false));
    L28:
        r3.setAlarmDefaultBells(r37);
        if (r25 == null) goto L10;
        r25.onAlarmDefaultBellListChange(r2, r37);
        goto L10
    L19:
        if (r7 != 7) goto L10;
        r3.setAlarmExpandFlag(r6[0]);
    L35:
        int r41 = CHexConver.byteToInt(r6[0]);
        if (r3.getAlarmListInfo() == null) goto L47;
        List<AlarmBean> r42 = r3.getAlarmListInfo().getAlarmBeans();
        if (r42 == null) goto L47;
        if (r42.isEmpty() == true) goto L47;
        Iterator<AlarmBean> r43 = r42.iterator();
    L43:
        if (r43.hasNext() == false) goto L47;
        AlarmBean r44 = r43.next();
        if (r41 != r44.getIndex()) goto L43;
        AlarmBean r45 = r44.copy();
    L48:
        if (r45 != null) goto L51;
        r45 = new AlarmBean();
        r45.setIndex((byte) r41);
        r45.setName("Alarm");
        Calendar r46 = Calendar.getInstance();
        r45.setHour((byte) r46.get(11));
        r45.setMin((byte) r46.get(12));
    L51:
        if (r1.getType() == 3) goto L52;
        if (r25 == null) goto L10;
        r25.onAlarmNotify(r2, r45);
        goto L10
    L52:
        if (r25 == null) goto L10;
        r25.onAlarmStop(r2, r45);
    L47:
        r45 = null;
        goto L48
    L145:
        return;
    L144:
        return;
    }

    public static int a(List<LtvBean> r4) {
        Iterator<LtvBean> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L9;
        LtvBean r0 = r5.next();
        if (r0.getType() != 4) goto L4;
        return r0.getData()[0] & 7;
    L9:
        return 0;
    }
}
