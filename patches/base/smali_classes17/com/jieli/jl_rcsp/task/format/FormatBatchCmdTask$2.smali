.class Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Ljava/lang/Boolean;",
        "Lcom/jieli/jl_rcsp/model/command/BatchCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$2;->a:Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/BatchCmd;)Ljava/lang/Boolean;
    .locals 0

    .line 2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$2;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/BatchCmd;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$2;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/BatchCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/BatchCmd;)I
    .locals 0

    const/4 p1, -0x1

    if-nez p2, :cond_0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;

    if-nez p2, :cond_1

    return p1

    .line 3
    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;->getRet()B

    move-result p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    return p1
.end method
