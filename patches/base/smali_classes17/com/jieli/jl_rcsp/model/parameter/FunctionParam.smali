.class public Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private cmd:B

.field private extend:[B

.field private function:B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method

.method public constructor <init>(BB)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 2
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->function:B

    .line 3
    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->cmd:B

    return-void
.end method


# virtual methods
.method public getCmd()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->cmd:B

    return v0
.end method

.method public getExtend()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->extend:[B

    return-object v0
.end method

.method public getFunction()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->function:B

    return v0
.end method

.method public getParamData()[B
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->extend:[B

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_1

    array-length v4, v0

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    array-length v4, v0

    add-int/2addr v4, v3

    new-array v4, v4, [B

    iget-byte v5, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->function:B

    aput-byte v5, v4, v2

    iget-byte v5, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->cmd:B

    aput-byte v5, v4, v1

    array-length v1, v0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v4

    :cond_1
    :goto_0
    new-array v0, v3, [B

    iget-byte v3, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->function:B

    aput-byte v3, v0, v2

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->cmd:B

    aput-byte v2, v0, v1

    return-object v0
.end method

.method public setCmd(B)Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->cmd:B

    return-object p0
.end method

.method public setExtend([B)Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->extend:[B

    return-object p0
.end method

.method public setFunction(B)Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->function:B

    return-object p0
.end method
