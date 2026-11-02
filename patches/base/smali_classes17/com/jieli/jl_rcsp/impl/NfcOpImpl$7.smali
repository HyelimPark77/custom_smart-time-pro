.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/task/TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/TaskListener;

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/task/TaskListener;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->b:Landroid/bluetooth/BluetoothDevice;

    iput p4, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->c:I

    iput-object p5, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "startTransferTask"

    const-string v2, "onBegin >> "

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/TaskListener;->onBegin()V

    :cond_0
    return-void
.end method

.method public onCancel(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onCancel(I)V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", msg = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startTransferTask"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/task/ITask;)Lcom/jieli/jl_rcsp/task/ITask;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onFinish()V
    .locals 6

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "startTransferTask"

    const-string v2, "onFinish >> "

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/task/ITask;)Lcom/jieli/jl_rcsp/task/ITask;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->d(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->b:Landroid/bluetooth/BluetoothDevice;

    iget v2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->c:I

    iget-object v3, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->e:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->d:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildInsertNfcFileEndCmd(ILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;-><init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;)V

    const-string v5, "InsertNfcFileEnd"

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public onProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onProgress(I)V

    :cond_0
    return-void
.end method
