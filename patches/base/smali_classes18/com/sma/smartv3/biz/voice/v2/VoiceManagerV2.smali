.class public final Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVoiceManagerV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,797:1\n39#2,3:798\n42#2:804\n44#2,2:806\n31#2,2:808\n1563#3:801\n1634#3,2:802\n1636#3:805\n1869#3,2:810\n*S KotlinDebug\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n*L\n261#1:798,3\n261#1:804\n261#1:806,2\n267#1:808,2\n261#1:801\n261#1:802,2\n261#1:805\n748#1:810,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVoiceManagerV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,797:1\n39#2,3:798\n42#2:804\n44#2,2:806\n31#2,2:808\n1563#3:801\n1634#3,2:802\n1636#3:805\n1869#3,2:810\n*S KotlinDebug\n*F\n+ 1 VoiceManagerV2.kt\ncom/sma/smartv3/biz/voice/v2/VoiceManagerV2\n*L\n261#1:798,3\n261#1:804\n261#1:806,2\n267#1:808,2\n261#1:801\n261#1:802,2\n261#1:805\n748#1:810,2\n*E\n"
    }
.end annotation


# static fields
.field private static final FIRST_IDENTIFY_TIME:J

.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "AIManagerV2 VoiceManagerV2"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final identificationCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static isAloneCallback:Z

.field private static isSpeechRecRunning:Z

.field private static mAIMode:I

.field private static final mAIModelCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mApp:Landroid/app/Application;

.field private static final mBleHandleCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mOpusFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mSavePcmTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mVoiceHandleCallbacks$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mVoiceMode:I

.field private static microsoftTime:J

