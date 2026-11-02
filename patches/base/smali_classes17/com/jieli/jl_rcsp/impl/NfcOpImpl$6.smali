.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->setDefaultNfc(Landroid/bluetooth/BluetoothDevice;ISLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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
.field public final synthetic a:S

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

.field public final synthetic d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;SLandroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iput-short p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->a:S

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->b:Landroid/bluetooth/BluetoothDevice;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->a:S

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;S)S

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->b:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->d:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)S

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onDefaultNfc(Landroid/bluetooth/BluetoothDevice;S)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$6;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
