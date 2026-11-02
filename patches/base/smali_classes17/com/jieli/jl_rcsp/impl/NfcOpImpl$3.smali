.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->modifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;

.field public final synthetic c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

.field public final synthetic d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->b:Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->b:Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$3;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
