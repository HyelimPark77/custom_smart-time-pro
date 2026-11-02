.class public Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private blockSize:I

.field private cluster:I

.field private fatSize:I

.field private flashSize:I

.field private matchVersions:[Ljava/lang/String;

.field private receiveMtu:I

.field private screenHeight:I

.field private screenWidth:I

.field private sysStatus:I

.field private system:I

.field private watchVersionCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBlockSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->blockSize:I

    return v0
.end method

.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->cluster:I

    return v0
.end method

.method public getFatSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->fatSize:I

    return v0
.end method

.method public getFlashSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->flashSize:I

    return v0
.end method

.method public getMatchVersions()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->matchVersions:[Ljava/lang/String;

    return-object v0
.end method

.method public getReceiveMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->receiveMtu:I

    return v0
.end method

.method public getScreenHeight()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->screenHeight:I

    return v0
.end method

.method public getScreenWidth()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->screenWidth:I

    return v0
.end method

.method public getSysStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->sysStatus:I

    return v0
.end method

.method public getSystem()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->system:I

    return v0
.end method

.method public getWatchVersionCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->watchVersionCode:I

    return v0
.end method

.method public setBlockSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->blockSize:I

    return-object p0
.end method

.method public setCluster(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->cluster:I

    return-object p0
.end method

.method public setFatSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->fatSize:I

    return-object p0
.end method

.method public setFlashSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->flashSize:I

    return-object p0
.end method

.method public setMatchVersions([Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->matchVersions:[Ljava/lang/String;

    return-object p0
.end method

.method public setReceiveMtu(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->receiveMtu:I

    return-object p0
.end method

.method public setScreenHeight(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->screenHeight:I

    return-object p0
.end method

.method public setScreenWidth(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->screenWidth:I

    return-object p0
.end method

.method public setSysStatus(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->sysStatus:I

    return-object p0
.end method

.method public setSystem(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->system:I

    return-object p0
.end method

.method public setWatchVersionCode(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->watchVersionCode:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalFlashMsgResponse{flashSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->flashSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", system="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->system:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", blockSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->blockSize:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", sysStatus="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->sysStatus:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", cluster="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->cluster:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", fatSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->fatSize:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", matchVersions="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->matchVersions:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", watchVersionCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->watchVersionCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->blockSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiveMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->receiveMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", screenWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->screenWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", screenHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->screenHeight:I

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
