.class public Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# instance fields
.field private number:Ljava/lang/String;

.field private phoneLen:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 4

    if-eqz p1, :cond_1

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->phoneLen:I

    array-length v1, p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->phoneLen:I

    array-length v1, p1

    add-int/lit8 v3, v0, 0x1

    if-lt v1, v3, :cond_1

    :try_start_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, v2, v0}, Ljava/lang/String;-><init>([BII)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->number:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method private toData()[B
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->number:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->number:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v2, v0

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->number:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->phoneLen:I

    return v0
.end method

.method public getType()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public setNumber(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->number:Ljava/lang/String;

    return-object p0
.end method

.method public setPhoneLen(I)Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->phoneLen:I

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EmergencyContact{phoneLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->phoneLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", number=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;->number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
