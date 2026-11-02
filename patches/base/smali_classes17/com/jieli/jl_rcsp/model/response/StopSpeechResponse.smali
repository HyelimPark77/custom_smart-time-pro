.class public Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private isPlayTTS:Z

.field private isSyncIatText:Z

.field private isSyncNlpText:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncIatText:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncNlpText:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isPlayTTS:Z

    return-void
.end method


# virtual methods
.method public isPlayTTS()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isPlayTTS:Z

    return v0
.end method

.method public isSyncIatText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncIatText:Z

    return v0
.end method

.method public isSyncNlpText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncNlpText:Z

    return v0
.end method

.method public setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isPlayTTS:Z

    return-object p0
.end method

.method public setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncIatText:Z

    return-object p0
.end method

.method public setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncNlpText:Z

    return-object p0
.end method
