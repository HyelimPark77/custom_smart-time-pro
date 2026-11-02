.class public Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CancelParam"
.end annotation


# instance fields
.field public reason:B


# direct methods
.method public constructor <init>(B)V
    .locals 1

    const/16 v0, -0x7f

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;-><init>(B)V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;->reason:B

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 4

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;->reason:B

    const/4 v2, 0x2

    new-array v2, v2, [B

    const/4 v3, 0x0

    aput-byte v0, v2, v3

    const/4 v0, 0x1

    aput-byte v1, v2, v0

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CancelParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;->reason:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
