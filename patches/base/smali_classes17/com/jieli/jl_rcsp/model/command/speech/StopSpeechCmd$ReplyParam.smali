.class public Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;
.super Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReplyParam"
.end annotation


# instance fields
.field private isPlayTTS:Z

.field private isSyncIatText:Z

.field private isSyncNlpText:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;-><init>()V

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;->isSyncIatText:Z

    iput-boolean p2, p0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;->isSyncNlpText:Z

    iput-boolean p3, p0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;->isPlayTTS:Z

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 3

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;->isSyncIatText:Z

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;->isSyncNlpText:Z

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;->isPlayTTS:Z

    shl-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-byte v0, v0

    new-array v1, v2, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method