.field private static final recordCallBack:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mSavePcmTime:Ljava/lang/String;

    const-wide/16 v0, 0x7d0

    sput-wide v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->FIRST_IDENTIFY_TIME:J

    sput-wide v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->microsoftTime:J

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/record.opus"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusFile:Ljava/io/File;

    const/4 v0, -0x1

    sput v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIMode:I

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mBleHandleCallback$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mBleHandleCallback$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mBleHandleCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mBleHandleCallback$1;

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->identificationCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIModelCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->recordCallBack:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hj6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/hj6;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceHandleCallbacks$delegate:Lkotlin/Lazy;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAllNotifyVoiceHandlers$lambda$0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAloneNotifyVoiceHandlers$lambda$0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$changeOpusManager(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->changeOpusManager()V

    return-void
.end method

.method public static final synthetic access$deleteFiles(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->deleteFiles()V

    return-void
.end method

.method public static final synthetic access$getIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->identificationCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;

    return-object v0
.end method

.method public static final synthetic access$getMAIMode$p()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIMode:I

    return v0
.end method

.method public static final synthetic access$getMOpusFile$p()Ljava/io/File;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusFile:Ljava/io/File;

    return-object v0
.end method

.method public static final synthetic access$getMOpusManager$p()Lcom/sma/smartv3/biz/voice/OpusManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    return-object v0
.end method

.method public static final synthetic access$getMVoiceMode$p()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    return v0
.end method

.method public static final synthetic access$getRecordCallBack$p()Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->recordCallBack:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;

    return-object v0
.end method

.method public static final synthetic access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->notifyCallback(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$onAIModelIdentificationError(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAIModelIdentificationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setMAIMode$p(I)V
    .locals 0

    sput p0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIMode:I

    return-void
.end method

.method public static final synthetic access$setMVoiceMode$p(I)V
    .locals 0

    sput p0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    return-void
.end method

.method private final addHandleCallback()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mBleHandleCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method private final changeOpusManager()V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->release()V

    :cond_1
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    new-instance v0, Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 -> opus init error\uff01\uff01\uff01"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final deleteFiles()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->deleteFile()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy_MM_dd_HH_mm_ss"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mSavePcmTime:Ljava/lang/String;

    return-void
.end method

.method private final getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceHandleCallbacks$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public static synthetic iO()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceHandleCallbacks_delegate$lambda$0()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method private static final mVoiceHandleCallbacks_delegate$lambda$0()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    return-object v0
.end method

.method private final notifyCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isAloneCallback:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAloneNotifyVoiceHandlers(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAllNotifyVoiceHandlers(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final onAIModelIdentificationError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string p2, "_list"

    const-class v0, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const v1, 0x7f1414af

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSupportDevicePhoneVoiceAIChat()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v3, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v2

    :cond_0
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMStatus()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMStatus(I)V

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMContent(Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p2, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "SEND_VOICE"

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static synthetic onAIModelIdentificationError$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAIModelIdentificationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic onAIResultConsumption$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, -0x1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAIResultConsumption(Ljava/lang/String;I)V

    return-void
.end method

.method private final onAllNotifyVoiceHandlers(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/fj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final onAllNotifyVoiceHandlers$lambda$0(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final onAloneNotifyVoiceHandlers(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/gj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final onAloneNotifyVoiceHandlers$lambda$0(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "last(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final removeHandleCallback()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mBleHandleCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method private final senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static synthetic sendError$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p1

    const p2, 0x7f141196

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic sendTranslationResult$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final sendTranslationResultInput(Ljava/lang/String;)V
    .locals 10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget v3, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method private final startPhoneRecordingIdentification(I)V
    .locals 8

    sput p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    sget-object v2, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->identificationCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;

    sget-object v5, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->recordCallBack:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, -0x1

    invoke-static/range {v0 .. v7}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->identificationBegins$default(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;ZLcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;ZILcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final addVoiceHandleCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mVoiceHandleCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isVoiceHandlerCallbackExist(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final destroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->stop()V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->removeHandleCallback()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->release()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    return-void
.end method

.method public final getAIModelCallback()Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIModelCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;

    return-object v0
.end method

.method public final getMSavePcmTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mSavePcmTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getVoiceMode()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    return v0
.end method

.method public final init(Landroid/app/Application;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mApp:Landroid/app/Application;

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mApp:Landroid/app/Application;

    if-nez v1, :cond_0

    const-string v1, "mApp"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->init(Landroid/app/Application;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->addHandleCallback()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-nez v0, :cond_1

    :try_start_0
    new-instance v0, Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 -> opus init error\uff01\uff01\uff01"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->init(Landroid/app/Application;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->registerSCOReceiver(Landroid/app/Application;)V

    const-string v0, "sma-speech-key"

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XiOIii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_2

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iI0I(Ljava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iX0iiiXi()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->init(Landroid/app/Application;Z)V

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->removeVoiceHandleCallbackAll()V

    new-instance p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$init$1;

    invoke-direct {p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$init$1;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->addVoiceHandleCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V

    return-void
.end method

.method public final initMicrosoftSDKManage()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OX110i()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mApp:Landroid/app/Application;

    if-nez v2, :cond_0

    const-string v2, "mApp"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iiIOiX(Landroid/app/Application;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->getMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    move-result-object v1

    const-string v2, "AIManagerV2 VoiceManagerV2"

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIi1(Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;)V

    sget-wide v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->FIRST_IDENTIFY_TIME:J

    sput-wide v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->microsoftTime:J

    return-void
.end method

.method public final isConductEarPhone()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isSpeechRecRunning()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSpeechRecRunning:Z

    return v0
.end method

.method public final isSupportAIWatchface()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiXXXi10()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportDevicePhoneVoiceAIChat()Z
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isTranslation()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isVoiceAIIdentify()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVoiceAiChatContext()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Xi1XO00()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVoiceHandlerCallbackExist(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Z
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mVoiceHandleCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final onAIResultConsumption(Ljava/lang/String;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    sput p2, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    :cond_0
    sget-object p2, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIModelCallback:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;

    sget v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mAIMode:I

    invoke-virtual {p2, p1, v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAIFunction(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void

    :cond_1
    const p1, 0x7f141286

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onStopVoice(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "STOP_VOICE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManagerV2 VoiceManagerV2 onStopVoice"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->stop()V

    return-void
.end method

.method public final removeVoiceHandleCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mVoiceHandleCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isVoiceHandlerCallbackExist(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final removeVoiceHandleCallbackAll()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMVoiceHandleCallbacks()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final sendError(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSpeechRecRunning:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget v4, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v8, p1

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method public final sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResultInput(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResultOutput(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final sendTranslationResultOutput(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "outputText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    sget v4, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mVoiceMode:I

    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method public final setAloneCallBack(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isAloneCallback:Z

    return-void
.end method

.method public final setMSavePcmTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->mSavePcmTime:Ljava/lang/String;

    return-void
.end method

.method public final setSpeechRecRunning(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSpeechRecRunning:Z

    return-void
.end method

.method public final stop()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iX01()V

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOI()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OII()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 -> AndroidNetworking.cancelAll stop "

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/androidnetworking/AndroidNetworking;->cancelAll()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoicePlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->stop()V

    return-void
.end method
