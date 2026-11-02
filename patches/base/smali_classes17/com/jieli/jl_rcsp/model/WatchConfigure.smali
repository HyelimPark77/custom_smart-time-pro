.class public Lcom/jieli/jl_rcsp/model/WatchConfigure;
.super Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;,
        Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;,
        Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;,
        Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;
    }
.end annotation


# instance fields
.field private dialExpandInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

.field private functionOption:Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

.field private necessaryFunc:Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;

.field private sportHealthConfigure:Lcom/jieli/jl_rcsp/model/SportHealthConfigure;

.field private systemSetup:Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;


# direct methods
.method public constructor <init>(I[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;-><init>(II[B)V

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->parsePayload([B)I

    return-void
.end method

.method private getDataBlock([BLcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;)V
    .locals 8

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    iget v0, p2, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->offset:I

    const/4 v1, 0x2

    new-array v2, v1, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    add-int/lit8 v5, v0, 0x2

    array-length v6, p1

    if-gt v5, v6, :cond_2

    invoke-static {p1, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x1

    aget-byte v6, v2, v0

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArrayBig(B)[B

    move-result-object v6

    add-int/2addr v4, v1

    array-length v7, v6

    sub-int/2addr v7, v0

    aget-byte v0, v6, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v5

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_1
    if-lez v4, :cond_3

    new-array v0, v4, [B

    iget v1, p2, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->offset:I

    invoke-static {p1, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p2, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->data:[B

    return-void

    :cond_3
    new-array p1, v3, [B

    iput-object p1, p2, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->data:[B

    :cond_4
    :goto_2
    return-void
.end method

.method private parseData(I[B)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_7

    if-eqz p2, :cond_6

    array-length v0, p2

    const/16 v1, 0x8

    if-lt v0, v1, :cond_6

    new-instance v0, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;-><init>(Lcom/jieli/jl_rcsp/model/WatchConfigure$1;)V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x3

    if-ge v2, v4, :cond_4

    iput v3, v0, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->offset:I

    invoke-direct {p0, p2, v0}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->getDataBlock([BLcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;)V

    iget-object v3, v0, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->data:[B

    array-length v4, v3

    if-eqz v4, :cond_3

    if-eqz v2, :cond_2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    invoke-direct {v4, p1, v3}, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;-><init>(I[B)V

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->functionOption:Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    goto :goto_1

    :cond_1
    new-instance v4, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;

    invoke-direct {v4, p1, v3}, Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;-><init>(I[B)V

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->systemSetup:Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;

    goto :goto_1

    :cond_2
    new-instance v4, Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;

    invoke-direct {v4, p1, v3}, Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;-><init>(I[B)V

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->necessaryFunc:Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;

    :goto_1
    iget v3, v0, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->offset:I

    iget-object v4, v0, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->data:[B

    array-length v4, v4

    add-int/2addr v3, v4

    iput v3, v0, Lcom/jieli/jl_rcsp/model/WatchConfigure$DataBlock;->offset:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Data exception : not found block"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 v0, v3, 0x2

    array-length v2, p2

    if-ge v0, v2, :cond_5

    array-length v0, p2

    sub-int/2addr v0, v3

    new-array v2, v0, [B

    invoke-static {p2, v3, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v0

    new-instance p2, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;

    invoke-direct {p2, p1, v2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure;-><init>(I[B)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->sportHealthConfigure:Lcom/jieli/jl_rcsp/model/SportHealthConfigure;

    :cond_5
    return v3

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported version :  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public getDialExpandInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->dialExpandInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    return-object v0
.end method

.method public getFunctionOption()Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->functionOption:Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    return-object v0
.end method

.method public getNecessaryFunc()Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->necessaryFunc:Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;

    return-object v0
.end method

.method public getSportHealthConfigure()Lcom/jieli/jl_rcsp/model/SportHealthConfigure;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->sportHealthConfigure:Lcom/jieli/jl_rcsp/model/SportHealthConfigure;

    return-object v0
.end method

.method public getSystemSetup()Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->systemSetup:Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;

    return-object v0
.end method

.method public parsePayload([B)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getVersion()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->parseData(I[B)I

    move-result p1

    return p1
.end method

.method public setDialExpandInfo(Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;)Lcom/jieli/jl_rcsp/model/WatchConfigure;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->dialExpandInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchConfigure{version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getData()[B

    move-result-object v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", necessaryFunc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->necessaryFunc:Lcom/jieli/jl_rcsp/model/WatchConfigure$NecessaryFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", systemSetup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->systemSetup:Lcom/jieli/jl_rcsp/model/WatchConfigure$SystemSetup;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", functionOption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->functionOption:Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sportHealthConfigure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->sportHealthConfigure:Lcom/jieli/jl_rcsp/model/SportHealthConfigure;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dialExpandInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/WatchConfigure;->dialExpandInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
