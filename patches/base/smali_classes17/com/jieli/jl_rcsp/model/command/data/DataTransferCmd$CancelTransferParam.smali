.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CancelTransferParam"
.end annotation


# instance fields
.field private reason:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    int-to-byte v0, p1

    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    const/4 v0, 0x2

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>(I[B)V

    .line 5
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;->reason:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>([B)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;->reason:I

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->getPayload()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;->parsePayload([B)V

    return-void
.end method

.method private parsePayload([B)V
    .locals 1

    if-eqz p1, :cond_1

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte p1, p1, v0

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;->reason:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;->reason:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CancelTransferParam{reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;->reason:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
