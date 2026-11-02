.class public Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n90#2:776\n90#2:777\n85#2,3:816\n85#2,3:819\n85#2,3:822\n85#2,3:825\n173#3,7:778\n180#3,3:786\n143#3,7:789\n183#3:796\n173#3,7:797\n180#3,3:805\n143#3,7:808\n183#3:815\n1#4:785\n1#4:804\n1#4:828\n*S KotlinDebug\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n*L\n184#1:776\n186#1:777\n359#1:816,3\n373#1:819,3\n407#1:822,3\n408#1:825,3\n340#1:778,7\n340#1:786,3\n340#1:789,7\n340#1:796\n345#1:797,7\n345#1:805,3\n345#1:808,7\n345#1:815\n340#1:785\n345#1:804\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n90#2:776\n90#2:777\n85#2,3:816\n85#2,3:819\n85#2,3:822\n85#2,3:825\n173#3,7:778\n180#3,3:786\n143#3,7:789\n183#3:796\n173#3,7:797\n180#3,3:805\n143#3,7:808\n183#3:815\n1#4:785\n1#4:804\n1#4:828\n*S KotlinDebug\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n*L\n184#1:776\n186#1:777\n359#1:816,3\n373#1:819,3\n407#1:822,3\n408#1:825,3\n340#1:778,7\n340#1:786,3\n340#1:789,7\n340#1:796\n345#1:797,7\n345#1:805,3\n345#1:808,7\n345#1:815\n340#1:785\n345#1:804\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
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

.field private final countdownRunnable:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private delayTime:J

.field private elapsedTime:J

.field private isAddListData:Z

.field private isAppSend:Z

.field private isEndTranslation:Z

.field private isStartAnalysis:Z

.field private isSteam:Z

.field private isSupportTransfer:Z

.field private lang:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final loadTimeOut:I

.field private final loadTimeOutToast:I

.field private mAIFunctionType:I

.field private mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mAIRecordsType:I

.field private mCacheLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mContentResult:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;
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

.field private final mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRecyclerViewAutoRefresh:Z

.field public mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

.field private final mTransformLanguageImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTransformLanguageLeftTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTransformLanguageRightTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final runnable:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private startTime:J

.field private switchRotateAnimation:Z

