.class public Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private emitterStatus:I

.field private emitterSupport:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEmitterStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterStatus:I

    return v0
.end method

.method public isEmitterSupport()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterSupport:Z

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v1, p1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    aget-byte p1, p1, v0

    and-int/lit8 v1, p1, 0xf

    if-ne v1, v2, :cond_1

    move v0, v2

    :cond_1
    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->setEmitterSupport(Z)Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;

    move-result-object v0

    shr-int/lit8 p1, p1, 0x4

    and-int/lit8 p1, p1, 0xf

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->setEmitterStatus(I)Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;

    return v2

    :cond_2
    :goto_0
    return v0
.end method

.method public setEmitterStatus(I)Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterStatus:I

    return-object p0
.end method

.method public setEmitterSupport(Z)Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterSupport:Z

    return-object p0
.end method

.method public toData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterStatus:I

    shl-int/lit8 v0, v0, 0x4

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterSupport:Z

    or-int/2addr v0, v1

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToByte(I)B

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransmitterInfo{emitterSupport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterSupport:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", emitterStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/TransmitterInfo;->emitterStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
