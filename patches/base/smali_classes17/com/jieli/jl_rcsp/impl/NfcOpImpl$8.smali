.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;
.super Lcom/jieli/jl_rcsp/task/SimpleTaskListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

.field public final synthetic b:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;->b:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/SimpleTaskListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;->onStart()V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {v1, p1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$8;->b:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->c(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/task/ITask;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->getNfcMsgs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;->onFinish(Ljava/util/List;)V

    :cond_0
    return-void
.end method
