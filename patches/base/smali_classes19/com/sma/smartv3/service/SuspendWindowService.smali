.class public final Lcom/sma/smartv3/service/SuspendWindowService;
.super Landroidx/lifecycle/LifecycleService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/service/SuspendWindowService$OXO1;,
        Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSuspendWindowService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,1026:1\n90#2:1027\n90#2:1028\n439#3:1029\n*S KotlinDebug\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n*L\n445#1:1027\n449#1:1028\n858#1:1029\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSuspendWindowService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,1026:1\n90#2:1027\n90#2:1028\n439#3:1029\n*S KotlinDebug\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n*L\n445#1:1027\n449#1:1028\n858#1:1029\n*E\n"
    }
.end annotation


# instance fields
.field private final CHANNEL_ID:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final NOTIFICATION_ID:I

.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private arsAccent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private arsLanguage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public bottom_line:Landroid/view/View;

.field private broadcastCheckStatus:Z

.field public broadcast_check:Landroid/widget/CheckBox;

.field public clipboard:Landroid/content/ClipboardManager;

.field public fl_recording:Landroid/widget/FrameLayout;

.field private floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final handle:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public img_close:Landroid/widget/ImageView;

.field public img_record:Landroid/widget/ImageView;

.field public img_record_show:Landroid/widget/ImageView;

.field public img_recording:Landroid/widget/ImageView;

.field public img_recording_animation:Landroid/widget/ImageView;

.field private isAddListData:Z

.field private isEndTranslation:Z

.field private isShow:Z

.field private isShowRecordImg:Z

.field private isStartAnalysis:Z

.field private lang:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public ll_hide_content:Landroid/view/View;

.field public ll_show_set:Landroid/widget/LinearLayout;

.field private mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContentResult:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mExtraInfo:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mLanguageTranslationList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field public mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

.field public mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

.field private final microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private onlyshowTranslate:Z

.field public original_check:Landroid/widget/CheckBox;

.field public recordAnimation:Landroid/graphics/drawable/AnimationDrawable;

.field private final recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public rl_show_all:Landroid/view/View;

.field public root:Landroid/view/View;

.field private showOriginalTextStatus:Z

.field private targetLang:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private translateCheckStatus:Z

.field public translate_check:Landroid/widget/CheckBox;

.field private ttsTargetLang:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private ttsVoiceName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public tv_original_t:Landroid/widget/TextView;

.field public tv_translate:Landroid/widget/TextView;

.field public tv_translate_t:Landroid/widget/TextView;

