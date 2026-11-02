.class public Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private final cluster:I

.field private final devHandle:I

.field private final last:Z

.field private final type:B


# direct methods
.method public constructor <init>(IBIZ)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->devHandle:I

    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->type:B

    iput p3, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->cluster:I

    iput-boolean p4, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->last:Z

    return-void
.end method


# virtual methods
.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->cluster:I

    return v0
.end method

.method public getDevHandle()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->devHandle:I

    return v0
.end method

.method public getParamData()[B
    .locals 5

    const/16 v0, 0xa

    new-array v0, v0, [B

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->last:Z

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->devHandle:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x4

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->type:B

    const/4 v3, 0x5

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->cluster:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->type:B

    return v0
.end method

.method public isLast()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;->last:Z

    return v0
.end method
