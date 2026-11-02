.class Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/RTCOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ReadAlarmRcspCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->b:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    return-void
.end method


# virtual methods
.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "STATUS_RESPONSE_DATA_OVER_LIMIT"

    const-string v0, "start .... MSG_WAIT_ALARM_DATA >> "

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->b:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->b:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Landroid/os/Handler;

    move-result-object p1

    const p2, 0xa100

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->b:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Landroid/os/Handler;

    move-result-object p1

    const-wide/16 v0, 0x1770

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    const/16 v1, 0x3004

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_2

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method
