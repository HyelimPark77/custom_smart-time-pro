.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->onFinish()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;

    iget-object v0, p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iget-object v1, p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->b:Landroid/bluetooth/BluetoothDevice;

    iget p1, p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->c:I

    new-instance v2, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1$1;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->syncNfcMsg(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
