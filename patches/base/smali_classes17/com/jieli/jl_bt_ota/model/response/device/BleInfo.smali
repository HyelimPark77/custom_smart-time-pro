.class public Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private bleAddr:Ljava/lang/String;

.field private bleOnly:Z

.field private isBLEToSppWay:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBleAddr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleAddr:Ljava/lang/String;

    return-object v0
.end method

.method public isBLEToSppWay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->isBLEToSppWay:Z

    return v0
.end method

.method public isBleOnly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleOnly:Z

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    const/4 v2, 0x7

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    invoke-virtual {p0, v2}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->setBleOnly(Z)Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    const/4 v1, 0x6

    new-array v1, v1, [B

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->setBleAddr(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->setBLEToSppWay(Z)Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_3
    :goto_1
    return v0
.end method

.method public setBLEToSppWay(Z)Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->isBLEToSppWay:Z

    return-object p0
.end method

.method public setBleAddr(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleAddr:Ljava/lang/String;

    return-object p0
.end method

.method public setBleOnly(Z)Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleOnly:Z

    return-object p0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleAddr:Ljava/lang/String;

    invoke-static {v1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleOnly:Z

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleAddr:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->addressCovertToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->isBLEToSppWay:Z

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleInfo{bleOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleOnly:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bleAddr=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->bleAddr:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", isBLEToSppWay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->isBLEToSppWay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
