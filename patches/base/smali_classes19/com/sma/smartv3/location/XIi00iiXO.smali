.class public abstract Lcom/sma/smartv3/location/XIi00iiXO;
.super Lcom/baidu/location/BDAbstractLocationListener;
.source "SourceFile"


# instance fields
.field public OXO1:J

.field public XIi00iiXO:J

.field public iO:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/baidu/location/BDAbstractLocationListener;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/sma/smartv3/location/XIi00iiXO;->XIi00iiXO:J

    const/16 v0, 0xa1

    iput v0, p0, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    return-void
.end method


# virtual methods
.method public final I0IIOi(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/location/XIi00iiXO;->XIi00iiXO:J

    return-void
.end method

.method public final IO(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    return-void
.end method

.method public abstract IiI10X(Lcom/sma/smartv3/location/CustomLocation;)V
    .param p1    # Lcom/sma/smartv3/location/CustomLocation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public abstract O00(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public final OIi0(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    return-void
.end method

.method public final OXO1(I)Lcom/sma/smartv3/location/CustomLocation$TYPE;
    .locals 1

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa1

    if-eq p1, v0, :cond_0

    sget-object p1, Lcom/sma/smartv3/location/CustomLocation$TYPE;->OTHER:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    return-object p1

    :cond_0
    sget-object p1, Lcom/sma/smartv3/location/CustomLocation$TYPE;->NET:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    return-object p1

    :cond_1
    sget-object p1, Lcom/sma/smartv3/location/CustomLocation$TYPE;->NORMAL:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    return-object p1
.end method

.method public final XIi00iiXO()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/location/XIi00iiXO;->XIi00iiXO:J

    return-wide v0
.end method

.method public final XO0O10()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    return-wide v0
.end method

.method public final XOO0ii0(Lcom/baidu/location/BDLocation;)J
    .locals 4

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getTime()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->i0XI0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getTime()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_2
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final iO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    return v0
.end method

.method public onReceiveLocation(Lcom/baidu/location/BDLocation;)V
    .locals 20
    .param p1    # Lcom/baidu/location/BDLocation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "location"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v0

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getCoorType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v4

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getLocTypeDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/location/XIi00iiXO;->XOO0ii0(Lcom/baidu/location/BDLocation;)J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Lcom/baidu/location/BDLocation;->setTimeStamp(J)V

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getAddress()Lcom/baidu/location/Address;

    move-result-object v6

    iget-object v6, v6, Lcom/baidu/location/Address;->address:Ljava/lang/String;

    if-eqz v6, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "onReceiveLocation -> address:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    :cond_1
    iget-wide v6, v1, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    const-wide/16 v8, -0x1

    cmp-long v6, v6, v8

    const/4 v7, 0x1

    if-nez v6, :cond_2

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v8

    iput-wide v8, v1, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    iput v4, v1, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    :goto_0
    move v6, v7

    goto :goto_1

    :cond_2
    iget v6, v1, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    if-ne v6, v4, :cond_3

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v8

    iput-wide v8, v1, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    iput v4, v1, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v8

    iget-wide v10, v1, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    sub-long/2addr v8, v10

    iget-wide v10, v1, Lcom/sma/smartv3/location/XIi00iiXO;->XIi00iiXO:J

    cmp-long v6, v8, v10

    if-lez v6, :cond_4

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v8

    iput-wide v8, v1, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1:J

    iput v4, v1, Lcom/sma/smartv3/location/XIi00iiXO;->iO:I

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    :goto_1
    :try_start_0
    sget-object v8, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v8}, Lcom/android/mltcode/paycertificationapi/i72;->XXI0XOIX()Z

    move-result v8

    if-eqz v8, :cond_5

    sget-object v8, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v8}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v8

    const-string v9, "LOCATION_FUNCTION_STATUS_GOING"

    invoke-virtual {v8, v9, v7, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;ZZ)V

    const-wide/16 v7, 0x5dc

    iput-wide v7, v1, Lcom/sma/smartv3/location/XIi00iiXO;->XIi00iiXO:J

    goto :goto_2

    :catch_0
    move-exception v0

    move v7, v6

    goto/16 :goto_3

    :cond_5
    :goto_2
    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getAltitude()D

    move-result-wide v12

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getSpeed()F

    move-result v14

    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getGpsAccuracyStatus()I

    move-result v15

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getGpsCheckStatus()I

    move-result v2

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->isAppForeground()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move/from16 v16, v6

    move-object/from16 v17, v7

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v6

    move-wide/from16 v18, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onReceiveLocation -> latitude="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ", longitude="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ", altitude="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ", speed="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v7, ", radius="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", coorType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", locType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", locTypeDescription="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", GPS="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", gpsCheckStatus="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isAppForeground="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", timeStamp = "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v0, v18

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", isSendLocation="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    move/from16 v7, v16

    :try_start_2
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    move/from16 v7, v16

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_4
    if-eqz v7, :cond_7

    const/16 v0, 0x3d

    if-eq v4, v0, :cond_6

    const/16 v0, 0xa1

    if-eq v4, v0, :cond_6

    const/16 v0, 0x41

    if-eq v4, v0, :cond_6

    const/16 v0, 0x42

    if-eq v4, v0, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getLocTypeDescription()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/location/XIi00iiXO;->O00(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    move-object/from16 v1, p0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getAltitude()D

    move-result-wide v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "APP_LAST_LOCATION_INFO"

    invoke-virtual {v0, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {v3, v2, v0, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance v5, Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getAltitude()D

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getSpeed()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getTimeStamp()J

    move-result-wide v14

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/location/XIi00iiXO;->OXO1(I)Lcom/sma/smartv3/location/CustomLocation$TYPE;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getDirection()F

    move-result v17

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v18

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v19

    const/4 v13, 0x1

    invoke-direct/range {v5 .. v19}, Lcom/sma/smartv3/location/CustomLocation;-><init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFF)V

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/location/XIi00iiXO;->IiI10X(Lcom/sma/smartv3/location/CustomLocation;)V

    goto :goto_5

    :cond_7
    move-object/from16 v1, p0

    :goto_5
    return-void
.end method
