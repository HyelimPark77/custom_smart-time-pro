package com.jieli.jl_rcsp.interfaces.health;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.HealthDataQuery;
import com.jieli.jl_rcsp.model.RealTimeSportsData;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr;
import com.jieli.jl_rcsp.model.device.health.SportsInfo;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface IHealthOp {
    void configHealthSettings(BluetoothDevice r1, IHealthSettingToAttr r2, OnOperationCallback<Boolean> r3);

    void configHealthSettings(BluetoothDevice r1, List<AttrBean> r2, OnOperationCallback<Boolean> r3);

    void pauseSports(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void readHealthData(BluetoothDevice r1, HealthDataQuery r2, OnOperationCallback<Boolean> r3);

    void readHealthSettings(BluetoothDevice r1, int r2, OnOperationCallback<Boolean> r3);

    void readRealTimeSportsData(BluetoothDevice r1, OnOperationCallback<RealTimeSportsData> r2);

    void readSportsInfo(BluetoothDevice r1, OnOperationCallback<SportsInfo> r2);

    void resumeSports(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void startSports(BluetoothDevice r1, int r2, OnOperationCallback<Boolean> r3);

    void stopSports(BluetoothDevice r1, OnOperationCallback<Boolean> r2);
}
