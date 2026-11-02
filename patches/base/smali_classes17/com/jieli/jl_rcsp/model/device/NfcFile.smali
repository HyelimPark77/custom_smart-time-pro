.class public Lcom/jieli/jl_rcsp/model/device/NfcFile;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private message:Lcom/jieli/jl_rcsp/model/device/NfcMsg;

.field private nfcData:[B


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/device/NfcMsg;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/NfcFile;->setMessage(Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/NfcFile;->setNfcData([B)V

    return-void
.end method


# virtual methods
.method public convertRawData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->message:Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->convertRawData()[B

    move-result-object v0

    array-length v1, v0

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->nfcData:[B

    array-length v2, v2

    add-int/2addr v1, v2

    new-array v1, v1, [B

    array-length v2, v0

    const/4 v3, 0x0

    if-lez v2, :cond_0

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->nfcData:[B

    array-length v4, v2

    if-lez v4, :cond_1

    array-length v4, v2

    invoke-static {v2, v3, v1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    return-object v1
.end method

.method public getMessage()Lcom/jieli/jl_rcsp/model/device/NfcMsg;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->message:Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    return-object v0
.end method

.method public getNfcData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->nfcData:[B

    return-object v0
.end method

.method public setMessage(Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->message:Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    return-void
.end method

.method public setNfcData([B)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->nfcData:[B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NfcFile{message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->message:Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nfcData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/NfcFile;->nfcData:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
