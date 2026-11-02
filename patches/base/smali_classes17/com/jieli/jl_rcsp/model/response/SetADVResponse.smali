.class public Lcom/jieli/jl_rcsp/model/response/SetADVResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private result:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/response/SetADVResponse;->setResult(I)Lcom/jieli/jl_rcsp/model/response/SetADVResponse;

    return-void
.end method


# virtual methods
.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/SetADVResponse;->result:I

    return v0
.end method

.method public setResult(I)Lcom/jieli/jl_rcsp/model/response/SetADVResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/SetADVResponse;->result:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SetADVResponse{result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/SetADVResponse;->result:I

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
