.class public Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private currentDev:I

.field private currentTime:I

.field private isPlay:Z

.field private totalTime:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->setPlay(Z)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->setCurrentTime(I)V

    .line 5
    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->setTotalTime(I)V

    .line 6
    invoke-virtual {p0, p4}, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->setCurrentDev(I)V

    return-void
.end method


# virtual methods
.method public getCurrentDev()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->currentDev:I

    return v0
.end method

.method public getCurrentTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->currentTime:I

    return v0
.end method

.method public getTotalTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->totalTime:I

    return v0
.end method

.method public isPlay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->isPlay:Z

    return v0
.end method

.method public setCurrentDev(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->currentDev:I

    return-void
.end method

.method public setCurrentTime(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->currentTime:I

    return-void
.end method

.method public setPlay(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->isPlay:Z

    return-void
.end method

.method public setTotalTime(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->totalTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MusicStatusInfo{isPlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->isPlay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", currentTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->currentTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->totalTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentDev="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->currentDev:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
