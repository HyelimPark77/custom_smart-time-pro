.class public Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private name:Ljava/lang/String;

.field private reason:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getParamData()[B
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;->name:Ljava/lang/String;

    const-string v1, "GBK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;->reason:I

    return v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;->name:Ljava/lang/String;

    return-void
.end method

.method public setReason(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopLargeFileTransferParam;->reason:I

    return-void
.end method
