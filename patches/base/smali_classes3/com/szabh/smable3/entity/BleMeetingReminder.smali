.class public final Lcom/szabh/smable3/entity/BleMeetingReminder;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMeetingReminder$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMeetingReminder$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x1c

.field public static final TAG_LENGTH:I = 0x15


# instance fields
.field private mDay:I

.field private mEnabled:I

.field private mHour:I

.field private mMinute:I

.field private mMonth:I

.field private mRepeat:I

.field private mTag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mYear:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMeetingReminder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMeetingReminder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMeetingReminder;->Companion:Lcom/szabh/smable3/entity/BleMeetingReminder$Companion;

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

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleMeetingReminder;-><init>(IIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIILjava/lang/String;)V
    .locals 1
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mTag"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

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

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 11
    const-string p8, ""

    :cond_7
    move p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 12
    invoke-direct/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleMeetingReminder;-><init>(IIIIIIILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMeetingReminder;IIIIIIILjava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMeetingReminder;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    :cond_7
    move p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleMeetingReminder;->copy(IIIIIIILjava/lang/String;)Lcom/szabh/smable3/entity/BleMeetingReminder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIIIIIILjava/lang/String;)Lcom/szabh/smable3/entity/BleMeetingReminder;
    .locals 10
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mTag"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMeetingReminder;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/szabh/smable3/entity/BleMeetingReminder;-><init>(IIIIIIILjava/lang/String;)V

    return-object v1
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    invoke-virtual {p0, v0}, Lcom/szabh/smable3/entity/BleIdObject;->setMId(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/16 v2, 0x15

    invoke-static {p0, v2, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    return-void
.end method

.method public encode()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    const/4 v1, 0x7

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    add-int/lit16 v0, v0, -0x7d0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v3, 0x15

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMeetingReminder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    return v0
.end method

.method public final getMEnabled()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    return v0
.end method

.method public final getMHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x1c

    return v0
.end method

.method public final getMMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    return v0
.end method

.method public final getMMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    return v0
.end method

.method public final getMRepeat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    return v0
.end method

.method public final getMTag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    return-object v0
.end method

.method public final getMYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    return-void
.end method

.method public final setMEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    return-void
.end method

.method public final setMHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    return-void
.end method

.method public final setMMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    return-void
.end method

.method public final setMMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    return-void
.end method

.method public final setMRepeat(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    return-void
.end method

.method public final setMTag(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    return-void
.end method

.method public final setMYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMeetingReminder(mMeetingReminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mEnabled:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRepeat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mRepeat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMeetingReminder;->mTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
