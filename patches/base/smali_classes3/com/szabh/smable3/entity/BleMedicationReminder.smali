.class public final Lcom/szabh/smable3/entity/BleMedicationReminder;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMedicationReminder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMedicationReminder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMedicationReminder.kt\ncom/szabh/smable3/entity/BleMedicationReminder\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,117:1\n222#2,4:118\n222#2,4:122\n222#2,4:126\n222#2,4:130\n222#2,4:134\n222#2,4:138\n*S KotlinDebug\n*F\n+ 1 BleMedicationReminder.kt\ncom/szabh/smable3/entity/BleMedicationReminder\n*L\n61#1:118,4\n62#1:122,4\n63#1:126,4\n64#1:130,4\n65#1:134,4\n66#1:138,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMedicationReminder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMedicationReminder.kt\ncom/szabh/smable3/entity/BleMedicationReminder\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,117:1\n222#2,4:118\n222#2,4:122\n222#2,4:126\n222#2,4:130\n222#2,4:134\n222#2,4:138\n*S KotlinDebug\n*F\n+ 1 BleMedicationReminder.kt\ncom/szabh/smable3/entity/BleMedicationReminder\n*L\n61#1:118,4\n62#1:122,4\n63#1:126,4\n64#1:130,4\n65#1:134,4\n66#1:138,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMedicationReminder$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x48

.field private static final LABLE_LENGTH:I = 0x15

.field private static final NAME_LENGTH:I = 0x18

.field public static final TYPE_CAPSULE:I = 0x1

.field public static final TYPE_CREAM:I = 0x3

.field public static final TYPE_DROPS:I = 0x2

.field public static final TYPE_INJECTABLE:I = 0x6

.field public static final TYPE_SOLUTION:I = 0x5

.field public static final TYPE_SPRAY:I = 0x4

.field public static final TYPE_TABLET:I = 0x0

.field public static final UNIT_GRAM:I = 0x2

.field public static final UNIT_INTERNATIONAL:I = 0x6

.field public static final UNIT_MICROGRAM:I = 0x1

.field public static final UNIT_MILLICURIE:I = 0x7

.field public static final UNIT_MILLIEQUIVALENT:I = 0x8

.field public static final UNIT_MILLIGRAM:I = 0x0

.field public static final UNIT_MILLILITER:I = 0x3

.field public static final UNIT_PERCENTAGE:I = 0x4

.field public static final UNIT_PIECE:I = 0x5


# instance fields
.field private mDosage:I

.field private mEndDay:I

.field private mEndMonth:I

.field private mEndYear:I

.field private mLabel:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTimes:I

.field private mRepeat:I

.field private mStartDay:I

.field private mStartMonth:I

.field private mStartYear:I

.field private mType:I

