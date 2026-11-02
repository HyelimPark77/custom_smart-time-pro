.class public final Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAITranslationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITranslationManager.kt\ncom/sma/smartv3/biz/voice/v2/AITranslationManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAITranslationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITranslationManager.kt\ncom/sma/smartv3/biz/voice/v2/AITranslationManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "AIManager AITranslationManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mApp:Landroid/app/Application;

.field private static mLanguage:I

.field private static mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mToLanguage:I

.field private static mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    const/4 v0, -0x1

    sput v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    sput v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->textTranslation$lambda$0(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$translateITS(Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    return-void
.end method

.method private final getTranslationLanguageType(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 7

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMLanguage()I

    move-result v0

    sput v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMToLanguage()I

    move-result p1

    sput p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    const-string v0, "mApp"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->IXI(Landroid/content/Context;)Z

    move-result p1

    const-string v2, "en"

    const-string v3, "zh"

    if-eqz p1, :cond_1

    move-object p1, v3

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    sget-object v4, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    if-nez v4, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->IXI(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, v2

    goto :goto_1

    :cond_3
    move-object v0, v3

    :goto_1
    sget-object v4, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v5

    if-eqz v5, :cond_4

    sget-object p1, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    invoke-virtual {p1, v0, v3}, Lcom/szabh/smable3/entity/Languages;->formatMicrosoftTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    invoke-virtual {p1, v3, v2}, Lcom/szabh/smable3/entity/Languages;->formatMicrosoftTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object p1, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    invoke-virtual {p1, v0, v3}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    invoke-virtual {p1, v3, v2}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    :goto_3
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_7
    move-object v3, v1

    :goto_4
    check-cast v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    sput-object v3, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v1, v2

    :cond_9
    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public static synthetic textTranslation$default(Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->textTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method

.method private static final textTranslation$lambda$0(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResultOutput(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onComplete(Ljava/lang/String;)V

    sget-object p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->getToLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p0

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XXIIO1i11(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager AITranslationManager  translateITS leftLang = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , rightLang = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    new-instance v1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;

    invoke-direct {v1, p4, p3}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;-><init>(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static synthetic translateITS$default(Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, "cn"

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const-string p3, "en"

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    return-void
.end method


# virtual methods
.method public final getLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    const-string v1, "mApp"

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v3

    const-string v4, "cn"

    const-string v5, "zh"

    if-eqz v3, :cond_3

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_2
    const-string v0, "zh-Hans"

    goto :goto_0

    :cond_3
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v0, v4

    :cond_4
    :goto_0
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_1

    :cond_6
    move-object v4, v2

    :goto_1
    check-cast v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-nez v4, :cond_9

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v2, v0

    :goto_2
    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->IXI(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    :goto_3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    return-object v0

    :cond_8
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    goto :goto_3

    :cond_9
    return-object v4
.end method

.method public final getMLanguage()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    return v0
.end method

.method public final getMLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-object v0
.end method

.method public final getMToLanguage()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    return v0
.end method

.method public final getMToLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-object v0
.end method

.method public final getToLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    const-string v1, "mApp"

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_3
    move-object v4, v2

    :goto_0
    check-cast v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-nez v4, :cond_6

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v0

    :goto_1
    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->IXI(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    :goto_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    return-object v0

    :cond_5
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    goto :goto_2

    :cond_6
    return-object v4
.end method

.method public final init(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mApp:Landroid/app/Application;

    return-void
.end method

.method public final setMLanguage(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    return-void
.end method

.method public final setMLanguageTranslationData(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setMToLanguage(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    return-void
.end method

.method public final setMToLanguageTranslationData(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setTranslationLanguage(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->getTranslationLanguageType(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void
.end method

.method public final setTranslationLanguageData(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "leftTranslation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightTranslation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    sput-object p2, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final textTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAICallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    const-string v3, "en"

    if-eqz v1, :cond_0

    sget-object p3, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    invoke-virtual {p3, v0, v3}, Lcom/szabh/smable3/entity/Languages;->formatMicrosoftTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IXI()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iIXX0i;

    invoke-direct {v1, p2}, Lcom/android/mltcode/paycertificationapi/iIXX0i;-><init>(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    invoke-virtual {v0, p1, p3, v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-nez v0, :cond_2

    if-ne p3, v2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    sget-object p3, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mLanguage:I

    const-string v1, "zh"

    invoke-virtual {p3, v0, v1}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->mToLanguage:I

    invoke-virtual {p3, v1, v3}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "cn"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    new-instance v3, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;

    invoke-direct {v3, p3, p2}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;-><init>(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    invoke-virtual {v2, p1, v0, v1, v3}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_3
    invoke-direct {p0, p1, v0, p3, p2}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    return-void
.end method
