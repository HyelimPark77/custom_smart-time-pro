.class public Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private freq:B

.field private type:B

.field private way:B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method

.method public constructor <init>(BB)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;-><init>(BBB)V

    return-void
.end method

.method public constructor <init>(BBB)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 4
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->type:B

    .line 5
    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->freq:B

    .line 6
    iput-byte p3, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->way:B

    return-void
.end method


# virtual methods
.method public getFreq()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->freq:B

    return v0
.end method

.method public getParamData()[B
    .locals 5

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->type:B

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->freq:B

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->way:B

    const/4 v3, 0x3

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte v0, v3, v4

    const/4 v0, 0x1

    aput-byte v1, v3, v0

    const/4 v0, 0x2

    aput-byte v2, v3, v0

    return-object v3
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->type:B

    return v0
.end method

.method public getWay()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->way:B

    return v0
.end method

.method public setFreq(B)Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->freq:B

    return-object p0
.end method

.method public setType(B)Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->type:B

    return-object p0
.end method

.method public setWay(B)Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->way:B

    return-object p0
.end method
