.class public final Lcom/sma/smartv3/db/entity/HanBaoVibration;
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
.field private mBOValue:I
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

.field private mIsSnore:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mVibration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/sma/smartv3/db/entity/HanBaoVibration;-><init>(IJLjava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;IIII)V
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
    iput p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    .line 7
    iput p6, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    .line 8
    iput p7, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    .line 9
    iput p8, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    .line 10
    const-string p4, ""

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p5, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move p6, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p7, v0

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    move p9, v0

    :goto_0
    move p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/sma/smartv3/db/entity/HanBaoVibration;-><init>(IJLjava/lang/String;IIII)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleHanBaoVibration;J)V
    .locals 15
    .param p1    # Lcom/szabh/smable3/entity/BleHanBaoVibration;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleHanBaoVibration"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHanBaoVibration;->getMTime()I

    move-result v0

    const v2, 0x386d4380

    add-int/2addr v0, v2

    int-to-long v2, v0

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    sub-long v6, v2, p2

    .line 13
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHanBaoVibration;->getMVibration()I

    move-result v9

    .line 14
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHanBaoVibration;->getMBOValue()I

    move-result v10

    .line 15
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHanBaoVibration;->getMIsSnore()I

    move-result v11

    const/16 v13, 0x45

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move-object v4, p0

    .line 16
    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/db/entity/HanBaoVibration;-><init>(IJLjava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/HanBaoVibration;IJLjava/lang/String;IIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/HanBaoVibration;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-wide p2, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p4, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p5, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p6, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p7, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget p8, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    :cond_6
    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move-object p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/sma/smartv3/db/entity/HanBaoVibration;->copy(IJLjava/lang/String;IIII)Lcom/sma/smartv3/db/entity/HanBaoVibration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    return v0
.end method

.method public final copy(IJLjava/lang/String;IIII)Lcom/sma/smartv3/db/entity/HanBaoVibration;
    .locals 10
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/HanBaoVibration;

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/db/entity/HanBaoVibration;-><init>(IJLjava/lang/String;IIII)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;

    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMBOValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    return v0
.end method

.method public final getMIsSnore()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    return-wide v0
.end method

.method public final getMVibration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMBOValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    return-void
.end method

.method public final setMIsSnore(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

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

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    return-void
.end method

.method public final setMVibration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mId:I

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mTime:J

    iget-object v3, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mLocalTime:Ljava/lang/String;

    iget v4, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mVibration:I

    iget v5, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mBOValue:I

    iget v6, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSnore:I

    iget v7, p0, Lcom/sma/smartv3/db/entity/HanBaoVibration;->mIsSync:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "HanBaoVibration(mId="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mTime="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mLocalTime="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mVibration="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mBOValue="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsSnore="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsSync="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
