.class public Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;
.super Lcom/jieli/jl_bt_ota/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private mask:I

.field private platform:B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->mask:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->setPlatform(B)Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;

    return-void
.end method


# virtual methods
.method public getMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->mask:I

    return v0
.end method

.method public getParamData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->mask:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-byte v1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->platform:B

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

.method public getPlatform()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->platform:B

    return v0
.end method

.method public setMask(I)Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->mask:I

    return-object p0
.end method

.method public setPlatform(B)Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->platform:B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetTargetInfoParam{mask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->mask:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", platform="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_bt_ota/model/parameter/GetTargetInfoParam;->platform:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
