.class Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->startRecord(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
