package com.jieli.jl_rcsp.interfaces.watch;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_rcsp.model.NotificationMsg;
import com.jieli.jl_rcsp.model.WatchConfigure;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public interface IWatchOp {
    boolean cancelTransfer();

    void createWatchFile(String r1, boolean r2, OnFatFileProgressListener r3);

    void deleteWatchFile(String r1, OnFatFileProgressListener r2);

    void enableCustomWatchBg(String r1, OnWatchOpCallback<FatFile> r2);

    String getCurrentBrowsePath();

    void getCurrentWatchInfo(OnWatchOpCallback<FatFile> r1);

    void getCustomWatchBgInfo(String r1, OnWatchOpCallback<String> r2);

    WatchConfigure getWatchConfigure(BluetoothDevice r1);

    void getWatchFileSize(String r1, OnWatchOpCallback<WatchFileContent> r2);

    void getWatchMessage(String r1, OnWatchOpCallback<String> r2);

    void getWatchSysLeftSize(OnWatchOpCallback<Long> r1);

    boolean isOTAResource();

    void jumpToUpdateResource(boolean r1, OnWatchOpCallback<Boolean> r2);

    void listWatchList(OnWatchOpCallback<ArrayList<FatFile>> r1);

    void openWatchFile(String r1, OnWatchOpCallback<byte[]> r2);

    void pushMessageInfo(NotificationMsg r1, OnWatchOpCallback<Boolean> r2);

    void registerOnWatchCallback(OnWatchCallback r1);

    void removeMessageInfo(NotificationMsg r1, OnWatchOpCallback<Boolean> r2);

    void replaceWatchFile(String r1, OnFatFileProgressListener r2);

    void requestDeviceConfigure(OnWatchOpCallback<WatchConfigure> r1);

    void requestDevicePower(OnWatchOpCallback<Boolean> r1);

    void restoreWatchSystem(OnFatFileProgressListener r1);

    void setCurrentWatchInfo(String r1, OnWatchOpCallback<FatFile> r2);

    void syncWeatherInfo(PushInfoDataToDeviceCmd.Weather r1, OnWatchOpCallback<Boolean> r2);

    void unregisterOnWatchCallback(OnWatchCallback r1);

    void updateWatchResource(String r1, OnUpdateResourceCallback r2);

    void writeResourceOTAFlag(boolean r1, OnWatchOpCallback<Boolean> r2);
}
