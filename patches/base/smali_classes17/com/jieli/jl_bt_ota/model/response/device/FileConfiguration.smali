.class public Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private getFileByNameWithDev:Z

.field private isSupportSmallFileTransfer:Z

.field private supportPackageCrc16:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isGetFileByNameWithDev()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->getFileByNameWithDev:Z

    return v0
.end method

.method public isSupportPackageCrc16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->supportPackageCrc16:Z

    return v0
.end method

.method public isSupportSmallFileTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->isSupportSmallFileTransfer:Z

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    array-length v1, p1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    aget-byte p1, p1, v0

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->setSupportPackageCrc16(Z)Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->setGetFileByNameWithDev(Z)Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->setSupportSmallFileTransfer(Z)Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;

    return v2

    :cond_1
    :goto_0
    return v0
.end method

.method public setGetFileByNameWithDev(Z)Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->getFileByNameWithDev:Z

    return-object p0
.end method

.method public setSupportPackageCrc16(Z)Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->supportPackageCrc16:Z

    return-object p0
.end method

.method public setSupportSmallFileTransfer(Z)Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->isSupportSmallFileTransfer:Z

    return-object p0
.end method

.method public toData()[B
    .locals 6

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [B

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->supportPackageCrc16:Z

    const/4 v3, 0x0

    invoke-static {v3, v3, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v2

    iget-boolean v4, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->getFileByNameWithDev:Z

    const/4 v5, 0x1

    invoke-static {v2, v5, v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v2

    iget-boolean v4, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->isSupportSmallFileTransfer:Z

    const/4 v5, 0x2

    invoke-static {v2, v5, v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v2

    aput-byte v2, v1, v3

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FileConfiguration{supportPackageCrc16="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->supportPackageCrc16:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", getFileByNameWithDev="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->getFileByNameWithDev:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportSmallFileTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FileConfiguration;->isSupportSmallFileTransfer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
