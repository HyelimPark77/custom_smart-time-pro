.class Lcom/jieli/jl_rcsp/impl/HealthOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->readSportsInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;",
        "Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/HealthOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/HealthOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/HealthOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 1

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getOp()B

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;

    if-nez p1, :cond_1

    return-object v0

    .line 5
    :cond_1
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;-><init>()V

    iget-byte v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->type:B

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p2

    iget-byte v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->status:B

    .line 6
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->id:I

    .line 7
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setId(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p2

    iget-boolean v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->hasGps:Z

    .line 8
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setNeedAppGPS(Z)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p2

    iget-byte v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->heartRateMode:B

    .line 9
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setHeartRateMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p2

    iget p1, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->readReadDataInterval:I

    .line 10
    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setReadRealTimeDataInterval(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$2;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    .line 2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$2;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
