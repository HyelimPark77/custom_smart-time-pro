.class public Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;
.super Lcom/jieli/jl_bt_ota/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private op:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;->op:I

    return-void
.end method


# virtual methods
.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;->op:I

    int-to-byte v0, v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public setOp(I)Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;->op:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SetDeviceNotifyAdvInfoParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/parameter/tws/SetDeviceNotifyAdvInfoParam;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
