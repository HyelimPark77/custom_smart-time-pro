.class public final Lcom/sma/smartv3/db/entity/WorkoutIndex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mEndTime"
            }
        .end subannotation,
        .subannotation Landroidx/room/Index;
            value = {
                "mSyncStatus"
            }
        .end subannotation
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/entity/WorkoutIndex$Companion;
    }
.end annotation


# static fields
.field public static final ALL_SYNCED:I = 0x1

.field public static final Companion:Lcom/sma/smartv3/db/entity/WorkoutIndex$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FITBIT_SYNCED:I = 0x2

.field public static final FROM_ACTIVITY:I = 0x1

.field public static final FROM_WORKOUT:I = 0x2

.field public static final STRAVA_SYNCED:I = 0x1


# instance fields
.field private mEndTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFrom:I
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

.field private mMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSyncStatus:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/db/entity/WorkoutIndex$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/db/entity/WorkoutIndex$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->Companion:Lcom/sma/smartv3/db/entity/WorkoutIndex$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/db/entity/WorkoutIndex;-><init>(IIJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIJII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    .line 5
    iput-wide p3, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    .line 6
    iput p5, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    .line 7
    iput p6, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    return-void
.end method

.method public synthetic constructor <init>(IIJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p5, v0

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    move p7, v0

    :goto_0
    move p6, p5

    move-wide p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p7, p6

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/db/entity/WorkoutIndex;-><init>(IIJII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/WorkoutIndex;IIJIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/WorkoutIndex;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p3, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p5, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget p6, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    :cond_4
    move p7, p5

    move p8, p6

    move-wide p5, p3

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/db/entity/WorkoutIndex;->copy(IIJII)Lcom/sma/smartv3/db/entity/WorkoutIndex;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    return v0
.end method

.method public final copy(IIJII)Lcom/sma/smartv3/db/entity/WorkoutIndex;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/db/entity/WorkoutIndex;

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/db/entity/WorkoutIndex;-><init>(IIJII)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;

    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMEndTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    return-wide v0
.end method

.method public final getMFrom()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    return v0
.end method

.method public final getMSyncStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMEndTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    return-void
.end method

.method public final setMFrom(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    return-void
.end method

.method public final setMSyncStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mId:I

    iget v1, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mFrom:I

    iget-wide v2, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mEndTime:J

    iget v4, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mMode:I

    iget v5, p0, Lcom/sma/smartv3/db/entity/WorkoutIndex;->mSyncStatus:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "WorkoutIndex(mId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mFrom="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mEndTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mMode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mSyncStatus="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
