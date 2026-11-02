.class public Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INDEX_FLASH:I = 0x3

.field public static final INDEX_FLASH2:I = 0x5

.field public static final INDEX_FLASH3:I = 0x6

.field public static final INDEX_LINE_IN:I = 0x4

.field public static final INDEX_SD0:I = 0x1

.field public static final INDEX_SD1:I = 0x2

.field public static final INDEX_USB:I = 0x0

.field private static final TAG:Ljava/lang/String; = "DevStorageInfo"

.field private static final TYPE_REUSE_STORAGE:I = 0x2

.field private static final TYPE_STORAGE_INFO:I = 0x1


# instance fields
.field private isStorageReuse:Z

.field private final storageStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DevStorageState;",
            ">;"
        }
    .end annotation
.end field

.field private version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    return-void
.end method

.method private parseNewVersion([B)V
    .locals 4

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    array-length v1, p1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    goto :goto_0

    :cond_1
    aget-byte v1, p1, v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->setVersion(I)Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    array-length v1, p1

    const/4 v2, 0x2

    if-gt v1, v2, :cond_2

    goto :goto_0

    :cond_2
    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->version:I

    if-nez p1, :cond_3

    invoke-direct {p0, v3}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->parseV0([B)V

    :cond_3
    :goto_0
    return-void
.end method

.method private parseStorageInfo([B)V
    .locals 9

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    const/4 v2, 0x1

    move v3, v0

    move v4, v2

    :goto_0
    const/4 v5, 0x6

    if-ge v3, v5, :cond_2

    new-instance v5, Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    invoke-direct {v5}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;-><init>()V

    invoke-virtual {v5, v3}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->setIndex(I)Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    move-result-object v5

    invoke-static {v1, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v6

    invoke-virtual {v5, v6}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->setOnline(Z)Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    const/4 v6, 0x4

    if-ne v3, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v4, 0x4

    array-length v8, p1

    if-le v7, v8, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v4, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    invoke-virtual {v5, v4}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->setHandle(I)Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v7

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    array-length v1, p1

    add-int/lit8 v3, v4, 0x1

    if-lt v1, v3, :cond_4

    aget-byte p1, p1, v4

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    if-ne p1, v2, :cond_3

    move v0, v2

    :cond_3
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->setStorageReuse(Z)Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    :cond_4
    return-void
.end method

.method private parseV0([B)V
    .locals 8

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->parseLTVData([B)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/LtvBean;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getData()[B

    move-result-object v1

    if-eqz v1, :cond_0

    array-length v2, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_4

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    goto :goto_0

    :cond_2
    aget-byte v0, v1, v3

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    if-ne v0, v2, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    invoke-virtual {p0, v2}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->setStorageReuse(Z)Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    goto :goto_0

    :cond_4
    move v0, v3

    :goto_2
    array-length v2, v1

    if-ge v0, v2, :cond_0

    array-length v2, v1

    sub-int/2addr v2, v0

    new-array v4, v2, [B

    invoke-static {v1, v0, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;-><init>()V

    invoke-virtual {v2, v4}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->parseData([B)I

    move-result v4

    sget-object v5, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "size : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "parseV0"

    invoke-static {v5, v7, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    iget-object v5, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, v4

    goto :goto_2

    :cond_6
    return-void
.end method


# virtual methods
.method public getStorageStates()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DevStorageState;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->version:I

    return v0
.end method

.method public isStorageReuse()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->isStorageReuse:Z

    return v0
.end method

.method public parseData([B)V
    .locals 2

    if-eqz p1, :cond_2

    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->parseNewVersion([B)V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->parseStorageInfo([B)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setStorageReuse(Z)Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->isStorageReuse:Z

    return-object p0
.end method

.method public setVersion(I)Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->version:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DevStorageInfo{storageStates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->storageStates:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isStorageReuse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->isStorageReuse:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
