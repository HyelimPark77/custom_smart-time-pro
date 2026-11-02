.class public Lcom/jieli/jl_bt_ota/model/response/device/OTAState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# static fields
.field public static final EXPAND_MODE_NONE:I = 0x0

.field public static final EXPAND_MODE_REUSE_SPACE_OTA_ONLY_CODE:I = 0x3

.field public static final EXPAND_MODE_REUSE_SPACE_OTA_ONLY_RESOURCE:I = 0x2

.field public static final EXPAND_MODE_UPDATE_RESOURCE:I = 0x1


# instance fields
.field private expandMode:I

.field private mandatoryUpgradeFlag:I

.field private requestOtaFlag:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getExpandMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->expandMode:I

    return v0
.end method

.method public getMandatoryUpgradeFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->mandatoryUpgradeFlag:I

    return v0
.end method

.method public getRequestOtaFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->requestOtaFlag:I

    return v0
.end method

.method public parse([B)I
    .locals 2

    if-eqz p1, :cond_3

    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->mandatoryUpgradeFlag:I

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->requestOtaFlag:I

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->expandMode:I

    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public setExpandMode(I)Lcom/jieli/jl_bt_ota/model/response/device/OTAState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->expandMode:I

    return-object p0
.end method

.method public setMandatoryUpgradeFlag(I)Lcom/jieli/jl_bt_ota/model/response/device/OTAState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->mandatoryUpgradeFlag:I

    return-object p0
.end method

.method public setRequestOtaFlag(I)Lcom/jieli/jl_bt_ota/model/response/device/OTAState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->requestOtaFlag:I

    return-object p0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->mandatoryUpgradeFlag:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->requestOtaFlag:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->expandMode:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OTAState{mandatoryUpgradeFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->mandatoryUpgradeFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", requestOtaFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->requestOtaFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", expandMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->expandMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
