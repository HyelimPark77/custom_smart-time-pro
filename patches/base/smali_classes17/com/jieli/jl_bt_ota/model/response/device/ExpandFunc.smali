.class public Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private banEq:Z

.field private isGameMode:Z

.field private isSupportMD5:Z

.field private isSupportSearchDevice:Z

.field private supportAdaptiveANC:Z

.field private supportAnc:Z

.field private supportDevConfigure:Z

.field private supportDoubleConnection:Z

.field private supportExternalFlashTransfer:Z

.field private supportHearingAssist:Z

.field private supportReadErrorMSg:Z

.field private supportSceneDenoising:Z

.field private supportSmartNoPick:Z

.field private supportSoundCard:Z

.field private supportVocalBooster:Z

.field private supportWindNoiseDetection:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isBanEq()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->banEq:Z

    return v0
.end method

.method public isGameMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isGameMode:Z

    return v0
.end method

.method public isSupportAdaptiveANC()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAdaptiveANC:Z

    return v0
.end method

.method public isSupportAnc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAnc:Z

    return v0
.end method

.method public isSupportDevConfigure()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDevConfigure:Z

    return v0
.end method

.method public isSupportDoubleConnection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDoubleConnection:Z

    return v0
.end method

.method public isSupportExternalFlashTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportExternalFlashTransfer:Z

    return v0
.end method

.method public isSupportHearingAssist()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportHearingAssist:Z

    return v0
.end method

.method public isSupportMD5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportMD5:Z

    return v0
.end method

.method public isSupportReadErrorMSg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportReadErrorMSg:Z

    return v0
.end method

.method public isSupportSceneDenoising()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSceneDenoising:Z

    return v0
.end method

.method public isSupportSearchDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSearchDevice:Z

    return v0
.end method

.method public isSupportSmartNoPick()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSmartNoPick:Z

    return v0
.end method

.method public isSupportSoundCard()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSoundCard:Z

    return v0
.end method

.method public isSupportVocalBooster()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportVocalBooster:Z

    return v0
.end method

.method public isSupportWindNoiseDetection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportWindNoiseDetection:Z

    return v0
.end method

.method public parse([B)I
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v1, p1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportMD5(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setGameMode(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    const/4 v3, 0x2

    invoke-static {v1, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v4

    invoke-virtual {p0, v4}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportSearchDevice(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    const/4 v4, 0x3

    invoke-static {v1, v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v5

    invoke-virtual {p0, v5}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportSoundCard(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    const/4 v5, 0x4

    invoke-static {v1, v5}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v6

    invoke-virtual {p0, v6}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setBanEq(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    const/4 v6, 0x5

    invoke-static {v1, v6}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v7

    invoke-virtual {p0, v7}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportExternalFlashTransfer(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    const/4 v7, 0x6

    invoke-static {v1, v7}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v8

    invoke-virtual {p0, v8}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportAnc(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    const/4 v8, 0x7

    invoke-static {v1, v8}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportReadErrorMSg(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportHearingAssist(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportAdaptiveANC(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportDevConfigure(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportSmartNoPick(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v5}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportSceneDenoising(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v6}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportWindNoiseDetection(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v7}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportVocalBooster(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-static {v1, v8}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->setSupportDoubleConnection(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public setBanEq(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->banEq:Z

    return-object p0
.end method

.method public setGameMode(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isGameMode:Z

    return-object p0
.end method

.method public setSupportAdaptiveANC(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAdaptiveANC:Z

    return-object p0
.end method

.method public setSupportAnc(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAnc:Z

    return-object p0
.end method

.method public setSupportDevConfigure(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDevConfigure:Z

    return-object p0
.end method

.method public setSupportDoubleConnection(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDoubleConnection:Z

    return-object p0
.end method

.method public setSupportExternalFlashTransfer(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportExternalFlashTransfer:Z

    return-object p0
.end method

.method public setSupportHearingAssist(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportHearingAssist:Z

    return-object p0
.end method

.method public setSupportMD5(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportMD5:Z

    return-object p0
.end method

.method public setSupportReadErrorMSg(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportReadErrorMSg:Z

    return-object p0
.end method

.method public setSupportSceneDenoising(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSceneDenoising:Z

    return-object p0
.end method

.method public setSupportSearchDevice(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSearchDevice:Z

    return-object p0
.end method

.method public setSupportSmartNoPick(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSmartNoPick:Z

    return-object p0
.end method

.method public setSupportSoundCard(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSoundCard:Z

    return-object p0
.end method

.method public setSupportVocalBooster(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportVocalBooster:Z

    return-object p0
.end method

.method public setSupportWindNoiseDetection(Z)Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportWindNoiseDetection:Z

    return-object p0
.end method

.method public toData()[B
    .locals 11

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportMD5:Z

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isGameMode:Z

    const/4 v4, 0x1

    invoke-static {v1, v4, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSearchDevice:Z

    const/4 v5, 0x2

    invoke-static {v1, v5, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSoundCard:Z

    const/4 v6, 0x3

    invoke-static {v1, v6, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->banEq:Z

    const/4 v7, 0x4

    invoke-static {v1, v7, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportExternalFlashTransfer:Z

    const/4 v8, 0x5

    invoke-static {v1, v8, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAnc:Z

    const/4 v9, 0x6

    invoke-static {v1, v9, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportReadErrorMSg:Z

    const/4 v10, 0x7

    invoke-static {v1, v10, v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportHearingAssist:Z

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAdaptiveANC:Z

    invoke-static {v1, v4, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDevConfigure:Z

    invoke-static {v1, v5, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSmartNoPick:Z

    invoke-static {v1, v6, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSceneDenoising:Z

    invoke-static {v1, v7, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportWindNoiseDetection:Z

    invoke-static {v1, v8, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportVocalBooster:Z

    invoke-static {v1, v9, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDoubleConnection:Z

    invoke-static {v1, v10, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExpandFunc{isSupportMD5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportMD5:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isGameMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isGameMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportSearchDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSearchDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportSoundCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportSoundCard:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", banEq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->banEq:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportExternalFlashTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportExternalFlashTransfer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportAnc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAnc:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportReadErrorMSg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportReadErrorMSg:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportHearingAssist="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportHearingAssist:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportAdaptiveANC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportAdaptiveANC:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportDevConfigure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->supportDevConfigure:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
