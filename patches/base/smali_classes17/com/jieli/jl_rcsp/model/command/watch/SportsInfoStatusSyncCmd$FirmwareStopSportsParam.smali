.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;
.super Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FirmwareStopSportsParam"
.end annotation


# instance fields
.field public fileId:S

.field public fileSize:I

.field public restoreTime:I

.field public stopTime:I

.field public strengthIntervalTimer:[B


# direct methods
.method public constructor <init>(IISI[B)V
    .locals 2

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->convertData(IISI[B)[B

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;-><init>(B[B)V

    .line 2
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->stopTime:I

    .line 3
    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->restoreTime:I

    .line 4
    iput-short p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileId:S

    .line 5
    iput p4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileSize:I

    .line 6
    iput-object p5, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->strengthIntervalTimer:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;-><init>([B)V

    return-void
.end method

.method private static convertData(IISI[B)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    if-eqz p4, :cond_0

    array-length p0, p4

    if-lez p0, :cond_0

    invoke-virtual {v0, p4}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getFileId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileId:S

    return v0
.end method

.method public getFileSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileSize:I

    return v0
.end method

.method public getParamType()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getRestoreTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->restoreTime:I

    return v0
.end method

.method public getStopTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->stopTime:I

    return v0
.end method

.method public getStrengthIntervalTimer()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->strengthIntervalTimer:[B

    return-object v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->strengthIntervalTimer:[B

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getData()[B

    move-result-object v1

    if-eqz v1, :cond_3

    array-length v2, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    array-length v2, v1

    const/16 v3, 0xc

    if-ge v2, v3, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 v2, 0x4

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    iput v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->stopTime:I

    invoke-static {v1, v2, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->restoreTime:I

    const/16 v2, 0x8

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort([BI)S

    move-result v2

    iput-short v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileId:S

    const/16 v2, 0xa

    const/4 v4, 0x2

    invoke-static {v1, v2, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileSize:I

    array-length v2, v1

    if-ge v3, v2, :cond_3

    array-length v2, v1

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->strengthIntervalTimer:[B

    invoke-static {v1, v3, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    :goto_0
    return p1
.end method
