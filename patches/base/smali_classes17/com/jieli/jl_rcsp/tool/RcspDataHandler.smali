.class public Lcom/jieli/jl_rcsp/tool/RcspDataHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String; = "rcsp_handler"

.field public static final d:I = 0x40


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    return-void
.end method


# virtual methods
.method public final a(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;
    .locals 11

    .line 36
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;-><init>()V

    .line 37
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object p1

    .line 38
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 39
    aget-byte v3, p1, v2

    .line 40
    new-array v4, v3, [I

    const/4 v5, 0x1

    move v6, v2

    move v7, v5

    :goto_0
    if-ge v6, v3, :cond_0

    .line 41
    aget-byte v8, p1, v7

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    add-int/lit8 v9, v7, 0x1

    aget-byte v9, p1, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    aput v8, v4, v6

    add-int/lit8 v7, v7, 0x2

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    move v6, v2

    :goto_1
    const/4 v8, 0x7

    if-ge v6, v8, :cond_2

    .line 42
    new-array v8, v3, [B

    .line 43
    aget-byte v9, p1, v7

    and-int/lit8 v9, v9, 0x7f

    int-to-byte v9, v9

    add-int/lit8 v10, v7, 0x1

    .line 44
    invoke-static {p1, v10, v8, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    new-instance v10, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {v10, v9, v8, v4}, Lcom/jieli/jl_rcsp/model/device/EqInfo;-><init>(I[B[I)V

    .line 46
    aget-byte v8, p1, v7

    const/16 v9, 0x80

    and-int/2addr v8, v9

    if-ne v8, v9, :cond_1

    move v8, v5

    goto :goto_2

    :cond_1
    move v8, v2

    :goto_2
    invoke-virtual {v10, v8}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setDynamic(Z)V

    .line 47
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v3, 0x1

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->setNumber(I)V

    .line 49
    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->setFreqs([I)V

    .line 50
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->setEqInfos(Ljava/util/List;)V

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "eq--->"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "rcsp_handler"

    const-string v2, "parseEqPresetInfo"

    invoke-static {v1, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 34
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    .line 35
    :cond_2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 3
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4
    array-length v3, v2

    if-nez v3, :cond_3

    goto :goto_0

    .line 5
    :cond_3
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    .line 6
    aget-byte v2, v2, v1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    move v1, v3

    .line 7
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onAuxStatusChange >> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rcsp_handler"

    const-string v4, "parseAUXData"

    invoke-static {v3, v4, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAuxPlay(Z)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    .line 9
    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v2, p1, v1}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAuxStatusChange(Landroid/bluetooth/BluetoothDevice;Z)V

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 9

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "data ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rcsp_handler"

    const-string v2, "parseFixedLenData"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getExpandFunction()Lcom/jieli/jl_rcsp/model/device/ExpandFunction;

    move-result-object v1

    .line 13
    array-length v2, p2

    const/4 v3, 0x4

    if-lt v2, v3, :cond_5

    const/4 v2, 0x0

    .line 14
    invoke-static {p2, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    if-nez v1, :cond_1

    .line 15
    new-instance v1, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;-><init>()V

    .line 16
    invoke-virtual {v1, v4}, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->setMask(I)V

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->getMask()I

    move-result v5

    or-int/2addr v5, v4

    invoke-virtual {v1, v5}, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->setMask(I)V

    :goto_0
    and-int/lit8 v5, v4, 0x1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_3

    .line 18
    array-length v5, p2

    const/16 v7, 0x9

    if-lt v5, v7, :cond_3

    const/4 v5, 0x5

    .line 19
    new-array v8, v5, [B

    .line 20
    invoke-static {p2, v3, v8, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    invoke-virtual {v1, v2, v8}, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->putData(I[B)V

    .line 22
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v3, p1, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onExpandFunction(Landroid/bluetooth/BluetoothDevice;I[B)V

    .line 23
    invoke-static {v8}, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->parseData([B)Lcom/jieli/jl_rcsp/model/device/ReverberationParam;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 24
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, p1, v3}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onReverberation(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ReverberationParam;)V

    :cond_2
    move v3, v7

    :cond_3
    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    .line 25
    array-length v4, p2

    add-int/lit8 v7, v3, 0x2

    if-lt v4, v7, :cond_4

    .line 26
    new-array v4, v5, [B

    .line 27
    invoke-static {p2, v3, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    invoke-virtual {v1, v6, v4}, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->putData(I[B)V

    .line 29
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {p2, p1, v6, v4}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onExpandFunction(Landroid/bluetooth/BluetoothDevice;I[B)V

    .line 30
    invoke-static {v4}, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;->parseData([B)Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 31
    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v2, p1, p2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onDynamicLimiter(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;)V

    .line 32
    :cond_4
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setExpandFunction(Lcom/jieli/jl_rcsp/model/device/ExpandFunction;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    :cond_5
    :goto_1
    return-void
.end method

.method public final b(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)I"
        }
    .end annotation

    .line 50
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 51
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    .line 52
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object p1

    aget-byte p1, p1, v1

    and-int/lit8 p1, p1, 0x7

    return p1

    :cond_1
    return v1
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    if-nez p2, :cond_0

    goto/16 :goto_d

    .line 1
    :cond_0
    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v3

    if-nez v3, :cond_1

    goto/16 :goto_d

    .line 2
    :cond_1
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getiD3MusicInfo()Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    move-result-object v0

    if-nez v0, :cond_2

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;-><init>()V

    :cond_2
    move-object v4, v0

    .line 4
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    move v0, v6

    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 5
    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v8

    if-eqz v8, :cond_3

    .line 6
    array-length v9, v8

    if-nez v9, :cond_4

    goto :goto_0

    .line 7
    :cond_4
    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v7

    const-string v9, ""

    const-string v10, "00"

    const-string v11, "..."

    const/4 v14, 0x2

    const-string v15, "parseBtData"

    const-string v13, "rcsp_handler"

    const/4 v12, 0x1

    packed-switch v7, :pswitch_data_0

    goto :goto_0

    .line 8
    :pswitch_0
    array-length v0, v8

    const/4 v7, 0x4

    if-lt v0, v7, :cond_5

    .line 9
    invoke-static {v8, v6, v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    goto :goto_1

    :cond_5
    move v0, v6

    .line 10
    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "id3 currentTime: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setCurrentTime(I)V

    :goto_2
    move v0, v12

    goto :goto_0

    .line 12
    :pswitch_1
    aget-byte v0, v8, v6

    and-int/2addr v0, v12

    if-ne v0, v12, :cond_6

    move v0, v12

    goto :goto_3

    :cond_6
    move v0, v6

    .line 13
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "id3 isPlay: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setPlayStatus(Z)V

    goto :goto_2

    .line 15
    :pswitch_2
    array-length v0, v8

    if-lt v0, v14, :cond_7

    .line 16
    invoke-static {v8, v6, v14}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    goto :goto_4

    :cond_7
    move v0, v6

    .line 17
    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "id3 allTime: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setTotalTime(I)V

    goto :goto_2

    .line 19
    :pswitch_3
    :try_start_0
    new-instance v0, Ljava/lang/String;

    array-length v7, v8

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v8, v6, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    .line 21
    :goto_5
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "id3 genre: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setGenre(Ljava/lang/String;)V

    goto :goto_2

    .line 23
    :pswitch_4
    array-length v0, v8

    if-lt v0, v14, :cond_8

    .line 24
    invoke-static {v8, v6, v14}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    goto :goto_6

    :cond_8
    move v0, v6

    .line 25
    :goto_6
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "id3 allNum: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setTotal(I)V

    goto/16 :goto_2

    .line 27
    :pswitch_5
    aget-byte v0, v8, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    .line 28
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "id3 number: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setNumber(I)V

    goto/16 :goto_2

    .line 30
    :pswitch_6
    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v7

    .line 31
    :try_start_1
    new-instance v0, Ljava/lang/String;

    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v8, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v13, v0

    goto :goto_7

    :catch_1
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v13, 0x0

    :goto_7
    if-eqz v13, :cond_9

    .line 33
    array-length v0, v8

    const/16 v8, 0x40

    if-ne v0, v8, :cond_9

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v12

    invoke-virtual {v13, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 35
    :cond_9
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    move-object v9, v13

    :goto_8
    invoke-virtual {v4, v9}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setAlbum(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 36
    :pswitch_7
    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v7

    .line 37
    :try_start_2
    new-instance v0, Ljava/lang/String;

    array-length v13, v8

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v8, v6, v13, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v13, v0

    goto :goto_9

    :catch_2
    move-exception v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v13, 0x0

    :goto_9
    if-eqz v13, :cond_b

    .line 39
    array-length v0, v8

    const/16 v8, 0x40

    if-ne v0, v8, :cond_b

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v12

    invoke-virtual {v13, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 41
    :cond_b
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_a

    :cond_c
    move-object v9, v13

    :goto_a
    invoke-virtual {v4, v9}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setArtist(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 42
    :pswitch_8
    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v7

    .line 43
    :try_start_3
    new-instance v0, Ljava/lang/String;

    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v8, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object v13, v0

    goto :goto_b

    :catch_3
    move-exception v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v13, 0x0

    :goto_b
    if-eqz v13, :cond_d

    .line 45
    array-length v0, v8

    const/16 v8, 0x40

    if-ne v0, v8, :cond_d

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v12

    invoke-virtual {v13, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 47
    :cond_d
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_c

    :cond_e
    move-object v9, v13

    :goto_c
    invoke-virtual {v4, v9}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setTitle(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_f
    if-eqz v0, :cond_10

    .line 48
    invoke-virtual {v3, v4}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setiD3MusicInfo(Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    .line 49
    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v4}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onID3MusicInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)V

    :cond_10
    :goto_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v2

    if-eqz v2, :cond_2

    array-length v3, v2

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v1

    const/high16 v3, 0x41200000    # 10.0f

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eqz v1, :cond_6

    if-eq v1, v5, :cond_4

    goto :goto_0

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v6, v2

    :goto_1
    sub-int v7, v6, v5

    if-lt v7, v4, :cond_5

    aget-byte v7, v2, v5

    invoke-static {v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v7

    add-int/lit8 v8, v5, 0x1

    aget-byte v8, v2, v8

    add-int/lit8 v9, v5, 0x2

    aget-byte v9, v2, v9

    invoke-static {v8, v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v8, v3

    add-int/lit8 v5, v5, 0x3

    new-instance v9, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;

    invoke-direct {v9, v7, v8}, Lcom/jieli/jl_rcsp/model/device/ChannelInfo;-><init>(IF)V

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setChannelInfos(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v2, p1, v1}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onFmChannelsChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    aget-byte v6, v2, v1

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    if-ne v6, v5, :cond_7

    move v6, v5

    goto :goto_2

    :cond_7
    move v6, v1

    :goto_2
    array-length v7, v2

    if-le v7, v5, :cond_8

    aget-byte v5, v2, v5

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    goto :goto_3

    :cond_8
    move v5, v1

    :goto_3
    array-length v7, v2

    if-le v7, v4, :cond_9

    const/4 v7, 0x2

    aget-byte v7, v2, v7

    aget-byte v4, v2, v4

    invoke-static {v7, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    goto :goto_4

    :cond_9
    const/4 v4, 0x0

    :goto_4
    array-length v3, v2

    const/4 v7, 0x4

    if-le v3, v7, :cond_a

    aget-byte v1, v2, v7

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    :cond_a
    new-instance v2, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;

    invoke-direct {v2, v6, v5, v4, v1}, Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;-><init>(ZIFI)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setFmStatusInfo(Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onFmStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)V

    goto/16 :goto_0

    :cond_b
    :goto_5
    return-void
.end method

.method public final d(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_8

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v2

    if-eqz v2, :cond_2

    array-length v3, v2

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v1

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_9

    if-eq v1, v5, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    goto :goto_0

    :cond_4
    aget-byte v1, v2, v6

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "music play mode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rcsp_handler"

    const-string v4, "parseMusicData"

    invoke-static {v3, v4, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setPlayModeInfo(Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onPlayModeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)V

    goto :goto_0

    :cond_5
    array-length v1, v2

    const/4 v7, 0x3

    if-le v1, v7, :cond_2

    new-array v1, v4, [B

    invoke-static {v2, v6, v1, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v1

    array-length v7, v2

    if-le v7, v4, :cond_8

    aget-byte v4, v2, v4

    and-int/lit16 v4, v4, 0xff

    if-ne v4, v5, :cond_6

    goto :goto_1

    :cond_6
    move v5, v6

    :goto_1
    array-length v4, v2

    if-le v4, v3, :cond_8

    :try_start_0
    new-instance v4, Ljava/lang/String;

    array-length v6, v2

    sub-int/2addr v6, v3

    if-eqz v5, :cond_7

    const-string v5, "gbk"

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_3

    :cond_7
    const-string v5, "utf-16le"

    :goto_2
    invoke-direct {v4, v2, v3, v6, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    const/4 v4, 0x0

    :goto_4
    new-instance v2, Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;

    invoke-direct {v2, v1, v4}, Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setMusicNameInfo(Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;->getCluster()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setCluster(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onMusicNameChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)V

    goto/16 :goto_0

    :cond_9
    aget-byte v1, v2, v6

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_a

    move v1, v5

    goto :goto_5

    :cond_a
    move v1, v6

    :goto_5
    array-length v7, v2

    if-le v7, v4, :cond_d

    new-array v7, v4, [B

    invoke-static {v2, v5, v7, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v5

    mul-int/lit16 v5, v5, 0x3e8

    array-length v8, v2

    const/16 v9, 0x8

    if-le v8, v9, :cond_c

    invoke-static {v2, v3, v7, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v3

    mul-int/lit16 v3, v3, 0x3e8

    array-length v4, v2

    const/16 v7, 0x9

    if-le v4, v7, :cond_b

    aget-byte v2, v2, v7

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    :cond_b
    :goto_6
    move v2, v6

    move v6, v5

    goto :goto_7

    :cond_c
    move v3, v6

    goto :goto_6

    :cond_d
    move v2, v6

    move v3, v2

    :goto_7
    new-instance v4, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;

    invoke-direct {v4, v1, v6, v3, v2}, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;-><init>(ZIII)V

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setMusicStatusInfo(Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;->getCurrentDev()I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setCurrentDevIndex(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1, p1, v4}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onMusicStatusChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)V

    goto/16 :goto_0

    :cond_e
    :goto_8
    return-void
.end method

.method public final e(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v5

    if-eqz v5, :cond_10

    array-length v6, v5

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v6

    const/4 v8, 0x6

    const/16 v9, 0x9

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/16 v12, 0x8

    const-string v13, "parsePublicData"

    const-string v14, "rcsp_handler"

    const/4 v15, 0x1

    const/16 v16, 0xa

    const/4 v7, 0x0

    packed-switch v6, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SYS_INFO_ATTR_SOUND_CARD : "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    array-length v0, v5

    if-lt v0, v12, :cond_1

    invoke-static {v5, v7, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToLong([BII)J

    move-result-wide v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "mask  ->  "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([BI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-array v0, v7, [B

    array-length v6, v5

    if-le v6, v12, :cond_3

    array-length v0, v5

    sub-int/2addr v0, v12

    new-array v6, v0, [B

    invoke-static {v5, v12, v6, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "values  ->  "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v6

    :cond_3
    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v8, v9, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSoundCardStatusChange(Landroid/bluetooth/BluetoothDevice;J[B)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getSoundCardEqInfo()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    aget-byte v6, v5, v7

    new-array v8, v6, [B

    invoke-static {v5, v15, v8, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setSoundCardEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSoundCardEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    goto/16 :goto_0

    :pswitch_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;-><init>()V

    invoke-virtual {v0, v15}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setDynamic(Z)V

    invoke-virtual {v0, v7}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    aget-byte v6, v5, v7

    new-array v8, v6, [I

    :goto_1
    if-ge v7, v6, :cond_5

    invoke-static {v5, v15, v11}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v9

    aput v9, v8, v7

    add-int/lit8 v7, v7, 0x1

    add-int/2addr v15, v11

    goto :goto_1

    :cond_5
    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setFreqs([I)V

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setSoundCardEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    goto/16 :goto_0

    :pswitch_4
    array-length v0, v5

    new-array v6, v0, [B

    invoke-static {v5, v7, v6, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v1, v2, v6}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;[B)V

    goto/16 :goto_0

    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "phone status change \uff1a"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aget-byte v0, v5, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setPhoneStatus(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onPhoneCallStatusChange(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_0

    :pswitch_6
    aget-byte v0, v5, v7

    if-lez v0, :cond_1

    array-length v6, v5

    mul-int/lit8 v8, v0, 0x9

    add-int/2addr v8, v15

    if-lt v6, v8, :cond_1

    new-array v6, v9, [B

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move v10, v7

    :goto_2
    if-ge v10, v0, :cond_6

    invoke-static {v5, v15, v6, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v15, v9

    invoke-static {v6}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->parse([B)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v3, v8}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setVoiceModeList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onVoiceModeList(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_7
    array-length v0, v5

    if-lt v0, v9, :cond_1

    new-array v0, v9, [B

    invoke-static {v5, v7, v0, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->parse([B)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setCurrentVoiceMode(Lcom/jieli/jl_rcsp/model/device/VoiceMode;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onCurrentVoiceMode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VoiceMode;)V

    goto/16 :goto_0

    :pswitch_8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "eq preset data-->"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v7, v5

    invoke-static {v5, v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v13, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setEqPresetInfo(Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onEqPresetChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)V

    goto/16 :goto_0

    :pswitch_9
    array-length v0, v5

    if-lt v0, v12, :cond_1

    invoke-static {v5, v7, v10}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    invoke-static {v5, v10, v10}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    iget-object v6, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v6, v2, v0, v5}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onHighAndBassChange(Landroid/bluetooth/BluetoothDevice;II)V

    goto/16 :goto_0

    :pswitch_a
    new-array v0, v7, [B

    aget-byte v6, v5, v7

    if-ne v6, v15, :cond_7

    move v6, v15

    goto :goto_3

    :cond_7
    move v6, v7

    :goto_3
    if-eqz v6, :cond_8

    array-length v9, v5

    if-le v9, v8, :cond_8

    new-array v0, v8, [B

    invoke-static {v5, v15, v0, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_8
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v0

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v6, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onPeripheralsConnectStatusChange(Landroid/bluetooth/BluetoothDevice;ZLjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_b
    aget-byte v0, v5, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onPeripheralsModeChange(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_0

    :pswitch_c
    array-length v0, v5

    if-lt v0, v11, :cond_9

    array-length v0, v5

    if-ge v0, v10, :cond_9

    new-array v0, v11, [B

    invoke-static {v5, v7, v0, v7, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v5, v0, v7

    aget-byte v0, v0, v15

    invoke-static {v5, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v7

    goto :goto_4

    :cond_9
    array-length v0, v5

    if-lt v0, v10, :cond_a

    new-array v0, v10, [B

    invoke-static {v5, v7, v0, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v7

    :cond_a
    :goto_4
    int-to-float v0, v7

    const/high16 v5, 0x41200000    # 10.0f

    div-float/2addr v0, v5

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setFrequency(F)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onFrequencyTx(Landroid/bluetooth/BluetoothDevice;F)V

    goto/16 :goto_0

    :pswitch_d
    const-string v0, "SYS_INFO_ATTR_LIGHT"

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aget-byte v0, v5, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    and-int/lit8 v6, v0, 0x3

    and-int/lit8 v0, v0, 0xc

    ushr-int/2addr v0, v11

    aget-byte v7, v5, v15

    invoke-static {v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v7

    aget-byte v11, v5, v11

    invoke-static {v11}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v11

    const/4 v13, 0x3

    aget-byte v13, v5, v13

    invoke-static {v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v13

    aget-byte v10, v5, v10

    invoke-static {v10}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v10

    const/4 v14, 0x5

    aget-byte v14, v5, v14

    invoke-static {v14}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v14

    aget-byte v8, v5, v8

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    const/4 v15, 0x7

    aget-byte v15, v5, v15

    aget-byte v12, v5, v12

    invoke-static {v15, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v12

    aget-byte v9, v5, v9

    invoke-static {v9}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v9

    aget-byte v5, v5, v16

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    invoke-static {v7, v11, v13}, Landroid/graphics/Color;->rgb(III)I

    move-result v7

    new-instance v11, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    invoke-direct {v11}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;-><init>()V

    invoke-virtual {v11, v6}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setSwitchState(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setLightMode(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setColor(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setTwinkleMode(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setTwinkleFreq(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setSceneMode(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setHue(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setSaturation(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/device/LightControlInfo;->setLuminance(I)Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setLightControlInfo(Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onLightControlInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)V

    goto/16 :goto_0

    :pswitch_e
    aget-byte v0, v5, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    aget-byte v5, v5, v7

    invoke-virtual {v3, v5}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setCurFunction(B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onDeviceModeChange >> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v13, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onDeviceModeChange(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_0

    :pswitch_f
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_5
    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setPlayFileFormat(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onFileFormatChange(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_10
    aget-byte v0, v5, v7

    and-int/lit16 v6, v0, 0x80

    const/16 v8, 0x80

    if-ne v6, v8, :cond_b

    move v6, v15

    goto :goto_6

    :cond_b
    move v6, v7

    :goto_6
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    and-int/lit8 v0, v0, 0x7f

    new-instance v8, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {v8}, Lcom/jieli/jl_rcsp/model/device/EqInfo;-><init>()V

    invoke-virtual {v8, v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    invoke-virtual {v8, v6}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setDynamic(Z)V

    if-eqz v6, :cond_e

    aget-byte v0, v5, v15

    new-array v6, v0, [B

    invoke-static {v5, v11, v6, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v8, v6}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    move-object/from16 v6, p2

    invoke-virtual {v1, v6}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object v0

    if-nez v0, :cond_c

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getEqPresetInfo()Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object v0

    :cond_c
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->getFreqs()[I

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setFreqs([I)V

    :cond_d
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "eq data freq-->"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_e
    move-object/from16 v6, p2

    new-array v0, v7, [B

    array-length v9, v5

    move/from16 v10, v16

    if-le v9, v10, :cond_f

    new-array v0, v10, [B

    invoke-static {v5, v15, v0, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_f
    invoke-virtual {v8, v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    :goto_7
    invoke-virtual {v3, v8}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onEqChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    goto/16 :goto_0

    :pswitch_11
    move-object/from16 v6, p2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;-><init>()V

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;->parseData([B)V

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setDevStorageInfo(Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onDevStorageInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)V

    goto/16 :goto_0

    :pswitch_12
    move-object/from16 v6, p2

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getMaxVol()I

    move-result v0

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportVolumeSync()Z

    move-result v8

    aget-byte v5, v5, v7

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVolume(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    new-instance v7, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;

    invoke-direct {v7, v0, v5, v8}, Lcom/jieli/jl_rcsp/model/device/VolumeInfo;-><init>(IIZ)V

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v7}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onVolumeChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/VolumeInfo;)V

    goto/16 :goto_0

    :pswitch_13
    move-object/from16 v6, p2

    aget-byte v0, v5, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    new-instance v5, Lcom/jieli/jl_rcsp/model/device/BatteryInfo;

    invoke-direct {v5, v0}, Lcom/jieli/jl_rcsp/model/device/BatteryInfo;-><init>(I)V

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v5}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onBatteryChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V

    goto/16 :goto_0

    :cond_10
    move-object/from16 v6, p2

    goto/16 :goto_0

    :cond_11
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final f(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    if-nez v0, :cond_0

    goto/16 :goto_e

    :cond_0
    iget-object v3, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v3, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v3

    if-nez v3, :cond_1

    goto/16 :goto_e

    :cond_1
    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b(Ljava/util/List;)I

    move-result v4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v6

    if-eqz v6, :cond_2

    array-length v7, v6

    if-nez v7, :cond_3

    :cond_2
    :goto_1
    move-object/from16 v19, v5

    goto/16 :goto_d

    :cond_3
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v7

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v7, v11, :cond_e

    const-string v13, "parseRTCData"

    const-string v14, "rcsp_handler"

    const/4 v15, 0x3

    const/4 v8, 0x2

    if-eq v7, v8, :cond_9

    if-eq v7, v15, :cond_9

    if-eq v7, v10, :cond_7

    if-eq v7, v9, :cond_5

    const/4 v0, 0x7

    if-eq v7, v0, :cond_4

    goto :goto_1

    :cond_4
    aget-byte v0, v6, v12

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmExpandFlag(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "parse alarm default bell "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aget-byte v0, v6, v12

    and-int/lit8 v0, v0, 0xf

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    array-length v8, v6

    if-ge v11, v8, :cond_6

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-ge v8, v0, :cond_6

    add-int/lit8 v8, v11, 0x1

    aget-byte v9, v6, v11

    add-int/lit8 v11, v11, 0x2

    aget-byte v8, v6, v8

    new-array v10, v8, [B

    invoke-static {v6, v11, v10, v12, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v11, v8

    new-instance v8, Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;

    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v10}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v8, v9, v13, v12}, Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;-><init>(ILjava/lang/String;Z)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v3, v7}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmDefaultBells(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v7}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmDefaultBellListChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "parse alarm ver "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v13, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmVersion(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v4, v6}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;-><init>(ILjava/util/List;)V

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmListInfo(Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    goto/16 :goto_1

    :cond_8
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->setVersion(I)V

    goto/16 :goto_1

    :cond_9
    aget-byte v6, v6, v12

    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->getAlarmBeans()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_b

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-virtual {v8}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->getIndex()B

    move-result v9

    if-ne v6, v9, :cond_a

    invoke-virtual {v8}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->copy()Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v8

    goto :goto_3

    :cond_b
    const/4 v8, 0x0

    :goto_3
    if-nez v8, :cond_c

    new-instance v8, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-direct {v8}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;-><init>()V

    int-to-byte v7, v6

    invoke-virtual {v8, v7}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    const-string v7, "Alarm"

    invoke-virtual {v8, v7}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    const/16 v9, 0xb

    invoke-virtual {v7, v9}, Ljava/util/Calendar;->get(I)I

    move-result v9

    int-to-byte v9, v9

    invoke-virtual {v8, v9}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setHour(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    const/16 v9, 0xc

    invoke-virtual {v7, v9}, Ljava/util/Calendar;->get(I)I

    move-result v7

    int-to-byte v7, v7

    invoke-virtual {v8, v7}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setMin(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    :cond_c
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "index = "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v14, v13, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v0

    if-ne v0, v15, :cond_d

    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmStop(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    goto/16 :goto_1

    :cond_d
    iget-object v0, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, v2, v8}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmNotify(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmBean;)V

    goto/16 :goto_1

    :cond_e
    aget-byte v0, v6, v12

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-lez v7, :cond_16

    move v0, v11

    move v13, v12

    :goto_4
    if-ge v13, v7, :cond_15

    array-length v14, v6

    sub-int/2addr v14, v0

    if-le v14, v9, :cond_15

    add-int/lit8 v14, v0, 0x1

    aget-byte v15, v6, v0

    add-int/lit8 v16, v0, 0x2

    aget-byte v14, v6, v14

    invoke-static {v14}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v14

    if-ne v14, v11, :cond_f

    move v14, v11

    goto :goto_5

    :cond_f
    move v14, v12

    :goto_5
    add-int/lit8 v17, v0, 0x3

    aget-byte v9, v6, v16

    add-int/lit8 v16, v0, 0x4

    aget-byte v12, v6, v17

    add-int/lit8 v17, v0, 0x5

    aget-byte v10, v6, v16

    add-int/lit8 v11, v0, 0x6

    aget-byte v0, v6, v17

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    move/from16 v17, v4

    array-length v4, v6

    sub-int/2addr v4, v11

    if-le v0, v4, :cond_10

    :goto_6
    move-object/from16 v19, v5

    goto/16 :goto_b

    :cond_10
    if-lez v0, :cond_11

    :try_start_0
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v6, v11, v0}, Ljava/lang/String;-><init>([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v11, v0

    goto :goto_7

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_11
    const/4 v4, 0x0

    :goto_7
    if-nez v17, :cond_12

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmVersion()I

    move-result v0

    move-object/from16 v19, v5

    move v5, v0

    goto :goto_8

    :cond_12
    move-object/from16 v19, v5

    move/from16 v5, v17

    :goto_8
    array-length v0, v6

    sub-int/2addr v0, v11

    const-string v17, ""

    move/from16 v20, v7

    const/4 v7, 0x1

    if-ne v5, v7, :cond_14

    const/4 v7, 0x6

    if-le v0, v7, :cond_14

    add-int/lit8 v0, v11, 0x1

    aget-byte v7, v6, v11

    move/from16 v21, v0

    add-int/lit8 v0, v11, 0x2

    aget-byte v21, v6, v21

    move/from16 v22, v7

    move/from16 v18, v11

    const/4 v7, 0x4

    new-array v11, v7, [B

    move/from16 v23, v13

    const/4 v13, 0x0

    invoke-static {v6, v0, v11, v13, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v11}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v11

    add-int/lit8 v0, v18, 0x6

    add-int/lit8 v7, v18, 0x7

    aget-byte v0, v6, v0

    and-int/lit16 v0, v0, 0xff

    array-length v13, v6

    sub-int/2addr v13, v7

    if-gt v0, v13, :cond_13

    :try_start_1
    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v6, v7, v0}, Ljava/lang/String;-><init>([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/2addr v7, v0

    move-object/from16 v18, v6

    move/from16 v17, v7

    move/from16 v0, v21

    :goto_9
    move/from16 v7, v22

    goto :goto_a

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_13
    move-object/from16 v18, v6

    move-object/from16 v13, v17

    move/from16 v0, v21

    move/from16 v17, v7

    goto :goto_9

    :cond_14
    move/from16 v18, v11

    move/from16 v23, v13

    move-object/from16 v13, v17

    move/from16 v17, v18

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v6

    :goto_a
    new-instance v6, Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    invoke-direct {v6}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;-><init>()V

    invoke-virtual {v6, v5}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setVersion(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v6

    invoke-virtual {v6, v15}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v6

    invoke-virtual {v6, v9}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setRepeatMode(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setDevIndex(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setHour(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setMin(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellCluster(I)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setBellType(B)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/jieli/jl_rcsp/model/device/AlarmBean;->setOpen(Z)Lcom/jieli/jl_rcsp/model/device/AlarmBean;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v23, 0x1

    move v4, v5

    move/from16 v0, v17

    move-object/from16 v6, v18

    move-object/from16 v5, v19

    move/from16 v7, v20

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x1

    const/4 v12, 0x0

    goto/16 :goto_4

    :cond_15
    move/from16 v17, v4

    goto/16 :goto_6

    :goto_b
    move/from16 v4, v17

    goto :goto_c

    :cond_16
    move-object/from16 v19, v5

    :goto_c
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    invoke-direct {v0, v8}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->setVersion(I)V

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmListInfo(Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iget-object v5, v1, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v5, v2, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onAlarmListChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)V

    :goto_d
    move-object/from16 v5, v19

    goto/16 :goto_0

    :cond_17
    :goto_e
    return-void
.end method

.method public parseAttrMessage(Landroid/bluetooth/BluetoothDevice;BLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "B",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    if-eqz p2, :cond_5

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->c(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void

    :cond_2
    invoke-virtual {p0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void

    :cond_3
    invoke-virtual {p0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->f(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void

    :cond_4
    invoke-virtual {p0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->d(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void

    :cond_5
    invoke-virtual {p0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void

    :cond_6
    invoke-virtual {p0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->e(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    :cond_7
    :goto_0
    return-void
.end method

.method public parseHealthSetting(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getHealthSettingInfo()Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;-><init>()V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setHealthSettingInfo(Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v3

    invoke-virtual {v1, v3}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setFuncFlag(I)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setEmergencyContact(Lcom/jieli/jl_rcsp/model/device/health/EmergencyContact;)V

    goto :goto_1

    :pswitch_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setBloodOxygenMeasurementAlert(Lcom/jieli/jl_rcsp/model/device/health/BloodOxygenMeasurementAlert;)V

    goto :goto_1

    :pswitch_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setDisconnectReminder(Lcom/jieli/jl_rcsp/model/device/health/DisconnectReminder;)V

    goto :goto_1

    :pswitch_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/UserInfo;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setUserInfo(Lcom/jieli/jl_rcsp/model/device/health/UserInfo;)V

    goto :goto_1

    :pswitch_4
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setLiftWristDetection(Lcom/jieli/jl_rcsp/model/device/health/LiftWristDetection;)V

    goto :goto_1

    :pswitch_5
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/FallDetection;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setFallDetection(Lcom/jieli/jl_rcsp/model/device/health/FallDetection;)V

    goto :goto_1

    :pswitch_6
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setSleepDetection(Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;)V

    goto :goto_1

    :pswitch_7
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setAutomaticPressureDetection(Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;)V

    goto :goto_1

    :pswitch_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setExerciseHeartRateReminder(Lcom/jieli/jl_rcsp/model/device/health/ExerciseHeartRateReminder;)V

    goto :goto_1

    :pswitch_9
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setHeartRateMeasure(Lcom/jieli/jl_rcsp/model/device/health/HeartRateMeasure;)V

    goto :goto_1

    :pswitch_a
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;-><init>([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setSedentaryReminder(Lcom/jieli/jl_rcsp/model/device/health/SedentaryReminder;)V

    goto :goto_1

    :pswitch_b
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v2, v3, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;-><init>(I)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->setSensorInfo(Lcom/jieli/jl_rcsp/model/device/health/SensorInfo;)V

    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->b:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;->cloneObject()Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onHealthSettingChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)V

    goto/16 :goto_0

    :cond_2
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
