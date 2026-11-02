.class public final Lcom/sma/smartv3/db/entity/Location;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mTime"
            }
        .end subannotation
    }
.end annotation


# instance fields
.field private mActivityMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private final mId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private mIsBaiDuSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLatitude:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLongitude:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSource:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x3ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/sma/smartv3/db/entity/Location;-><init>(IJLjava/lang/String;IIFFIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;IIFFIII)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLocalTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    .line 7
    iput p6, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    .line 8
    iput p7, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    .line 9
    iput p8, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    .line 10
    iput p9, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    .line 11
    iput p10, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    .line 12
    iput p11, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;IIFFIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    .line 13
    const-string p4, ""

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move p5, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move p6, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    const/4 v1, 0x0

    if-eqz p13, :cond_5

    move p7, v1

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p8, v1

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p9, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p10, v0

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    move p12, v0

    :goto_0
    move p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/sma/smartv3/db/entity/Location;-><init>(IJLjava/lang/String;IIFFIII)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleLocation;J)V
    .locals 18
    .param p1    # Lcom/szabh/smable3/entity/BleLocation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleLocation"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleLocation;->getMTime()I

    move-result v0

    const v2, 0x386d4380

    add-int/2addr v0, v2

    int-to-long v2, v0

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    sub-long v6, v2, p2

    .line 16
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleLocation;->getMActivityMode()I

    move-result v9

    .line 17
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleLocation;->getMAltitude()I

    move-result v10

    .line 18
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleLocation;->getMLongitude()F

    move-result v11

    .line 19
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleLocation;->getMLatitude()F

    move-result v12

    const/16 v16, 0x385

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v4, p0

    .line 20
    invoke-direct/range {v4 .. v17}, Lcom/sma/smartv3/db/entity/Location;-><init>(IJLjava/lang/String;IIFFIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/Location;IJLjava/lang/String;IIFFIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/Location;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-wide p2, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p4, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p5, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p6, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget p7, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p8, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p9, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p10, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    iget p11, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    :cond_9
    move p12, p10

    move p13, p11

    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move-object p6, p4

    move p7, p5

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/sma/smartv3/db/entity/Location;->copy(IJLjava/lang/String;IIFFIII)Lcom/sma/smartv3/db/entity/Location;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    return v0
.end method

.method public final copy(IJLjava/lang/String;IIFFIII)Lcom/sma/smartv3/db/entity/Location;
    .locals 13
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/Location;

    move v2, p1

    move-wide v3, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/sma/smartv3/db/entity/Location;-><init>(IJLjava/lang/String;IIFFIII)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/Location;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/Location;

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMActivityMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    return v0
.end method

.method public final getMIsBaiDuSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    return v0
.end method

.method public final getMLatitude()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLongitude()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    return v0
.end method

.method public final getMSource()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMActivityMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    return-void
.end method

.method public final setMIsBaiDuSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    return-void
.end method

.method public final setMLatitude(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    return-void
.end method

.method public final setMLocalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMLongitude(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    return-void
.end method

.method public final setMSource(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/db/entity/Location;->mId:I

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Location;->mTime:J

    iget-object v3, p0, Lcom/sma/smartv3/db/entity/Location;->mLocalTime:Ljava/lang/String;

    iget v4, p0, Lcom/sma/smartv3/db/entity/Location;->mActivityMode:I

    iget v5, p0, Lcom/sma/smartv3/db/entity/Location;->mAltitude:I

    iget v6, p0, Lcom/sma/smartv3/db/entity/Location;->mLongitude:F

    iget v7, p0, Lcom/sma/smartv3/db/entity/Location;->mLatitude:F

    iget v8, p0, Lcom/sma/smartv3/db/entity/Location;->mSource:I

    iget v9, p0, Lcom/sma/smartv3/db/entity/Location;->mIsSync:I

    iget v10, p0, Lcom/sma/smartv3/db/entity/Location;->mIsBaiDuSync:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Location(mId="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mTime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mLocalTime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mActivityMode="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mAltitude="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mLongitude="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", mLatitude="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", mSource="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsSync="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsBaiDuSync="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
