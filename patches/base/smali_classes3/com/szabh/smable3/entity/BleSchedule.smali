.class public final Lcom/szabh/smable3/entity/BleSchedule;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleSchedule$Companion;
    }
.end annotation


# static fields
.field public static final CONTENT_MAX_LENGTH:I = 0xfa

.field public static final Companion:Lcom/szabh/smable3/entity/BleSchedule$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TITLE_LENGTH:I = 0x20


# instance fields
.field private mAdvance:I

.field private mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDay:I

.field private mHour:I

.field private mMinute:I

.field private mMonth:I

.field private mTitle:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mYear:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleSchedule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleSchedule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleSchedule;->Companion:Lcom/szabh/smable3/entity/BleSchedule$Companion;

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

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleSchedule;-><init>(IIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mTitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p4, v0

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

    .line 11
    const-string v0, ""

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p9, p8

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/szabh/smable3/entity/BleSchedule;-><init>(IIIIIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleSchedule;IIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSchedule;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleSchedule;->copy(IIIIIILjava/lang/String;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleSchedule;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIIIIILjava/lang/String;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleSchedule;
    .locals 10
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mTitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleSchedule;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lcom/szabh/smable3/entity/BleSchedule;-><init>(IIIIIILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public decode()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    return-void
.end method

.method public encode()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    add-int/lit16 v1, v1, -0x7d0

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p0, v1, v2, v3, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/16 v2, 0xfa

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithLimit$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ZILjava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleSchedule;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleSchedule;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMAdvance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    return v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    return v0
.end method

.method public final getMHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0xfa

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x28

    return v0
.end method

.method public final getMMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    return v0
.end method

.method public final getMMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    return v0
.end method

.method public final getMTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAdvance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    return-void
.end method

.method public final setMHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    return-void
.end method

.method public final setMMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    return-void
.end method

.method public final setMMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    return-void
.end method

.method public final setMYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSchedule(mYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAdvance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mAdvance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSchedule;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
