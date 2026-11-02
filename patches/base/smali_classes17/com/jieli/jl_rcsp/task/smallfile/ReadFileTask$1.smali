.class Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(IIS)V
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
.field public final synthetic a:S

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;SII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    iput-short p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->a:S

    iput p3, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->b:I

    iput p4, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    invoke-static {v0, v1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;

    .line 5
    iget-byte v1, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->ret:B

    if-eqz v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-static {v0, p2, v1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 7
    :cond_1
    iget-object p2, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->fileData:[B

    iget-short v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->a:S

    invoke-static {p2, v1}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result p2

    .line 8
    iget-short v1, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->crc:S

    if-eq p2, v1, :cond_2

    .line 9
    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    iget-short v2, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->a:S

    .line 10
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    iget-short v0, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->crc:S

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    filled-new-array {v2, p2, v0}, [Ljava/lang/Object;

    move-result-object p2

    .line 11
    const-string v0, "app last crc = %x, app crc = %x, device crc = %x."

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x3100

    invoke-direct {v1, v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1, v1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->fileData:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 13
    iget p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->b:I

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->c:I

    add-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    .line 14
    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    move-result-object v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    double-to-int v0, v0

    .line 15
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;I)V

    .line 16
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-lt p1, v0, :cond_3

    .line 17
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)V

    return-void

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    iget v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->c:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    move-result-object v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result v2

    sub-int/2addr v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;IIS)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;->d:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;ILjava/lang/String;)V

    return-void
.end method
