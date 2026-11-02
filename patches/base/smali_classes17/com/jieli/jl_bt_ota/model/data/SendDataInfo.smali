.class public Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
.super Lcom/jieli/jl_bt_ota/model/data/DataInfo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
        "+",
        "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
        "+",
        "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
        ">;>",
        "Lcom/jieli/jl_bt_ota/model/data/DataInfo;"
    }
.end annotation


# instance fields
.field private final callback:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TC;>;"
        }
    .end annotation
.end field

.field private final cmdType:I

.field private command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field

.field private final device:Landroid/bluetooth/BluetoothDevice;

.field private deviceReceiveMtu:I

.field private isSend:Z

.field private reSendCount:I

.field private reSendMax:I

.field private sendTime:J

.field private timeoutMs:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/model/base/CommandBase;ILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "ITC;I",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TC;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/model/data/DataInfo;-><init>(I)V

    const/16 v0, 0x212

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->deviceReceiveMtu:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendMax:I

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    iput p4, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->timeoutMs:I

    iput-object p5, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->callback:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    iget v2, p1, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p1, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public getBasePacket()Lcom/jieli/jl_bt_ota/model/base/BasePacket;
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    invoke-static {v0, v1}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->convert2BasePacket(Lcom/jieli/jl_bt_ota/model/base/CommandBase;I)Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    move-result-object v0

    return-object v0
.end method

.method public getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TC;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->callback:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    return-object v0
.end method

.method public getCmdType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    return v0
.end method

.method public getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    return-object v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getDeviceReceiveMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->deviceReceiveMtu:I

    return v0
.end method

.method public getOpCode()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    if-nez v0, :cond_0

    const v0, 0x7fffffff

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v0

    return v0
.end method

.method public getReSendCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendCount:I

    return v0
.end method

.method public getReSendMax()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendMax:I

    return v0
.end method

.method public getSendData()[B
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getBasePacket()Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [B

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->packSendBasePacket(Lcom/jieli/jl_bt_ota/model/base/BasePacket;)[B

    move-result-object v0

    if-nez v0, :cond_1

    new-array v0, v1, [B

    :cond_1
    return-object v0
.end method

.method public getSendTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->sendTime:J

    return-wide v0
.end method

.method public getSn()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result v0

    return v0
.end method

.method public getTimeoutMs()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->timeoutMs:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isSend()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->isSend:Z

    return v0
.end method

.method public setCommand(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "**>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    return-void
.end method

.method public setDeviceReceiveMtu(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->deviceReceiveMtu:I

    return-object p0
.end method

.method public setReSendCount(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendCount:I

    return-object p0
.end method

.method public setReSendMax(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendMax:I

    return-object p0
.end method

.method public setSend(Z)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->isSend:Z

    return-object p0
.end method

.method public setSendTime(J)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->sendTime:J

    return-object p0
.end method

.method public setTimeoutMs(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->timeoutMs:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendDataInfo{device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n cmdType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->cmdType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", command="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->command:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n timeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->timeoutMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->callback:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceReceiveMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->deviceReceiveMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reSendMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendMax:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reSendCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->reSendCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->isSend:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sendTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->sendTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
