.class public final Lcom/szabh/smable3/watchface/WatchFaceElement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;,
        Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;,
        Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;,
        Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;,
        Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;,
        Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
    }
.end annotation


# instance fields
.field private final action:B

.field private final align:I

.field private final animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final reColor:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private reColorCount:I

.field private final resDescCount:I

.field private final resDescIndex:I

.field private final reserved:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final reversed:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final type:B

.field private final xOffset:I

.field private final yOffset:I


# direct methods
.method public constructor <init>(BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[B)V
    .locals 10
    .param p9    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p15    # Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(BIIBIIII[B",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation

    move-object/from16 v0, p9

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    move-object/from16 v5, p14

    move-object/from16 v6, p15

    move-object/from16 v7, p16

    move-object/from16 v8, p17

    const-string v9, "reversed"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "pointerData"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "timeDigitData"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "dateDigitData"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "frameData"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "animData"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "particleData"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "reColor"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "reserved"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-byte p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    .line 3
    iput p2, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    .line 4
    iput p3, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    .line 5
    iput-byte p4, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    .line 6
    iput p5, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    move/from16 p1, p6

    .line 7
    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    move/from16 p1, p7

    .line 8
    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    move/from16 p1, p8

    .line 9
    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    .line 10
    iput-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    .line 11
    iput-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    .line 12
    iput-object v2, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    .line 13
    iput-object v3, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    .line 14
    iput-object v4, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    .line 15
    iput-object v5, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    .line 16
    iput-object v6, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    .line 17
    iput-object v7, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    .line 18
    iput-object v8, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    return-void
.end method

.method public synthetic constructor <init>(BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 19
    sget-object v1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->PREVIEW:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 20
    sget-object v1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ClickType;->NONE:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ClickType;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ClickType;->getValue()B

    move-result v1

    move v6, v1

    goto :goto_1

    :cond_1
    move/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    .line 21
    sget-object v1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AlignType;->LV_ALIGN_MM:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AlignType;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AlignType;->getValue()I

    move-result v1

    move v7, v1

    goto :goto_2

    :cond_2
    move/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move v8, v2

    goto :goto_3

    :cond_3
    move/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move v9, v2

    goto :goto_4

    :cond_4
    move/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move v10, v2

    goto :goto_5

    :cond_5
    move/from16 v10, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    const/4 v1, 0x5

    .line 22
    new-array v1, v1, [B

    move-object v11, v1

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    const/4 v4, 0x3

    const/4 v5, 0x0

    if-eqz v1, :cond_7

    .line 23
    new-instance v1, Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    invoke-direct {v1, v2, v2, v4, v5}, Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v1

    goto :goto_7

    :cond_7
    move-object/from16 v12, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    const/4 v13, 0x1

    if-eqz v1, :cond_8

    .line 24
    new-instance v1, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    invoke-direct {v1, v2, v13, v5}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;-><init>(BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v1, p11

    :goto_8
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_9

    .line 25
    new-instance v14, Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    invoke-direct {v14, v2, v13, v5}, Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;-><init>(BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_9
    move-object/from16 v14, p12

    :goto_9
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_a

    .line 26
    new-instance v15, Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    invoke-direct {v15, v2, v2, v4, v5}, Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;-><init>(BBILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_a
    move-object/from16 v15, p13

    :goto_a
    and-int/lit16 v4, v0, 0x2000

    if-eqz v4, :cond_b

    .line 27
    new-instance v16, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    const/16 v27, 0x3ff

    const/16 v28, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;-><init>(SSIISSISSBILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_b

    :cond_b
    move-object/from16 v16, p14

    :goto_b
    and-int/lit16 v4, v0, 0x4000

    if-eqz v4, :cond_c

    .line 28
    new-instance v4, Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    invoke-direct {v4, v2, v13, v5}, Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v4

    goto :goto_c

    :cond_c
    move-object/from16 v17, p15

    :goto_c
    const v2, 0x8000

    and-int/2addr v2, v0

    if-eqz v2, :cond_d

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v18, v2

    goto :goto_d

    :cond_d
    move-object/from16 v18, p16

    :goto_d
    const/high16 v2, 0x10000

    and-int/2addr v0, v2

    if-eqz v0, :cond_e

    const/16 v0, 0x8

    .line 30
    new-array v0, v0, [B

    move-object/from16 v19, v0

    :goto_e
    move-object/from16 v2, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object v13, v1

    goto :goto_f

    :cond_e
    move-object/from16 v19, p17

    goto :goto_e

    .line 31
    :goto_f
    invoke-direct/range {v2 .. v19}, Lcom/szabh/smable3/watchface/WatchFaceElement;-><init>(BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[B)V

    return-void
.end method

.method private final buildColorCountByte(I)B
    .locals 0

    shl-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    return p1
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/WatchFaceElement;BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[BILjava/lang/Object;)Lcom/szabh/smable3/watchface/WatchFaceElement;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-byte v2, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-byte v5, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    move-object/from16 p17, p2

    move-object/from16 p18, v1

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move-object/from16 p17, v1

    move/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/szabh/smable3/watchface/WatchFaceElement;->copy(BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[B)Lcom/szabh/smable3/watchface/WatchFaceElement;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    return v0
.end method

.method public final component10()Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    return-object v0
.end method

.method public final component11()Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    return-object v0
.end method

.method public final component12()Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    return-object v0
.end method

.method public final component13()Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    return-object v0
.end method

.method public final component14()Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    return-object v0
.end method

.method public final component15()Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    return-object v0
.end method

.method public final component17()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    return v0
.end method

.method public final component4()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    return v0
.end method

.method public final component9()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    return-object v0
.end method

.method public final copy(BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[B)Lcom/szabh/smable3/watchface/WatchFaceElement;
    .locals 19
    .param p9    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p15    # Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(BIIBIIII[B",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;",
            "Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[B)",
            "Lcom/szabh/smable3/watchface/WatchFaceElement;"
        }
    .end annotation

    const-string v0, "reversed"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointerData"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeDigitData"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDigitData"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameData"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animData"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "particleData"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reColor"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reserved"

    move-object/from16 v3, p17

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/watchface/WatchFaceElement;

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v16, p15

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct/range {v1 .. v18}, Lcom/szabh/smable3/watchface/WatchFaceElement;-><init>(BIIBIIII[BLcom/szabh/smable3/watchface/WatchFaceElement$PointerData;Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;Ljava/util/List;[B)V

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
    instance-of v1, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/watchface/WatchFaceElement;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    iget-byte v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    iget-byte v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    iget-object p1, p1, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAction()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    return v0
.end method

.method public final getAlign()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    return v0
.end method

.method public final getAnimData()Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    return-object v0
.end method

.method public final getDateDigitData()Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    return-object v0
.end method

.method public final getFrameData()Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    return-object v0
.end method

.method public final getParticleData()Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    return-object v0
.end method

.method public final getPointerData()Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    return-object v0
.end method

.method public final getReColor()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    return-object v0
.end method

.method public final getReColorCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    return v0
.end method

.method public final getResDescCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    return v0
.end method

.method public final getResDescIndex()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    return v0
.end method

.method public final getReserved()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    return-object v0
.end method

.method public final getReversed()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    return-object v0
.end method

.method public final getTimeDigitData()Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    return-object v0
.end method

.method public final getType()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    return v0
.end method

.method public final getXOffset()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    return v0
.end method

.method public final getYOffset()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    invoke-static {v0}, Ljava/lang/Byte;->hashCode(B)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setReColorCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    return-void
.end method

.method public final toByteArray()[B
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/16 v0, 0x40

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    invoke-direct {p0, v1}, Lcom/szabh/smable3/watchface/WatchFaceElement;->buildColorCountByte(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt___ArraysKt;->X11i([BI)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XX0X0(Ljava/util/Collection;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->POINTER_H:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-eq v1, v2, :cond_5

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->POINTER_M:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-eq v1, v2, :cond_5

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->POINTER_S:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-ne v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->TIME_DIGIT:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-eq v1, v2, :cond_4

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->HOUR_TENS:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-eq v1, v2, :cond_4

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->HOUR_ONES:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-eq v1, v2, :cond_4

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->MINUTES_TENS:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-eq v1, v2, :cond_4

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->MINUTES_ONES:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-ne v1, v2, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->DATE_DIGIT:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;->getFlag()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_2

    :cond_2
    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->FRAMES:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;->getMode()B

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;->getInterval()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_2

    :cond_3
    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->ANIM:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getPx()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getPy()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getMode()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getDuration()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getByX()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getByY()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getRotation()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getScaleX()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getScaleY()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->getAlpha()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->getFlag()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;->getPivotX()I

    move-result v2

    int-to-short v2, v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;->getPivotY()I

    move-result v1

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    :cond_6
    :goto_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    const/4 v2, 0x0

    move v3, v2

    :goto_3
    if-ge v3, v1, :cond_7

    iget-object v4, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/szabh/smable3/watchface/WatchFaceElementKt;->access$colorToRgb565(Ljava/lang/String;)[B

    move-result-object v4

    mul-int/lit8 v5, v3, 0x2

    add-int/lit8 v5, v5, 0x31

    aget-byte v6, v4, v2

    aput-byte v6, v0, v5

    add-int/lit8 v5, v3, 0x34

    const/4 v6, 0x1

    aget-byte v4, v4, v6

    aput-byte v4, v0, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchFaceElement(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->type:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resDescCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resDescIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->resDescIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->action:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", align="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->align:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", xOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->xOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", yOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->yOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reColorCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColorCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reversed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reversed:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pointerData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->pointerData:Lcom/szabh/smable3/watchface/WatchFaceElement$PointerData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeDigitData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->timeDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dateDigitData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->dateDigitData:Lcom/szabh/smable3/watchface/WatchFaceElement$DateDigitData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->frameData:Lcom/szabh/smable3/watchface/WatchFaceElement$FrameData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", animData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->animData:Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", particleData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->particleData:Lcom/szabh/smable3/watchface/WatchFaceElement$ParticleData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reColor:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reserved="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement;->reserved:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
