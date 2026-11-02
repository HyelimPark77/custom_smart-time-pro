.class public Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;
.super Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NotifyParam"
.end annotation


# instance fields
.field private final connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;-><init>()V

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    return-void
.end method


# virtual methods
.method public getConnectedBtInfo()Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    return-object v0
.end method

.method public getParamData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public parseData([B)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->parseConnectedDeviceBtData([B)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotifyParam{connectedBtInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