.field private windowManager:Landroid/view/WindowManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/LifecycleService;-><init>()V

    const-string v0, "SuspendWindowService"

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    const-string v0, "recording_channel"

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->CHANNEL_ID:Ljava/lang/String;

    const/16 v0, 0x65

    iput v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->NOTIFICATION_ID:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContentResult:Ljava/lang/String;

    const-string v1, "cn"

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    const-string v1, "en"

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsTargetLang:Ljava/lang/String;

    const-string v1, "x4_enus_catherine_profnews"

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    const-string v1, "zh_cn"

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    const-string v1, "mandarin"

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsAccent:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/service/SuspendWindowService$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/service/SuspendWindowService$O00;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    new-instance v0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$1(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResultInput$lambda$1(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->permission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendChainAiTranslationResultInput$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$3(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$9(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initObserve$lambda$0$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$2(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$5(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initViedo$lambda$0$0(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/service/SuspendWindowService;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/service/SuspendWindowService;->initViedo$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$10(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslate$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$7(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResultInput$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->initObserve$lambda$0$1(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$4(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIO(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$8(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getOnlyshowTranslate$p(Lcom/sma/smartv3/service/SuspendWindowService;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->onlyshowTranslate:Z

    return p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$sendTranslationResultInput(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$translateITS(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/service/SuspendWindowService;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$voiceChainAi(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->voiceChainAi(Ljava/lang/String;)V

    return-void
.end method

.method private final buildNotification()Landroid/app/Notification;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/main/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->CHANNEL_ID:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v2, 0x7f10003b

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const v2, 0x7f141171

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const v2, 0x7f14116f

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final createNotificationChannel()V
    .locals 4

    new-instance v0, Landroid/app/NotificationChannel;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->CHANNEL_ID:Ljava/lang/String;

    const v2, 0x7f141171

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-class v1, Landroid/app/NotificationManager;

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initViedo$lambda$0$1(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method

.method public static synthetic iO(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initView$lambda$6(Landroid/view/View;)V

    return-void
.end method

.method private final initLanguage()V
    .locals 7

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMLanguageTranslationList(Ljava/util/List;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMLanguageTranslationList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    :cond_0
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/service/SuspendWindowService;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMLanguageTranslationList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    :cond_1
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " initLanguage mLeftLanguage = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , mRightLanguage = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private static final initObserve$lambda$0$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/rg5;->OXO1:Lcom/android/mltcode/paycertificationapi/rg5;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/rg5;->OXO1()Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isShowSuspenWindow: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "  show:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/rg5;->OXO1()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->showWindow()V

    const/4 p0, 0x1

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/rg5;->XIi00iiXO(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/rg5;->XIi00iiXO(Z)V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initObserve$lambda$0$1(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isReSetList: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMicrosoftCallback()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initViedo$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;III)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mode:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ",type:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ",earDirection:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 p3, 0x1

    if-eqz p2, :cond_3

    if-eq p2, p3, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " TRANSFER_STATUS_END"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-boolean p3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation:Z

    const/4 p2, 0x0

    invoke-static {p0, p1, p3, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->stopRecording$default(Lcom/sma/smartv3/service/SuspendWindowService;ZILjava/lang/Object;)V

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isStartAnalysis:Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Xi()V

    :cond_1
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/ih5;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/ih5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :cond_2
    iget-object p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " TRANSFER_STATUS_GO_ON"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p0

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " TRANSFER_STATUS_START"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation:Z

    iput-boolean p3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isStartAnalysis:Z

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fq1;->OIi0()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    iget-object p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {p1, p2, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_original_t()Landroid/widget/TextView;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->startRecording()V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " startRecording1"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->startRecording()V

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/hh5;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/hh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_6
    :goto_0
    return p3
.end method

.method private static final initViedo$lambda$0$0(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup()V

    return-void
.end method

.method private static final initViedo$lambda$0$1(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->disRecordingPopup()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f1404f5

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_original_t()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setLaunguage()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isRecording = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->stopRecording(Z)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup(Z)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setRecordBluetooth(Z)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->clickDownRecording(I)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isRecording = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->stopRecording(Z)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup(Z)V

    return-void
.end method

.method private static final initView$lambda$10(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->showBg(Z)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 1

    iget-object p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    const-string p1, "img_close: "

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-string p1, "WINDOW_FLOAT_STATUS"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string v0, "WINDOW_FLOAT_CHANGE"

    invoke-static {v0, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lcom/sma/smartv3/model/ViewModelMain;->INSTANCE:Lcom/sma/smartv3/model/ViewModelMain;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/ViewModelMain;->isShowSuspenWindow()Landroidx/lifecycle/MutableLiveData;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V
    .locals 2

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "translate_check: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "TRANSLATE_CHECK_STATUS"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iput-boolean p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translateCheckStatus:Z

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string p2, "TRANSLATE_CHECK_CHANGE"

    invoke-static {p2, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final initView$lambda$4(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final initView$lambda$5(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V
    .locals 2

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "broadcast_check: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "BROADCAST_CHECK_STATUS"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iput-boolean p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcastCheckStatus:Z

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string p2, "BROADCAST_CHECK_CHANGE"

    invoke-static {p2, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final initView$lambda$6(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final initView$lambda$7(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/widget/CompoundButton;Z)V
    .locals 2

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "original_check: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SHOW_ORIGINAL_TEXT_STATUS"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iput-boolean p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->showOriginalTextStatus:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRecordText()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getOriginal_check()Landroid/widget/CheckBox;

    move-result-object p1

    iget-boolean p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->showOriginalTextStatus:Z

    if-eqz p2, :cond_0

    const p2, 0x7f141249

    :goto_0
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_0
    const p2, 0x7f14124a

    goto :goto_0

    :goto_1
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final initView$lambda$8(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final initView$lambda$9(Lcom/sma/smartv3/service/SuspendWindowService;Landroid/view/View;)V
    .locals 3

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->showBg(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    new-instance v0, Lcom/sma/smartv3/service/SuspendWindowService$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/service/SuspendWindowService$iO;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final permission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendChainAiTranslationResultInput(Ljava/lang/String;)V
    .locals 7

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translateCheckStatus:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fh5;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/fh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sendChainAiTranslationResultInput str = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " , lang = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , targetLang = "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    const-string v3, "cn"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    new-instance v1, Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    invoke-virtual {v0, p1, v2, v3, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/service/SuspendWindowService;->translateITS$default(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sendChainAiTranslationResultInput$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->onlyshowTranslate:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object v0

    const-string v1, "aura"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    const-string p1, ""

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRecordText()V

    new-instance p1, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    iget-object p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-direct {p1, v0, p0}, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "TRANSLATE_SUCCESS"

    invoke-static {p0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final sendTranslate$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendChainAiTranslationResultInput(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendTranslationResultInput(Ljava/lang/String;)V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translateCheckStatus:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dh5;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/dh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const v1, 0x7f141196

    if-lez v0, :cond_1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAudioStreamInput ===> str = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " , targetLang = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IXI()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/gh5;

    invoke-direct {v2, p0, p1}, Lcom/android/mltcode/paycertificationapi/gh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string p1, ""

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object p1

    const-string v0, "aura"

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-static {v0, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->saveDBRecord()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult()V

    return-void
.end method

.method private static final sendTranslationResultInput$lambda$0(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-string v1, ""

    if-lez v0, :cond_0

    const v0, 0x7f141196

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    :goto_0
    iget-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->onlyshowTranslate:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object p1

    const-string v0, "aura"

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-static {v0, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRecordText()V

    new-instance p1, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    iget-object p0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-direct {p1, v0, p0}, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "TRANSLATE_SUCCESS"

    invoke-static {p0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final sendTranslationResultInput$lambda$1(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sendTranslationResultInput it = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "TRANSLATE_SUCCESS"

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRecordText()V

    iget-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->onlyshowTranslate:Z

    const-string v0, "aura"

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n("

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :goto_0
    invoke-direct {p0, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->voiceMicrosoft(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->saveDBRecord()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic stopRecording$default(Lcom/sma/smartv3/service/SuspendWindowService;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->stopRecording(Z)V

    return-void
.end method

.method private final translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    new-instance v1, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static synthetic translateITS$default(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/service/SuspendWindowService;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final voiceChainAi(Ljava/lang/String;)V
    .locals 10

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcastCheckStatus:Z

    if-eqz v0, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    iget-object v6, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v7, "voiceChainAi"

    move-object v2, p1

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final voiceMicrosoft(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcastCheckStatus:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XXIIO1i11(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bindView()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const v2, 0x7f0a09b0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRoot(Landroid/view/View;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_1

    const v2, 0x7f0a09ac

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRl_show_all(Landroid/view/View;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_2

    const v2, 0x7f0a06f5

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setLl_hide_content(Landroid/view/View;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_3

    const v2, 0x7f0a0468

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setImg_record(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_4

    const v2, 0x7f0a0463

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setImg_close(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_5

    const v2, 0x7f0a0be9

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    goto :goto_5

    :cond_5
    move-object v0, v1

    :goto_5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setTranslate_check(Landroid/widget/CheckBox;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_6

    const v2, 0x7f0a0172

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    goto :goto_6

    :cond_6
    move-object v0, v1

    :goto_6
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setBroadcast_check(Landroid/widget/CheckBox;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_7

    const v2, 0x7f0a08df

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    goto :goto_7

    :cond_7
    move-object v0, v1

    :goto_7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setOriginal_check(Landroid/widget/CheckBox;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_8

    const v2, 0x7f0a0166

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_8

    :cond_8
    move-object v0, v1

    :goto_8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setBottom_line(Landroid/view/View;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_9

    const v2, 0x7f0a18a9

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_9

    :cond_9
    move-object v0, v1

    :goto_9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setTv_translate_t(Landroid/widget/TextView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_a

    const v2, 0x7f0a18a8

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_a

    :cond_a
    move-object v0, v1

    :goto_a
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setTv_translate(Landroid/widget/TextView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_b

    const v2, 0x7f0a0724

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    goto :goto_b

    :cond_b
    move-object v0, v1

    :goto_b
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setLl_show_set(Landroid/widget/LinearLayout;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_c

    const v2, 0x7f0a03e8

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    goto :goto_c

    :cond_c
    move-object v0, v1

    :goto_c
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setFl_recording(Landroid/widget/FrameLayout;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_d

    const v2, 0x7f0a0cde

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_d

    :cond_d
    move-object v0, v1

    :goto_d
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setTv_original_t(Landroid/widget/TextView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_e

    const v2, 0x7f0a046c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_e

    :cond_e
    move-object v0, v1

    :goto_e
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setImg_recording_animation(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_f

    const v2, 0x7f0a046b

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_f

    :cond_f
    move-object v0, v1

    :goto_f
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setImg_recording(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v0, :cond_10

    const v1, 0x7f0a046a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    :cond_10
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/service/SuspendWindowService;->setImg_record_show(Landroid/widget/ImageView;)V

    return-void
.end method

.method public final clickDownRecording(I)V
    .locals 0

    const-string p1, "MICROPHONE"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->startRecording()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->permission()V

    return-void
.end method

.method public final disRecordingPopup()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup(Z)V

    return-void
.end method

.method public final getArsAccent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsAccent:Ljava/lang/String;

    return-object v0
.end method

.method public final getArsLanguage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    return-object v0
.end method

.method public final getBottom_line()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->bottom_line:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "bottom_line"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBroadcast_check()Landroid/widget/CheckBox;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcast_check:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "broadcast_check"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getClipboard()Landroid/content/ClipboardManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->clipboard:Landroid/content/ClipboardManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "clipboard"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFl_recording()Landroid/widget/FrameLayout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->fl_recording:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fl_recording"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getImg_close()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_close:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "img_close"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getImg_record()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_record:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "img_record"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getImg_record_show()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_record_show:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "img_record_show"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getImg_recording()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_recording:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "img_recording"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getImg_recording_animation()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_recording_animation:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "img_recording_animation"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLang()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    return-object v0
.end method

.method public final getLl_hide_content()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ll_hide_content:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ll_hide_content"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLl_show_set()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ll_show_set:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ll_show_set"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMContentResult()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContentResult:Ljava/lang/String;

    return-object v0
.end method

.method public final getMExtraInfo()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLanguageTranslationList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mLanguageTranslationList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLanguageTranslationList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLeftLanguage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRightLanguage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-object v0
.end method

.method public final getOriginal_check()Landroid/widget/CheckBox;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->original_check:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "original_check"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRecordAnimation()Landroid/graphics/drawable/AnimationDrawable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->recordAnimation:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "recordAnimation"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRecordingCallBack()Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    return-object v0
.end method

.method public final getRl_show_all()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->rl_show_all:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rl_show_all"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRoot()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->root:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "root"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTargetLang()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    return-object v0
.end method

.method public final getTranslate_check()Landroid/widget/CheckBox;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translate_check:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "translate_check"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTtsTargetLang()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsTargetLang:Ljava/lang/String;

    return-object v0
.end method

.method public final getTtsVoiceName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTv_original_t()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->tv_original_t:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tv_original_t"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTv_translate()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->tv_translate:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tv_translate"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTv_translate_t()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->tv_translate_t:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tv_translate_t"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final initObserve()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/model/ViewModelMain;->INSTANCE:Lcom/sma/smartv3/model/ViewModelMain;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ViewModelMain;->isShowSuspenWindow()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/lh5;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/lh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    new-instance v3, Lcom/sma/smartv3/service/SuspendWindowService$XOO0ii0;

    invoke-direct {v3, v2}, Lcom/sma/smartv3/service/SuspendWindowService$XOO0ii0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ViewModelMain;->isReSetList()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mh5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    new-instance v2, Lcom/sma/smartv3/service/SuspendWindowService$XOO0ii0;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/service/SuspendWindowService$XOO0ii0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final initViedo()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IX1XiI()V

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    iget-object v3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIi1(Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " initViedo"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    :cond_1
    :goto_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/eh5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/eh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMListener(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public final initView()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TRANSLATE_CHECK_STATUS"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translateCheckStatus:Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "BROADCAST_CHECK_STATUS"

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcastCheckStatus:Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "SHOW_ORIGINAL_TEXT_STATUS"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->showOriginalTextStatus:Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "ONLY_SHOW_TRANSLATION_STATUS"

    invoke-virtual {v0, v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->onlyshowTranslate:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_recording_animation()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRecordAnimation(Landroid/graphics/drawable/AnimationDrawable;)V

    invoke-direct {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initLanguage()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setLaunguage()V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/service/SuspendWindowService;->showBg(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initViedo()V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    new-instance v1, Lcom/sma/smartv3/service/SuspendWindowService$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/service/SuspendWindowService$XO0O10;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isShowRecordImg:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_record()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_record()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_record()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nh5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/nh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_recording()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ug5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ug5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_close()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vg5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/vg5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTranslate_check()Landroid/widget/CheckBox;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translateCheckStatus:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTranslate_check()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wg5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wg5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTranslate_check()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xg5;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/xg5;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getBroadcast_check()Landroid/widget/CheckBox;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcastCheckStatus:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getBroadcast_check()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yg5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yg5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getBroadcast_check()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zg5;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/zg5;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1404f5

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getOriginal_check()Landroid/widget/CheckBox;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->showOriginalTextStatus:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getOriginal_check()Landroid/widget/CheckBox;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->showOriginalTextStatus:Z

    if-eqz v1, :cond_1

    const v1, 0x7f141249

    :goto_1
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_1
    const v1, 0x7f14124a

    goto :goto_1

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getOriginal_check()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ah5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ah5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getOriginal_check()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bh5;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/bh5;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getLl_show_set()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ch5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ch5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_record_show()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tg5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/tg5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setClipboard(Landroid/content/ClipboardManager;)V

    return-void
.end method

.method public final isAddListData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isAddListData:Z

    return v0
.end method

.method public final isEndTranslation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation:Z

    return v0
.end method

.method public final isStartAnalysis()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isStartAnalysis:Z

    return v0
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/LifecycleService;->onCreate()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initObserve()V

    invoke-direct {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->createNotificationChannel()V

    const-string v0, "onCreate: "

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 5

    invoke-super {p0}, Landroidx/lifecycle/LifecycleService;->onDestroy()V

    const-string v0, "onDestroy"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->handle:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v4, p0, Lcom/sma/smartv3/service/SuspendWindowService;->windowManager:Landroid/view/WindowManager;

    if-eqz v4, :cond_0

    invoke-interface {v4, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    iput-boolean v3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isShow:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRecordAnimation()Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    :cond_1
    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMListener(Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMicrosoftCallback()V

    sget-object v4, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    invoke-static {p0, v3, v0, v2}, Lcom/sma/smartv3/service/SuspendWindowService;->stopRecording$default(Lcom/sma/smartv3/service/SuspendWindowService;ZILjava/lang/Object;)V

    return-void
.end method

.method public final onLanguageChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "LANGUAGE_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onLanguageChange event = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initLanguage()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setLaunguage()V

    return-void
.end method

.method public final onOnlyShowTranslation(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ONLY_SHOW_TRANSLATION_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "ONLY_SHOW_TRANSLATION_STATUS"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->onlyshowTranslate:Z

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/lifecycle/LifecycleService;->onStartCommand(Landroid/content/Intent;II)I

    invoke-direct {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->buildNotification()Landroid/app/Notification;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1e

    if-lt p2, p3, :cond_0

    iget p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->NOTIFICATION_ID:I

    const/16 p3, 0x80

    invoke-static {p0, p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/sg5;->OXO1(Lcom/sma/smartv3/service/SuspendWindowService;ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->NOTIFICATION_ID:I

    invoke-virtual {p0, p2, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final permission()V
    .locals 4

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string v1, "permission(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140f4b

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140f4a

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/kh5;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/kh5;-><init>()V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public saveDBRecord()V
    .locals 0

    return-void
.end method

.method public final sendTranslate(Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  sendTranslate  content = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " lang = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", targetLang = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v6, Lcom/android/mltcode/paycertificationapi/jh5;

    invoke-direct {v6, p0, p1}, Lcom/android/mltcode/paycertificationapi/jh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    :cond_1
    return-void
.end method

.method public final sendTranslationResult()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    const-string v1, "null"

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "inputText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    .line 3
    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 5
    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    .line 7
    new-instance v2, Lcom/szabh/smable3/entity/BleVoice;

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 9
    invoke-direct/range {v2 .. v11}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method public final setAddListData(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isAddListData:Z

    return-void
.end method

.method public final setArsAccent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsAccent:Ljava/lang/String;

    return-void
.end method

.method public final setArsLanguage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    return-void
.end method

.method public final setBottom_line(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->bottom_line:Landroid/view/View;

    return-void
.end method

.method public final setBroadcast_check(Landroid/widget/CheckBox;)V
    .locals 1
    .param p1    # Landroid/widget/CheckBox;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->broadcast_check:Landroid/widget/CheckBox;

    return-void
.end method

.method public final setClipboard(Landroid/content/ClipboardManager;)V
    .locals 1
    .param p1    # Landroid/content/ClipboardManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->clipboard:Landroid/content/ClipboardManager;

    return-void
.end method

.method public final setEndTranslation(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation:Z

    return-void
.end method

.method public final setFl_recording(Landroid/widget/FrameLayout;)V
    .locals 1
    .param p1    # Landroid/widget/FrameLayout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->fl_recording:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final setImg_close(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_close:Landroid/widget/ImageView;

    return-void
.end method

.method public final setImg_record(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_record:Landroid/widget/ImageView;

    return-void
.end method

.method public final setImg_record_show(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_record_show:Landroid/widget/ImageView;

    return-void
.end method

.method public final setImg_recording(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_recording:Landroid/widget/ImageView;

    return-void
.end method

.method public final setImg_recording_animation(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->img_recording_animation:Landroid/widget/ImageView;

    return-void
.end method

.method public final setLang(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    return-void
.end method

.method public final setLaunguage()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->lang:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAccent()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsAccent:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsTargetLang:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setLl_hide_content(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ll_hide_content:Landroid/view/View;

    return-void
.end method

.method public final setLl_show_set(Landroid/widget/LinearLayout;)V
    .locals 1
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ll_show_set:Landroid/widget/LinearLayout;

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

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMContentResult(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContentResult:Ljava/lang/String;

    return-void
.end method

.method public final setMExtraInfo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    return-void
.end method

.method public final setMLanguageTranslationList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mLanguageTranslationList:Ljava/util/List;

    return-void
.end method

.method public final setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setMicrosoftCallback()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initViedo()V

    return-void
.end method

.method public final setOriginal_check(Landroid/widget/CheckBox;)V
    .locals 1
    .param p1    # Landroid/widget/CheckBox;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->original_check:Landroid/widget/CheckBox;

    return-void
.end method

.method public final setRecordAnimation(Landroid/graphics/drawable/AnimationDrawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/AnimationDrawable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->recordAnimation:Landroid/graphics/drawable/AnimationDrawable;

    return-void
.end method

.method public final setRecordText()V
    .locals 3

    iget-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->showOriginalTextStatus:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    const v2, 0x7f141196

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setRl_show_all(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->rl_show_all:Landroid/view/View;

    return-void
.end method

.method public final setRoot(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->root:Landroid/view/View;

    return-void
.end method

.method public final setStartAnalysis(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isStartAnalysis:Z

    return-void
.end method

.method public final setTargetLang(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->targetLang:Ljava/lang/String;

    return-void
.end method

.method public final setTranslate_check(Landroid/widget/CheckBox;)V
    .locals 1
    .param p1    # Landroid/widget/CheckBox;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->translate_check:Landroid/widget/CheckBox;

    return-void
.end method

.method public final setTtsTargetLang(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsTargetLang:Ljava/lang/String;

    return-void
.end method

.method public final setTtsVoiceName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    return-void
.end method

.method public final setTv_original_t(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->tv_original_t:Landroid/widget/TextView;

    return-void
.end method

.method public final setTv_translate(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->tv_translate:Landroid/widget/TextView;

    return-void
.end method

.method public final setTv_translate_t(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->tv_translate_t:Landroid/widget/TextView;

    return-void
.end method

.method public final showBg(Z)V
    .locals 3

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string v2, "#B2000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRl_show_all()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getLl_hide_content()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRl_show_all()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getLl_hide_content()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final showRecordingPopup()V
    .locals 1

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup(Z)V

    return-void
.end method

.method public final showRecordingPopup(Z)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_record()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getFl_recording()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRecordAnimation()Landroid/graphics/drawable/AnimationDrawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    return-void

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isShowRecordImg:Z

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getImg_record()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getFl_recording()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_original_t()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    const-string v1, "getText(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 10
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getRecordAnimation()Landroid/graphics/drawable/AnimationDrawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    return-void
.end method

.method public final showWindow()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    const-string v1, "showWindow: "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->windowManager:Landroid/view/WindowManager;

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->windowManager:Landroid/view/WindowManager;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_0
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    const/16 v2, 0x7f6

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    const/4 v2, 0x1

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->format:I

    const/16 v2, 0x28

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/4 v2, -0x1

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v2, -0x2

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    const v2, 0x800033

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 v2, 0x0

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/lit8 v2, v0, 0x2

    div-int/lit8 v2, v2, 0x3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " outMetrics.heightPixels * 2 / 3 = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const v3, 0x7f0d0e61

    invoke-virtual {v0, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    :cond_1
    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.view.FloatFrameLayout"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/sma/smartv3/view/FloatFrameLayout;

    iput-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->bindView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->windowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    if-eqz v2, :cond_2

    new-instance v3, Lcom/sma/smartv3/service/SuspendWindowService$OXO1;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v3, v1, v0}, Lcom/sma/smartv3/service/SuspendWindowService$OXO1;-><init>(Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->windowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->floatRootView:Lcom/sma/smartv3/view/FloatFrameLayout;

    invoke-interface {v0, v2, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    return-void
.end method

.method public startRecording()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isStartAnalysis:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isStartAnalysis:Z

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setRecordBluetooth(Z)V

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->arsLanguage:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsVoiceName:Ljava/lang/String;

    iget-object v5, p0, Lcom/sma/smartv3/service/SuspendWindowService;->ttsTargetLang:Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIX0i(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    iget-object v5, p0, Lcom/sma/smartv3/service/SuspendWindowService;->TAG:Ljava/lang/String;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final stopRecording(Z)V
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation:Z

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Xi()V

    :cond_0
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XOIO11O()V

    return-void

    :cond_1
    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    return-void
.end method
