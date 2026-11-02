.class public Lcom/jieli/jl_rcsp/model/device/AlarmBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bellCluster:I

.field private bellName:Ljava/lang/String;

.field private bellType:B

.field private devIndex:B

.field private hour:B

.field private index:B

.field private min:B

.field private name:Ljava/lang/String;

.field private open:Z

.field private repeatMode:B

.field private reserved:Ljava/lang/String;

.field private version:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static toAttrbean(Lcom/jieli/jl_rcsp/model/device/AlarmBean;Z)Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->toAttrbean(Ljava/util/List;Z)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object p0

    return-object p0
.end method

.method public static toAttrbean(Ljava/util/List;Z)Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            ">;Z)",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;"
        }
    .end annotation

    .line 4
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    add-int/2addr p1, v2

    new-array p1, p1, [B

    .line 7
    aput-byte v1, p1, v3

    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, p1, v1

    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    add-int/lit8 v3, v2, 0x1

    .line 10
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getIndex()B

    move-result v1

    aput-byte v1, p1, v2

    move v2, v3

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    .line 13
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getIndex()B

    move-result v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->isOpen()Z

    move-result v6

    int-to-byte v6, v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getRepeatMode()B

    move-result v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getHour()B

    move-result v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getMin()B

    move-result v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    .line 19
    array-length v7, v6

    int-to-byte v7, v7

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    array-length v7, v6

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_2

    aget-byte v9, v6, v8

    .line 21
    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v9

    invoke-interface {p1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 22
    :cond_2
    iget v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->version:I

    if-ne v6, v1, :cond_1

    .line 23
    iget-byte v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellType:B

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    iget-byte v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->devIndex:B

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    iget v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    shr-int/lit8 v6, v6, 0x18

    int-to-byte v6, v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    iget v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    shr-int/lit8 v6, v6, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    iget v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    shr-int/lit8 v6, v6, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    iget v6, v5, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getBellName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    .line 30
    array-length v6, v5

    int-to-byte v6, v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    array-length v6, v5

    move v7, v3

    :goto_2
    if-ge v7, v6, :cond_1

    aget-byte v8, v5, v7

    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    .line 32
    invoke-interface {p1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 33
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v4, v2

    new-array v2, v4, [B

    .line 34
    aput-byte v3, v2, v3

    .line 35
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    int-to-byte p0, p0

    aput-byte p0, v2, v1

    .line 36
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-ge v3, p0, :cond_4

    add-int/lit8 p0, v3, 0x2

    .line 37
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    aput-byte v1, v2, p0

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    move-object p1, v2

    .line 38
    :cond_5
    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    return-object v0
.end method


# virtual methods
.method public copy()Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getIndex()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getHour()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setHour(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getMin()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setMin(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getRepeatMode()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setRepeatMode(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setReserved(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellType:B

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellType(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellCluster(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->version:I

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setVersion(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->devIndex:B

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setDevIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->isOpen()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setOpen(Z)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    return-object v0
.end method

.method public getBellCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    return v0
.end method

.method public getBellName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellName:Ljava/lang/String;

    return-object v0
.end method

.method public getBellType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellType:B

    return v0
.end method

.method public getDevIndex()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->devIndex:B

    return v0
.end method

.method public getHour()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->hour:B

    return v0
.end method

.method public getIndex()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->index:B

    return v0
.end method

.method public getMin()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->min:B

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->name:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public getRepeatMode()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->repeatMode:B

    return v0
.end method

.method public getReserved()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->reserved:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->version:I

    return v0
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->open:Z

    return v0
.end method

.method public setBellCluster(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    return-object p0
.end method

.method public setBellName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellName:Ljava/lang/String;

    return-object p0
.end method

.method public setBellType(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellType:B

    return-object p0
.end method

.method public setDevIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->devIndex:B

    return-object p0
.end method

.method public setHour(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->hour:B

    return-object p0
.end method

.method public setIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->index:B

    return-object p0
.end method

.method public setMin(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->min:B

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->name:Ljava/lang/String;

    return-object p0
.end method

.method public setOpen(Z)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->open:Z

    return-object p0
.end method

.method public setRepeatMode(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->repeatMode:B

    return-object p0
.end method

.method public setReserved(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->reserved:Ljava/lang/String;

    return-object p0
.end method

.method public setVersion(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->version:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AlarmBean{index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->index:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", hour="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->hour:B

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", min="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->min:B

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", repeatMode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->repeatMode:B

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", reserved=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->reserved:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", open="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->open:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", bellType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellType:B

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", bellCluster="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellCluster:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", bellName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->bellName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", devIndex=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->devIndex:B

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", version=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->version:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
