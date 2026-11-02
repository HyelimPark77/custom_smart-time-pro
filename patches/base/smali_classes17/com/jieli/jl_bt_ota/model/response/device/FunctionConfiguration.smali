.class public Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private curFunction:I

.field private functionMask:I

.field private hideNetRadio:Z

.field private supportOfflineShow:Z

.field private supportSd0:Z

.field private supportSd1:Z

.field private supportUsb:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportUsb:Z

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd0:Z

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd1:Z

    return-void
.end method


# virtual methods
.method public getCurFunction()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->curFunction:I

    return v0
.end method

.method public getFunctionMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->functionMask:I

    return v0
.end method

.method public isHideNetRadio()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->hideNetRadio:Z

    return v0
.end method

.method public isSupportOfflineShow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportOfflineShow:Z

    return v0
.end method

.method public isSupportSd0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd0:Z

    return v0
.end method

.method public isSupportSd1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd1:Z

    return v0
.end method

.method public isSupportUsb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportUsb:Z

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v1, p1

    const/4 v2, 0x5

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setFunctionMask(I)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setCurFunction(I)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setSupportOfflineShow(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setSupportUsb(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setSupportSd0(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setSupportSd1(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    move-result-object v0

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBitValue(BI)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setHideNetRadio(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public setCurFunction(I)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->curFunction:I

    return-object p0
.end method

.method public setFunctionMask(I)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->functionMask:I

    return-object p0
.end method

.method public setHideNetRadio(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->hideNetRadio:Z

    return-object p0
.end method

.method public setSupportOfflineShow(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportOfflineShow:Z

    return-object p0
.end method

.method public setSupportSd0(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd0:Z

    return-object p0
.end method

.method public setSupportSd1(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd1:Z

    return-object p0
.end method

.method public setSupportUsb(Z)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportUsb:Z

    return-object p0
.end method

.method public toData()[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->functionMask:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->curFunction:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportOfflineShow:Z

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportUsb:Z

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd0:Z

    const/4 v3, 0x2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd1:Z

    const/4 v3, 0x3

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->hideNetRadio:Z

    const/4 v3, 0x4

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
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

    const-string v1, "FunctionConfiguration{functionMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->functionMask:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", curFunction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->curFunction:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportOfflineShow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportOfflineShow:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportUsb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportUsb:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportSd0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd0:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportSd1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->supportSd1:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hideNetRadio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->hideNetRadio:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
