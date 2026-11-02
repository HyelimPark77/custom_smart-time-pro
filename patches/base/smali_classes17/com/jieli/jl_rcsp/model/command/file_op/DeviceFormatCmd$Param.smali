.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private devHandle:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;->devHandle:I

    return-void
.end method


# virtual methods
.method public getDevHandle()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;->devHandle:I

    return v0
.end method

.method public getParamData()[B
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;->devHandle:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v0

    return-object v0
.end method

.method public setDevHandle(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;->devHandle:I

    return-void
.end method
