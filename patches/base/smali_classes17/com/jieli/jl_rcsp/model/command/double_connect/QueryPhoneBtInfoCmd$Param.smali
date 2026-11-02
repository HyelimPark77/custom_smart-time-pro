.class public Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private deviceBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceBtInfo()Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;->deviceBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;

    return-object v0
.end method

.method public getParamData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;->deviceBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->toData()[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public parseData([B)I
    .locals 1

    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;-><init>()V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->parseData([B)I

    move-result p1

    if-lez p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;->setDeviceBtInfo(Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;)Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public setDeviceBtInfo(Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;)Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;->deviceBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;

    return-object p0
.end method
