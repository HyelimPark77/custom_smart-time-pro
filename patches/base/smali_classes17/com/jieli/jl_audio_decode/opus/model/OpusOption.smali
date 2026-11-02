.class public Lcom/jieli/jl_audio_decode/opus/model/OpusOption;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private channel:I

.field private hasHead:Z

.field private packetSize:I

.field private sampleRate:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->channel:I

    const/16 v0, 0x3e80

    iput v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->sampleRate:I

    const/16 v0, 0x28

    iput v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->packetSize:I

    return-void
.end method


# virtual methods
.method public getChannel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->channel:I

    return v0
.end method

.method public getPacketSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->packetSize:I

    return v0
.end method

.method public getSampleRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->sampleRate:I

    return v0
.end method

.method public isHasHead()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->hasHead:Z

    return v0
.end method

.method public setChannel(I)Lcom/jieli/jl_audio_decode/opus/model/OpusOption;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    iput p1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->channel:I

    return-object p0
.end method

.method public setHasHead(Z)Lcom/jieli/jl_audio_decode/opus/model/OpusOption;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->hasHead:Z

    return-object p0
.end method

.method public setPacketSize(I)Lcom/jieli/jl_audio_decode/opus/model/OpusOption;
    .locals 0

    if-ltz p1, :cond_0

    iput p1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->packetSize:I

    :cond_0
    return-object p0
.end method

.method public setSampleRate(I)Lcom/jieli/jl_audio_decode/opus/model/OpusOption;
    .locals 1

    const/16 v0, 0x1f40

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2ee0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3e80

    if-eq p1, v0, :cond_1

    const/16 v0, 0x5dc0

    if-eq p1, v0, :cond_1

    const v0, 0xbb80

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    iput p1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->sampleRate:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OpusOption{hasHead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->hasHead:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sampleRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->sampleRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;->packetSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
