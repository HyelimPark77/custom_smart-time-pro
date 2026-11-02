.class Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    invoke-static {v0, v1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;

    .line 5
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->getFiles()Ljava/util/List;

    move-result-object p1

    .line 6
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p2, v0}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;Ljava/util/List;)Ljava/util/List;

    if-eqz p1, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    iget-byte v2, p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->type:B

    iget-short v3, p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->id:S

    iget p2, p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->size:I

    invoke-direct {v1, v2, v3, p2}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;-><init>(BSI)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->b(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$1;->a:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask;ILjava/lang/String;)V

    return-void
.end method
