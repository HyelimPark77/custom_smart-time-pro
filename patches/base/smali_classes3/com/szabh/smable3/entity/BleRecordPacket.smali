.class public final Lcom/szabh/smable3/entity/BleRecordPacket;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleRecordPacket$Companion;
    }
.end annotation


# static fields
.field public static final AI_MODE_BAIDU:I = 0x0

.field public static final AI_MODE_DEEP_SEEK:I = 0x3

.field public static final AI_MODE_OPENAI:I = 0x1

.field public static final AI_MODE_SPARK_CHAIN:I = 0x2

.field public static final Companion:Lcom/szabh/smable3/entity/BleRecordPacket$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MODE_VOICE_AI_CONTINUOUS_DIALOGUE:I = 0xa

.field public static final MODE_VOICE_AI_IDENTIFY:I = 0x6

.field public static final MODE_VOICE_AI_TRANSLATION:I = 0x2

.field public static final MODE_VOICE_AI_WATCHFACE:I = 0x1

.field public static final MODE_VOICE_ALIPAY:I = 0xb

.field public static final MODE_VOICE_EARPHONE_NORMAL:I = 0x3

.field public static final MODE_VOICE_EARPHONE_TRANSLATE:I = 0x4

.field public static final MODE_VOICE_NORMAL:I = 0x0

.field public static final MODE_VOICE_REAL_TIME_CONVERSATION:I = 0x7

.field public static final TRANSFER_STATUE_CANCEL:I = 0x9

.field public static final TRANSFER_STATUE_CONFIRM:I = 0xa

.field public static final TRANSFER_STATUE_END_CONTEXT:I = 0x4

.field public static final TRANSFER_STATUE_RESET:I = 0x8

.field public static final TRANSFER_STATUE_SAVE_ANSWER:I = 0x5

.field public static final TRANSFER_STATUE_VOICE_PLAY_START:I = 0x6

.field public static final TRANSFER_STATUE_VOICE_PLAY_STOP:I = 0x7

.field public static final TRANSFER_STATUS_END:I = 0x2

.field public static final TRANSFER_STATUS_GO_ON:I = 0x1

.field public static final TRANSFER_STATUS_REPLY_DCS:I = 0x5

.field public static final TRANSFER_STATUS_START:I = 0x0

.field public static final TRANSFER_STATUS_SUSPEND:I = 0x3


# instance fields
.field private mAIMode:I

.field private mDay:I

.field private mEarDirection:I

.field private mHour:I

.field private mLanguage:I

.field private mLength:I

.field private final mLengthToWrite:I

.field private mMinute:I

.field private mMode:I

.field private mMonth:I

.field private mPacket:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSecond:I

.field private mStatus:I

.field private mToLanguage:I

.field private mYear:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleRecordPacket$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleRecordPacket$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleRecordPacket;->Companion:Lcom/szabh/smable3/entity/BleRecordPacket$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 17

    .line 1
    const/16 v15, 0x3fff

    const/16 v16, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v16}, Lcom/szabh/smable3/entity/BleRecordPacket;-><init>(IIIIIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIII[B)V
    .locals 1
    .param p14    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mPacket"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    .line 14
    iput p12, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    .line 15
    iput p13, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    .line 16
    iput-object p14, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    .line 17
    array-length p1, p14

    add-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLengthToWrite:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p15

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

    if-eqz v7, :cond_5

    move v7, v2

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v2

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v2

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move v10, v2

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move v11, v2

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    move v12, v2

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    move v13, v2

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move v14, v2

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    .line 18
    new-array v0, v2, [B

    move-object/from16 p15, v0

    :goto_d
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    .line 19
    :goto_e
    invoke-direct/range {p1 .. p15}, Lcom/szabh/smable3/entity/BleRecordPacket;-><init>(IIIIIIIIIIIII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleRecordPacket;IIIIIIIIIIIII[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleRecordPacket;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget v3, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget v4, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget v5, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget v6, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    goto :goto_5

    :cond_5
    move/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget v7, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    goto :goto_6

    :cond_6
    move/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget v8, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    goto :goto_7

    :cond_7
    move/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget v9, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    goto :goto_8

    :cond_8
    move/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget v10, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget v11, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget v12, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    goto :goto_b

    :cond_b
    move/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget v13, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    goto :goto_c

    :cond_c
    move/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move/from16 p7, v6

    move/from16 p8, v7

    move/from16 p9, v8

    move/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move/from16 p13, v12

    move/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/szabh/smable3/entity/BleRecordPacket;->copy(IIIIIIIIIIIII[B)Lcom/szabh/smable3/entity/BleRecordPacket;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    return v0
.end method

.method public final component14()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIII[B)Lcom/szabh/smable3/entity/BleRecordPacket;
    .locals 16
    .param p14    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mPacket"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleRecordPacket;

    move/from16 v2, p1

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

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Lcom/szabh/smable3/entity/BleRecordPacket;-><init>(IIIIIIIIIIIII[B)V

    return-object v1
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    add-int/lit16 v0, v0, -0x7d0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/16 v0, 0x12

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleRecordPacket;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleRecordPacket;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getMAIMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    return v0
.end method

.method public final getMDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    return v0
.end method

.method public final getMEarDirection()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    return v0
.end method

.method public final getMHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    return v0
.end method

.method public final getMLanguage()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    return v0
.end method

.method public final getMLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLengthToWrite:I

    return v0
.end method

.method public final getMMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    return v0
.end method

.method public final getMMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    return v0
.end method

.method public final getMPacket()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    return-object v0
.end method

.method public final getMSecond()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    return v0
.end method

.method public final getMStatus()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    return v0
.end method

.method public final getMToLanguage()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    return v0
.end method

.method public final getMYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAIMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    return-void
.end method

.method public final setMDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    return-void
.end method

.method public final setMEarDirection(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    return-void
.end method

.method public final setMHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    return-void
.end method

.method public final setMLanguage(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    return-void
.end method

.method public final setMLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    return-void
.end method

.method public final setMMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    return-void
.end method

.method public final setMMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    return-void
.end method

.method public final setMPacket([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    return-void
.end method

.method public final setMSecond(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    return-void
.end method

.method public final setMStatus(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    return-void
.end method

.method public final setMToLanguage(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    return-void
.end method

.method public final setMYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleRecordPacket(mYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSecond="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mSecond:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLanguage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mLanguage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mToLanguage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mToLanguage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEarDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mEarDirection:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAIMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mAIMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleRecordPacket;->mPacket:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
