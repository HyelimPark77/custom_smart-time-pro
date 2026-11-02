.class public Lcom/jieli/jl_rcsp/model/base/BaseError;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private code:I

.field private message:Ljava/lang/String;

.field private opCode:I

.field private subCode:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    const-string v1, ""

    invoke-direct {p0, v0, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(IILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->code:I

    .line 6
    iput p2, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->subCode:I

    .line 7
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->message:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->code:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getOpCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->opCode:I

    return v0
.end method

.method public getSubCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->subCode:I

    return v0
.end method

.method public setCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->code:I

    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->message:Ljava/lang/String;

    return-object p0
.end method

.method public setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->opCode:I

    return-object p0
.end method

.method public setSubCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->subCode:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BaseError{code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", subCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->subCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", opCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->opCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/base/BaseError;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
