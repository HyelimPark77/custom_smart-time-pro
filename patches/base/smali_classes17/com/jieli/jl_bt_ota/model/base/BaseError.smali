.class public Lcom/jieli/jl_bt_ota/model/base/BaseError;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cmdSn:I

.field private final code:I

.field private final message:Ljava/lang/String;

.field private opCode:I

.field private final subCode:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->opCode:I

    .line 4
    iput v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->cmdSn:I

    .line 5
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->code:I

    .line 6
    iput p2, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->subCode:I

    .line 7
    iput-object p3, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->message:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p1, p2}, Lcom/jieli/jl_bt_ota/model/base/BaseError;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCmdSn()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->cmdSn:I

    return v0
.end method

.method public getCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->code:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getOpCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->opCode:I

    return v0
.end method

.method public getSubCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->subCode:I

    return v0
.end method

.method public setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->cmdSn:I

    return-object p0
.end method

.method public setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->opCode:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BaseError{subCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->subCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", opCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->opCode:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cmdSn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/BaseError;->cmdSn:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
