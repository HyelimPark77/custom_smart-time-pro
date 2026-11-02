.class public Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private frameLen:I

.field private pageFrameCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1e

    iput v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->pageFrameCount:I

    const/16 v0, 0x28

    iput v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->frameLen:I

    return-void
.end method


# virtual methods
.method public getFrameLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->frameLen:I

    return v0
.end method

.method public getPageFrameCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->pageFrameCount:I

    return v0
.end method

.method public setFrameLen(I)Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;
    .locals 0

    if-lez p1, :cond_0

    iput p1, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->frameLen:I

    :cond_0
    return-object p0
.end method

.method public setPageFrameCount(I)Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;
    .locals 0

    if-lez p1, :cond_0

    iput p1, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->pageFrameCount:I

    :cond_0
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OggConfigure{pageFrameCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->pageFrameCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;->frameLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
