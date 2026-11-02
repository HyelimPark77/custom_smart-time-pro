.class public Lcom/jieli/jl_rcsp/model/data/DataParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final dataType:I

.field private receiveLimit:I

.field private sendLimit:I

.field private final version:I

.field private final way:I


# direct methods
.method public constructor <init>(IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->way:I

    iput p2, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->dataType:I

    iput p3, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->version:I

    invoke-virtual {p0, p4}, Lcom/jieli/jl_rcsp/model/data/DataParams;->setSendLimit(I)Lcom/jieli/jl_rcsp/model/data/DataParams;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/jieli/jl_rcsp/model/data/DataParams;->setReceiveLimit(I)Lcom/jieli/jl_rcsp/model/data/DataParams;

    return-void
.end method


# virtual methods
.method public getDataType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->dataType:I

    return v0
.end method

.method public getReceiveLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->receiveLimit:I

    return v0
.end method

.method public getSendLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->sendLimit:I

    return v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->version:I

    return v0
.end method

.method public getWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->way:I

    return v0
.end method

.method public setReceiveLimit(I)Lcom/jieli/jl_rcsp/model/data/DataParams;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->receiveLimit:I

    return-object p0
.end method

.method public setSendLimit(I)Lcom/jieli/jl_rcsp/model/data/DataParams;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->sendLimit:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataParams{dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->dataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->version:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sendLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->sendLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiveLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/DataParams;->receiveLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
