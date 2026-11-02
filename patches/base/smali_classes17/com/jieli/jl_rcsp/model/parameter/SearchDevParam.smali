.class public Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam$SearchDevResultParam;
    }
.end annotation


# instance fields
.field private op:I

.field private player:I

.field private timeoutSec:I

.field private type:I

.field private way:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->player:I

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->player:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setType(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setTimeoutSec(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    return-void
.end method


# virtual methods
.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 5

    const/4 v0, 0x6

    new-array v0, v0, [B

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->type:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->op:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x1

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->timeoutSec:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->way:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x4

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->player:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x5

    aput-byte v1, v0, v2

    return-object v0
.end method

.method public getPlayer()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->player:I

    return v0
.end method

.method public getTimeoutSec()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->timeoutSec:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->type:I

    return v0
.end method

.method public getWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->way:I

    return v0
.end method

.method public setOp(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->op:I

    return-object p0
.end method

.method public setPlayer(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->player:I

    return-object p0
.end method

.method public setTimeoutSec(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->timeoutSec:I

    return-object p0
.end method

.method public setType(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->type:I

    return-object p0
.end method

.method public setWay(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->way:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SearchDevParam{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutSec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->timeoutSec:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
