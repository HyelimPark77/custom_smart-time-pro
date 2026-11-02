.class public Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "ParseHelper"

.field public static final b:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->b:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p0

    return p0
.end method

.method public static a([B)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 2
    array-length v1, p0

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    array-length v2, p0

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    .line 5
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x2

    invoke-static {p0, v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return v0
.end method

.method public static b([B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-array v2, v1, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p0

    if-ge v4, v5, :cond_0

    add-int/lit8 v5, v4, 0x3

    array-length v6, p0

    if-gt v5, v6, :cond_0

    invoke-static {p0, v4, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v4, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;

    invoke-direct {v4}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;-><init>()V

    aget-byte v6, v2, v3

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;->setKeyNum(I)V

    const/4 v6, 0x1

    aget-byte v6, v2, v6

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;->setAction(I)V

    const/4 v6, 0x2

    aget-byte v6, v2, v6

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;->setFunction(I)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v5

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c([B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    array-length v1, p0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    new-array v1, v2, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p0

    if-ge v4, v5, :cond_1

    add-int/lit8 v5, v4, 0x2

    array-length v6, p0

    if-gt v5, v6, :cond_1

    invoke-static {p0, v4, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v4, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;

    invoke-direct {v4}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;-><init>()V

    aget-byte v6, v1, v3

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->setScene(I)V

    const/4 v6, 0x1

    aget-byte v6, v1, v6

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->setEffect(I)V

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v5

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static convert2BasePacket(Lcom/jieli/jl_rcsp/model/base/CommandBase;I)Lcom/jieli/jl_rcsp/model/base/BasePacket;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getType()I

    move-result v3

    const/4 v4, 0x2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    if-eq v3, v4, :cond_3

    const/4 v5, 0x3

    if-ne v3, v5, :cond_4

    :cond_3
    move v0, v1

    :cond_4
    :goto_1
    new-instance v3, Lcom/jieli/jl_rcsp/model/base/BasePacket;

    invoke-direct {v3}, Lcom/jieli/jl_rcsp/model/base/BasePacket;-><init>()V

    invoke-virtual {v3, p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setType(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setHasResponse(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object p1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object p1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object p1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object p1

    if-eqz v2, :cond_5

    move v4, v1

    :cond_5
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    if-ne v0, v1, :cond_6

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getXmOpCode()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    add-int/lit8 v4, v4, 0x1

    :cond_6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getParamData()[B

    move-result-object p0

    if-eqz p0, :cond_7

    array-length v0, p0

    if-lez v0, :cond_7

    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setParamData([B)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    array-length p0, p0

    add-int/2addr v4, p0

    :cond_7
    invoke-virtual {p1, v4}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setParamLen(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    return-object p1
.end method

.method public static convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {}, Lcom/jieli/jl_rcsp/constant/Command;->getValidCommandList()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;->parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/cmdHandler/RcspCmdHandler;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/cmdHandler/RcspCmdHandler;-><init>()V

    invoke-virtual {v0, p0, p1}, Lcom/jieli/jl_rcsp/model/cmdHandler/RcspCmdHandler;->parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static convertVersionByString(Ljava/lang/String;)I
    .locals 9

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    sget-object v0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "convertVersionByString"

    invoke-static {v0, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "V"

    const-string v2, ""

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "v"

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\\."

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    new-array v2, v0, [I

    move v4, v1

    :goto_0
    array-length v5, p0

    if-ge v4, v5, :cond_1

    aget-object v5, p0, v4

    invoke-static {v5}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    aput v5, v2, v4

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x4

    if-ne v0, p0, :cond_2

    aget v0, v2, v1

    int-to-byte v0, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArray(B)[B

    move-result-object v0

    const/4 v4, 0x1

    aget v4, v2, v4

    int-to-byte v4, v4

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArray(B)[B

    move-result-object v4

    const/16 v5, 0x8

    new-array v6, v5, [B

    invoke-static {v0, p0, v6, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4, p0, v6, p0, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v6}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a([B)I

    move-result v0

    int-to-byte v0, v0

    const/4 v4, 0x2

    aget v4, v2, v4

    int-to-byte v4, v4

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArray(B)[B

    move-result-object v4

    const/4 v7, 0x3

    aget v2, v2, v7

    int-to-byte v2, v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArray(B)[B

    move-result-object v2

    new-array v7, v5, [B

    invoke-static {v4, p0, v7, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2, p0, v7, p0, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a([B)I

    move-result p0

    int-to-byte p0, p0

    sget-object v2, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "versionCode : "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heightValue : "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lowValue : "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p0

    return p0

    :cond_2
    return v1
.end method

.method public static coverParamDataToAttrBeans([B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_4

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    aget-byte v4, p0, v2

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    const/4 v5, 0x1

    if-ge v4, v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance v5, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v5}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    add-int/lit8 v2, v2, 0x2

    aget-byte v3, p0, v3

    invoke-virtual {v5, v3}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    add-int/lit8 v4, v4, -0x1

    new-array v3, v4, [B

    array-length v6, p0

    sub-int/2addr v6, v2

    if-ge v6, v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v5, v3}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    add-int/2addr v2, v4

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0

    :cond_4
    :goto_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static hexDataCovetToAddress([B)Ljava/lang/String;
    .locals 4

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

    sget-object v2, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->b:[C

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

.method public static packSendBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)[B
    .locals 17

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamLen()I

    move-result v5

    add-int/lit8 v6, v5, 0x4

    add-int/lit8 v7, v5, 0x8

    new-array v7, v7, [B

    new-array v8, v6, [B

    const/4 v9, 0x2

    new-array v10, v9, [B

    aput-byte v3, v10, v3

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v11

    if-ne v11, v2, :cond_0

    aget-byte v11, v10, v3

    or-int/lit16 v11, v11, 0x80

    int-to-byte v11, v11

    aput-byte v11, v10, v3

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v11

    if-ne v11, v2, :cond_1

    aget-byte v11, v10, v3

    or-int/lit8 v11, v11, 0x40

    int-to-byte v11, v11

    aput-byte v11, v10, v3

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v11

    int-to-byte v11, v11

    aput-byte v11, v10, v2

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v11

    new-array v12, v5, [B

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v13

    int-to-byte v13, v13

    new-array v14, v2, [B

    aput-byte v13, v14, v3

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v13

    int-to-byte v13, v13

    new-array v15, v2, [B

    aput-byte v13, v15, v3

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v13

    const/16 v16, 0x0

    const-string v4, "packSendBasePacket"

    const-string v0, ", paramLen : "

    if-ne v13, v2, :cond_3

    invoke-static {v15, v3, v12, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v13

    if-ne v13, v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getXmOpCode()I

    move-result v13

    int-to-byte v13, v13

    new-array v14, v2, [B

    aput-byte v13, v14, v3

    invoke-static {v14, v3, v12, v2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v13, v9

    goto :goto_0

    :cond_2
    move v13, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v14

    if-eqz v14, :cond_5

    sget-object v14, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "data len : "

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    array-length v1, v1

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,index : "

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v4, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    array-length v1, v1

    sub-int v14, v5, v13

    if-lt v1, v14, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    invoke-static {v1, v3, v12, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    add-int/2addr v13, v14

    goto :goto_3

    :cond_3
    invoke-static {v14, v3, v12, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v15, v3, v12, v2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    if-ne v1, v2, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getXmOpCode()I

    move-result v1

    int-to-byte v1, v1

    new-array v13, v2, [B

    aput-byte v1, v13, v3

    invoke-static {v13, v3, v12, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v13, 0x3

    goto :goto_2

    :cond_4
    move v13, v9

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    sub-int v14, v5, v13

    invoke-static {v1, v3, v12, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_5
    :goto_3
    if-eq v13, v5, :cond_6

    sget-object v1, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "param data is error. index : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v4, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_6
    invoke-static {v10, v3, v8, v3, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v11, v3, v8, v9, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x4

    invoke-static {v12, v3, v8, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    invoke-static {v1, v3, v7, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v8, v3, v7, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v0, v2, [B

    const/16 v1, -0x11

    aput-byte v1, v0, v3

    add-int/lit8 v5, v5, 0x7

    invoke-static {v0, v3, v7, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0

    :cond_7
    const/16 v16, 0x0

    return-object v16

    :array_0
    .array-data 1
        -0x2t
        -0x24t
        -0x46t
    .end array-data
.end method

.method public static parseADVInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 12

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object p2

    if-eqz p2, :cond_c

    array-length v0, p2

    if-lez v0, :cond_c

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    add-int/lit8 v3, v2, 0x2

    if-gt v3, v0, :cond_c

    aget-byte v4, p2, v2

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    const-string v5, "parseADVInfo"

    if-lez v4, :cond_b

    invoke-static {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v6

    if-ge v4, v6, :cond_b

    add-int/lit8 v6, v2, 0x1

    aget-byte v6, p2, v6

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    add-int/lit8 v7, v4, -0x1

    new-array v8, v7, [B

    if-lez v7, :cond_9

    add-int v9, v7, v2

    const/4 v10, 0x2

    add-int/2addr v9, v10

    if-gt v9, v0, :cond_9

    invoke-static {p2, v3, v8, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v2, v4

    sget-object v3, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "data : "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;-><init>()V

    :cond_1
    const/4 v4, 0x3

    const/4 v9, 0x4

    const/4 v11, 0x1

    packed-switch v6, :pswitch_data_0

    :pswitch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "unknown type : "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    if-lt v7, v9, :cond_0

    invoke-static {v8, v1, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v5, v1

    :goto_1
    const/16 v6, 0x20

    if-ge v5, v6, :cond_3

    shr-int v6, v3, v5

    and-int/2addr v6, v11

    if-ne v6, v11, :cond_2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [B

    move v5, v1

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Integer;->byteValue()B

    move-result v6

    aput-byte v6, v3, v5

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setModes([B)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_2
    :try_start_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v8}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLanguage(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_0

    :pswitch_3
    aget-byte v3, p2, v1

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setInEarSettings(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_4
    const/4 v3, 0x6

    if-lt v7, v3, :cond_0

    aget-byte v3, v8, v1

    aget-byte v5, v8, v11

    invoke-static {v3, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v3

    aget-byte v5, v8, v10

    aget-byte v4, v8, v4

    invoke-static {v5, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v4

    aget-byte v5, v8, v9

    const/4 v6, 0x5

    aget-byte v6, v8, v6

    invoke-static {v5, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v5

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setVid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-virtual {p1, v4}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setUid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-virtual {p1, v5}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setPid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_5
    aget-byte v3, v8, v1

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setWorkModel(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_6
    aget-byte v3, v8, v1

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setMicChannel(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_7
    invoke-static {v8}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->c([B)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLedSettingsList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_8
    invoke-static {v8}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->b([B)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setKeySettingsList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :pswitch_9
    :try_start_1
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v8}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setDeviceName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_0

    :pswitch_a
    aget-byte v3, v8, v1

    shr-int/lit8 v5, v3, 0x7

    and-int/2addr v5, v11

    and-int/lit8 v3, v3, 0x7f

    if-ne v5, v11, :cond_6

    move v5, v11

    goto :goto_3

    :cond_6
    move v5, v1

    :goto_3
    invoke-virtual {p1, v5}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLeftCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setLeftDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    if-lt v7, v10, :cond_0

    aget-byte v3, v8, v11

    shr-int/lit8 v5, v3, 0x7

    and-int/2addr v5, v11

    and-int/lit8 v3, v3, 0x7f

    if-ne v5, v11, :cond_7

    move v5, v11

    goto :goto_4

    :cond_7
    move v5, v1

    :goto_4
    invoke-virtual {p1, v5}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setRightCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setRightDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    if-lt v7, v4, :cond_0

    aget-byte v3, v8, v10

    shr-int/lit8 v4, v3, 0x7

    and-int/2addr v4, v11

    and-int/lit8 v3, v3, 0x7f

    if-ne v4, v11, :cond_8

    goto :goto_5

    :cond_8
    move v11, v1

    :goto_5
    invoke-virtual {p1, v11}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setDeviceCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->setChargingBinQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    goto/16 :goto_0

    :cond_9
    if-nez v7, :cond_a

    sget-object v2, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    const-string v4, "data is empty."

    invoke-static {v2, v5, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move v2, v3

    goto/16 :goto_0

    :cond_a
    sget-object p0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    const-string p1, "data over limit."

    invoke-static {p0, v5, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_b
    sget-object p1, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "data length[%d] over MAX_COMMUNICATION_MTU[%d], cast away"

    invoke-static {p2, p0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, v5, p0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static parseNotifyADVInfo(Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 17

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    if-eqz v0, :cond_4

    array-length v1, v0

    const/16 v2, 0x12

    if-lt v1, v2, :cond_4

    const/4 v1, 0x2

    new-array v2, v1, [B

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v4, v2, v3

    const/4 v5, 0x1

    aget-byte v6, v2, v5

    invoke-static {v4, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v4

    invoke-static {v0, v1, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v6, v2, v3

    aget-byte v7, v2, v5

    invoke-static {v6, v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v6

    const/4 v7, 0x4

    invoke-static {v0, v7, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v1, v2, v3

    aget-byte v2, v2, v5

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v1

    const/4 v2, 0x6

    aget-byte v7, v0, v2

    shr-int/lit8 v8, v7, 0x4

    and-int/lit16 v8, v8, 0xff

    const/16 v9, 0xf

    and-int/2addr v7, v9

    new-array v10, v2, [B

    const/4 v11, 0x7

    invoke-static {v0, v11, v10, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0xd

    aget-byte v10, v0, v10

    invoke-static {v10}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v10

    const/16 v11, 0xe

    aget-byte v11, v0, v11

    shr-int/lit8 v12, v11, 0x7

    and-int/2addr v12, v5

    and-int/lit8 v11, v11, 0x7f

    aget-byte v9, v0, v9

    shr-int/lit8 v13, v9, 0x7

    and-int/2addr v13, v5

    and-int/lit8 v9, v9, 0x7f

    const/16 v14, 0x10

    aget-byte v14, v0, v14

    shr-int/lit8 v15, v14, 0x7

    and-int/2addr v15, v5

    and-int/lit8 v14, v14, 0x7f

    const/16 v16, 0x11

    aget-byte v0, v0, v16

    move-object/from16 v3, p0

    invoke-virtual {v3, v4}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setVid(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setUid(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setPid(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setDeviceType(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setVersion(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setAction(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    if-ne v12, v5, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setLeftCharging(Z)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v11}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setLeftDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    if-ne v13, v5, :cond_2

    move v2, v5

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setRightCharging(Z)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v9}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setRightDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    if-ne v15, v5, :cond_3

    move v3, v5

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v1, v3}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setDeviceCharging(Z)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-virtual {v1, v14}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setChargingBinQuantity(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    move-result-object v1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;->setSeq(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    :cond_4
    :goto_3
    return-void
.end method

.method public static parseSysInfo(Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 5

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object p1

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p1

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    array-length v2, p1

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    array-length v2, p1

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    invoke-static {p1, v3, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->coverParamDataToAttrBeans([B)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->setFunction(B)Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->setAttrs(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;

    :cond_1
    :goto_0
    return-void
.end method

.method public static parseTargetInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v3

    const-string v4, "parseTargetInfo"

    if-eqz v3, :cond_1b

    array-length v0, v3

    if-lez v0, :cond_1b

    array-length v5, v3

    const/4 v6, 0x0

    move v0, v6

    :goto_0
    add-int/lit8 v7, v0, 0x2

    if-gt v7, v5, :cond_1b

    aget-byte v8, v3, v0

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    if-lez v8, :cond_1a

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v9

    if-ge v8, v9, :cond_1a

    add-int/lit8 v9, v0, 0x1

    aget-byte v9, v3, v9

    invoke-static {v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v9

    add-int/lit8 v10, v8, -0x1

    new-array v11, v10, [B

    if-lez v10, :cond_18

    add-int v12, v10, v0

    const/4 v13, 0x2

    add-int/2addr v12, v13

    if-gt v12, v5, :cond_18

    invoke-static {v3, v7, v11, v6, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v7, v8, 0x1

    add-int/2addr v7, v0

    const/16 v0, 0x15

    const/4 v14, 0x1

    if-eq v9, v0, :cond_13

    const/16 v0, 0x1f

    if-eq v9, v0, :cond_12

    const-string v0, "V_"

    const/16 v17, 0x5

    const-string v12, "."

    const/4 v13, 0x6

    const/4 v15, 0x3

    packed-switch v9, :pswitch_data_0

    packed-switch v9, :pswitch_data_1

    goto/16 :goto_14

    :pswitch_0
    invoke-virtual {v2, v11}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setExpandFunc([B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_1
    aget-byte v0, v11, v6

    and-int/lit8 v8, v0, 0xf

    if-ne v8, v14, :cond_0

    goto :goto_1

    :cond_0
    move v14, v6

    :goto_1
    shr-int/lit8 v0, v0, 0x4

    and-int/lit8 v0, v0, 0xf

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEmitterStatus(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEmitterSupport(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_2
    aget-byte v0, v11, v6

    if-ne v0, v14, :cond_1

    move v0, v14

    goto :goto_2

    :cond_1
    move v0, v6

    :goto_2
    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setBleOnly(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-le v10, v13, :cond_2

    new-array v0, v13, [B

    invoke-static {v11, v14, v0, v6, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setBleAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    :cond_2
    const/4 v0, 0x7

    if-le v10, v0, :cond_17

    aget-byte v0, v11, v0

    and-int/2addr v0, v14

    if-ne v0, v14, :cond_3

    goto :goto_3

    :cond_3
    move v14, v6

    :goto_3
    invoke-virtual {v2, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setBLEToSppWay(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_3
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_14

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_14

    :pswitch_4
    aget-byte v0, v11, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setAllowConnectFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_5
    const/4 v0, 0x2

    if-lt v10, v0, :cond_17

    aget-byte v0, v11, v6

    aget-byte v8, v11, v14

    invoke-static {v0, v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    if-lez v0, :cond_4

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v8

    invoke-virtual {v8, v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v8

    invoke-virtual {v8, v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_4
    const/4 v8, 0x4

    if-lt v10, v8, :cond_17

    const/16 v18, 0x2

    aget-byte v8, v11, v18

    aget-byte v9, v11, v15

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    if-lez v0, :cond_5

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v9

    invoke-virtual {v9, v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_5
    if-lez v8, :cond_17

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    invoke-virtual {v0, v1, v8}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_14

    :pswitch_6
    :try_start_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v15, v0

    goto :goto_4

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v15, 0x0

    :goto_4
    invoke-virtual {v2, v15}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setProjectCode(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_7
    :try_start_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v15, v0

    goto :goto_5

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v15, 0x0

    :goto_5
    invoke-virtual {v2, v15}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setAuthKey(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_8
    const/4 v8, 0x4

    if-lt v10, v8, :cond_17

    const/16 v0, 0x5d6

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    aget-byte v8, v11, v6

    aget-byte v9, v11, v14

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    const/16 v18, 0x2

    aget-byte v8, v11, v18

    aget-byte v9, v11, v15

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setPid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-lt v10, v13, :cond_17

    aget-byte v0, v11, v6

    aget-byte v8, v11, v14

    invoke-static {v0, v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    aget-byte v8, v11, v18

    aget-byte v9, v11, v15

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setPid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    const/16 v16, 0x4

    aget-byte v8, v11, v16

    aget-byte v9, v11, v17

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_9
    aget-byte v0, v11, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setMandatoryUpgradeFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    const/4 v0, 0x2

    if-lt v10, v0, :cond_17

    aget-byte v8, v11, v14

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    invoke-virtual {v2, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setRequestOtaFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-lt v10, v15, :cond_17

    aget-byte v0, v11, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setExpandMode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_a
    aget-byte v0, v11, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    if-ne v0, v14, :cond_6

    move v0, v14

    goto :goto_6

    :cond_6
    move v0, v6

    :goto_6
    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportDoubleBackup(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    const/4 v0, 0x2

    if-lt v10, v0, :cond_17

    aget-byte v8, v11, v14

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    if-ne v8, v14, :cond_7

    goto :goto_7

    :cond_7
    move v14, v6

    :goto_7
    invoke-virtual {v2, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setNeedBootLoader(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-lt v10, v15, :cond_17

    aget-byte v0, v11, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSingleBackupOtaWay(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_b
    const/4 v0, 0x2

    if-ne v10, v0, :cond_8

    aget-byte v0, v11, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArray(B)[B

    move-result-object v0

    aget-byte v8, v11, v14

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArray(B)[B

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v10, 0x8

    new-array v10, v10, [B

    const/4 v13, 0x4

    invoke-static {v0, v6, v10, v13, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a([B)I

    move-result v15

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v13, v10, v13, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a([B)I

    move-result v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v6, v10, v13, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a([B)I

    move-result v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v13, v10, v13, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a([B)I

    move-result v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUbootVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    aget-byte v0, v11, v6

    aget-byte v8, v11, v14

    invoke-static {v0, v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUbootVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :cond_8
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([B)V

    const-string v8, "V"

    const-string v9, ""

    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v8, "v"

    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUbootVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    invoke-virtual {v0, v12, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v8, v0

    const/4 v13, 0x4

    if-lt v8, v13, :cond_17

    aget-char v8, v0, v6

    aget-char v9, v0, v14

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->decodeHexChar(CC)B

    move-result v8

    const/16 v18, 0x2

    aget-char v9, v0, v18

    aget-char v0, v0, v15

    invoke-static {v9, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->decodeHexChar(CC)B

    move-result v0

    invoke-static {v8, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUbootVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_c
    aget-byte v0, v11, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSdkType(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportVolumeSync()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getSdkType()I

    move-result v0

    const/4 v8, 0x2

    if-eq v0, v8, :cond_a

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getSdkType()I

    move-result v0

    const/4 v13, 0x4

    if-ne v0, v13, :cond_9

    goto :goto_8

    :cond_9
    move v14, v6

    :cond_a
    :goto_8
    invoke-virtual {v2, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportVolumeSync(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_d
    const/4 v8, 0x2

    if-lt v10, v8, :cond_17

    aget-byte v8, v11, v6

    aget-byte v9, v11, v14

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    shr-int/lit8 v9, v8, 0xc

    and-int/lit8 v9, v9, 0xf

    shr-int/lit8 v10, v8, 0x8

    and-int/lit8 v10, v10, 0xf

    shr-int/lit8 v11, v8, 0x4

    and-int/lit8 v11, v11, 0xf

    and-int/lit8 v13, v8, 0xf

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v8

    invoke-virtual {v8, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_e
    move/from16 v0, v17

    if-lt v10, v0, :cond_17

    const/4 v13, 0x4

    new-array v8, v13, [B

    invoke-static {v11, v6, v8, v6, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v8

    invoke-virtual {v2, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setFunctionMask(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v8

    aget-byte v9, v11, v13

    invoke-virtual {v8, v9}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setCurFunction(B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-le v10, v0, :cond_17

    aget-byte v0, v11, v0

    and-int/lit8 v8, v0, 0x1

    if-ne v8, v14, :cond_b

    move v8, v14

    goto :goto_9

    :cond_b
    move v8, v6

    :goto_9
    and-int/lit8 v9, v0, 0x2

    const/4 v10, 0x2

    if-ne v9, v10, :cond_c

    move v9, v14

    goto :goto_a

    :cond_c
    move v9, v6

    :goto_a
    and-int/lit8 v10, v0, 0x4

    const/4 v13, 0x4

    if-ne v10, v13, :cond_d

    move v10, v14

    goto :goto_b

    :cond_d
    move v10, v6

    :goto_b
    and-int/lit8 v11, v0, 0x8

    const/16 v12, 0x8

    if-ne v11, v12, :cond_e

    move v11, v14

    goto :goto_c

    :cond_e
    move v11, v6

    :goto_c
    and-int/lit8 v0, v0, 0x10

    const/16 v12, 0x10

    if-ne v0, v12, :cond_f

    goto :goto_d

    :cond_f
    move v14, v6

    :goto_d
    invoke-virtual {v2, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportOfflineShow(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportUsb(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportSd0(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportSd1(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setHideNetRadio(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_f
    const/16 v12, 0x8

    if-le v10, v12, :cond_17

    aget-byte v0, v11, v6

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setPlatform(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    :try_start_3
    new-instance v0, Ljava/lang/String;

    add-int/lit8 v8, v8, -0x2

    invoke-direct {v0, v11, v14, v8}, Ljava/lang/String;-><init>([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object v15, v0

    goto :goto_e

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v15, 0x0

    :goto_e
    invoke-virtual {v2, v15}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setLicense(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_10
    if-lt v10, v13, :cond_17

    new-array v0, v13, [B

    invoke-static {v11, v6, v0, v6, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    const/16 v12, 0x8

    if-lt v10, v12, :cond_17

    aget-byte v0, v11, v13

    const/16 v19, 0x7

    aget-byte v8, v11, v19

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEdrProfile(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEdrStatus(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto/16 :goto_14

    :pswitch_11
    if-lt v10, v15, :cond_17

    aget-byte v0, v11, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setQuantity(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    aget-byte v0, v11, v14

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVolume(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    const/16 v18, 0x2

    aget-byte v0, v11, v18

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setMaxVol(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-le v10, v15, :cond_11

    aget-byte v0, v11, v15

    and-int/2addr v0, v14

    if-ne v0, v14, :cond_10

    goto :goto_f

    :cond_10
    move v14, v6

    :goto_f
    invoke-virtual {v2, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportVolumeSync(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    :cond_11
    const/4 v13, 0x4

    if-le v10, v13, :cond_17

    aget-byte v0, v11, v13

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setLowPowerLimit(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto :goto_14

    :pswitch_12
    aget-byte v8, v11, v6

    shr-int/lit8 v9, v8, 0x4

    and-int/lit8 v9, v9, 0xf

    and-int/lit8 v8, v8, 0xf

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setProtocolVersion(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto :goto_14

    :cond_12
    :try_start_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-object v15, v0

    goto :goto_10

    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v15, 0x0

    :goto_10
    invoke-virtual {v2, v15}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setCustomVersionMsg(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    goto :goto_14

    :cond_13
    invoke-static {v11}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v0

    and-int/lit8 v8, v0, 0x1

    if-ne v8, v14, :cond_14

    move v8, v14

    goto :goto_11

    :cond_14
    move v8, v6

    :goto_11
    invoke-virtual {v2, v8}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportPackageCrc16(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v8

    and-int/lit8 v9, v0, 0x2

    const/4 v10, 0x2

    if-ne v9, v10, :cond_15

    move v9, v14

    goto :goto_12

    :cond_15
    move v9, v6

    :goto_12
    invoke-virtual {v8, v9}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setGetFileByNameWithDev(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v8

    and-int/lit8 v0, v0, 0x4

    const/4 v13, 0x4

    if-ne v0, v13, :cond_16

    goto :goto_13

    :cond_16
    move v14, v6

    :goto_13
    invoke-virtual {v8, v14}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setContactsTransferBySmallFile(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    :cond_17
    :goto_14
    move v0, v7

    goto/16 :goto_0

    :cond_18
    if-nez v10, :cond_19

    sget-object v0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    const-string v8, "dataBuf is empty."

    invoke-static {v0, v4, v8}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_14

    :cond_19
    sget-object v0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    const-string v1, "over limit."

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1a
    sget-object v0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "data length[%d] over MAX_COMMUNICATION_MTU[%d], cast away"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1b
    sget-object v0, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "end ....... = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static setDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p0

    return p0
.end method
