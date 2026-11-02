.class public final Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchTrainingSettings3$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMatchTrainingSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchTrainingSettings3.kt\ncom/szabh/smable3/entity/BleMatchTrainingSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMatchTrainingSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchTrainingSettings3.kt\ncom/szabh/smable3/entity/BleMatchTrainingSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchTrainingSettings3$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x19


# instance fields
.field private mFinshRestingTime:I

.field private mPeriodTime:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mPeriods:I

.field private mRestingTime:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mRingVolume:I

.field private mScreen:I

.field private mTrainings:I

.field private mVibration:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->Companion:Lcom/szabh/smable3/entity/BleMatchTrainingSettings3$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;-><init>(IILjava/util/List;Ljava/util/List;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILjava/util/List;Ljava/util/List;IIII)V
    .locals 1
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIII)V"
        }
    .end annotation

    const-string v0, "mPeriodTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRestingTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/List;Ljava/util/List;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    .line 11
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    .line 12
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move p9, v0

    :goto_0
    move p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move p9, p8

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;-><init>(IILjava/util/List;Ljava/util/List;IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;IILjava/util/List;Ljava/util/List;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    :cond_7
    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->copy(IILjava/util/List;Ljava/util/List;IIII)Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    return v0
.end method

.method public final copy(IILjava/util/List;Ljava/util/List;IIII)Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;
    .locals 10
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIII)",
            "Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;"
        }
    .end annotation

    const-string v0, "mPeriodTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRestingTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;-><init>(IILjava/util/List;Ljava/util/List;IIII)V

    return-object v1
.end method

.method public encode()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move v3, v1

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    if-ge v3, v0, :cond_1

    iget-object v6, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    if-ltz v3, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-ge v3, v7, :cond_0

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_1

    :cond_0
    move-object v6, v2

    :goto_1
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {p0, v6, v5, v4, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    const/16 v0, 0x8

    if-ge v1, v0, :cond_3

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    if-ltz v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_2
    move-object v0, v2

    :goto_3
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p0, v0, v5, v4, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    invoke-static {p0, v0, v5, v4, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMFinshRestingTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x2a

    return v0
.end method

.method public final getMPeriodTime()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMPeriods()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    return v0
.end method

.method public final getMRestingTime()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMRingVolume()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    return v0
.end method

.method public final getMScreen()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    return v0
.end method

.method public final getMTrainings()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    return v0
.end method

.method public final getMVibration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMFinshRestingTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    return-void
.end method

.method public final setMPeriodTime(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    return-void
.end method

.method public final setMPeriods(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    return-void
.end method

.method public final setMRestingTime(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    return-void
.end method

.method public final setMRingVolume(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    return-void
.end method

.method public final setMScreen(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    return-void
.end method

.method public final setMTrainings(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    return-void
.end method

.method public final setMVibration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchTrainingSettings3(mTrainings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mTrainings:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriods:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mPeriodTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRestingTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRestingTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mFinshRestingTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mFinshRestingTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVibration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mVibration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRingVolume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mRingVolume:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchTrainingSettings3;->mScreen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
