.class public Lcom/jieli/jl_rcsp/impl/HealthOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/health/IHealthOp;


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "RcspOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public configHealthSettings(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    .line 4
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "IHealthSettingToAttr is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    .line 5
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {p2}, Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;->toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {p0, p1, v0, p3}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->configHealthSettings(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public configHealthSettings(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_1

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetHealthSettingCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "configHealthSettings"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 3
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "List of AttrBean can not be empty."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_2
    return-void
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object v0
.end method

.method public pauseSports(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$PauseSportsParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$PauseSportsParam;-><init>()V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "pauseSports"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public readHealthData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/HealthDataQuery;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/HealthDataQuery;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "HealthDataQuery is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->getMask()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->getVersion()I

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->getParam()[B

    move-result-object p2

    invoke-static {v1, v2, p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetHealthDataInfoCmd(II[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/HealthOpImpl;)V

    const-string v3, "readHealthData"

    invoke-direct {v1, v3, p3, v2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public readHealthSettings(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetHealthSettingCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "readHealthSettings"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public readRealTimeSportsData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/RealTimeSportsData;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataParam;-><init>()V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$3;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$3;-><init>(Lcom/jieli/jl_rcsp/impl/HealthOpImpl;)V

    const-string v4, "readRealTimeSportsData"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public readSportsInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoParam;-><init>()V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$2;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/HealthOpImpl;)V

    const-string v4, "readSportsInfo"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public resumeSports(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ResumeSportsParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ResumeSportsParam;-><init>()V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "resumeSports"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public startSports(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;

    int-to-byte p2, p2

    invoke-direct {v1, p2}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;-><init>(B)V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "startSports"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public stopSports(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsParam;-><init>()V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "stopSports"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
