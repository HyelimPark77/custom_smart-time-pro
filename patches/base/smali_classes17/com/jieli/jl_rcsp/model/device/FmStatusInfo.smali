.class public Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private channel:I

.field private freq:F

.field private isPlay:Z

.field private mode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZIFI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0, p4}, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->setMode(I)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->setChannel(I)V

    .line 5
    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->setFreq(F)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->setPlay(Z)V

    return-void
.end method


# virtual methods
.method public getChannel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->channel:I

    return v0
.end method

.method public getFreq()F
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->freq:F

    return v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->mode:I

    return v0
.end method

.method public isPlay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->isPlay:Z

    return v0
.end method

.method public setChannel(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->channel:I

    return-void
.end method

.method public setFreq(F)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->freq:F

    return-void
.end method

.method public setMode(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->mode:I

    return-void
.end method

.method public setPlay(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->isPlay:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FmStatusInfo{isPlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->isPlay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", freq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->freq:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
