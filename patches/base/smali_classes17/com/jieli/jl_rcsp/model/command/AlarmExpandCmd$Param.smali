.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private final data:[B

.field private final op:B


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;->op:B

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;->data:[B

    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;->data:[B

    return-object v0
.end method

.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;->op:B

    return v0
.end method

.method public getParamData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;->data:[B

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    array-length v2, v0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    new-array v3, v3, [B

    iget-byte v4, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;->op:B

    aput-byte v4, v3, v1

    if-eqz v0, :cond_1

    const/4 v4, 0x1

    invoke-static {v0, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    return-object v3
.end method
