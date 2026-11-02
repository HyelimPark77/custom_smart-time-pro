.class public final Lcom/szabh/smable3/watchface/Element;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bottomOffset:I

.field private final gravity:I

.field private final h:I

.field private final hasAlpha:I

.field private final ignoreBlack:I

.field private final imageBuffers:[[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final leftOffset:I

.field private final playInterval:I

.field private final type:I

.field private final w:I

.field private final x:I

.field private final y:I


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/szabh/smable3/watchface/Element;-><init>(IIIIIIIIIII[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIII[[B)V
    .locals 1
    .param p12    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "imageBuffers"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    .line 14
    iput-object p12, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIII[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x1

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    move p11, v0

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    .line 15
    new-array p12, v0, [[B

    :cond_b
    move-object p13, p12

    move p12, p11

    move p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p13}, Lcom/szabh/smable3/watchface/Element;-><init>(IIIIIIIIIII[[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/Element;IIIIIIIIIII[[BILjava/lang/Object;)Lcom/szabh/smable3/watchface/Element;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget p11, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    :cond_b
    move p13, p11

    move-object p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/szabh/smable3/watchface/Element;->copy(IIIIIIIIIII[[B)Lcom/szabh/smable3/watchface/Element;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    return v0
.end method

.method public final component12()[[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    return v0
.end method

.method public final copy(IIIIIIIIIII[[B)Lcom/szabh/smable3/watchface/Element;
    .locals 14
    .param p12    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "imageBuffers"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/watchface/Element;

    move v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lcom/szabh/smable3/watchface/Element;-><init>(IIIIIIIIIII[[B)V

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
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/szabh/smable3/watchface/Element;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.szabh.smable3.watchface.Element"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/szabh/smable3/watchface/Element;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->type:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->w:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->h:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->gravity:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->x:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->y:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    iget v3, p1, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    iget-object p1, p1, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    invoke-static {v1, p1}, Lcom/android/mltcode/paycertificationapi/iiIXIii;->XOO0ii0([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getBottomOffset()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    return v0
.end method

.method public final getGravity()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    return v0
.end method

.method public final getH()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    return v0
.end method

.method public final getHasAlpha()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    return v0
.end method

.method public final getIgnoreBlack()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    return v0
.end method

.method public final getImageBuffers()[[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    return-object v0
.end method

.method public final getLeftOffset()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    return v0
.end method

.method public final getPlayInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    return v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    return v0
.end method

.method public final getW()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    return v0
.end method

.method public final getX()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    return v0
.end method

.method public final getY()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OOXXi;->XIi00iiXO([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Element(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hasAlpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->hasAlpha:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", w="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->w:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", h="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gravity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->gravity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ignoreBlack="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->ignoreBlack:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", playInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->playInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bottomOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->bottomOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/Element;->leftOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", imageBuffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/Element;->imageBuffers:[[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
