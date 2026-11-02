package com.jieli.jl_rcsp.interfaces.alarm;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.command.AlarmExpandCmd;
import com.jieli.jl_rcsp.model.device.AlarmBean;
import com.jieli.jl_rcsp.model.device.AuditionParam;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface IRTCOp {
    void addOrModifyAlarm(BluetoothDevice r1, AlarmBean r2, OnOperationCallback<Boolean> r3);

    void auditionAlarmBell(BluetoothDevice r1, AuditionParam r2, OnOperationCallback<Boolean> r3);

    void deleteAlarm(BluetoothDevice r1, AlarmBean r2, OnOperationCallback<Boolean> r3);

    void readAlarmBellArgs(BluetoothDevice r1, byte r2, OnOperationCallback<List<AlarmExpandCmd.BellArg>> r3);

    void readAlarmDefaultBellList(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void readAlarmList(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void setAlarmBellArg(BluetoothDevice r1, AlarmExpandCmd.BellArg r2, OnOperationCallback<Boolean> r3);

    void stopAlarmBell(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void stopPlayAlarmBell(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void syncTime(BluetoothDevice r1, OnOperationCallback<Boolean> r2);
}