.field private mUnit:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMedicationReminder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMedicationReminder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->Companion:Lcom/szabh/smable3/entity/BleMedicationReminder$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 22

    .line 1
    const v20, 0x7ffff

    const/16 v21, 0x0

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

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lcom/szabh/smable3/entity/BleMedicationReminder;-><init>(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p6    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object v0, p8

    move-object/from16 v1, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p18

    move-object/from16 v5, p19

    const-string v6, "mRemindTime1"

    invoke-static {p6, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mRemindTime2"

    invoke-static {p7, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mRemindTime3"

    invoke-static {p8, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mRemindTime4"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mRemindTime5"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mRemindTime6"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mName"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mLabel"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    .line 10
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    .line 11
    iput-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    .line 12
    iput-object v2, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    .line 13
    iput-object v3, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    move/from16 p1, p12

    .line 14
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    move/from16 p1, p13

    .line 15
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    move/from16 p1, p14

    .line 16
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    .line 20
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    .line 21
    iput-object v5, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v2

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    const/4 v8, 0x0

    const/4 v9, 0x3

    if-eqz v7, :cond_5

    .line 22
    new-instance v7, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-direct {v7, v2, v2, v9, v8}, Lcom/szabh/smable3/entity/BleHmTime;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    .line 23
    new-instance v10, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-direct {v10, v2, v2, v9, v8}, Lcom/szabh/smable3/entity/BleHmTime;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    .line 24
    new-instance v11, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-direct {v11, v2, v2, v9, v8}, Lcom/szabh/smable3/entity/BleHmTime;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    .line 25
    new-instance v12, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-direct {v12, v2, v2, v9, v8}, Lcom/szabh/smable3/entity/BleHmTime;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    .line 26
    new-instance v13, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-direct {v13, v2, v2, v9, v8}, Lcom/szabh/smable3/entity/BleHmTime;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    .line 27
    new-instance v14, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-direct {v14, v2, v2, v9, v8}, Lcom/szabh/smable3/entity/BleHmTime;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v8, v0, 0x800

    if-eqz v8, :cond_b

    move v8, v2

    goto :goto_b

    :cond_b
    move/from16 v8, p12

    :goto_b
    and-int/lit16 v9, v0, 0x1000

    if-eqz v9, :cond_c

    move v9, v2

    goto :goto_c

    :cond_c
    move/from16 v9, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    move v15, v2

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    .line 28
    const-string v19, ""

    if-eqz v18, :cond_11

    move-object/from16 v18, v19

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v20, 0x40000

    and-int v0, v0, v20

    if-eqz v0, :cond_12

    move-object/from16 p20, v19

    :goto_12
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p13, v8

    move/from16 p14, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move-object/from16 p11, v13

    move-object/from16 p12, v14

    move/from16 p15, v15

    move/from16 p17, v16

    move/from16 p18, v17

    move-object/from16 p19, v18

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    :goto_13
    invoke-direct/range {p1 .. p20}, Lcom/szabh/smable3/entity/BleMedicationReminder;-><init>(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMedicationReminder;IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMedicationReminder;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/szabh/smable3/entity/BleMedicationReminder;->copy(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMedicationReminder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    return v0
.end method

.method public final component10()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final component11()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    return v0
.end method

.method public final component6()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final component7()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final component8()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final component9()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final copy(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMedicationReminder;
    .locals 21
    .param p6    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mRemindTime1"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRemindTime2"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRemindTime3"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRemindTime4"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRemindTime5"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRemindTime6"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mName"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLabel"

    move-object/from16 v2, p19

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMedicationReminder;

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v20}, Lcom/szabh/smable3/entity/BleMedicationReminder;-><init>(IIIIILcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;Lcom/szabh/smable3/entity/BleHmTime;IIIIIILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    invoke-virtual {p0, v0}, Lcom/szabh/smable3/entity/BleIdObject;->setMId(I)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    const-class v0, Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleHmTime;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleHmTime;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleHmTime;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleHmTime;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleHmTime;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleHmTime;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    const/16 v0, 0x18

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    const/16 v0, 0x15

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    return-void
.end method

.method public encode()V
    .locals 13

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    add-int/lit16 v0, v0, -0x7d0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    add-int/lit16 v0, v0, -0x7d0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v3, 0x18

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    iget-object v8, v1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/16 v9, 0x15

    const/4 v10, 0x0

    move-object v7, v1

    invoke-static/range {v7 .. v12}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMedicationReminder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getMDosage()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    return v0
.end method

.method public final getMEndDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    return v0
.end method

.method public final getMEndMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    return v0
.end method

.method public final getMEndYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    return v0
.end method

.method public final getMLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x48

    return v0
.end method

.method public final getMName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMRemindTime1()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final getMRemindTime2()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final getMRemindTime3()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final getMRemindTime4()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final getMRemindTime5()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final getMRemindTime6()Lcom/szabh/smable3/entity/BleHmTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    return-object v0
.end method

.method public final getMRemindTimes()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    return v0
.end method

.method public final getMRepeat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    return v0
.end method

.method public final getMStartDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    return v0
.end method

.method public final getMStartMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    return v0
.end method

.method public final getMStartYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    return v0
.end method

.method public final getMUnit()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHmTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHmTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHmTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHmTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHmTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHmTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDosage(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    return-void
.end method

.method public final setMEndDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    return-void
.end method

.method public final setMEndMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    return-void
.end method

.method public final setMEndYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    return-void
.end method

.method public final setMLabel(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    return-void
.end method

.method public final setMName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    return-void
.end method

.method public final setMRemindTime1(Lcom/szabh/smable3/entity/BleHmTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    return-void
.end method

.method public final setMRemindTime2(Lcom/szabh/smable3/entity/BleHmTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    return-void
.end method

.method public final setMRemindTime3(Lcom/szabh/smable3/entity/BleHmTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    return-void
.end method

.method public final setMRemindTime4(Lcom/szabh/smable3/entity/BleHmTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    return-void
.end method

.method public final setMRemindTime5(Lcom/szabh/smable3/entity/BleHmTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    return-void
.end method

.method public final setMRemindTime6(Lcom/szabh/smable3/entity/BleHmTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleHmTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    return-void
.end method

.method public final setMRemindTimes(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    return-void
.end method

.method public final setMRepeat(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    return-void
.end method

.method public final setMStartDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    return-void
.end method

.method public final setMStartMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    return-void
.end method

.method public final setMStartYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    return-void
.end method

.method public final setMUnit(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMedicationReminder(mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUnit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mUnit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDosage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mDosage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRepeat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRepeat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime1:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime2:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime3:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime4:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime5:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime6="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mRemindTime6:Lcom/szabh/smable3/entity/BleHmTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mStartYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mStartDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEndYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEndMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEndDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mEndDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mLabel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMedicationReminder;->mLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
