.class public Lcom/jieli/jl_rcsp/model/data/SendDataCache;
.super Lcom/jieli/jl_rcsp/model/data/SendParams;
.source "SourceFile"


# instance fields
.field private final callback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

.field private offset:I

.field private seq:I


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
    .locals 6

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getDataType()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getVersion()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getSendLimit()I

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getReceiveLimit()I

    move-result v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getData()[B

    move-result-object v5

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_rcsp/model/data/SendParams;-><init>(IIII[B)V

    const/4 p1, -0x1

    iput p1, v0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->seq:I

    iput-object p2, v0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->callback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    const/4 p1, 0x0

    iput p1, v0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->offset:I

    return-void
.end method


# virtual methods
.method public getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->callback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    return-object v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->offset:I

    return v0
.end method

.method public getSeq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->seq:I

    return v0
.end method

.method public release()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->seq:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->offset:I

    return-void
.end method

.method public setOffset(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->offset:I

    return-void
.end method

.method public setSeq(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->seq:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendDataCache{callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->callback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->seq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
