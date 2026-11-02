.class public Lcom/jieli/jl_rcsp/model/device/ChannelInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private freq:F

.field private index:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->setIndex(I)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->setFreq(F)V

    return-void
.end method


# virtual methods
.method public getFreq()F
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->freq:F

    return v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->index:I

    return v0
.end method

.method public setFreq(F)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->freq:F

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->index:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChannelInfo{index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", freq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;->freq:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
