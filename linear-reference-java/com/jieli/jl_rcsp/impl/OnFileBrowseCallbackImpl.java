package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.FileBrowseUtil;
import com.jieli.jl_filebrowse.bean.FileChangeInfo;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback;
import com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.file_op.NotifyFileStructureChangeCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopFileBrowseCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopLrcGetCmd;
import com.jieli.jl_rcsp.model.command.sys.GetSysInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.UpdateSysInfoCmd;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.device.DevStorageInfo;
import com.jieli.jl_rcsp.model.device.DevStorageState;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.model.parameter.GetSysInfoParam;
import com.jieli.jl_rcsp.model.parameter.StopFileBrowseParam;
import com.jieli.jl_rcsp.model.parameter.UpdateSysInfoParam;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class OnFileBrowseCallbackImpl extends OnRcspCallback implements OnFileBrowseCallback, OnLrcCallback {
    public static final String d = "OnFileBrowseCallbackImpl";
    public final RcspOpImpl a;
    public final OnFileBrowseCallback b;
    public final OnLrcCallback c;

    static {
    }

    public OnFileBrowseCallbackImpl(RcspOpImpl r1, OnFileBrowseCallback r2, OnLrcCallback r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public static /* synthetic */ List a(OnFileBrowseCallbackImpl r0, byte[] r1, BluetoothDevice r2) {
        return r0.a(r1, r2);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void OnFlayCallback(boolean r2) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.OnFlayCallback(r2);
        return;
    }

    public final void b(BluetoothDevice r3, CommandBase r4) {
        this.a.sendCommandResponse(r3, r4, null);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onBluetoothConnectionChange(BluetoothDevice r2, int r3) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onBluetoothConnectionChange(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onConnectStateChange(BluetoothDevice r2, int r3) {
        super.onConnectStateChange(r2, r3);
        if (r3 == 0) goto L5;
    L7:
        onBluetoothConnectionChange(r2, r3);
        return;
    L5:
        if (FileBrowseManager.getInstance().isInit() == false) goto L7;
        FileBrowseManager.getInstance().cleanCache(r2);
        goto L7
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileDataReceive(byte[] r2) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onFileDataReceive(r2);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadFailed(int r2) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onFileReadFailed(r2);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadStart() {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onFileReadStart();
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadStop(boolean r2) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onFileReadStop(r2);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileStructureChange(FileChangeInfo r2) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onFileStructureChange(r2);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcDataReceive(byte[] r2) {
        OnLrcCallback r0 = this.c;
        if (r0 == null) goto L6;
        r0.onLrcDataReceive(r2);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadFailed(int r2) {
        OnLrcCallback r0 = this.c;
        if (r0 == null) goto L6;
        r0.onLrcReadFailed(r2);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadStart() {
        OnLrcCallback r0 = this.c;
        if (r0 == null) goto L6;
        r0.onLrcReadStart();
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadStop() {
        OnLrcCallback r0 = this.c;
        if (r0 == null) goto L6;
        r0.onLrcReadStop();
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspCommand(BluetoothDevice r3, CommandBase r4) {
        super.onRcspCommand(r3, r4);
        int r0 = r4.getId();
        if (r0 != 9) goto L5;
    L11:
        a(r3, r4);
        return;
    L5:
        if (r0 == 13) goto L11;
        if (r0 == 16) goto L11;
        if (r0 == 242) goto L11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspDataCmd(BluetoothDevice r2, CommandBase r3) {
        super.onRcspDataCmd(r2, r3);
        if (r3.getId() != 1) goto L14;
        DataParam r4 = (DataParam) ((DataCmd) r3).getParam();
        int r5 = r4.getXmOpCode();
        if (r5 != 12) goto L8;
        onFileDataReceive(r4.getData());
        return;
    L8:
        if (r5 == 15) goto L10;
        return;
    L10:
        onLrcDataReceive(r4.getData());
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
    public void onRcspInit(BluetoothDevice r1, boolean r2) {
        if (r2 == false) goto L5;
        a(r1);
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onSdCardChange(List<SDCardBean> r2) {
        OnFileBrowseCallback r0 = this.b;
        if (r0 == null) goto L6;
        r0.onSdCardChange(r2);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(BluetoothDevice r5, CommandBase r6) {
        if (r6 == null) goto L49;
        int r0 = r6.getId();
        if (r0 != 9) goto L7;
        UpdateSysInfoParam r7 = (UpdateSysInfoParam) ((UpdateSysInfoCmd) r6).getParam();
        if ((r7.getFunction() & 255) != 255) goto L43;
        Iterator<AttrBean> r8 = r7.getAttrBeanList().iterator();
    L39:
        if (r8.hasNext() == false) goto L52;
        AttrBean r1 = r8.next();
        if ((r1.getType() & 255) != 2) goto L39;
        onSdCardChange(a(r1.getAttrData(), r5));
        goto L39
    L52:
        return;
    L43:
        return;
    L7:
        if (r0 != 13) goto L9;
        StopFileBrowseCmd r9 = (StopFileBrowseCmd) r6;
        byte r2 = ((StopFileBrowseParam) r9.getParam()).getReason();
        boolean r3 = true;
        if (r2 == 0) goto L29;
        if (r2 == 1) goto L29;
        if (r2 == 2) goto L28;
        onFileReadFailed(r2);
    L33:
        r9.setStatus(0);
        b(r5, r9);
        return;
    L28:
        OnFlayCallback(true);
    L29:
        if (r2 == 1) goto L32;
        r3 = false;
    L32:
        onFileReadStop(r3);
        goto L33
    L9:
        if (r0 != 16) goto L11;
        StopLrcGetCmd r10 = (StopLrcGetCmd) r6;
        int r4 = r10.getStatus();
        if (r4 == 0) goto L21;
        onLrcReadFailed(r4);
    L21:
        r10.setStatus(0);
        b(r5, r10);
        return;
    L11:
        if (r0 != 242) goto L50;
        NotifyFileStructureChangeCmd.Param r11 = (NotifyFileStructureChangeCmd.Param) ((NotifyFileStructureChangeCmd) r6).getParam();
        if (r11 == null) goto L51;
        onFileStructureChange(new FileChangeInfo(r11.getDevHandle(), r11.getOp(), r11.getCluster(), r11.getFilePath()));
        return;
    L51:
        return;
    L50:
        return;
    }

    public final void a(BluetoothDevice r4) {
        GetSysInfoCmd r1 = new GetSysInfoCmd(new GetSysInfoParam((byte) -1, 4));
        this.a.sendRcspCommand(r4, r1, new AnonymousClass1(this));
    }

    public final List<SDCardBean> a(byte[] r6, BluetoothDevice r7) {
        DevStorageInfo r0 = new DevStorageInfo();
        r0.parseData(r6);
        List<DevStorageState> r8 = r0.getStorageStates();
        ArrayList r1 = new ArrayList();
        Iterator<DevStorageState> r9 = r8.iterator();
    L4:
        if (r9.hasNext() == false) goto L6;
        DevStorageState r2 = r9.next();
        int r3 = r2.getIndex();
        r1.add(new SDCardBean().setDevice(r7).setIndex(r2.getIndex()).setOnline(r2.isOnline()).setDevHandler(r2.getHandle()).setName(FileBrowseUtil.getDevName(r3)).setType(SDCardBean.getStorageType(r3)));
        goto L4
    L6:
        DeviceInfo r10 = this.a.getDeviceInfo(r7);
        ArrayList r11 = new ArrayList();
        if (r10 != null) goto L9;
        r10 = new DeviceInfo();
    L9:
        Iterator r4 = r1.iterator();
    L11:
        if (r4.hasNext() == false) goto L28;
        SDCardBean r5 = (SDCardBean) r4.next();
        JL_Log.d(d, "covert", "sd--->" + r5.toString());
        if (r5.getIndex() != 0) goto L18;
        if (r10.isSupportUsb() == false) goto L18;
        r11.add(r5);
    L18:
        if (r5.getIndex() != 1) goto L23;
        if (r10.isSupportSd0() == false) goto L23;
        r11.add(r5);
    L23:
        if (r5.getIndex() != 2) goto L27;
        if (r10.isSupportSd1() == false) goto L27;
        r11.add(r5);
    L27:
        r11.add(r5);
        goto L11
    L28:
        return r11;
    }
}
