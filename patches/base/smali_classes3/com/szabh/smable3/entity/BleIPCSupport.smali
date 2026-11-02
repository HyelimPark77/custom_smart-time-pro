.class public final Lcom/szabh/smable3/entity/BleIPCSupport;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleIPCSupport$Companion;,
        Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleIPCSupport$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x1a


# instance fields
.field private mSupportAlipay:I

.field private mSupportHttpProtocolVersion:I

.field private mSupportLiveVideo:I

.field private mSupportOrientation:I

.field private mSupportP2P:I

.field private mSupportVideoCalls:I

.field private mSupportWeChatCall:I

.field private mSupportedAIImageResolution:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;"
        }
    .end annotation
.end field

.field private mSupportedVideoResolution:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation
.end field

.field private mSupportedVideoResolution2:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCSupport$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleIPCSupport$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCSupport;->Companion:Lcom/szabh/smable3/entity/BleIPCSupport$Companion;

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

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleIPCSupport;-><init>(IILjava/util/List;IIILjava/util/List;IILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILjava/util/List;IIILjava/util/List;IILjava/util/List;)V
    .locals 1
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;III",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;II",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mSupportedVideoResolution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSupportedAIImageResolution"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSupportedVideoResolution2"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    .line 12
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/List;IIILjava/util/List;IILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p3

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

    .line 14
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p7

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    .line 15
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p10

    :cond_9
    move-object p11, p10

    move p10, p9

    move p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 16
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleIPCSupport;-><init>(IILjava/util/List;IIILjava/util/List;IILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleIPCSupport;IILjava/util/List;IIILjava/util/List;IILjava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleIPCSupport;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    :cond_9
    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/entity/BleIPCSupport;->copy(IILjava/util/List;IIILjava/util/List;IILjava/util/List;)Lcom/szabh/smable3/entity/BleIPCSupport;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMSupportedVideoResolution$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "\u540e\u7eed\u5f03\u7528"
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    return v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

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
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    return v0
.end method

.method public final copy(IILjava/util/List;IIILjava/util/List;IILjava/util/List;)Lcom/szabh/smable3/entity/BleIPCSupport;
    .locals 12
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;III",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;II",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleIPCSupport;"
        }
    .end annotation

    const-string v0, "mSupportedVideoResolution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSupportedAIImageResolution"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSupportedVideoResolution2"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleIPCSupport;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/szabh/smable3/entity/BleIPCSupport;-><init>(IILjava/util/List;IIILjava/util/List;IILjava/util/List;)V

    return-object v1
.end method

.method public decode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    sget-object v0, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->Companion:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;->fromMask(J)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    sget-object v1, Lcom/szabh/smable3/entity/AIImageResolution;->Companion:Lcom/szabh/smable3/entity/AIImageResolution$Companion;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    invoke-virtual {v1, v2}, Lcom/szabh/smable3/entity/AIImageResolution$Companion;->fromMask(I)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;->fromBytes([B)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleIPCSupport;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleIPCSupport;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMSupportAlipay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    return v0
.end method

.method public final getMSupportHttpProtocolVersion()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    return v0
.end method

.method public final getMSupportLiveVideo()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    return v0
.end method

.method public final getMSupportOrientation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    return v0
.end method

.method public final getMSupportP2P()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    return v0
.end method

.method public final getMSupportVideoCalls()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    return v0
.end method

.method public final getMSupportWeChatCall()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    return v0
.end method

.method public final getMSupportedAIImageResolution()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    return-object v0
.end method

.method public final getMSupportedVideoResolution()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    return-object v0
.end method

.method public final getMSupportedVideoResolution2()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMSupportAlipay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    return-void
.end method

.method public final setMSupportHttpProtocolVersion(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    return-void
.end method

.method public final setMSupportLiveVideo(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    return-void
.end method

.method public final setMSupportOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    return-void
.end method

.method public final setMSupportP2P(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    return-void
.end method

.method public final setMSupportVideoCalls(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    return-void
.end method

.method public final setMSupportWeChatCall(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    return-void
.end method

.method public final setMSupportedAIImageResolution(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    return-void
.end method

.method public final setMSupportedVideoResolution(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    return-void
.end method

.method public final setMSupportedVideoResolution2(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleIPCSupport(mSupportP2P="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportP2P:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportOrientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportOrientation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportedVideoResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportVideoCalls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportVideoCalls:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportWeChatCall="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportWeChatCall:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportLiveVideo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportLiveVideo:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportedAIImageResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedAIImageResolution:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportAlipay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportAlipay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportHttpProtocolVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportHttpProtocolVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSupportedVideoResolution2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleIPCSupport;->mSupportedVideoResolution2:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
