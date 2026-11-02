.class public Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;
.super Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Weather"
.end annotation


# instance fields
.field private city:Ljava/lang/String;

.field private humidity:B

.field private province:Ljava/lang/String;

.field private temperature:B

.field private time:J

.field private weather:B

.field private windDirection:B

.field private windPower:B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;BBBBBJ)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;-><init>(BB)V

    .line 3
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->province:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->city:Ljava/lang/String;

    .line 5
    iput-byte p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->weather:B

    .line 6
    iput-byte p4, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->temperature:B

    .line 7
    iput-byte p5, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->humidity:B

    .line 8
    iput-byte p6, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windDirection:B

    .line 9
    iput-byte p7, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windPower:B

    .line 10
    iput-wide p8, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->time:J

    .line 11
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->beanToData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->setMessageData([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;-><init>([B)V

    return-void
.end method

.method private beanToData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->province:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->province:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->city:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v2, v1

    :goto_2
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-lez v2, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->city:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    :cond_3
    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->weather:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->temperature:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->humidity:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windDirection:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windPower:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-wide v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->time:J

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->time2Int(J)I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getHumidity()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->humidity:B

    return v0
.end method

.method public getMessageType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getProvince()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->province:Ljava/lang/String;

    return-object v0
.end method

.method public getTemperature()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->temperature:B

    return v0
.end method

.method public getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->time:J

    return-wide v0
.end method

.method public getWeather()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->weather:B

    return v0
.end method

.method public getWindDirection()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windDirection:B

    return v0
.end method

.method public getWindPower()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windPower:B

    return v0
.end method

.method public parse([B)I
    .locals 5

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;->getMessageData()[B

    move-result-object v0

    if-eqz v0, :cond_b

    array-length v1, v0

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    array-length v1, v0

    const/16 v2, 0xb

    if-ge v1, v2, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 v1, 0x0

    aget-byte v1, v0, v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    array-length v3, v0

    if-le v2, v3, :cond_3

    goto :goto_0

    :cond_3
    :try_start_0
    new-instance v3, Ljava/lang/String;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4, v1}, Ljava/lang/String;-><init>([BII)V

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->province:Ljava/lang/String;

    aget-byte v1, v0, v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    add-int v3, v2, v1

    array-length v4, v0

    if-le v3, v4, :cond_4

    goto :goto_0

    :cond_4
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0, v2, v1}, Ljava/lang/String;-><init>([BII)V

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->city:Ljava/lang/String;

    add-int/lit8 v1, v3, 0x1

    array-length v2, v0

    if-le v1, v2, :cond_5

    goto :goto_0

    :cond_5
    aget-byte v2, v0, v3

    iput-byte v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->weather:B

    add-int/lit8 v2, v3, 0x2

    array-length v4, v0

    if-le v2, v4, :cond_6

    goto :goto_0

    :cond_6
    aget-byte v1, v0, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->temperature:B

    add-int/lit8 v1, v3, 0x3

    array-length v4, v0

    if-le v1, v4, :cond_7

    goto :goto_0

    :cond_7
    aget-byte v2, v0, v2

    iput-byte v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->humidity:B

    add-int/lit8 v2, v3, 0x4

    array-length v4, v0

    if-le v2, v4, :cond_8

    goto :goto_0

    :cond_8
    aget-byte v1, v0, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windDirection:B

    add-int/lit8 v1, v3, 0x5

    array-length v4, v0

    if-le v1, v4, :cond_9

    goto :goto_0

    :cond_9
    aget-byte v2, v0, v2

    iput-byte v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windPower:B

    add-int/lit8 v3, v3, 0x9

    array-length v2, v0

    if-le v3, v2, :cond_a

    goto :goto_0

    :cond_a
    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->intToTime(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->time:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_b
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Weather{province="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->province:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", city="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->city:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weather="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->weather:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", temperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->temperature:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", humidity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->humidity:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", windDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windDirection:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", windPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->windPower:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;->time:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
