.class public Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;
.super Lcom/jieli/jl_bt_ota/model/data/DataInfo;
.source "SourceFile"


# instance fields
.field private final data:[B

.field private final device:Landroid/bluetooth/BluetoothDevice;

.field private deviceSendMtu:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/model/data/DataInfo;-><init>(I)V

    const/16 v0, 0x212

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->deviceSendMtu:I

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->data:[B

    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->data:[B

    return-object v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getDeviceSendMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->deviceSendMtu:I

    return v0
.end method

.method public setDeviceSendMtu(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->deviceSendMtu:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceivedDataInfo{device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceSendMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->deviceSendMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
