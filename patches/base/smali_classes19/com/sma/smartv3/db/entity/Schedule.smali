.class public final Lcom/sma/smartv3/db/entity/Schedule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/entity/Schedule$Companion;
    }
.end annotation


# static fields
.field private static final CALENDAR:Ljava/util/Calendar;

.field public static final Companion:Lcom/sma/smartv3/db/entity/Schedule$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mAdvance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mContent:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDay:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHour:I
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

.field private mMinute:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMonth:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mScheduleId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTitle:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mYear:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/db/entity/Schedule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/db/entity/Schedule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/db/entity/Schedule;->Companion:Lcom/sma/smartv3/db/entity/Schedule$Companion;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/db/entity/Schedule;->CALENDAR:Ljava/util/Calendar;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/sma/smartv3/db/entity/Schedule;-><init>(IIIIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mTitle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    .line 10
    iput p8, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    .line 11
    iput-object p9, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    .line 13
    const-string v0, ""

    if-eqz p12, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move-object p11, p10

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/sma/smartv3/db/entity/Schedule;-><init>(IIIIIIIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/Schedule;IIIIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/db/entity/Schedule;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p8, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/sma/smartv3/db/entity/Schedule;->copy(IIIIIIIILjava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/db/entity/Schedule;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIIIIIIILjava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/db/entity/Schedule;
    .locals 12
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mTitle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/Schedule;

    move v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/db/entity/Schedule;-><init>(IIIIIIIILjava/lang/String;Ljava/lang/String;)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/Schedule;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/Schedule;

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMAdvance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    return v0
.end method

.method public final getMBleSchedule()Lcom/szabh/smable3/entity/BleSchedule;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleSchedule;

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    iget v2, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    iget v3, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    iget v4, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    iget v5, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    iget v6, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    iget-object v7, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    iget-object v8, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleSchedule;-><init>(IIIIIILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDate()Ljava/util/Date;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/db/entity/Schedule;->CALENDAR:Ljava/util/Calendar;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->X01IiOiIi(Ljava/util/Calendar;I)V

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OII(Ljava/util/Calendar;I)V

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IIX1OXO(Ljava/util/Calendar;I)V

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->iIiiO(Ljava/util/Calendar;I)V

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OiIIX101O(Ljava/util/Calendar;I)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "getTime(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMDay()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    return v0
.end method

.method public final getMHour()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    return v0
.end method

.method public final getMMinute()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    return v0
.end method

.method public final getMMonth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    return v0
.end method

.method public final getMScheduleId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    return v0
.end method

.method public final getMTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMYear()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAdvance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    return-void
.end method

.method public final setMContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMDay(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    return-void
.end method

.method public final setMHour(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    return-void
.end method

.method public final setMMinute(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    return-void
.end method

.method public final setMMonth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    return-void
.end method

.method public final setMScheduleId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    return-void
.end method

.method public final setMTitle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    return-void
.end method

.method public final setMYear(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/db/entity/Schedule;->mId:I

    iget v1, p0, Lcom/sma/smartv3/db/entity/Schedule;->mScheduleId:I

    iget v2, p0, Lcom/sma/smartv3/db/entity/Schedule;->mYear:I

    iget v3, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMonth:I

    iget v4, p0, Lcom/sma/smartv3/db/entity/Schedule;->mDay:I

    iget v5, p0, Lcom/sma/smartv3/db/entity/Schedule;->mHour:I

    iget v6, p0, Lcom/sma/smartv3/db/entity/Schedule;->mMinute:I

    iget v7, p0, Lcom/sma/smartv3/db/entity/Schedule;->mAdvance:I

    iget-object v8, p0, Lcom/sma/smartv3/db/entity/Schedule;->mTitle:Ljava/lang/String;

    iget-object v9, p0, Lcom/sma/smartv3/db/entity/Schedule;->mContent:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Schedule(mId="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mScheduleId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mYear="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mMonth="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mDay="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mHour="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mMinute="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mAdvance="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mTitle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mContent="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
