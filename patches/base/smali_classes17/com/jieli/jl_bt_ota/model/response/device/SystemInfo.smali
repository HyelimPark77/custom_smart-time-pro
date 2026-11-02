.class public Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private lowPowerLimit:I

.field private maxVol:I

.field private quantity:I

.field private supportVolumeSync:Z

.field private volume:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->supportVolumeSync:Z

    const/16 v0, 0x1e

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->lowPowerLimit:I

    return-void
.end method


# virtual methods
.method public getLowPowerLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->lowPowerLimit:I

    return v0
.end method

.method public getMaxVol()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->maxVol:I

    return v0
.end method

.method public getQuantity()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->quantity:I

    return v0
.end method

.method public getVolume()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->volume:I

    return v0
.end method

.method public isSupportVolumeSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->supportVolumeSync:Z

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->quantity:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->volume:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->maxVol:I

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->supportVolumeSync:Z

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->lowPowerLimit:I

    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public setLowPowerLimit(I)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->lowPowerLimit:I

    return-object p0
.end method

.method public setMaxVol(I)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->maxVol:I

    return-object p0
.end method

.method public setQuantity(I)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->quantity:I

    return-object p0
.end method

.method public setSupportVolumeSync(Z)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->supportVolumeSync:Z

    return-object p0
.end method

.method public setVolume(I)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->volume:I

    return-object p0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->quantity:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->volume:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->maxVol:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->supportVolumeSync:Z

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->lowPowerLimit:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SystemInfo{quantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->quantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->volume:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxVol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->maxVol:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportVolumeSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->supportVolumeSync:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lowPowerLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->lowPowerLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
