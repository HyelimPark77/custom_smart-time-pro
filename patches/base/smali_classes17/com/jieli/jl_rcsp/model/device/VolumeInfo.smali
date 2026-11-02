.class public Lcom/jieli/jl_rcsp/model/device/VolumeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private maxVol:I

.field private supportVolumeSync:Z

.field private volume:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;-><init>(II)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->supportVolumeSync:Z

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->setMaxVol(I)V

    .line 6
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->setVolume(I)V

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->supportVolumeSync:Z

    .line 9
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->setMaxVol(I)V

    .line 10
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->setVolume(I)V

    .line 11
    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->setSupportVolumeSync(Z)V

    return-void
.end method


# virtual methods
.method public getMaxVol()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->maxVol:I

    return v0
.end method

.method public getVolume()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->volume:I

    return v0
.end method

.method public isSupportVolumeSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->supportVolumeSync:Z

    return v0
.end method

.method public setMaxVol(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->maxVol:I

    return-void
.end method

.method public setSupportVolumeSync(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->supportVolumeSync:Z

    return-void
.end method

.method public setVolume(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->volume:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VolumeInfo{maxVol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->maxVol:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->volume:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportVolumeSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;->supportVolumeSync:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
