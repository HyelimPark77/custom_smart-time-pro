.class public Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private final deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getData()[B

    move-result-object v0

    return-object v0
.end method

.method public getDeviceConfiguration()Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    return-object v0
.end method

.method public getProductFlag()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getType()I

    move-result v0

    return v0
.end method

.method public getVersion()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getVersion()I

    move-result v0

    return v0
.end method

.method public parseData([B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->parse([B)I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{deviceConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->deviceConfiguration:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
