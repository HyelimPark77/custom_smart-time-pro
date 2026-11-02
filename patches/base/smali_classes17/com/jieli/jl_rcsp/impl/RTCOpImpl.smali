.class public Lcom/jieli/jl_rcsp/impl/RTCOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/alarm/IRTCOp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;,
        Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;
    }
.end annotation


# static fields
.field public static final WAY_NOTIFY:I = 0x1

.field public static final WAY_REPLY:I = 0x0

.field public static final f:Ljava/lang/String; = "RTCOpImpl"

.field public static final g:I = 0x1770

.field public static final h:I = 0xa100


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

.field public c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Landroid/os/Handler;

.field public final e:Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/bc2;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/bc2;-><init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->d:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->e:Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->addListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "WatchOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/LtvBean;",
            ">;)I"
        }
    .end annotation

    .line 90
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/LtvBean;

    .line 91
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    .line 92
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getData()[B

    move-result-object p0

    aget-byte p0, p0, v1

    and-int/lit8 p0, p0, 0x7

    return p0

    :cond_1
    return v1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    return-object p1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 3
    sget-object v0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;[B)V
    .locals 24

    move-object/from16 v1, p1

    .line 9
    invoke-static/range {p2 .. p2}, Lcom/jieli/jl_rcsp/util/DataUtil;->parseLTVData2([B)Ljava/util/List;

    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_c

    .line 11
    :cond_0
    invoke-interface/range {p0 .. p0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    move-object/from16 v3, p0

    .line 12
    invoke-virtual {v3, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v3

    if-nez v3, :cond_1

    goto/16 :goto_c

    .line 13
    :cond_1
    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a(Ljava/util/List;)I

    move-result v4

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/LtvBean;

    .line 15
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getData()[B

    move-result-object v6

    .line 16
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v7

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v7, v11, :cond_d

    const/4 v13, 0x3

    const/4 v14, 0x2

    if-eq v7, v14, :cond_8

    if-eq v7, v13, :cond_8

    if-eq v7, v10, :cond_6

    if-eq v7, v9, :cond_4

    const/4 v0, 0x7

    if-eq v7, v0, :cond_3

    goto :goto_0

    .line 17
    :cond_3
    aget-byte v0, v6, v12

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmExpandFlag(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    goto :goto_0

    .line 18
    :cond_4
    aget-byte v0, v6, v12

    and-int/lit8 v0, v0, 0xf

    .line 19
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 20
    :goto_1
    array-length v8, v6

    if-ge v11, v8, :cond_5

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-ge v8, v0, :cond_5

    add-int/lit8 v8, v11, 0x1

    .line 21
    aget-byte v9, v6, v11

    add-int/lit8 v11, v11, 0x2

    .line 22
    aget-byte v8, v6, v8

    .line 23
    new-array v10, v8, [B

    .line 24
    invoke-static {v6, v11, v10, v12, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v11, v8

    .line 25
    new-instance v8, Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;

    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v10}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v8, v9, v13, v12}, Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;-><init>(ILjava/lang/String;Z)V

    .line 26
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 27
    :cond_5
    invoke-virtual {v3, v7}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmDefaultBells(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    if-eqz v1, :cond_2

    .line 28
    invoke-virtual {v1, v2, v7}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmDefaultBellListChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    goto :goto_0

    .line 29
    :cond_6
    invoke-virtual {v3, v4}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmVersion(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    .line 30
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v0

    if-nez v0, :cond_7

    .line 31
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v4, v6}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;-><init>(ILjava/util/List;)V

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmListInfo(Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    goto :goto_0

    .line 32
    :cond_7
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->setVersion(I)V

    goto/16 :goto_0

    .line 33
    :cond_8
    aget-byte v6, v6, v12

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    .line 34
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 35
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->getAlarmBeans()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 36
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_a

    .line 37
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    .line 38
    invoke-virtual {v9}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getIndex()B

    move-result v10

    if-ne v6, v10, :cond_9

    .line 39
    invoke-virtual {v9}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->copy()Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v8

    goto :goto_2

    :cond_a
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_b

    .line 40
    new-instance v8, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-direct {v8}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;-><init>()V

    int-to-byte v6, v6

    .line 41
    invoke-virtual {v8, v6}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    .line 42
    const-string v6, "Alarm"

    invoke-virtual {v8, v6}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    .line 43
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    const/16 v7, 0xb

    .line 44
    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    int-to-byte v7, v7

    invoke-virtual {v8, v7}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setHour(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    const/16 v7, 0xc

    .line 45
    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    move-result v6

    int-to-byte v6, v6

    invoke-virtual {v8, v6}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setMin(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    .line 46
    :cond_b
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v0

    if-ne v0, v13, :cond_c

    if-eqz v1, :cond_2

    .line 47
    invoke-virtual {v1, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmStop(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    goto/16 :goto_0

    :cond_c
    if-eqz v1, :cond_2

    .line 48
    invoke-virtual {v1, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmNotify(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    goto/16 :goto_0

    .line 49
    :cond_d
    aget-byte v0, v6, v12

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v7

    .line 50
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-lez v7, :cond_15

    move v0, v11

    move v14, v12

    :goto_3
    if-ge v14, v7, :cond_14

    .line 51
    array-length v15, v6

    sub-int/2addr v15, v0

    if-le v15, v9, :cond_14

    add-int/lit8 v15, v0, 0x1

    .line 52
    aget-byte v8, v6, v0

    add-int/lit8 v16, v0, 0x2

    .line 53
    aget-byte v15, v6, v15

    invoke-static {v15}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v15

    if-ne v15, v11, :cond_e

    move v15, v11

    goto :goto_4

    :cond_e
    move v15, v12

    :goto_4
    add-int/lit8 v17, v0, 0x3

    .line 54
    aget-byte v9, v6, v16

    add-int/lit8 v16, v0, 0x4

    .line 55
    aget-byte v12, v6, v17

    add-int/lit8 v17, v0, 0x5

    .line 56
    aget-byte v10, v6, v16

    add-int/lit8 v11, v0, 0x6

    .line 57
    aget-byte v0, v6, v17

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    move/from16 v17, v4

    .line 58
    array-length v4, v6

    sub-int/2addr v4, v11

    if-le v0, v4, :cond_f

    :goto_5
    move-object/from16 v19, v5

    goto/16 :goto_a

    :cond_f
    if-lez v0, :cond_10

    .line 59
    :try_start_0
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v6, v11, v0}, Ljava/lang/String;-><init>([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v11, v0

    goto :goto_6

    :catch_0
    move-exception v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_10
    const/4 v4, 0x0

    :goto_6
    if-nez v17, :cond_11

    .line 61
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmVersion()I

    move-result v0

    move-object/from16 v19, v5

    move v5, v0

    goto :goto_7

    :cond_11
    move-object/from16 v19, v5

    move/from16 v5, v17

    .line 62
    :goto_7
    array-length v0, v6

    sub-int/2addr v0, v11

    const-string v17, ""

    move/from16 v20, v7

    const/4 v7, 0x1

    if-ne v5, v7, :cond_13

    const/4 v7, 0x6

    if-le v0, v7, :cond_13

    add-int/lit8 v0, v11, 0x1

    .line 63
    aget-byte v7, v6, v11

    move/from16 v21, v0

    add-int/lit8 v0, v11, 0x2

    .line 64
    aget-byte v21, v6, v21

    move/from16 v22, v7

    move/from16 v18, v11

    const/4 v7, 0x4

    .line 65
    new-array v11, v7, [B

    move/from16 v23, v14

    const/4 v14, 0x0

    .line 66
    invoke-static {v6, v0, v11, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    invoke-static {v11}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v11

    add-int/lit8 v0, v18, 0x6

    add-int/lit8 v7, v18, 0x7

    .line 68
    aget-byte v0, v6, v0

    and-int/lit16 v0, v0, 0xff

    .line 69
    array-length v14, v6

    sub-int/2addr v14, v7

    if-gt v0, v14, :cond_12

    .line 70
    :try_start_1
    new-instance v14, Ljava/lang/String;

    invoke-direct {v14, v6, v7, v0}, Ljava/lang/String;-><init>([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/2addr v7, v0

    move-object/from16 v18, v6

    move/from16 v17, v7

    move/from16 v0, v21

    :goto_8
    move/from16 v7, v22

    goto :goto_9

    :catch_1
    move-exception v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_12
    move-object/from16 v18, v6

    move-object/from16 v14, v17

    move/from16 v0, v21

    move/from16 v17, v7

    goto :goto_8

    :cond_13
    move/from16 v18, v11

    move/from16 v23, v14

    move-object/from16 v14, v17

    move/from16 v17, v18

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v6

    .line 72
    :goto_9
    new-instance v6, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-direct {v6}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;-><init>()V

    .line 73
    invoke-virtual {v6, v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setVersion(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v6

    .line 74
    invoke-virtual {v6, v8}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v6

    .line 75
    invoke-virtual {v6, v9}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setRepeatMode(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v6

    .line 76
    invoke-virtual {v6, v4}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v4

    .line 77
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setDevIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 78
    invoke-virtual {v0, v12}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setHour(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 79
    invoke-virtual {v0, v10}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setMin(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 80
    invoke-virtual {v0, v11}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellCluster(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 81
    invoke-virtual {v0, v14}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 82
    invoke-virtual {v0, v7}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellType(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 83
    invoke-virtual {v0, v15}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setOpen(Z)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    .line 84
    sget-object v4, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->f:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "parseRTCDataVersion0"

    invoke-static {v4, v7, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v23, 0x1

    move v4, v5

    move/from16 v0, v17

    move-object/from16 v6, v18

    move-object/from16 v5, v19

    move/from16 v7, v20

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x1

    const/4 v12, 0x0

    goto/16 :goto_3

    :cond_14
    move/from16 v17, v4

    goto/16 :goto_5

    :goto_a
    move/from16 v4, v17

    goto :goto_b

    :cond_15
    move-object/from16 v19, v5

    .line 86
    :goto_b
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    invoke-direct {v0, v13}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;-><init>(Ljava/util/List;)V

    .line 87
    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->setVersion(I)V

    .line 88
    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmListInfo(Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    if-eqz v1, :cond_16

    .line 89
    invoke-virtual {v1, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmListChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)V

    :cond_16
    move-object/from16 v5, v19

    goto/16 :goto_0

    :cond_17
    :goto_c
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b()Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->d:Landroid/os/Handler;

    return-object p0
.end method

.method public static parseRTCBigData(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;[B)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;

    invoke-direct {v0, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;-><init>([B)V

    iget p2, v0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;->a:I

    if-nez p2, :cond_1

    iget-object p2, v0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;->c:[B

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;[B)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/os/Message;)Z
    .locals 3

    .line 4
    iget p1, p1, Landroid/os/Message;->what:I

    const v0, 0xa100

    if-ne p1, v0, :cond_0

    .line 5
    sget-object p1, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->f:Ljava/lang/String;

    const-string v0, "MSG_WAIT_ALARM_DATA"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_0

    .line 7
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3002

    const-string v2, "The device replies to the alarm clock data timeout."

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public addOrModifyAlarm(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "AlarmBean is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    const/4 v1, 0x0

    invoke-static {p2, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->toAttrbean(Lcom/jieli/jl_rcsp/model/device/AlarmBean;Z)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object p2

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetAlarmCmd(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "addOrModifyAlarm"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public auditionAlarmBell(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AuditionParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/device/AuditionParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "AlarmExpandCmd.BellArg is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->getType()B

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->getDev()B

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->getCluster()I

    move-result p2

    invoke-static {v1, v2, p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildAuditionAlarmBellCmd(BBI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "auditionAlarmBell"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final b()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->d:Landroid/os/Handler;

    const v1, 0xa100

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    return v0
.end method

.method public deleteAlarm(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "AlarmBean is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    const/4 v1, 0x1

    invoke-static {p2, v1}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->toAttrbean(Lcom/jieli/jl_rcsp/model/device/AlarmBean;Z)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object p2

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildDelAlarmCmd(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "deleteAlarm"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->e:Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->removeListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V

    return-void
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object v0
.end method

.method public readAlarmBellArgs(Landroid/bluetooth/BluetoothDevice;BLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "B",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildReadBellArgsCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)V

    const-string v3, "readAlarmBellArgs"

    invoke-direct {v1, v3, p3, v2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public readAlarmDefaultBellList(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1100

    const-string v1, "Reading alarm data is in progress."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetDefaultAlarmBellsCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;

    invoke-direct {v2, p0, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;-><init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public readAlarmList(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1100

    const-string v1, "Reading alarm data is in progress."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetAlarmCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;

    invoke-direct {v2, p0, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$ReadAlarmRcspCallback;-><init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public setAlarmBellArg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "AlarmExpandCmd.BellArg is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetBellArgsCmd(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "setAlarmBellArg"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public stopAlarmBell(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildStopAlarmCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "stopAlarmBell"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public stopPlayAlarmBell(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildStopAuditionAlarmBellCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "stopPlayAlarmBell"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public syncTime(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSyncTimeCmd(Ljava/util/Calendar;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "syncTime"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
