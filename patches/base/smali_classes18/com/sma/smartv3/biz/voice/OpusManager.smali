.class public final Lcom/sma/smartv3/biz/voice/OpusManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;,
        Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOpusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n289#2,7:183\n277#2,5:190\n298#2:195\n289#2,7:199\n277#2,5:206\n298#2:211\n1878#3,3:196\n1878#3,3:212\n*S KotlinDebug\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n*L\n95#1:183,7\n95#1:190,5\n95#1:195\n110#1:199,7\n110#1:206,5\n110#1:211\n98#1:196,3\n114#1:212,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOpusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n289#2,7:183\n277#2,5:190\n298#2:195\n289#2,7:199\n277#2,5:206\n298#2:211\n1878#3,3:196\n1878#3,3:212\n*S KotlinDebug\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n*L\n95#1:183,7\n95#1:190,5\n95#1:195\n110#1:199,7\n110#1:206,5\n110#1:211\n98#1:196,3\n114#1:212,3\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mOnDecodeStreamCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOnStateCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOpus:Lcom/smart/opus/SmartOpus;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "OpusManager"

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->TAG:Ljava/lang/String;

    :try_start_0
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/OpusManager;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " OpusManager -> init error\uff01\uff01\uff01"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_0
    :try_start_1
    new-instance v0, Lcom/smart/opus/SmartOpus;

    invoke-direct {v0}, Lcom/smart/opus/SmartOpus;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpus:Lcom/smart/opus/SmartOpus;

    sget-object v1, Lcom/smart/opus/OpusConstants$SampleRate;->Companion:Lcom/smart/opus/OpusConstants$SampleRate$Companion;

    invoke-virtual {v1}, Lcom/smart/opus/OpusConstants$SampleRate$Companion;->_16000()Lcom/smart/opus/OpusConstants$SampleRate;

    move-result-object v1

    sget-object v2, Lcom/smart/opus/OpusConstants$Channels;->Companion:Lcom/smart/opus/OpusConstants$Channels$Companion;

    invoke-virtual {v2}, Lcom/smart/opus/OpusConstants$Channels$Companion;->mono()Lcom/smart/opus/OpusConstants$Channels;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/smart/opus/SmartOpus;->decoderInit(Lcom/smart/opus/OpusConstants$SampleRate;Lcom/smart/opus/OpusConstants$Channels;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Opus -> init error\uff01\uff01\uff01"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static synthetic OXO1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeFile$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/voice/OpusManager;[B)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->writeAudioStream$lambda$0(Lcom/sma/smartv3/biz/voice/OpusManager;[B)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMOnDecodeStreamCallback$p(Lcom/sma/smartv3/biz/voice/OpusManager;)Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOnDecodeStreamCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;

    return-object p0
.end method

.method public static final synthetic access$getMOnStateCallback$p(Lcom/sma/smartv3/biz/voice/OpusManager;)Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOnStateCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;

    return-object p0
.end method

.method private static final decodeFile$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2BytesByChannel(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p1, p0}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeStream([B)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final decodeStream([B)V
    .locals 11

    .line 1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> decodeStream"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    .line 3
    array-length v0, p1

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x28

    .line 5
    div-int/2addr v0, v2

    const/4 v3, 0x0

    if-lez v0, :cond_0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_0

    .line 6
    sget-object v5, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    mul-int v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    mul-int v6, v2, v4

    invoke-static {p1, v5, v6}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v5

    .line 7
    array-length v6, v5

    .line 8
    const-class v7, Lcom/szabh/smable3/entity/BleAudioPacket;

    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/bestmafen/baseble/data/BleReadable;

    .line 9
    invoke-static {v5, v3, v6}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    .line 10
    invoke-virtual {v8}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    .line 11
    const-string v5, "also(...)"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v0, v3

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v1, Lcom/szabh/smable3/entity/BleAudioPacket;

    .line 14
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v5, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOnDecodeStreamCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "decodeStream packet "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 15
    iget-object v5, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpus:Lcom/smart/opus/SmartOpus;

    if-eqz v5, :cond_3

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAudioPacket;->getMData()[B

    move-result-object v6

    sget-object v0, Lcom/smart/opus/OpusConstants$FrameSize;->Companion:Lcom/smart/opus/OpusConstants$FrameSize$Companion;

    invoke-virtual {v0}, Lcom/smart/opus/OpusConstants$FrameSize$Companion;->_320()Lcom/smart/opus/OpusConstants$FrameSize;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/smart/opus/SmartOpus;->decode$default(Lcom/smart/opus/SmartOpus;[BLcom/smart/opus/OpusConstants$FrameSize;IILjava/lang/Object;)[B

    move-result-object v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_4

    .line 16
    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOnDecodeStreamCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;

    if-eqz v1, :cond_4

    invoke-interface {v1, v0}, Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;->onDecodeStream([B)V

    :cond_4
    move v0, v2

    goto :goto_1

    :cond_5
    return-void
.end method

.method private static final writeAudioStream$lambda$0(Lcom/sma/smartv3/biz/voice/OpusManager;[B)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeStream([B)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "inFilePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outFilePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOnStateCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;

    sget-object p3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p3}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JL707"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JL707Lite"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object p2

    const-string p3, "SIFLI"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance v5, Lcom/android/mltcode/paycertificationapi/mi1;

    invoke-direct {v5, p1, p0}, Lcom/android/mltcode/paycertificationapi/mi1;-><init>(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager;)V

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void

    :cond_1
    :goto_0
    sget-object p3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> jl decodeFile"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;

    if-eqz p3, :cond_2

    new-instance v0, Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;-><init>(Lcom/sma/smartv3/biz/voice/OpusManager;)V

    invoke-virtual {p3, p1, p2, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    :cond_2
    return-void
.end method

.method public final decodeStream(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "opus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pcmPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v0, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    .line 18
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2BytesByStream(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "readFile2BytesByStream(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    array-length v0, p1

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x28

    .line 21
    div-int/2addr v0, v2

    const/4 v3, 0x0

    if-lez v0, :cond_0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_0

    .line 22
    sget-object v5, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    mul-int v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    mul-int v6, v2, v4

    invoke-static {p1, v5, v6}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v5

    .line 23
    array-length v6, v5

    .line 24
    const-class v7, Lcom/szabh/smable3/entity/BleAudioPacket;

    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/bestmafen/baseble/data/BleReadable;

    .line 25
    invoke-static {v5, v3, v6}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    .line 26
    invoke-virtual {v8}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    .line 27
    const-string v5, "also(...)"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v0, v3

    move v2, v0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v0, Lcom/szabh/smable3/entity/BleAudioPacket;

    .line 30
    iget-object v5, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpus:Lcom/smart/opus/SmartOpus;

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAudioPacket;->getMData()[B

    move-result-object v6

    sget-object v0, Lcom/smart/opus/OpusConstants$FrameSize;->Companion:Lcom/smart/opus/OpusConstants$FrameSize$Companion;

    invoke-virtual {v0}, Lcom/smart/opus/OpusConstants$FrameSize$Companion;->_320()Lcom/smart/opus/OpusConstants$FrameSize;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/smart/opus/SmartOpus;->decode$default(Lcom/smart/opus/SmartOpus;[BLcom/smart/opus/OpusConstants$FrameSize;IILjava/lang/Object;)[B

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const/4 v5, 0x1

    if-eqz v0, :cond_3

    .line 31
    invoke-static {p2, v0, v5}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/lang/String;[BZ)Z

    .line 32
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v5

    if-ne v0, v2, :cond_4

    move v0, v5

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_3
    move v2, v4

    goto :goto_1

    .line 33
    :cond_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final release()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->release()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpus:Lcom/smart/opus/SmartOpus;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/smart/opus/SmartOpus;->decoderRelease()V

    :cond_1
    return-void
.end method

.method public final startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOnDecodeStreamCallback:Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JL707"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object p1

    const-string v0, "JL707Lite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/sma/smartv3/biz/voice/OpusManager$startDecodeStream$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/biz/voice/OpusManager$startDecodeStream$1;-><init>(Lcom/sma/smartv3/biz/voice/OpusManager;)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->startDecodeStream(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    :cond_1
    return-void
.end method

.method public final stopDecodeStream()V
    .locals 3

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JL707"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JL707Lite"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopEncodeStream()V

    :cond_1
    return-void
.end method

.method public final writeAudioStream([B)V
    .locals 9
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JL707"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JL707Lite"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SIFLI"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v6, Lcom/android/mltcode/paycertificationapi/pi1;

    invoke-direct {v6, p0, p1}, Lcom/android/mltcode/paycertificationapi/pi1;-><init>(Lcom/sma/smartv3/biz/voice/OpusManager;[B)V

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void

    :cond_1
    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> jl decodeStream"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager;->mOpusManager:Lcom/jieli/jl_audio_decode/opus/OpusManager;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->writeAudioStream([B)V

    :cond_2
    return-void
.end method
