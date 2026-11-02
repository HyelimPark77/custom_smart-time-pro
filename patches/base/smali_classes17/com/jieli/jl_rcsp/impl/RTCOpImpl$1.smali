.class Lcom/jieli/jl_rcsp/impl/RTCOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->readAlarmBellArgs(Landroid/bluetooth/BluetoothDevice;BLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Ljava/util/List<",
        "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
        ">;",
        "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$1;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;",
            ")",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;

    .line 5
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;->getBellArg()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public bridge synthetic hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    .line 2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$1;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
