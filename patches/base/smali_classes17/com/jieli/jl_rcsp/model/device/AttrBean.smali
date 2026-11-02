.class public Lcom/jieli/jl_rcsp/model/device/AttrBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private attrData:[B

.field private type:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAttrData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->attrData:[B

    return-object v0
.end method

.method public getData()[B
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->attrData:[B

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    array-length v4, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    array-length v4, v2

    add-int/lit8 v5, v4, 0x2

    new-array v5, v5, [B

    add-int/2addr v4, v3

    int-to-byte v4, v4

    aput-byte v4, v5, v0

    iget-byte v4, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->type:B

    aput-byte v4, v5, v3

    array-length v3, v2

    invoke-static {v2, v0, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v5

    :cond_1
    :goto_0
    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->type:B

    new-array v1, v1, [B

    aput-byte v3, v1, v0

    aput-byte v2, v1, v3

    return-object v1
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->type:B

    return v0
.end method

.method public setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->attrData:[B

    return-object p0
.end method

.method public setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->type:B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AttrBean{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->type:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", attrData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;->attrData:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
