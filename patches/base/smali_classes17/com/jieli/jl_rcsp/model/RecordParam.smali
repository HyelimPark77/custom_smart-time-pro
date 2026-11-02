.class public Lcom/jieli/jl_rcsp/model/RecordParam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SAMPLE_RATE_16K:I = 0x10

.field public static final SAMPLE_RATE_8K:I = 0x8

.field public static final VAD_WAY_DEVICE:I = 0x0

.field public static final VAD_WAY_SDK:I = 0x1

.field public static final VOICE_TYPE_OPUS:I = 0x2

.field public static final VOICE_TYPE_PCM:I = 0x0

.field public static final VOICE_TYPE_SPEEX:I = 0x1


# instance fields
.field private final sampleRate:I

.field private final vadWay:I

.field private final voiceType:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->voiceType:I

    iput p2, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->sampleRate:I

    iput p3, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->vadWay:I

    return-void
.end method


# virtual methods
.method public getSampleRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->sampleRate:I

    return v0
.end method

.method public getVadWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->vadWay:I

    return v0
.end method

.method public getVoiceType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->voiceType:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecordParam{voiceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->voiceType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sampleRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->sampleRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", vadWay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RecordParam;->vadWay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
