package com.jieli.bluetooth_connect.interfaces;

import com.jieli.bluetooth_connect.bean.BluetoothOption;

/* JADX INFO: loaded from: classes17.dex */
public interface IBluetoothBase<T> {
    void addListener(T listener);

    void destroy();

    void removeListener(T listener);

    void setBluetoothOption(BluetoothOption option);
}
