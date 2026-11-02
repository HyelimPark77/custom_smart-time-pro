.class public Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private isPlayTTS:Z

.field private isSyncIatText:Z

.field private isSyncNlpText:Z

.field private reason:B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncIatText:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncNlpText:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isPlayTTS:Z

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 5

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncIatText:Z

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncNlpText:Z

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isPlayTTS:Z

    const/4 v3, 0x2

    shl-int/2addr v1, v3

    add-int/2addr v0, v1

    int-to-byte v0, v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->reason:B

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte v1, v3, v4

    aput-byte v0, v3, v2

    return-object v3
.end method

.method public getReason()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->reason:B

    return v0
.end method

.method public isPlayTTS()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isPlayTTS:Z

    return v0
.end method

.method public isSyncIatText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncIatText:Z

    return v0
.end method

.method public isSyncNlpText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncNlpText:Z

    return v0
.end method

.method public setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isPlayTTS:Z

    return-object p0
.end method

.method public setReason(B)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->reason:B

    return-object p0
.end method

.method public setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncIatText:Z

    return-object p0
.end method

.method public setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncNlpText:Z

    return-object p0
.end method
