.class Lcom/jieli/jl_rcsp/impl/HealthOpImpl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/HealthOpImpl;->readRealTimeSportsData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Lcom/jieli/jl_rcsp/model/RealTimeSportsData;",
        "Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/HealthOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/HealthOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/HealthOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;
    .locals 2

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getOp()B

    move-result p1

    const/4 v1, 0x6

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;

    if-nez p1, :cond_1

    return-object v0

    .line 5
    :cond_1
    new-instance p2, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;-><init>()V

    iget-byte v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->version:B

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setVersion(B)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->step:I

    .line 6
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setStep(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->distance:F

    .line 7
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setDistance(F)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->duration:I

    .line 8
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setDuration(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->speed:F

    .line 9
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setSpeed(F)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->pace:F

    .line 10
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setPace(F)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->kcal:I

    .line 11
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setCalorie(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stepFreq:I

    .line 12
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setStepFreq(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->stride:I

    .line 13
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setStride(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget v0, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->exerciseStatus:I

    .line 14
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setExerciseStatus(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p2

    iget p1, p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;->heartRate:I

    .line 15
    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/RealTimeSportsData;->setHeartRate(I)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

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

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$3;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)Lcom/jieli/jl_rcsp/model/RealTimeSportsData;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    .line 2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/HealthOpImpl$3;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
