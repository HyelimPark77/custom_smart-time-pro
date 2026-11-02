.class public Lcom/jieli/jl_rcsp/model/device/health/FallDetection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# static fields
.field public static final MODE_BRIGHT:B = 0x0t

.field public static final MODE_CALL:B = 0x2t

.field public static final MODE_SHAKE:B = 0x1t


# instance fields
.field private contact:Ljava/lang/String;

.field private enable:Z

.field private mode:B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 4

    if-eqz p1, :cond_4

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->enable:Z

    array-length v1, p1

    const/4 v3, 0x2

    if-lt v1, v3, :cond_2

    aget-byte v1, p1, v2

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->mode:B

    move v2, v3

    :cond_2
    const-string v1, ""

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    array-length v1, p1

    add-int/lit8 v3, v2, 0x1

    if-lt v1, v3, :cond_3

    aget-byte v0, p1, v2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    array-length v1, p1

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    move v2, v3

    :cond_3
    if-lez v0, :cond_4

    array-length v1, p1

    add-int v3, v2, v0

    if-lt v1, v3, :cond_4

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, v2, v0}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    :cond_4
    :goto_1
    return-void
.end method

.method private toData()[B
    .locals 6

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->enable:Z

    int-to-byte v1, v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->mode:B

    const/4 v3, 0x2

    new-array v4, v3, [B

    const/4 v5, 0x0

    aput-byte v1, v4, v5

    const/4 v1, 0x1

    aput-byte v2, v4, v1

    :try_start_0
    invoke-virtual {v0, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->mode:B

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    :try_start_1
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getContact()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->mode:B

    return v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public isEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->enable:Z

    return v0
.end method

.method public setContact(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/health/FallDetection;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    return-object p0
.end method

.method public setEnable(Z)Lcom/jieli/jl_rcsp/model/device/health/FallDetection;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->enable:Z

    return-object p0
.end method

.method public setMode(B)Lcom/jieli/jl_rcsp/model/device/health/FallDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->mode:B

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FallDetection{contact=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->contact:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", enable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->enable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;->mode:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
