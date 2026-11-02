.class public Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private mask:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;->mask:I

    return-void
.end method


# virtual methods
.method public getMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;->mask:I

    return v0
.end method

.method public getParamData()[B
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;->mask:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v0

    return-object v0
.end method

.method public setMask(I)Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;->mask:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetADVInfoParam{mask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;->mask:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
