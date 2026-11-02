.class public final Lcom/sma/smartv3/model/LocationData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationData.kt\ncom/sma/smartv3/model/LocationData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1563#2:240\n1634#2,3:241\n1563#2:244\n1634#2,3:245\n1563#2:248\n1634#2,3:249\n*S KotlinDebug\n*F\n+ 1 LocationData.kt\ncom/sma/smartv3/model/LocationData\n*L\n60#1:240\n60#1:241,3\n74#1:244\n74#1:245,3\n85#1:248\n85#1:249,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLocationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationData.kt\ncom/sma/smartv3/model/LocationData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1563#2:240\n1634#2,3:241\n1563#2:244\n1634#2,3:245\n1563#2:248\n1634#2,3:249\n*S KotlinDebug\n*F\n+ 1 LocationData.kt\ncom/sma/smartv3/model/LocationData\n*L\n60#1:240\n60#1:241,3\n74#1:244\n74#1:245,3\n85#1:248\n85#1:249,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/LocationData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/LocationData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/LocationData;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/LocationData;->INSTANCE:Lcom/sma/smartv3/model/LocationData;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getFinalLocationList$default(Lcom/sma/smartv3/model/LocationData;Ljava/util/List;ZZILjava/lang/Object;)Ljava/util/ArrayList;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/model/LocationData;->getFinalLocationList(Ljava/util/List;ZZ)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSmoothLocationListAlgorithm$default(Lcom/sma/smartv3/model/LocationData;Ljava/util/ArrayList;IILjava/lang/Object;)Ljava/util/ArrayList;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x7

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/LocationData;->getSmoothLocationListAlgorithm(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getFinalLocationList(Ljava/util/List;ZZ)Ljava/util/ArrayList;
    .locals 17
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Location;",
            ">;ZZ)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "locationList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_7

    const/16 v2, 0xa

    if-eqz p2, :cond_3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMSource()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Location;

    new-instance v4, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v9

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v11

    const/16 v13, 0x10

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v1

    :cond_2
    new-instance v2, Lcom/baidu/mapapi/utils/CoordinateConverter;

    invoke-direct {v2}, Lcom/baidu/mapapi/utils/CoordinateConverter;-><init>()V

    sget-object v3, Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;->GPS:Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/utils/CoordinateConverter;->from(Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;)Lcom/baidu/mapapi/utils/CoordinateConverter;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Location;

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v7

    float-to-double v7, v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/utils/CoordinateConverter;->coord(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/utils/CoordinateConverter;

    move-result-object v4

    invoke-virtual {v4}, Lcom/baidu/mapapi/utils/CoordinateConverter;->convert()Lcom/baidu/mapapi/model/LatLng;

    move-result-object v4

    new-instance v5, Lcom/sma/smartv3/model/CustomLatLng;

    iget-wide v6, v4, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v8, v4, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v10

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v12

    const/16 v14, 0x10

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-eqz p3, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Location;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OXO1:Lcom/android/mltcode/paycertificationapi/i01I1i1X;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OIi0(DD)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    new-instance v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v11

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v13

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v1

    :cond_5
    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Location;

    new-instance v4, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v9

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v11

    const/16 v13, 0x10

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_7
    return-object v1
.end method

.method public final getGpxFileString(Ljava/util/ArrayList;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "locationList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OIX0iXi()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><gpx creator=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "\' version=\"1.1\" xmlns=\'http://www.topografix.com/GPX/1/1\'><metadata><time>"

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-long v3, v1

    sub-long/2addr p2, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "</time></metadata>"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "<trk><name>"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "</name><desc>"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p3

    const p4, 0x7f140142

    invoke-virtual {p3, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "</desc><trkseg>"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p3

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_0

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p5

    const-string v1, "get(...)"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Lcom/sma/smartv3/model/CustomLatLng;

    const-string v1, "<wpt lat=\'"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "\' lon=\'"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v5, "\'><name>\""

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p4, p4, 0x1

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "\"</name><ele>"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "</ele><time>"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "</time></wpt>"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "<trkpt lat=\'"

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "\'><ele>"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v5

    sub-long/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p5

    invoke-virtual {v0, p5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, "</time></trkpt>"

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_0
    const-string p1, "</trkseg></trk>"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</gpx>"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getSmoothLocationListAlgorithm(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 23
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;I)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "locationList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0xc

    const/16 v3, 0x64

    const/4 v4, 0x5

    if-eq v1, v2, :cond_0

    const/16 v2, 0xd

    if-eq v1, v2, :cond_0

    const/16 v2, 0x13

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0xb

    goto :goto_0

    :pswitch_0
    const/16 v4, 0xa

    :cond_0
    :pswitch_1
    move v1, v3

    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Lcom/sma/smartv3/model/CustomLatLng;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v13}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v13

    const/16 v14, 0x10

    const/4 v15, 0x0

    move/from16 v16, v6

    move-wide v6, v7

    move-wide v8, v9

    move-wide v10, v11

    move v12, v13

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/sma/smartv3/model/CustomLatLng;

    const/16 v15, 0x10

    const/16 v16, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_4

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "get(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v12

    cmpg-double v10, v10, v12

    if-nez v10, :cond_1

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v12

    cmpg-double v10, v10, v12

    if-nez v10, :cond_1

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    :goto_2
    const/4 v10, 0x0

    goto/16 :goto_3

    :cond_1
    new-instance v10, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v13

    invoke-direct {v10, v11, v12, v13, v14}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v11, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v14

    invoke-direct {v11, v12, v13, v14, v15}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v10, v11}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)D

    move-result-wide v10

    int-to-double v12, v3

    mul-double/2addr v10, v12

    invoke-static {v10, v11}, Lcom/android/mltcode/paycertificationapi/mc0;->iIi1(D)I

    move-result v10

    int-to-float v10, v10

    const/high16 v11, 0x42c80000    # 100.0f

    div-float/2addr v10, v11

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v13

    sub-long/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    const/16 v13, 0x3e8

    int-to-long v13, v13

    div-long/2addr v11, v13

    long-to-float v11, v11

    div-float/2addr v10, v11

    int-to-float v11, v4

    cmpl-float v11, v10, v11

    if-ltz v11, :cond_3

    int-to-float v11, v1

    cmpl-float v10, v10, v11

    if-ltz v10, :cond_2

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    goto :goto_2

    :cond_2
    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v6, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v6, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v10

    invoke-virtual {v6, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v10

    invoke-virtual {v6, v10}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v12

    add-double/2addr v10, v12

    const/4 v12, 0x2

    int-to-double v12, v12

    div-double/2addr v10, v12

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v14

    add-double/2addr v10, v14

    div-double/2addr v10, v12

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    goto/16 :goto_2

    :cond_3
    const-wide/16 v10, 0x0

    invoke-virtual {v6, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v6, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    const-wide/16 v10, 0x0

    invoke-virtual {v6, v10, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    const/4 v10, 0x0

    invoke-virtual {v6, v10}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    :goto_3
    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v11

    invoke-virtual {v5, v11}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    new-instance v12, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v13

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v15

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v17

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v19

    const/16 v21, 0x10

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v12 .. v22}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
