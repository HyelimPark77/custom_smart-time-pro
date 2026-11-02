.class public Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# static fields
.field public static final SEX_MAN:I = 0x1

.field public static final SEX_WOMAN:I


# instance fields
.field private birthDay:B

.field private birthMonth:B

.field private birthYear:I

.field private height:S

.field private sex:B

.field private weight:S


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 3

    if-eqz p1, :cond_6

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    aget-byte v0, p1, v2

    const/4 v2, 0x1

    aget-byte v2, p1, v2

    invoke-static {v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v0

    iput-short v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->height:S

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    array-length v0, p1

    add-int/lit8 v2, v1, 0x2

    if-lt v0, v2, :cond_2

    aget-byte v0, p1, v1

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p1, v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v0

    iput-short v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->weight:S

    move v1, v2

    :cond_2
    array-length v0, p1

    add-int/lit8 v2, v1, 0x2

    if-lt v0, v2, :cond_3

    aget-byte v0, p1, v1

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p1, v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthYear:I

    move v1, v2

    :cond_3
    array-length v0, p1

    add-int/lit8 v2, v1, 0x1

    if-lt v0, v2, :cond_4

    aget-byte v0, p1, v1

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthMonth:B

    move v1, v2

    :cond_4
    array-length v0, p1

    add-int/lit8 v2, v1, 0x1

    if-lt v0, v2, :cond_5

    aget-byte v0, p1, v1

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthDay:B

    move v1, v2

    :cond_5
    array-length v0, p1

    add-int/lit8 v2, v1, 0x1

    if-lt v0, v2, :cond_6

    aget-byte p1, p1, v1

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->sex:B

    :cond_6
    :goto_1
    return-void
.end method

.method private toData()[B
    .locals 2

    const/16 v0, 0x9

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->height:S

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->weight:S

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthYear:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthMonth:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthDay:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->sex:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getBirthDay()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthDay:B

    return v0
.end method

.method public getBirthMonth()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthMonth:B

    return v0
.end method

.method public getBirthYear()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthYear:I

    return v0
.end method

.method public getHeight()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->height:S

    return v0
.end method

.method public getSex()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->sex:B

    return v0
.end method

.method public getType()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public getWeight()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->weight:S

    return v0
.end method

.method public setBirthDay(B)Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthDay:B

    return-object p0
.end method

.method public setBirthMonth(B)Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthMonth:B

    return-object p0
.end method

.method public setBirthYear(I)Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthYear:I

    return-object p0
.end method

.method public setHeight(S)Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->height:S

    return-object p0
.end method

.method public setSex(B)Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->sex:B

    return-object p0
.end method

.method public setWeight(S)Lcom/jieli/jl_rcsp/model/device/health/UserInfo;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->weight:S

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserInfo{height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->height:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->weight:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", year="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", month="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthMonth:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", day="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->birthDay:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;->sex:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
