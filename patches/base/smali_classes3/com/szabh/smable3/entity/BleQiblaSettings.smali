.class public final Lcom/szabh/smable3/entity/BleQiblaSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleQiblaSettings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleQiblaSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleQiblaSettings.kt\ncom/szabh/smable3/entity/BleQiblaSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,122:1\n232#2,3:123\n222#2,15:126\n*S KotlinDebug\n*F\n+ 1 BleQiblaSettings.kt\ncom/szabh/smable3/entity/BleQiblaSettings\n*L\n101#1:123,3\n101#1:126,15\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleQiblaSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleQiblaSettings.kt\ncom/szabh/smable3/entity/BleQiblaSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,122:1\n232#2,3:123\n222#2,15:126\n*S KotlinDebug\n*F\n+ 1 BleQiblaSettings.kt\ncom/szabh/smable3/entity/BleQiblaSettings\n*L\n101#1:123,3\n101#1:126,15\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleQiblaSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x1c4

.field public static final METHOD_DUBAI:I = 0x4

.field public static final METHOD_EGYPTIAN:I = 0x1

.field public static final METHOD_KARACHI:I = 0x2

.field public static final METHOD_KUWAIT:I = 0x7

.field public static final METHOD_MOON_SIGHTING_COMMITTEE:I = 0x5

.field public static final METHOD_MUSLIM_WORLD_LEAGUE:I = 0x0

.field public static final METHOD_NORTH_AMERICA:I = 0x6

.field public static final METHOD_OTHER:I = 0xb

.field public static final METHOD_QATAR:I = 0x8

.field public static final METHOD_SIHAT_KEMENAG:I = 0xc

.field public static final METHOD_SINGAPORE:I = 0x9

.field public static final METHOD_TURKEY:I = 0xa

.field public static final METHOD_UMM_AL_QURA:I = 0x3


# instance fields
.field private mEnabled:I

.field private mHijriDay:I

.field private mHijriMonth:I

.field private mHijriYear:I

.field private mMethod:I

.field private mPrayerTimes:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;"
        }
    .end annotation
.end field

.field private mReminderMinute:I

.field private mStartTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleQiblaSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleQiblaSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleQiblaSettings;->Companion:Lcom/szabh/smable3/entity/BleQiblaSettings$Companion;

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

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleQiblaSettings;-><init>(IIIIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIILjava/util/List;)V
    .locals 1
    .param p8    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mPrayerTimes"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 11
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    move-object p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p9}, Lcom/szabh/smable3/entity/BleQiblaSettings;-><init>(IIIIIIILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleQiblaSettings;IIIIIIILjava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleQiblaSettings;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

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

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleQiblaSettings;->copy(IIIIIIILjava/util/List;)Lcom/szabh/smable3/entity/BleQiblaSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIIIIIILjava/util/List;)Lcom/szabh/smable3/entity/BleQiblaSettings;
    .locals 10
    .param p8    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleQiblaSettings;"
        }
    .end annotation

    const-string v0, "mPrayerTimes"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleQiblaSettings;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/szabh/smable3/entity/BleQiblaSettings;-><init>(IIIIIIILjava/util/List;)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    add-int/lit16 v2, v2, 0x578

    :goto_0
    iput v2, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    const/4 v2, 0x7

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const/16 v1, 0x1f

    if-ge v3, v1, :cond_1

    const-class v1, Lcom/szabh/smable3/entity/BlePrayerTimes;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v2, 0xe

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    return-void
.end method

.method public encode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit16 v0, v0, -0x578

    :goto_0
    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x7

    new-array v0, v0, [B

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v0, v4, v3, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleQiblaSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMEnabled()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    return v0
.end method

.method public final getMHijriDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    return v0
.end method

.method public final getMHijriMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    return v0
.end method

.method public final getMHijriYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x1c4

    return v0
.end method

.method public final getMMethod()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    return v0
.end method

.method public final getMPrayerTimes()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    return-object v0
.end method

.method public final getMReminderMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    return v0
.end method

.method public final getMStartTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    return-void
.end method

.method public final setMHijriDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    return-void
.end method

.method public final setMHijriMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    return-void
.end method

.method public final setMHijriYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    return-void
.end method

.method public final setMMethod(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    return-void
.end method

.method public final setMPrayerTimes(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    return-void
.end method

.method public final setMReminderMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    return-void
.end method

.method public final setMStartTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleQiblaSettings(mEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mEnabled:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mMethod:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReminderMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mReminderMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHijriYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHijriMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHijriDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mHijriDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mStartTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPrayerTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleQiblaSettings;->mPrayerTimes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
