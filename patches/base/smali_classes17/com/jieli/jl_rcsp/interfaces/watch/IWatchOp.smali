.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract cancelTransfer()Z
.end method

.method public abstract createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end method

.method public abstract deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end method

.method public abstract enableCustomWatchBg(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getCurrentBrowsePath()Ljava/lang/String;
.end method

.method public abstract getCurrentWatchInfo(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getCustomWatchBgInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;
.end method

.method public abstract getWatchFileSize(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchFileContent;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getWatchMessage(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getWatchSysLeftSize(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract isOTAResource()Z
.end method

.method public abstract jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract openWatchFile(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "[B>;)V"
        }
    .end annotation
.end method

.method public abstract pushMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract registerOnWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
.end method

.method public abstract removeMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end method

.method public abstract requestDeviceConfigure(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchConfigure;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract requestDevicePower(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract restoreWatchSystem(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end method

.method public abstract setCurrentWatchInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract syncWeatherInfo(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract unregisterOnWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
.end method

.method public abstract updateWatchResource(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V
.end method

.method public abstract writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method
