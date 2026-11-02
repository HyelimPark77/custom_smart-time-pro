.class public Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private env:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;->env:B

    return-void
.end method


# virtual methods
.method public getEnv()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;->env:B

    return v0
.end method

.method public getParamData()[B
    .locals 3

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;->env:B

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public setEnv(B)V
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;->env:B

    return-void
.end method
