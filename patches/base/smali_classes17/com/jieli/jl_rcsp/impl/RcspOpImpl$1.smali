.class Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

.field public final synthetic d:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->d:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->b:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->c:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->a:I

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->d:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TT;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    iget v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->a:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->d:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHandler:Landroid/os/Handler;

    iget v5, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->b:I

    new-instance v1, Lcom/jieli/jl_rcsp/impl/XOO0ii0;

    move-object v6, p0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/jieli/jl_rcsp/impl/XOO0ii0;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    const-wide/16 p1, 0x1f4

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    const/4 p1, 0x0

    iput p1, v2, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->a:I

    iget-object p1, v2, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->c:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    if-eqz p1, :cond_1

    invoke-interface {p1, v3, v4}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    :cond_1
    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->a:I

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->c:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method
