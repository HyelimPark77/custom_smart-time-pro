.class Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(IIS)V
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
.field public final synthetic a:I

.field public final synthetic b:Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;

.field public final synthetic c:S

.field public final synthetic d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;ILcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iput p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->b:Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;

    iput-short p4, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->c:S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    invoke-static {v0, v1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;

    .line 5
    iget-byte v1, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;->ret:B

    if-eqz v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-static {v0, p2, v1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 7
    :cond_1
    iget p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->a:I

    int-to-double p1, p1

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    mul-double/2addr p1, v1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    move-result-object v1

    iget v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    int-to-double v1, v1

    div-double/2addr p1, v1

    double-to-int p1, p1

    .line 8
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;I)V

    .line 9
    iget p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->a:I

    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    move-result-object p2

    iget p2, p2, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    if-lt p1, p2, :cond_3

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->b:Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;

    instance-of p1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileParam;

    const-string p2, "write"

    if-eqz p1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    new-instance v1, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    move-result-object v2

    iget-byte v2, v2, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;

    iget-short v0, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;->id:S

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    move-result-object v3

    iget v3, v3, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    invoke-direct {v1, v2, v0, v3}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;-><init>(BSI)V

    iput-object v1, p1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->c:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    .line 12
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add small file finished id = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->c:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    iget-short v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;->id:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->c(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update small file finished id = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->c:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    iget-short v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;->id:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->d(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)V

    return-void

    .line 15
    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iget p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->a:I

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)I

    move-result v0

    iget-short v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->c:S

    invoke-static {p1, p2, v0, v1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;IIS)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;ILjava/lang/String;)V

    return-void
.end method
