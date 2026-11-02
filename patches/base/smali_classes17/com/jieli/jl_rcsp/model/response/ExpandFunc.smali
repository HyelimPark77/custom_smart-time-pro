.class public Lcom/jieli/jl_rcsp/model/response/ExpandFunc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private banEq:Z

.field private isGameMode:Z

.field private isSupportMD5:Z

.field private isSupportSearchDevice:Z

.field private rawData:[B

.field private supportAdaptiveANC:Z

.field private supportAnc:Z

.field private supportDevConfigure:Z

.field private supportExternalFlashTransfer:Z

.field private supportHearingAssist:Z

.field private supportReadErrorMSg:Z

.field private supportSoundCard:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRawData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->rawData:[B

    return-object v0
.end method

.method public isBanEq()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->banEq:Z

    return v0
.end method

.method public isGameMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isGameMode:Z

    return v0
.end method

.method public isSupportAdaptiveANC()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportAdaptiveANC:Z

    return v0
.end method

.method public isSupportAnc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportAnc:Z

    return v0
.end method

.method public isSupportDevConfigure()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportDevConfigure:Z

    return v0
.end method

.method public isSupportExternalFlashTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportExternalFlashTransfer:Z

    return v0
.end method

.method public isSupportHearingAssist()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportHearingAssist:Z

    return v0
.end method

.method public isSupportMD5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportMD5:Z

    return v0
.end method

.method public isSupportReadErrorMSg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportReadErrorMSg:Z

    return v0
.end method

.method public isSupportSearchDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportSearchDevice:Z

    return v0
.end method

.method public isSupportSoundCard()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportSoundCard:Z

    return v0
.end method

.method public parseData([B)V
    .locals 4

    if-eqz p1, :cond_c

    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto/16 :goto_b

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setRawData([B)V

    const/4 v0, 0x0

    aget-byte v2, p1, v0

    and-int/lit8 v3, v2, 0x1

    if-ne v3, v1, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportMD5(Z)V

    shr-int/lit8 v3, v2, 0x1

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setGameMode(Z)V

    shr-int/lit8 v3, v2, 0x2

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_3

    move v3, v1

    goto :goto_2

    :cond_3
    move v3, v0

    :goto_2
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportSearchDevice(Z)V

    shr-int/lit8 v3, v2, 0x3

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_4

    move v3, v1

    goto :goto_3

    :cond_4
    move v3, v0

    :goto_3
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportSoundCard(Z)V

    shr-int/lit8 v3, v2, 0x4

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_5

    move v3, v1

    goto :goto_4

    :cond_5
    move v3, v0

    :goto_4
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setBanEq(Z)V

    shr-int/lit8 v3, v2, 0x5

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_6

    move v3, v1

    goto :goto_5

    :cond_6
    move v3, v0

    :goto_5
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportExternalFlashTransfer(Z)V

    shr-int/lit8 v3, v2, 0x6

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_7

    move v3, v1

    goto :goto_6

    :cond_7
    move v3, v0

    :goto_6
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportAnc(Z)V

    shr-int/lit8 v2, v2, 0x7

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_8

    move v2, v1

    goto :goto_7

    :cond_8
    move v2, v0

    :goto_7
    invoke-virtual {p0, v2}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportReadErrorMSg(Z)V

    array-length v2, p1

    const/4 v3, 0x2

    if-lt v2, v3, :cond_c

    aget-byte p1, p1, v1

    and-int/lit8 v2, p1, 0x1

    if-ne v2, v1, :cond_9

    move v2, v1

    goto :goto_8

    :cond_9
    move v2, v0

    :goto_8
    invoke-virtual {p0, v2}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportHearingAssist(Z)V

    shr-int/lit8 v2, p1, 0x1

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_a

    move v2, v1

    goto :goto_9

    :cond_a
    move v2, v0

    :goto_9
    invoke-virtual {p0, v2}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportAdaptiveANC(Z)V

    shr-int/2addr p1, v3

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_b

    goto :goto_a

    :cond_b
    move v1, v0

    :goto_a
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->setSupportDevConfigure(Z)V

    :cond_c
    :goto_b
    return-void
.end method

.method public setBanEq(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->banEq:Z

    return-void
.end method

.method public setGameMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isGameMode:Z

    return-void
.end method

.method public setRawData([B)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->rawData:[B

    return-void
.end method

.method public setSupportAdaptiveANC(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportAdaptiveANC:Z

    return-void
.end method

.method public setSupportAnc(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportAnc:Z

    return-void
.end method

.method public setSupportDevConfigure(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportDevConfigure:Z

    return-void
.end method

.method public setSupportExternalFlashTransfer(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportExternalFlashTransfer:Z

    return-void
.end method

.method public setSupportHearingAssist(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportHearingAssist:Z

    return-void
.end method

.method public setSupportMD5(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportMD5:Z

    return-void
.end method

.method public setSupportReadErrorMSg(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportReadErrorMSg:Z

    return-void
.end method

.method public setSupportSearchDevice(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportSearchDevice:Z

    return-void
.end method

.method public setSupportSoundCard(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportSoundCard:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExpandFunc{rawData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->rawData:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportMD5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportMD5:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isGameMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isGameMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportSearchDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportSearchDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportSoundCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportSoundCard:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", banEq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->banEq:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportExternalFlashTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportExternalFlashTransfer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportAnc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportAnc:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportReadErrorMSg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportReadErrorMSg:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportHearingAssist="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportHearingAssist:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportAdaptiveANC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportAdaptiveANC:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportDevConfigure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->supportDevConfigure:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
