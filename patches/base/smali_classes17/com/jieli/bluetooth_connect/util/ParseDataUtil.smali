.class public Lcom/jieli/bluetooth_connect/util/ParseDataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ParseDataUtil"

.field private static final mChars:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->mChars:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static hexDataCovetToAddress([B)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p0, :cond_1

    array-length v1, p0

    const/4 v2, 0x6

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    sget-object v2, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->mChars:[C

    aget-byte v3, p0, v1

    and-int/lit16 v3, v3, 0xff

    shr-int/lit8 v3, v3, 0x4

    aget-char v3, v2, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-byte v3, p0, v1

    and-int/lit8 v3, v3, 0xf

    aget-char v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static isFilterBleDevice(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "option",
            "scanData"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_a

    if-eqz p1, :cond_a

    array-length v1, p1

    if-lez v1, :cond_a

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    add-int/lit8 v4, v3, 0x2

    if-gt v4, v1, :cond_a

    aget-byte v5, p1, v3

    invoke-static {v5}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v5

    if-nez v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    if-lt v5, v6, :cond_a

    sub-int v7, v1, v3

    if-ge v5, v7, :cond_a

    add-int/lit8 v7, v3, 0x1

    aget-byte v8, p1, v7

    invoke-static {v8}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v8

    const/16 v9, 0xff

    if-ne v8, v9, :cond_9

    add-int/2addr v7, v5

    if-le v7, v1, :cond_1

    const-string p0, "isFilterBleDevice"

    const-string p1, "totalLen is error."

    const-string v1, "ParseDataUtil"

    invoke-static {v1, p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    add-int/lit8 v1, v5, -0x1

    new-array v3, v1, [B

    invoke-static {p1, v4, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x2

    if-le v1, p1, :cond_a

    new-array v1, p1, [B

    invoke-static {v3, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v4, v1, v6

    aget-byte v1, v1, v2

    invoke-static {v4, v1}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->bytesToInt(BB)I

    move-result v1

    const/4 v4, 0x3

    sub-int/2addr v5, v4

    new-array v7, v5, [B

    invoke-static {v3, p1, v7, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getOtaScanFilterData()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithOTAFlagFilter([BLjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleScanStrategy()I

    move-result v5

    if-eq v5, v6, :cond_6

    if-eq v5, p1, :cond_5

    if-eq v5, v4, :cond_3

    :goto_1
    move v3, p1

    goto :goto_2

    :cond_3
    invoke-static {v4, v7, v3}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseBleScanMsg(I[B[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    :cond_4
    move v3, v4

    goto :goto_2

    :cond_5
    invoke-static {p1, v7, v3}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseBleScanMsg(I[B[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    goto :goto_1

    :cond_6
    invoke-static {v4, v7, v3}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseBleScanMsg(I[B[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-static {p1, v7, v3}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseBleScanMsg(I[B[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    goto :goto_1

    :goto_2
    if-eqz v2, :cond_a

    if-eq v3, p1, :cond_7

    if-eq v3, v4, :cond_8

    goto :goto_3

    :cond_7
    invoke-virtual {v2, v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setVid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getFlagContent()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getScanFilterData()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    :cond_8
    return-object v2

    :cond_9
    add-int/lit8 v5, v5, 0x1

    add-int/2addr v3, v5

    goto/16 :goto_0

    :cond_a
    :goto_3
    return-object v0
.end method

.method private static parseBleScanMsg(I[B[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "filterWay",
            "data",
            "manufacturerData"
        }
    .end annotation

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 p1, 0x3

    if-eq p0, p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithHashFilter([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithFlagFilter([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0
.end method

.method public static parseOTAFlagFilterWithBroad([BLjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "advData",
            "filterFlag"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    array-length v1, p0

    const/4 v2, 0x2

    if-gt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    add-int/lit8 v3, v2, 0x2

    array-length v4, p0

    if-gt v3, v4, :cond_3

    aget-byte v4, p0, v2

    invoke-static {v4}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v4

    if-nez v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    if-lt v4, v5, :cond_3

    add-int/lit8 v5, v2, 0x1

    add-int v6, v5, v4

    array-length v7, p0

    if-ge v6, v7, :cond_3

    aget-byte v5, p0, v5

    invoke-static {v5}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v5

    const/16 v6, 0xff

    if-ne v5, v6, :cond_2

    add-int/lit8 v0, v4, -0x1

    new-array v5, v0, [B

    invoke-static {p0, v3, v5, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v5, p1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithOTAFlagFilter([BLjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    add-int/2addr v2, v4

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0
.end method

.method private static parseTwsADV([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "data",
            "message"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getDeviceType()I

    move-result v1

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_4

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithWatch([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithTwsVer2([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithChargingBin([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseWithTwsVer1([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_0
    return-object v0
.end method

.method private static parseWithChargingBin([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 28
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "data",
            "message"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v5, 0x6

    const/4 v6, 0x1

    const/4 v7, 0x7

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v9

    if-gt v9, v6, :cond_0

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v9

    if-nez v9, :cond_1

    array-length v9, v0

    const/16 v10, 0x1d

    if-eq v9, v10, :cond_1

    :cond_0
    move-object/from16 v16, v8

    goto/16 :goto_7

    :cond_1
    array-length v9, v0

    const/16 v10, 0x10

    if-ge v9, v10, :cond_2

    return-object v8

    :cond_2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    new-array v11, v7, [B

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-array v11, v5, [B

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-static {v11}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    shr-int/lit8 v13, v12, 0x7

    and-int/2addr v13, v6

    shr-int/lit8 v5, v12, 0x6

    and-int/2addr v5, v6

    and-int/lit8 v14, v12, 0xf

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    move-result v15

    shr-int/lit8 v16, v15, 0x7

    move/from16 v17, v7

    and-int/lit8 v7, v16, 0x1

    move-object/from16 v16, v8

    and-int/lit8 v8, v15, 0x7f

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    move-result v18

    shr-int/lit8 v19, v18, 0x7

    move/from16 v20, v6

    and-int/lit8 v6, v19, 0x1

    and-int/lit8 v2, v18, 0x7f

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    move-result v21

    shr-int/lit8 v22, v21, 0x7

    and-int/lit8 v4, v22, 0x1

    and-int/lit8 v10, v21, 0x7f

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    move-result v24

    invoke-static/range {v24 .. v24}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v3

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v24

    if-nez v24, :cond_8

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    move-result v24

    shr-int/lit8 v17, v24, 0x7

    move/from16 v24, v12

    and-int/lit8 v12, v17, 0x1

    move/from16 v25, v12

    move/from16 v17, v15

    const/4 v15, 0x2

    new-array v12, v15, [B

    invoke-virtual {v9, v12}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    const/16 v12, 0x8

    move/from16 v26, v15

    new-array v15, v12, [B

    invoke-virtual {v9, v15}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    const/16 v9, 0x10

    new-array v12, v9, [B

    move/from16 v27, v10

    const/4 v10, 0x0

    invoke-static {v0, v10, v12, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v23, v10

    const/4 v0, 0x4

    new-array v10, v0, [B

    aput-byte v24, v10, v23

    aput-byte v17, v10, v20

    aput-byte v18, v10, v26

    const/16 v17, 0x3

    aput-byte v21, v10, v17

    move/from16 v17, v4

    new-array v4, v9, [B

    invoke-static {v12, v9, v10, v0, v4}, Lcom/jieli/bt/decryption/HashDecryption;->decrypt([BI[BI[B)V

    const/16 v0, 0x8

    new-array v9, v0, [B

    move/from16 v10, v23

    :goto_0
    if-ge v10, v0, :cond_3

    add-int/lit8 v12, v10, 0x1

    add-int v18, v10, v12

    aget-byte v18, v4, v18

    aput-byte v18, v9, v10

    move v10, v12

    goto :goto_0

    :cond_3
    invoke-static {v15, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v1, v11}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setSeq(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setTwsFlag(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setChargingBinStatus(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setAction(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrStatus(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    move/from16 v3, v20

    if-ne v7, v3, :cond_4

    move v4, v3

    goto :goto_1

    :cond_4
    move/from16 v4, v23

    :goto_1
    invoke-virtual {v0, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-ne v6, v3, :cond_5

    move v4, v3

    goto :goto_2

    :cond_5
    move/from16 v4, v23

    :goto_2
    invoke-virtual {v0, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    move/from16 v4, v17

    if-ne v4, v3, :cond_6

    const/4 v4, 0x1

    goto :goto_3

    :cond_6
    move/from16 v4, v23

    :goto_3
    invoke-virtual {v0, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setDeviceCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    move/from16 v10, v27

    invoke-virtual {v0, v10}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setChargingBinQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    move/from16 v2, v25

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setChargingBinMode(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setHash([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    return-object v1

    :cond_7
    return-object v16

    :cond_8
    const/16 v23, 0x0

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v1, v11}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setSeq(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setTwsFlag(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setChargingBinStatus(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setAction(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrStatus(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    const/4 v3, 0x1

    if-ne v7, v3, :cond_9

    move v5, v3

    goto :goto_4

    :cond_9
    move/from16 v5, v23

    :goto_4
    invoke-virtual {v0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-ne v6, v3, :cond_a

    move v5, v3

    goto :goto_5

    :cond_a
    move/from16 v5, v23

    :goto_5
    invoke-virtual {v0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-ne v4, v3, :cond_b

    move v4, v3

    goto :goto_6

    :cond_b
    move/from16 v4, v23

    :goto_6
    invoke-virtual {v0, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setDeviceCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setChargingBinQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    return-object v1

    :goto_7
    return-object v16
.end method

.method private static parseWithFlagFilter([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 12
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_b

    array-length v1, p0

    if-lez v1, :cond_b

    array-length v1, p0

    const/4 v2, 0x0

    move-object v4, v0

    move v3, v2

    :cond_0
    :goto_0
    add-int/lit8 v5, v3, 0x2

    if-gt v5, v1, :cond_a

    aget-byte v6, p0, v3

    invoke-static {v6}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v6

    if-lez v6, :cond_a

    add-int/lit8 v7, v3, 0x1

    aget-byte v7, p0, v7

    invoke-static {v7}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v7

    add-int/lit8 v8, v6, -0x1

    new-array v9, v8, [B

    if-lez v8, :cond_9

    add-int v10, v8, v3

    const/4 v11, 0x2

    add-int/2addr v10, v11

    if-gt v10, v1, :cond_9

    invoke-static {p0, v5, v9, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v3, v6

    if-nez v4, :cond_1

    new-instance v4, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    :cond_1
    if-eqz v7, :cond_8

    const/4 v5, 0x1

    if-eq v7, v5, :cond_7

    if-eq v7, v11, :cond_6

    const/4 v6, 0x3

    if-eq v7, v6, :cond_4

    const/4 v6, 0x4

    if-eq v7, v6, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x6

    if-lt v8, v6, :cond_0

    new-array v7, v6, [B

    invoke-static {v9, v2, v7, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    const/4 v7, 0x7

    if-lt v8, v7, :cond_0

    aget-byte v6, v9, v6

    invoke-static {v6}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrStatus(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    const/16 v6, 0x8

    if-lt v8, v6, :cond_0

    aget-byte v6, v9, v7

    shr-int/lit8 v7, v6, 0x7

    and-int/2addr v7, v5

    and-int/lit8 v6, v6, 0x7f

    if-ne v7, v5, :cond_3

    goto :goto_1

    :cond_3
    move v5, v2

    :goto_1
    invoke-virtual {v4, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-virtual {v4, v6}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    goto :goto_0

    :cond_4
    if-lt v8, v6, :cond_0

    aget-byte v6, v9, v5

    aget-byte v7, v9, v2

    invoke-static {v6, v7}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->bytesToInt(BB)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setPid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    aget-byte v6, v9, v11

    invoke-static {v6}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v6

    if-ne v6, v5, :cond_5

    goto :goto_2

    :cond_5
    move v5, v2

    :goto_2
    invoke-virtual {v4, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setShowDialog(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v4, v9}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setPhoneVirtualAddress([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    goto/16 :goto_0

    :cond_7
    if-ne v8, v5, :cond_0

    aget-byte v5, v9, v2

    invoke-static {v5}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setPairedFlag(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    goto/16 :goto_0

    :cond_8
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v9}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v4, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setFlagContent(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    goto/16 :goto_0

    :cond_9
    return-object v0

    :cond_a
    return-object v4

    :cond_b
    return-object v0
.end method

.method private static parseWithHashFilter([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    if-eqz p0, :cond_0

    array-length v0, p0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [B

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v3, 0x1

    aget-byte v4, v2, v3

    const/4 v5, 0x0

    aget-byte v6, v2, v5

    invoke-static {v4, v6}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->bytesToInt(BB)I

    move-result v4

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    aget-byte v6, v2, v3

    aget-byte v7, v2, v5

    invoke-static {v6, v7}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->bytesToInt(BB)I

    move-result v6

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    aget-byte v7, v2, v3

    aget-byte v2, v2, v5

    invoke-static {v7, v2}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->bytesToInt(BB)I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    shr-int/lit8 v5, v0, 0x4

    and-int/lit16 v5, v5, 0xff

    and-int/lit8 v0, v0, 0xf

    new-instance v7, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {v7}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    invoke-virtual {v7, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setVid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setUid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setPid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setDeviceType(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setVersion(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setShowDialog(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    array-length v2, p0

    if-le v2, v1, :cond_0

    invoke-static {p0, v0}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseTwsADV([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseWithOTAFlagFilter([BLjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "manufacturerData",
            "filterFlag"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_4

    array-length v1, p0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    array-length v2, v2

    add-int/lit8 v2, v2, 0x2

    if-gt v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [B

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->reverseBuf([B)[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "version :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ParseDataUtil"

    const-string v4, "parseWithOTAFlagFilter"

    invoke-static {v3, v4, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x6

    const/4 v5, 0x1

    if-eqz p1, :cond_3

    if-eq p1, v5, :cond_2

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not support version : "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, v4, p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-array v0, v2, [B

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->reverseBuf([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    shr-int/lit8 v6, v4, 0x4

    and-int/lit16 v6, v6, 0xff

    and-int/lit8 v4, v4, 0xf

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    invoke-static {v7}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v7

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v8

    new-array v8, v8, [B

    invoke-virtual {p0, v8}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p0, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    invoke-virtual {p0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOTA(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOtaADVVersion(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOtaBleAddress(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setVid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setUid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setPid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v6}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setDeviceType(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setVersion(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v7}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v8}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOtaADVReserve([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_3
    new-array v0, v2, [B

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->reverseBuf([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p0, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    invoke-virtual {p0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOTA(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setVid(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOtaADVVersion(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOtaBleAddress(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setOtaADVReserve([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    return-object v0
.end method

.method private static parseWithTwsVer1([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 25
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "data",
            "message"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v6, 0x1

    const/4 v7, 0x7

    array-length v8, v0

    const/16 v9, 0x1d

    const/4 v10, 0x0

    if-eq v8, v9, :cond_0

    return-object v10

    :cond_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    new-array v9, v7, [B

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/4 v9, 0x6

    new-array v9, v9, [B

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-static {v9}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->get()B

    move-result v11

    invoke-static {v11}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v12

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    shr-int/lit8 v14, v13, 0x7

    and-int/2addr v14, v6

    and-int/lit8 v15, v13, 0x7f

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->get()B

    move-result v16

    shr-int/lit8 v17, v16, 0x7

    move/from16 v18, v7

    and-int/lit8 v7, v17, 0x1

    move-object/from16 v17, v10

    and-int/lit8 v10, v16, 0x7f

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->get()B

    move-result v19

    shr-int/lit8 v18, v19, 0x7

    and-int/lit8 v2, v18, 0x1

    and-int/lit8 v4, v19, 0x7f

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->get()B

    move-result v20

    invoke-static/range {v20 .. v20}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byteToInt(B)I

    move-result v3

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v5

    if-eq v5, v6, :cond_2

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    const/4 v6, 0x2

    :goto_0
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    :goto_1
    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v6

    move/from16 v23, v11

    const/4 v11, 0x1

    if-eq v6, v11, :cond_4

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v6

    const/4 v11, 0x2

    if-ne v6, v11, :cond_3

    move v6, v11

    goto :goto_2

    :cond_3
    const/4 v6, 0x3

    :goto_2
    new-array v11, v6, [B

    goto :goto_3

    :cond_4
    const/4 v6, 0x2

    goto :goto_2

    :goto_3
    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v6

    const/16 v8, 0x8

    new-array v11, v8, [B

    invoke-virtual {v6, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    const/16 v6, 0x10

    new-array v8, v6, [B

    move/from16 v24, v13

    const/4 v13, 0x0

    invoke-static {v0, v13, v8, v13, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v18, v13

    const/4 v0, 0x4

    new-array v13, v0, [B

    aput-byte v23, v13, v18

    const/4 v0, 0x1

    aput-byte v24, v13, v0

    const/16 v20, 0x2

    aput-byte v16, v13, v20

    const/16 v21, 0x3

    aput-byte v19, v13, v21

    move/from16 v22, v0

    new-array v0, v6, [B

    move/from16 v16, v5

    const/4 v5, 0x4

    invoke-static {v8, v6, v13, v5, v0}, Lcom/jieli/bt/decryption/HashDecryption;->decrypt([BI[BI[B)V

    const/16 v5, 0x8

    new-array v6, v5, [B

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v5, :cond_5

    add-int/lit8 v8, v13, 0x1

    add-int v19, v13, v8

    aget-byte v19, v0, v19

    aput-byte v19, v6, v13

    move v13, v8

    goto :goto_4

    :cond_5
    invoke-static {v11, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v1, v9}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setSeq(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setAction(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrStatus(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    move/from16 v3, v22

    if-ne v14, v3, :cond_6

    move v5, v3

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    invoke-virtual {v0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-ne v7, v3, :cond_7

    move v5, v3

    goto :goto_6

    :cond_7
    const/4 v5, 0x0

    :goto_6
    invoke-virtual {v0, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-ne v2, v3, :cond_8

    move v2, v3

    goto :goto_7

    :cond_8
    const/4 v2, 0x0

    :goto_7
    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setDeviceCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setChargingBinQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setHash([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v0

    if-ne v0, v3, :cond_9

    move/from16 v5, v16

    const/4 v13, 0x0

    invoke-static {v5, v13}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-static {v5, v3}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->checkBitValue(BI)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setSupportChargingCase(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    return-object v1

    :cond_9
    move/from16 v5, v16

    const/4 v13, 0x0

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getVersion()I

    move-result v0

    const/4 v6, 0x2

    if-ne v0, v6, :cond_a

    invoke-static {v5, v13}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->checkBitValue(BI)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setConnectWay(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-static {v5, v3}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->checkBitValue(BI)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setSupportChargingCase(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    :cond_a
    return-object v1

    :cond_b
    return-object v17
.end method

.method private static parseWithTwsVer2([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "data",
            "message"
        }
    .end annotation

    array-length v0, p0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    const/4 v0, 0x7

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    shr-int/lit8 v1, v0, 0x7

    const/4 v2, 0x1

    and-int/2addr v1, v2

    and-int/lit8 v0, v0, 0x7f

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    shr-int/lit8 v4, v3, 0x7

    and-int/2addr v4, v2

    and-int/lit8 v3, v3, 0x7f

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    shr-int/lit8 v5, p0, 0x7

    and-int/2addr v5, v2

    shr-int/lit8 v6, p0, 0x6

    and-int/2addr v6, v2

    shr-int/lit8 v7, p0, 0x5

    and-int/2addr v7, v2

    and-int/lit8 p0, p0, 0xf

    invoke-virtual {p1, v5}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setTwsFlag(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setMainDevFlag(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v5

    const/4 v6, 0x0

    if-ne v7, v2, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v6

    :goto_0
    invoke-virtual {v5, v7}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setAction(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    if-ne v1, v2, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v6

    :goto_1
    invoke-virtual {p0, v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setLeftDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    if-ne v4, v2, :cond_3

    goto :goto_2

    :cond_3
    move v2, v6

    :goto_2
    invoke-virtual {p0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightCharging(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p0

    invoke-virtual {p0, v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRightDeviceQuantity(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    return-object p1
.end method

.method private static parseWithWatch([BLcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "data",
            "message"
        }
    .end annotation

    array-length v0, p0

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x6

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {p0, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    const/16 v0, 0xd

    aget-byte p0, p0, v0

    shr-int/lit8 v0, p0, 0x7

    and-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setConnectWay(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    and-int/lit8 p0, p0, 0xf

    invoke-virtual {p1, p0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setAction(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    return-object p1
.end method

.method private static reverseBuf([B)[B
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    if-eqz p0, :cond_2

    array-length v0, p0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, p0

    new-array v0, v0, [B

    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    array-length v3, p0

    sub-int/2addr v3, v2

    sub-int/2addr v3, v1

    aget-byte v3, p0, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method