.field private targetLang:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private ttsTargetLang:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private ttsVoiceName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final updateInterval:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "BaseTranslationActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX0i1ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX0i1ii;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIX1XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIX1XI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1II011X0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1II011X0;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageLeftTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiX011;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiX011;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0XI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageRightTv$delegate:Lkotlin/Lazy;

    const/16 v0, 0xff

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOut:I

    const/16 v0, 0xfe

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOutToast:I

    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->delayTime:J

    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->updateInterval:J

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->runnable:Ljava/lang/Runnable;

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->countdownRunnable:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOOO00I;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XOOO00I;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecyclerViewAutoRefresh:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    sget-object v0, Lcom/sma/smartv3/model/AIFunctionType;->AI_TRANSLATION:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIFunctionType:I

    const-string v0, "cn"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    const-string v0, "en"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsTargetLang:Ljava/lang/String;

    const-string v0, "x4_enus_catherine_profnews"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    const-string v0, "zh_cn"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    const-string v0, "mandarin"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsAccent:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mContentResult:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->initView$lambda$1$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static synthetic I1XOi1(Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRotateAnimation$lambda$0(Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageRightTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslationResultInput$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Landroid/os/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->initView$lambda$1$1(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->permission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageImg_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;III)Z

    move-result p0

    return p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->delayTime:J

    return-wide v0
.end method

.method public static final synthetic access$getLoadTimeOut$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOut:I

    return p0
.end method

.method public static final synthetic access$getLoadTimeOutToast$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOutToast:I

    return p0
.end method

.method public static final synthetic access$getPopCountdownPopup$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Lcom/android/mltcode/paycertificationapi/O110O1III;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyView()V

    return-void
.end method

.method public static final synthetic access$sendTranslationResultInput(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->delayTime:J

    return-void
.end method

.method public static final synthetic access$translateITS(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageLeftTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final initLanguage()V
    .locals 7

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMLanguageTranslationList(Ljava/util/List;)V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLanguageTranslationList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    :cond_0
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLanguageTranslationList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    :cond_1
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

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

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRotateAnimation()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;III)Z
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " mode:"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, p1

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",type:"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",earDirection:"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v3, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->deviceSuspend()V

    goto/16 :goto_0

    :cond_1
    iput-boolean v5, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation:Z

    const/4 v1, 0x0

    invoke-static {v0, v4, v5, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->stopRecording$default(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ZILjava/lang/Object;)V

    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget v2, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOut:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget v2, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOutToast:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    iput-boolean v4, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Xi()V

    :cond_2
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    if-nez v1, :cond_8

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1O011;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I1O011;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :cond_3
    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    goto :goto_0

    :cond_4
    iput-boolean v4, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation:Z

    if-ne v2, v5, :cond_5

    iget-boolean v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isAppSend:Z

    if-nez v1, :cond_5

    move v3, v5

    :cond_5
    iput v3, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    iput-boolean v5, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/fq1;->OIi0()V

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRecording()V

    :cond_6
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRecordBluetooth()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRecording()V

    goto :goto_0

    :cond_7
    new-instance v6, Lcom/sma/smartv3/db/entity/AIRecords;

    iget v11, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIFunctionType:I

    iget v12, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    const v25, 0xffc7

    const/16 v26, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-string v13, ""

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v24, v1

    invoke-direct/range {v6 .. v26}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1XO0OXX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1XO0OXX;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_8
    :goto_0
    return v5
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->showRecordingPopup()V

    return-void
.end method

.method private static final initView$lambda$1$1(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->disRecordingPopup()V

    return-void
.end method

.method private static final mHandler$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Landroid/os/Message;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->what:I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOut:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->stopRecording(Z)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOutToast:I

    if-ne p1, v0, :cond_1

    const p1, 0x7f141015

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return v1
.end method

.method private static final mTransformLanguageImg_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bdd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mTransformLanguageLeftTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a030d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTransformLanguageRightTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a030e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final notifyView()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO01I1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO01I1i;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final notifyView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyViewData()V

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

.method private final senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method private static final sendTranslate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    const-string v1, "cn"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    new-instance v2, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$sendTranslate$1$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$sendTranslate$1$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    invoke-virtual {v0, p1, p0, v1, v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    goto :goto_0

    :cond_0
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->translateITS$default(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendTranslationResultInput(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOut:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOutToast:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecyclerViewAutoRefresh:Z

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const v0, 0x7f141196

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OI1i01i01;

    invoke-direct {v2, p0, p1}, Lcom/android/mltcode/paycertificationapi/OI1i01i01;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz p1, :cond_1

    const v0, 0x7f141173

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz p1, :cond_2

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    return-void
.end method

.method private static final sendTranslationResultInput$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz p1, :cond_3

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object p2

    :cond_2
    invoke-virtual {p1, p2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    :cond_3
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getTtsVoiceName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT_AND_RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    const/16 v2, 0x8

    goto :goto_0

    :cond_4
    const/4 v2, 0x2

    :goto_0
    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iX1O1(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/LeftAndRightPlayControl;I)V

    const-string p1, ""

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mContentResult:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final startRotateAnimation$lambda$0(Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/animation/Animation;->cancel()V

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    const/4 p0, 0x1

    iput-boolean p0, p1, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    return-void
.end method

.method public static synthetic stopRecording$default(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->stopRecording(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: stopRecording"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static synthetic translateITS$default(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: translateITS"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public addList()V
    .locals 0

    return-void
.end method

.method public final addSendRecord(Lcom/sma/smartv3/db/entity/AIRecords;)J
    .locals 2
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mAIRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->insert(Lcom/sma/smartv3/db/entity/AIRecords;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final closeBluetooth()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    return-void
.end method

.method public countdownEnd()V
    .locals 0

    return-void
.end method

.method public deviceSuspend()V
    .locals 0

    return-void
.end method

.method public disRecordingPopup()V
    .locals 0

    return-void
.end method

.method public final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getArsAccent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsAccent:Ljava/lang/String;

    return-object v0
.end method

.method public final getArsLanguage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    return-object v0
.end method

.method public final getElapsedTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->elapsedTime:J

    return-wide v0
.end method

.method public final getLang()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    return-object v0
.end method

.method public final getMAIFunctionType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIFunctionType:I

    return v0
.end method

.method public final getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public final getMAIRecordsType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    return v0
.end method

.method public final getMCacheLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mCacheLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-object v0
.end method

.method public final getMContentResult()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mContentResult:Ljava/lang/String;

    return-object v0
.end method

.method public final getMHandler()Landroid/os/Handler;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

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

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mLanguageTranslationList:Ljava/util/List;

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

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLeftLanguage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    return-object v0
.end method

.method public final getMRecyclerViewAutoRefresh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecyclerViewAutoRefresh:Z

    return v0
.end method

.method public final getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRightLanguage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMTransformLanguageImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMTransformLanguageLeftTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageLeftTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMTransformLanguageRightTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mTransformLanguageRightTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-object v0
.end method

.method public final getRecordingCallBack()Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    return-object v0
.end method

.method public final getRunnable()Ljava/lang/Runnable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->runnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method public final getStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startTime:J

    return-wide v0
.end method

.method public final getSwitchRotateAnimation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    return v0
.end method

.method public final getTargetLang()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    return-object v0
.end method

.method public final getTtsTargetLang()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsTargetLang:Ljava/lang/String;

    return-object v0
.end method

.method public final getTtsVoiceName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdateInterval()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->updateInterval:J

    return-wide v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->initLanguage()V

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIiXXXiOI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XIiXXXiOI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i100IXOX(Lcom/sma/smartv3/util/MicrosoftSDKManage;Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    :cond_1
    :goto_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0OO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X0OO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMListener(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public final isAddListData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isAddListData:Z

    return v0
.end method

.method public final isAppSend()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isAppSend:Z

    return v0
.end method

.method public final isEndTranslation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation:Z

    return v0
.end method

.method public final isStartAnalysis()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    return v0
.end method

.method public final isSteam()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isSteam:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0026

    return v0
.end method

.method public notifyViewData()V
    .locals 0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_6

    const/4 p2, 0x2

    const-string v0, "LANGUAGE_CHANGE"

    const-class v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const/16 v2, 0x5f

    const/4 v3, 0x0

    const-string v4, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData"

    const-string v5, "language"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p1, :cond_3

    if-eq p1, v6, :cond_0

    goto/16 :goto_2

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v7

    :goto_0
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v1, p3, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0, v7, p2, v7}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_2
    iput-boolean v6, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRotateAnimation()V

    return-void

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v7

    :goto_1
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v1, p3, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0, v7, p2, v7}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_5
    iput-boolean v6, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRotateAnimation()V

    :cond_6
    :goto_2
    return-void
.end method

.method public onDestroy()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->closeBluetooth()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMListener(Lkotlin/jvm/functions/Function3;)V

    sget-object v2, Lcom/sma/smartv3/model/ViewModelMain;->INSTANCE:Lcom/sma/smartv3/model/ViewModelMain;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ViewModelMain;->isShowSuspenWindow()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ViewModelMain;->isReSetList()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMicrosoftCallback()V

    invoke-virtual {v0, v5}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    invoke-static {p0, v5, v6, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->stopRecording$default(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ZILjava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iX01()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XOIO11O()V

    :cond_2
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onTranslationLanguage(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const-class v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    const-string v1, "mArg3"

    const-string v2, "mArg2"

    const-string v3, "mArg0"

    const/4 v4, 0x0

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v2, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v5, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :pswitch_1
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v2, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v5, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x7f0a030d
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public permission()V
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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OOII0iI00;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/OOII0iI00;-><init>()V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final removeCountdownPopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->countdownRunnable:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public saveDBRecord()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    const-string v1, "null"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v2

    :cond_3
    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

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

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

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

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/O11OO1;

    invoke-direct {v6, p0, p1}, Lcom/android/mltcode/paycertificationapi/O11OO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v0, 0x7f1404a3

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AI "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyView()V

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

    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

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

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    new-instance v2, Lcom/szabh/smable3/entity/BleVoice;

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

    invoke-direct/range {v2 .. v11}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method public final setAddListData(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isAddListData:Z

    return-void
.end method

.method public final setAppSend(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isAppSend:Z

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsAccent:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    return-void
.end method

.method public final setElapsedTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->elapsedTime:J

    return-void
.end method

.method public final setEndTranslation(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation:Z

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    return-void
.end method

.method public final setLangAndVoice()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->isSupportTransfer()Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isSupportTransfer:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAccent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsAccent:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsTargetLang:Ljava/lang/String;

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->lang:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->isSupportTransfer()Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isSupportTransfer:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAccent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsAccent:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsTargetLang:Ljava/lang/String;

    return-void
.end method

.method public final setMAIFunctionType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIFunctionType:I

    return-void
.end method

.method public final setMAIRecords(Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public final setMAIRecordsType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    return-void
.end method

.method public final setMCacheLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mCacheLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mContentResult:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mLanguageTranslationList:Ljava/util/List;

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setMRecyclerViewAutoRefresh(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRecyclerViewAutoRefresh:Z

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setStartAnalysis(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    return-void
.end method

.method public final setStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startTime:J

    return-void
.end method

.method public final setSteam(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isSteam:Z

    return-void
.end method

.method public final setSwitchRotateAnimation(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->targetLang:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsTargetLang:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    return-void
.end method

.method public final showCountdownPopup(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->delayTime:J

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O110O1III;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O110O1III;-><init>(Landroid/app/Activity;)V

    iget-wide v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->delayTime:J

    const/16 v3, 0x3e8

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIii1(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->popCountdownPopup:Lcom/android/mltcode/paycertificationapi/O110O1III;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIO(Landroid/view/View;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->countdownRunnable:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;

    iget-wide v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->updateInterval:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public showRecordingPopup()V
    .locals 0

    return-void
.end method

.method public startRecording()V
    .locals 22

    move-object/from16 v0, p0

    new-instance v1, Lcom/sma/smartv3/db/entity/AIRecords;

    iget v6, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIFunctionType:I

    iget v7, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecordsType:I

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    const v20, 0xffc7

    const/16 v21, 0x0

    move-object/from16 v19, v2

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v21}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    if-nez v1, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation:Z

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isStartAnalysis:Z

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->arsLanguage:Ljava/lang/String;

    iget-object v5, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsVoiceName:Ljava/lang/String;

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->ttsTargetLang:Ljava/lang/String;

    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIX0i(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->TAG:Ljava/lang/String;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public startRotateAnimation()V
    .locals 11

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v2, Landroid/view/animation/RotateAnimation;

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct/range {v2 .. v8}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v2, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v5, -0x1

    invoke-virtual {v2, v5}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->switchRotateAnimation:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mCacheLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mCacheLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x5f

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v9, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v10, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v7, v6, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "LANGUAGE_CHANGE"

    const/4 v1, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v5, v1, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXX11X1II;

    invoke-direct {v1, v2, p0}, Lcom/android/mltcode/paycertificationapi/XXX11X1II;-><init>(Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
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

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation:Z

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
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOut:I

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->loadTimeOutToast:I

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

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

.method public upDataLastList()V
    .locals 0

    return-void
.end method

.method public updateTimerText()V
    .locals 0

    return-void
.end method
