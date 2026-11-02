.class public Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private crc16:S

.field private data:[B

.field private filePath:Ljava/lang/String;

.field private result:I

.field private size:I

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->setResult(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    return-void
.end method


# virtual methods
.method public getCrc16()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->crc16:S

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->data:[B

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->result:I

    return v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->size:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setCrc16(S)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->crc16:S

    return-object p0
.end method

.method public setData([B)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->data:[B

    return-object p0
.end method

.method public setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->filePath:Ljava/lang/String;

    return-object p0
.end method

.method public setResult(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->result:I

    return-object p0
.end method

.method public setSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->size:I

    return-object p0
.end method

.method public setVersion(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->version:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalFlashIOCtrlResponse{result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->result:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", filePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", version=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->version:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", crc16="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->crc16:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
