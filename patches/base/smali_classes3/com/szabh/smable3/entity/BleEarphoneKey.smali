.class public final Lcom/szabh/smable3/entity/BleEarphoneKey;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleEarphoneKey$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleEarphoneKey$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x9

.field public static final KEY_NEXT:I = 0x2

.field public static final KEY_NONE:I = 0x0

.field public static final KEY_PLAY_PAUSE:I = 0x3

.field public static final KEY_PRE:I = 0x1

.field public static final KEY_SWITCH_ENV:I = 0x4

.field public static final KEY_TURN_OFF_AI:I = 0x9

.field public static final KEY_TURN_OFF_TRANSLATION:I = 0xb

.field public static final KEY_TURN_ON_AI:I = 0x8

.field public static final KEY_TURN_ON_TRANSLATION:I = 0xa

.field public static final KEY_VOICE_ASSISTANT:I = 0x7

.field public static final KEY_VOL_DOWN:I = 0x6

.field public static final KEY_VOL_UP:I = 0x5


# instance fields
.field private mLeftClick:I

.field private mLeftDoubleClick:I

.field private mLeftLongClick:I

.field private mLeftTripleClick:I

.field private mRightClick:I

.field private mRightDoubleClick:I

.field private mRightLongClick:I

.field private mRightTripleClick:I

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleEarphoneKey$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleEarphoneKey$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleEarphoneKey;->Companion:Lcom/szabh/smable3/entity/BleEarphoneKey$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleEarphoneKey;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v0

    :goto_0
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

    :cond_8
    move p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/szabh/smable3/entity/BleEarphoneKey;-><init>(IIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleEarphoneKey;IIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleEarphoneKey;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleEarphoneKey;->copy(IIIIIIIII)Lcom/szabh/smable3/entity/BleEarphoneKey;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    return v0
.end method

.method public final copy(IIIIIIIII)Lcom/szabh/smable3/entity/BleEarphoneKey;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleEarphoneKey;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleEarphoneKey;-><init>(IIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleEarphoneKey;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMLeftClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    return v0
.end method

.method public final getMLeftDoubleClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    return v0
.end method

.method public final getMLeftLongClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    return v0
.end method

.method public final getMLeftTripleClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public final getMRightClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    return v0
.end method

.method public final getMRightDoubleClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    return v0
.end method

.method public final getMRightLongClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    return v0
.end method

.method public final getMRightTripleClick()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMLeftClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    return-void
.end method

.method public final setMLeftDoubleClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    return-void
.end method

.method public final setMLeftLongClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    return-void
.end method

.method public final setMLeftTripleClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    return-void
.end method

.method public final setMRightClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    return-void
.end method

.method public final setMRightDoubleClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    return-void
.end method

.method public final setMRightLongClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    return-void
.end method

.method public final setMRightTripleClick(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleEarphoneKey(mLeftClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLeftDoubleClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftDoubleClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLeftTripleClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftTripleClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLeftLongClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mLeftLongClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRightClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRightDoubleClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightDoubleClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRightTripleClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightTripleClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRightLongClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mRightLongClick:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneKey;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
