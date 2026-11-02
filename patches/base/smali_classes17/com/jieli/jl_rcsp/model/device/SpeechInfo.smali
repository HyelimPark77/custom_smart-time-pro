.class public Lcom/jieli/jl_rcsp/model/device/SpeechInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private audioFormat:I

.field private channel:I

.field private haveVad:I

.field private sampleRate:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAudioFormat()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->audioFormat:I

    return v0
.end method

.method public getChannel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->channel:I

    return v0
.end method

.method public getHaveVad()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->haveVad:I

    return v0
.end method

.method public getSampleRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->sampleRate:I

    return v0
.end method

.method public setAudioFormat(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->audioFormat:I

    return-void
.end method

.method public setChannel(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->channel:I

    return-void
.end method

.method public setHaveVad(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->haveVad:I

    return-void
.end method

.method public setSampleRate(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->sampleRate:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpeechInfo{haveVad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->haveVad:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sampleRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->sampleRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", audioFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/SpeechInfo;->audioFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
