.class public Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public mask:I

.field public subMask:[B

.field public version:B


# direct methods
.method public varargs constructor <init>(IB[B)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 5
    invoke-direct {p0, p1, p3}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->checkMaskAndSubMaskRelation(I[B)V

    .line 6
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->mask:I

    .line 7
    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->version:B

    .line 8
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->subMask:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->parse([B)I

    move-result v0

    if-ltz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failure to parse data. size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, p1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    throw v1
.end method

.method private checkMaskAndSubMaskRelation(I[B)V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x20

    if-ge v0, v2, :cond_1

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBitByPosition(II)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_3

    array-length p1, p2

    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mask set count not equal to subMask length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mask must not be 0x00"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getParamData()[B
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->subMask:[B

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v1, p1

    const/4 v2, 0x5

    if-ge v1, v2, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v3

    iput v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->mask:I

    aget-byte v1, p1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->version:B

    array-length v1, p1

    if-ge v2, v1, :cond_2

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->subMask:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->subMask:[B

    array-length p1, p1

    add-int/2addr p1, v2

    return p1

    :cond_2
    return v2

    :cond_3
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->subMask:[B

    array-length v0, v0

    const/4 v1, 0x5

    add-int/2addr v0, v1

    new-array v0, v0, [B

    iget v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->mask:I

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->version:B

    const/4 v3, 0x4

    aput-byte v2, v0, v3

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->subMask:[B

    array-length v3, v2

    invoke-static {v2, v4, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
