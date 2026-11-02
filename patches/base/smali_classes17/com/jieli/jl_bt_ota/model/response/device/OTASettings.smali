.class public Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private isNeedBootLoader:Z

.field private isSupportDoubleBackup:Z

.field private isSupportReuseSpaceOTA:Z

.field private singleBackupOtaWay:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSingleBackupOtaWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->singleBackupOtaWay:I

    return v0
.end method

.method public isNeedBootLoader()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isNeedBootLoader:Z

    return v0
.end method

.method public isSupportDoubleBackup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportDoubleBackup:Z

    return v0
.end method

.method public isSupportReuseSpaceOTA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportReuseSpaceOTA:Z

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    array-length v1, p1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    if-ne v1, v2, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->setSupportDoubleBackup(Z)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    invoke-virtual {p0, v2}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->setNeedBootLoader(Z)V

    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->setSingleBackupOtaWay(I)V

    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->setSupportReuseSpaceOTA(Z)V

    :cond_5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_6
    :goto_2
    return v0
.end method

.method public setNeedBootLoader(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isNeedBootLoader:Z

    return-void
.end method

.method public setSingleBackupOtaWay(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->singleBackupOtaWay:I

    return-void
.end method

.method public setSupportDoubleBackup(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportDoubleBackup:Z

    return-void
.end method

.method public setSupportReuseSpaceOTA(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportReuseSpaceOTA:Z

    return-void
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportDoubleBackup:Z

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isNeedBootLoader:Z

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->singleBackupOtaWay:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportReuseSpaceOTA:Z

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OTASettings{isSupportDoubleBackup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportDoubleBackup:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isNeedBootLoader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isNeedBootLoader:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", singleBackupOtaWay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->singleBackupOtaWay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportReuseSpaceOTA="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportReuseSpaceOTA:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
