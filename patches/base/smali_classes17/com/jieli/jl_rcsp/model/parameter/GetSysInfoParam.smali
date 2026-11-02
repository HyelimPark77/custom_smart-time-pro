.class public Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private function:B

.field private mask:I


# direct methods
.method public constructor <init>(BI)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p2, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->mask:I

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->function:B

    return-void
.end method


# virtual methods
.method public getFunction()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->function:B

    return v0
.end method

.method public getMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->mask:I

    return v0
.end method

.method public getParamData()[B
    .locals 5

    const/4 v0, 0x5

    new-array v0, v0, [B

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->function:B

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->mask:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x4

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public setFunction(B)Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->function:B

    return-object p0
.end method

.method public setMask(I)Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->mask:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetSysInfoParam{function="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->function:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;->mask:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
