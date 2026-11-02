.class public final Lcom/sma/smartv3/ui/sport/XO0O10$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/XO0O10;->Ii0i(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "loc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    new-instance v2, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "format(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/SportData;->getMMode()I

    move-result v7

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/android/mltcode/paycertificationapi/mc0;->iIi1(D)I

    move-result v8

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v9

    double-to-float v9, v9

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v10

    double-to-float v10, v10

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->XOO0ii0()I

    move-result v11

    const/16 v14, 0x300

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Lcom/sma/smartv3/db/entity/Location;-><init>(IJLjava/lang/String;IIFFIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lcom/sma/smartv3/location/iO;->OXO1:Lcom/sma/smartv3/location/iO;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v3, v0, v4, v5, v4}, Lcom/sma/smartv3/location/iO;->iO(Lcom/sma/smartv3/location/iO;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/db/entity/Location;->setMActivityMode(I)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->XX0(Lcom/sma/smartv3/db/entity/Location;)V

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Location;

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v6

    float-to-double v6, v6

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v3

    float-to-double v8, v3

    invoke-direct {v4, v6, v7, v8, v9}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v3, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v8

    invoke-direct {v3, v6, v7, v8, v9}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v4, v3}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)D

    move-result-wide v3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpg-double v6, v3, v6

    if-gez v6, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SportManager onLocationChange -> too short tmpDistance="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/sma/smartv3/ui/sport/XO0O10;->XXI()I

    move-result v6

    double-to-int v3, v3

    add-int/2addr v6, v3

    invoke-static {v6}, Lcom/sma/smartv3/ui/sport/XO0O10;->XiOIO(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    const/4 v4, 0x3

    if-eq v3, v5, :cond_3

    if-eq v3, v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v5}, Lcom/sma/smartv3/db/entity/Location;->setMActivityMode(I)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->XX0(Lcom/sma/smartv3/db/entity/Location;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMActivityMode()I

    move-result v3

    if-eq v3, v4, :cond_4

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/Location;->setMActivityMode(I)V

    :cond_4
    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->XX0(Lcom/sma/smartv3/db/entity/Location;)V

    goto :goto_0

    :cond_5
    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/XO0O10;->XX0(Lcom/sma/smartv3/db/entity/Location;)V

    :goto_0
    sget-object v5, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v5}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->I10Oi0()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v6, Lcom/szabh/smable3/BleKey;->SAI_WEI_SPORT_LOCATION:Lcom/szabh/smable3/BleKey;

    sget-object v7, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v1

    double-to-float v10, v1

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v1

    double-to-float v9, v1

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/mc0;->iIi1(D)I

    move-result v11

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->XIi00iiXO()F

    move-result v12

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi()F

    move-result v13

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->iO()F

    move-result v14

    invoke-virtual {v0}, Lcom/sma/smartv3/location/CustomLocation;->IO()F

    move-result v15

    new-instance v8, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;

    invoke-direct/range {v8 .. v15}, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;-><init>(FFIFFFF)V

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void

    :cond_6
    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0O(Lcom/sma/smartv3/ui/sport/XO0O10;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v3

    filled-new-array {v2}, [Lcom/sma/smartv3/db/entity/Location;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/sma/smartv3/db/dao/LocationDao;->insert(Ljava/util/List;)[J

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O0O0X0iOi(Lcom/sma/smartv3/location/CustomLocation;)V

    :cond_7
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SportManager gps error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
