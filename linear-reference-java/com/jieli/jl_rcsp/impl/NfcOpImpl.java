package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.nfc.INfcOp;
import com.jieli.jl_rcsp.interfaces.nfc.OnNfcEventCallback;
import com.jieli.jl_rcsp.interfaces.nfc.OnSyncNfcMsgListener;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import com.jieli.jl_rcsp.task.ITask;
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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class NfcOpImpl implements INfcOp {
    public static final String g = "NfcOpImpl";
    public final RcspOpImpl a;
    public final NfcEventCbHelper b;
    public ITask c;
    public List<NfcMsg> d;
    public short e;
    public final OnRcspCallback f;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.impl.NfcOpImpl$7, reason: invalid class name */
    public class AnonymousClass7 implements TaskListener {
        public final /* synthetic */ TaskListener a;
        public final /* synthetic */ BluetoothDevice b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ NfcOpImpl e;

        public AnonymousClass7(NfcOpImpl r1, TaskListener r2, BluetoothDevice r3, int r4, String r5) {
            this.e = r1;
            this.a = r2;
            this.b = r3;
            this.c = r4;
            this.d = r5;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onBegin() {
            JL_Log.e(NfcOpImpl.a(), "startTransferTask", "onBegin >> ");
            TaskListener r0 = this.a;
            if (r0 == null) goto L6;
            r0.onBegin();
            return;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onCancel(int r2) {
            TaskListener r0 = this.a;
            if (r0 == null) goto L6;
            r0.onCancel(r2);
            return;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onError(int r4, String r5) {
            JL_Log.e(NfcOpImpl.a(), "startTransferTask", "onError = " + r4 + ", msg = " + r5);
            NfcOpImpl.a(this.e, null);
            TaskListener r0 = this.a;
            if (r0 == null) goto L6;
            r0.onError(r4, r5);
            return;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onFinish() {
            JL_Log.e(NfcOpImpl.a(), "startTransferTask", "onFinish >> ");
            NfcOpImpl.a(this.e, null);
            NfcOpImpl.d(this.e).sendRcspCommand(this.b, CommandBuilder.buildInsertNfcFileEndCmd(this.c, NfcOpImpl.a(this.e, this.d)), new BooleanNfcActionCallback("InsertNfcFileEnd", new AnonymousClass1(this)));
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onProgress(int r2) {
            TaskListener r0 = this.a;
            if (r0 == null) goto L6;
            r0.onProgress(r2);
            return;
        }
    }

    static {
    }

    public NfcOpImpl(RcspOpImpl r2) {
        this.b = new NfcEventCbHelper();
        this.e = 255;
        OnRcspCallback r0 = new AnonymousClass9(this);
        this.f = r0;
        if (r2 == null) goto L7;
        this.a = r2;
        r2.registerOnRcspCallback(r0);
        return;
    L7:
        throw new NullPointerException("RcspOpImpl can not be null.");
    }

    public static /* synthetic */ String a() {
        return g;
    }

    public static /* synthetic */ short b(NfcOpImpl r0) {
        return r0.e;
    }

    public static /* synthetic */ ITask c(NfcOpImpl r0) {
        return r0.c;
    }

    public static /* synthetic */ RcspOpImpl d(NfcOpImpl r0) {
        return r0.a;
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void addNfcFile(final BluetoothDevice r11, final String r12, final int r13, final TaskListener r14) {
        JL_Log.i(g, "addNfcFile", "path : " + r12);
        File r0 = new File(r12);
        if (r0.exists() == false) goto L9;
        if (r0.isFile() == false) goto L9;
        this.a.sendRcspCommand(r11, CommandBuilder.buildInsertNfcFileCmd(r13, (int) r0.length(), r0.getName()), new BooleanNfcActionCallback("addNfcFile", new AnonymousClass2(this, r11, r12, r13, r14)));
        return;
    L9:
        if (r14 == null) goto L12;
        r14.onError(4, "File not found.");
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void addOnNfcEventCallback(OnNfcEventCallback r2) {
        this.b.registerCallback(r2);
    }

    public void destroy() {
        b();
        this.a.unregisterOnRcspCallback(this.f);
        this.b.release();
        this.d.clear();
        this.e = 255;
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void getDefaultNfc(BluetoothDevice r5, int r6, OnOperationCallback<Short> r7) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildGetDefaultNfcOpCmd(r6), new CustomRcspActionCallback("getDefaultNfc", r7, new AnonymousClass5(this)));
    }

    public short getDefaultNfcId() {
        return this.e;
    }

    public NfcMsg getNfcMsgByID(short r5) {
        List<NfcMsg> r0 = this.d;
        if (r0 != null) goto L5;
        return null;
    L5:
        Iterator<NfcMsg> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L11;
        NfcMsg r2 = r1.next();
        if (r2.getId() != r5) goto L7;
        return r2;
    L11:
        return null;
    }

    public List<NfcMsg> getNfcMsgList() {
        return this.d;
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void modifyNfcMsg(final BluetoothDevice r5, final NFCOperationCmd.ModifyMsgParam r6, final OnOperationCallback<Boolean> r7) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildModifyNFCInfoCmd(r6), new BooleanNfcActionCallback("modifyNfcMsg", new AnonymousClass3(this, r5, r6, r7)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void removeNfcMsg(final BluetoothDevice r4, int r5, final short r6, final OnOperationCallback<Boolean> r7) {
        this.a.sendRcspCommand(r4, CommandBuilder.buildDeleteNFCInfoSyncCmd(r5, r6), new BooleanNfcActionCallback("removeNfcMsg", new AnonymousClass4(this, r4, r6, r7)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void removeOnNfcEventCallback(OnNfcEventCallback r2) {
        this.b.registerCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void setDefaultNfc(final BluetoothDevice r4, int r5, final short r6, final OnOperationCallback<Boolean> r7) {
        this.a.sendRcspCommand(r4, CommandBuilder.buildSetDefaultNfcOpCmd(r5, r6), new BooleanNfcActionCallback("setDefaultNfc", new AnonymousClass6(this, r6, r4, r7)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.nfc.INfcOp
    public void syncNfcMsg(final BluetoothDevice r2, int r3, final OnSyncNfcMsgListener r4) {
        a(r2, r3, new AnonymousClass1(this, r4, r2));
    }

    public static /* synthetic */ List a(NfcOpImpl r0, List r1) {
        r0.d = r1;
        return r1;
    }

    public final void b() {
        ITask r0 = this.c;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isRun() == false) goto L7;
        this.c.cancel((byte) 0);
    L7:
        this.c = null;
    }

    public static /* synthetic */ NfcEventCbHelper a(NfcOpImpl r0) {
        return r0.b;
    }

    public static /* synthetic */ void a(NfcOpImpl r0, BluetoothDevice r1, String r2, int r3, TaskListener r4) {
        r0.a(r1, r2, r3, r4);
    }

    public static /* synthetic */ void a(NfcOpImpl r0, BluetoothDevice r1, NFCOperationCmd.ModifyMsgParam r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void a(NfcOpImpl r0, BluetoothDevice r1, short r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ short a(NfcOpImpl r0, short r1) {
        r0.e = r1;
        return r1;
    }

    public static /* synthetic */ ITask a(NfcOpImpl r0, ITask r1) {
        r0.c = r1;
        return r1;
    }

    public static /* synthetic */ String a(NfcOpImpl r0, String r1) {
        return r0.a(r1);
    }

    public final void a(BluetoothDevice r8, String r9, int r10, TaskListener r11) {
        ITask r0 = this.c;
        if (r0 != null) goto L5;
    L12:
        TransferTask.Param r1 = new TransferTask.Param();
        r1.devHandler = r10;
        this.c = new TransferTask(this.a, r9, r1);
    L13:
        this.c.setListener(new AnonymousClass7(this, r11, r8, r10, r9));
        ((TransferTask) this.c).setPath(r9);
        JL_Log.e(g, "startTransferTask", "Task =  " + this.c + " start");
        this.c.start();
        return;
    L5:
        if (r0.isRun() == false) goto L12;
        if (this.c.isRun() == false) goto L13;
        if (r11 == null) goto L15;
        r11.onError(4352, "Operation is in operation.");
        return;
    }

    public final String a(String r4) {
        if (r4 != null) goto L5;
        return "";
    L5:
        int r1 = r4.lastIndexOf("/");
        if (r1 != (-1)) goto L9;
        return r4;
    L9:
        if (r1 != (r4.length() - 1)) goto L12;
        return "";
    L12:
        return r4.substring(r1 + 1);
    }

    public final void a(BluetoothDevice r3, int r4, final OnSyncNfcMsgListener r5) {
        ITask r0 = this.c;
        if (r0 != null) goto L5;
    L6:
        NfcSyncTask r1 = new NfcSyncTask(this.a, r3, r4);
        this.c = r1;
        r1.setListener(new AnonymousClass8(this, r5));
    L7:
        this.c.start();
        return;
    L5:
        if (r0.isRun() == true) goto L7;
        goto L6
    }

    public final void a(BluetoothDevice r13, NFCOperationCmd.ModifyMsgParam r14) {
        if (this.d == null) goto L39;
        if (r14 != null) goto L6;
        return;
    L6:
        if (r14.getValue() == null) goto L42;
        NfcMsg r0 = getNfcMsgByID(r14.getId());
        if (r0 == null) goto L43;
        int r2 = 0;
        boolean r1 = RcspUtil.checkMaskHasBit(r14.getMask(), (byte) 0);
        boolean r4 = true;
        boolean r3 = RcspUtil.checkMaskHasBit(r14.getMask(), (byte) 1);
        byte[] r15 = r14.getValue();
        String r5 = g;
        JL_Log.i(r5, "modifyNfcMsg", "hasTime : " + r1 + ", hasNickname = " + r3 + ",  value : " + r15.length);
        if (r1 == true) goto L14;
    L20:
        boolean r6 = false;
    L21:
        if (r3 == true) goto L23;
    L33:
        r4 = r6;
    L34:
        if (r4 == false) goto L41;
        JL_Log.i(g, "modifyNfcMsg", "nfcMsg = " + r0);
        this.b.onModifyNfcMsg(r13, r0);
        this.b.onNfcMsgChange(r13, this.d);
        return;
    L41:
        return;
    L23:
        if ((r2 + 24) > r15.length) goto L33;
        String r16 = new String(r15, r2, 24).trim();     // Catch: Exception -> L26
    L28:
        JL_Log.i(g, "modifyNfcMsg", "name : " + r16 + ", Nickname = " + r0.getNickname());
        if (r16 == null) goto L33;
        if (r16.equalsIgnoreCase(r0.getNickname()) == true) goto L33;
        r0.setNickname(r16);
    L26:
        e = move-exception;
        e.printStackTrace();
        r16 = null;
        goto L28
    L14:
        if (4 > r15.length) goto L20;
        long r8 = RcspUtil.intToTime(CHexConver.bytesToInt(r15, 0, 4));
        JL_Log.i(r5, "modifyNfcMsg", "realTime : " + r8 + ", UpdateTime = " + r0.getUpdateTime());
        if (r0.getUpdateTime() == r8) goto L19;
        r0.setUpdateTime(r8);
        r6 = true;
    L18:
        r2 = 4;
        goto L21
    L19:
        r6 = false;
        goto L18
    L43:
        return;
    L42:
        return;
    }

    public final void a(BluetoothDevice r2, short r3) {
        if (this.d == null) goto L13;
        NfcMsg r4 = getNfcMsgByID(r3);
        if (r4 != null) goto L9;
        return;
    L9:
        if (this.d.remove(r4) == false) goto L12;
        this.b.onNfcMsgChange(r2, this.d);
        return;
    L12:
        return;
    }
}
