.class public Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private edrAddr:Ljava/lang/String;

.field private edrProfile:I

.field private edrStatus:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrProfile:I

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrStatus:I

    return-void
.end method


# virtual methods
.method public getEdrAddr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrAddr:Ljava/lang/String;

    return-object v0
.end method

.method public getEdrProfile()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrProfile:I

    return v0
.end method

.method public getEdrStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrStatus:I

    return v0
.end method

.method public parse([B)I
    .locals 2

    if-eqz p1, :cond_1

    array-length v0, p1

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/4 v0, 0x6

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->setEdrProfile(I)Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->setEdrStatus(I)Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public setEdrAddr(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrAddr:Ljava/lang/String;

    return-object p0
.end method

.method public setEdrProfile(I)Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrProfile:I

    return-object p0
.end method

.method public setEdrStatus(I)Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrStatus:I

    return-object p0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrAddr:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrAddr:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->addressCovertToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrProfile:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrStatus:I

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

    const-string v1, "ClassicBtInfo{edrAddr=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrAddr:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", edrProfile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrProfile:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", edrStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->edrStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
