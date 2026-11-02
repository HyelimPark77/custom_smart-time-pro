package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.health.IHealthOp;
import com.jieli.jl_rcsp.model.HealthDataQuery;
import com.jieli.jl_rcsp.model.RealTimeSportsData;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr;
import com.jieli.jl_rcsp.model.device.health.SportsInfo;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CommandBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class HealthOpImpl implements IHealthOp {
    public final RcspOpImpl a;

    public HealthOpImpl(RcspOpImpl r2) {
        if (r2 == null) goto L7;
        this.a = r2;
        return;
    L7:
        throw new NullPointerException("RcspOpImpl can not be null.");
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void configHealthSettings(BluetoothDevice r4, List<AttrBean> r5, OnOperationCallback<Boolean> r6) {
        if (r5 != null) goto L4;
    L8:
        if (r6 == null) goto L11;
        r6.onFailed(new BaseError(4097, "List of AttrBean can not be empty."));
        return;
    L11:
        return;
    L4:
        if (r5.isEmpty() == true) goto L8;
        this.a.sendRcspCommand(r4, CommandBuilder.buildSetHealthSettingCmd(r5), new BooleanRcspActionCallback("configHealthSettings", r6));
    }

    public BluetoothDevice getConnectedDevice() {
        return this.a.getConnectedDevice();
    }

    public RcspOpImpl getRcspOp() {
        return this.a;
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void pauseSports(BluetoothDevice r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildSyncSportsStatusCmd(new SportsInfoStatusSyncCmd.PauseSportsParam()), new BooleanRcspActionCallback("pauseSports", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void readHealthData(BluetoothDevice r5, HealthDataQuery r6, OnOperationCallback<Boolean> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "HealthDataQuery is null."));
        return;
    L8:
        return;
    L6:
        this.a.sendRcspCommand(r5, CommandBuilder.buildGetHealthDataInfoCmd(r6.getMask(), r6.getVersion(), r6.getParam()), new CustomRcspActionCallback("readHealthData", r7, new AnonymousClass1(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void readHealthSettings(BluetoothDevice r4, int r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r4, CommandBuilder.buildGetHealthSettingCmd(r5), new BooleanRcspActionCallback("readHealthSettings", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void readRealTimeSportsData(BluetoothDevice r6, OnOperationCallback<RealTimeSportsData> r7) {
        this.a.sendRcspCommand(r6, CommandBuilder.buildSyncSportsStatusCmd(new SportsInfoStatusSyncCmd.ReadRealDataParam()), new CustomRcspActionCallback("readRealTimeSportsData", r7, new AnonymousClass3(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void readSportsInfo(BluetoothDevice r6, OnOperationCallback<SportsInfo> r7) {
        this.a.sendRcspCommand(r6, CommandBuilder.buildSyncSportsStatusCmd(new SportsInfoStatusSyncCmd.ReadSportsInfoParam()), new CustomRcspActionCallback("readSportsInfo", r7, new AnonymousClass2(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void resumeSports(BluetoothDevice r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildSyncSportsStatusCmd(new SportsInfoStatusSyncCmd.ResumeSportsParam()), new BooleanRcspActionCallback("resumeSports", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void startSports(BluetoothDevice r4, int r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r4, CommandBuilder.buildSyncSportsStatusCmd(new SportsInfoStatusSyncCmd.StartSportsParam((byte) r5)), new BooleanRcspActionCallback("startSports", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void stopSports(BluetoothDevice r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(r5, CommandBuilder.buildSyncSportsStatusCmd(new SportsInfoStatusSyncCmd.AppStopSportsParam()), new BooleanRcspActionCallback("stopSports", r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.health.IHealthOp
    public void configHealthSettings(BluetoothDevice r2, IHealthSettingToAttr r3, OnOperationCallback<Boolean> r4) {
        if (r3 != null) goto L6;
        if (r4 == null) goto L8;
        r4.onFailed(new BaseError(4097, "IHealthSettingToAttr is null."));
        return;
    L8:
        return;
    L6:
        ArrayList r0 = new ArrayList();
        r0.add(r3.toAttr());
        configHealthSettings(r2, r0, r4);
    }
}
