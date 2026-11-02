.class public Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private delayMs:I

.field private mtu:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x14

    .line 1
    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x32

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/16 v0, 0x14

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->mtu:I

    const/16 v0, 0x32

    .line 5
    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->delayMs:I

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->setMtu(I)Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

    .line 7
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->setDelayMs(I)Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

    return-void
.end method


# virtual methods
.method public getDelayMs()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->delayMs:I

    return v0
.end method

.method public getMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->mtu:I

    return v0
.end method

.method public setDelayMs(I)Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->delayMs:I

    return-object p0
.end method

.method public setMtu(I)Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;
    .locals 0

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatBleMtu(I)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->mtu:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetLowLatencySettingsResponse{mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->mtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delayMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;->delayMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
