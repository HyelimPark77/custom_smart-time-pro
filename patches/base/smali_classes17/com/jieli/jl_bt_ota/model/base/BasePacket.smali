.class public Lcom/jieli/jl_bt_ota/model/base/BasePacket;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FALG_HAVE_RESPONSE:I = 0x1

.field public static final FALG_NO_RESPONSE:I = 0x0

.field public static final TYPE_COMMAND:I = 0x1

.field public static final TYPE_RESPONSE:I


# instance fields
.field private hasResponse:I

.field private opCode:I

.field private opCodeSn:I

.field private paramData:[B

.field private paramLen:I

.field private status:I

.field private type:I

.field private unused:I

.field private xmOpCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    iget v2, p1, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCode:I

    iget v2, p1, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCode:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    iget p1, p1, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public getHasResponse()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->hasResponse:I

    return v0
.end method

.method public getOpCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCode:I

    return v0
.end method

.method public getOpCodeSn()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    return v0
.end method

.method public getParamData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->paramData:[B

    return-object v0
.end method

.method public getParamLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->paramLen:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->status:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    return v0
.end method

.method public getUnused()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->unused:I

    return v0
.end method

.method public getXmOpCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->xmOpCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isCommand()Z
    .locals 2

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setHasResponse(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->hasResponse:I

    return-object p0
.end method

.method public setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCode:I

    return-object p0
.end method

.method public setOpCodeSn(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    return-object p0
.end method

.method public setParamData([B)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->paramData:[B

    return-object p0
.end method

.method public setParamLen(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->paramLen:I

    return-object p0
.end method

.method public setStatus(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->status:I

    return-object p0
.end method

.method public setType(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    return-object p0
.end method

.method public setXmOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->xmOpCode:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BasePacket{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hasResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->hasResponse:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unused="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->unused:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", opCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCode:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paramLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->paramLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", opCodeSn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->opCodeSn:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", xmOpCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->xmOpCode:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\nparamData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->paramData:[B

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
