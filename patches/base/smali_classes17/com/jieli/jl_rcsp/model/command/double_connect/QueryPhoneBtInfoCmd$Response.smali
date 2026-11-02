.class public Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private final connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    return-void
.end method


# virtual methods
.method public getConnectedBtInfo()Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    return-object v0
.end method

.method public parseData([B)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;->connectedBtInfo:Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->parseConnectedDeviceBtData([B)I

    move-result p1

    return p1
.end method
