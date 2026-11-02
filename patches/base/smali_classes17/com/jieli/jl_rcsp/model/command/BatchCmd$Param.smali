.class public Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/BatchCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private final op:B

.field private final param:[B


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;->op:B

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;->param:[B

    return-void
.end method


# virtual methods
.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;->op:B

    return v0
.end method

.method public getParam()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;->param:[B

    return-object v0
.end method

.method public getParamData()[B
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;->param:[B

    array-length v1, v0

    const/4 v2, 0x2

    add-int/2addr v1, v2

    new-array v1, v1, [B

    iget-byte v3, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;->op:B

    const/4 v4, 0x0

    aput-byte v3, v1, v4

    array-length v3, v0

    int-to-byte v3, v3

    const/4 v5, 0x1

    aput-byte v3, v1, v5

    array-length v3, v0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method
